package Code;

public class Prism extends Figure implements Printable{

    // pola
    double sideOfBase = 0;
    double height = 0;
    int sideAmount = 0;

    // KonsTRAKTOR
    Prism(double a, double H, int i)
    {
     this.sideOfBase = a;
     this.height = H;
     this.sideAmount = i;
    }

    // oblicza pow boczna granistoslupa
    public double calculateLateralSurface()
    {
        double singleWall = this.height * this.sideOfBase;
        return (singleWall * this.sideAmount);
    }

    // oblicza pole graniastoslupa
    public double calculatePrismArea()
    {
        double lateralSurface = this.calculateLateralSurface();

        double result = lateralSurface + 2 * this.calculateArea();

        return result;
    }

    public double calculateVolume()
    {
        //double basePermeter = 2 * this.calculatePermeter();
        //double bottomPermeter = this.sideAmount * this.height;
        double result = this.calculateArea() * this.height;
        return result;
    }

    // liczy pole dla dowolnego wielokata foremnnego
    @Override
    double calculateArea() {
        double ctg = 1.0 / Math.tan(Math.PI/this.sideAmount);
        return (this.sideAmount * Math.pow(this.sideOfBase, 2) * ctg);
    }

    // liczy obwod dla dowolnego wielokata foremnego
    @Override
    double calculatePermeter() {
        return (this.sideAmount * this.sideOfBase);
    }

    @Override
    public void print() {
        System.out.println("Side of base length = " + this.sideOfBase);
        System.out.println("Amount of sides of base = " + this.sideAmount);
        System.out.println("Height = " + this.height);

        System.out.println("Base area = " + this.calculateArea());
        System.out.println("Base permeter = " + this.calculatePermeter());

        System.out.println("Prism area = " + this.calculatePrismArea());
        System.out.println("Prism volume = " + this.calculateVolume());
    }
}

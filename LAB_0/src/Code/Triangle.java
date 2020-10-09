package Code;

import static java.lang.System.exit;

public class Triangle extends Figure implements Printable {

    //pola
    double a = 0;
    double b = 0;
    double c = 0;


    // konsTRAKTOR
    Triangle(double a1, double b1, double c1) {

        if (this.isDigit(a1) || (this.isDigit(b1)) || (this.isDigit(c1)))
        {
            this.a = (double) a1;
            this.b = (double) b1;
            this.c = (double) c1;
        }
        else
        {
            String excStr = "Podano zle dane do konstruktora !!!";
            System.out.println(excStr);
            exit(1);
        }


    }

    // sprawdza czy jest liczba
    public boolean isDigit(Object o)
    {
        if (o instanceof Character)
        {
            return false;
        }
        else if ((o instanceof Double) || (o instanceof Long) || (o instanceof Integer))
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    @Override
    double calculateArea() {

        double result = 0;
        // pole P = sqrt(p(p-a)(p-b)(p-c)) jak ten wzor nie jest poprawny to chociaz bedzie zwracal jakas wartosc :D
        double permeterHalf = this.calculatePermeter()/2;

        result = Math.sqrt(permeterHalf * (permeterHalf - this.a) * (permeterHalf - this.b) * (permeterHalf - this.c));

        return result;
    }

    @Override
    double calculatePermeter() {
        double result = 0;
        result = this.a + this.b + this.c;
        return result;
    }

    @Override
    public void print() {
        System.out.println("Side a = " + this.a);
        System.out.println("Side b = " + this.b);
        System.out.println("Side c = " + this.c);
        System.out.println("Area = " + this.calculateArea());
        System.out.println("Permeter = " + this.calculatePermeter());
    }
}

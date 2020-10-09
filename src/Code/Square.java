package Code;

import static java.lang.System.exit;

public class Square extends Figure implements Printable {

    // pola
     double side;

     // konsTRAKTOR
     Square(double s)
     {
         if (this.isDigit(s))
         {
             this.side = (double) s;
         }
         else
         {
             String excStr = "Podano zle dane do konstruktora !!!";
             System.out.println(excStr);
             exit(1);
         }
     }

    // czy jest liczba
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
        return (this.side * this.side);
    }

    @Override
    double calculatePermeter() {
        return 4 * this.side;
    }

    @Override
    public void print() {
        System.out.println("Side = " + this.side);
        System.out.println("Area = " + this.calculateArea());
        System.out.println("Permeter = " + this.calculatePermeter());
    }
}

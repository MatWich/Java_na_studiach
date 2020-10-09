package Code;

import java.awt.geom.Area;

import static java.lang.System.exit;

public class Circle extends Figure implements Printable {

    //pola
    double radius = 0;

    //konsTRAKTOR
    Circle(double r) {
        if (this.isDigit(r))
        this.radius = r;
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
        return Math.PI * this.radius * this.radius;
    }

    @Override
    double calculatePermeter() {
        return 2*Math.PI* this.radius;
    }

    @Override
    public void print() {
        System.out.println("Radius = " + this.radius);
        System.out.println("Area = " + this.calculateArea());
        System.out.println("Permeter = " + this.calculatePermeter());

    }
}

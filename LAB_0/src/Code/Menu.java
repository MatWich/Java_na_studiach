package Code;

import java.util.Scanner;

public class Menu {

    Scanner scan = new Scanner(System.in);

    public void showMenu()
    {
        System.out.println("1. Oblicz pole i obwod kwadratu.");
        System.out.println("2. Oblicz pole i obwod kola.");
        System.out.println("3. Oblicz pole i obwod trojkata.");
        System.out.println("4. Oblicz pole i obwod dowolnego graniastoslupa prawidlowego.");
    }

    // tworzy trojkat
    public Triangle createTrial() {

        System.out.println("Podaj bok a trojkata: ");
        double a = this.scan.nextDouble();
        System.out.println("Podaj bok b trojkata: ");
        double b = this.scan.nextDouble();
        System.out.println("Podaj bok c trojkata: ");
        double c = this.scan.nextDouble();

        return new Triangle(a, b, c);
    }

    public Circle createCircle()
    {
        System.out.println("Podaj promień kola: ");
        double rad = this.scan.nextDouble();
        return new Circle(rad);
    }

    public Square createSqr()
    {
        System.out.println("Podaj bok Kwadratu: ");
        double SqrSide = this.scan.nextDouble();
        return new Square(SqrSide);
    }

    public Prism createPrism()
    {
        System.out.println("Podaj dlugosc boku podstawy: ");
        double sideOfBase = this.scan.nextDouble();
        System.out.println("Podaj ilosc bokow podstawy: ");
        int sideAmount = this.scan.nextInt();
        System.out.println("Podaj wysokosc graniastoslupa: ");
        double H = this.scan.nextDouble();
        return new Prism(sideOfBase, H, sideAmount);

    }
}

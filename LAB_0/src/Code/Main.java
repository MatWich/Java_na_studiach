package Code;


import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

    boolean run = true; // gdy false program konczy dzalanie
    Menu menu = new Menu();

    while (run){
        Scanner scan = new Scanner(System.in);
        menu.showMenu();
        System.out.println("Co chcesz zrobic? [0 aby wyjsc]");
        int choice = scan.nextInt();

        switch (choice)
        {
            case 1:
                Square square = menu.createSqr();
                square.print();
                break;

            case 2:
                Circle circle = menu.createCircle();
                circle.print();;
                break;
            case 3:
                Triangle trial = menu.createTrial();
                trial.print();
                break;
            case 4:
                Prism prism = menu.createPrism();
                prism.print();
                break;
            case 0:
                run = false;
                exit(0);
        }
    }



    }
}

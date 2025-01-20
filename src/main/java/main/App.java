package main;

import java.util.Scanner;



public class App 
{
    public static void main( String[] args ){

        Safe safe = new Safe("0000");

        
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("1) Aseta PIN-koodi");
            System.out.println("2) Lisää tietoja kansioon");
            System.out.println("3) Listaa tiedot kansiosta");
            System.out.println("0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch (i) {
                    case 1:
                        System.out.println("Anna uusi PIN-koodi: ");
                        String setPinCode = sc.nextLine();
                        safe.setPinCode(setPinCode);
                        break;
                        
                    case 2:
                        System.out.println("Anna kansioon lisättävä tieto: ");
                            String item = sc.nextLine();
                            safe.addItem(item);
                        break;

                    case 3:
                        System.out.println("Anna PIN-koodi: ");
                        String checkPinCodeRead = sc.nextLine();
                        if (safe.checkPinCode(checkPinCodeRead)) {
                            safe.showItems();
                        }
                        break;

                    case 0:
                        exit = true;
                        System.out.println("Kiitos ohjelman käytöstä.");
                        break;

                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
            
        }
        sc.close();
    }

}


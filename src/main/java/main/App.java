package main;

import java.util.ArrayList;
import java.util.Scanner;



public class App 
{
    public static void main( String[] args ){

        
        Scanner sc = new Scanner(System.in);

        class Safe {
            private String pinCode;
            private ArrayList<String> safeFolder = new ArrayList<>();
        
            public Safe(String pincode) {
                this.pinCode = pincode;
                this.safeFolder = new ArrayList<>();
            }
        
            public void setPinCode(String newPinCode) {
                this.pinCode = newPinCode;
            }
        
            public boolean checkPinCode(String inputPinCode) {
                if (inputPinCode.equals(this.pinCode)) {
                    return true; 
                } else {
                    System.out.println("Väärä PIN-koodi!");
                    return false;
                }
                
            }
        
            public void addItem(String item) {
                    this.safeFolder.add(item);
                    }
        
            public void showItems() {
                    for (String item : this.safeFolder) {
                        System.out.println(item);
                        }
            }   
        }
        
        
        Safe safe = new Safe("0000");
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
                        } else {
                            System.out.println("Väärä PIN-koodi!");
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


package main;

import java.util.ArrayList;

public class Safe {
    private String pinCode;
    private ArrayList<String> safeFolder;

    public Safe(String pincode) {
        this.pinCode = pincode;
        this.safeFolder = new ArrayList<>();
    }

    public void setPinCode(String newPinCode) {
        this.pinCode = newPinCode;
        return;
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
        return; 
    }

    public void showItems() {
        for (String item : this.safeFolder) {
            System.out.println(item);
        }
        return;
    }
}

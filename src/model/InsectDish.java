
package model;

import interfaces.Discountable;

public class InsectDish extends MenuItem implements Discountable {

    private String insectType;

    public InsectDish(int id, String name, String description,
                      double price, String insectType) {

        super(id, name, description, price);
        setInsectType(insectType);
    }

    public String getInsectType() {
        return insectType;
    }

    public void setInsectType(String insectType) {
        if (insectType == null || insectType.trim().isEmpty()) {
            throw new IllegalArgumentException("Vrsta insekta nije uneta.");
        }
        this.insectType = insectType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Jelo: " + getName());
        System.out.println("Opis: " + getDescription());
        System.out.println("Cena: " + getPrice() + " RSD");
        System.out.println("Vrsta insekta: " + insectType);
    }

    @Override
    public double calculateDiscount(double percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Neispravan popust.");
        }

        return getPrice() * (1 - percentage / 100);
    }
}

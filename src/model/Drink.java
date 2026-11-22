
package model;

public class Drink extends MenuItem {

    private boolean alcoholic;

    public Drink(int id, String name, String description,
                 double price, boolean alcoholic) {

        super(id, name, description, price);
        this.alcoholic = alcoholic;
    }

    public boolean isAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

    @Override
    public void displayDetails() {
        System.out.println("Piće: " + getName());
        System.out.println("Opis: " + getDescription());
        System.out.println("Cena: " + getPrice() + " RSD");
        System.out.println("Alkoholno: " +
                (alcoholic ? "Da" : "Ne"));
    }
}

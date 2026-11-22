
package model;

public class RegularDish extends MenuItem {

    private boolean vegetarian;

    public RegularDish(int id, String name, String description,
                       double price, boolean vegetarian) {

        super(id, name, description, price);
        this.vegetarian = vegetarian;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    @Override
    public void displayDetails() {
        System.out.println("Jelo: " + getName());
        System.out.println("Opis: " + getDescription());
        System.out.println("Cena: " + getPrice() + " RSD");
        System.out.println("Vegetarijansko: " +
                (vegetarian ? "Da" : "Ne"));
    }
}


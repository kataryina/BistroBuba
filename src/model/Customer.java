
package model;

public class Customer {

    private int customerId;
    private String name;
    private String email;
    private int loyaltyPoints;

    public Customer(int customerId, String name, String email) {
        setCustomerId(customerId);
        setName(name);
        setEmail(email);
        this.loyaltyPoints = 0;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        if (customerId <= 0) {
            throw new IllegalArgumentException(
                "ID gosta mora biti pozitivan."
            );
        }
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Ime gosta ne sme biti prazno."
            );
        }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")
                || !email.contains(".")) {
            throw new IllegalArgumentException(
                "Email adresa nije ispravna."
            );
        }
        this.email = email;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void addLoyaltyPoints(int points) {
        if (points <= 0) {
            throw new IllegalArgumentException(
                "Broj poena mora biti pozitivan."
            );
        }
        loyaltyPoints += points;
    }

    public void displayCustomerInfo() {
        System.out.println("Gost: " + name);
        System.out.println("Email: " + email);
        System.out.println("Broj poena: " + loyaltyPoints);
    }
}

import java.util.Enumeration;

public class TextStatement extends Statement {
    public String HeaderValue(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    public String RentalValue(Rental each) {
        return "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
    }

    public String FooterValue(Customer aCustomer) {
        String results = "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
        results += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
        return results;
    }
}
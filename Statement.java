import java.util.Enumeration;

public abstract class Statement {

    public abstract String HeaderValue(Customer aCustomer);
    public abstract String RentalValue(Rental each);
    public abstract String FooterValue(Customer aCustomer);

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = HeaderValue(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for this rental
            result += RentalValue(each);
        }
        // add footer lines
        result += FooterValue(aCustomer);
        return result;
    }
}
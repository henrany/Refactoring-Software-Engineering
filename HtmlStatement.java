import java.util.Enumeration;

public class HtmlStatement extends Statement {
    public String HeaderValue(Customer aCustomer){
      return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    public String RentalValue(Rental each){
      return each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
    }

    public String FooterValue(Customer aCustomer){
      String results = "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
      results += "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + "</EM> frequent renter points<P>";
      return results;
    }
}
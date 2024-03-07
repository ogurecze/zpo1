public class Client {
    private String location;
    public CalculateTax calculateTax;
    Client (String location){
        this.setupClient(location);
    }

    private void setupClient(String location){
        this.location = location;
        if (location == "PL"){
            this.setCalculateTax(new TaxPL());
        }
        else if (location == "GER"){
            this.setCalculateTax(new TaxGER());
        }
        else if (location == "GB"){
            this.setCalculateTax((new TaxGB()));
        }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public CalculateTax getCalculateTax() {
        return calculateTax;
    }

    public void setCalculateTax(CalculateTax calculateTax) {
        this.calculateTax = calculateTax;
    }
}

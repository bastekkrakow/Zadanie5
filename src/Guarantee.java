public class Guarantee {
    int validUntil;
    Product product;
    int date = 20180211;


    public void setValidUntil(int validUntil) {
        this.validUntil = validUntil;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Guarantee(int validUntil, Product product) {
        this.validUntil = validUntil;
        this.product = product;
    }

    boolean isValid(Product product) {
        if (validUntil > date) {
            System.out.println("Dobry");
            return true;
        } else {
            product = null;
            validUntil=0;
            System.out.println("Skasowany");
            return false;
            }


    }


}


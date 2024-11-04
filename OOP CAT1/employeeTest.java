public class invoiceItemTest {
    public static void main(String[] args) {
        // Create an InvoiceItem object
        InvoiceItem item = new InvoiceItem("I001", "Product A", 5, 10.99);

        // Print invoice item information
        System.out.println(item);

        // Calculate and print total
        System.out.println("Total: " + item.getTotal());

        // Change quantity and print new total
        item.setQty(3);
        System.out.println("New total: " + item.getTotal());
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Medicine {
    private String name;
    private String manufacturer;

    public Medicine(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}

public class MedicineSearch {
    public static void main(String[] args) {
        List<Medicine> medicineList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Adding sample medicines to the list
        medicineList.add(new Medicine("Paracetamol", "ABC Pharmaceuticals"));
        medicineList.add(new Medicine("Ibuprofen", "XYZ Pharmaceuticals"));
        medicineList.add(new Medicine("Aspirin", "PQR Pharmaceuticals"));

        // Get the medicine name to search from the user
        System.out.print("Enter the medicine name to search: ");
        String searchMedicine = scanner.nextLine();

        // Perform medicine search
        boolean found = false;
        for (Medicine medicine : medicineList) {
            if (medicine.getName().equalsIgnoreCase(searchMedicine)) {
                System.out.println("Medicine found!");
                System.out.println("Name: " + medicine.getName());
                System.out.println("Manufacturer: " + medicine.getManufacturer());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Medicine not found!");
        }

        scanner.close();
    }
}

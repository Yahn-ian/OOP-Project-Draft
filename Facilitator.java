import java.util.*;

class FacilitatorInfo{
    private String facilitatorName = "Jologs";
    private int pin;
    private String[] location;
    private String[] disasterType;
    private int[] popSize;
    private String[] others;
    private double donatedCash;


    public FacilitatorInfo(String facilitatorName, int pin, String[] location, String[] disasterType, int[] popSize, String[] others, double donatedCash){
        this.facilitatorName = facilitatorName;
        this.pin = pin;
        this.location = location;
        this.disasterType = disasterType;
        this.popSize = popSize;
        this.others = others;
        this.donatedCash = donatedCash;

    }

    public void transactions(){
        //Hindi ko knows ni T-T
    } 
    
    public String getFacilitatorName() {
        return facilitatorName;
    }

    public int getPin() {
        return pin;
    }

    public String[] getLocation() {
        return location;
    }

    public String[] getDisasterType() {
        return disasterType;
    }

    public int[] getPopSize() {
        return popSize;
    }

    public String[] getOthers() {
        return others;
    }
    public double getDonatedCash() {
        return donatedCash;
    }

    public void displayDisasterDetails(){
        
        System.out.println("\n=====================================================================================");
        System.out.println("|         Location        |          Disaster            |       Population Size    | ");
        System.out.println("=====================================================================================");

        for (int i = 0; i < location.length && i < disasterType.length && i < popSize.length; i++) {
            System.out.printf("%-25s %-28s %-29s|%n", "|          " + location[i], "|          " + disasterType[i], "  |          " + popSize[i]);

        }

        System.out.println("=====================================================================================");
        System.out.println("");
        
    }

    public void displayInventories(int food, int water, int medicalSupplies, int clothing, String[] others) {
        // Define ranges as an array of minimum and maximum pairs
        int[][] ranges = {
            {1, 30},
            {31, 60},
            {61, 90},
            {91, 120},
            {121, 150},
            {151, 180},
            {181, 210}
        };

        System.out.println("\n=======================================");
        System.out.println("|      RANGES OF POPULATION SIZE      |");
        System.out.println("=======================================");

        for (int i = 0; i < ranges.length; i++) { 
            int min = ranges[i][0];
            int max = ranges[i][1];
            System.out.println(String.format("|             %3d - %3d               |", min, max));
        }
        
        
        System.out.println("=======================================");
    
        System.out.println(" ");
        System.out.println("\n============================================================================================================================================================================");
        System.out.println("|                                                                      RELIEF GOODS AND SUPPLIES                                                                           |");
        System.out.println("============================================================================================================================================================================");
        System.out.println("|     No. of Affected Citizens  |       Foods       |      Water       |   Medical Supplies  |     Clothing     |            Others             |           Status         |");
        System.out.println("============================================================================================================================================================================");
    
        int othersIndex = 0;
    
        for (int i = 0; i < popSize.length; i++) { 
            int pop = popSize[i]; 
            
            int min = ranges[i][0];
            int max = ranges[i][1];

            String status = (pop >= min && pop <= max) ? "Sufficient" : "Insufficient"; 
            String othersValue = othersIndex < others.length ? others[othersIndex] : ""; 
            System.out.println(String.format("|             %3d               |        %3d       |       %3d       |         %3d        |       %3d       |     %21s     |      %15s     |", 
            pop, food, water, medicalSupplies, clothing, othersValue, status));
            
            othersIndex++; 
        }
    
        System.out.println("============================================================================================================================================================================");
        System.out.println("");
    }

    public void processTransactions(){
        //kayo na bahala here hehehe
        
    }

    public void displayVolunteers(){
       
    }

    public void displayDonors(){
        
    public void displayDonors() {
    

        System.out.println("");
        System.out.println("\n===============================================================================");
        System.out.println("                      . . .  LIST OF DONORS  . . .                ");
        System.out.println("===============================================================================");


    }

    public void displayFaciSummary(){

    }
}


public class Facilitator{

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

       
        FacilitatorInfo facilitator = new FacilitatorInfo("Francine", 123, new String[]{"Cebu", "Manila", "Iloilo", "Cavite", "Davao", "Palawan", "Baguio"}, new String[]{"Typhoon", "Flood", "Earthquake", "Volcanic Eruption", "Landslide", "Forest Fire", "Tsunami"}, new int[]{10, 35, 64, 21, 33, 99, 256}, new String[] {"Free Public Transport"}, 100.0);
        
        facilitator.displayDisasterDetails();
        facilitator.displayInventories(1000,1000, 1000, 1000, new String[] {"Free Public Transport"});
        
        
        facilitator.displayDonors();
    }

    
}

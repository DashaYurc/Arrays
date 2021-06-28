package lv.sda;

public class Main {

    public static void main(String[] args) {
	    int[] ages = {12, 15, 18 ,19}; //manually enter the values
        //System.out.println(ages.length);
        //System.out.println(ages[0]);

        double average = 0;
        double sum = 0;

        for(int i = 0; i < ages.length; i++){
            sum = sum + ages[i];
            //System.out.println(sum);
        }

        average = sum / ages.length;
        System.out.println(average);

        String[] names = new String[4]; //create a new instance and give it a size
        names[3] = "Jane";
        //System.out.println(names[3]);


        String bunchOfNames = "";
        for(int i = 0; i< names.length; i++){
            bunchOfNames =  bunchOfNames +names[i] + " ";

        }
        System.out.println(bunchOfNames);

        
    }
}

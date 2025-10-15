import java.util.Scanner;
public class TVSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("There are 3 TV Models available: Model 1 Remote, Model 2 Picture, Model 3 HDTV");
        System.out.println("Model 100: Remote control, timer, Stereo sound");
        System.out.println("Model 200: Adds picture in picture");
        System.out.println("Model 300: Adds HDTV, Flat screen, 16x9 aspect ratio);");


        //Input
        System.out.print("Enter the model you want to buy: ");
        int model = scanner.nextInt();

        String ModelName;
        int price =0;

        System.out.println("You have selected Model " + model + ":");
        switch (model) {
            case 100: ModelName = "Remote"; 
                price = 1000;
                break;
            
            case 200: ModelName = "Picture";
                 price = 1200;
                 break; 
            
            case 300: ModelName = "HDTV";
                price = 2400;
                break;
        
            default: {
                System.out.println("Invalid model selected.");
                scanner.close();
                return;
            }
            }
        

        //Output
        System.out.println("Model Name: " + ModelName);
        System.out.println("Price: $" + price);

        
    }
}
        
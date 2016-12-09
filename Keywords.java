import java.util.Scanner;
import java.io.*;
public class Keywords
{
    public static void SearchByTerm(FileReader myFile, BufferedReader br) throws IOException
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Term ..? ");
        String term=input.nextLine();
        
        System.out.println("");
        String textFileLine;
        do{
            textFileLine=br.readLine();
        }   while(!textFileLine.equalsIgnoreCase(term) && (textFileLine=br.readLine()) !=null);
        
        if ((textFileLine=br.readLine()) ==null){
            System.out.println("TERM NOT FOUND");
        } else{
            System.out.println("FOUND ..."+textFileLine);
        }
        
    }
    
    public static void SearchDescriptionsForkeyWords(FileReader myFile, BufferedReader br) throws IOException
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Term ..? ");
        String keyword=input.nextLine();
        boolean contains=false;
        System.out.println("");
        String textFileLine;
        for(int i=0; i<=28; i++){
            String term=br.readLine();
            textFileLine=br.readLine();
            contains=textFileLine.contains(keyword);
            if (contains==true){
                System.out.println("Found for "+term);
                System.out.println(textFileLine);
                break;
            }
        }
 
        if(contains==false){
            System.out.println("KEYWORD NOT FOUND");
        }
        }
        
    
    public static void main(String[]args) throws IOException
    {
        FileReader myFile=new FileReader("C:\\Documents and Settings\\Paul\\My Documents\\Sam's Folder\\A level\\Computing\\Keywords.txt");
        BufferedReader br=new BufferedReader(myFile);
        Scanner input=new Scanner(System.in);
        
        System.out.println("1. Search for a term");
        System.out.println("2. Search for a keyword in the descriptions");
        System.out.println("3. End");
        
        System.out.print("Key in choice ");
        int choice=input.nextInt();
        System.out.println("");
        
        
        
        if (choice==1){
            SearchByTerm(myFile, br);
        } else if (choice==2){
            SearchDescriptionsForkeyWords(myFile, br);
        } else if (choice==3){
            myFile.close();
        }
    }
}

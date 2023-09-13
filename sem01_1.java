import java.time.LocalDate;
import java.util.Scanner;

public class sem01_1 {
    public static void printBonusDatesBetween(int fromYear,int toYear){
        LocalDate from = LocalDate.of(fromYear,01,01);
        LocalDate to = LocalDate.of(toYear,01,01);
        String fromstr = from.toString();
        String tostr = to.toString();
        String q = fromstr.substring(0, 4),t ;
       
        int value = from.compareTo(to), z=1;
        String rev;
        
        for(int i=0;value<1;i++){
            
            from=from.plusDays(z);
            fromstr = from.toString();
            value = from.compareTo(to);
            q = fromstr.substring(0, 4);
            t = fromstr.substring(4, 10);
            rev = new StringBuilder(t).reverse().toString().replaceAll("-", "");
            if(q.equals(rev)){
                System.out.println(from);
            }
        }
    }

    public static void main(String[] args) throws Exception {
      
        Scanner in = new Scanner(System.in);
        int fromYear, toYear;

        fromYear = in.nextInt();
        toYear = in.nextInt();
        in.close();  
        printBonusDatesBetween(fromYear, toYear);
    } 
    
    
}

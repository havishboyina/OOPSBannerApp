public class OPPSBANNERAPPUC5 {
    public static void main(String[] args) {
        
        
        String[] banner = {
            String.join("", "**************************"), 
            "* *",                
            "* JAVA LEARNING UC5    *",              
            "* CONCISE AND CLEAN    *",                
            "* MERGING TO DEV       *",                
            "* *",               
            String.join("", "**************************") 
        };

       
        for (String row : banner) {
            System.out.println(row);
        }
    }
}
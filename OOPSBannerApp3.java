
public class OOPSBannerApp3 {
  
   
    public static void main(String[] args) {
      
        String[] o = {" **** ", "*    *", "*    *", " **** ", "*    *", "*    *", " **** "};
        
       
        String[] p = {"*    ", "*    ", "*    ", " ****", "*    ", "*    ", "*    "};
        
      
        String[] s = {" **** ", "    *", " **** ", "*    ", "    *", "*    ", " **** "};
        
        System.out.println(String.join("", o[0], o[1], p[0], s[0]));  
        System.out.println(String.join("", o[1], o[1], p[1], s[1]));  
        System.out.println(String.join("", o[2], o[2], p[2], s[2]));  
        System.out.println(String.join("", o[3], o[3], p[3], s[3]));  
        System.out.println(String.join("", o[4], o[4], p[4], s[4]));  
        System.out.println(String.join("", o[5], o[5], p[5], s[5]));  
        System.out.println(String.join("", o[6], o[6], p[6], s[6]));  
    }
}

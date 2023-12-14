
package projetocriptografia;

/**
 *
 * @author Ian Santos
 */

public class criptografia {

    
    public static String funcaoCriptografar(String base){
        int i, temp;
        String cript = "", build;
        
        for(i=0; i<base.length();i++){
            
            temp = base.charAt(i)*(i+1);
            
            build = Integer.toString(temp);
            
            build = Integer.toString(build.length()) + build;
            
            cript += build;
        }
        
        return cript;
    }
    
    public static String funcaoDescriptografar(String base){
        int proximosQnt;
        String decript = "", build;
        
        for(int i=0,cont=0; i<base.length();i+=proximosQnt+1,cont++){
            
            build = "";
                    
            proximosQnt = Integer.parseInt(Character.toString(base.charAt(i)));
            
            for(int j = 1, k = i+1; j <= proximosQnt ;j++,k++){
                build += Character.toString(base.charAt(k));
            }
                decript += (char) (Integer.parseInt(build)/(cont+1));
        }
        
        return decript;
    }
    
    public static void main(String[] args) {
        
        String text = "Isn't it enough to see that a garden is beautiful without having to believe that there are fairies at the bottom of it too?";
        
        String cript = funcaoCriptografar(text);
        System.out.println(cript);
        
        String decript = funcaoDescriptografar(cript);
        System.out.println(decript);
        
    }
    
}

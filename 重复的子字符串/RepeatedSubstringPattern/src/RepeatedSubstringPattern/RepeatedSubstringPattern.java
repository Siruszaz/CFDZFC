package RepeatedSubstringPattern;

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        for(int i = 1;i <= length/2;i++){
            if(length%i == 0){
                boolean flag = true;
                for(int j = i; j < length; j++){
                    if(s.charAt(j) != s.charAt(j-i)  ){
                        flag = false;
                        break;
                    }
                }
        if(flag == true){
        return true;
                }
            }
        }
        return false;
    }
}

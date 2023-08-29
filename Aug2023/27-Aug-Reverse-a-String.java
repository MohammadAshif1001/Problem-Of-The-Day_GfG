//Today Very easy Question Link - https://practice.geeksforgeeks.org/problems/reverse-a-string/1  
class Reverse
{
    public static String reverseWord(String str)
    {
        // Reverse the string str
        StringBuilder revStr = new StringBuilder("");
        int n=str.length()-1;
        for(int i=n; i>=0; i--){
            revStr.append(str.charAt(i));
        }
        return revStr.toString();
    }
}

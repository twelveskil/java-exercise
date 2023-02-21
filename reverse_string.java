public class reversing_string {
    public static void main(String[] args){
        String str = "Reverse";
        String trs = "";

        for(int i = 0; i<str.length(); i++){
            char letter = str.charAt(i);
            trs = letter + trs;
        }
        System.out.println(str); // normal string
        System.out.println(trs); // reversed string
    }
}

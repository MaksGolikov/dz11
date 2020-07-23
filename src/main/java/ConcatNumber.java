import java.util.List;

public class ConcatNumber {
    public String concat (List<String> list){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            char[] arr = str.toCharArray();
            for (int j = 0; j < arr.length; j++) {
                if(Character.isDigit(arr[j])){
                    result.append(arr[j]);
                }
            }
        }
        return result.toString();
    }
}

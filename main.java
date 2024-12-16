import java.util.ArrayList;

class String_container {
    protected ArrayList<String> container = new ArrayList<String>();

    public void addString (String s){
        container.add(s);
    }
    public String getLongest(){
        String longest = container.get(0);
        for (int i = 0; i < container.size(); i++){
            if (longest.length() < container.get(i).length()){
                longest = container.get(i);
            }
        }
        return longest;
    }
    public float getAvaerageLength(){
        float length = 0;
        for (int i = 0; i < container.size(); i++){
            length += container.get(i).length();
        }
        return length/container.size();
    }
}

public class main {

    public static void main(String[] args) {
        String_container sc = new String_container();
        sc.addString("Арбуз");
        sc.addString("Лимон");
        sc.addString("Яблоко");
        System.out.println(sc.getAvaerageLength());
        System.err.println(sc.getLongest());
    }
}
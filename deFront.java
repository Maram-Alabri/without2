public class deFront {
    public String deFront(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'a') {
            result += 'a';
        }

        if (str.length() >= 2 && str.charAt(1) == 'b') {
            result += 'b';
        }

        if (str.length() > 2) {
            result += str.substring(2);
        }

        return result;
    }

}

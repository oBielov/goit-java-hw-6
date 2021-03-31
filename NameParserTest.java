class NameParser {
    public String parse(String[] names) {
        StringBuilder build = new StringBuilder();
        for(int i=0; i < names.length; i++){
            build.append(names[i].substring(0, names[i].indexOf(" "))).append(", ");
        }
        String result = build.toString();
        if(result.length()>2){
            return result.trim().substring(0, result.length()-2);
        } else{
            return result;
        }
        
    }
}

class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}

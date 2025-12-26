public class newSwitch
{
    public static void main(String args[])
    {
        String day = "Monday";
        String result = "";

        // switch(day)
        // {
        //     case "Saturday", "Sunday" -> result = "6am";
        //     case "Monday" -> result = "8am";
        //     default -> result = "7am";
        // }


        // result = switch(day)
        // {
        //     case "Saturday", "Sunday" -> "6am";
        //     case "Monday" -> "8am";
        //     default -> "7am";
        // };


         result = switch(day)
        {
            case "Saturday", "Sunday" : yield "6am";
            case "Monday" : yield "8am";
            default : yield "7am";
        };


        System.out.println(result);

    }
}
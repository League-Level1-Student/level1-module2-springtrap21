
public class TeaParty {
        public String welcome (String name, boolean isWoman, boolean isKnighted) {
        	String message = "";
        	message += "Hello";
        if (isWoman && isKnighted) {
			message += " Lady ";
		}
        if (isWoman && !isKnighted) {
			message += " Ms. ";
		}
        if (isKnighted && !isWoman) {
			message += " Sir ";
		}
        if (!isWoman && !isKnighted) {
			message += " Mr. ";
		}
        message += name;
        
        return message;
        }
}

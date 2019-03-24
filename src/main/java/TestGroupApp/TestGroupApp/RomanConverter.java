package TestGroupApp.TestGroupApp;

public class RomanConverter {

	public String convert(int number) {
		// TODO Auto-generated method stub
		String Result = "";
		switch(number) {
		  case 1:
			  // code block
			  Result = "I";
			  break;
		  case 2:
			  // code block
			  Result = "II";
			  break;
		  case 3:
			  // code block
			  Result = "III";
			  break;
		  default:
			  Result = "";
			  break;
		}
		
		return Result;
	}

}

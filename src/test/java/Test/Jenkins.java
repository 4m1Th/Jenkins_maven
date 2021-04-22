package Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import CommonLib.Browser;
import URL.URL;

public class Jenkins {
	
	Browser br=new Browser();
	URL url=new URL();
	
	@Test(priority=1)
	public void url() {
		
		br.firefox(url.url);
		
	}

	
	
}

package co.edu.udea.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.udea.main.Codebreaker;

public class CodeBreakerTest {
	
	private Codebreaker cb;
	private String ans;
	
	@Test
	public void finalTest()
	{
		cb = new Codebreaker();
		ans = cb.numberAnalysis("4222", "4222");
		System.out.println(ans);
		assertEquals("XXXX", ans);
	}

	@Test
	public void rightAnswer() {
		cb = new Codebreaker();
		ans = cb.numberAnalysis("7234", "7234");
		assertEquals("XXXX",ans);
	}
	
	@Test
	public void threeAnsRight(){
		cb = new Codebreaker();
		ans = cb.numberAnalysis("7234", "7235");
		assertEquals("XXX",ans);
	}
	
	@Test
	public void TwoAnsRight(){
		cb = new Codebreaker();
		ans = cb.numberAnalysis("7234", "7281");
		assertEquals("XX", ans);
	}
	
	@Test
	public void OneAnsRight(){
		cb = new Codebreaker();
		ans = cb.numberAnalysis("7234", "7566");
		assertEquals("X",ans);
	}
	
	@Test 
	public void wrongAnswer(){
		cb = new Codebreaker();
		ans = cb.numberAnalysis("7234", "5566"); 
		assertEquals("",ans);
	}
	
	@Test
	public void rightAnswerBPosition(){
		cb = new Codebreaker();
		ans = cb.numberAnalysis("7234", "4327");
		assertEquals("----",ans);
	}
	
	@Test
	public void rightAnswerThreeBPosition(){
		cb = new Codebreaker();
		ans = cb.numberAnalysis("7234", "3721");
		assertEquals("---", ans);
	}
	
	@Test
	public void rightAnswerTwoBPosition(){
		cb = new Codebreaker();
		ans = cb.numberAnalysis("7234", "2785");
		assertEquals("--", ans);
	}
	
	@Test
	public void rightAnswerOneBPosition(){
		cb = new Codebreaker();
		ans = cb.numberAnalysis("7234", "5567");
		assertEquals("-", ans);
	}
	
	@Test
	public void twoAnsRightTwoBPosition(){
		cb = new Codebreaker();
		ans = cb.numberAnalysis("7234", "7243");
		assertEquals("XX--", ans);
	}
	
	@Test
	public void twoAnsRightOneBPosition(){
		cb = new Codebreaker();
		ans = cb.numberAnalysis("7234", "7213");
		assertEquals("XX-",ans);
	}
	
	@Test
	public void  oneAnsRightThreeBPostition(){
		cb = new Codebreaker();
		ans = cb.numberAnalysis("7234", "7342");
		assertEquals("X---", ans);
	}
	
	@Test
	public void oneAnsRightTwoBPosition(){
		cb = new Codebreaker();
		ans = cb.numberAnalysis("7234", "7321");
		assertEquals("X--", ans);
	}
	
	@Test
	public void oneAnsRightOneBPosition(){
		cb = new Codebreaker();
		ans = cb.numberAnalysis("7234", "7126");
		assertEquals("X-", ans);
	}

	

}

package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import model.Calculation;

public class MyController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
	
		ModelAndView mv=new ModelAndView("index");
		String s1=req.getParameter("n1");
		String s2=req.getParameter("n2");
		
		Calculation c=new Calculation();
		c.setN1(Integer.parseInt(s1));
		c.setN2(Integer.parseInt(s2));
		int ans=c.getN1()+c.getN2();
		mv.addObject("ans", ans);

		
		return mv;
	}

}

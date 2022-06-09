package com.smhrd.frontcontroller;

import java.util.HashMap;

import com.smhrd.controller.Controller;
import com.smhrd.controller.JoinController;
import com.smhrd.controller.LoginController;
import com.smhrd.controller.LogoutController;
import com.smhrd.controller.MemberlistController;
import com.smhrd.controller.UlocationController;
import com.smhrd.controller.FAQController;
import com.smhrd.controller.ViewJoinController;
import com.smhrd.controller.ViewLoginController;
import com.smhrd.controller.ViewMainController;
import com.smhrd.controller.ViewUlocationController;
import com.smhrd.controller.ViewUseController;

import test.UseController;

public class HandlerMapping {
	private HashMap<String, Controller> mappings;
	
	public HandlerMapping() {
		
	mappings=new HashMap<String, Controller>();
	mappings.put("/join.do", new JoinController());
	mappings.put("/viewMain.do", new ViewMainController());
	mappings.put("/viewJoin.do", new ViewJoinController());
	mappings.put("/viewLogin.do", new ViewLoginController());
	mappings.put("/login.do", new LoginController());
	mappings.put("/memberlist.do", new MemberlistController());
	mappings.put("/faq.do", new FAQController());
	mappings.put("/use.do", new UseController());
	mappings.put("/viewUse.do", new ViewUseController());
	mappings.put("/viewUlocation.do", new ViewUlocationController());
	mappings.put("/logout.do", new LogoutController());

	}
	
	
	public Controller getController(String command) {
		return mappings.get(command);
	}

}

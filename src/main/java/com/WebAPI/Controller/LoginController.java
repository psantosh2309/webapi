package com.WebAPI.Controller;

import java.util.Objects;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.WebAPI.Model.LoginModel;
import com.WebAPI.Repository.LoginRepository;
import com.WebAPI.Service.LoginService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("api/v1/")
public class LoginController {
	
	@Autowired
    private LoginService userService;
	private LoginRepository Loginrepos;
	

	
//    @PostMapping("/login")
//    public String login(@ModelAttribute("user") LoginModel user ) {
//    
//    LoginModel oauthUser = userService.login(user.getUsername(), user.getPassword());
//    System.out.print(oauthUser);
//    
//    	if(Objects.nonNull(oauthUser)) 
//    	{	
//          return "redirect:/";
//    	
//    	} 
//    	else {
//    		return "redirect:/login";
//    		
//    	}
//
//}
    
    
    @PostMapping("/login")
    public LoginModel GetLogin (@RequestBody LoginModel user) {
//    String Name = user.getUsername();
//    
//    System.out.println(Name);
    	
    LoginModel oauthUser = userService.login(user.getUsername(), user.getPassword());
     return oauthUser;
	
    
}
    
//    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
//    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
//    {
//      return "redirect:/login";
//    }

}
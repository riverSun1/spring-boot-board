package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@GetMapping("/sbb")
	@ResponseBody
    public String index() {
        return "index";
    }
}

// 스프링 부트는 웹 브라우저로부터 http://localhost:8080/sbb 요청이 발생하면 
// /sbb URL과 매핑되는 index 메서드를 MainController 클래스에서 찾아 실행한다.
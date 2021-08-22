package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
/**
 * @ComponentScan 과 @RequestMapping 을 함께 써서 @Controller 의 효과를 낼 수 있다.
 * @RequestMapping 만 사용하고 따로 Bean 으로 등록해도 같은 효과를 낼 수 있다.
 */
// @RequestMapping
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }
}

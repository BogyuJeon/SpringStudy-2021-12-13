package study;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*@Component
//콤퍼넌트 종류 네가지 (아래)
@Controller //페이지 관련 1과 2를 서비스에게 던져줘
@Service //로직 관련 서비스는 1과 2를 받아 더하기 로직을 하고 3을 다시 컨트롤러에게 던져줌
@Repository //디비와 소통 데이터를 찾아 다시 서비스에게 던져줌
@Configuration*/

@Controller
public class PageController
{
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String indexform(Model model)
	{
		model.addAttribute("Hello", "spring 수업");
		return "index/index";
	}
}

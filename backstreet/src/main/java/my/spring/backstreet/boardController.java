package my.spring.backstreet;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class boardController {


@RequestMapping(value = "/testLogin")
	/*   jung/0224/ ���������� �����ֱ����� �׽�Ʈ�α��� ��Ʈ�ѷ� ���� */
public String isComplete(HttpSession session) {
	return "naver/naverlogin";
	
}


	
	}


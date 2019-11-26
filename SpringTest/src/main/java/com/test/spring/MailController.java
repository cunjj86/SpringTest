package com.test.spring;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MailController {
  @Autowired
  private JavaMailSender mailSender;
  // mailForm
  @RequestMapping(value = "/mailinquiry.do")
  public String mailinquiry() {   
    return "mailinquiry.do";
  }
  // mailSending �ڵ�
  @RequestMapping(value = "/mailSending.do")
  public String mailSending(HttpServletRequest request) {
    String setfrom = "koreajrf@gamil.com";	 //������ ��� �̸��� 
    String tomail  = request.getParameter("tomail");     // �޴� ��� �̸���
    String title   = request.getParameter("title");      // ����ó(email,��ȭ��ȣ)
    String content = request.getParameter("content");    // ����
    try {
      MimeMessage message = mailSender.createMimeMessage();
      MimeMessageHelper messageHelper 
                        = new MimeMessageHelper(message, true, "UTF-8");
      messageHelper.setFrom(setfrom);  // �����»�� �����ϰų� �ϸ� �����۵��� ����
      messageHelper.setTo("dongki@jpremit.com");     // �޴»�� �̸���
      messageHelper.setSubject(title); // ���������� ������ �����ϴ�
      messageHelper.setText(content);  // ���� ����     
      mailSender.send(message);
    } catch(Exception e){
      System.out.println(e);
    }   
    return "redirect:/mailinquiry.do";
  }

}
package com.hao.Controller;
/**
* @author Griezmann
* @date 2018年10月10日 
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 注解声明，该类为Controller类 并自动加载所需要的其它类
 */
@Controller
@EnableAutoConfiguration
public class WordCloudController {   
   @RequestMapping("/wordcloud_original")
   String getHotWordsOriginal(ModelMap modelMap) {
       return "wordcloud_original";
   }
   
   // 主方法，像一般的Java类一般去右击run as application时候，执行该方法
   public static void main(String[] args) throws Exception {
      SpringApplication.run(WordCloudController.class, args);
   }
}

package com.hao.Controller;
/**
* @author Griezmann
* @date 2018年10月10日 
*/

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hao.manager.WeiBoDBManager;
/**
 * 注解声明，该类为Controller类 并自动加载所需要的其它类
 */
@Controller
public class DBController {
   @Autowired
   private WeiBoDBManager weiBoDBManager;
   
   @RequestMapping("/hotwords")
   String getHotWords(ModelMap modelMap) {
       List<Map<String, Object>> list = weiBoDBManager.getHotWordsList();
       modelMap.put("result", list);
       return "weibo_hotwords";
   }
}

package com.hao.manager;
/**
* @author Griezmann
* @date 2018年10月10日 
*/

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
/**
 * 注解声明,可以自动引入其它类、或被其它类引入
 */
@Component
public class WeiBoDBManager {
   @Autowired
   private JdbcTemplate jdbcTemplate;
   
   public List<Map<String, Object>> getHotWordsList() {
       String sql = "select * from weibo_hot_words";
       List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
       return list;
   }
}
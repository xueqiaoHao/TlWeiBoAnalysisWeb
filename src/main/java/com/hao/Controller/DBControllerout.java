package com.hao.Controller;
/**
* @author Griezmann
* @date 2018年10月10日 
*/

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* 注解声明，该类为Controller类 并自动加载所需要的其它类
*/
@Controller
@EnableAutoConfiguration
public class DBControllerout {
    @Autowired
    private JdbcTemplate jdbcTemplate;
//    ModelMap modelMap Controller向view传输的一个对象
    @RequestMapping("/hotwords")
    String getHotWords(ModelMap modelMap) {
        String sql = "select * from weibo_hot_words";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : list) {
            Set<Entry<String, Object>> entries = map.entrySet();
            if (entries != null) {
                Iterator<Entry<String, Object>> iterator = entries.iterator();
                while (iterator.hasNext()) {
                    Entry<String, Object> entry = (Entry<String, Object>) iterator
                            .next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    System.out.println(key + ":" + value);
                }
            }
        }
        
        modelMap.put("result", list);
        return "weibo_hotwords";
    }
    // 主方法，像一般的Java类一般去右击run as application时候，执行该方法
    public static void main(String[] args) throws Exception {
        SpringApplication.run(DBControllerout.class, args);
    }
}

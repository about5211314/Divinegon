package com.cn.divinegon.HelloController;

import com.cuit.springboot.gdao.StudentMapper;
import com.cuit.springboot.gentry.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 测试控制器
 *
 * @author: @沈立
 * @create: 2019-09-12-下午 16:46
 */
@Controller
public class HelloController {
    @Autowired
    private StudentMapper studentMapper;
    private List<Student> listStudent = null;

    @RequestMapping("/index")
    public String hello() {
        return "index";
    }

    @RequestMapping("/userList")
    public String userList(ModelMap map) {
        listStudent = studentMapper.selectAll();
        map.addAttribute("listStudent", listStudent);
        return "user/user";
    }

    @RequestMapping("/userEdit")
    public String userEdit(int id, ModelMap map) {
        Student obj = studentMapper.selectByPrimaryKey(id);
        map.addAttribute("userName", obj.getUser_name());
        map.addAttribute("classes", obj.getClass_es());
        return "user/userEdit";
    }

    @RequestMapping("/userNew")
    public String userNew() {
        return "user/userNew";
    }

    @RequestMapping("/add")
    public String add(@RequestParam("ids") String ids) {
        System.out.println(ids);
        return "success";
    }
}

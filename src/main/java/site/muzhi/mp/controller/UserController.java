package site.muzhi.mp.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import site.muzhi.mp.domain.entity.User;
import site.muzhi.mp.service.IUserService;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lichuang
 * @since 2020-01-09
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 查询全部
     *
     * @return
     */
    @GetMapping("/user/list")
    public List<User> list() {
        return userService.list();
    }

    /**
     * 查询单个
     *
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    public User getById(@PathVariable(name = "id") Integer id) {
        return userService.getById(id);
    }

    @GetMapping("/user/map/{id}")
    public User getByMap(@PathVariable(name = "id") Integer id) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("id", id);
        return userService.getOne(wrapper);
    }
}

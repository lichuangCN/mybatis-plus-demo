package site.muzhi.mp.service.impl;

import site.muzhi.mp.domain.entity.User;
import site.muzhi.mp.mapper.UserMapper;
import site.muzhi.mp.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lichuang
 * @since 2020-01-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}

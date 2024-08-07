package com.swpu.userserver.user.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.swpu.userserver.user.dto.UserDTO;
import com.swpu.userserver.user.dto.LoginUser;
import com.swpu.userserver.user.dto.QueryPageUser;
import com.swpu.userserver.user.entity.Permission;
import com.swpu.userserver.user.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.swpu.userserver.user.vo.UserPermTree;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>

 */
public interface UserService extends IService<User> {

    User login(LoginUser loginUser);

    List<Permission> getPermissions(Integer userId);

    /**
     * 根据用户id查询主页面菜单
     * @param param
     * @return
     */
    List<UserPermTree> getUserPermTreeByUserId(Map<String , Object> param);

    Page<User> getPageUser(QueryPageUser queryPageUser);

    String saveUserImg(MultipartFile multipartFile);

    boolean addUser(UserDTO userDTO);

    boolean updateUser(UserDTO userDTO);

    String getVcode();

    boolean getUserVcoe(String vcode);

    User getUserByUsername(String username);

    List<String> getPermListByUserId(Map<String , Object> param);
}

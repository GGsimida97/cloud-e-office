package com.xxxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.server.pojo.Admin;
import com.xxxx.server.pojo.RespBean;
import com.xxxx.server.pojo.Role;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhanglishen
 * @since 2020-11-14
 */
public interface IAdminService extends IService<Admin> {

    //登录之后返回token
    RespBean login(String username, String password, String code, HttpServletRequest request);

    //根据用户名获取用户信息
    Admin getAdminByUserName(String username);

    /**
     * 根据用户ID查询角色列表
     * @param adminId
     * @return
     */
    List<Role> getRolesByAdminId(Integer adminId);
}
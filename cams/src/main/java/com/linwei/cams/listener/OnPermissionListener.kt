package com.linwei.cams.listener

/**
 * ---------------------------------------------------------------------
 * @Author: WeiShuai
 * @Time: 2019/10/14
 * @Contact: linwei9605@gmail.com
 * @Github: https://github.com/WeiShuaiDev
 * @Description: 权限接口回调接口定义
 *-----------------------------------------------------------------------
 */
interface OnPermissionListener {
    fun onGranted()
    fun onDenied(deniedPermissions: List<String>)
}
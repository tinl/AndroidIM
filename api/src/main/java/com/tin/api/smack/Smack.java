package com.tin.api.smack;

import com.tin.api.exception.SmackException;

/**
 * Created by TIN on 2017/7/29.
 */

public interface Smack {

    /**
     * 登陆
     *
     * @param account 账号
     * @param password 密码
     * @return 是否登陆成功
     * @throws SmackException 抛出自定义异常，以便统一处理登陆失败的问题
     */
    public boolean login(String account, String password) throws SmackException;

    /**
     * 注销登陆
     *
     * @return 是否成功
     */
    public boolean logout();

    /**
     * 是否已经连接上服务器
     *
     * @return
     */
    public boolean isAuthenticated();

    /**
     * 添加好友
     *
     * @param user 好友id
     * @param alias 昵称
     * @param group 所在的分组
     * @throws SmackException
     */
    public void addRosterItem(String user, String alias, String group) throws SmackException;

    /**
     * 删除好友
     *
     * @param user 好友id
     * @throws SmackException
     */
    public void removeRosterItem(String user) throws SmackException;

    /**
     * 修改好友昵称
     *
     * @param user
     *            好友id
     * @param newName
     *            新昵称
     * @throws SmackException
     */
    public void renameRosterItem(String user, String newName) throws SmackException;

    /**
     * 移动好友到新分组
     *
     * @param user 好友id
     * @param group 新组名
     * @throws SmackException
     */
    public void moveRosterItemToGroup(String user, String group) throws SmackException;

    /**
     * 重命名分组
     *
     * @param group 之前的组名
     * @param newGroup 新组名
     */
    public void renameRosterGroup(String group, String newGroup);

    /**
     * 请求好友重新授权，用在添加好友失败时，重复添加 再次向对方发出申请
     *
     * @param user 好友id
     */
    public void requestAuthorizationForRosterItem(String user);

    /**
     * 添加新分组
     *
     * @param group
     */
    public void addRosterGroup(String group);

    /**
     * 设置当前在线状态
     */
    public void setStatusFromConfig();

    /**
     * 发送消息
     *
     * @param user
     * @param message
     */
    public void sendMessage(String user, String message);

    /**
     * 向服务器发送心跳包，保持长连接 通过一个闹钟控制，定时发送，
     */
    public void sendServerPing();

    /**
     * 从jid中获取好友名
     *
     * @param jid
     * @return
     */
    public String getNameForJID(String jid);


}

package io.iceproxy;

import io.iceproxy.v1.common.*;

import java.util.Map;


/**
 * Created by Administrator on 2016/5/1.
 */
public class Proxy extends  _ProxyDisp {

    public String getSalt(String userName, Ice.Current __current) {
        return "123";
    }

    public LoginResult login(LoginInfo loginInfo, ClientCallback client, Ice.Current __current) {
        return null;
    }

    public int httpGet(String url, Ice.Current __current) {
        return 0;
    }
}

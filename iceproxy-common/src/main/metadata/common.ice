[["java:package:io.iceproxy.v1"]]

module common {
	struct LoginInfo{
		string userName;
		string salt;
		string passwordAndSalt;
	};
	struct ServerInfo{
    		int status;
            int id;
    		int payload;
    };
	struct LoginResult{
	    int ret;
	    ServerInfo server;
	};
	struct HttpResponse{
	    string url;
	    string data;
	};
    interface ClientCallback{
        int httpGetResult(HttpResponse resp);
    };

	interface Proxy{
        string getSalt(string userName);
        LoginResult login(LoginInfo loginInfo, ClientCallback client);
        int httpGet(string url);
	};
};

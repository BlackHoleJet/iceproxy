// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.2
//
// <auto-generated>
//
// Generated from file `common.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package io.iceproxy.v1.common;

public class HttpResponse implements java.lang.Cloneable, java.io.Serializable
{
    public String url;

    public String data;

    public HttpResponse()
    {
        url = "";
        data = "";
    }

    public HttpResponse(String url, String data)
    {
        this.url = url;
        this.data = data;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        HttpResponse _r = null;
        if(rhs instanceof HttpResponse)
        {
            _r = (HttpResponse)rhs;
        }

        if(_r != null)
        {
            if(url != _r.url)
            {
                if(url == null || _r.url == null || !url.equals(_r.url))
                {
                    return false;
                }
            }
            if(data != _r.data)
            {
                if(data == null || _r.data == null || !data.equals(_r.data))
                {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 5381;
        __h = IceInternal.HashUtil.hashAdd(__h, "::common::HttpResponse");
        __h = IceInternal.HashUtil.hashAdd(__h, url);
        __h = IceInternal.HashUtil.hashAdd(__h, data);
        return __h;
    }

    public HttpResponse
    clone()
    {
        HttpResponse c = null;
        try
        {
            c = (HttpResponse)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeString(url);
        __os.writeString(data);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        url = __is.readString();
        data = __is.readString();
    }

    static public void
    __write(IceInternal.BasicStream __os, HttpResponse __v)
    {
        if(__v == null)
        {
            __nullMarshalValue.__write(__os);
        }
        else
        {
            __v.__write(__os);
        }
    }

    static public HttpResponse
    __read(IceInternal.BasicStream __is, HttpResponse __v)
    {
        if(__v == null)
        {
             __v = new HttpResponse();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final HttpResponse __nullMarshalValue = new HttpResponse();

    public static final long serialVersionUID = 940841126L;
}

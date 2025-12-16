package com.huawei.updatesdk.a.b.c.c;

import com.huawei.updatesdk.service.appmgr.bean.SDKNetTransmission;

/* loaded from: classes7.dex */
public class d extends b {
    public static final int ERROR = 1;
    public static final int NETWORK_ERROR = 3;

    /* renamed from: OK, reason: collision with root package name */
    public static final int f363795OK = 0;
    public static final int PROGUARD_ERROR = 6;
    public static final int REQ_PARAM_ERROR = 5;
    public static final int RTN_CODE_OK = 0;
    public static final int TIMEOUT = 2;
    private String reason;
    private int responseCode = 1;

    @SDKNetTransmission
    private int rtnCode = 0;
    private a errCause = a.NORMAL;
    private int httpRespondeCode = 0;

    public enum a {
        NORMAL,
        NO_NETWORK,
        JSON_ERROR,
        PARAM_ERROR,
        IO_EXCEPTION,
        CONNECT_EXCEPTION,
        UNKNOWN_EXCEPTION,
        NO_PROGUARD
    }

    public a a() {
        return this.errCause;
    }

    public int b() {
        return this.httpRespondeCode;
    }

    public String c() {
        return this.reason;
    }

    public int d() {
        return this.responseCode;
    }

    public boolean e() {
        return d() == 0 && this.rtnCode == 0;
    }

    public String toString() {
        return " {responseCode: " + d() + ",rtnCode_: " + this.rtnCode + ",errCause: " + a() + "}";
    }

    public void a(int i12) {
        this.httpRespondeCode = i12;
    }

    public void b(int i12) {
        this.responseCode = i12;
    }

    public void a(a aVar) {
        this.errCause = aVar;
    }

    public void a(String str) {
        this.reason = str;
    }
}

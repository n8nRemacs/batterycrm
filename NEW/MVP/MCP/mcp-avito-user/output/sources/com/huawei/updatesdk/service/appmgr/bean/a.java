package com.huawei.updatesdk.service.appmgr.bean;

import android.content.Context;

/* loaded from: classes7.dex */
public class a extends com.huawei.updatesdk.b.b.c {
    public static final String APIMETHOD = "client.getMarketInfo";

    @SDKNetTransmission
    private int deviceType;

    @SDKNetTransmission
    private int international;

    @SDKNetTransmission
    private String lang;

    @SDKNetTransmission
    private String marketPkg;

    /* renamed from: net, reason: collision with root package name */
    @SDKNetTransmission
    private int f363884net;

    @SDKNetTransmission
    private int sysBits;

    @SDKNetTransmission
    private String version;

    @SDKNetTransmission
    private String subsystem = "updatesdk";

    @SDKNetTransmission
    private String code = "0200";

    public a(String str) {
        a(APIMETHOD);
        this.marketPkg = str;
        this.sysBits = com.huawei.updatesdk.a.a.d.i.c.i();
        this.lang = com.huawei.updatesdk.a.a.d.i.c.f();
        b("8.0");
        Context contextA = com.huawei.updatesdk.a.b.a.a.c().a();
        this.version = com.huawei.updatesdk.a.a.d.i.c.g(contextA);
        this.deviceType = com.huawei.updatesdk.a.a.d.i.c.d();
        this.international = com.huawei.updatesdk.a.a.d.i.d.a();
        this.f363884net = com.huawei.updatesdk.a.a.d.j.a.c(contextA);
    }
}

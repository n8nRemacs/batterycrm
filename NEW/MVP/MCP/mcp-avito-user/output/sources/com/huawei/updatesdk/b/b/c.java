package com.huawei.updatesdk.b.b;

import android.content.Context;
import android.os.Build;
import com.huawei.updatesdk.service.appmgr.bean.SDKNetTransmission;

/* loaded from: classes7.dex */
public class c extends com.huawei.updatesdk.a.b.c.c.c {

    @SDKNetTransmission
    private String brand;

    @SDKNetTransmission
    private String buildNumber;

    @SDKNetTransmission
    private String density;

    @SDKNetTransmission
    private int emuiApiLevel;

    @SDKNetTransmission
    private String firmwareVersion;

    @SDKNetTransmission
    private int harmonyApiLevel;

    @SDKNetTransmission
    private int magicApiLevel;

    @SDKNetTransmission
    private String magicVer;

    @SDKNetTransmission
    private String manufacturer;

    @SDKNetTransmission
    private int odm;

    @SDKNetTransmission
    private String osBrand;

    @SDKNetTransmission
    private String phoneType;

    @SDKNetTransmission
    private String resolution;

    @SDKNetTransmission
    private String sdkVersion;

    /* renamed from: ts, reason: collision with root package name */
    @SDKNetTransmission
    private long f363824ts;

    public c() {
        this.emuiApiLevel = 0;
        Context contextA = com.huawei.updatesdk.a.b.a.a.c().a();
        this.f363824ts = System.currentTimeMillis();
        this.firmwareVersion = Build.VERSION.RELEASE.trim();
        this.buildNumber = com.huawei.updatesdk.a.a.d.i.c.c();
        com.huawei.updatesdk.b.c.c cVarA = com.huawei.updatesdk.b.c.b.a();
        this.phoneType = cVarA.e();
        this.density = com.huawei.updatesdk.a.a.d.i.c.e(contextA);
        this.resolution = com.huawei.updatesdk.a.a.d.i.c.d(contextA);
        this.emuiApiLevel = com.huawei.updatesdk.b.h.a.f().a();
        this.manufacturer = cVarA.d();
        this.brand = com.huawei.updatesdk.a.a.d.i.c.f363772c;
        this.odm = com.huawei.updatesdk.a.a.d.i.c.f363776g ? 1 : 0;
        this.sdkVersion = "4.0.1.300";
        this.harmonyApiLevel = com.huawei.updatesdk.a.a.d.i.c.f363777h;
        this.osBrand = com.huawei.updatesdk.a.a.d.i.c.f363778i;
        this.magicApiLevel = com.huawei.updatesdk.b.h.a.f().b();
        this.magicVer = com.huawei.updatesdk.b.h.a.f().c();
    }
}

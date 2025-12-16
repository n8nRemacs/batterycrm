package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.yd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39267yd {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private InterfaceC39219wd f382244a;

    public C39267yd(@j.N InterfaceC39219wd interfaceC39219wd) {
        this.f382244a = interfaceC39219wd;
    }

    public void a(@j.N InterfaceC39219wd interfaceC39219wd) {
        this.f382244a = interfaceC39219wd;
    }

    public boolean b(@j.N Context context) {
        if (this.f382244a.a("android.permission.READ_PHONE_STATE")) {
            return C39195vd.a(context, "android.permission.READ_PHONE_STATE");
        }
        return false;
    }

    public boolean c(@j.N Context context) {
        if (this.f382244a.a("android.permission.ACCESS_WIFI_STATE")) {
            return C39195vd.a(context, "android.permission.ACCESS_WIFI_STATE");
        }
        return false;
    }

    public boolean a(@j.N Context context) {
        if (this.f382244a.a("android.permission.ACCESS_COARSE_LOCATION")) {
            return C39195vd.a(context, "android.permission.ACCESS_COARSE_LOCATION");
        }
        return false;
    }
}

package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.PackageManager;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.h5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38845h5 extends X4 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final I1 f380677b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38698b8 f380678c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C38987mn f380679d;

    public C38845h5(@j.N L3 l32) {
        this(l32, l32.x(), F0.g().k(), new C38987mn());
    }

    @Override // com.yandex.metrica.impl.ob.S4
    public boolean a(@j.N C38715c0 c38715c0) {
        String strA;
        L3 l3A = a();
        if (this.f380678c.l()) {
            return false;
        }
        C38715c0 c38715c0E = l3A.m().P() ? C38715c0.e(c38715c0) : C38715c0.c(c38715c0);
        JSONObject jSONObject = new JSONObject();
        C38987mn c38987mn = this.f380679d;
        Context contextG = l3A.g();
        String strB = l3A.e().b();
        c38987mn.getClass();
        JSONObject jSONObject2 = null;
        try {
            PackageManager packageManager = contextG.getPackageManager();
            strA = A2.a(30) ? C39012nn.a(packageManager, strB) : packageManager.getInstallerPackageName(strB);
        } catch (Throwable unused) {
            strA = null;
        }
        if (strA == null) {
            strA = "";
        }
        try {
            jSONObject.put("appInstaller", strA);
            C38779ee c38779eeB = this.f380677b.b();
            if (c38779eeB.f380483c) {
                jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("trackingId", c38779eeB.f380481a);
                    if (c38779eeB.f380482b.length() > 0) {
                        jSONObject2.put("additionalParams", c38779eeB.f380482b);
                    }
                } catch (Throwable unused2) {
                }
            }
            jSONObject.put("preloadInfo", jSONObject2);
        } catch (Throwable unused3) {
        }
        l3A.r().b(c38715c0E.f(jSONObject.toString()));
        this.f380678c.b(true);
        return false;
    }

    @j.k0
    public C38845h5(@j.N L3 l32, @j.N C38698b8 c38698b8, @j.N I1 i12, @j.N C38987mn c38987mn) {
        super(l32);
        this.f380678c = c38698b8;
        this.f380677b = i12;
        this.f380679d = c38987mn;
    }
}

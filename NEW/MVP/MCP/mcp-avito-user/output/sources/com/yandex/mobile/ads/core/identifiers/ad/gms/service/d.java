package com.yandex.mobile.ads.core.identifiers.ad.gms.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.yandex.mobile.ads.impl.k11;
import com.yandex.mobile.ads.impl.s8;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final Context f382692a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final k11 f382693b = new k11();

    /* renamed from: c, reason: collision with root package name */
    @N
    private final e f382694c = new e();

    /* renamed from: d, reason: collision with root package name */
    @N
    private final f f382695d = new f();

    public d(@N Context context) {
        this.f382692a = context.getApplicationContext();
    }

    @P
    public final s8 a() {
        ResolveInfo resolveInfoResolveService;
        this.f382695d.getClass();
        Intent intentA = f.a();
        k11 k11Var = this.f382693b;
        Context context = this.f382692a;
        k11Var.getClass();
        s8 s8VarA = null;
        try {
            resolveInfoResolveService = context.getPackageManager().resolveService(intentA, 0);
        } catch (Throwable unused) {
            resolveInfoResolveService = null;
        }
        if (resolveInfoResolveService == null) {
            return null;
        }
        try {
            c cVar = new c();
            if (!this.f382692a.bindService(intentA, cVar, 1)) {
                return null;
            }
            s8VarA = this.f382694c.a(cVar);
            this.f382692a.unbindService(cVar);
            return s8VarA;
        } catch (Throwable unused2) {
            return s8VarA;
        }
    }
}

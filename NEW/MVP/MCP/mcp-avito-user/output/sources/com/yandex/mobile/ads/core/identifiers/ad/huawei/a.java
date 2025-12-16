package com.yandex.mobile.ads.core.identifiers.ad.huawei;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.yandex.mobile.ads.impl.k11;
import com.yandex.mobile.ads.impl.s8;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final Context f382699a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final k11 f382700b = new k11();

    /* renamed from: c, reason: collision with root package name */
    @N
    private final c f382701c = new c();

    /* renamed from: d, reason: collision with root package name */
    @N
    private final d f382702d = new d();

    public a(@N Context context) {
        this.f382699a = context.getApplicationContext();
    }

    @P
    public final s8 a() {
        ResolveInfo resolveInfoResolveService;
        this.f382702d.getClass();
        Intent intentA = d.a();
        k11 k11Var = this.f382700b;
        Context context = this.f382699a;
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
            b bVar = new b();
            if (!this.f382699a.bindService(intentA, bVar, 1)) {
                return null;
            }
            s8VarA = this.f382701c.a(bVar);
            this.f382699a.unbindService(bVar);
            return s8VarA;
        } catch (Throwable unused2) {
            return s8VarA;
        }
    }
}

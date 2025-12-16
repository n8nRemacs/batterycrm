package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import kotlin.jvm.internal.N;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f377718a;

    /* renamed from: b, reason: collision with root package name */
    public final N f377719b;

    /* renamed from: c, reason: collision with root package name */
    public final String f377720c;

    /* renamed from: d, reason: collision with root package name */
    public final w f377721d;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@Y61.k Intent intent, @Y61.k Y41.l lVar, @Y61.k String str) {
        d dVar = new d(intent);
        w wVar = new w();
        this.f377718a = dVar;
        this.f377719b = (N) lVar;
        this.f377720c = str;
        this.f377721d = wVar;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [Y41.l, kotlin.jvm.internal.N] */
    public final Object a(@Y61.k Context context) throws j {
        ResolveInfo resolveInfoResolveService;
        Intent intent = this.f377718a.f377715b;
        this.f377721d.getClass();
        IBinder iBinder = null;
        try {
            resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
        } catch (Throwable unused) {
            resolveInfoResolveService = null;
        }
        if (resolveInfoResolveService == null) {
            throw new m(AK.c.s(new StringBuilder("could not resolve "), this.f377720c, " services"));
        }
        try {
            d dVar = this.f377718a;
            if (context.bindService(dVar.f377715b, dVar, 1)) {
                d dVar2 = this.f377718a;
                if (dVar2.f377716c == null) {
                    synchronized (dVar2.f377717d) {
                        if (dVar2.f377716c == null) {
                            try {
                                dVar2.f377717d.wait(3000L);
                            } catch (InterruptedException unused2) {
                            }
                        }
                    }
                }
                iBinder = dVar2.f377716c;
            }
        } catch (Throwable unused3) {
        }
        if (iBinder != null) {
            return this.f377719b.invoke(iBinder);
        }
        throw new j(AK.c.s(new StringBuilder("could not bind to "), this.f377720c, " services"));
    }

    public final void b(@Y61.k Context context) {
        try {
            this.f377718a.a(context);
        } catch (Throwable unused) {
        }
    }
}

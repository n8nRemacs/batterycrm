package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;

@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes8.dex */
public final class da0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f384544f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static volatile da0 f384545g;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f384546a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ga0 f384547b = new ga0();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final fa0 f384548c = new fa0();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final q21 f384549d = q21.b();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final e31 f384550e = new e31();

    private da0(@j.N Context context) {
        this.f384546a = context.getApplicationContext();
    }

    @j.N
    public static da0 a(@j.N Context context) {
        if (f384545g == null) {
            synchronized (f384544f) {
                try {
                    if (f384545g == null) {
                        f384545g = new da0(context);
                    }
                } finally {
                }
            }
        }
        return f384545g;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.location.Location a() {
        /*
            r4 = this;
            java.lang.Object r0 = com.yandex.mobile.ads.impl.da0.f384544f
            monitor-enter(r0)
            com.yandex.mobile.ads.impl.q21 r1 = r4.f384549d     // Catch: java.lang.Throwable -> L4b
            boolean r1 = r1.f()     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L73
            com.yandex.mobile.ads.impl.e31 r1 = r4.f384550e     // Catch: java.lang.Throwable -> L4b
            android.content.Context r2 = r4.f384546a     // Catch: java.lang.Throwable -> L4b
            r1.getClass()     // Catch: java.lang.Throwable -> L4b
            boolean r1 = com.yandex.mobile.ads.impl.e31.a(r2)     // Catch: java.lang.Throwable -> L4b
            if (r1 != 0) goto L73
            com.yandex.mobile.ads.impl.fa0 r1 = r4.f384548c     // Catch: java.lang.Throwable -> L4b
            android.content.Context r2 = r4.f384546a     // Catch: java.lang.Throwable -> L4b
            r1.getClass()     // Catch: java.lang.Throwable -> L4b
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4b
            r1.<init>()     // Catch: java.lang.Throwable -> L4b
            com.yandex.mobile.ads.impl.s80 r3 = new com.yandex.mobile.ads.impl.s80     // Catch: java.lang.Throwable -> L4b
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L4b
            r1.add(r3)     // Catch: java.lang.Throwable -> L4b
            com.yandex.mobile.ads.impl.q21 r3 = com.yandex.mobile.ads.impl.q21.b()     // Catch: java.lang.Throwable -> L4b
            com.yandex.mobile.ads.impl.v11 r3 = r3.a(r2)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L4d
            boolean r3 = r3.I()     // Catch: java.lang.Throwable -> L4b
            if (r3 != 0) goto L4d
            com.yandex.mobile.ads.impl.ea0 r3 = com.yandex.mobile.ads.impl.wy.a(r2)     // Catch: java.lang.Throwable -> L4b
            r1.add(r3)     // Catch: java.lang.Throwable -> L4b
            com.yandex.mobile.ads.impl.ea0 r2 = com.yandex.mobile.ads.impl.kz.a(r2)     // Catch: java.lang.Throwable -> L4b
            r1.add(r2)     // Catch: java.lang.Throwable -> L4b
            goto L4d
        L4b:
            r1 = move-exception
            goto L76
        L4d:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4b
            r2.<init>()     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L4b
        L56:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L6c
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L4b
            com.yandex.mobile.ads.impl.ea0 r3 = (com.yandex.mobile.ads.impl.ea0) r3     // Catch: java.lang.Throwable -> L4b
            android.location.Location r3 = r3.a()     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L56
            r2.add(r3)     // Catch: java.lang.Throwable -> L4b
            goto L56
        L6c:
            com.yandex.mobile.ads.impl.ga0 r1 = r4.f384547b     // Catch: java.lang.Throwable -> L4b
            android.location.Location r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L4b
            goto L74
        L73:
            r1 = 0
        L74:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
            return r1
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.da0.a():android.location.Location");
    }
}

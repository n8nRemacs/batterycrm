package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes7.dex */
public class H2 {

    /* renamed from: l, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile H2 f378227l;

    /* renamed from: m, reason: collision with root package name */
    private static final Object f378228m = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Context f378229a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final WifiManager f378230b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private C39267yd f378231c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private Ed f378232d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private C38837gm f378233e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private InterfaceC38961lm<Context, Intent, Void> f378234f;

    /* renamed from: g, reason: collision with root package name */
    private C39057pi f378235g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC39291zd f378236h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC39291zd f378237i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final I2 f378238j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private final J2 f378239k;

    private H2(@j.N Context context, @j.P WifiManager wifiManager, @j.N Ed ed2) {
        this(context, wifiManager, ed2, new C39267yd(ed2.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.yandex.metrica.impl.ob.F2> c() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.H2.c():java.util.List");
    }

    public static H2 a(Context context) {
        if (f378227l == null) {
            synchronized (f378228m) {
                try {
                    if (f378227l == null) {
                        Context applicationContext = context.getApplicationContext();
                        f378227l = new H2(applicationContext, (WifiManager) applicationContext.getApplicationContext().getSystemService("wifi"), new Ed());
                    }
                } finally {
                }
            }
        }
        return f378227l;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.List<com.yandex.metrica.impl.ob.F2> b() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.yd r0 = r2.f378231c     // Catch: java.lang.Throwable -> L2d
            android.content.Context r1 = r2.f378229a     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.c(r1)     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto Ld
            r0 = 0
            goto L25
        Ld:
            android.net.wifi.WifiManager r0 = r2.f378230b     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L1c
            boolean r0 = r0.isWifiEnabled()     // Catch: java.lang.Throwable -> L1c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 != 0) goto L20
            goto L21
        L20:
            r1 = r0
        L21:
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Throwable -> L2d
        L25:
            if (r0 != 0) goto L2f
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)
            return r0
        L2d:
            r0 = move-exception
            goto L35
        L2f:
            java.util.List r0 = r2.c()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)
            return r0
        L35:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.H2.b():java.util.List");
    }

    private H2(@j.N Context context, @j.P WifiManager wifiManager, @j.N Ed ed2, @j.N C39267yd c39267yd) {
        this(context, wifiManager, ed2, new C38837gm(), c39267yd, new G1(), new I2(), F0.g().h().d());
    }

    @j.k0
    public H2(Context context, @j.P WifiManager wifiManager, @j.N Ed ed2, @j.N C38837gm c38837gm, @j.N C39267yd c39267yd, @j.N G1 g12, @j.N I2 i22, @j.N J2 j22) {
        this.f378229a = context;
        this.f378230b = wifiManager;
        this.f378232d = ed2;
        this.f378231c = c39267yd;
        this.f378236h = g12.d(c39267yd);
        this.f378237i = g12.e(c39267yd);
        this.f378233e = c38837gm;
        this.f378238j = i22;
        this.f378239k = j22;
    }

    public void a(@j.N C39057pi c39057pi) {
        this.f378235g = c39057pi;
        this.f378232d.a(c39057pi);
        this.f378231c.a(this.f378232d.a());
        if (c39057pi.d() != null) {
            I2 i22 = this.f378238j;
            Ph phD = c39057pi.d();
            i22.f378159a.a(phD.f379214b, i22.a(phD));
        }
    }

    public void a(boolean z12) {
        this.f378232d.a(z12);
        this.f378231c.a(this.f378232d.a());
    }

    @SuppressLint({"MissingPermission"})
    public synchronized boolean a(@j.N CountDownLatch countDownLatch, @j.N V v12) {
        Boolean boolValueOf;
        try {
            if (!this.f378237i.a(this.f378229a)) {
                return false;
            }
            if (this.f378234f == null) {
                this.f378234f = new G2(this, v12, countDownLatch);
            }
            this.f378239k.a(this.f378234f);
            WifiManager wifiManager = this.f378230b;
            if (wifiManager != null) {
                try {
                    boolValueOf = Boolean.valueOf(wifiManager.startScan());
                } catch (Throwable unused) {
                }
            } else {
                boolValueOf = null;
            }
            return Boolean.TRUE.equals(boolValueOf);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @j.N
    public I2 a() {
        return this.f378238j;
    }
}

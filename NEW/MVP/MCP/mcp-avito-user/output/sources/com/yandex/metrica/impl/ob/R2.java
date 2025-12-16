package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import j.InterfaceC42148d;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes7.dex */
public class R2 implements O0 {

    /* renamed from: f, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    @j.P
    private static volatile R2 f379273f = null;

    /* renamed from: g, reason: collision with root package name */
    private static volatile boolean f379274g = false;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f379275a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Q2 f379276b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final FutureTask<T0> f379277c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final S0 f379278d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final Im f379279e;

    public class a implements Callable<T0> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public T0 call() {
            return R2.a(R2.this);
        }
    }

    private R2(@j.N Context context, @j.N Q2 q22, @j.N Im im2) {
        this(context, q22, q22.a(context, im2), im2);
    }

    @j.N
    @InterfaceC42148d
    public static R2 a(@j.N Context context) {
        if (f379273f == null) {
            synchronized (R2.class) {
                try {
                    if (f379273f == null) {
                        f379273f = new R2(context.getApplicationContext(), new Q2(), P.g().d());
                        R2 r22 = f379273f;
                        r22.f379279e.b().execute(new S2(r22));
                    }
                } finally {
                }
            }
        }
        return f379273f;
    }

    @InterfaceC42148d
    private static InterfaceC38990n1 f() {
        return i() ? f379273f.g() : P.g().f();
    }

    @j.N
    @InterfaceC42148d
    private T0 g() {
        try {
            return this.f379277c.get();
        } catch (Exception e12) {
            throw new RuntimeException(e12);
        }
    }

    @InterfaceC42148d
    public static synchronized boolean h() {
        return f379274g;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    @j.InterfaceC42148d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean i() {
        /*
            java.lang.Class<com.yandex.metrica.impl.ob.R2> r0 = com.yandex.metrica.impl.ob.R2.class
            monitor-enter(r0)
            com.yandex.metrica.impl.ob.R2 r1 = com.yandex.metrica.impl.ob.R2.f379273f     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L21
            com.yandex.metrica.impl.ob.R2 r1 = com.yandex.metrica.impl.ob.R2.f379273f     // Catch: java.lang.Throwable -> L1f
            java.util.concurrent.FutureTask<com.yandex.metrica.impl.ob.T0> r1 = r1.f379277c     // Catch: java.lang.Throwable -> L1f
            boolean r1 = r1.isDone()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L21
            com.yandex.metrica.impl.ob.R2 r1 = com.yandex.metrica.impl.ob.R2.f379273f     // Catch: java.lang.Throwable -> L1f
            com.yandex.metrica.impl.ob.T0 r1 = r1.g()     // Catch: java.lang.Throwable -> L1f
            com.yandex.metrica.impl.ob.k1 r1 = r1.d()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L21
            r1 = 1
            goto L22
        L1f:
            r1 = move-exception
            goto L24
        L21:
            r1 = 0
        L22:
            monitor-exit(r0)
            return r1
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.R2.i():boolean");
    }

    @InterfaceC42148d
    public static synchronized void j() {
        f379274g = true;
    }

    @j.P
    @InterfaceC42148d
    public static R2 k() {
        return f379273f;
    }

    @j.P
    @j.l0
    public C38915k1 d() {
        return g().d();
    }

    @j.N
    @InterfaceC42148d
    public Eb e() {
        return this.f379278d.d();
    }

    @j.l0
    public static void b(boolean z12) {
        f().a(z12);
    }

    @j.l0
    public static void c(boolean z12) {
        f().setStatisticsSending(z12);
    }

    @j.k0
    public R2(@j.N Context context, @j.N Q2 q22, @j.N S0 s02, @j.N Im im2) {
        this.f379275a = context;
        this.f379276b = q22;
        this.f379278d = s02;
        this.f379279e = im2;
        FutureTask<T0> futureTask = new FutureTask<>(new a());
        this.f379277c = futureTask;
        im2.b().execute(futureTask);
    }

    @InterfaceC42148d
    public void b(@j.N com.yandex.metrica.j jVar) {
        this.f379278d.a(jVar, this);
    }

    @j.l0
    public void c(@j.N com.yandex.metrica.f fVar) {
        g().c(fVar);
    }

    @j.l0
    public void b(@j.N YandexMetricaConfig yandexMetricaConfig, @j.N com.yandex.metrica.j jVar) {
        g().a(yandexMetricaConfig, jVar);
    }

    @j.P
    @InterfaceC42148d
    public String c() {
        return g().c();
    }

    @j.l0
    public void b(@j.N AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        g().a(appMetricaDeviceIDListener);
    }

    @Override // com.yandex.metrica.impl.ob.O0
    @j.N
    public N0 b() {
        return g().b();
    }

    @j.l0
    public static void a(@j.P Location location) {
        f().a(location);
    }

    @j.l0
    public static void a(boolean z12) {
        f().b(z12);
    }

    @j.l0
    public static void a(String str, String str2) {
        f().c(str, str2);
    }

    @j.l0
    public static void a(@j.P String str) {
        f().setUserProfileID(str);
    }

    @j.l0
    public void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        g().a(deferredDeeplinkParametersListener);
    }

    @j.l0
    public void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        g().a(deferredDeeplinkListener);
    }

    @j.N
    @j.l0
    public M0 a(@j.N com.yandex.metrica.f fVar) {
        return g().a(fVar);
    }

    @j.P
    @InterfaceC42148d
    public String a() {
        return g().a();
    }

    @j.l0
    public void a(@j.N IIdentifierCallback iIdentifierCallback, @j.N List<String> list) {
        g().a(iIdentifierCallback, list);
    }

    @j.l0
    public void a(@j.P Map<String, Object> map) {
        this.f379278d.a(map);
    }

    public static T0 a(R2 r22) {
        return r22.f379276b.a(r22.f379275a, r22.f379278d);
    }
}

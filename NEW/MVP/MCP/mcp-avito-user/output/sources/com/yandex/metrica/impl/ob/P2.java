package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Handler;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.core.api.executors.IHandlerExecutor;
import com.yandex.metrica.impl.ob.C39241xb;
import com.yandex.metrica.impl.ob.Z0;
import j.InterfaceC42148d;
import java.util.Arrays;
import java.util.Map;

@InterfaceC42148d
/* loaded from: classes7.dex */
public class P2 implements S0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f379147a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Handler f379148b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Q f379149c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C39241xb f379150d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f379151e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final C39157u f379152f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private volatile C1 f379153g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private AbstractC39260y6 f379154h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.rtm.wrapper.e f379155i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final C38841h1 f379156j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f379157k;

    public P2(@j.N Context context, @j.N Im im2) {
        this(context.getApplicationContext(), im2.b(), im2.a());
    }

    private void e() {
        if (!Z0.a("com.yandex.metrica.CounterConfiguration")) {
            throw new Z0.a("\nClass com.yandex.metrica.CounterConfiguration isn't found.\nPerhaps this is due to obfuscation.\nIf you build your application with ProGuard,\nyou need to keep the Metrica for Apps.\nPlease try to use the following lines of code:\n##########################################\n-keep class com.yandex.metrica.** { *; }\n-dontwarn com.yandex.metrica.**\n##########################################");
        }
        this.f379151e.execute(new Yl(this.f379147a));
    }

    @Override // com.yandex.metrica.impl.ob.S0
    public synchronized void a(@j.N com.yandex.metrica.j jVar, @j.N O0 o02) {
        try {
            if (!this.f379157k) {
                Boolean bool = jVar.crashReporting;
                Boolean bool2 = Boolean.TRUE;
                if (bool == null) {
                    bool = bool2;
                }
                if (bool.booleanValue() && this.f379153g == null) {
                    Xg xg2 = new Xg(this.f379155i);
                    C6 c62 = new C6(this.f379147a, new C39256y2(o02, "20799a27-fa80-4b36-b2db-0f8141f24180"), new M2(this), (com.yandex.metrica.d) null);
                    C6 c63 = new C6(this.f379147a, new C39256y2(o02, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"), new N2(this), (com.yandex.metrica.d) null);
                    if (this.f379154h == null) {
                        this.f379154h = new C6(this.f379147a, new C38866i1(o02, jVar), new O2(this), (com.yandex.metrica.d) null);
                    }
                    this.f379153g = new C1(Thread.getDefaultUncaughtExceptionHandler(), Arrays.asList(xg2, c62, c63, this.f379154h), P.g().j(), new C38868i3(), new C38917k3());
                    Thread.setDefaultUncaughtExceptionHandler(this.f379153g);
                }
                Boolean bool3 = jVar.appOpenTrackingEnabled;
                if (bool3 != null) {
                    bool2 = bool3;
                }
                if (bool2.booleanValue()) {
                    this.f379152f.a();
                }
                this.f379157k = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.yandex.metrica.impl.ob.S0
    @j.N
    public ICommonExecutor b() {
        return this.f379151e;
    }

    @Override // com.yandex.metrica.impl.ob.S0
    @j.N
    public Handler c() {
        return this.f379148b;
    }

    @Override // com.yandex.metrica.impl.ob.S0
    @j.N
    public Eb d() {
        return this.f379150d;
    }

    private P2(@j.N Context context, @j.N IHandlerExecutor iHandlerExecutor, @j.N ICommonExecutor iCommonExecutor) {
        this(context, new C39241xb(new C39241xb.c(), new C39241xb.e(), new C39241xb.e(), iHandlerExecutor, "Client"), iHandlerExecutor, new Q(), new C39157u(iCommonExecutor), new Zg(), new C38841h1());
    }

    @j.k0
    public P2(@j.N Context context, @j.N C39241xb c39241xb, @j.N IHandlerExecutor iHandlerExecutor, @j.N Q q12, @j.N C39157u c39157u, @j.N Zg zg2, @j.N C38841h1 c38841h1) {
        this.f379157k = false;
        this.f379147a = context;
        this.f379151e = iHandlerExecutor;
        this.f379152f = c39157u;
        this.f379156j = c38841h1;
        Vl.a(context);
        C38842h2.b();
        this.f379150d = c39241xb;
        c39241xb.c(context);
        this.f379148b = iHandlerExecutor.getHandler();
        this.f379149c = q12;
        q12.a();
        this.f379155i = zg2.a(context);
        e();
    }

    @Override // com.yandex.metrica.impl.ob.S0
    public void a(@j.P Map<String, Object> map) {
        this.f379156j.a(map);
    }

    @Override // com.yandex.metrica.impl.ob.S0
    @j.N
    public C39157u a() {
        return this.f379152f;
    }
}

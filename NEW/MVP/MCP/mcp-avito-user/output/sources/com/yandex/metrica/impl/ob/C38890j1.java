package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.c;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.C38664a;
import com.yandex.metrica.impl.ob.C39062q;
import com.yandex.metrica.impl.ob.r;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.j1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38890j1 extends B implements K0 {

    /* renamed from: y, reason: collision with root package name */
    private static final Kn<String> f380803y = new Hn(new Fn("Referral url"));

    /* renamed from: z, reason: collision with root package name */
    private static final Long f380804z = Long.valueOf(TimeUnit.SECONDS.toMillis(5));

    /* renamed from: p, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.c f380805p;

    /* renamed from: q, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.j f380806q;

    /* renamed from: r, reason: collision with root package name */
    @j.N
    private final C38858hi f380807r;

    /* renamed from: s, reason: collision with root package name */
    @j.N
    private C38664a f380808s;

    /* renamed from: t, reason: collision with root package name */
    @j.N
    private final C39179ul f380809t;

    /* renamed from: u, reason: collision with root package name */
    @j.N
    private final r f380810u;

    /* renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f380811v;

    /* renamed from: w, reason: collision with root package name */
    private final C38917k3 f380812w;

    /* renamed from: x, reason: collision with root package name */
    @j.N
    private final C38896j7 f380813x;

    /* renamed from: com.yandex.metrica.impl.ob.j1$a */
    public class a implements C38664a.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ICommonExecutor f380814a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C38766e1 f380815b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C39256y2 f380816c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C39256y2 f380817d;

        /* renamed from: com.yandex.metrica.impl.ob.j1$a$a, reason: collision with other inner class name */
        public class RunnableC10958a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C39212w6 f380819a;

            public RunnableC10958a(C39212w6 c39212w6) {
                this.f380819a = c39212w6;
            }

            @Override // java.lang.Runnable
            public void run() {
                C38890j1.this.a(this.f380819a);
                if (a.this.f380815b.a(this.f380819a.f382099a.f378037f)) {
                    a.this.f380816c.a().a(this.f380819a);
                }
                if (a.this.f380815b.b(this.f380819a.f382099a.f378037f)) {
                    a.this.f380817d.a().a(this.f380819a);
                }
            }
        }

        public a(ICommonExecutor iCommonExecutor, C38766e1 c38766e1, C39256y2 c39256y2, C39256y2 c39256y22) {
            this.f380814a = iCommonExecutor;
            this.f380815b = c38766e1;
            this.f380816c = c39256y2;
            this.f380817d = c39256y22;
        }

        @Override // com.yandex.metrica.impl.ob.C38664a.b
        public void a() {
            this.f380814a.execute(new RunnableC10958a(C38890j1.this.f380812w.a()));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.j1$b */
    public class b implements c.a {
        public b() {
        }

        @Override // com.yandex.metrica.c.a
        public void a() {
            C38890j1 c38890j1 = C38890j1.this;
            c38890j1.f377800i.a(c38890j1.f377793b.a());
        }

        @Override // com.yandex.metrica.c.a
        public void b() {
            C38890j1 c38890j1 = C38890j1.this;
            c38890j1.f377800i.b(c38890j1.f377793b.a());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.j1$c */
    public static class c {
        public C39179ul a(@j.N Context context, @j.N ICommonExecutor iCommonExecutor, @j.N C38699b9 c38699b9, @j.N C38890j1 c38890j1, @j.N C38858hi c38858hi) {
            return new C39179ul(context, c38699b9, c38890j1, iCommonExecutor, c38858hi.d());
        }
    }

    @j.k0
    @j.l0
    public C38890j1(@j.N Context context, @j.N A3 a32, @j.N com.yandex.metrica.j jVar, @j.N T1 t12, @j.N C38896j7 c38896j7, @j.N C38858hi c38858hi, @j.N C39256y2 c39256y2, @j.N C39256y2 c39256y22, @j.N C38699b9 c38699b9, @j.N P p12, @j.N A0 a02) {
        Q1 q12 = new Q1(a32, new CounterConfiguration(jVar, CounterConfiguration.b.MAIN), jVar.userProfileID);
        if (jVar.sessionTimeout == null) {
            TimeUnit.SECONDS.toMillis(10L);
        }
        this(context, jVar, t12, c38896j7, q12, new com.yandex.metrica.c(), c38858hi, new C38766e1(), p12.j(), c39256y2, c39256y22, c38699b9, p12.c(), a02, new c(), new r(), new Zg(), new Yg(jVar.appVersion, null), new C39116s6(a02), new X6(), new S6(), new M6(), new K6(), p12.k());
    }

    private void h() {
        this.f377800i.a(this.f377793b.a());
        this.f380805p.b(new b(), f380804z.longValue());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    public void a(boolean z12) {
    }

    @Override // com.yandex.metrica.impl.ob.K0
    public void b(@j.P Activity activity) {
        if (this.f380810u.a(activity, r.a.PAUSED)) {
            d(activity != null ? activity.getClass().getSimpleName() : null);
            this.f380805p.a();
            if (activity != null) {
                this.f380809t.a(activity);
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.B, com.yandex.metrica.impl.ob.InterfaceC38990n1
    public void c(String str, String str2) {
        super.c(str, str2);
        this.f380813x.a(this.f377793b.f379237c.a());
    }

    public final void g() {
        if (this.f380811v.compareAndSet(false, true)) {
            this.f380808s.c();
        }
    }

    @Override // com.yandex.metrica.impl.ob.K0
    public void a(@j.N String str, boolean z12) {
        if (this.f377794c.isEnabled()) {
            this.f377794c.i("App opened via deeplink: " + f(str));
        }
        this.f377800i.a(C39278z0.a("open", str, z12, this.f377794c), this.f377793b);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    public void b(boolean z12) {
        this.f377793b.b().g(z12);
    }

    @Override // com.yandex.metrica.impl.ob.El
    public void b(@j.N JSONObject jSONObject) {
        T1 t12 = this.f377800i;
        C38737cm c38737cm = this.f377794c;
        List<Integer> list = C39278z0.f382293i;
        t12.a(new J(jSONObject.toString(), "view_tree", EnumC38666a1.EVENT_TYPE_VIEW_TREE.b(), 0, c38737cm), this.f377793b);
    }

    @j.k0
    @j.l0
    public C38890j1(@j.N Context context, @j.N com.yandex.metrica.j jVar, @j.N T1 t12, @j.N C38896j7 c38896j7, @j.N Q1 q12, @j.N com.yandex.metrica.c cVar, @j.N C38858hi c38858hi, @j.N C38766e1 c38766e1, @j.N InterfaceC38712bm interfaceC38712bm, @j.N C39256y2 c39256y2, @j.N C39256y2 c39256y22, @j.N C38699b9 c38699b9, @j.N ICommonExecutor iCommonExecutor, @j.N A0 a02, @j.N c cVar2, @j.N r rVar, @j.N Zg zg2, @j.N Yg yg2, @j.N C39116s6 c39116s6, @j.N X6 x62, @j.N S6 s62, @j.N M6 m62, @j.N K6 k62, @j.N C39294zg c39294zg) {
        super(context, t12, q12, a02, interfaceC38712bm, zg2.a(t12.b(), jVar.apiKey, true), yg2, x62, s62, m62, k62, c39116s6);
        this.f380811v = new AtomicBoolean(false);
        this.f380812w = new C38917k3();
        this.f377793b.a(a(jVar));
        this.f380805p = cVar;
        this.f380813x = c38896j7;
        this.f380806q = jVar;
        this.f380810u = rVar;
        C39179ul c39179ulA = cVar2.a(context, iCommonExecutor, c38699b9, this, c38858hi);
        this.f380809t = c39179ulA;
        this.f380807r = c38858hi;
        c38858hi.a(c39179ulA);
        a(jVar.nativeCrashReporting, this.f377793b);
        context.getApplicationContext();
        c38858hi.b();
        Bg bg2 = Bg.f377852b;
        this.f380808s = a(iCommonExecutor, c38766e1, c39256y2, c39256y22);
        if (C38689b.a(jVar.f382349h)) {
            g();
        }
        h();
    }

    @Override // com.yandex.metrica.impl.ob.K0
    public void a(@j.N String str) {
        ((Hn) f380803y).a(str);
        this.f377800i.a(C39278z0.a("referral", str, false, this.f377794c), this.f377793b);
        if (this.f377794c.isEnabled()) {
            this.f377794c.i("Referral URL received: " + f(str));
        }
    }

    @Override // com.yandex.metrica.impl.ob.K0
    public void a(@j.N C39062q.c cVar) {
        if (cVar == C39062q.c.WATCHING) {
            if (this.f377794c.isEnabled()) {
                this.f377794c.i("Enable activity auto tracking");
            }
        } else if (this.f377794c.isEnabled()) {
            this.f377794c.w("Could not enable activity auto tracking. " + cVar.f381401a);
        }
    }

    @Override // com.yandex.metrica.impl.ob.K0
    public void a(@j.P Activity activity) {
        if (this.f380810u.a(activity, r.a.RESUMED)) {
            e(activity != null ? activity.getClass().getSimpleName() : null);
            this.f380805p.c();
            if (activity != null) {
                this.f380809t.b(activity);
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    public void a(@j.P Location location) {
        this.f377793b.b().d(location);
        if (this.f377794c.isEnabled()) {
            this.f377794c.fi("Set location: %s", location);
        }
    }

    @j.N
    private C38664a a(@j.N ICommonExecutor iCommonExecutor, @j.N C38766e1 c38766e1, @j.N C39256y2 c39256y2, @j.N C39256y2 c39256y22) {
        return new C38664a(new a(iCommonExecutor, c38766e1, c39256y2, c39256y22));
    }

    @Override // com.yandex.metrica.impl.ob.El
    public void a(@j.N JSONObject jSONObject) {
        T1 t12 = this.f377800i;
        C38737cm c38737cm = this.f377794c;
        List<Integer> list = C39278z0.f382293i;
        t12.a(new J(jSONObject.toString(), "view_tree", EnumC38666a1.EVENT_TYPE_RAW_VIEW_TREE.b(), 0, c38737cm), this.f377793b);
    }

    @Override // com.yandex.metrica.impl.ob.K0
    public void a(@j.N InterfaceC38960ll interfaceC38960ll, boolean z12) {
        this.f380809t.a(interfaceC38960ll, z12);
    }

    @Override // com.yandex.metrica.impl.ob.K0
    public void a(@j.N D2 d22) {
        d22.a(this.f377794c);
    }

    @j.l0
    private void a(@j.P Boolean bool, Q1 q12) {
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        this.f380813x.a(bool.booleanValue(), q12.b().c(), q12.f379237c.a());
        if (this.f377794c.isEnabled()) {
            this.f377794c.fi("Set report native crashes enabled: %b", bool);
        }
    }

    @j.N
    private C38879ie a(@j.N com.yandex.metrica.j jVar) {
        return new C38879ie(jVar.preloadInfo, this.f377794c, Boolean.FALSE.booleanValue());
    }
}

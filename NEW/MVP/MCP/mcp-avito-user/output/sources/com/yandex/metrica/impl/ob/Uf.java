package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.impl.ob.C39062q;
import com.yandex.metrica.profile.UserProfile;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class Uf extends Lf {

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final Qf f379616i;

    /* renamed from: j, reason: collision with root package name */
    private final Xf f379617j;

    /* renamed from: k, reason: collision with root package name */
    private final Wf f379618k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    private final C39016o2 f379619l;

    public class A implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f379620a;

        public A(Activity activity) {
            this.f379620a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.this.f379619l.a(this.f379620a, Uf.a(Uf.this));
        }
    }

    public class B implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C39062q.c f379622a;

        public B(C39062q.c cVar) {
            this.f379622a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.a(Uf.this).a(this.f379622a);
        }
    }

    public class C implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379624a;

        public C(String str) {
            this.f379624a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.a(Uf.this).reportEvent(this.f379624a);
        }
    }

    public class D implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379626a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f379627b;

        public D(String str, String str2) {
            this.f379626a = str;
            this.f379627b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.a(Uf.this).reportEvent(this.f379626a, this.f379627b);
        }
    }

    public class E implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379629a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f379630b;

        public E(String str, List list) {
            this.f379629a = str;
            this.f379630b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.a(Uf.this).reportEvent(this.f379629a, A2.a(this.f379630b));
        }
    }

    public class F implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379632a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f379633b;

        public F(String str, Throwable th2) {
            this.f379632a = str;
            this.f379633b = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.a(Uf.this).reportError(this.f379632a, this.f379633b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$a, reason: case insensitive filesystem */
    public class RunnableC38658a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379635a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f379636b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Throwable f379637c;

        public RunnableC38658a(String str, String str2, Throwable th2) {
            this.f379635a = str;
            this.f379636b = str2;
            this.f379637c = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.a(Uf.this).reportError(this.f379635a, this.f379636b, this.f379637c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$b, reason: case insensitive filesystem */
    public class RunnableC38659b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f379639a;

        public RunnableC38659b(Throwable th2) {
            this.f379639a = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.a(Uf.this).reportUnhandledException(this.f379639a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$c, reason: case insensitive filesystem */
    public class RunnableC38660c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379641a;

        public RunnableC38660c(String str) {
            this.f379641a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.a(Uf.this).c(this.f379641a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$d, reason: case insensitive filesystem */
    public class RunnableC38661d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f379643a;

        public RunnableC38661d(Intent intent) {
            this.f379643a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.c(Uf.this).a().a(this.f379643a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$e, reason: case insensitive filesystem */
    public class RunnableC38662e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379645a;

        public RunnableC38662e(String str) {
            this.f379645a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.c(Uf.this).a().a(this.f379645a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Uf$f, reason: case insensitive filesystem */
    public class RunnableC38663f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f379647a;

        public RunnableC38663f(Intent intent) {
            this.f379647a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.c(Uf.this).a().a(this.f379647a);
        }
    }

    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379649a;

        public g(String str) {
            this.f379649a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.a(Uf.this).a(this.f379649a);
        }
    }

    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Location f379651a;

        public h(Location location) {
            this.f379651a = location;
        }

        @Override // java.lang.Runnable
        public void run() {
            Sf sfE = Uf.this.e();
            Location location = this.f379651a;
            sfE.getClass();
            R2.a(location);
        }
    }

    public class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f379653a;

        public i(boolean z12) {
            this.f379653a = z12;
        }

        @Override // java.lang.Runnable
        public void run() {
            Sf sfE = Uf.this.e();
            boolean z12 = this.f379653a;
            sfE.getClass();
            R2.a(z12);
        }
    }

    public class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f379655a;

        public j(boolean z12) {
            this.f379655a = z12;
        }

        @Override // java.lang.Runnable
        public void run() {
            Sf sfE = Uf.this.e();
            boolean z12 = this.f379655a;
            sfE.getClass();
            R2.a(z12);
        }
    }

    public class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f379657a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ YandexMetricaConfig f379658b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.yandex.metrica.j f379659c;

        public k(Context context, YandexMetricaConfig yandexMetricaConfig, com.yandex.metrica.j jVar) {
            this.f379657a = context;
            this.f379658b = yandexMetricaConfig;
            this.f379659c = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Sf sfE = Uf.this.e();
            Context context = this.f379657a;
            sfE.getClass();
            R2.a(context).b(this.f379658b, Uf.this.c().a(this.f379659c));
        }
    }

    public class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f379661a;

        public l(boolean z12) {
            this.f379661a = z12;
        }

        @Override // java.lang.Runnable
        public void run() {
            Sf sfE = Uf.this.e();
            boolean z12 = this.f379661a;
            sfE.getClass();
            R2.c(z12);
        }
    }

    public class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379663a;

        public m(String str) {
            this.f379663a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Sf sfE = Uf.this.e();
            String str = this.f379663a;
            sfE.getClass();
            R2.a(str);
        }
    }

    public class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UserProfile f379665a;

        public n(UserProfile userProfile) {
            this.f379665a = userProfile;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.a(Uf.this).reportUserProfile(this.f379665a);
        }
    }

    public class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Revenue f379667a;

        public o(Revenue revenue) {
            this.f379667a = revenue;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.a(Uf.this).reportRevenue(this.f379667a);
        }
    }

    public class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdRevenue f379669a;

        public p(AdRevenue adRevenue) {
            this.f379669a = adRevenue;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.a(Uf.this).reportAdRevenue(this.f379669a);
        }
    }

    public class q implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ECommerceEvent f379671a;

        public q(ECommerceEvent eCommerceEvent) {
            this.f379671a = eCommerceEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.a(Uf.this).reportECommerce(this.f379671a);
        }
    }

    public class r implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DeferredDeeplinkParametersListener f379673a;

        public r(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
            this.f379673a = deferredDeeplinkParametersListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.this.e().getClass();
            R2.k().a(this.f379673a);
        }
    }

    public class s implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DeferredDeeplinkListener f379675a;

        public s(DeferredDeeplinkListener deferredDeeplinkListener) {
            this.f379675a = deferredDeeplinkListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.this.e().getClass();
            R2.k().a(this.f379675a);
        }
    }

    public class t implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AppMetricaDeviceIDListener f379677a;

        public t(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
            this.f379677a = appMetricaDeviceIDListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.this.e().getClass();
            R2.k().b(this.f379677a);
        }
    }

    public class u implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379679a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f379680b;

        public u(String str, String str2) {
            this.f379679a = str;
            this.f379680b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Sf sfE = Uf.this.e();
            String str = this.f379679a;
            String str2 = this.f379680b;
            sfE.getClass();
            R2.a(str, str2);
        }
    }

    public class v implements Runnable {
        public v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.a(Uf.this).sendEventsBuffer();
        }
    }

    public class w implements Runnable {
        public w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.a(Uf.this).a(Uf.this.h());
        }
    }

    public class x implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379684a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f379685b;

        public x(String str, String str2) {
            this.f379684a = str;
            this.f379685b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.a(Uf.this).a(this.f379684a, this.f379685b);
        }
    }

    public class y implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379687a;

        public y(String str) {
            this.f379687a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.a(Uf.this).b(this.f379687a);
        }
    }

    public class z implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f379689a;

        public z(Activity activity) {
            this.f379689a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            Uf.this.f379619l.b(this.f379689a, Uf.a(Uf.this));
        }
    }

    public Uf(@j.N ICommonExecutor iCommonExecutor) {
        this(new Sf(), iCommonExecutor, new Xf(), new Wf(), new D2());
    }

    public void a(@j.N Context context, @j.N YandexMetricaConfig yandexMetricaConfig) {
        this.f379617j.a(context, yandexMetricaConfig);
        com.yandex.metrica.j jVarA = this.f379618k.a(yandexMetricaConfig instanceof com.yandex.metrica.j ? (com.yandex.metrica.j) yandexMetricaConfig : new com.yandex.metrica.j(yandexMetricaConfig));
        com.yandex.metrica.g gVarG = g();
        gVarG.getClass();
        gVarG.f377696e.a(context);
        Boolean bool = jVarA.sessionsAutoTrackingEnabled;
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        if (bool.booleanValue()) {
            gVarG.f377695d.a();
        }
        gVarG.f377692a.getClass();
        R2.a(context).b(jVarA);
        d().execute(new k(context, yandexMetricaConfig, jVarA));
        e().getClass();
        R2.j();
    }

    public void c(@j.P Activity activity) {
        a().a(null);
        this.f379617j.getClass();
        g().getClass();
        d().execute(new z(activity));
    }

    public void d(@j.N String str) {
        a().a(null);
        this.f379617j.c(str);
        g().getClass();
        d().execute(new RunnableC38660c(str));
    }

    public void e(@j.N String str) {
        a().a(null);
        this.f379617j.a(str);
        d().execute(new g(str));
    }

    public void f(@j.P String str) {
        this.f379617j.getClass();
        g().getClass();
        d().execute(new m(str));
    }

    public void i() {
        a().a(null);
        this.f379617j.getClass();
        g().getClass();
        d().execute(new v());
    }

    private Uf(@j.N Sf sf2, @j.N ICommonExecutor iCommonExecutor, @j.N Xf xf2, @j.N Wf wf2, @j.N D2 d22) {
        this(sf2, iCommonExecutor, xf2, wf2, new Kf(sf2), new Qf(sf2), d22, new com.yandex.metrica.g(sf2, d22), Pf.a(), P.g().f(), P.g().l(), P.g().e());
    }

    public void b(@j.N String str) {
        a().a(null);
        this.f379617j.reportEvent(str);
        g().getClass();
        d().execute(new C(str));
    }

    @j.k0
    public Uf(@j.N Sf sf2, @j.N ICommonExecutor iCommonExecutor, @j.N Xf xf2, @j.N Wf wf2, @j.N Kf kf2, @j.N Qf qf2, @j.N D2 d22, @j.N com.yandex.metrica.g gVar, @j.N Pf pf2, @j.N C38939l0 c38939l0, @j.N C39016o2 c39016o2, @j.N C38665a0 c38665a0) {
        super(sf2, iCommonExecutor, kf2, d22, gVar, pf2, c38939l0, c38665a0);
        this.f379618k = wf2;
        this.f379617j = xf2;
        this.f379616i = qf2;
        this.f379619l = c39016o2;
    }

    public void b(@j.N String str, @j.P String str2) {
        a().a(null);
        this.f379617j.reportEvent(str, str2);
        g().getClass();
        d().execute(new D(str, str2));
    }

    public void c(@j.N String str, @j.P String str2) {
        a().a(null);
        if (this.f379617j.f(str)) {
            g().getClass();
            d().execute(new x(str, str2));
        }
    }

    public void b(@j.N Activity activity) {
        Intent intent = null;
        a().a(null);
        this.f379617j.c(activity);
        g().getClass();
        if (activity != null) {
            try {
                intent = activity.getIntent();
            } catch (Throwable unused) {
            }
        }
        d().execute(new RunnableC38661d(intent));
    }

    public void c(@j.N String str) {
        if (this.f379616i.a().b() && this.f379617j.g(str)) {
            g().getClass();
            d().execute(new y(str));
        }
    }

    public static C38915k1 c(Uf uf2) {
        uf2.e().getClass();
        return R2.k().d();
    }

    public void a(@j.P Activity activity) {
        a().a(null);
        this.f379617j.getClass();
        g().getClass();
        d().execute(new A(activity));
    }

    public void b(@j.N Context context, boolean z12) {
        this.f379617j.b(context);
        g().f377696e.a(context);
        d().execute(new l(z12));
    }

    public void a(@j.N Application application) {
        a().a(null);
        this.f379617j.a(application);
        com.yandex.metrica.g gVarG = g();
        gVarG.f377694c.a(application);
        d().execute(new B(gVarG.f377695d.a()));
    }

    public void a(@j.N String str, @j.P Map<String, Object> map) {
        a().a(null);
        this.f379617j.reportEvent(str, map);
        g().getClass();
        d().execute(new E(str, A2.a((Map) map)));
    }

    public void a(@j.N String str, @j.P Throwable th2) {
        a().a(null);
        this.f379617j.reportError(str, th2);
        g().getClass();
        if (th2 == null) {
            th2 = new C38920k6();
            th2.fillInStackTrace();
        }
        d().execute(new F(str, th2));
    }

    public void a(@j.N String str, @j.P String str2, @j.P Throwable th2) {
        a().a(null);
        this.f379617j.reportError(str, str2, th2);
        d().execute(new RunnableC38658a(str, str2, th2));
    }

    public void a(@j.N Throwable th2) {
        a().a(null);
        this.f379617j.reportUnhandledException(th2);
        g().getClass();
        d().execute(new RunnableC38659b(th2));
    }

    public void a(@j.N String str) {
        a().a(null);
        this.f379617j.e(str);
        g().getClass();
        d().execute(new RunnableC38662e(str));
    }

    public void a(@j.N Intent intent) {
        a().a(null);
        this.f379617j.a(intent);
        g().getClass();
        d().execute(new RunnableC38663f(intent));
    }

    public void a(@j.P Location location) {
        this.f379617j.getClass();
        g().getClass();
        d().execute(new h(location));
    }

    public void a(boolean z12) {
        this.f379617j.getClass();
        g().getClass();
        d().execute(new i(z12));
    }

    public void a(@j.N Context context, boolean z12) {
        this.f379617j.a(context);
        g().f377696e.a(context);
        d().execute(new j(z12));
    }

    public void a(@j.N UserProfile userProfile) {
        a().a(null);
        this.f379617j.reportUserProfile(userProfile);
        g().getClass();
        d().execute(new n(userProfile));
    }

    public void a(@j.N Revenue revenue) {
        a().a(null);
        this.f379617j.reportRevenue(revenue);
        g().getClass();
        d().execute(new o(revenue));
    }

    public void a(@j.N AdRevenue adRevenue) {
        a().a(null);
        this.f379617j.reportAdRevenue(adRevenue);
        g().getClass();
        d().execute(new p(adRevenue));
    }

    public void a(@j.N ECommerceEvent eCommerceEvent) {
        a().a(null);
        this.f379617j.reportECommerce(eCommerceEvent);
        g().getClass();
        d().execute(new q(eCommerceEvent));
    }

    public void a(@j.N DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        a().a(null);
        this.f379617j.a(deferredDeeplinkParametersListener);
        g().getClass();
        d().execute(new r(deferredDeeplinkParametersListener));
    }

    public void a(@j.N DeferredDeeplinkListener deferredDeeplinkListener) {
        a().a(null);
        this.f379617j.a(deferredDeeplinkListener);
        g().getClass();
        d().execute(new s(deferredDeeplinkListener));
    }

    public void a(@j.N AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        a().a(null);
        this.f379617j.a(appMetricaDeviceIDListener);
        g().getClass();
        d().execute(new t(appMetricaDeviceIDListener));
    }

    @j.N
    public IReporter a(@j.N Context context, @j.N String str) {
        this.f379617j.a(context, str);
        b().a(context);
        return f().a(context, str);
    }

    public void a(@j.N Context context, @j.N ReporterConfig reporterConfig) {
        com.yandex.metrica.f fVar;
        this.f379617j.a(context, reporterConfig);
        if (reporterConfig instanceof com.yandex.metrica.f) {
            fVar = (com.yandex.metrica.f) reporterConfig;
        } else {
            fVar = new com.yandex.metrica.f(reporterConfig);
        }
        g().f377696e.a(context);
        f().a(context, fVar);
    }

    public void a(@j.N String str, @j.P String str2) {
        this.f379617j.d(str);
        g().getClass();
        d().execute(new u(str, str2));
    }

    public void a(@j.N WebView webView) {
        a().a(null);
        this.f379617j.a(webView);
        g().f377693b.a(webView, this);
        d().execute(new w());
    }

    public static K0 a(Uf uf2) {
        uf2.e().getClass();
        return R2.k().d().b();
    }
}

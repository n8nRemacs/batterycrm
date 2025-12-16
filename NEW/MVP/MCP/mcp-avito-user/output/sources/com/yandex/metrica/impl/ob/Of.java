package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.f;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Of implements M0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Sf f379045a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38681ag f379046b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f379047c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Context f379048d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final Wf f379049e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.f f379050f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.g f379051g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final Nf f379052h;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379053a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f379054b;

        public a(String str, String str2) {
            this.f379053a = str;
            this.f379054b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.this.a().b(this.f379053a, this.f379054b);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379056a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f379057b;

        public b(String str, String str2) {
            this.f379056a = str;
            this.f379057b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.this.a().d(this.f379056a, this.f379057b);
        }
    }

    public class c implements InterfaceC39085qm<M0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Sf f379059a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f379060b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.yandex.metrica.f f379061c;

        public c(Sf sf2, Context context, com.yandex.metrica.f fVar) {
            this.f379059a = sf2;
            this.f379060b = context;
            this.f379061c = fVar;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39085qm
        public M0 a() {
            Sf sf2 = this.f379059a;
            Context context = this.f379060b;
            com.yandex.metrica.f fVar = this.f379061c;
            sf2.getClass();
            return R2.a(context).a(fVar);
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379062a;

        public d(String str) {
            this.f379062a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.this.a().reportEvent(this.f379062a);
        }
    }

    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379064a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f379065b;

        public e(String str, String str2) {
            this.f379064a = str;
            this.f379065b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.this.a().reportEvent(this.f379064a, this.f379065b);
        }
    }

    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379067a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f379068b;

        public f(String str, List list) {
            this.f379067a = str;
            this.f379068b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.this.a().reportEvent(this.f379067a, A2.a(this.f379068b));
        }
    }

    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379070a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f379071b;

        public g(String str, Throwable th2) {
            this.f379070a = str;
            this.f379071b = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.this.a().reportError(this.f379070a, this.f379071b);
        }
    }

    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379073a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f379074b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Throwable f379075c;

        public h(String str, String str2, Throwable th2) {
            this.f379073a = str;
            this.f379074b = str2;
            this.f379075c = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.this.a().reportError(this.f379073a, this.f379074b, this.f379075c);
        }
    }

    public class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f379077a;

        public i(Throwable th2) {
            this.f379077a = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.this.a().reportUnhandledException(this.f379077a);
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.this.a().resumeSession();
        }
    }

    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.this.a().pauseSession();
        }
    }

    public class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379081a;

        public l(String str) {
            this.f379081a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.this.a().setUserProfileID(this.f379081a);
        }
    }

    public class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ H6 f379083a;

        public m(H6 h62) {
            this.f379083a = h62;
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.this.a().a(this.f379083a);
        }
    }

    public class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UserProfile f379085a;

        public n(UserProfile userProfile) {
            this.f379085a = userProfile;
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.this.a().reportUserProfile(this.f379085a);
        }
    }

    public class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Revenue f379087a;

        public o(Revenue revenue) {
            this.f379087a = revenue;
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.this.a().reportRevenue(this.f379087a);
        }
    }

    public class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdRevenue f379089a;

        public p(AdRevenue adRevenue) {
            this.f379089a = adRevenue;
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.this.a().reportAdRevenue(this.f379089a);
        }
    }

    public class q implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ECommerceEvent f379091a;

        public q(ECommerceEvent eCommerceEvent) {
            this.f379091a = eCommerceEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.this.a().reportECommerce(this.f379091a);
        }
    }

    public class r implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f379093a;

        public r(boolean z12) {
            this.f379093a = z12;
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.this.a().setStatisticsSending(this.f379093a);
        }
    }

    public class s implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.yandex.metrica.f f379095a;

        public s(com.yandex.metrica.f fVar) {
            this.f379095a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.a(Of.this, this.f379095a);
        }
    }

    public class t implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.yandex.metrica.f f379097a;

        public t(com.yandex.metrica.f fVar) {
            this.f379097a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.a(Of.this, this.f379097a);
        }
    }

    public class u implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C39212w6 f379099a;

        public u(C39212w6 c39212w6) {
            this.f379099a = c39212w6;
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.this.a().a(this.f379099a);
        }
    }

    public class v implements Runnable {
        public v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.this.a().b();
        }
    }

    public class w implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f379102a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f379103b;

        public w(String str, JSONObject jSONObject) {
            this.f379102a = str;
            this.f379103b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.this.a().a(this.f379102a, this.f379103b);
        }
    }

    public class x implements Runnable {
        public x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Of.this.a().sendEventsBuffer();
        }
    }

    public Of(@j.N ICommonExecutor iCommonExecutor, @j.N Context context, @j.N String str) {
        this(iCommonExecutor, context.getApplicationContext(), str, new Sf());
    }

    @j.N
    @j.l0
    public final M0 a() {
        Sf sf2 = this.f379045a;
        Context context = this.f379048d;
        com.yandex.metrica.f fVar = this.f379050f;
        sf2.getClass();
        return R2.a(context).a(fVar);
    }

    @Override // com.yandex.metrica.impl.ob.M0
    public void b() {
        this.f379051g.getClass();
        this.f379047c.execute(new v());
    }

    public void d(@j.N String str) {
        com.yandex.metrica.f fVar = new com.yandex.metrica.f(new f.a(str));
        this.f379051g.getClass();
        this.f379047c.execute(new s(fVar));
    }

    @Override // com.yandex.metrica.IReporter
    @j.N
    public IPluginReporter getPluginExtension() {
        return this.f379052h;
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
        this.f379046b.getClass();
        this.f379051g.getClass();
        this.f379047c.execute(new k());
    }

    @Override // com.yandex.metrica.IReporter
    public void reportAdRevenue(@j.N AdRevenue adRevenue) {
        this.f379046b.reportAdRevenue(adRevenue);
        this.f379051g.getClass();
        this.f379047c.execute(new p(adRevenue));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(@j.N ECommerceEvent eCommerceEvent) {
        this.f379046b.reportECommerce(eCommerceEvent);
        this.f379051g.getClass();
        this.f379047c.execute(new q(eCommerceEvent));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@j.N String str, @j.P Throwable th2) {
        this.f379046b.reportError(str, th2);
        this.f379051g.getClass();
        if (th2 == null) {
            th2 = new C38920k6();
            th2.fillInStackTrace();
        }
        this.f379047c.execute(new g(str, th2));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@j.N String str) {
        this.f379046b.reportEvent(str);
        this.f379051g.getClass();
        this.f379047c.execute(new d(str));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(@j.N Revenue revenue) {
        this.f379046b.reportRevenue(revenue);
        this.f379051g.getClass();
        this.f379047c.execute(new o(revenue));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(@j.N Throwable th2) {
        this.f379046b.reportUnhandledException(th2);
        this.f379051g.getClass();
        this.f379047c.execute(new i(th2));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(@j.N UserProfile userProfile) {
        this.f379046b.reportUserProfile(userProfile);
        this.f379051g.getClass();
        this.f379047c.execute(new n(userProfile));
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
        this.f379046b.getClass();
        this.f379051g.getClass();
        this.f379047c.execute(new j());
    }

    @Override // com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
        this.f379046b.getClass();
        this.f379051g.getClass();
        this.f379047c.execute(new x());
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z12) {
        this.f379046b.getClass();
        this.f379051g.getClass();
        this.f379047c.execute(new r(z12));
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(@j.P String str) {
        this.f379046b.getClass();
        this.f379051g.getClass();
        this.f379047c.execute(new l(str));
    }

    private Of(@j.N ICommonExecutor iCommonExecutor, @j.N Context context, @j.N String str, @j.N Sf sf2) {
        this(iCommonExecutor, context, new C38681ag(), sf2, new Wf(), new com.yandex.metrica.g(sf2, new D2()), new com.yandex.metrica.f(new f.a(str)));
    }

    @Override // com.yandex.metrica.impl.ob.M0, com.yandex.metrica.e
    public void b(@j.P String str, @j.P String str2) {
        this.f379046b.getClass();
        this.f379051g.getClass();
        this.f379047c.execute(new a(str, str2));
    }

    @Override // com.yandex.metrica.impl.ob.R0
    public void a(@j.N H6 h62) {
        this.f379051g.getClass();
        this.f379047c.execute(new m(h62));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@j.N String str, @j.P String str2) {
        this.f379046b.reportEvent(str, str2);
        this.f379051g.getClass();
        this.f379047c.execute(new e(str, str2));
    }

    @Override // com.yandex.metrica.impl.ob.M0, com.yandex.metrica.e
    public void d(@j.N String str, @j.P String str2) {
        this.f379046b.d(str, str2);
        this.f379051g.getClass();
        this.f379047c.execute(new b(str, str2));
    }

    private Of(@j.N ICommonExecutor iCommonExecutor, @j.N Context context, @j.N C38681ag c38681ag, @j.N Sf sf2, @j.N Wf wf2, @j.N com.yandex.metrica.g gVar, @j.N com.yandex.metrica.f fVar) {
        this(iCommonExecutor, context, c38681ag, sf2, wf2, gVar, fVar, new Nf(c38681ag.a(), gVar, iCommonExecutor, new c(sf2, context, fVar)));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@j.N String str, @j.P String str2) {
        this.f379046b.reportError(str, str2, null);
        this.f379047c.execute(new h(str, str2, null));
    }

    @Override // com.yandex.metrica.impl.ob.R0
    public void a(@j.N C39212w6 c39212w6) {
        this.f379051g.getClass();
        this.f379047c.execute(new u(c39212w6));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@j.N String str, @j.P String str2, @j.P Throwable th2) {
        this.f379046b.reportError(str, str2, th2);
        this.f379047c.execute(new h(str, str2, th2));
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@j.N String str, @j.P Map<String, Object> map) {
        this.f379046b.reportEvent(str, map);
        this.f379051g.getClass();
        this.f379047c.execute(new f(str, A2.a((Map) map)));
    }

    @j.k0
    public Of(@j.N ICommonExecutor iCommonExecutor, @j.N Context context, @j.N C38681ag c38681ag, @j.N Sf sf2, @j.N Wf wf2, @j.N com.yandex.metrica.g gVar, @j.N com.yandex.metrica.f fVar, @j.N Nf nf2) {
        this.f379047c = iCommonExecutor;
        this.f379048d = context;
        this.f379046b = c38681ag;
        this.f379045a = sf2;
        this.f379049e = wf2;
        this.f379051g = gVar;
        this.f379050f = fVar;
        this.f379052h = nf2;
    }

    @Override // com.yandex.metrica.impl.ob.M0
    public void a(@j.N String str, @j.N JSONObject jSONObject) {
        this.f379051g.getClass();
        this.f379047c.execute(new w(str, jSONObject));
    }

    public void a(@j.N com.yandex.metrica.f fVar) {
        com.yandex.metrica.f fVarA = this.f379049e.a(fVar);
        this.f379051g.getClass();
        this.f379047c.execute(new t(fVarA));
    }

    public static void a(Of of2, com.yandex.metrica.f fVar) {
        Sf sf2 = of2.f379045a;
        Context context = of2.f379048d;
        sf2.getClass();
        R2.a(context).c(fVar);
    }
}

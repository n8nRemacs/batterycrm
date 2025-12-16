package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.C39057pi;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.r1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39087r1 implements InterfaceC39040p1 {

    /* renamed from: A, reason: collision with root package name */
    @j.N
    private final C38767e2 f381698A;

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private C39057pi f381699a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f381700b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Context f381701c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private volatile MetricaService.d f381702d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final Eh f381703e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private X0 f381704f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final B0 f381705g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private C38893j4 f381706h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final A1 f381707i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    private Vc f381708j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private C38774e9 f381709k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    private L1 f381710l;

    /* renamed from: m, reason: collision with root package name */
    @j.N
    private final E0 f381711m;

    /* renamed from: n, reason: collision with root package name */
    @j.N
    private final C39288za f381712n;

    /* renamed from: o, reason: collision with root package name */
    @j.N
    private final C38942l3 f381713o;

    /* renamed from: p, reason: collision with root package name */
    @j.P
    private Y6 f381714p;

    /* renamed from: q, reason: collision with root package name */
    @j.N
    private final InterfaceC39020o6 f381715q;

    /* renamed from: r, reason: collision with root package name */
    @j.N
    private final B7 f381716r;

    /* renamed from: s, reason: collision with root package name */
    @j.N
    private final C39205w f381717s;

    /* renamed from: t, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f381718t;

    /* renamed from: u, reason: collision with root package name */
    @j.N
    private final C39255y1 f381719u;

    /* renamed from: v, reason: collision with root package name */
    @j.N
    private InterfaceC38986mm<String> f381720v;

    /* renamed from: w, reason: collision with root package name */
    @j.N
    private InterfaceC38986mm<File> f381721w;

    /* renamed from: x, reason: collision with root package name */
    @j.P
    private InterfaceC38772e7<String> f381722x;

    /* renamed from: y, reason: collision with root package name */
    private ICommonExecutor f381723y;

    /* renamed from: z, reason: collision with root package name */
    @j.N
    private M1 f381724z;

    /* renamed from: com.yandex.metrica.impl.ob.r1$a */
    public class a implements InterfaceC38986mm<File> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38986mm
        @j.l0
        public void b(@j.N File file) {
            C39087r1.this.a(file);
        }
    }

    @j.K
    public C39087r1(@j.N Context context, @j.N MetricaService.d dVar) {
        this(context, dVar, new C39043p4(context));
    }

    public static void d(C39087r1 c39087r1) {
        if (c39087r1.f381699a != null) {
            F0.g().o().a(c39087r1.f381699a);
        }
    }

    public static void f(C39087r1 c39087r1) {
        c39087r1.f381703e.b();
    }

    @Override // com.yandex.metrica.impl.ob.B1
    @j.l0
    public void onConfigurationChanged(@j.N Configuration configuration) {
        C38816g1.a(this.f381701c).b(configuration);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39040p1
    @j.l0
    public void reportData(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        this.f381704f.a();
        this.f381710l.a(C38715c0.a(bundle), bundle);
    }

    @j.K
    private C39087r1(@j.N Context context, @j.N MetricaService.d dVar, @j.N C39043p4 c39043p4) {
        this(context, dVar, new C38893j4(context, c39043p4), new A1(), new B0(), new E0(), new C39288za(context), C38942l3.a(), new Eh(context), F0.g().b(), F0.g().h().c(), B7.a(), F0.g().q().e(), F0.g().q().a(), new C39255y1(), F0.g().n());
    }

    @Override // com.yandex.metrica.impl.ob.B1
    @j.l0
    public void a() {
        if (this.f381700b) {
            C38816g1.a(this.f381701c).b(this.f381701c.getResources().getConfiguration());
        } else {
            this.f381709k = F0.g().s();
            this.f381711m.a(this.f381701c);
            F0.g().x();
            C38812fm.c().d();
            this.f381708j = new Vc(C39194vc.a(this.f381701c), H2.a(this.f381701c), this.f381709k);
            this.f381699a = new C39057pi.b(this.f381701c).a();
            F0.g().t().getClass();
            this.f381707i.b(new C39183v1(this));
            this.f381707i.c(new C39207w1(this));
            this.f381707i.a(new C39231x1(this));
            this.f381713o.a(this, C39066q3.class, C39042p3.a(new C39135t1(this)).a(new C39111s1(this)).a());
            F0.g().r().a(this.f381701c, this.f381699a);
            this.f381704f = new X0(this.f381709k, this.f381699a.t(), new com.yandex.metrica.coreutils.services.e(), new C39232x2(), C39031oh.a());
            C39057pi c39057pi = this.f381699a;
            if (c39057pi != null) {
                this.f381703e.b(c39057pi);
            }
            a(this.f381699a);
            C39255y1 c39255y1 = this.f381719u;
            Context context = this.f381701c;
            C38893j4 c38893j4 = this.f381706h;
            c39255y1.getClass();
            this.f381710l = new L1(context, c38893j4, F0.g().q().e(), new B0());
            YandexMetrica.getReporter(this.f381701c, "20799a27-fa80-4b36-b2db-0f8141f24180");
            File fileA = this.f381705g.a(this.f381701c, "appmetrica_crashes");
            if (fileA != null) {
                C39255y1 c39255y12 = this.f381719u;
                InterfaceC38986mm<File> interfaceC38986mm = this.f381721w;
                c39255y12.getClass();
                this.f381714p = new Y6(fileA, interfaceC38986mm);
                this.f381718t.execute(new RunnableC39164u6(this.f381701c, fileA, this.f381721w));
                this.f381714p.a();
            }
            if (A2.a(21)) {
                C39255y1 c39255y13 = this.f381719u;
                L1 l12 = this.f381710l;
                c39255y13.getClass();
                this.f381722x = new C39141t7(new C39189v7(l12));
                this.f381720v = new C39159u1(this);
                if (this.f381716r.b()) {
                    this.f381722x.a();
                    this.f381723y.executeDelayed(new F7(), 1L, TimeUnit.MINUTES);
                }
            }
            F0.g().f().a(this.f381699a);
            this.f381700b = true;
        }
        if (A2.a(21)) {
            this.f381715q.a(this.f381720v);
        }
    }

    @Override // com.yandex.metrica.impl.ob.B1
    @j.l0
    public void b(Intent intent) throws NumberFormatException {
        this.f381707i.b(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if ("com.yandex.metrica.IMetricaService".equals(action) && data != null && data.getPath().equals("/client")) {
                int i12 = Integer.parseInt(data.getQueryParameter("pid"));
                this.f381706h.a(encodedAuthority, i12, data.getQueryParameter("psid"));
                this.f381717s.a(i12);
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.B1
    @j.l0
    public void c(Intent intent) {
        this.f381707i.c(intent);
    }

    @j.l0
    private Integer c(@j.N Bundle bundle) {
        A3 a32;
        bundle.setClassLoader(A3.class.getClassLoader());
        String str = A3.f377754c;
        try {
            a32 = (A3) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            a32 = null;
        }
        if (a32 == null) {
            return null;
        }
        return a32.g();
    }

    @j.k0
    @j.K
    public C39087r1(@j.N Context context, @j.N MetricaService.d dVar, @j.N C38893j4 c38893j4, @j.N A1 a12, @j.N B0 b02, @j.N E0 e02, @j.N C39288za c39288za, @j.N C38942l3 c38942l3, @j.N Eh eh2, @j.N C39205w c39205w, @j.N InterfaceC39020o6 interfaceC39020o6, @j.N B7 b72, @j.N ICommonExecutor iCommonExecutor, @j.N ICommonExecutor iCommonExecutor2, @j.N C39255y1 c39255y1, @j.N C38767e2 c38767e2) {
        this.f381700b = false;
        this.f381721w = new a();
        this.f381701c = context;
        this.f381702d = dVar;
        this.f381706h = c38893j4;
        this.f381707i = a12;
        this.f381705g = b02;
        this.f381711m = e02;
        this.f381712n = c39288za;
        this.f381713o = c38942l3;
        this.f381703e = eh2;
        this.f381717s = c39205w;
        this.f381718t = iCommonExecutor;
        this.f381723y = iCommonExecutor2;
        this.f381719u = c39255y1;
        this.f381715q = interfaceC39020o6;
        this.f381716r = b72;
        this.f381724z = new M1(this, context);
        this.f381698A = c38767e2;
    }

    @Override // com.yandex.metrica.impl.ob.B1
    @j.K
    public void b() {
        if (A2.a(21)) {
            this.f381715q.b(this.f381720v);
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39040p1
    @j.l0
    public void b(@j.N Bundle bundle) {
        Integer numC = c(bundle);
        if (numC != null) {
            this.f381717s.c(numC.intValue());
        }
    }

    private void b(Intent intent, int i12) {
        if (intent != null) {
            intent.getExtras().setClassLoader(CounterConfiguration.class.getClassLoader());
            if (intent.getData() != null) {
                Bundle extras = intent.getExtras();
                C39281z3 c39281z3 = new C39281z3(extras);
                if (!C39281z3.a(c39281z3, this.f381701c)) {
                    C38715c0 c38715c0A = C38715c0.a(extras);
                    if (!((c38715c0A.f380254a == null) | (EnumC38666a1.EVENT_TYPE_UNDEFINED.b() == c38715c0A.f380258e))) {
                        try {
                            this.f381710l.a(C38869i4.a(c39281z3), c38715c0A, new D3(c39281z3));
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
        this.f381702d.a(i12);
    }

    public static void b(C39087r1 c39087r1, C39057pi c39057pi) {
        Vc vc2 = c39087r1.f381708j;
        if (vc2 != null) {
            vc2.a(c39057pi);
        }
    }

    @Override // com.yandex.metrica.impl.ob.B1
    @j.l0
    public void a(Intent intent, int i12) {
        b(intent, i12);
    }

    @Override // com.yandex.metrica.impl.ob.B1
    @j.l0
    public void a(Intent intent, int i12, int i13) {
        b(intent, i13);
    }

    @Override // com.yandex.metrica.impl.ob.B1
    @j.l0
    public void a(Intent intent) {
        this.f381707i.a(intent);
    }

    public static void a(C39087r1 c39087r1, C39057pi c39057pi) {
        c39087r1.f381699a = c39057pi;
        Vc vc2 = c39087r1.f381708j;
        if (vc2 != null) {
            vc2.a(c39057pi);
        }
        c39087r1.f381704f.a(c39087r1.f381699a.t());
        c39087r1.f381712n.a(c39057pi);
        c39087r1.f381703e.b(c39057pi);
    }

    public static void a(C39087r1 c39087r1, Intent intent) {
        c39087r1.f381703e.a();
        c39087r1.f381698A.a(Tl.f(intent.getStringExtra("screen_size")));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39040p1
    @j.l0
    @Deprecated
    public void a(String str, int i12, String str2, Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        this.f381710l.a(new C38715c0(str2, str, i12), bundle);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39040p1
    @j.l0
    public void a(int i12, Bundle bundle) {
        this.f381724z.a(i12, bundle);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39040p1
    @j.l0
    public void a(@j.N Bundle bundle) {
        Integer numC = c(bundle);
        if (numC != null) {
            this.f381717s.b(numC.intValue());
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39040p1
    public void a(@j.N MetricaService.d dVar) {
        this.f381702d = dVar;
    }

    @j.l0
    public void a(@j.N File file) {
        this.f381710l.a(file);
    }

    @j.l0
    private void a(@j.N C39057pi c39057pi) {
        Vc vc2 = this.f381708j;
        if (vc2 != null) {
            vc2.a(c39057pi);
        }
    }
}

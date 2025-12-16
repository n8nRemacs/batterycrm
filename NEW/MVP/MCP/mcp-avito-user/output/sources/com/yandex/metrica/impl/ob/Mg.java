package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.C39185v3;
import com.yandex.metrica.impl.ob.Eg;
import com.yandex.metrica.impl.ob.Hg;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class Mg extends Hg {

    /* renamed from: A, reason: collision with root package name */
    @j.N
    private final Jg f378941A;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    private List<String> f378942o;

    /* renamed from: p, reason: collision with root package name */
    @j.P
    private List<String> f378943p;

    /* renamed from: q, reason: collision with root package name */
    @j.P
    private String f378944q;

    /* renamed from: r, reason: collision with root package name */
    @j.P
    private String f378945r;

    /* renamed from: s, reason: collision with root package name */
    @j.P
    private Map<String, String> f378946s;

    /* renamed from: t, reason: collision with root package name */
    @j.N
    private C39185v3.a f378947t;

    /* renamed from: u, reason: collision with root package name */
    @j.P
    private List<String> f378948u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f378949v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f378950w;

    /* renamed from: x, reason: collision with root package name */
    private String f378951x;

    /* renamed from: y, reason: collision with root package name */
    private long f378952y;

    /* renamed from: z, reason: collision with root package name */
    @j.N
    private final C39126sg f378953z;

    public static class b extends Eg.a<b, b> implements Dg<b, b> {

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public final String f378954d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        public final String f378955e;

        /* renamed from: f, reason: collision with root package name */
        @j.P
        public final Map<String, String> f378956f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f378957g;

        /* renamed from: h, reason: collision with root package name */
        @j.P
        public final List<String> f378958h;

        public b(@j.N C39281z3 c39281z3) {
            this(c39281z3.b().f377493b.getAsString("CFG_DEVICE_SIZE_TYPE"), c39281z3.b().f377493b.getAsString("CFG_APP_VERSION"), c39281z3.b().f377493b.getAsString("CFG_APP_VERSION_CODE"), c39281z3.a().d(), c39281z3.a().e(), c39281z3.a().a(), c39281z3.a().j(), c39281z3.a().b());
        }

        @Override // com.yandex.metrica.impl.ob.Dg
        public /* bridge */ /* synthetic */ boolean b(@j.N b bVar) {
            return false;
        }

        @Override // com.yandex.metrica.impl.ob.Dg
        @j.N
        public b a(@j.N b bVar) {
            String str = this.f378066a;
            String str2 = bVar.f378066a;
            if (str != null) {
                str2 = str;
            }
            String str3 = this.f378067b;
            String str4 = bVar.f378067b;
            if (str3 != null) {
                str4 = str3;
            }
            String str5 = this.f378068c;
            String str6 = bVar.f378068c;
            if (str5 != null) {
                str6 = str5;
            }
            String str7 = this.f378954d;
            String str8 = bVar.f378954d;
            if (str7 != null) {
                str8 = str7;
            }
            String str9 = this.f378955e;
            String str10 = bVar.f378955e;
            if (str9 != null) {
                str10 = str9;
            }
            Map<String, String> map = this.f378956f;
            Map<String, String> map2 = bVar.f378956f;
            if (map != null) {
                map2 = map;
            }
            return new b(str2, str4, str6, str8, str10, map2, this.f378957g || bVar.f378957g, bVar.f378957g ? bVar.f378958h : this.f378958h);
        }

        public b(@j.P String str, @j.P String str2, @j.P String str3, @j.P String str4, @j.P String str5, @j.P Map<String, String> map, boolean z12, @j.P List<String> list) {
            super(str, str2, str3);
            this.f378954d = str4;
            this.f378955e = str5;
            this.f378956f = map;
            this.f378957g = z12;
            this.f378958h = list;
        }

        public b() {
            this(null, null, null, null, null, null, false, null);
        }
    }

    public static class c extends Hg.a<Mg, b> {

        /* renamed from: d, reason: collision with root package name */
        @j.N
        private final I f378959d;

        public c(@j.N Context context, @j.N String str) {
            this(context, str, new C38987mn(), F0.g().d());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.yandex.metrica.impl.ob.Eg.d
        public Eg a(@j.N Object obj) {
            Eg.c cVar = (Eg.c) obj;
            Mg mgA = a(cVar);
            C39057pi c39057pi = cVar.f378071a;
            mgA.c(c39057pi.s());
            mgA.b(c39057pi.r());
            String str = ((b) cVar.f378072b).f378954d;
            if (str != null) {
                Mg.a(mgA, str);
                Mg.b(mgA, ((b) cVar.f378072b).f378955e);
            }
            Map<String, String> map = ((b) cVar.f378072b).f378956f;
            mgA.a(map);
            mgA.a(this.f378959d.a(new C39185v3.a(map, EnumC39158u0.APP)));
            mgA.a(((b) cVar.f378072b).f378957g);
            mgA.a(((b) cVar.f378072b).f378958h);
            mgA.b(cVar.f378071a.q());
            mgA.h(cVar.f378071a.g());
            mgA.b(cVar.f378071a.o());
            return mgA;
        }

        public c(@j.N Context context, @j.N String str, @j.N C38987mn c38987mn, @j.N I i12) {
            super(context, str, c38987mn);
            this.f378959d = i12;
        }

        @Override // com.yandex.metrica.impl.ob.Eg.b
        @j.N
        public Eg a() {
            return new Mg();
        }
    }

    @j.N
    public C39185v3.a B() {
        return this.f378947t;
    }

    @j.P
    public Map<String, String> C() {
        return this.f378946s;
    }

    public String D() {
        return this.f378951x;
    }

    @j.P
    public String E() {
        return this.f378944q;
    }

    @j.P
    public String F() {
        return this.f378945r;
    }

    @j.P
    public List<String> G() {
        return this.f378948u;
    }

    @j.N
    public C39126sg H() {
        return this.f378953z;
    }

    public List<String> I() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!A2.b(this.f378942o)) {
            linkedHashSet.addAll(this.f378942o);
        }
        if (!A2.b(this.f378943p)) {
            linkedHashSet.addAll(this.f378943p);
        }
        linkedHashSet.addAll(this.f378941A.a());
        return new ArrayList(linkedHashSet);
    }

    public List<String> J() {
        return this.f378943p;
    }

    @j.P
    public boolean K() {
        return this.f378949v;
    }

    public boolean L() {
        return this.f378950w;
    }

    public long a(long j12) {
        if (this.f378952y == 0) {
            this.f378952y = j12;
        }
        return this.f378952y;
    }

    public void b(boolean z12) {
        this.f378950w = z12;
    }

    public void c(@j.P List<String> list) {
        this.f378942o = list;
    }

    public void h(String str) {
        this.f378951x = str;
    }

    @Override // com.yandex.metrica.impl.ob.Hg, com.yandex.metrica.impl.ob.Eg
    public String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.f378942o + ", mStartupHostsFromClient=" + this.f378943p + ", mDistributionReferrer='" + this.f378944q + "', mInstallReferrerSource='" + this.f378945r + "', mClidsFromClient=" + this.f378946s + ", mNewCustomHosts=" + this.f378948u + ", mHasNewCustomHosts=" + this.f378949v + ", mSuccessfulStartup=" + this.f378950w + ", mCountryInit='" + this.f378951x + "', mFirstStartupTime=" + this.f378952y + "} " + super.toString();
    }

    private Mg() {
        this(F0.g().m(), new Jg());
    }

    public void b(long j12) {
        if (this.f378952y == 0) {
            this.f378952y = j12;
        }
    }

    @j.k0
    public Mg(@j.N C39126sg c39126sg, @j.N Jg jg2) {
        this.f378947t = new C39185v3.a(null, EnumC39158u0.APP);
        this.f378952y = 0L;
        this.f378953z = c39126sg;
        this.f378941A = jg2;
    }

    public void a(@j.P Map<String, String> map) {
        this.f378946s = map;
    }

    public void b(@j.P List<String> list) {
        this.f378943p = list;
    }

    public static void b(Mg mg2, String str) {
        mg2.f378945r = str;
    }

    public void a(@j.N C39185v3.a aVar) {
        this.f378947t = aVar;
    }

    public static void a(Mg mg2, String str) {
        mg2.f378944q = str;
    }

    public void a(@j.P List<String> list) {
        this.f378948u = list;
    }

    public void a(boolean z12) {
        this.f378949v = z12;
    }
}

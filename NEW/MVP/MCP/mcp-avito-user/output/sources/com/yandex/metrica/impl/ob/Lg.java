package com.yandex.metrica.impl.ob;

import android.location.Location;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.Eg;
import com.yandex.metrica.impl.ob.Hg;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class Lg extends Hg {

    /* renamed from: A, reason: collision with root package name */
    private boolean f378811A;

    /* renamed from: B, reason: collision with root package name */
    private String f378812B;

    /* renamed from: C, reason: collision with root package name */
    private List<String> f378813C;

    /* renamed from: D, reason: collision with root package name */
    private int f378814D;

    /* renamed from: E, reason: collision with root package name */
    private long f378815E;

    /* renamed from: F, reason: collision with root package name */
    private long f378816F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f378817G;

    /* renamed from: H, reason: collision with root package name */
    private long f378818H;

    /* renamed from: I, reason: collision with root package name */
    @j.P
    private List<String> f378819I;

    /* renamed from: o, reason: collision with root package name */
    private boolean f378820o;

    /* renamed from: p, reason: collision with root package name */
    private Location f378821p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f378822q;

    /* renamed from: r, reason: collision with root package name */
    private int f378823r;

    /* renamed from: s, reason: collision with root package name */
    private int f378824s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f378825t;

    /* renamed from: u, reason: collision with root package name */
    private int f378826u;

    /* renamed from: v, reason: collision with root package name */
    private Boolean f378827v;

    /* renamed from: w, reason: collision with root package name */
    private e f378828w;

    /* renamed from: x, reason: collision with root package name */
    @j.N
    private final d f378829x;

    /* renamed from: y, reason: collision with root package name */
    private String f378830y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f378831z;

    public static final class a extends Eg.a<D3.a, a> {

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public final String f378832d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        public final Location f378833e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f378834f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f378835g;

        /* renamed from: h, reason: collision with root package name */
        public final int f378836h;

        /* renamed from: i, reason: collision with root package name */
        public final int f378837i;

        /* renamed from: j, reason: collision with root package name */
        public final int f378838j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f378839k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f378840l;

        /* renamed from: m, reason: collision with root package name */
        @j.P
        public final Map<String, String> f378841m;

        /* renamed from: n, reason: collision with root package name */
        public final int f378842n;

        public a(@j.N D3.a aVar) {
            this(aVar.f377932a, aVar.f377933b, aVar.f377934c, aVar.f377935d, aVar.f377936e, aVar.f377937f, aVar.f377938g, aVar.f377939h, aVar.f377940i, aVar.f377941j, aVar.f377942k, aVar.f377943l, aVar.f377944m, aVar.f377945n);
        }

        @Override // com.yandex.metrica.impl.ob.Dg
        @j.N
        public Object a(@j.N Object obj) {
            D3.a aVar = (D3.a) obj;
            String str = aVar.f377932a;
            String str2 = this.f378066a;
            if (str != null) {
                str2 = str;
            }
            String str3 = aVar.f377933b;
            String str4 = this.f378067b;
            if (str3 != null) {
                str4 = str3;
            }
            String str5 = aVar.f377934c;
            String str6 = this.f378068c;
            if (str5 != null) {
                str6 = str5;
            }
            String str7 = aVar.f377935d;
            String str8 = this.f378832d;
            if (str7 != null) {
                str8 = str7;
            }
            Boolean bool = aVar.f377936e;
            Boolean boolValueOf = Boolean.valueOf(this.f378834f);
            if (bool != null) {
                boolValueOf = bool;
            }
            Location location = aVar.f377937f;
            Location location2 = this.f378833e;
            if (location != null) {
                location2 = location;
            }
            Boolean bool2 = aVar.f377938g;
            Boolean boolValueOf2 = Boolean.valueOf(this.f378835g);
            if (bool2 != null) {
                boolValueOf2 = bool2;
            }
            Integer num = aVar.f377939h;
            Integer numValueOf = Integer.valueOf(this.f378836h);
            if (num != null) {
                numValueOf = num;
            }
            Integer num2 = aVar.f377940i;
            Integer numValueOf2 = Integer.valueOf(this.f378837i);
            if (num2 != null) {
                numValueOf2 = num2;
            }
            Integer num3 = aVar.f377941j;
            Integer numValueOf3 = Integer.valueOf(this.f378838j);
            if (num3 != null) {
                numValueOf3 = num3;
            }
            Boolean bool3 = aVar.f377942k;
            Boolean boolValueOf3 = Boolean.valueOf(this.f378839k);
            if (bool3 != null) {
                boolValueOf3 = bool3;
            }
            Boolean bool4 = aVar.f377943l;
            Boolean boolValueOf4 = Boolean.valueOf(this.f378840l);
            if (bool4 != null) {
                boolValueOf4 = bool4;
            }
            Map<String, String> map = aVar.f377944m;
            Map<String, String> map2 = this.f378841m;
            if (map != null) {
                map2 = map;
            }
            Integer num4 = aVar.f377945n;
            return new a(str2, str4, str6, str8, boolValueOf, location2, boolValueOf2, numValueOf, numValueOf2, numValueOf3, boolValueOf3, boolValueOf4, map2, num4 == null ? Integer.valueOf(this.f378842n) : num4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:123:0x01a3, code lost:
        
            if (r2.getExtras() == null) goto L125;
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x01a5, code lost:
        
            r8 = r2.getExtras().equals(r8.getExtras());
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x01b6, code lost:
        
            if (r8.getExtras() != null) goto L128;
         */
        /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
        @Override // com.yandex.metrica.impl.ob.Dg
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean b(@j.N java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 447
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Lg.a.b(java.lang.Object):boolean");
        }

        public a(@j.P String str, @j.P String str2, @j.P String str3, @j.P String str4, @j.P Boolean bool, @j.P Location location, @j.P Boolean bool2, @j.P Integer num, @j.P Integer num2, @j.P Integer num3, @j.P Boolean bool3, @j.P Boolean bool4, @j.P Map<String, String> map, @j.P Integer num4) {
            super(str, str2, str3);
            this.f378832d = str4;
            Boolean bool5 = Boolean.FALSE;
            this.f378834f = ((Boolean) Tl.a(bool, bool5)).booleanValue();
            this.f378833e = location;
            this.f378835g = ((Boolean) Tl.a(bool2, bool5)).booleanValue();
            this.f378836h = Math.max(10, ((Integer) Tl.a((int) num, 10)).intValue());
            this.f378837i = ((Integer) Tl.a((int) num2, 7)).intValue();
            this.f378838j = ((Integer) Tl.a((int) num3, 90)).intValue();
            this.f378839k = ((Boolean) Tl.a(bool3, bool5)).booleanValue();
            this.f378840l = ((Boolean) Tl.a(bool4, Boolean.TRUE)).booleanValue();
            this.f378841m = map;
            this.f378842n = ((Integer) Tl.a((int) num4, 1000)).intValue();
        }
    }

    public static abstract class b implements e {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        protected final C39112s2 f378843a;

        public b(@j.N C39112s2 c39112s2) {
            this.f378843a = c39112s2;
        }

        @Override // com.yandex.metrica.impl.ob.Lg.e
        public boolean a(@j.P Boolean bool) {
            Boolean bool2 = Boolean.TRUE;
            if (bool == null) {
                bool = bool2;
            }
            return bool.booleanValue();
        }
    }

    public static class c extends Hg.a<Lg, a> {

        /* renamed from: d, reason: collision with root package name */
        @j.N
        private final L3 f378844d;

        /* renamed from: e, reason: collision with root package name */
        @j.N
        private final e f378845e;

        /* renamed from: f, reason: collision with root package name */
        @j.N
        private final Rh f378846f;

        public c(@j.N L3 l32, @j.N e eVar) {
            this(l32, eVar, new Rh());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.yandex.metrica.impl.ob.Eg.d
        @j.N
        public Eg a(@j.N Object obj) {
            Eg.c cVar = (Eg.c) obj;
            Lg lgA = a(cVar);
            Lg.a(lgA, ((a) cVar.f378072b).f378832d);
            lgA.a(this.f378844d.x().a());
            lgA.a(this.f378844d.d().a());
            lgA.d(((a) cVar.f378072b).f378834f);
            lgA.a(((a) cVar.f378072b).f378833e);
            lgA.c(((a) cVar.f378072b).f378835g);
            lgA.d(((a) cVar.f378072b).f378836h);
            lgA.c(((a) cVar.f378072b).f378837i);
            lgA.b(((a) cVar.f378072b).f378838j);
            lgA.e(((a) cVar.f378072b).f378839k);
            lgA.a(Boolean.valueOf(((a) cVar.f378072b).f378840l), this.f378845e);
            lgA.a(((a) cVar.f378072b).f378842n);
            C39057pi c39057pi = cVar.f378071a;
            a aVar = (a) cVar.f378072b;
            lgA.b(c39057pi.y().contains(aVar.f378832d) ? c39057pi.z() : c39057pi.H());
            lgA.f(c39057pi.f().f379394c);
            if (c39057pi.F() != null) {
                lgA.b(c39057pi.F().f380131a);
                lgA.c(c39057pi.F().f380132b);
            }
            lgA.b(c39057pi.f().f379395d);
            lgA.h(c39057pi.n());
            lgA.a(this.f378846f.a(aVar.f378841m, c39057pi, F0.g().d()));
            return lgA;
        }

        @j.k0
        public c(@j.N L3 l32, @j.N e eVar, @j.N Rh rh2) {
            super(l32.g(), l32.e().b());
            this.f378844d = l32;
            this.f378845e = eVar;
            this.f378846f = rh2;
        }

        @Override // com.yandex.metrica.impl.ob.Eg.b
        @j.N
        public Eg a() {
            return new Lg(this.f378844d);
        }
    }

    public interface d {
    }

    public interface e {
        boolean a(@j.P Boolean bool);
    }

    @j.k0
    public Lg(@j.N d dVar) {
        this.f378829x = dVar;
    }

    public static void a(Lg lg2, String str) {
        lg2.f378830y = str;
    }

    public String B() {
        return this.f378830y;
    }

    public int C() {
        return this.f378814D;
    }

    @j.P
    public List<String> D() {
        return this.f378819I;
    }

    @j.N
    public String E() {
        String str = this.f378812B;
        return str == null ? "" : str;
    }

    public boolean F() {
        return this.f378828w.a(this.f378827v);
    }

    public int G() {
        return this.f378824s;
    }

    public Location H() {
        return this.f378821p;
    }

    public int I() {
        return this.f378826u;
    }

    public long J() {
        return this.f378818H;
    }

    public long K() {
        return this.f378815E;
    }

    public long L() {
        return this.f378816F;
    }

    public List<String> M() {
        return this.f378813C;
    }

    public int N() {
        return this.f378823r;
    }

    public boolean O() {
        return this.f378811A;
    }

    public boolean P() {
        return this.f378822q;
    }

    public boolean Q() {
        return this.f378820o;
    }

    public boolean R() {
        return this.f378831z;
    }

    public boolean S() {
        return x() && !A2.b(this.f378813C) && this.f378817G;
    }

    public boolean T() {
        return ((L3) this.f378829x).F();
    }

    public void b(List<String> list) {
        this.f378813C = list;
    }

    public void c(long j12) {
        this.f378816F = j12;
    }

    public void d(boolean z12) {
        this.f378820o = z12;
    }

    public void e(boolean z12) {
        this.f378825t = z12;
    }

    public void f(boolean z12) {
        this.f378831z = z12;
    }

    public void h(String str) {
        this.f378812B = str;
    }

    @Override // com.yandex.metrica.impl.ob.Hg, com.yandex.metrica.impl.ob.Eg
    public String toString() {
        return "ReportRequestConfig{mLocationTracking=" + this.f378820o + ", mManualLocation=" + this.f378821p + ", mFirstActivationAsUpdate=" + this.f378822q + ", mSessionTimeout=" + this.f378823r + ", mDispatchPeriod=" + this.f378824s + ", mLogEnabled=" + this.f378825t + ", mMaxReportsCount=" + this.f378826u + ", statisticSendingFromArguments=" + this.f378827v + ", statisticsSendingStrategy=" + this.f378828w + ", mPreloadInfoSendingStrategy=" + this.f378829x + ", mApiKey='" + this.f378830y + "', mPermissionsCollectingEnabled=" + this.f378831z + ", mFeaturesCollectingEnabled=" + this.f378811A + ", mClidsFromStartupResponse='" + this.f378812B + "', mReportHosts=" + this.f378813C + ", mAttributionId=" + this.f378814D + ", mPermissionsCollectingIntervalSeconds=" + this.f378815E + ", mPermissionsForceSendIntervalSeconds=" + this.f378816F + ", mClidsFromClientMatchClidsFromStartupRequest=" + this.f378817G + ", mMaxReportsInDbCount=" + this.f378818H + ", mCertificates=" + this.f378819I + "} " + super.toString();
    }

    public void a(Location location) {
        this.f378821p = location;
    }

    public void b(long j12) {
        this.f378815E = j12;
    }

    public void c(boolean z12) {
        this.f378822q = z12;
    }

    public void d(int i12) {
        this.f378823r = i12;
    }

    public void a(int i12) {
        this.f378814D = i12;
    }

    public void b(boolean z12) {
        this.f378811A = z12;
    }

    public void c(int i12) {
        this.f378826u = i12;
    }

    public void a(long j12) {
        this.f378818H = j12;
    }

    public void b(int i12) {
        this.f378824s = i12;
    }

    public void a(@j.N List<String> list) {
        this.f378819I = list;
    }

    public void a(@j.P Boolean bool, @j.N e eVar) {
        this.f378827v = bool;
        this.f378828w = eVar;
    }

    public void a(boolean z12) {
        this.f378817G = z12;
    }
}

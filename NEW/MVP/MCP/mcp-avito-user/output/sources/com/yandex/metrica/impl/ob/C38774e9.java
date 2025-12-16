package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.e9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38774e9 extends AbstractC38749d9 implements InterfaceC39056ph, InterfaceC38798f8 {

    /* renamed from: c, reason: collision with root package name */
    static final Rd f380446c = new Rd("LOCATION_TRACKING_ENABLED", null);

    /* renamed from: d, reason: collision with root package name */
    static final Rd f380447d = new Rd("PREF_KEY_OFFSET", null);

    /* renamed from: e, reason: collision with root package name */
    static final Rd f380448e = new Rd("UNCHECKED_TIME", null);

    /* renamed from: f, reason: collision with root package name */
    static final Rd f380449f = new Rd("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* renamed from: g, reason: collision with root package name */
    static final Rd f380450g;

    /* renamed from: h, reason: collision with root package name */
    static final Rd f380451h;

    /* renamed from: i, reason: collision with root package name */
    static final Rd f380452i;

    /* renamed from: j, reason: collision with root package name */
    static final Rd f380453j;

    /* renamed from: k, reason: collision with root package name */
    static final Rd f380454k;

    /* renamed from: l, reason: collision with root package name */
    static final Rd f380455l;

    /* renamed from: m, reason: collision with root package name */
    static final Rd f380456m;

    /* renamed from: n, reason: collision with root package name */
    private static final Rd f380457n;

    /* renamed from: o, reason: collision with root package name */
    static final Rd f380458o;

    /* renamed from: p, reason: collision with root package name */
    static final Rd f380459p;

    /* renamed from: q, reason: collision with root package name */
    static final Rd f380460q;

    /* renamed from: r, reason: collision with root package name */
    static final Rd f380461r;

    /* renamed from: s, reason: collision with root package name */
    static final Rd f380462s;

    /* renamed from: t, reason: collision with root package name */
    static final Rd f380463t;

    /* renamed from: u, reason: collision with root package name */
    static final Rd f380464u;

    /* renamed from: v, reason: collision with root package name */
    static final Rd f380465v;

    /* renamed from: w, reason: collision with root package name */
    static final Rd f380466w;

    static {
        new Rd("SDKFCE", null);
        new Rd("FST", null);
        new Rd("LSST", null);
        new Rd("FSDKFCO", null);
        new Rd("SRSDKFC", null);
        new Rd("LSDKFCAT", null);
        f380450g = new Rd("LAST_IDENTITY_LIGHT_SEND_TIME", null);
        f380451h = new Rd("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);
        f380452i = new Rd("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);
        f380453j = new Rd("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);
        f380454k = new Rd("LAST_REPORT_SEND_ATTEMPT_TIME", null);
        f380455l = new Rd("LAST_LOCATION_SEND_ATTEMPT_TIME", null);
        f380456m = new Rd("LAST_STARTUP_SEND_ATTEMPT_TIME", null);
        f380457n = new Rd("LAST_MIGRATION_VERSION", null);
        f380458o = new Rd("LAST_WIFI_SCANNING_ATTEMPT_TIME", null);
        f380459p = new Rd("LAST_LBS_SCANNING_ATTEMPT_TIME", null);
        f380460q = new Rd("LAST_GPS_SCANNING_ATTEMPT_TIME", null);
        f380461r = new Rd("LAST_FUSED_SCANNING_ATTEMPT_TIME", null);
        f380462s = new Rd("SATELLITE_PRELOAD_INFO_CHECKED", null);
        f380463t = new Rd("SATELLITE_CLIDS_CHECKED", null);
        f380464u = new Rd("CERTIFICATE_REQUEST_ETAG", null);
        f380465v = new Rd("CERTIFICATE_REQUEST_NEXT_ATTEMPT_TIME", null);
        f380466w = new Rd("VITAL_DATA", null);
    }

    public C38774e9(S7 s72) {
        super(s72);
    }

    @Deprecated
    public int a(int i12) {
        return a(f380457n.a(), i12);
    }

    public long b(int i12) {
        return a(f380447d.a(), i12);
    }

    public C38774e9 c(boolean z12) {
        return (C38774e9) b(f380448e.a(), z12);
    }

    public void d(boolean z12) {
        b(f380446c.a(), z12).d();
    }

    public long e(long j12) {
        return a(f380459p.a(), j12);
    }

    @j.P
    public Boolean f() {
        Rd rd2 = f380449f;
        if (c(rd2.a())) {
            return Boolean.valueOf(a(rd2.a(), true));
        }
        return null;
    }

    public boolean g() {
        return a(f380446c.a(), false);
    }

    public C38774e9 h(long j12) {
        return (C38774e9) b(f380460q.a(), j12);
    }

    public C38774e9 i(long j12) {
        return (C38774e9) b(f380450g.a(), j12);
    }

    public C38774e9 j(long j12) {
        return (C38774e9) b(f380459p.a(), j12);
    }

    public C38774e9 k(long j12) {
        return (C38774e9) b(f380458o.a(), j12);
    }

    public C38774e9 l(long j12) {
        return (C38774e9) b(f380447d.a(), j12);
    }

    public boolean a(boolean z12) {
        return a(f380448e.a(), z12);
    }

    public C38774e9 b(boolean z12) {
        return (C38774e9) b(f380449f.a(), z12);
    }

    public long c(long j12) {
        return a(f380460q.a(), j12);
    }

    public long d(long j12) {
        return a(f380450g.a(), j12);
    }

    public C38774e9 g(long j12) {
        return (C38774e9) b(f380461r.a(), j12);
    }

    public C38774e9 h() {
        return (C38774e9) b(f380463t.a(), true);
    }

    public C38774e9 i() {
        return (C38774e9) b(f380462s.a(), true);
    }

    @j.N
    @Deprecated
    public C38774e9 j() {
        return (C38774e9) f(f380457n.a());
    }

    public boolean k() {
        return a(f380462s.a(), false);
    }

    public boolean l() {
        return a(f380463t.a(), false);
    }

    public int a(@j.N EnumC39076qd enumC39076qd, int i12) {
        Rd rdB = b(enumC39076qd);
        return rdB == null ? i12 : a(rdB.a(), i12);
    }

    public C38774e9 b(@j.N EnumC39076qd enumC39076qd, int i12) {
        Rd rdB = b(enumC39076qd);
        return rdB != null ? (C38774e9) b(rdB.a(), i12) : this;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38798f8
    @j.P
    public String c() {
        return a(f380466w.a(), (String) null);
    }

    public long f(long j12) {
        return a(f380458o.a(), j12);
    }

    public long a(@j.N EnumC39076qd enumC39076qd, long j12) {
        Rd rdA = a(enumC39076qd);
        return rdA == null ? j12 : a(rdA.a(), j12);
    }

    public C38774e9 b(@j.N EnumC39076qd enumC39076qd, long j12) {
        Rd rdA = a(enumC39076qd);
        return rdA != null ? (C38774e9) b(rdA.a(), j12) : this;
    }

    @j.N
    public C38774e9 a(@j.N String str, @j.N String str2, @j.P String str3) {
        return (C38774e9) b(new Rd(androidx.compose.ui.graphics.colorspace.e.n("LAST_SOCKET_REPORT_TIMES_", str, "_", str2), null).a(), str3);
    }

    public long b(long j12) {
        return a(f380461r.a(), j12);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39056ph
    @j.P
    public String b() {
        return a(f380464u.a(), (String) null);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39056ph
    @j.N
    public InterfaceC39056ph b(@j.N String str) {
        return (InterfaceC39056ph) b(f380464u.a(), str);
    }

    private Rd b(@j.N EnumC39076qd enumC39076qd) {
        int iOrdinal = enumC39076qd.ordinal();
        if (iOrdinal == 0) {
            return f380451h;
        }
        if (iOrdinal == 1) {
            return f380452i;
        }
        if (iOrdinal != 2) {
            return null;
        }
        return f380453j;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39056ph
    public long a() {
        return a(f380465v.a(), 0L);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39056ph
    @j.N
    public InterfaceC39056ph a(long j12) {
        return (InterfaceC39056ph) b(f380465v.a(), j12);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38798f8
    public void a(@j.N String str) {
        b(f380466w.a(), str);
    }

    private Rd a(@j.N EnumC39076qd enumC39076qd) {
        int iOrdinal = enumC39076qd.ordinal();
        if (iOrdinal == 0) {
            return f380454k;
        }
        if (iOrdinal == 1) {
            return f380455l;
        }
        if (iOrdinal != 2) {
            return null;
        }
        return f380456m;
    }
}

package com.yandex.metrica.impl.ob;

import android.content.Context;

@Deprecated
/* loaded from: classes7.dex */
public class Pd extends Kd {

    /* renamed from: f, reason: collision with root package name */
    private Rd f379191f;

    /* renamed from: g, reason: collision with root package name */
    private Rd f379192g;

    /* renamed from: h, reason: collision with root package name */
    private Rd f379193h;

    /* renamed from: i, reason: collision with root package name */
    private Rd f379194i;

    /* renamed from: j, reason: collision with root package name */
    private Rd f379195j;

    /* renamed from: k, reason: collision with root package name */
    private Rd f379196k;

    /* renamed from: l, reason: collision with root package name */
    private Rd f379197l;

    /* renamed from: m, reason: collision with root package name */
    private Rd f379198m;

    /* renamed from: n, reason: collision with root package name */
    private Rd f379199n;

    /* renamed from: o, reason: collision with root package name */
    private Rd f379200o;

    /* renamed from: p, reason: collision with root package name */
    static final Rd f379180p = new Rd("PREF_KEY_DEVICE_ID_", null);

    /* renamed from: q, reason: collision with root package name */
    static final Rd f379181q = new Rd("PREF_KEY_UID_", null);

    /* renamed from: r, reason: collision with root package name */
    private static final Rd f379182r = new Rd("PREF_KEY_HOST_URL_", null);

    /* renamed from: s, reason: collision with root package name */
    private static final Rd f379183s = new Rd("PREF_KEY_REPORT_URL_", null);

    /* renamed from: t, reason: collision with root package name */
    private static final Rd f379184t = new Rd("PREF_KEY_GET_AD_URL", null);

    /* renamed from: u, reason: collision with root package name */
    private static final Rd f379185u = new Rd("PREF_KEY_REPORT_AD_URL", null);

    /* renamed from: v, reason: collision with root package name */
    private static final Rd f379186v = new Rd("PREF_KEY_STARTUP_OBTAIN_TIME_", null);

    /* renamed from: w, reason: collision with root package name */
    private static final Rd f379187w = new Rd("PREF_KEY_STARTUP_ENCODED_CLIDS_", null);

    /* renamed from: x, reason: collision with root package name */
    private static final Rd f379188x = new Rd("PREF_KEY_DISTRIBUTION_REFERRER_", null);

    /* renamed from: y, reason: collision with root package name */
    static final Rd f379189y = new Rd("STARTUP_CLIDS_MATCH_WITH_APP_CLIDS_", null);

    /* renamed from: z, reason: collision with root package name */
    static final Rd f379190z = new Rd("PREF_KEY_PINNING_UPDATE_URL", null);

    /* renamed from: A, reason: collision with root package name */
    private static final Rd f379179A = new Rd("PREF_KEY_EASY_COLLECTING_ENABLED_", null);

    public Pd(Context context) {
        this(context, null);
    }

    public long a(long j12) {
        return this.f378704b.getLong(this.f379197l.a(), j12);
    }

    public String b(String str) {
        return this.f378704b.getString(this.f379191f.a(), null);
    }

    public String c(String str) {
        return this.f378704b.getString(this.f379198m.a(), null);
    }

    @Override // com.yandex.metrica.impl.ob.Kd
    public String d() {
        return "_startupserviceinfopreferences";
    }

    public String e(String str) {
        return this.f378704b.getString(this.f379193h.a(), null);
    }

    public String f(String str) {
        return this.f378704b.getString(this.f379196k.a(), null);
    }

    public String g(String str) {
        return this.f378704b.getString(this.f379194i.a(), null);
    }

    public String h(String str) {
        return this.f378704b.getString(this.f379192g.a(), null);
    }

    public Pd i(String str) {
        return (Pd) a(this.f379191f.a(), str);
    }

    public Pd j(String str) {
        return (Pd) a(this.f379192g.a(), str);
    }

    public Pd(Context context, String str) {
        super(context, str);
        this.f379191f = new Rd(f379180p.b());
        this.f379192g = new Rd(f379181q.b(), c());
        this.f379193h = new Rd(f379182r.b(), c());
        this.f379194i = new Rd(f379183s.b(), c());
        this.f379195j = new Rd(f379184t.b(), c());
        this.f379196k = new Rd(f379185u.b(), c());
        this.f379197l = new Rd(f379186v.b(), c());
        this.f379198m = new Rd(f379187w.b(), c());
        this.f379199n = new Rd(f379188x.b(), c());
        this.f379200o = new Rd(f379179A.b(), c());
    }

    public static void b(Context context) {
        C38689b.a(context, "_startupserviceinfopreferences").edit().remove(f379180p.b()).apply();
    }

    public String d(String str) {
        return this.f378704b.getString(this.f379195j.a(), null);
    }

    public void f() {
        a(this.f379191f.a()).a(this.f379192g.a()).a(this.f379193h.a()).a(this.f379194i.a()).a(this.f379195j.a()).a(this.f379196k.a()).a(this.f379197l.a()).a(this.f379200o.a()).a(this.f379198m.a()).a(this.f379199n.b()).a(f379189y.b()).a(f379190z.b()).b();
    }
}

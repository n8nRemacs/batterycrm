package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.C39109s;

@Deprecated
/* loaded from: classes7.dex */
public class Md extends Kd {

    /* renamed from: f, reason: collision with root package name */
    private Rd f378912f;

    /* renamed from: g, reason: collision with root package name */
    private Rd f378913g;

    /* renamed from: h, reason: collision with root package name */
    private Rd f378914h;

    /* renamed from: i, reason: collision with root package name */
    private Rd f378915i;

    /* renamed from: j, reason: collision with root package name */
    private Rd f378916j;

    /* renamed from: k, reason: collision with root package name */
    private Rd f378917k;

    /* renamed from: l, reason: collision with root package name */
    private Rd f378918l;

    /* renamed from: m, reason: collision with root package name */
    private Rd f378919m;

    /* renamed from: n, reason: collision with root package name */
    private Rd f378920n;

    /* renamed from: o, reason: collision with root package name */
    private Rd f378921o;

    /* renamed from: p, reason: collision with root package name */
    private Rd f378922p;

    /* renamed from: q, reason: collision with root package name */
    private Rd f378923q;

    /* renamed from: r, reason: collision with root package name */
    private Rd f378924r;

    /* renamed from: s, reason: collision with root package name */
    private Rd f378925s;

    /* renamed from: t, reason: collision with root package name */
    private Rd f378926t;

    /* renamed from: u, reason: collision with root package name */
    private static final Rd f378906u = new Rd("SESSION_SLEEP_START_", null);

    /* renamed from: v, reason: collision with root package name */
    private static final Rd f378907v = new Rd("SESSION_ID_", null);

    /* renamed from: w, reason: collision with root package name */
    private static final Rd f378908w = new Rd("SESSION_COUNTER_ID_", null);

    /* renamed from: x, reason: collision with root package name */
    private static final Rd f378909x = new Rd("SESSION_INIT_TIME_", null);

    /* renamed from: y, reason: collision with root package name */
    private static final Rd f378910y = new Rd("SESSION_ALIVE_TIME_", null);

    /* renamed from: z, reason: collision with root package name */
    private static final Rd f378911z = new Rd("SESSION_IS_ALIVE_REPORT_NEEDED_", null);

    /* renamed from: A, reason: collision with root package name */
    private static final Rd f378895A = new Rd("BG_SESSION_ID_", null);

    /* renamed from: B, reason: collision with root package name */
    private static final Rd f378896B = new Rd("BG_SESSION_SLEEP_START_", null);

    /* renamed from: C, reason: collision with root package name */
    private static final Rd f378897C = new Rd("BG_SESSION_COUNTER_ID_", null);

    /* renamed from: D, reason: collision with root package name */
    private static final Rd f378898D = new Rd("BG_SESSION_INIT_TIME_", null);

    /* renamed from: E, reason: collision with root package name */
    private static final Rd f378899E = new Rd("IDENTITY_SEND_TIME_", null);

    /* renamed from: F, reason: collision with root package name */
    private static final Rd f378900F = new Rd("USER_INFO_", null);

    /* renamed from: G, reason: collision with root package name */
    private static final Rd f378901G = new Rd("REFERRER_", null);

    /* renamed from: H, reason: collision with root package name */
    @Deprecated
    public static final Rd f378902H = new Rd("APP_ENVIRONMENT", null);

    /* renamed from: I, reason: collision with root package name */
    @Deprecated
    public static final Rd f378903I = new Rd("APP_ENVIRONMENT_REVISION", null);

    /* renamed from: J, reason: collision with root package name */
    private static final Rd f378904J = new Rd("APP_ENVIRONMENT_", null);

    /* renamed from: K, reason: collision with root package name */
    private static final Rd f378905K = new Rd("APP_ENVIRONMENT_REVISION_", null);

    public Md(Context context, String str) {
        super(context, str);
        this.f378912f = new Rd(f378906u.b(), c());
        this.f378913g = new Rd(f378907v.b(), c());
        this.f378914h = new Rd(f378908w.b(), c());
        this.f378915i = new Rd(f378909x.b(), c());
        this.f378916j = new Rd(f378910y.b(), c());
        this.f378917k = new Rd(f378911z.b(), c());
        this.f378918l = new Rd(f378895A.b(), c());
        this.f378919m = new Rd(f378896B.b(), c());
        this.f378920n = new Rd(f378897C.b(), c());
        this.f378921o = new Rd(f378898D.b(), c());
        this.f378922p = new Rd(f378899E.b(), c());
        this.f378923q = new Rd(f378900F.b(), c());
        this.f378924r = new Rd(f378901G.b(), c());
        this.f378925s = new Rd(f378904J.b(), c());
        this.f378926t = new Rd(f378905K.b(), c());
        a(-1);
        c(0);
        b(0);
    }

    public long a(long j12) {
        return this.f378704b.getLong(this.f378921o.a(), j12);
    }

    public long b(long j12) {
        return this.f378704b.getLong(this.f378920n.a(), j12);
    }

    public long c(long j12) {
        return this.f378704b.getLong(this.f378918l.a(), j12);
    }

    @Override // com.yandex.metrica.impl.ob.Kd
    public String d() {
        return "_boundentrypreferences";
    }

    public long e(long j12) {
        return this.f378704b.getLong(this.f378915i.a(), j12);
    }

    public long f(long j12) {
        return this.f378704b.getLong(this.f378914h.a(), j12);
    }

    public long g(long j12) {
        return this.f378704b.getLong(this.f378913g.a(), j12);
    }

    public long h(long j12) {
        return this.f378704b.getLong(this.f378912f.a(), j12);
    }

    public long i(long j12) {
        return this.f378704b.getLong(this.f378922p.a(), j12);
    }

    public long d(long j12) {
        return this.f378704b.getLong(this.f378919m.a(), j12);
    }

    private void c(int i12) {
        C38689b.a(this.f378704b, this.f378912f.a(), i12);
    }

    public Boolean a(boolean z12) {
        return Boolean.valueOf(this.f378704b.getBoolean(this.f378917k.a(), z12));
    }

    public String b(String str) {
        return this.f378704b.getString(this.f378923q.a(), null);
    }

    @j.P
    public C39109s.a f() {
        synchronized (this) {
            try {
                if (!this.f378704b.contains(this.f378925s.a()) || !this.f378704b.contains(this.f378926t.a())) {
                    return null;
                }
                return new C39109s.a(this.f378704b.getString(this.f378925s.a(), "{}"), this.f378704b.getLong(this.f378926t.a(), 0L));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean g() {
        return this.f378704b.contains(this.f378915i.a()) || this.f378704b.contains(this.f378916j.a()) || this.f378704b.contains(this.f378917k.a()) || this.f378704b.contains(this.f378912f.a()) || this.f378704b.contains(this.f378913g.a()) || this.f378704b.contains(this.f378914h.a()) || this.f378704b.contains(this.f378921o.a()) || this.f378704b.contains(this.f378919m.a()) || this.f378704b.contains(this.f378918l.a()) || this.f378704b.contains(this.f378920n.a()) || this.f378704b.contains(this.f378925s.a()) || this.f378704b.contains(this.f378923q.a()) || this.f378704b.contains(this.f378924r.a()) || this.f378704b.contains(this.f378922p.a());
    }

    public void h() {
        this.f378704b.edit().remove(this.f378921o.a()).remove(this.f378920n.a()).remove(this.f378918l.a()).remove(this.f378919m.a()).remove(this.f378915i.a()).remove(this.f378914h.a()).remove(this.f378913g.a()).remove(this.f378912f.a()).remove(this.f378917k.a()).remove(this.f378916j.a()).remove(this.f378923q.a()).remove(this.f378925s.a()).remove(this.f378926t.a()).remove(this.f378924r.a()).remove(this.f378922p.a()).apply();
    }

    public Md i() {
        return (Md) a(this.f378924r.a());
    }

    private void b(int i12) {
        C38689b.a(this.f378704b, this.f378914h.a(), i12);
    }

    public Md a(C39109s.a aVar) {
        synchronized (this) {
            a(this.f378925s.a(), aVar.f381813a);
            a(this.f378926t.a(), Long.valueOf(aVar.f381814b));
        }
        return this;
    }

    private void a(int i12) {
        C38689b.a(this.f378704b, this.f378916j.a(), i12);
    }
}

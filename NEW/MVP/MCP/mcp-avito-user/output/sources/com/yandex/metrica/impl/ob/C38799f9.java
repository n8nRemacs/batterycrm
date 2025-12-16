package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C39081qi;
import com.yandex.metrica.impl.ob.If;
import com.yandex.metrica.impl.ob.Sh;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.f9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38799f9 extends AbstractC38749d9 {

    /* renamed from: c, reason: collision with root package name */
    private Rd f380556c;

    /* renamed from: d, reason: collision with root package name */
    private Rd f380557d;

    /* renamed from: e, reason: collision with root package name */
    private Rd f380558e;

    /* renamed from: f, reason: collision with root package name */
    private Rd f380559f;

    /* renamed from: g, reason: collision with root package name */
    private Rd f380560g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    private Rd f380561h;

    /* renamed from: i, reason: collision with root package name */
    private Rd f380562i;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    private Rd f380563j;

    /* renamed from: k, reason: collision with root package name */
    private Rd f380564k;

    /* renamed from: l, reason: collision with root package name */
    private Rd f380565l;

    /* renamed from: m, reason: collision with root package name */
    private Rd f380566m;

    /* renamed from: n, reason: collision with root package name */
    private Rd f380567n;

    /* renamed from: o, reason: collision with root package name */
    private Rd f380568o;

    /* renamed from: p, reason: collision with root package name */
    private Rd f380569p;

    /* renamed from: q, reason: collision with root package name */
    private Rd f380570q;

    /* renamed from: r, reason: collision with root package name */
    private Rd f380571r;

    /* renamed from: s, reason: collision with root package name */
    private Rd f380572s;

    /* renamed from: t, reason: collision with root package name */
    private Rd f380573t;

    /* renamed from: u, reason: collision with root package name */
    private Rd f380574u;

    /* renamed from: v, reason: collision with root package name */
    private Rd f380575v;

    /* renamed from: w, reason: collision with root package name */
    static final Rd f380552w = new Rd("PREF_KEY_UID_", null);

    /* renamed from: x, reason: collision with root package name */
    private static final Rd f380553x = new Rd("PREF_KEY_HOST_URL_", null);

    /* renamed from: y, reason: collision with root package name */
    private static final Rd f380554y = new Rd("PREF_KEY_HOST_URLS_FROM_STARTUP", null);

    /* renamed from: z, reason: collision with root package name */
    private static final Rd f380555z = new Rd("PREF_KEY_HOST_URLS_FROM_CLIENT", null);

    /* renamed from: A, reason: collision with root package name */
    @Deprecated
    private static final Rd f380535A = new Rd("PREF_KEY_REPORT_URL_", null);

    /* renamed from: B, reason: collision with root package name */
    private static final Rd f380536B = new Rd("PREF_KEY_REPORT_URLS_", null);

    /* renamed from: C, reason: collision with root package name */
    @Deprecated
    private static final Rd f380537C = new Rd("PREF_L_URL", null);

    /* renamed from: D, reason: collision with root package name */
    private static final Rd f380538D = new Rd("PREF_L_URLS", null);

    /* renamed from: E, reason: collision with root package name */
    private static final Rd f380539E = new Rd("PREF_KEY_GET_AD_URL", null);

    /* renamed from: F, reason: collision with root package name */
    private static final Rd f380540F = new Rd("PREF_KEY_REPORT_AD_URL", null);

    /* renamed from: G, reason: collision with root package name */
    private static final Rd f380541G = new Rd("PREF_KEY_STARTUP_OBTAIN_TIME_", null);

    /* renamed from: H, reason: collision with root package name */
    private static final Rd f380542H = new Rd("PREF_KEY_STARTUP_ENCODED_CLIDS_", null);

    /* renamed from: I, reason: collision with root package name */
    static final Rd f380543I = new Rd("PREF_KEY_DEVICE_ID_", null);

    /* renamed from: J, reason: collision with root package name */
    private static final Rd f380544J = new Rd("STARTUP_CLIDS_MATCH_WITH_APP_CLIDS_", null);

    /* renamed from: K, reason: collision with root package name */
    @Deprecated
    private static final Rd f380545K = new Rd("PREF_KEY_PINNING_UPDATE_URL", null);

    /* renamed from: L, reason: collision with root package name */
    private static final Rd f380546L = new Rd("PREF_KEY_EASY_COLLECTING_ENABLED_", null);

    /* renamed from: M, reason: collision with root package name */
    private static final Rd f380547M = new Rd("PREF_KEY_COLLECTING_PACKAGE_INFO_ENABLED_", null);

    /* renamed from: N, reason: collision with root package name */
    private static final Rd f380548N = new Rd("PREF_KEY_PERMISSIONS_COLLECTING_ENABLED_", null);

    /* renamed from: O, reason: collision with root package name */
    private static final Rd f380549O = new Rd("PREF_KEY_FEATURES_COLLECTING_ENABLED_", null);

    /* renamed from: P, reason: collision with root package name */
    private static final Rd f380550P = new Rd("SOCKET_CONFIG_", null);

    /* renamed from: Q, reason: collision with root package name */
    private static final Rd f380551Q = new Rd("LAST_STARTUP_REQUEST_CLIDS", null);

    public C38799f9(S7 s72, String str) {
        super(s72, str);
        this.f380556c = new Rd(f380543I.b());
        this.f380557d = d(f380552w.b());
        this.f380558e = d(f380553x.b());
        this.f380559f = d(f380554y.b());
        this.f380560g = d(f380555z.b());
        this.f380561h = d(f380535A.b());
        this.f380562i = d(f380536B.b());
        this.f380563j = d(f380537C.b());
        this.f380564k = d(f380538D.b());
        this.f380565l = d(f380539E.b());
        this.f380566m = d(f380540F.b());
        this.f380567n = d(f380541G.b());
        this.f380568o = d(f380542H.b());
        this.f380569p = d(f380544J.b());
        this.f380570q = d(f380546L.b());
        this.f380571r = d(f380547M.b());
        this.f380572s = d(f380548N.b());
        this.f380573t = d(f380549O.b());
        this.f380575v = d(f380551Q.b());
        this.f380574u = d(f380550P.b());
    }

    public C38799f9 a(List<String> list) {
        return (C38799f9) b(this.f380564k.a(), Tl.c(list));
    }

    public C38799f9 b(List<String> list) {
        return (C38799f9) b(this.f380562i.a(), Tl.c(list));
    }

    public void f() {
        f(f380545K.a());
        f(this.f380556c.a());
        f(this.f380565l.a());
        f(this.f380571r.a());
        f(this.f380570q.a());
        f(this.f380568o.a());
        f(this.f380573t.a());
        f(this.f380558e.a());
        f(this.f380560g.a());
        f(this.f380559f.a());
        f(this.f380575v.a());
        f(this.f380563j.a());
        f(this.f380564k.a());
        f(this.f380567n.a());
        f(this.f380572s.a());
        f(this.f380566m.a());
        f(this.f380561h.a());
        f(this.f380562i.a());
        f(this.f380574u.a());
        f(this.f380569p.a());
        f(this.f380557d.a());
        f(d(new Rd("PREF_KEY_DISTRIBUTION_REFERRER_", null).b()).a());
        d();
    }

    @j.N
    @Deprecated
    public C39081qi g() {
        C39081qi.b bVar;
        C39081qi.b bVar2;
        C38758di c38758di;
        C39081qi.b bVarI = new C39081qi.b(new Sh(new Sh.a().d(a(this.f380570q.a(), Sh.b.f379441b)).m(a(this.f380571r.a(), Sh.b.f379442c)).n(a(this.f380572s.a(), Sh.b.f379443d)).f(a(this.f380573t.a(), Sh.b.f379444e)))).k(e(this.f380557d.a())).c(Tl.c(e(this.f380559f.a()))).b(Tl.c(e(this.f380560g.a()))).e(e(this.f380568o.a())).i(Tl.c(e(this.f380562i.a()))).e(Tl.c(e(this.f380564k.a()))).f(e(this.f380565l.a())).i(e(this.f380566m.a()));
        String strE = e(this.f380574u.a());
        try {
        } catch (Throwable unused) {
            bVar = bVarI;
        }
        if (TextUtils.isEmpty(strE)) {
            bVar2 = bVarI;
            c38758di = null;
            return bVar2.a(c38758di).h(e(this.f380575v.a())).c(a(this.f380569p.a(), true)).c(a(this.f380567n.a(), -1L)).a();
        }
        JSONObject jSONObject = new JSONObject(strE);
        If.q qVar = new If.q();
        long j12 = jSONObject.getLong("seconds_to_live");
        String string = jSONObject.getString("token");
        JSONArray jSONArray = jSONObject.getJSONArray("ports");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            arrayList.add(Integer.valueOf(jSONArray.getInt(i12)));
        }
        bVar = bVarI;
        try {
            c38758di = new C38758di(j12, string, arrayList, new ArrayList(), jSONObject.getLong("first_delay_seconds"), jSONObject.getInt("launch_delay_seconds"), jSONObject.optLong("open_event_interval_seconds", qVar.f378448g), qVar.f378449h, qVar.f378450i, qVar.f378451j);
            bVar2 = bVar;
        } catch (Throwable unused2) {
            bVar2 = bVar;
            c38758di = null;
            return bVar2.a(c38758di).h(e(this.f380575v.a())).c(a(this.f380569p.a(), true)).c(a(this.f380567n.a(), -1L)).a();
        }
        return bVar2.a(c38758di).h(e(this.f380575v.a())).c(a(this.f380569p.a(), true)).c(a(this.f380567n.a(), -1L)).a();
    }

    @Deprecated
    public String h(String str) {
        return a(this.f380561h.a(), (String) null);
    }

    @Deprecated
    public C38799f9 i(String str) {
        return (C38799f9) b(this.f380556c.a(), str);
    }

    public C38799f9 j(String str) {
        return (C38799f9) b(this.f380568o.a(), str);
    }

    public C38799f9 k(String str) {
        return (C38799f9) b(this.f380565l.a(), str);
    }

    public C38799f9 l(String str) {
        return (C38799f9) b(this.f380558e.a(), str);
    }

    public C38799f9 m(String str) {
        return (C38799f9) b(this.f380566m.a(), str);
    }

    @Deprecated
    public C38799f9 n(String str) {
        return (C38799f9) b(this.f380561h.a(), str);
    }

    public C38799f9 o(String str) {
        return (C38799f9) b(this.f380557d.a(), str);
    }

    public C38799f9 a(boolean z12) {
        return (C38799f9) b(this.f380569p.a(), z12);
    }

    public C38799f9 b(long j12) {
        return (C38799f9) b(this.f380567n.a(), j12);
    }

    @Deprecated
    public String g(String str) {
        return a(this.f380563j.a(), (String) null);
    }
}

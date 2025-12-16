package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.b9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38699b9 extends AbstractC38749d9 {

    /* renamed from: A, reason: collision with root package name */
    static final Rd f380165A;

    /* renamed from: B, reason: collision with root package name */
    static final Rd f380166B;

    /* renamed from: C, reason: collision with root package name */
    static final Rd f380167C;

    /* renamed from: D, reason: collision with root package name */
    static final Rd f380168D;

    /* renamed from: E, reason: collision with root package name */
    static final Rd f380169E;

    /* renamed from: F, reason: collision with root package name */
    static final Rd f380170F;

    /* renamed from: G, reason: collision with root package name */
    static final Rd f380171G;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    static final Rd f380172c = new Rd("UUID", null);

    /* renamed from: d, reason: collision with root package name */
    static final Rd f380173d = new Rd("UUID_RESULT", null);

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    static final Rd f380174e = new Rd("DEVICE_ID", null);

    /* renamed from: f, reason: collision with root package name */
    static final Rd f380175f = new Rd("DEVICE_ID_RESULT", null);

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    static final Rd f380176g = new Rd("DEVICE_ID_HASH", null);

    /* renamed from: h, reason: collision with root package name */
    static final Rd f380177h = new Rd("DEVICE_ID_HASH_RESULT", null);

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    static final Rd f380178i = new Rd("AD_URL_GET", null);

    /* renamed from: j, reason: collision with root package name */
    static final Rd f380179j = new Rd("AD_URL_GET_RESULT", null);

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    static final Rd f380180k = new Rd("AD_URL_REPORT", null);

    /* renamed from: l, reason: collision with root package name */
    static final Rd f380181l = new Rd("AD_URL_REPORT_RESULT", null);

    /* renamed from: m, reason: collision with root package name */
    static final Rd f380182m = new Rd("CUSTOM_HOSTS", null);

    /* renamed from: n, reason: collision with root package name */
    static final Rd f380183n = new Rd("SERVER_TIME_OFFSET", null);

    /* renamed from: o, reason: collision with root package name */
    @Deprecated
    static final Rd f380184o = new Rd("CLIDS", null);

    /* renamed from: p, reason: collision with root package name */
    static final Rd f380185p = new Rd("RESPONSE_CLIDS_RESULT", null);

    /* renamed from: q, reason: collision with root package name */
    static final Rd f380186q = new Rd("CUSTOM_SDK_HOSTS", null);

    /* renamed from: r, reason: collision with root package name */
    static final Rd f380187r = new Rd("CLIENT_CLIDS", null);

    /* renamed from: s, reason: collision with root package name */
    static final Rd f380188s = new Rd("DEFERRED_DEEP_LINK_WAS_CHECKED", null);

    /* renamed from: t, reason: collision with root package name */
    static final Rd f380189t;

    /* renamed from: u, reason: collision with root package name */
    static final Rd f380190u;

    /* renamed from: v, reason: collision with root package name */
    static final Rd f380191v;

    /* renamed from: w, reason: collision with root package name */
    static final Rd f380192w;

    /* renamed from: x, reason: collision with root package name */
    static final Rd f380193x;

    /* renamed from: y, reason: collision with root package name */
    static final Rd f380194y;

    /* renamed from: z, reason: collision with root package name */
    static final Rd f380195z;

    static {
        new Rd("DEPRECATED_NATIVE_CRASHES_CHECKED", null);
        f380189t = new Rd("API_LEVEL", null);
        f380190u = new Rd("ADS_REQUESTED_CONTEXT", null);
        f380191v = new Rd("CONTEXT_HISTORY", null);
        f380192w = new Rd("ACCESS_CONFIG", null);
        f380193x = new Rd("DIAGNOSTICS_CONFIGS_HOLDER", null);
        f380194y = new Rd("NEXT_STARTUP_TIME", null);
        f380195z = new Rd("LAST_UI_CONTEXT_ID", null);
        f380165A = new Rd("GAID", null);
        f380166B = new Rd("HOAID", null);
        f380167C = new Rd("YANDEX_ADV_ID", null);
        f380168D = new Rd("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);
        f380169E = new Rd("SCREEN_INFO", null);
        f380170F = new Rd("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);
        f380171G = new Rd("FEATURES", null);
    }

    public C38699b9(S7 s72) {
        super(s72);
    }

    @j.N
    public C38699b9 a(@j.P W0 w02) {
        return a(f380179j.a(), w02);
    }

    public boolean b(boolean z12) {
        return a(f380168D.a(), z12);
    }

    @j.N
    public C38699b9 c(@j.P W0 w02) {
        return a(f380186q.a(), w02);
    }

    public long d(long j12) {
        return a(f380183n.b(), j12);
    }

    @j.N
    public C38699b9 e(@j.P W0 w02) {
        return a(f380175f.a(), w02);
    }

    @j.N
    public W0 f() {
        return i(f380179j.a());
    }

    @j.N
    public W0 g() {
        return i(f380181l.a());
    }

    @Deprecated
    public String h(String str) {
        return a(f380180k.a(), (String) null);
    }

    public List<String> i() {
        String strA = a(f380182m.a(), (String) null);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return Tl.c(strA);
    }

    @j.N
    public W0 j() {
        return i(f380186q.a());
    }

    @j.N
    public W0 k() {
        return i(f380177h.a());
    }

    @j.N
    public W0 l() {
        return i(f380175f.a());
    }

    @Deprecated
    public String m(String str) {
        return a(f380176g.a(), (String) null);
    }

    @j.N
    public Xh n() {
        String strA = a(f380171G.a(), (String) null);
        try {
            if (!TextUtils.isEmpty(strA)) {
                JSONObject jSONObject = new JSONObject(strA);
                return new Xh(Tl.a(jSONObject, "libSslEnabled", (Boolean) null), U0.a(Tl.b(jSONObject, "STATUS")), Tl.b(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new Xh(null, U0.UNKNOWN, null);
    }

    @j.N
    public W0 o() {
        return i(f380165A.a());
    }

    @j.N
    public W0 p() {
        return i(f380166B.a());
    }

    @Deprecated
    public C38699b9 q(String str) {
        return (C38699b9) b(f380184o.a(), str);
    }

    @j.N
    public W0 r() {
        return i(f380185p.a());
    }

    @Deprecated
    public C38699b9 s(String str) {
        return (C38699b9) b(f380174e.a(), str);
    }

    @Deprecated
    public C38699b9 t(String str) {
        return (C38699b9) b(f380172c.a(), str);
    }

    @j.N
    public W0 u() {
        return i(f380173d.a());
    }

    @j.N
    public W0 v() {
        return i(f380167C.a());
    }

    public boolean w() {
        return a(f380188s.a(), false);
    }

    public boolean x() {
        return a(f380170F.a(), false);
    }

    public C38699b9 y() {
        return (C38699b9) b(f380188s.a(), true);
    }

    public void z() {
        b(f380170F.a(), true);
    }

    @j.N
    public C38699b9 a(@j.N Xh xh2) {
        String strA = f380171G.a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", xh2.b()).put("STATUS", xh2.c().a()).putOpt("ERROR_EXPLANATION", xh2.a());
        } catch (Throwable unused) {
        }
        return (C38699b9) b(strA, jSONObject.toString());
    }

    public long b(long j12) {
        return a(f380189t.a(), j12);
    }

    public C38699b9 c(boolean z12) {
        return (C38699b9) b(f380190u.a(), z12);
    }

    @j.N
    public C38699b9 d(@j.P W0 w02) {
        return a(f380177h.a(), w02);
    }

    public C38699b9 e(long j12) {
        return (C38699b9) b(f380189t.a(), j12);
    }

    @j.N
    public C38699b9 f(@j.P W0 w02) {
        return a(f380165A.a(), w02);
    }

    @Deprecated
    public String g(String str) {
        return a(f380178i.a(), (String) null);
    }

    @j.N
    public C38699b9 h(@j.P W0 w02) {
        return a(f380185p.a(), w02);
    }

    @Deprecated
    public String j(String str) {
        return a(f380184o.a(), (String) null);
    }

    @j.P
    public String k(@j.P String str) {
        return a(f380187r.a(), (String) null);
    }

    @Deprecated
    public String l(String str) {
        return a(f380174e.a(), (String) null);
    }

    @j.N
    public C39096ra m() {
        C39096ra c39096raA = null;
        try {
            String strA = a(f380193x.a(), (String) null);
            if (strA != null) {
                c39096raA = Tl.a(new JSONObject(strA));
            }
        } catch (Throwable unused) {
        }
        return c39096raA == null ? new C39096ra() : c39096raA;
    }

    @Deprecated
    public C38699b9 o(String str) {
        return (C38699b9) b(f380178i.a(), str);
    }

    @Deprecated
    public C38699b9 p(String str) {
        return (C38699b9) b(f380180k.a(), str);
    }

    @j.N
    public long q() {
        return a(f380194y.a(), 0L);
    }

    public C38699b9 r(@j.P String str) {
        return (C38699b9) b(f380187r.a(), str);
    }

    @j.P
    public C38717c2 s() {
        return Tl.f(e(f380169E.a()));
    }

    @j.P
    public C38811fl t() {
        try {
            String strA = a(f380192w.a(), (String) null);
            if (strA != null) {
                return Tl.c(new JSONObject(strA));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @j.N
    public C38699b9 b(@j.P W0 w02) {
        return a(f380181l.a(), w02);
    }

    public long c(long j12) {
        return a(f380195z.a(), j12);
    }

    public C38699b9 d(boolean z12) {
        return (C38699b9) b(f380168D.a(), z12);
    }

    public C38699b9 f(long j12) {
        return (C38699b9) b(f380195z.a(), j12);
    }

    @j.N
    public C38699b9 g(@j.P W0 w02) {
        return a(f380166B.a(), w02);
    }

    public C38699b9 h(long j12) {
        return (C38699b9) b(f380183n.a(), j12);
    }

    @j.N
    public C38699b9 i(@j.P W0 w02) {
        return a(f380173d.a(), w02);
    }

    @j.N
    public C38699b9 j(@j.P W0 w02) {
        return a(f380167C.a(), w02);
    }

    @j.N
    private W0 i(@j.N String str) {
        W0 w02;
        String strA;
        try {
            strA = a(str, (String) null);
        } catch (Throwable unused) {
        }
        if (strA != null) {
            JSONObject jSONObject = new JSONObject(strA);
            w02 = new W0(Tl.b(jSONObject, "ID"), U0.a(Tl.b(jSONObject, "STATUS")), Tl.b(jSONObject, "ERROR_EXPLANATION"));
        } else {
            w02 = null;
        }
        return w02 == null ? new W0(null, U0.UNKNOWN, "no identifier in preferences") : w02;
    }

    public C38699b9 b(List<String> list) {
        return (C38699b9) b(f380182m.a(), Tl.c(list));
    }

    @j.N
    public C38699b9 g(long j12) {
        return (C38699b9) b(f380194y.a(), j12);
    }

    @j.N
    public List<String> h() {
        LinkedList linkedList = new LinkedList();
        List<String> listA = a(f380191v.a(), linkedList);
        return listA == null ? linkedList : listA;
    }

    @Deprecated
    public String n(String str) {
        return a(f380172c.a(), (String) null);
    }

    public boolean a(boolean z12) {
        return a(f380190u.a(), z12);
    }

    public C38699b9 a(@j.N List<String> list) {
        return (C38699b9) b(f380191v.a(), list);
    }

    public C38699b9 a(@j.P C38811fl c38811fl) {
        String string;
        if (c38811fl != null) {
            try {
                string = Tl.a(c38811fl).toString();
            } catch (Throwable unused) {
            }
        } else {
            string = null;
        }
        if (string != null) {
            b(f380192w.a(), string);
        }
        return this;
    }

    public C38699b9 a(@j.N C39096ra c39096ra) {
        return (C38699b9) b(f380193x.a(), Tl.a(c39096ra).toString());
    }

    public void a(@j.P C38717c2 c38717c2) {
        b(f380169E.a(), Tl.a(c38717c2));
    }

    private C38699b9 a(@j.N String str, @j.P W0 w02) {
        String string;
        if (w02 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ID", w02.f379795a).put("STATUS", w02.f379796b.a()).put("ERROR_EXPLANATION", w02.f379797c);
                } catch (Throwable unused) {
                }
                string = jSONObject.toString();
            } catch (Throwable unused2) {
            }
        } else {
            string = null;
        }
        if (string != null) {
            b(str, string);
        }
        return this;
    }
}

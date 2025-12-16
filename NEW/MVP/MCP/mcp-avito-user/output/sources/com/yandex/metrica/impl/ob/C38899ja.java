package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ja, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38899ja {

    /* renamed from: y, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C38899ja f380864y;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, O7> f380865a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, S7> f380866b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, R7> f380867c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final M7 f380868d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f380869e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private O7 f380870f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private O7 f380871g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private R7 f380872h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private R7 f380873i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    private R7 f380874j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    private R7 f380875k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    private S7 f380876l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    private S7 f380877m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    private S7 f380878n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    private S7 f380879o;

    /* renamed from: p, reason: collision with root package name */
    @j.P
    private S7 f380880p;

    /* renamed from: q, reason: collision with root package name */
    @j.P
    private S7 f380881q;

    /* renamed from: r, reason: collision with root package name */
    @j.P
    private U7 f380882r;

    /* renamed from: s, reason: collision with root package name */
    @j.P
    private T7 f380883s;

    /* renamed from: t, reason: collision with root package name */
    @j.P
    private V7 f380884t;

    /* renamed from: u, reason: collision with root package name */
    @j.P
    private S7 f380885u;

    /* renamed from: v, reason: collision with root package name */
    @j.P
    private C38848h8 f380886v;

    /* renamed from: w, reason: collision with root package name */
    @j.N
    private final B0 f380887w;

    /* renamed from: x, reason: collision with root package name */
    @j.N
    private final C38924ka f380888x;

    public C38899ja(Context context, @j.N M7 m72, @j.N B0 b02) {
        this.f380869e = context;
        this.f380868d = m72;
        this.f380887w = b02;
        this.f380888x = new C38924ka(context, b02);
    }

    public static C38899ja a(Context context) {
        if (f380864y == null) {
            synchronized (C38899ja.class) {
                try {
                    if (f380864y == null) {
                        f380864y = new C38899ja(context.getApplicationContext(), C38897j8.a(), new B0());
                    }
                } finally {
                }
            }
        }
        return f380864y;
    }

    private R7 k() {
        O7 o72;
        if (this.f380874j == null) {
            synchronized (this) {
                try {
                    if (this.f380871g == null) {
                        this.f380871g = new O7(this.f380869e, a("metrica_aip.db"), this.f380868d.a());
                    }
                    o72 = this.f380871g;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f380874j = new C38850ha(new C38873i8(o72), "binary_data");
        }
        return this.f380874j;
    }

    private S7 l() {
        C38848h8 c38848h8;
        if (this.f380880p == null) {
            synchronized (this) {
                try {
                    if (this.f380886v == null) {
                        String strA = a("metrica_client_data.db");
                        Context context = this.f380869e;
                        this.f380886v = new C38848h8(context, strA, new C39156tm(context, "metrica_client_data.db"), this.f380868d.b());
                    }
                    c38848h8 = this.f380886v;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f380880p = new C38949la("preferences", c38848h8);
        }
        return this.f380880p;
    }

    private R7 m() {
        if (this.f380872h == null) {
            this.f380872h = new C38850ha(new C38873i8(r()), "binary_data");
        }
        return this.f380872h;
    }

    public synchronized S7 b(I3 i32) {
        S7 c38949la;
        String string = i32.toString();
        c38949la = this.f380866b.get(string);
        if (c38949la == null) {
            c38949la = new C38949la(c(i32), "preferences");
            this.f380866b.put(string, c38949la);
        }
        return c38949la;
    }

    public synchronized S7 c() {
        try {
            if (this.f380881q == null) {
                this.f380881q = new C38974ma(this.f380869e, W7.CLIENT, l());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f380881q;
    }

    public synchronized S7 d() {
        return l();
    }

    public synchronized T7 e() {
        try {
            if (this.f380883s == null) {
                this.f380883s = new T7(r());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f380883s;
    }

    public synchronized U7 f() {
        try {
            if (this.f380882r == null) {
                this.f380882r = new U7(r());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f380882r;
    }

    public synchronized S7 g() {
        try {
            if (this.f380885u == null) {
                String strA = a("metrica_multiprocess_data.db");
                Context context = this.f380869e;
                this.f380885u = new C38949la("preferences", new C38848h8(context, strA, new C39156tm(context, "metrica_multiprocess_data.db"), this.f380868d.d()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f380885u;
    }

    public synchronized V7 h() {
        try {
            if (this.f380884t == null) {
                this.f380884t = new V7(r(), "permissions");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f380884t;
    }

    public synchronized S7 i() {
        try {
            if (this.f380877m == null) {
                Context context = this.f380869e;
                W7 w72 = W7.SERVICE;
                if (this.f380876l == null) {
                    this.f380876l = new C38949la(r(), "preferences");
                }
                this.f380877m = new C38974ma(context, w72, this.f380876l);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f380877m;
    }

    public synchronized S7 j() {
        try {
            if (this.f380876l == null) {
                this.f380876l = new C38949la(r(), "preferences");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f380876l;
    }

    public synchronized R7 n() {
        try {
            if (this.f380873i == null) {
                this.f380873i = new C38875ia(this.f380869e, W7.SERVICE, m());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f380873i;
    }

    public synchronized R7 o() {
        return m();
    }

    public synchronized S7 p() {
        try {
            if (this.f380879o == null) {
                Context context = this.f380869e;
                W7 w72 = W7.SERVICE;
                if (this.f380878n == null) {
                    this.f380878n = new C38949la(r(), "startup");
                }
                this.f380879o = new C38974ma(context, w72, this.f380878n);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f380879o;
    }

    public synchronized S7 q() {
        try {
            if (this.f380878n == null) {
                this.f380878n = new C38949la(r(), "startup");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f380878n;
    }

    public synchronized O7 r() {
        String strA;
        try {
            if (this.f380870f == null) {
                File fileC = this.f380887w.c(this.f380869e);
                X7 x7E = this.f380868d.e();
                Context context = this.f380869e;
                if (fileC == null || (strA = this.f380888x.a("metrica_data.db", fileC)) == null) {
                    strA = a("metrica_data.db");
                }
                this.f380870f = new O7(context, strA, x7E);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f380870f;
    }

    public synchronized O7 c(I3 i32) {
        O7 o72;
        String strA;
        try {
            String str = "db_metrica_" + i32;
            o72 = this.f380865a.get(str);
            if (o72 == null) {
                File fileC = this.f380887w.c(this.f380869e);
                X7 x7C = this.f380868d.c();
                Context context = this.f380869e;
                if (fileC == null || (strA = this.f380888x.a(str, fileC)) == null) {
                    strA = a(str);
                }
                O7 o73 = new O7(context, strA, x7C);
                this.f380865a.put(str, o73);
                o72 = o73;
            }
        } finally {
        }
        return o72;
    }

    public synchronized R7 b() {
        return k();
    }

    @j.N
    public synchronized R7 a(@j.N I3 i32) {
        R7 c38850ha;
        String string = i32.toString();
        c38850ha = this.f380867c.get(string);
        if (c38850ha == null) {
            c38850ha = new C38850ha(new C38873i8(c(i32)), "binary_data");
            this.f380867c.put(string, c38850ha);
        }
        return c38850ha;
    }

    public synchronized R7 a() {
        try {
            if (this.f380875k == null) {
                this.f380875k = new C38875ia(this.f380869e, W7.AUTO_INAPP, k());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f380875k;
    }

    private String a(@j.N String str) {
        return A2.a(21) ? this.f380888x.a(str) : str;
    }
}

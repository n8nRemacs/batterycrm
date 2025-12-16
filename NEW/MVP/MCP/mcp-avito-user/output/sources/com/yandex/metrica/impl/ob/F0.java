package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.impl.ob.C39112s2;
import com.yandex.metrica.impl.ob.C39241xb;
import com.yandex.metrica.impl.ob.InterfaceC38800fa;
import com.yandex.metrica.impl.ob.Jf;
import com.yandex.metrica.networktasks.api.NetworkCore;
import com.yandex.metrica.networktasks.api.NetworkServiceLocator;

/* loaded from: classes7.dex */
public final class F0 {

    /* renamed from: x, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile F0 f378087x;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f378088a;

    /* renamed from: b, reason: collision with root package name */
    private volatile C39126sg f378089b;

    /* renamed from: c, reason: collision with root package name */
    private volatile C38931kh f378090c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private volatile Jf f378091d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private volatile C38876ib f378092e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private volatile C39112s2 f378093f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private volatile C38757dh f378094g;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private volatile Xj f378096i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private volatile E f378097j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    private volatile C38891j2 f378098k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    private volatile C39075qc f378099l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    private volatile C39241xb f378100m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    private volatile Bb f378101n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    private volatile I1 f378102o;

    /* renamed from: p, reason: collision with root package name */
    @j.P
    private volatile I f378103p;

    /* renamed from: q, reason: collision with root package name */
    @j.P
    private volatile C38774e9 f378104q;

    /* renamed from: r, reason: collision with root package name */
    @j.P
    private volatile C38773e8 f378105r;

    /* renamed from: t, reason: collision with root package name */
    @j.N
    private C38791f1 f378107t;

    /* renamed from: u, reason: collision with root package name */
    @j.P
    private C39123sd f378108u;

    /* renamed from: v, reason: collision with root package name */
    @j.N
    private final InterfaceC38941l2 f378109v = new a(this);

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private volatile Pm f378095h = new Pm();

    /* renamed from: s, reason: collision with root package name */
    @j.N
    private C38767e2 f378106s = new C38767e2();

    /* renamed from: w, reason: collision with root package name */
    @j.N
    private C38902jd f378110w = new C38902jd();

    public class a implements InterfaceC38941l2 {
        public a(F0 f02) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38941l2
        public void a() {
            NetworkServiceLocator.f382415b.getClass();
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38941l2
        public void b() {
            NetworkServiceLocator.f382415b.b();
        }
    }

    private F0(@j.N Context context) {
        this.f378088a = context;
        this.f378107t = new C38791f1(context, this.f378095h.a());
        this.f378097j = new E(this.f378095h.a(), this.f378107t.b());
        NetworkServiceLocator.a();
    }

    public static void a(@j.N Context context) {
        if (f378087x == null) {
            synchronized (F0.class) {
                try {
                    if (f378087x == null) {
                        f378087x = new F0(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
    }

    public static F0 g() {
        return f378087x;
    }

    private void y() {
        if (this.f378102o == null) {
            synchronized (this) {
                try {
                    if (this.f378102o == null) {
                        ProtobufStateStorage protobufStateStorageA = InterfaceC38800fa.b.a(Ud.class).a(this.f378088a);
                        Ud ud2 = (Ud) protobufStateStorageA.read();
                        this.f378102o = new I1(this.f378088a, protobufStateStorageA, new C38704be(), new Td(ud2), new C38829ge(), new C38679ae(this.f378088a), new C38729ce(g().s()), new Vd(), ud2, "[PreloadInfoStorage]");
                    }
                } finally {
                }
            }
        }
    }

    @j.N
    public C39205w b() {
        return this.f378107t.a();
    }

    @j.N
    public E c() {
        return this.f378097j;
    }

    @j.N
    public I d() {
        if (this.f378103p == null) {
            synchronized (this) {
                try {
                    if (this.f378103p == null) {
                        ProtobufStateStorage protobufStateStorageA = InterfaceC38800fa.b.a(C39185v3.class).a(this.f378088a);
                        this.f378103p = new I(this.f378088a, protobufStateStorageA, new C39209w3(), new C39089r3(), new C39257y3(), new C38667a2(this.f378088a), new C39233x3(s()), new C39113s3(), (C39185v3) protobufStateStorageA.read(), "[ClidsInfoStorage]");
                    }
                } finally {
                }
            }
        }
        return this.f378103p;
    }

    @j.N
    public Context e() {
        return this.f378088a;
    }

    @j.N
    public C38876ib f() {
        if (this.f378092e == null) {
            synchronized (this) {
                try {
                    if (this.f378092e == null) {
                        this.f378092e = new C38876ib(this.f378107t.a(), new C38851hb());
                    }
                } finally {
                }
            }
        }
        return this.f378092e;
    }

    @j.N
    public C38791f1 h() {
        return this.f378107t;
    }

    @j.N
    public C39075qc i() {
        C39075qc c39075qc = this.f378099l;
        if (c39075qc == null) {
            synchronized (this) {
                try {
                    c39075qc = this.f378099l;
                    if (c39075qc == null) {
                        c39075qc = new C39075qc(this.f378088a);
                        this.f378099l = c39075qc;
                    }
                } finally {
                }
            }
        }
        return c39075qc;
    }

    @j.N
    public C38902jd j() {
        return this.f378110w;
    }

    @j.N
    public I1 k() {
        y();
        return this.f378102o;
    }

    @j.N
    public Jf l() {
        if (this.f378091d == null) {
            synchronized (this) {
                try {
                    if (this.f378091d == null) {
                        Context context = this.f378088a;
                        ProtobufStateStorage protobufStateStorageA = InterfaceC38800fa.b.a(Jf.e.class).a(this.f378088a);
                        C39112s2 c39112s2U = u();
                        if (this.f378090c == null) {
                            synchronized (this) {
                                if (this.f378090c == null) {
                                    this.f378090c = new C38931kh();
                                }
                            }
                        }
                        this.f378091d = new Jf(context, protobufStateStorageA, c39112s2U, this.f378090c, this.f378095h.g(), new Ml());
                    }
                } catch (Throwable th2) {
                    throw th2;
                } finally {
                }
            }
        }
        return this.f378091d;
    }

    @j.N
    public C39126sg m() {
        if (this.f378089b == null) {
            synchronized (this) {
                try {
                    if (this.f378089b == null) {
                        this.f378089b = new C39126sg(this.f378088a);
                    }
                } finally {
                }
            }
        }
        return this.f378089b;
    }

    @j.N
    public C38767e2 n() {
        return this.f378106s;
    }

    @j.N
    public C38757dh o() {
        if (this.f378094g == null) {
            synchronized (this) {
                try {
                    if (this.f378094g == null) {
                        this.f378094g = new C38757dh(this.f378088a, this.f378095h.g());
                    }
                } finally {
                }
            }
        }
        return this.f378094g;
    }

    @j.P
    public synchronized C38891j2 p() {
        return this.f378098k;
    }

    @j.N
    public Pm q() {
        return this.f378095h;
    }

    @j.N
    public C39241xb r() {
        if (this.f378100m == null) {
            synchronized (this) {
                try {
                    if (this.f378100m == null) {
                        this.f378100m = new C39241xb(new C39241xb.h(), new C39241xb.d(), new C39241xb.c(), this.f378095h.a(), "ServiceInternal");
                    }
                } finally {
                }
            }
        }
        return this.f378100m;
    }

    @j.N
    public C38774e9 s() {
        if (this.f378104q == null) {
            synchronized (this) {
                try {
                    if (this.f378104q == null) {
                        this.f378104q = new C38774e9(C38899ja.a(this.f378088a).i());
                    }
                } finally {
                }
            }
        }
        return this.f378104q;
    }

    @j.N
    public synchronized C39123sd t() {
        try {
            if (this.f378108u == null) {
                this.f378108u = new C39123sd(this.f378088a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f378108u;
    }

    @j.N
    public C39112s2 u() {
        if (this.f378093f == null) {
            synchronized (this) {
                try {
                    if (this.f378093f == null) {
                        this.f378093f = new C39112s2(new C39112s2.b(s()));
                    }
                } finally {
                }
            }
        }
        return this.f378093f;
    }

    @j.N
    public Xj v() {
        if (this.f378096i == null) {
            synchronized (this) {
                try {
                    if (this.f378096i == null) {
                        this.f378096i = new Xj(this.f378088a, this.f378095h.h());
                    }
                } finally {
                }
            }
        }
        return this.f378096i;
    }

    @j.N
    public synchronized C38773e8 w() {
        try {
            if (this.f378105r == null) {
                this.f378105r = new C38773e8(this.f378088a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f378105r;
    }

    public synchronized void x() {
        com.yandex.metrica.coreutils.services.a aVar = com.yandex.metrica.coreutils.services.h.f377659c.f377661b;
        aVar.f377639b.getClass();
        aVar.f377638a = System.currentTimeMillis();
        NetworkServiceLocator networkServiceLocator = NetworkServiceLocator.f382415b;
        if (networkServiceLocator.f382416a == null) {
            synchronized (networkServiceLocator) {
                try {
                    if (networkServiceLocator.f382416a == null) {
                        NetworkCore networkCore = new NetworkCore();
                        networkServiceLocator.f382416a = networkCore;
                        networkCore.setName("YMM-NC");
                        networkServiceLocator.f382416a.start();
                    }
                } finally {
                }
            }
        }
        this.f378107t.a(this.f378109v);
        l().a();
        y();
        i().b();
    }

    public synchronized void a(@j.N C39057pi c39057pi) {
        try {
            if (this.f378100m != null) {
                this.f378100m.a(c39057pi);
            }
            if (this.f378094g != null) {
                this.f378094g.b(c39057pi);
            }
            com.yandex.metrica.coreutils.services.h.f377659c.a(new com.yandex.metrica.coreutils.services.g(c39057pi.o(), c39057pi.B()));
            if (this.f378092e != null) {
                this.f378092e.b(c39057pi);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @j.N
    public Bb a() {
        if (this.f378101n == null) {
            synchronized (this) {
                try {
                    if (this.f378101n == null) {
                        this.f378101n = new Bb(this.f378088a, Cb.a());
                    }
                } finally {
                }
            }
        }
        return this.f378101n;
    }

    public synchronized void a(@j.N C38916k2 c38916k2) {
        this.f378098k = new C38891j2(this.f378088a, c38916k2);
    }
}

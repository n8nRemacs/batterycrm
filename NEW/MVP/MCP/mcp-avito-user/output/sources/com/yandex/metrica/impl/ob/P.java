package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import com.yandex.metrica.core.api.executors.ICommonExecutor;

/* loaded from: classes7.dex */
public class P {

    /* renamed from: j, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile P f379111j;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Xl f379112a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38939l0 f379113b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Im f379114c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C39279z1 f379115d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final C39062q f379116e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final C39016o2 f379117f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final C38665a0 f379118g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final C39038p f379119h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final C39294zg f379120i;

    private P() {
        this(new Xl(), new C39062q(), new Im());
    }

    public static P g() {
        if (f379111j == null) {
            synchronized (P.class) {
                try {
                    if (f379111j == null) {
                        f379111j = new P(new Xl(), new C39062q(), new Im());
                    }
                } finally {
                }
            }
        }
        return f379111j;
    }

    @j.N
    public C39038p a() {
        return this.f379119h;
    }

    @j.N
    public C39062q b() {
        return this.f379116e;
    }

    @j.N
    public ICommonExecutor c() {
        return this.f379114c.a();
    }

    @j.N
    public Im d() {
        return this.f379114c;
    }

    @j.N
    public C38665a0 e() {
        return this.f379118g;
    }

    @j.N
    public C38939l0 f() {
        return this.f379113b;
    }

    @j.N
    public Xl h() {
        return this.f379112a;
    }

    @j.N
    public C39279z1 i() {
        return this.f379115d;
    }

    @j.N
    public InterfaceC38712bm j() {
        return this.f379112a;
    }

    @j.N
    public C39294zg k() {
        return this.f379120i;
    }

    @j.N
    public C39016o2 l() {
        return this.f379117f;
    }

    private P(@j.N Xl xl2, @j.N C39062q c39062q, @j.N Im im2) {
        this(xl2, c39062q, im2, new C39038p(c39062q, im2.a()));
    }

    private P(@j.N Xl xl2, @j.N C39062q c39062q, @j.N Im im2, @j.N C39038p c39038p) {
        this(xl2, new C38939l0(), im2, c39038p, new C39279z1(xl2), c39062q, new C39016o2(c39062q, im2.a(), c39038p), new C38665a0(c39062q), new C39294zg());
    }

    @j.k0
    public P(@j.N Xl xl2, @j.N C38939l0 c38939l0, @j.N Im im2, @j.N C39038p c39038p, @j.N C39279z1 c39279z1, @j.N C39062q c39062q, @j.N C39016o2 c39016o2, @j.N C38665a0 c38665a0, @j.N C39294zg c39294zg) {
        this.f379112a = xl2;
        this.f379113b = c38939l0;
        this.f379114c = im2;
        this.f379119h = c39038p;
        this.f379115d = c39279z1;
        this.f379116e = c39062q;
        this.f379117f = c39016o2;
        this.f379118g = c38665a0;
        this.f379120i = c39294zg;
    }
}

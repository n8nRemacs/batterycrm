package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class Vc {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39194vc f379782a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Xj f379783b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final H2 f379784c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C39075qc f379785d;

    /* renamed from: e, reason: collision with root package name */
    private final C38774e9 f379786e;

    public Vc(@j.N C39194vc c39194vc, @j.N H2 h22, @j.N C38774e9 c38774e9) {
        this(c39194vc, F0.g().v(), h22, c38774e9, F0.g().i());
    }

    private void a() {
        boolean zG2 = this.f379786e.g();
        this.f379782a.a(zG2);
        this.f379784c.a(zG2);
        this.f379783b.a(zG2);
        this.f379785d.c();
    }

    public void b(@j.N Object obj) {
        this.f379782a.b(obj);
        this.f379783b.b();
    }

    @j.k0
    public Vc(@j.N C39194vc c39194vc, @j.N Xj xj2, @j.N H2 h22, @j.N C38774e9 c38774e9, @j.N C39075qc c39075qc) {
        this.f379782a = c39194vc;
        this.f379783b = xj2;
        this.f379784c = h22;
        this.f379786e = c38774e9;
        this.f379785d = c39075qc;
        c39075qc.a(xj2);
        a();
    }

    public void a(@j.N Object obj) {
        this.f379782a.a(obj);
        this.f379783b.a();
    }

    public void a(boolean z12) {
        this.f379782a.a(z12);
        this.f379783b.a(z12);
        this.f379784c.a(z12);
        this.f379786e.d(z12);
    }

    public void a(@j.N C39057pi c39057pi) {
        this.f379785d.a(c39057pi);
        this.f379784c.a(c39057pi);
        this.f379783b.a(c39057pi);
    }
}

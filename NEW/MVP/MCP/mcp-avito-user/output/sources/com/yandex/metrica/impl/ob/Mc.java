package com.yandex.metrica.impl.ob;

import android.location.Location;

/* loaded from: classes7.dex */
class Mc {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Bc f378891a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38852hc f378892b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Sc f378893c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Rb f378894d;

    public Mc(@j.N Nc nc2) {
        Oc oc2 = new Oc(nc2.f378991a.f379361a);
        Sb sb2 = nc2.f378991a;
        this(nc2, oc2, new Sc(sb2.f379361a, nc2.f378992b, nc2.f378993c, nc2.f378994d, nc2.f378995e, sb2.f379362b), new Rb(nc2.f378993c, nc2.f378994d, nc2.f378995e));
    }

    public void a() {
        this.f378893c.a();
    }

    @j.P
    public Location b() {
        return this.f378891a.b();
    }

    public void c() {
        this.f378891a.a();
        this.f378892b.b();
    }

    public void d() {
        this.f378891a.c();
        this.f378892b.d();
    }

    public void e() {
        this.f378891a.d();
        this.f378892b.e();
    }

    private Mc(@j.N Nc nc2, @j.N Oc oc2, @j.N Sc sc2, @j.N Rb rb2) {
        this(nc2, oc2, Cc.a(nc2, sc2, rb2, oc2.a()), sc2, rb2);
    }

    public void a(@j.N C39057pi c39057pi) {
        this.f378893c.a(c39057pi);
        this.f378891a.a(c39057pi);
    }

    public void a(@j.P C38976mc c38976mc) {
        this.f378893c.a(c38976mc);
        this.f378894d.a(c38976mc);
        this.f378891a.a(c38976mc);
        this.f378892b.a(c38976mc);
    }

    private Mc(@j.N Nc nc2, @j.N Oc oc2, @j.N Cc cc2, @j.N Sc sc2, @j.N Rb rb2) {
        this(nc2, oc2, cc2, new Pc(nc2.f378991a.f379361a, nc2.f378993c, sc2, rb2, nc2.f378992b.d()), sc2, rb2);
    }

    private Mc(@j.N Nc nc2, @j.N Oc oc2, @j.N Cc cc2, @j.N Pc pc2, @j.N Sc sc2, @j.N Rb rb2) {
        this(nc2, new Bc(cc2, pc2), new C38852hc(C38877ic.a(nc2, sc2, rb2, oc2.c(), oc2.b())), sc2, rb2);
    }

    @j.k0
    public Mc(@j.N Nc nc2, @j.N Bc bc2, @j.N C38852hc c38852hc, @j.N Sc sc2, @j.N Rb rb2) {
        this.f378891a = bc2;
        this.f378892b = c38852hc;
        this.f378893c = sc2;
        this.f378894d = rb2;
    }
}

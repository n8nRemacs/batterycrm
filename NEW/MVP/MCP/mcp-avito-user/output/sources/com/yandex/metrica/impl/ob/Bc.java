package com.yandex.metrica.impl.ob;

import android.location.Location;
import com.yandex.metrica.impl.ob.H0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class Bc implements J0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private Pc f377836a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private Cc f377837b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final List<Ec<?>> f377838c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final InterfaceC39051pc<Xb> f377839d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final InterfaceC39051pc<Xb> f377840e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final InterfaceC39051pc<Xb> f377841f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final InterfaceC39051pc<C38727cc> f377842g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final H0 f377843h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f377844i;

    public Bc(@j.N Cc cc2, @j.N Pc pc2) {
        this(cc2, pc2, F0.g().s());
    }

    @Override // com.yandex.metrica.impl.ob.J0
    public void a() {
        if (this.f377844i) {
            Iterator<Ec<?>> it = this.f377838c.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }
    }

    @j.P
    public Location b() {
        if (this.f377844i) {
            return this.f377836a.a();
        }
        return null;
    }

    public void c() {
        if (this.f377844i) {
            this.f377843h.c();
            Iterator<Ec<?>> it = this.f377838c.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void d() {
        this.f377843h.d();
        Iterator<Ec<?>> it = this.f377838c.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private Bc(@j.N Cc cc2, @j.N Pc pc2, @j.N C38774e9 c38774e9) {
        this(cc2, pc2, new C38802fc(cc2, c38774e9), new C38926kc(cc2, c38774e9), new Lc(cc2), new C38777ec(cc2, c38774e9, pc2), new H0.c());
    }

    @j.k0
    public Bc(@j.N Cc cc2, @j.N Pc pc2, @j.N Pb pb2, @j.N Pb pb3, @j.N Lc lc2, @j.N C38777ec c38777ec, @j.N H0.c cVar) {
        Xb xb2;
        C38727cc c38727cc;
        Xb xb3;
        Xb xb4;
        this.f377837b = cc2;
        C38976mc c38976mc = cc2.f377901c;
        if (c38976mc != null) {
            this.f377844i = c38976mc.f381043g;
            xb2 = c38976mc.f381050n;
            xb3 = c38976mc.f381051o;
            xb4 = c38976mc.f381052p;
            c38727cc = c38976mc.f381053q;
        } else {
            xb2 = null;
            c38727cc = null;
            xb3 = null;
            xb4 = null;
        }
        this.f377836a = pc2;
        Ec<Xb> ecA = pb2.a(pc2, xb3);
        Ec<Xb> ecA2 = pb3.a(pc2, xb2);
        Ec<Xb> ecA3 = lc2.a(pc2, xb4);
        Ec<C38727cc> ecA4 = c38777ec.a(c38727cc);
        this.f377838c = Arrays.asList(ecA, ecA2, ecA3, ecA4);
        this.f377839d = ecA2;
        this.f377840e = ecA;
        this.f377841f = ecA3;
        this.f377842g = ecA4;
        H0 h0A = cVar.a(this.f377837b.f377899a.f379362b, this, this.f377836a.b());
        this.f377843h = h0A;
        this.f377836a.b().a(h0A);
    }

    public void a(@j.N C39057pi c39057pi) {
        this.f377836a.a(c39057pi);
    }

    public void a(@j.P C38976mc c38976mc) {
        this.f377844i = c38976mc != null && c38976mc.f381043g;
        this.f377836a.a(c38976mc);
        ((Ec) this.f377839d).a(c38976mc == null ? null : c38976mc.f381050n);
        ((Ec) this.f377840e).a(c38976mc == null ? null : c38976mc.f381051o);
        ((Ec) this.f377841f).a(c38976mc == null ? null : c38976mc.f381052p);
        ((Ec) this.f377842g).a(c38976mc != null ? c38976mc.f381053q : null);
        a();
    }
}

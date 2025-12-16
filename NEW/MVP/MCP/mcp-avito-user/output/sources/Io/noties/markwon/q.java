package io.noties.markwon;

import Q61.C14869c;
import io.noties.markwon.n;
import j.N;
import j.P;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MarkwonVisitorImpl.java */
/* loaded from: classes8.dex */
class q implements n {

    /* renamed from: a, reason: collision with root package name */
    public final g f401925a;

    /* renamed from: b, reason: collision with root package name */
    public final y f401926b;

    /* renamed from: c, reason: collision with root package name */
    public final C f401927c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<Class<? extends Q61.v>, n.c<? extends Q61.v>> f401928d;

    /* compiled from: MarkwonVisitorImpl.java */
    public static class a implements n.b {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f401929a = new HashMap();

        @Override // io.noties.markwon.n.b
        @N
        public final <N extends Q61.v> n.b a(@N Class<N> cls, @P n.c<? super N> cVar) {
            this.f401929a.put(cls, cVar);
            return this;
        }
    }

    public q(@N g gVar, @N y yVar, @N C c12, @N Map map, @N C41741b c41741b) {
        this.f401925a = gVar;
        this.f401926b = yVar;
        this.f401927c = c12;
        this.f401928d = map;
    }

    @Override // Q61.C
    public final void A(Q61.j jVar) {
        k(jVar);
    }

    @Override // Q61.C
    public final void B(Q61.g gVar) {
        k(gVar);
    }

    @Override // Q61.C
    public final void C(Q61.n nVar) {
        k(nVar);
    }

    @Override // Q61.C
    public final void D(C14869c c14869c) {
        k(c14869c);
    }

    @Override // Q61.C
    public final void E(Q61.e eVar) {
        k(eVar);
    }

    @Override // io.noties.markwon.n
    public final void F(@N Q61.v vVar) {
        Q61.v vVar2 = vVar.f13501b;
        while (vVar2 != null) {
            Q61.v vVar3 = vVar2.f13504e;
            vVar2.a(this);
            vVar2 = vVar3;
        }
    }

    @Override // Q61.C
    public final void G(Q61.B b12) {
        k(b12);
    }

    @Override // io.noties.markwon.n
    public final void a(int i12, @P Object obj) {
        C c12 = this.f401927c;
        C.c(c12, obj, i12, c12.f401646b.length());
    }

    @Override // Q61.C
    public final void b(Q61.o oVar) {
        k(oVar);
    }

    @Override // io.noties.markwon.n
    @N
    public final C builder() {
        return this.f401927c;
    }

    @Override // Q61.C
    public final void c(Q61.y yVar) {
        k(yVar);
    }

    @Override // Q61.C
    public final void d(Q61.f fVar) {
        k(fVar);
    }

    @Override // Q61.C
    public final void e(Q61.p pVar) {
        k(pVar);
    }

    @Override // io.noties.markwon.n
    @N
    public final y f() {
        return this.f401926b;
    }

    @Override // Q61.C
    public final void g(Q61.z zVar) {
        k(zVar);
    }

    @Override // Q61.C
    public final void h(Q61.A a12) {
        k(a12);
    }

    @Override // io.noties.markwon.n
    public final <N extends Q61.v> void i(@N N n12, int i12) {
        Class<?> cls = n12.getClass();
        g gVar = this.f401925a;
        B bA2 = ((m) gVar.f401717g).a(cls);
        if (bA2 != null) {
            a(i12, bA2.a(gVar, this.f401926b));
        }
    }

    @Override // Q61.C
    public final void j(Q61.r rVar) {
        k(rVar);
    }

    public final void k(@N Q61.v vVar) {
        n.c<? extends Q61.v> cVar = this.f401928d.get(vVar.getClass());
        if (cVar != null) {
            cVar.a(vVar, this);
        } else {
            F(vVar);
        }
    }

    @Override // Q61.C
    public final void l(Q61.u uVar) {
        k(uVar);
    }

    @Override // io.noties.markwon.n
    public final int length() {
        return this.f401927c.f401646b.length();
    }

    @Override // Q61.C
    public final void m(Q61.d dVar) {
        k(dVar);
    }

    @Override // Q61.C
    public final void n(Q61.l lVar) {
        k(lVar);
    }

    @Override // Q61.C
    public final void o(Q61.q qVar) {
        k(qVar);
    }

    @Override // Q61.C
    public final void p(Q61.m mVar) {
        k(mVar);
    }

    @Override // Q61.C
    public final void q(Q61.k kVar) {
        k(kVar);
    }

    @Override // io.noties.markwon.n
    public final boolean r(@N Q61.v vVar) {
        return vVar.f13504e != null;
    }

    @Override // Q61.C
    public final void s(Q61.s sVar) {
        k(sVar);
    }

    @Override // io.noties.markwon.n
    public final void t(@N Q61.v vVar) {
        w();
    }

    @Override // io.noties.markwon.n
    @N
    public final g u() {
        return this.f401925a;
    }

    @Override // Q61.C
    public final void v(Q61.w wVar) {
        k(wVar);
    }

    @Override // io.noties.markwon.n
    public final void w() {
        C c12 = this.f401927c;
        StringBuilder sb2 = c12.f401646b;
        if (sb2.length() <= 0 || '\n' == sb2.charAt(sb2.length() - 1)) {
            return;
        }
        c12.a('\n');
    }

    @Override // io.noties.markwon.n
    public final void x(@N Q61.v vVar) {
        if (vVar.f13504e != null) {
            w();
            this.f401927c.a('\n');
        }
    }

    @Override // Q61.C
    public final void y(Q61.i iVar) {
        k(iVar);
    }

    @Override // Q61.C
    public final void z(Q61.x xVar) {
        k(xVar);
    }
}

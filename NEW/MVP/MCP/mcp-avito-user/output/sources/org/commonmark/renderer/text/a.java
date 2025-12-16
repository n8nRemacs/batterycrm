package org.commonmark.renderer.text;

import Q61.A;
import Q61.AbstractC14867a;
import Q61.AbstractC14868b;
import Q61.B;
import Q61.C14869c;
import Q61.i;
import Q61.k;
import Q61.l;
import Q61.m;
import Q61.n;
import Q61.o;
import Q61.p;
import Q61.q;
import Q61.r;
import Q61.u;
import Q61.v;
import Q61.w;
import Q61.x;
import Q61.y;
import org.commonmark.renderer.text.e;

/* compiled from: CoreTextContentNodeRenderer.java */
/* loaded from: classes7.dex */
public class a extends AbstractC14867a implements T61.a {

    /* renamed from: a, reason: collision with root package name */
    public final b f420392a;

    /* renamed from: b, reason: collision with root package name */
    public final f f420393b;

    /* renamed from: c, reason: collision with root package name */
    public P61.b f420394c;

    public a(b bVar) {
        this.f420392a = bVar;
        this.f420393b = ((e.b) bVar).f420397a;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void C(n nVar) {
        J(nVar.f13489f);
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void D(C14869c c14869c) {
        this.f420393b.getClass();
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void E(Q61.e eVar) {
        this.f420393b.getClass();
        throw null;
    }

    @Override // Q61.AbstractC14867a
    public final void F(v vVar) {
        v vVar2 = vVar.f13501b;
        while (vVar2 != null) {
            v vVar3 = vVar2.f13504e;
            ((e.b) this.f420392a).f420398b.a(vVar2);
            vVar2 = vVar3;
        }
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void G(B b12) {
        ((e.b) this.f420392a).a();
        this.f420393b.getClass();
        throw null;
    }

    public final void H(v vVar, Character ch2) {
        ((e.b) this.f420392a).a();
        if (vVar.f13504e != null) {
            this.f420393b.getClass();
        }
    }

    public final void I(v vVar, String str, String str2) {
        boolean z12 = false;
        boolean z13 = vVar.f13501b != null;
        boolean z14 = (str == null || str.equals(str2)) ? false : true;
        if (str2 != null && !str2.equals("")) {
            z12 = true;
        }
        f fVar = this.f420393b;
        if (z13) {
            fVar.getClass();
            throw null;
        }
        if (z14) {
            fVar.getClass();
            throw null;
        }
        if (z12) {
            fVar.getClass();
            throw null;
        }
        if (z13) {
            if (z14 || z12) {
                fVar.getClass();
                throw null;
            }
        }
    }

    public final void J(String str) {
        ((e.b) this.f420392a).a();
        this.f420393b.getClass();
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void b(o oVar) {
        J(oVar.f13490f);
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void c(y yVar) {
        H(yVar, null);
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void e(p pVar) {
        I(pVar, pVar.f13492g, pVar.f13491f);
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void h(A a12) {
        J(a12.f13480f);
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void j(r rVar) {
        I(rVar, rVar.f13495g, rVar.f13494f);
    }

    @Override // T61.a
    public final void k(v vVar) {
        vVar.a(this);
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void l(u uVar) {
        P61.b bVar = this.f420394c;
        b bVar2 = this.f420392a;
        f fVar = this.f420393b;
        if (bVar != null && (bVar instanceof P61.c)) {
            ((e.b) bVar2).a();
            fVar.getClass();
            throw null;
        }
        if (bVar == null || !(bVar instanceof P61.a)) {
            return;
        }
        ((e.b) bVar2).a();
        fVar.getClass();
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void m(Q61.d dVar) {
        if (this.f420394c != null) {
            ((e.b) this.f420392a).a();
            this.f420393b.getClass();
        }
        P61.a aVar = new P61.a(this.f420394c);
        char c12 = dVar.f13481g;
        this.f420394c = aVar;
        F(dVar);
        H(dVar, null);
        P61.b bVar = this.f420394c.f12839a;
        if (bVar != null) {
            this.f420394c = bVar;
        } else {
            this.f420394c = null;
        }
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void n(l lVar) {
        H(lVar, null);
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void o(q qVar) {
        ((e.b) this.f420392a).a();
        String str = qVar.f13493f;
        this.f420393b.getClass();
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void p(m mVar) {
        F(mVar);
        H(mVar, ':');
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void q(k kVar) {
        ((e.b) this.f420392a).a();
        String str = kVar.f13487j;
        this.f420393b.getClass();
        throw null;
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void v(w wVar) {
        if (this.f420394c != null) {
            ((e.b) this.f420392a).a();
            this.f420393b.getClass();
        }
        P61.c cVar = new P61.c(this.f420394c);
        char c12 = wVar.f13506h;
        this.f420394c = cVar;
        F(wVar);
        H(wVar, null);
        P61.b bVar = this.f420394c.f12839a;
        if (bVar != null) {
            this.f420394c = bVar;
        } else {
            this.f420394c = null;
        }
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void y(i iVar) {
        F(iVar);
    }

    @Override // Q61.AbstractC14867a, Q61.C
    public final void z(x xVar) {
        F(xVar);
        v vVar = xVar.f13500a;
        if (((AbstractC14868b) vVar) == null || (((AbstractC14868b) vVar) instanceof i)) {
            H(xVar, null);
        }
    }
}

package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class v7h implements abh {
    public final String a = v7h.class.getName();
    public x9f b;
    public final ContextScope c;
    public final k18 d;
    public final k18 e;
    public cbh f;
    public final jve g;
    public final gbd h;

    public v7h(k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.c = d7j.a(((q2b) ((lzf) k18Var2.getValue())).c().plus(zk6.a()));
        this.d = k18Var;
        this.e = k18Var3;
        jve jveVarB = kve.b(1, 0, 2);
        this.g = jveVarB;
        this.h = new gbd(jveVarB);
    }

    @Override // defpackage.abh
    public final void d() {
        if (this.f != null) {
            w8h w8hVar = (w8h) ue3.I(this.h.a.b());
            if (w8hVar != null) {
                w8hVar.o = v8h.X;
                this.g.h(w8hVar);
            }
            x9f x9fVar = this.b;
            if (x9fVar != null) {
                x9fVar.cancel((CancellationException) null);
            }
            this.b = null;
            cbh cbhVar = this.f;
            if (cbhVar != null) {
                cbhVar.clear();
            }
            cbh cbhVar2 = this.f;
            if (cbhVar2 != null) {
                ((z2f) this.d.getValue()).a(cbhVar2);
            }
            this.f = null;
        }
    }

    @Override // defpackage.abh
    public final void f(float f) {
        cbh cbhVar = this.f;
        if (cbhVar != null) {
            cbhVar.b(f);
        }
    }

    @Override // defpackage.abh
    public final void g() {
        if (this.f != null) {
            w8h w8hVar = (w8h) ue3.I(this.h.a.b());
            if (w8hVar != null) {
                w8hVar.o = v8h.o;
                this.g.h(w8hVar);
            }
            x9f x9fVar = this.b;
            if (x9fVar != null) {
                x9fVar.cancel((CancellationException) null);
            }
            this.b = null;
            cbh cbhVar = this.f;
            if (cbhVar != null) {
                cbhVar.clear();
            }
            cbh cbhVar2 = this.f;
            if (cbhVar2 != null) {
                ((z2f) this.d.getValue()).a(cbhVar2);
            }
            this.f = null;
        }
    }

    @Override // defpackage.abh
    public final void o() {
        if (this.f != null) {
            w8h w8hVar = (w8h) ue3.I(this.h.a.b());
            if (w8hVar != null) {
                w8hVar.o = v8h.d;
                this.g.h(w8hVar);
            }
            x9f x9fVar = this.b;
            if (x9fVar != null) {
                x9fVar.cancel((CancellationException) null);
            }
            this.b = null;
        }
    }

    @Override // defpackage.abh
    public final void r() {
        if (this.f != null) {
            w8h w8hVar = (w8h) ue3.I(this.h.a.b());
            if (w8hVar != null) {
                w8hVar.o = v8h.b;
                this.g.h(w8hVar);
            }
            cbh cbhVar = this.f;
            if (cbhVar == null) {
                return;
            }
            this.b = svi.e(this.c, null, null, new r7h(cbhVar, this, null), 3);
        }
    }
}

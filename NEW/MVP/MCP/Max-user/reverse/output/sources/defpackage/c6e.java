package defpackage;

/* loaded from: classes2.dex */
public final class c6e extends xfh {
    public final hbd X;
    public final hbd Y;
    public final ci5 Z;
    public final long b;
    public final uf2 c;
    public final zr2 d;
    public final z44 o = new z44(11, this);

    public c6e(z5e z5eVar, long j, uf2 uf2Var, zr2 zr2Var) {
        this.b = j;
        this.c = uf2Var;
        this.d = zr2Var;
        this.X = (hbd) zr2Var.i;
        hbd hbdVar = (hbd) zr2Var.j;
        this.Y = hbdVar;
        this.Z = new ci5(0);
        gw0.w(new g56(new gbd(z5eVar.a), new a6e(this, null), 1), this.a);
        gw0.w(new g56(new d53(hbdVar, 12), new b6e(this, null), 1), this.a);
    }

    public final void t() {
        this.o.f(false);
        zr2 zr2Var = this.d;
        cs2 cs2Var = (cs2) zr2Var.a;
        cs2Var.g = null;
        cs2Var.a();
        cs2Var.a();
        ((tcf) zr2Var.h).setValue(null);
        ((tcf) zr2Var.g).m(null, d7e.a);
    }

    public final void u(boolean z) {
        this.o.f(true);
        zr2 zr2Var = this.d;
        cs2 cs2Var = (cs2) zr2Var.a;
        e7e e7eVar = new e7e(z);
        tcf tcfVar = (tcf) zr2Var.g;
        if (fni.a(tcfVar.getValue(), e7eVar)) {
            return;
        }
        tcfVar.m(null, e7eVar);
        svi.e(cs2Var.e, null, null, new bs2(cs2Var, null), 3);
        cs2Var.g = zr2Var;
    }
}

package defpackage;

/* loaded from: classes.dex */
public abstract class l6i extends im3 {
    public final ck0 k;

    public l6i(ck0 ck0Var) {
        this.k = ck0Var;
    }

    public d99 A(d99 d99Var) {
        return d99Var;
    }

    public abstract void B(s9g s9gVar);

    public final void C() {
        z(null, this.k);
    }

    public void D() {
        C();
    }

    @Override // defpackage.ck0
    public final s9g h() {
        return this.k.h();
    }

    @Override // defpackage.ck0
    public final k09 i() {
        return this.k.i();
    }

    @Override // defpackage.ck0
    public final boolean j() {
        return this.k.j();
    }

    @Override // defpackage.ck0
    public final void m(wgg wggVar) {
        this.j = wggVar;
        this.i = zxg.n(null);
        D();
    }

    @Override // defpackage.ck0
    public void t(k09 k09Var) {
        this.k.t(k09Var);
    }

    @Override // defpackage.im3
    public final d99 v(Object obj, d99 d99Var) {
        return A(d99Var);
    }

    @Override // defpackage.im3
    public final long w(Object obj, long j, d99 d99Var) {
        return j;
    }

    @Override // defpackage.im3
    public final int x(int i, Object obj) {
        return i;
    }

    @Override // defpackage.im3
    public final void y(Object obj, ck0 ck0Var, s9g s9gVar) {
        B(s9gVar);
    }
}

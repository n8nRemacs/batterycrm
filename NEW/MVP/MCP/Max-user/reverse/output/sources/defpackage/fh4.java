package defpackage;

/* loaded from: classes.dex */
public final class fh4 extends ih4 {
    @Override // defpackage.ih4
    public final int n(ce5 ce5Var) {
        return ce5Var.y();
    }

    @Override // defpackage.ih4
    public final fh7 o() {
        fh7 fh7Var = new fh7();
        fh7Var.a = 0;
        fh7Var.b = false;
        fh7Var.c = false;
        return fh7Var;
    }

    @Override // defpackage.ih4
    public final synchronized boolean s(ce5 ce5Var, int i) {
        return hj0.b(i) ? false : this.g.e(ce5Var, i);
    }
}

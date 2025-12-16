package defpackage;

/* loaded from: classes.dex */
public final class at6 implements ycf {
    public final n2g a;

    public at6(n2g n2gVar) {
        this.a = n2gVar;
    }

    @Override // defpackage.ycf
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.ycf
    public final boolean b(ab0 ab0Var) {
        int i = ab0Var.b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.a.d(ab0Var.a);
        return true;
    }
}

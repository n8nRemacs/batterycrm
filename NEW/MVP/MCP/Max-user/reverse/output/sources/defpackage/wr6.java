package defpackage;

/* loaded from: classes.dex */
public final class wr6 implements ycf {
    public final dyg a;
    public final n2g b;

    public wr6(dyg dygVar, n2g n2gVar) {
        this.a = dygVar;
        this.b = n2gVar;
    }

    @Override // defpackage.ycf
    public final boolean a(Exception exc) {
        this.b.c(exc);
        return true;
    }

    @Override // defpackage.ycf
    public final boolean b(ab0 ab0Var) {
        if (ab0Var.b != 4 || this.a.a(ab0Var)) {
            return false;
        }
        String str = ab0Var.c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.b.b(new ma0(ab0Var.e, ab0Var.f, str));
        return true;
    }
}

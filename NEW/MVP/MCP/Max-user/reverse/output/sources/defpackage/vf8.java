package defpackage;

/* loaded from: classes2.dex */
public final class vf8 extends l0g {
    public fh9 c;

    public vf8(tm9 tm9Var) {
        super(tm9Var);
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        if (str.equals("message")) {
            this.c = ovi.a(tm9Var);
        } else {
            tm9Var.v();
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "{message=" + this.c + "}";
    }
}

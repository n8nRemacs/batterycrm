package defpackage;

/* loaded from: classes2.dex */
public final class gja extends l0g {
    public po3 c;

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        if (str.equals("config")) {
            this.c = h5j.b(tm9Var);
        } else {
            tm9Var.v();
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "{config=" + this.c + "}";
    }
}

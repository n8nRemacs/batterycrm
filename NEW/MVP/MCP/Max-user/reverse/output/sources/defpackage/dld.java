package defpackage;

/* loaded from: classes2.dex */
public final class dld extends l0g {
    public wac c;

    public dld(tm9 tm9Var) {
        super(tm9Var);
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        if (str.equals("profile")) {
            this.c = f6j.c(tm9Var);
        } else {
            tm9Var.v();
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "{profile=" + this.c + "}";
    }
}

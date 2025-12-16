package defpackage;

/* loaded from: classes2.dex */
public final class pt2 extends l0g {
    public qb2 c;

    public pt2(tm9 tm9Var) {
        super(tm9Var);
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        if (str.equals("chat")) {
            this.c = qb2.a(tm9Var);
        } else {
            tm9Var.v();
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "{chat=" + this.c + "}";
    }
}

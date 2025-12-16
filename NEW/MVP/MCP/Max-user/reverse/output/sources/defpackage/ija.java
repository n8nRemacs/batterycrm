package defpackage;

/* loaded from: classes2.dex */
public final class ija extends l0g {
    public gx3 c;

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        if (str.equals("contact")) {
            this.c = gx3.g(tm9Var);
        } else {
            tm9Var.v();
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "{contact=" + this.c + "}";
    }
}

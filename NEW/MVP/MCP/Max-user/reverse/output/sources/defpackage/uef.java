package defpackage;

/* loaded from: classes2.dex */
public final class uef extends l0g {
    public kef c;

    public uef(tm9 tm9Var) {
        super(tm9Var);
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        if (str.equals("sticker")) {
            this.c = kef.a(tm9Var);
        } else {
            tm9Var.v();
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return ho7.i("{sticker = ", this.c.toString(), "}");
    }
}

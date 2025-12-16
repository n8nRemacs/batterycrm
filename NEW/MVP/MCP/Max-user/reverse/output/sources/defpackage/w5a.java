package defpackage;

/* loaded from: classes2.dex */
public final class w5a extends l0g {
    public sz c;

    public w5a(tm9 tm9Var) {
        super(tm9Var);
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        if (str.equals("attachments")) {
            this.c = sz.a(tm9Var);
        } else {
            tm9Var.v();
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "{attaches=" + this.c + "}";
    }
}

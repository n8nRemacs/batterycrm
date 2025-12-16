package defpackage;

/* loaded from: classes2.dex */
public final class m4a extends l0g {
    public ul9 c;

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        if (fni.a(str, "reactionInfo")) {
            this.c = iwi.b(tm9Var);
        } else {
            tm9Var.v();
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return String.valueOf(this.c);
    }
}

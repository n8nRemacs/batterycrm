package defpackage;

/* loaded from: classes2.dex */
public final class c35 extends l0g {
    public long c;

    public c35(tm9 tm9Var) {
        super(tm9Var);
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        if (str.equals("time")) {
            this.c = efi.l(tm9Var, 0L);
        } else {
            tm9Var.v();
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return a9h.d(this.c, "Response{time=", "}");
    }
}

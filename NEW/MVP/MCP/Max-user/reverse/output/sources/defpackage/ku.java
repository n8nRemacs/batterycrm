package defpackage;

/* loaded from: classes2.dex */
public final class ku extends l0g {
    public boolean c;
    public long d;

    public ku(tm9 tm9Var) {
        super(tm9Var);
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        if (str.equals("success")) {
            this.c = efi.g(tm9Var);
        } else if (str.equals("updateTime")) {
            this.d = efi.l(tm9Var, 0L);
        } else {
            tm9Var.v();
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "Response{success=" + this.c + ", updateTime=" + this.d + "}";
    }
}

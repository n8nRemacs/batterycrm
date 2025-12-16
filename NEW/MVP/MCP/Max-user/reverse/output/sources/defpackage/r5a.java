package defpackage;

/* loaded from: classes2.dex */
public final class r5a extends l0g {
    public fh9 c;
    public qb2 d;
    public String o;

    public r5a(tm9 tm9Var) {
        super(tm9Var);
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        switch (str) {
            case "chatAccessToken":
                this.o = efi.o(tm9Var);
                break;
            case "chat":
                this.d = qb2.a(tm9Var);
                break;
            case "message":
                this.c = ovi.a(tm9Var);
                break;
            default:
                tm9Var.v();
                break;
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "Response{, message=" + this.c + ", chat=" + this.d + "}";
    }
}

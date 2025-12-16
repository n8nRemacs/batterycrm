package defpackage;

/* loaded from: classes2.dex */
public final class stb extends l0g {
    public int X;
    public String c;
    public gx3 d;
    public Long o;

    public stb(tm9 tm9Var) {
        super(tm9Var);
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        switch (str) {
            case "profile":
                this.d = gx3.g(tm9Var);
                break;
            case "phone":
                this.o = Long.valueOf(efi.l(tm9Var, 0L));
                break;
            case "token":
                this.c = efi.o(tm9Var);
                break;
            case "tokenType":
                this.X = utb.u(efi.o(tm9Var));
                break;
            default:
                tm9Var.v();
                break;
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "{token='" + this.c + "', profile=" + this.d + ", phone=" + this.o + ", tokenType=" + utb.o(this.X) + "}";
    }
}

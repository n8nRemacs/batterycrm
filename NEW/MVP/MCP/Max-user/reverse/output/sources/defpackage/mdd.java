package defpackage;

/* loaded from: classes2.dex */
public final class mdd extends l0g {
    public String c;
    public boolean d;

    public mdd(tm9 tm9Var) {
        super(tm9Var);
        this.d = true;
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        if (str.equals("tls")) {
            this.d = tm9Var.p0();
        } else if (str.equals("redirectHost")) {
            this.c = efi.o(tm9Var);
        } else {
            tm9Var.v();
        }
    }

    public final String e() {
        int iIndexOf;
        if (l8g.c(this.c) || (iIndexOf = this.c.indexOf(":")) <= 0) {
            return null;
        }
        String str = this.c;
        return str.substring(iIndexOf + 1, str.length());
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "{redirectHost='" + this.c + "', tls=" + this.d + "}";
    }
}

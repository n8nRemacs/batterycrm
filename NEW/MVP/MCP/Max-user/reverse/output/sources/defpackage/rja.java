package defpackage;

/* loaded from: classes2.dex */
public final class rja extends l0g {
    public long c;
    public String d;
    public df8 o;

    public rja(tm9 tm9Var) {
        super(tm9Var);
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        switch (str) {
            case "userId":
                this.c = efi.l(tm9Var, 0L);
                break;
            case "deviceId":
                this.d = efi.o(tm9Var);
                break;
            case "location":
                this.o = df8.a(tm9Var);
                break;
            default:
                tm9Var.v();
                break;
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        long j = this.c;
        String str = this.d;
        df8 df8Var = this.o;
        StringBuilder sbN = ho7.n("Response{userId=", j, ", deviceId='", str);
        sbN.append("', location=");
        sbN.append(df8Var);
        sbN.append("}");
        return sbN.toString();
    }
}

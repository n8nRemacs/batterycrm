package defpackage;

/* loaded from: classes2.dex */
public final class uie extends l0g {
    public sz X;
    public sz Y;
    public Long Z;
    public String c;
    public String d;
    public int o;

    public uie(tm9 tm9Var) {
        super(tm9Var);
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        switch (str) {
            case "proxy-domains":
                this.X = sz.g(tm9Var);
                break;
            case "callsSeed":
                this.Z = Long.valueOf(efi.l(tm9Var, 0L));
                break;
            case "proxy":
                this.c = efi.o(tm9Var);
                break;
            case "reg-country-code":
                this.Y = sz.g(tm9Var);
                break;
            case "app-update-type":
                this.o = efi.k(tm9Var, 0);
                break;
            case "location":
                this.d = efi.o(tm9Var);
                break;
            default:
                tm9Var.v();
                break;
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        String str = this.c;
        String str2 = this.d;
        int i = this.o;
        sz szVar = this.X;
        sz szVar2 = this.Y;
        StringBuilder sbL = wy1.l("{proxy='", str, "', locationCountryCode='", str2, "', appUpdateType=");
        sbL.append(i);
        sbL.append(", proxyDomains=");
        sbL.append(szVar);
        sbL.append(", regCountryCode=");
        sbL.append(szVar2);
        sbL.append("}");
        return sbL.toString();
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final class nka extends l0g {
    public long c;
    public long d;
    public s00 o;

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        switch (str) {
            case "chatId":
                this.c = tm9Var.t0();
                break;
            case "userId":
                this.d = tm9Var.t0();
                break;
            case "type":
                String strO = efi.o(tm9Var);
                if (strO != null) {
                    this.o = s00.a(strO);
                    break;
                }
                break;
            default:
                tm9Var.v();
                break;
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        long j = this.c;
        long j2 = this.d;
        s00 s00Var = this.o;
        StringBuilder sbL = az1.l(j, "{chatId=", ", userId=");
        sbL.append(j2);
        sbL.append(", type=");
        sbL.append(s00Var);
        sbL.append("}");
        return sbL.toString();
    }
}

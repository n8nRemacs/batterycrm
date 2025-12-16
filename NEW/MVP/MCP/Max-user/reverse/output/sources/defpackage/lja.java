package defpackage;

/* loaded from: classes2.dex */
public final class lja extends l0g {
    public kfe X;
    public long c;
    public long d;
    public long o;

    public lja(tm9 tm9Var) {
        super(tm9Var);
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        switch (str) {
            case "chatId":
                this.c = efi.l(tm9Var, 0L);
                break;
            case "userId":
                this.d = efi.l(tm9Var, 0L);
                break;
            case "time":
                this.o = efi.l(tm9Var, 0L);
                break;
            case "draft":
                this.X = t9j.d(tm9Var);
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
        long j3 = this.o;
        kfe kfeVar = this.X;
        StringBuilder sbL = az1.l(j, "Response{chatId=", "userId=");
        sbL.append(j2);
        az1.r(j3, ", time=", ", draft=", sbL);
        sbL.append(kfeVar);
        sbL.append("}");
        return sbL.toString();
    }
}

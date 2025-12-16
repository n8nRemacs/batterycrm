package defpackage;

/* loaded from: classes2.dex */
public final class mja extends l0g {
    public long c;
    public long d;
    public long o;

    public mja(tm9 tm9Var) {
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
        StringBuilder sbL = az1.l(j, "Response{chatId=", ", userId=");
        sbL.append(j2);
        return u45.i(j3, ", time=", "}", sbL);
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final class zq1 extends l0g {
    public String X;
    public String c;
    public long d;
    public uaj o;

    public zq1(tm9 tm9Var) {
        super(tm9Var);
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        switch (str) {
            case "conversationId":
                this.c = efi.o(tm9Var);
                break;
            case "joinLink":
                this.X = efi.o(tm9Var);
                break;
            case "peerId":
                this.d = efi.l(tm9Var, 0L);
                break;
            case "turnServer":
                this.o = uaj.d(tm9Var);
                break;
            default:
                tm9Var.v();
                break;
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        String str = this.c;
        long j = this.d;
        uaj uajVar = this.o;
        String str2 = this.X;
        StringBuilder sbQ = xrf.q("{conversationId='", j, str, "', peerId=");
        sbQ.append(", turnServer=");
        sbQ.append(uajVar);
        sbQ.append(", joinLink=");
        sbQ.append(str2);
        sbQ.append("}");
        return sbQ.toString();
    }
}

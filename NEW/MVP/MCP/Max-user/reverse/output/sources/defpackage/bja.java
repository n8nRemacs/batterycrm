package defpackage;

/* loaded from: classes2.dex */
public final class bja extends l0g {
    public long X;
    public uaj Y;
    public String Z;
    public String c;
    public String d;
    public long o;
    public int s0;

    public bja(tm9 tm9Var) {
        super(tm9Var);
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        int i;
        str.getClass();
        i = 3;
        switch (str) {
            case "conversationId":
                this.c = efi.o(tm9Var);
                break;
            case "chatId":
                this.X = efi.l(tm9Var, 0L);
                break;
            case "callerId":
                this.o = efi.l(tm9Var, 0L);
                break;
            case "vcp":
                this.d = efi.o(tm9Var);
                break;
            case "type":
                String strO = efi.o(tm9Var);
                strO.getClass();
                if (strO.equals("AUDIO")) {
                    i = 2;
                } else if (!strO.equals("VIDEO")) {
                    i = 1;
                }
                this.s0 = i;
                break;
            case "turnServer":
                this.Y = uaj.d(tm9Var);
                break;
            case "sdpOffer":
                this.Z = efi.o(tm9Var);
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
        long j = this.o;
        long j2 = this.X;
        uaj uajVar = this.Y;
        String str3 = this.Z;
        int i = this.s0;
        StringBuilder sbL = wy1.l("{conversationId='", str, "'convParams='", str2, "', callerId=");
        sbL.append(j);
        az1.r(j2, ", chatId=", ", turnServer=", sbL);
        sbL.append(uajVar);
        sbL.append(", sdpOffer='");
        sbL.append(str3);
        sbL.append("', callType=");
        sbL.append(xc0.p(i));
        sbL.append("}");
        return sbL.toString();
    }
}

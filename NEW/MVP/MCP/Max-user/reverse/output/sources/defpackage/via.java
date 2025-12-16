package defpackage;

/* loaded from: classes2.dex */
public final class via extends l0g {
    public String X;
    public long c;
    public long d;
    public long o;

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        switch (str) {
            case "fileId":
                this.o = efi.l(tm9Var, 0L);
                break;
            case "audioId":
                this.c = efi.l(tm9Var, 0L);
                break;
            case "error":
                this.X = efi.o(tm9Var);
                break;
            case "videoId":
                this.d = efi.l(tm9Var, 0L);
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
        String str = this.X;
        StringBuilder sbL = az1.l(j, "{audioId=", ", videoId=");
        sbL.append(j2);
        az1.r(j3, ", fileId=", ", error='", sbL);
        return ho7.l(sbL, str, "'}");
    }
}

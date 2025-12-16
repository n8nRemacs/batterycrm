package defpackage;

/* loaded from: classes2.dex */
public final class ttb extends l0g {
    public int X;
    public int Y;
    public int Z;
    public String c;
    public int d;
    public int o;
    public int s0;

    public ttb(tm9 tm9Var) {
        super(tm9Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
    @Override // defpackage.l0g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.tm9 r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ttb.d(tm9, java.lang.String):void");
    }

    @Override // defpackage.pj0
    public final String toString() {
        String strF = l8g.f(this.c);
        int i = this.d;
        int i2 = this.o;
        int i3 = this.X;
        int i4 = this.Z;
        int i5 = this.Y;
        int i6 = this.s0;
        StringBuilder sbM = utb.m(i, "{token='", strF, "', retries=", ", codeDelay=");
        hf3.g(sbM, i2, ", codeLength=", i3, ", tokenType=");
        sbM.append(utb.o(i4));
        sbM.append(", callDelay=");
        sbM.append(i5);
        sbM.append(", requestType=");
        sbM.append(i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? "null" : "CALL" : "CALL_DELAY" : "SMS" : "UNKNOWN");
        sbM.append("}");
        return sbM.toString();
    }
}

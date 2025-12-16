package defpackage;

/* loaded from: classes2.dex */
public final class y70 extends l0g {
    public final long X;
    public final int Y;
    public final String c;
    public final int d;
    public final long o;

    public y70(String str, int i, long j, long j2, int i2) {
        this.c = str;
        this.d = i;
        this.o = j;
        this.X = j2;
        this.Y = i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.y70 e(defpackage.tm9 r20) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y70.e(tm9):y70");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y70)) {
            return false;
        }
        y70 y70Var = (y70) obj;
        return fni.a(this.c, y70Var.c) && this.d == y70Var.d && this.o == y70Var.o && this.X == y70Var.X && this.Y == y70Var.Y;
    }

    public final int hashCode() {
        return Integer.hashCode(this.Y) + a9h.a(a9h.a(xrf.k(this.d, this.c.hashCode() * 31, 31), 31, this.o), 31, this.X);
    }

    @Override // defpackage.pj0
    public final String toString() {
        StringBuilder sbQ = xrf.q("Response(verifyToken='", this.o, l8g.f(this.c), "', altActionDuration=");
        sbQ.append(", codeLength=");
        sbQ.append(this.d);
        sbQ.append(", requestMaxDuration=");
        utb.n(sbQ, this.X, ", requestCountLeft=", this.Y);
        sbQ.append(")");
        return sbQ.toString();
    }
}

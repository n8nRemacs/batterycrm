package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class jh2 extends sj0 {
    public final int X;
    public final rs4 Y;
    public final List Z;
    public final long b;
    public final long c;
    public final long d;
    public final long o;

    public jh2(long j, long j2, long j3, long j4, int i, rs4 rs4Var, List list) {
        super(j);
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.o = j4;
        this.X = i;
        this.Y = rs4Var;
        this.Z = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh2)) {
            return false;
        }
        jh2 jh2Var = (jh2) obj;
        return this.b == jh2Var.b && this.c == jh2Var.c && this.d == jh2Var.d && this.o == jh2Var.o && this.X == jh2Var.X && this.Y == jh2Var.Y && fni.a(this.Z, jh2Var.Z);
    }

    public final int hashCode() {
        return this.Z.hashCode() + ((this.Y.hashCode() + xrf.k(this.X, a9h.a(a9h.a(a9h.a(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.o), 31)) * 31);
    }

    @Override // defpackage.sj0
    public final String toString() {
        StringBuilder sbL = az1.l(this.b, "ChatHistoryEvent(requestId=", ", chatId=");
        sbL.append(this.c);
        az1.r(this.d, ", startTime=", ", endTime=", sbL);
        utb.n(sbL, this.o, ", count=", this.X);
        sbL.append(", itemType=");
        sbL.append(this.Y);
        sbL.append(", messageIds=");
        sbL.append(this.Z);
        sbL.append(")");
        return sbL.toString();
    }
}

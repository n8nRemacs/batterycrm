package defpackage;

/* loaded from: classes2.dex */
public final class xjb extends sj0 {
    public final long X;
    public final rs4 Y;
    public final long b;
    public final long c;
    public final long d;
    public final String o;

    public xjb(long j, long j2, long j3, String str, long j4, rs4 rs4Var) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.o = str;
        this.X = j4;
        this.Y = rs4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjb)) {
            return false;
        }
        xjb xjbVar = (xjb) obj;
        return this.b == xjbVar.b && this.c == xjbVar.c && this.d == xjbVar.d && fni.a(this.o, xjbVar.o) && this.X == xjbVar.X && this.Y == xjbVar.Y;
    }

    public final int hashCode() {
        int iA = a9h.a(a9h.a(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        String str = this.o;
        return this.Y.hashCode() + a9h.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.X);
    }

    @Override // defpackage.sj0
    public final String toString() {
        StringBuilder sbL = az1.l(this.b, "OutgoingMessageEvent(chatId=", ", cid=");
        sbL.append(this.c);
        az1.r(this.d, ", messageId=", ", tag=", sbL);
        sbL.append(this.o);
        sbL.append(", sender=");
        sbL.append(this.X);
        sbL.append(", itemType=");
        sbL.append(this.Y);
        sbL.append(")");
        return sbL.toString();
    }
}

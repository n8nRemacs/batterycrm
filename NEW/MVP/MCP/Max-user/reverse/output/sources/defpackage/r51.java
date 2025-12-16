package defpackage;

/* loaded from: classes2.dex */
public final class r51 extends sj0 {
    public final long b;
    public final String c;
    public final long d;
    public final String o;

    public r51(long j, long j2, String str, String str2) {
        this.b = j;
        this.c = str;
        this.d = j2;
        this.o = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r51)) {
            return false;
        }
        r51 r51Var = (r51) obj;
        return this.b == r51Var.b && fni.a(this.c, r51Var.c) && this.d == r51Var.d && fni.a(this.o, r51Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + a9h.a(u45.e(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    @Override // defpackage.sj0
    public final String toString() {
        StringBuilder sbN = ho7.n("CallCreateJoinLinkEvent(requestId=", this.b, ", conversationId=", this.c);
        az1.r(this.d, ", peerId=", ", joinLink=", sbN);
        return ho7.l(sbN, this.o, ")");
    }
}

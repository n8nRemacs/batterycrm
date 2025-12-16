package defpackage;

/* loaded from: classes2.dex */
public final class kt5 {
    public final long a;
    public final long b;

    public kt5(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt5)) {
            return false;
        }
        kt5 kt5Var = (kt5) obj;
        return this.a == kt5Var.a && this.b == kt5Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ho7.k(az1.l(this.a, "FcmMessageRemovedData(serverChatId=", ", messageId="), this.b, ")");
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final class nt5 {
    public final long a;
    public final long b;

    public nt5(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt5)) {
            return false;
        }
        nt5 nt5Var = (nt5) obj;
        return this.a == nt5Var.a && this.b == nt5Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ho7.k(az1.l(this.a, "FcmNotificationHistoryDb(chatServerId=", ", lastNotifyMessageId="), this.b, ")");
    }
}

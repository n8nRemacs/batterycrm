package defpackage;

/* loaded from: classes2.dex */
public final class xs5 {
    public final long a;
    public final long b;

    public xs5(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs5)) {
            return false;
        }
        xs5 xs5Var = (xs5) obj;
        return this.a == xs5Var.a && this.b == xs5Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ho7.k(az1.l(this.a, "FcmAnalyticsRemovedEntry(chatId=", ", messageId="), this.b, ")");
    }
}

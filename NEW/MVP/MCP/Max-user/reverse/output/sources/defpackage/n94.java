package defpackage;

/* loaded from: classes2.dex */
public final class n94 implements o94 {
    public final long a;
    public final long b;

    public n94(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n94)) {
            return false;
        }
        n94 n94Var = (n94) obj;
        return this.a == n94Var.a && this.b == n94Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ho7.k(az1.l(this.a, "Success(requestId=", ", chatId="), this.b, ")");
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final class s8d extends u8d {
    public final long a;
    public final long b;

    public s8d(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8d)) {
            return false;
        }
        s8d s8dVar = (s8d) obj;
        return this.a == s8dVar.a && this.b == s8dVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ho7.k(az1.l(this.a, "Success(messageId=", ", totalBytes="), this.b, ")");
    }
}

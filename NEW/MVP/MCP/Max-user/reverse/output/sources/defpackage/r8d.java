package defpackage;

/* loaded from: classes2.dex */
public final class r8d extends u8d {
    public final long a;
    public final long b;

    public r8d(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8d)) {
            return false;
        }
        r8d r8dVar = (r8d) obj;
        return this.a == r8dVar.a && this.b == r8dVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ho7.k(az1.l(this.a, "NeedDownload(messageId=", ", totalBytes="), this.b, ")");
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final class n8i {
    public long a;
    public long b;

    public final void a() {
        this.a = -1L;
        this.b = -1L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8i)) {
            return false;
        }
        n8i n8iVar = (n8i) obj;
        return this.a == n8iVar.a && this.b == n8iVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        long j = this.a;
        return ho7.k(az1.l(j, "VideoCoverage(videoCoverageStart=", ", videoCoverageEnd="), this.b, ")");
    }
}

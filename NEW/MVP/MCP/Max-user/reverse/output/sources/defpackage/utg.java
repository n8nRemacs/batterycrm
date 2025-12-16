package defpackage;

/* loaded from: classes2.dex */
public final class utg {
    public final long a;
    public final long b;
    public long c;

    public /* synthetic */ utg(long j, long j2) {
        this(j, j2, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utg)) {
            return false;
        }
        utg utgVar = (utg) obj;
        return this.a == utgVar.a && this.b == utgVar.b && this.c == utgVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + a9h.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.a;
        long j3 = j + j2;
        long j4 = this.c + j2;
        StringBuilder sbL = az1.l(j2, "Chunk[", " -> ");
        sbL.append(j3);
        return u45.i(j4, " (position: ", ")]", sbL);
    }

    public utg(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }
}

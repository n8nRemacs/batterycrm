package defpackage;

/* loaded from: classes.dex */
public final class y3a implements ry9 {
    public final long a;
    public final long b;
    public final long c;

    public y3a(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = -1L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3a)) {
            return false;
        }
        y3a y3aVar = (y3a) obj;
        return this.a == y3aVar.a && this.b == y3aVar.b && this.c == y3aVar.c;
    }

    public final int hashCode() {
        return fsi.g(this.c) + ((fsi.g(this.b) + ((fsi.g(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    public y3a(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }
}

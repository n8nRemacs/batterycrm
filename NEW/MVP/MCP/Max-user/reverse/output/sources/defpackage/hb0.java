package defpackage;

/* loaded from: classes.dex */
public final class hb0 {
    public final long a;
    public final long b;
    public final h90 c;

    public hb0(long j, long j2, h90 h90Var) {
        this.a = j;
        this.b = j2;
        this.c = h90Var;
    }

    public static hb0 a(long j, long j2, h90 h90Var) {
        z5j.a("duration must be positive value.", j >= 0);
        z5j.a("bytes must be positive value.", j2 >= 0);
        return new hb0(j, j2, h90Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hb0) {
            hb0 hb0Var = (hb0) obj;
            if (this.a == hb0Var.a && this.b == hb0Var.b && this.c.equals(hb0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.a + ", numBytesRecorded=" + this.b + ", audioStats=" + this.c + "}";
    }
}

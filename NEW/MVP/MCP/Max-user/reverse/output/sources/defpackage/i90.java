package defpackage;

/* loaded from: classes.dex */
public final class i90 {
    public final int a;
    public final long b;

    public i90(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i90) {
            i90 i90Var = (i90) obj;
            if (this.a == i90Var.a && this.b == i90Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        long j = this.b;
        return i ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PacketInfo{sizeInBytes=");
        sb.append(this.a);
        sb.append(", timestampNs=");
        return ho7.k(sb, this.b, "}");
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final class ry0 {
    public final sy0 a;
    public final long b;

    public ry0(sy0 sy0Var, long j) {
        this.a = sy0Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry0)) {
            return false;
        }
        ry0 ry0Var = (ry0) obj;
        return this.a == ry0Var.a && this.b == ry0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CacheItem(type=" + this.a + ", sizeBytes=" + this.b + ")";
    }
}

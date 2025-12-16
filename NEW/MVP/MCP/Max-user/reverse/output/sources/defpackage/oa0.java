package defpackage;

/* loaded from: classes.dex */
public final class oa0 {
    public final j48 a;
    public final p90 b;

    public oa0(j48 j48Var, p90 p90Var) {
        if (j48Var == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.a = j48Var;
        if (p90Var == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.b = p90Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oa0) {
            oa0 oa0Var = (oa0) obj;
            if (this.a.equals(oa0Var.a) && this.b.equals(oa0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.a + ", cameraId=" + this.b + "}";
    }
}

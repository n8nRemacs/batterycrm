package defpackage;

/* loaded from: classes.dex */
public final class p90 {
    public final String a;
    public final ha0 b;

    public p90(String str, ha0 ha0Var) {
        if (str == null) {
            throw new NullPointerException("Null cameraIdString");
        }
        this.a = str;
        if (ha0Var == null) {
            throw new NullPointerException("Null cameraConfigId");
        }
        this.b = ha0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p90) {
            p90 p90Var = (p90) obj;
            if (this.a.equals(p90Var.a) && this.b.equals(p90Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CameraId{cameraIdString=" + this.a + ", cameraConfigId=" + this.b + "}";
    }
}

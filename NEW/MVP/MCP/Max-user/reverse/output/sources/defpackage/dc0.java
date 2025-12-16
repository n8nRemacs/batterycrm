package defpackage;

/* loaded from: classes.dex */
public final class dc0 {
    public final String a;
    public final int b;
    public final z90 c;

    public dc0(String str, int i, z90 z90Var) {
        this.a = str;
        this.b = i;
        this.c = z90Var;
    }

    public final boolean equals(Object obj) {
        z90 z90Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dc0) {
            dc0 dc0Var = (dc0) obj;
            String str = dc0Var.a;
            z90 z90Var2 = dc0Var.c;
            if (this.a.equals(str) && this.b == dc0Var.b && ((z90Var = this.c) != null ? z90Var.equals(z90Var2) : z90Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        z90 z90Var = this.c;
        return iHashCode ^ (z90Var == null ? 0 : z90Var.hashCode());
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.a + ", profile=" + this.b + ", compatibleVideoProfile=" + this.c + "}";
    }
}

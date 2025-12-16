package defpackage;

/* loaded from: classes.dex */
public final class v90 {
    public final ua0 a;
    public final ua0 b;

    public v90(ua0 ua0Var, ua0 ua0Var2) {
        this.a = ua0Var;
        this.b = ua0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v90) {
            v90 v90Var = (v90) obj;
            if (this.a.equals(v90Var.a) && this.b.equals(v90Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.a + ", secondaryOutConfig=" + this.b + "}";
    }
}

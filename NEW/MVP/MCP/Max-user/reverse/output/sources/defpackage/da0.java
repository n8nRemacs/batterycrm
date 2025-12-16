package defpackage;

/* loaded from: classes.dex */
public final class da0 {
    public static final da0 c = new da0(fb0.j, 0);
    public final fb0 a;
    public final int b;

    public da0(fb0 fb0Var, int i) {
        if (fb0Var == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.a = fb0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof da0)) {
            return false;
        }
        da0 da0Var = (da0) obj;
        return this.a.equals(da0Var.a) && this.b == da0Var.b;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb.append(this.a);
        sb.append(", fallbackRule=");
        return ho7.j(sb, this.b, "}");
    }
}

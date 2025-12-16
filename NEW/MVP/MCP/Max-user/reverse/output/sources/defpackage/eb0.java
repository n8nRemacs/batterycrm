package defpackage;

/* loaded from: classes.dex */
public final class eb0 {
    public final fb0 a;
    public final int b;

    public eb0(fb0 fb0Var, int i) {
        if (fb0Var == null) {
            throw new NullPointerException("Null quality");
        }
        this.a = fb0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eb0) {
            eb0 eb0Var = (eb0) obj;
            if (this.a.equals(eb0Var.a) && this.b == eb0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QualityRatio{quality=");
        sb.append(this.a);
        sb.append(", aspectRatio=");
        return ho7.j(sb, this.b, "}");
    }
}

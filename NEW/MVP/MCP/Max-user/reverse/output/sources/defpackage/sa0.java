package defpackage;

/* loaded from: classes.dex */
public final class sa0 {
    public final fc0 a;
    public final g90 b;
    public final int c;

    public sa0(fc0 fc0Var, g90 g90Var, int i) {
        this.a = fc0Var;
        this.b = g90Var;
        this.c = i;
    }

    public static hc8 a() {
        hc8 hc8Var = new hc8(3, false);
        hc8Var.d = -1;
        hc8Var.c = g90.a().b();
        hc8Var.b = fc0.a().a();
        return hc8Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sa0) {
            sa0 sa0Var = (sa0) obj;
            if (this.a.equals(sa0Var.a) && this.b.equals(sa0Var.b) && this.c == sa0Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSpec{videoSpec=");
        sb.append(this.a);
        sb.append(", audioSpec=");
        sb.append(this.b);
        sb.append(", outputFormat=");
        return ho7.j(sb, this.c, "}");
    }
}

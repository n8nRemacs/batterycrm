package defpackage;

/* loaded from: classes.dex */
public final class bb0 {
    public final i85 a;
    public final i85 b;
    public final int c;
    public final int d;

    public bb0(i85 i85Var, i85 i85Var2, int i, int i2) {
        this.a = i85Var;
        this.b = i85Var2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bb0) {
            bb0 bb0Var = (bb0) obj;
            if (this.a.equals(bb0Var.a) && this.b.equals(bb0Var.b) && this.c == bb0Var.c && this.d == bb0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{edge=");
        sb.append(this.a);
        sb.append(", postviewEdge=");
        sb.append(this.b);
        sb.append(", inputFormat=");
        sb.append(this.c);
        sb.append(", outputFormat=");
        return ho7.j(sb, this.d, "}");
    }
}

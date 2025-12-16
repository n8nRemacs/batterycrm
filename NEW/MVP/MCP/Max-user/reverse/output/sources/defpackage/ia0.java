package defpackage;

/* loaded from: classes.dex */
public final class ia0 {
    public final xa0 a;
    public final int b;

    public ia0(xa0 xa0Var, int i) {
        if (xa0Var == null) {
            throw new NullPointerException("Null packet");
        }
        this.a = xa0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ia0) {
            ia0 ia0Var = (ia0) obj;
            if (this.a.equals(ia0Var.a) && this.b == ia0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.a);
        sb.append(", jpegQuality=");
        return ho7.j(sb, this.b, "}");
    }
}

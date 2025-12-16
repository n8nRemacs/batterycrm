package defpackage;

/* loaded from: classes.dex */
public final class m90 {
    public final int a;
    public final n90 b;

    public m90(int i, n90 n90Var) {
        if (i == 0) {
            throw new NullPointerException("Null type");
        }
        this.a = i;
        this.b = n90Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m90)) {
            return false;
        }
        m90 m90Var = (m90) obj;
        int i = m90Var.a;
        n90 n90Var = m90Var.b;
        if (!az1.c(this.a, i)) {
            return false;
        }
        n90 n90Var2 = this.b;
        return n90Var2 == null ? n90Var == null : n90Var2.equals(n90Var);
    }

    public final int hashCode() {
        int iV = (az1.v(this.a) ^ 1000003) * 1000003;
        n90 n90Var = this.b;
        return iV ^ (n90Var == null ? 0 : n90Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraState{type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "CLOSING" : "OPEN" : "OPENING" : "PENDING_OPEN");
        sb.append(", error=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}

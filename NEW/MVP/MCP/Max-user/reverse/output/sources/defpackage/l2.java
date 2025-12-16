package defpackage;

/* loaded from: classes.dex */
public final class l2 implements xi3 {
    public final long a;
    public final n2 b;

    public l2(long j, n2 n2Var) {
        this.a = j;
        this.b = n2Var;
    }

    public final long a(xi3 xi3Var) {
        if (xi3Var instanceof l2) {
            l2 l2Var = (l2) xi3Var;
            n2 n2Var = l2Var.b;
            n2 n2Var2 = this.b;
            if (fni.a(n2Var2, n2Var)) {
                return s65.l(bsi.e(this.a, l2Var.a, (y65) n2Var2.b), s65.k(0L, 0L));
            }
        }
        throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + xi3Var);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return s65.d(a((xi3) obj), 0L);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l2)) {
            return false;
        }
        if (!fni.a(this.b, ((l2) obj).b)) {
            return false;
        }
        long jA = a((xi3) obj);
        int i = s65.d;
        return s65.e(jA, 0L);
    }

    public final int hashCode() {
        int i = s65.d;
        return Long.hashCode(this.a) + (Long.hashCode(0L) * 37);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LongTimeMark(");
        sb.append(this.a);
        n2 n2Var = this.b;
        sb.append(w9j.f((y65) n2Var.b));
        sb.append(" + ");
        sb.append((Object) s65.n(0L));
        sb.append(", ");
        sb.append(n2Var);
        sb.append(')');
        return sb.toString();
    }
}

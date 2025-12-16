package defpackage;

/* loaded from: classes2.dex */
public final class v82 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public v82(int i, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static v82 a(v82 v82Var, boolean z, boolean z2, boolean z3, int i) {
        int i2 = v82Var.a;
        if ((i & 8) != 0) {
            z3 = v82Var.d;
        }
        return new v82(i2, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v82)) {
            return false;
        }
        v82 v82Var = (v82) obj;
        return this.a == v82Var.a && this.b == v82Var.b && this.c == v82Var.c && this.d == v82Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + a9h.b(a9h.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "ChangeLinkScreenState(title=" + this.a + ", hasChanges=" + this.b + ", enabledButton=" + this.c + ", hasProgress=" + this.d + ")";
    }
}

package defpackage;

/* loaded from: classes.dex */
public final class gy6 {
    public static final gy6 e = hy6.l(Integer.MIN_VALUE, 1, hy6.E0, 0.0f);
    public final boolean a;
    public final dy6 b;
    public final bxe c;
    public final float d;

    public gy6(boolean z, dy6 dy6Var, bxe bxeVar, float f) {
        this.a = z;
        this.b = dy6Var;
        this.c = bxeVar;
        this.d = f;
    }

    public final bxe a(boolean z) {
        wx6 wx6Var = hy6.E0;
        bxe bxeVar = this.c;
        return bxeVar != wx6Var ? bxeVar : this.d == 0.0f ? z ? hy6.H0 : hy6.M0 : hy6.N0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gy6.class != obj.getClass()) {
            return false;
        }
        gy6 gy6Var = (gy6) obj;
        return this.c.equals(gy6Var.c) && this.b.equals(gy6Var.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}

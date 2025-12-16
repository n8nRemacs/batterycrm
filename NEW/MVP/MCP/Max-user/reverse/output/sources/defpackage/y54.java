package defpackage;

/* loaded from: classes.dex */
public final class y54 {
    public static final y54 d = new y54();
    public final int a;
    public final int b;
    public final boolean c;

    public /* synthetic */ y54() {
        this(0, 0, true);
    }

    public static y54 a(y54 y54Var, int i, int i2, boolean z, int i3) {
        if ((i3 & 1) != 0) {
            i = y54Var.a;
        }
        if ((i3 & 2) != 0) {
            i2 = y54Var.b;
        }
        if ((i3 & 4) != 0) {
            z = y54Var.c;
        }
        y54Var.getClass();
        return new y54(i, i2, z);
    }

    public final int b() {
        return this.a + this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y54)) {
            return false;
        }
        y54 y54Var = (y54) obj;
        return this.a == y54Var.a && this.b == y54Var.b && this.c == y54Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xrf.k(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return az1.k(wy1.k("ControlState(heightView=", this.a, ", inset=", this.b, ", isVisible="), this.c, ")");
    }

    public y54(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }
}

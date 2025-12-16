package defpackage;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class co7 {
    public static final co7 e = new co7(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public co7(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static co7 a(co7 co7Var, co7 co7Var2) {
        return b(Math.max(co7Var.a, co7Var2.a), Math.max(co7Var.b, co7Var2.b), Math.max(co7Var.c, co7Var2.c), Math.max(co7Var.d, co7Var2.d));
    }

    public static co7 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new co7(i, i2, i3, i4);
    }

    public static co7 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return bo7.a(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || co7.class != obj.getClass()) {
            return false;
        }
        co7 co7Var = (co7) obj;
        return this.d == co7Var.d && this.a == co7Var.a && this.c == co7Var.c && this.b == co7Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return xc0.h(sb, this.d, '}');
    }
}

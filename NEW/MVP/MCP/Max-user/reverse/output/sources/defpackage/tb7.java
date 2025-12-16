package defpackage;

/* loaded from: classes2.dex */
public final class tb7 {
    public final sb7 a;
    public final ub7 b;
    public final vb7 c;
    public final int d;
    public final int e;

    public tb7(sb7 sb7Var, ub7 ub7Var, vb7 vb7Var, int i, int i2) {
        this.a = sb7Var;
        this.b = ub7Var;
        this.c = vb7Var;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb7)) {
            return false;
        }
        tb7 tb7Var = (tb7) obj;
        return this.a.equals(tb7Var.a) && this.b.equals(tb7Var.b) && this.c.equals(tb7Var.c) && this.d == tb7Var.d && this.e == tb7Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + xrf.k(this.d, (this.c.hashCode() + xrf.k(this.b.a, this.a.hashCode() * 31, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IconLocalColors(category=");
        sb.append(this.a);
        sb.append(", promo=");
        sb.append(this.b);
        sb.append(", tabbar=");
        sb.append(this.c);
        sb.append(", verificationSecondary=");
        sb.append(this.d);
        sb.append(", verificationSubhead=");
        return ho7.j(sb, this.e, ")");
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final class oi3 {
    public final pi3 a;
    public final int b;
    public final int c;

    public oi3(pi3 pi3Var, int i, int i2) {
        this.a = pi3Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi3)) {
            return false;
        }
        oi3 oi3Var = (oi3) obj;
        return this.a.equals(oi3Var.a) && this.b == oi3Var.b && this.c == oi3Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + xrf.k(-1, xrf.k(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonStrokeColors(separator=");
        sb.append(this.a);
        sb.append(", contrast=");
        sb.append(this.b);
        sb.append(", contrastStatic=-1, glass=");
        return ho7.j(sb, this.c, ")");
    }
}

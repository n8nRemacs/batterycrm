package defpackage;

/* loaded from: classes2.dex */
public final class fx6 {
    public final gx6 a;
    public final hx6 b;
    public final ix6 c;
    public final jx6 d;
    public final kx6 e;
    public final lx6 f;
    public final mx6 g;

    public fx6(gx6 gx6Var, hx6 hx6Var, ix6 ix6Var, jx6 jx6Var, kx6 kx6Var, lx6 lx6Var, mx6 mx6Var) {
        this.a = gx6Var;
        this.b = hx6Var;
        this.c = ix6Var;
        this.d = jx6Var;
        this.e = kx6Var;
        this.f = lx6Var;
        this.g = mx6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx6)) {
            return false;
        }
        fx6 fx6Var = (fx6) obj;
        return fni.a(this.a, fx6Var.a) && fni.a(this.b, fx6Var.b) && fni.a(this.c, fx6Var.c) && fni.a(this.d, fx6Var.d) && fni.a(this.e, fx6Var.e) && fni.a(this.f, fx6Var.f) && fni.a(this.g, fx6Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GradientsLoadingIconColors(contrast=" + this.a + ", contrastStatic=" + this.b + ", negative=" + this.c + ", neutralThemed=" + this.d + ", primary=" + this.e + ", primaryStatic=" + this.f + ", themed=" + this.g + ")";
    }
}

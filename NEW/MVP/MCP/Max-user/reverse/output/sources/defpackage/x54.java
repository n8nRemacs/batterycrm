package defpackage;

/* loaded from: classes.dex */
public final class x54 {
    public final boolean a;
    public final int b;
    public final int c;
    public final float d;
    public final float e;
    public final int f;

    public x54(boolean z, int i, int i2, float f, float f2, int i3) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = f2;
        this.f = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x54)) {
            return false;
        }
        x54 x54Var = (x54) obj;
        return this.a == x54Var.a && this.b == x54Var.b && this.c == x54Var.c && Float.compare(this.d, x54Var.d) == 0 && Float.compare(this.e, x54Var.e) == 0 && this.f == x54Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + hf3.b(hf3.b(xrf.k(this.c, xrf.k(this.b, Boolean.hashCode(this.a) * 31, 31), 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        return "AnimationState(isVisible=" + this.a + ", totalHeight=" + this.b + ", directionY=" + this.c + ", offsetY=" + this.d + ", startY=" + this.e + ", inset=" + this.f + ")";
    }
}

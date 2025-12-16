package defpackage;

/* loaded from: classes2.dex */
public final class ig3 {
    public final int a;
    public final int b;
    public final int c;

    public ig3(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig3)) {
            return false;
        }
        ig3 ig3Var = (ig3) obj;
        ig3Var.getClass();
        return this.a == ig3Var.a && this.b == ig3Var.b && this.c == ig3Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + xrf.k(this.b, xrf.k(this.a, Integer.hashCode(-1) * 31, 31), 31);
    }

    public final String toString() {
        return ho7.j(wy1.k("CommonActionIconColors(contrastStatic=-1, neutral=", this.a, ", neutralSecondary=", this.b, ", themedFade="), this.c, ")");
    }
}

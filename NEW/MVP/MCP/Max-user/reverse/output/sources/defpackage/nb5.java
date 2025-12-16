package defpackage;

/* loaded from: classes2.dex */
public final class nb5 {
    public final int a;
    public final int b;
    public final int c;

    public nb5(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb5)) {
            return false;
        }
        nb5 nb5Var = (nb5) obj;
        return this.a == nb5Var.a && this.b == nb5Var.b && this.c == nb5Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + xrf.k(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return ho7.j(wy1.k("EmojiLocation(spriteIndex=", this.a, ", x=", this.b, ", y="), this.c, ")");
    }
}

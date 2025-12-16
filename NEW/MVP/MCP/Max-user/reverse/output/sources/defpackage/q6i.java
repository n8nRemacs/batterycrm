package defpackage;

/* loaded from: classes2.dex */
public final class q6i {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public q6i(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6i)) {
            return false;
        }
        q6i q6iVar = (q6i) obj;
        return this.a == q6iVar.a && this.b == q6iVar.b && this.c == q6iVar.c && this.d == q6iVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return xc0.i(wy1.k("WritebarBackgroundColors(emojiArea=", this.a, ", input=", this.b, ", neutralFade="), this.c, ", surface=", this.d, ")");
    }
}

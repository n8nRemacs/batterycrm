package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class qx6 {
    public final px6 a;
    public final rx6 b;
    public final int[] c;
    public final int[] d;

    public qx6(px6 px6Var, rx6 rx6Var, int[] iArr, int[] iArr2) {
        this.a = px6Var;
        this.b = rx6Var;
        this.c = iArr;
        this.d = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx6)) {
            return false;
        }
        qx6 qx6Var = (qx6) obj;
        return fni.a(this.a, qx6Var.a) && fni.a(this.b, qx6Var.b) && fni.a(this.c, qx6Var.c) && fni.a(this.d, qx6Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + ((Arrays.hashCode(this.c) + xrf.k(this.b.a, Integer.hashCode(this.a.a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "GradientsSkeletonGradientColors(cell=" + this.a + ", grid=" + this.b + ", cellGradient=" + Arrays.toString(this.c) + ", gridGradient=" + Arrays.toString(this.d) + ")";
    }
}

package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ex6 {
    public final int[] a;
    public final int[] b;

    public ex6(int[] iArr, int[] iArr2) {
        this.a = iArr;
        this.b = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex6)) {
            return false;
        }
        ex6 ex6Var = (ex6) obj;
        return fni.a(this.a, ex6Var.a) && fni.a(this.b, ex6Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.j("GradientsEmptyBlockIconWrapperColors(shapeGradient=", Arrays.toString(this.a), ", strokeGradient=", Arrays.toString(this.b), ")");
    }
}

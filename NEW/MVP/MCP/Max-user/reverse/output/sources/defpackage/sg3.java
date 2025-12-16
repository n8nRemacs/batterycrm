package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class sg3 {
    public final rg3 a;
    public final int[] b;

    public sg3(rg3 rg3Var, int[] iArr) {
        this.a = rg3Var;
        this.b = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg3)) {
            return false;
        }
        sg3 sg3Var = (sg3) obj;
        return fni.a(this.a, sg3Var.a) && fni.a(this.b, sg3Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommonBackgroundSkeletonStickerSecondaryColors(baseGradient=" + this.a + ", tongueGradient=" + Arrays.toString(this.b) + ")";
    }
}

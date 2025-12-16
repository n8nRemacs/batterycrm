package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class rg3 {
    public final int[] a;
    public final int b;

    public rg3(int i, int[] iArr) {
        this.a = iArr;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg3)) {
            return false;
        }
        rg3 rg3Var = (rg3) obj;
        return this.a.equals(rg3Var.a) && this.b == rg3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CommonBackgroundSkeletonStickerSecondaryBaseGradientColors(gradient=" + Arrays.toString(this.a) + ", staticBackground=" + this.b + ")";
    }
}

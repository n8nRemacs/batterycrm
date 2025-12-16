package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class pg3 {
    public final int[] a;
    public final int b;

    public pg3(int i, int[] iArr) {
        this.a = iArr;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg3)) {
            return false;
        }
        pg3 pg3Var = (pg3) obj;
        return this.a.equals(pg3Var.a) && this.b == pg3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CommonBackgroundSkeletonStickerPrimaryBaseGradientColors(gradient=" + Arrays.toString(this.a) + ", staticBackground=" + this.b + ")";
    }
}

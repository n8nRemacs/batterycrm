package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class mg3 {
    public final int[] a;
    public final int b;

    public mg3(int i, int[] iArr) {
        this.a = iArr;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg3)) {
            return false;
        }
        mg3 mg3Var = (mg3) obj;
        return this.a.equals(mg3Var.a) && this.b == mg3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CommonBackgroundSkeletonBubbleGradientPrimaryColors(gradient=" + Arrays.toString(this.a) + ", staticBackground=" + this.b + ")";
    }
}

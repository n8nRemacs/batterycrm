package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class qg3 {
    public final pg3 a;
    public final int[] b;

    public qg3(pg3 pg3Var, int[] iArr) {
        this.a = pg3Var;
        this.b = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg3)) {
            return false;
        }
        qg3 qg3Var = (qg3) obj;
        return fni.a(this.a, qg3Var.a) && fni.a(this.b, qg3Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommonBackgroundSkeletonStickerPrimaryColors(baseGradient=" + this.a + ", tongueGradient=" + Arrays.toString(this.b) + ")";
    }
}

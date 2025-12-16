package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ox6 {
    public final int[] a;
    public final int[] b;

    public ox6(int[] iArr, int[] iArr2) {
        this.a = iArr;
        this.b = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox6)) {
            return false;
        }
        ox6 ox6Var = (ox6) obj;
        return fni.a(this.a, ox6Var.a) && fni.a(this.b, ox6Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.j("GradientsOverlayColors(surfaceGroundGradient=", Arrays.toString(this.a), ", surfacePrimaryGradient=", Arrays.toString(this.b), ")");
    }
}

package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class dx6 {
    public final int[] a;

    public dx6(int[] iArr) {
        this.a = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dx6) && fni.a(this.a, ((dx6) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return ho7.i("GradientsComplexColors(overlayFloatingGradient=", Arrays.toString(this.a), ")");
    }
}

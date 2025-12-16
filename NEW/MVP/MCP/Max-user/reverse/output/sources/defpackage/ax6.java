package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ax6 {
    public final int[] a;

    public ax6(int[] iArr) {
        this.a = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ax6) && fni.a(this.a, ((ax6) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return ho7.i("GradientsBannerDKStrokeColors(iconContainerGradient=", Arrays.toString(this.a), ")");
    }
}

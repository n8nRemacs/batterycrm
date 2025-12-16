package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class nx6 {
    public final int[] a;

    public nx6(int[] iArr) {
        this.a = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nx6) && fni.a(this.a, ((nx6) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return ho7.i("GradientsLocalColors(promoTextGradient=", Arrays.toString(this.a), ")");
    }
}

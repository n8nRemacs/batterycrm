package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class yw6 {
    public final int[] a;
    public final int[] b;
    public final int[] c;
    public final int[] d;

    public yw6(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        this.a = iArr;
        this.b = iArr2;
        this.c = iArr3;
        this.d = iArr4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw6)) {
            return false;
        }
        yw6 yw6Var = (yw6) obj;
        return fni.a(this.a, yw6Var.a) && fni.a(this.b, yw6Var.b) && fni.a(this.c, yw6Var.c) && fni.a(this.d, yw6Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + ((Arrays.hashCode(this.c) + ((Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.a);
        String string2 = Arrays.toString(this.b);
        String string3 = Arrays.toString(this.c);
        String string4 = Arrays.toString(this.d);
        StringBuilder sbL = wy1.l("GradientsBannerDKBackgroundColors(fantasyGradient=", string, ", iconContainerGradient=", string2, ", paleBlueGradient=");
        sbL.append(string3);
        sbL.append(", vibrantGradient=");
        sbL.append(string4);
        sbL.append(")");
        return sbL.toString();
    }
}

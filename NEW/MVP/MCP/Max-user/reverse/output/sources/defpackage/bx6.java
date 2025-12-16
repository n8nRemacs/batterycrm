package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class bx6 {
    public final int[] a;
    public final int[] b;
    public final int[] c;

    public bx6(int[] iArr, int[] iArr2, int[] iArr3) {
        this.a = iArr;
        this.b = iArr2;
        this.c = iArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx6)) {
            return false;
        }
        bx6 bx6Var = (bx6) obj;
        return fni.a(this.a, bx6Var.a) && fni.a(this.b, bx6Var.b) && fni.a(this.c, bx6Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.a);
        String string2 = Arrays.toString(this.b);
        return ho7.l(wy1.l("GradientsButtonTextPromoColors(defaultGradient=", string, ", disabledGradient=", string2, ", pressedGradient="), Arrays.toString(this.c), ")");
    }
}

package defpackage;

/* loaded from: classes.dex */
public final class ka2 {
    public final int a;
    public final int b;
    public final float[] c;
    public final boolean d;
    public final boolean e;

    public ka2(int i, int i2, float[] fArr) {
        boolean z = false;
        hsi.a("Input channel count must be positive.", i > 0);
        hsi.a("Output channel count must be positive.", i2 > 0);
        hsi.a("Coefficient array length is invalid.", fArr.length == i * i2);
        this.a = i;
        this.b = i2;
        for (int i3 = 0; i3 < fArr.length; i3++) {
            if (fArr[i3] < 0.0f) {
                throw new IllegalArgumentException(wy1.e(i3, "Coefficient at index ", " is negative."));
            }
        }
        this.c = fArr;
        int i4 = 0;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        while (i4 < i) {
            int i5 = 0;
            while (i5 < i2) {
                float f = this.c[(this.b * i4) + i5];
                boolean z5 = i4 == i5;
                if (f != 1.0f && z5) {
                    z4 = false;
                }
                if (f != 0.0f) {
                    z2 = false;
                    if (!z5) {
                        z3 = false;
                    }
                }
                i5++;
            }
            i4++;
        }
        this.d = z2;
        if (this.a == this.b && z3 && z4) {
            z = true;
        }
        this.e = z;
    }

    public static ka2 a(int i, int i2) {
        float[] fArr;
        if (i == i2) {
            fArr = new float[i2 * i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr[(i2 * i3) + i3] = 1.0f;
            }
        } else if (i == 1 && i2 == 2) {
            fArr = new float[]{1.0f, 1.0f};
        } else {
            if (i != 2 || i2 != 1) {
                throw new UnsupportedOperationException(wy1.g("Default channel mixing coefficients for ", i, "->", i2, " are not yet implemented."));
            }
            fArr = new float[]{0.5f, 0.5f};
        }
        return new ka2(i, i2, fArr);
    }
}

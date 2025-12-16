package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class ryd implements syd {
    public final syd a;
    public final syd b;
    public final Rect c;
    public final Rect d;
    public final float[] e = new float[9];
    public final float[] f = new float[9];
    public final float[] g = new float[9];
    public float h;

    public ryd(e9j e9jVar, e9j e9jVar2, Rect rect, Rect rect2) {
        this.a = e9jVar;
        this.b = e9jVar2;
        this.c = rect;
        this.d = rect2;
    }

    @Override // defpackage.syd
    public final Matrix a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
        this.a.a(matrix, this.c, i, i2, f, f2);
        float[] fArr = this.e;
        matrix.getValues(fArr);
        this.b.a(matrix, this.d, i, i2, f, f2);
        float[] fArr2 = this.f;
        matrix.getValues(fArr2);
        int i3 = 0;
        while (true) {
            float[] fArr3 = this.g;
            if (i3 >= 9) {
                matrix.setValues(fArr3);
                return matrix;
            }
            float f3 = fArr[i3];
            float f4 = this.h;
            fArr3[i3] = (fArr2[i3] * f4) + ((1.0f - f4) * f3);
            i3++;
        }
    }

    public final String toString() {
        return wy1.j("InterpolatingScaleType(", String.valueOf(this.a), " (null) -> ", String.valueOf(this.b), " (null))");
    }
}

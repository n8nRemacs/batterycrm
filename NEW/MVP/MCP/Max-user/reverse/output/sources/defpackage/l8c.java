package defpackage;

import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class l8c implements fr8 {
    public final int a;
    public final int b;
    public float c = -1.0f;
    public final int d = 9729;
    public float e = -1.0f;
    public float f = -1.0f;
    public Matrix g = new Matrix();

    public l8c(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static l8c f(int i, int i2) {
        hsi.a("width " + i + " must be positive", i > 0);
        hsi.a("height " + i2 + " must be positive", i2 > 0);
        return new l8c(i, i2);
    }

    @Override // defpackage.fr8
    public final Matrix b() {
        Matrix matrix = this.g;
        hsi.i(matrix, "configure must be called first");
        return matrix;
    }

    @Override // defpackage.fr8
    public final int c() {
        return this.d;
    }

    @Override // defpackage.mu6
    public final boolean d(int i, int i2) {
        e(i, i2);
        Matrix matrix = this.g;
        hsi.h(matrix);
        return matrix.isIdentity() && i == Math.round(this.e) && i2 == Math.round(this.f);
    }

    @Override // defpackage.fr8
    public final c4f e(int i, int i2) {
        hsi.a("inputWidth must be positive", i > 0);
        hsi.a("inputHeight must be positive", i2 > 0);
        Matrix matrix = new Matrix();
        this.g = matrix;
        float f = i;
        this.e = f;
        float f2 = i2;
        this.f = f2;
        int i3 = this.b;
        int i4 = this.a;
        if (i4 != -1 && i3 != -1) {
            this.c = i4 / i3;
        }
        float f3 = this.c;
        if (f3 != -1.0f) {
            float f4 = f / f2;
            if (f3 > f4) {
                matrix.setScale(f4 / f3, 1.0f);
                this.e = this.f * this.c;
            } else {
                matrix.setScale(1.0f, f3 / f4);
                this.f = this.e / this.c;
            }
        }
        if (i3 != -1) {
            if (i4 != -1) {
                this.e = i4;
                this.f = i3;
            } else {
                float f5 = i3;
                this.e = (this.e * f5) / this.f;
                this.f = f5;
            }
        }
        return new c4f(Math.round(this.e), Math.round(this.f));
    }
}

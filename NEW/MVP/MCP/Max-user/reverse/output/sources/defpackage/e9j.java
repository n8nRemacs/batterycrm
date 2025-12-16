package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* loaded from: classes.dex */
public abstract class e9j implements syd {
    @Override // defpackage.syd
    public Matrix a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
        g(matrix, rect, i, i2, f, f2, rect.width() / i, rect.height() / i2);
        return matrix;
    }

    public abstract boolean b(int i, int i2);

    public abstract boolean c(int i, int i2);

    public Object d(int i, int i2) {
        return null;
    }

    public abstract int e();

    public abstract int f();

    public abstract void g(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);
}

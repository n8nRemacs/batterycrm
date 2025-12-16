package lY0;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.appcompat.app.r;
import j.N;

/* compiled from: MatrixEvaluator.java */
/* loaded from: classes6.dex */
public class h implements TypeEvaluator<Matrix> {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f413888a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f413889b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f413890c = new Matrix();

    @Override // android.animation.TypeEvaluator
    @N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix evaluate(float f12, @N Matrix matrix, @N Matrix matrix2) {
        float[] fArr = this.f413888a;
        matrix.getValues(fArr);
        float[] fArr2 = this.f413889b;
        matrix2.getValues(fArr2);
        for (int i12 = 0; i12 < 9; i12++) {
            float f13 = fArr2[i12];
            float f14 = fArr[i12];
            fArr2[i12] = r.c(f13, f14, f12, f14);
        }
        Matrix matrix3 = this.f413890c;
        matrix3.setValues(fArr2);
        return matrix3;
    }
}

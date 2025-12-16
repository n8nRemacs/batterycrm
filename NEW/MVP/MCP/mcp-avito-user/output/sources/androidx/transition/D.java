package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* compiled from: PatternPathMotion.java */
/* loaded from: classes10.dex */
public class D extends B {

    /* renamed from: a, reason: collision with root package name */
    public final Path f54645a;

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f54646b;

    public D() {
        Path path = new Path();
        this.f54645a = path;
        this.f54646b = new Matrix();
        path.lineTo(1.0f, 0.0f);
    }

    @Override // androidx.transition.B
    @j.N
    public final Path a(float f12, float f13, float f14, float f15) {
        float f16 = f15 - f13;
        float fSqrt = (float) Math.sqrt((f16 * f16) + (r6 * r6));
        double dAtan2 = Math.atan2(f16, f14 - f12);
        Matrix matrix = this.f54646b;
        matrix.setScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(dAtan2));
        matrix.postTranslate(f12, f13);
        Path path = new Path();
        this.f54645a.transform(matrix, path);
        return path;
    }

    public D(Path path) {
        Path path2 = new Path();
        this.f54645a = path2;
        Matrix matrix = new Matrix();
        this.f54646b = matrix;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f12 = fArr[0];
        float f13 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f14 = fArr[0];
        float f15 = fArr[1];
        if (f14 == f12 && f15 == f13) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        matrix.setTranslate(-f14, -f15);
        float f16 = f13 - f15;
        float fSqrt = 1.0f / ((float) Math.sqrt((f16 * f16) + (r4 * r4)));
        matrix.postScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(-Math.atan2(f16, f12 - f14)));
        path.transform(matrix, path2);
    }
}

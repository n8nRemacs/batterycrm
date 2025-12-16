package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.os.Build;

/* compiled from: TransitionUtils.java */
/* loaded from: classes10.dex */
class U {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f54710a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f54711b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f54712c;

    /* compiled from: TransitionUtils.java */
    public static class a implements TypeEvaluator<Matrix> {

        /* renamed from: a, reason: collision with root package name */
        public final float[] f54713a = new float[9];

        /* renamed from: b, reason: collision with root package name */
        public final float[] f54714b = new float[9];

        /* renamed from: c, reason: collision with root package name */
        public final Matrix f54715c = new Matrix();

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f12, Matrix matrix, Matrix matrix2) {
            float[] fArr = this.f54713a;
            matrix.getValues(fArr);
            float[] fArr2 = this.f54714b;
            matrix2.getValues(fArr2);
            for (int i12 = 0; i12 < 9; i12++) {
                float f13 = fArr2[i12];
                float f14 = fArr[i12];
                fArr2[i12] = androidx.appcompat.app.r.c(f13, f14, f12, f14);
            }
            Matrix matrix3 = this.f54715c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    static {
        int i12 = Build.VERSION.SDK_INT;
        f54710a = true;
        f54711b = true;
        f54712c = i12 >= 28;
    }
}

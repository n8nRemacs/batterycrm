package androidx.transition;

import android.animation.TypeEvaluator;

/* compiled from: FloatArrayEvaluator.java */
/* renamed from: androidx.transition.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
class C23504o implements TypeEvaluator<float[]> {

    /* renamed from: a, reason: collision with root package name */
    public float[] f54813a;

    @Override // android.animation.TypeEvaluator
    public final float[] evaluate(float f12, float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float[] fArr5 = this.f54813a;
        if (fArr5 == null) {
            fArr5 = new float[fArr3.length];
        }
        for (int i12 = 0; i12 < fArr5.length; i12++) {
            float f13 = fArr3[i12];
            fArr5[i12] = androidx.appcompat.app.r.c(fArr4[i12], f13, f12, f13);
        }
        return fArr5;
    }
}

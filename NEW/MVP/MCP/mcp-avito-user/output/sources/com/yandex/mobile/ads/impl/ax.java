package com.yandex.mobile.ads.impl;

import android.opengl.Matrix;

/* loaded from: classes8.dex */
final class ax {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f383683a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f383684b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    private final h91<float[]> f383685c = new h91<>();

    /* renamed from: d, reason: collision with root package name */
    private boolean f383686d;

    public final void a() {
        this.f383685c.a();
        this.f383686d = false;
    }

    public final void b(long j12, float[] fArr) {
        this.f383685c.a(fArr, j12);
    }

    public final void a(long j12, float[] fArr) {
        float[] fArrB = this.f383685c.b(j12);
        if (fArrB == null) {
            return;
        }
        float[] fArr2 = this.f383684b;
        float f12 = fArrB[0];
        float f13 = -fArrB[1];
        float f14 = -fArrB[2];
        float length = Matrix.length(f12, f13, f14);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr2, 0, (float) Math.toDegrees(length), f12 / length, f13 / length, f14 / length);
        } else {
            Matrix.setIdentityM(fArr2, 0);
        }
        if (!this.f383686d) {
            a(this.f383683a, this.f383684b);
            this.f383686d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f383683a, 0, this.f383684b, 0);
    }

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f12 = fArr2[10];
        float f13 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f13 * f13) + (f12 * f12));
        float f14 = fArr2[10] / fSqrt;
        fArr[0] = f14;
        float f15 = fArr2[8];
        fArr[2] = f15 / fSqrt;
        fArr[8] = (-f15) / fSqrt;
        fArr[10] = f14;
    }
}

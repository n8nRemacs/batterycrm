package com.google.android.exoplayer2.video.spherical;

import android.opengl.Matrix;
import com.google.android.exoplayer2.util.N;

/* compiled from: FrameRotationQueue.java */
/* loaded from: classes6.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f348330a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f348331b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final N<float[]> f348332c = new N<>();

    /* renamed from: d, reason: collision with root package name */
    public boolean f348333d;

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

package androidx.core.content.res;

import androidx.core.graphics.C22767g;

/* compiled from: CamUtils.java */
/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f44651a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f44652b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f44653c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[][] f44654d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static int a(float f12) {
        if (f12 < 1.0f) {
            return -16777216;
        }
        if (f12 > 99.0f) {
            return -1;
        }
        float f13 = (f12 + 16.0f) / 116.0f;
        float f14 = f12 > 8.0f ? f13 * f13 * f13 : f12 / 903.2963f;
        float f15 = f13 * f13 * f13;
        boolean z12 = f15 > 0.008856452f;
        float f16 = z12 ? f15 : ((f13 * 116.0f) - 16.0f) / 903.2963f;
        if (!z12) {
            f15 = ((f13 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f44653c;
        return C22767g.b(f16 * fArr[0], f14 * fArr[1], f15 * fArr[2]);
    }

    public static float b(int i12) {
        float f12 = i12 / 255.0f;
        return (f12 <= 0.04045f ? f12 / 12.92f : (float) Math.pow((f12 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static float c() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }
}

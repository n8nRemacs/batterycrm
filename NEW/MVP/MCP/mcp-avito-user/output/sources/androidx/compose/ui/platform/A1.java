package androidx.compose.ui.platform;

import kotlin.Metadata;

/* compiled from: InvertMatrix.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class A1 {
    public static final boolean a(@Y61.k float[] fArr, @Y61.k float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = fArr[2];
        float f15 = fArr[3];
        float f16 = fArr[4];
        float f17 = fArr[5];
        float f18 = fArr[6];
        float f19 = fArr[7];
        float f22 = fArr[8];
        float f23 = fArr[9];
        float f24 = fArr[10];
        float f25 = fArr[11];
        float f26 = fArr[12];
        float f27 = fArr[13];
        float f28 = fArr[14];
        float f29 = fArr[15];
        float f32 = (f12 * f17) - (f13 * f16);
        float f33 = (f12 * f18) - (f14 * f16);
        float f34 = (f12 * f19) - (f15 * f16);
        float f35 = (f13 * f18) - (f14 * f17);
        float f36 = (f13 * f19) - (f15 * f17);
        float f37 = (f14 * f19) - (f15 * f18);
        float f38 = (f22 * f27) - (f23 * f26);
        float f39 = (f22 * f28) - (f24 * f26);
        float f42 = (f22 * f29) - (f25 * f26);
        float f43 = (f23 * f28) - (f24 * f27);
        float f44 = (f23 * f29) - (f25 * f27);
        float f45 = (f24 * f29) - (f25 * f28);
        float f46 = (f37 * f38) + (((f35 * f42) + ((f34 * f43) + ((f32 * f45) - (f33 * f44)))) - (f36 * f39));
        if (f46 != 0.0f) {
            float f47 = 1.0f / f46;
            fArr2[0] = ((f19 * f43) + ((f17 * f45) - (f18 * f44))) * f47;
            fArr2[1] = (((f14 * f44) + ((-f13) * f45)) - (f15 * f43)) * f47;
            fArr2[2] = ((f29 * f35) + ((f27 * f37) - (f28 * f36))) * f47;
            fArr2[3] = (((f24 * f36) + ((-f23) * f37)) - (f25 * f35)) * f47;
            float f48 = -f16;
            fArr2[4] = (((f18 * f42) + (f48 * f45)) - (f19 * f39)) * f47;
            fArr2[5] = ((f15 * f39) + ((f45 * f12) - (f14 * f42))) * f47;
            float f49 = -f26;
            fArr2[6] = (((f28 * f34) + (f49 * f37)) - (f29 * f33)) * f47;
            fArr2[7] = ((f25 * f33) + ((f37 * f22) - (f24 * f34))) * f47;
            fArr2[8] = ((f19 * f38) + ((f16 * f44) - (f17 * f42))) * f47;
            fArr2[9] = (((f42 * f13) + ((-f12) * f44)) - (f15 * f38)) * f47;
            fArr2[10] = ((f29 * f32) + ((f26 * f36) - (f27 * f34))) * f47;
            fArr2[11] = (((f34 * f23) + ((-f22) * f36)) - (f25 * f32)) * f47;
            fArr2[12] = (((f17 * f39) + (f48 * f43)) - (f18 * f38)) * f47;
            fArr2[13] = ((f14 * f38) + ((f12 * f43) - (f13 * f39))) * f47;
            fArr2[14] = (((f27 * f33) + (f49 * f35)) - (f28 * f32)) * f47;
            fArr2[15] = ((f24 * f32) + ((f22 * f35) - (f23 * f33))) * f47;
        }
        return !(f46 == 0.0f);
    }
}

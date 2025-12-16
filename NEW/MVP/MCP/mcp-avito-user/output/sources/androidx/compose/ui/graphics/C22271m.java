package androidx.compose.ui.graphics;

import android.graphics.Matrix;
import kotlin.Metadata;

/* compiled from: AndroidMatrixConversions.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22271m {
    public static final void a(@Y61.k Matrix matrix, @Y61.k float[] fArr) {
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = fArr[2];
        float f15 = fArr[3];
        float f16 = fArr[4];
        float f17 = fArr[5];
        float f18 = fArr[6];
        float f19 = fArr[7];
        float f22 = fArr[8];
        float f23 = fArr[12];
        float f24 = fArr[13];
        float f25 = fArr[15];
        fArr[0] = f12;
        fArr[1] = f16;
        fArr[2] = f23;
        fArr[3] = f13;
        fArr[4] = f17;
        fArr[5] = f24;
        fArr[6] = f15;
        fArr[7] = f19;
        fArr[8] = f25;
        matrix.setValues(fArr);
        fArr[0] = f12;
        fArr[1] = f13;
        fArr[2] = f14;
        fArr[3] = f15;
        fArr[4] = f16;
        fArr[5] = f17;
        fArr[6] = f18;
        fArr[7] = f19;
        fArr[8] = f22;
    }

    public static final void b(@Y61.k Matrix matrix, @Y61.k float[] fArr) {
        matrix.getValues(fArr);
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = fArr[2];
        float f15 = fArr[3];
        float f16 = fArr[4];
        float f17 = fArr[5];
        float f18 = fArr[6];
        float f19 = fArr[7];
        float f22 = fArr[8];
        fArr[0] = f12;
        fArr[1] = f15;
        fArr[2] = 0.0f;
        fArr[3] = f18;
        fArr[4] = f13;
        fArr[5] = f16;
        fArr[6] = 0.0f;
        fArr[7] = f19;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f14;
        fArr[13] = f17;
        fArr[14] = 0.0f;
        fArr[15] = f22;
    }
}

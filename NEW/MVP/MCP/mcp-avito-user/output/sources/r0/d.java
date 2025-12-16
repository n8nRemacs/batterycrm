package r0;

import Y61.k;
import androidx.compose.ui.input.pointer.C;
import androidx.compose.ui.input.pointer.C22327e;
import androidx.compose.ui.input.pointer.C22341t;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import s0.C47949a;

/* compiled from: VelocityTracker.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\b\u0003*\u0018\b\u0002\u0010\u0002\"\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0012\u0004\u0012\u00020\u00010\u0000*\f\b\u0002\u0010\u0003\"\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"", "", "Matrix", "Vector", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {
    public static final void a(@k androidx.compose.ui.input.pointer.util.a aVar, @k C c12) {
        boolean zA2 = C22341t.a(c12);
        VelocityTracker1D velocityTracker1D = aVar.f40304b;
        VelocityTracker1D velocityTracker1D2 = aVar.f40303a;
        if (zA2) {
            C42756l.y(null, velocityTracker1D2.f40294d);
            velocityTracker1D2.f40295e = 0;
            C42756l.y(null, velocityTracker1D.f40294d);
            velocityTracker1D.f40295e = 0;
            aVar.f40305c = 0L;
        }
        boolean zC2 = C22341t.c(c12);
        long j12 = c12.f40117b;
        if (!zC2) {
            List list = c12.f40126k;
            if (list == null) {
                list = C42784z0.f406748b;
            }
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                C22327e c22327e = (C22327e) list.get(i12);
                long j13 = c22327e.f40209a;
                long j14 = c22327e.f40211c;
                velocityTracker1D2.a(j13, Float.intBitsToFloat((int) (j14 >> 32)));
                velocityTracker1D.a(j13, Float.intBitsToFloat((int) (j14 & 4294967295L)));
            }
            long j15 = c12.f40127l;
            velocityTracker1D2.a(j12, Float.intBitsToFloat((int) (j15 >> 32)));
            velocityTracker1D.a(j12, Float.intBitsToFloat((int) (j15 & 4294967295L)));
        }
        if (C22341t.c(c12) && j12 - aVar.f40305c > 40) {
            C42756l.y(null, velocityTracker1D2.f40294d);
            velocityTracker1D2.f40295e = 0;
            C42756l.y(null, velocityTracker1D.f40294d);
            velocityTracker1D.f40295e = 0;
            aVar.f40305c = 0L;
        }
        aVar.f40305c = j12;
    }

    public static final float b(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f12 = 0.0f;
        for (int i12 = 0; i12 < length; i12++) {
            f12 += fArr[i12] * fArr2[i12];
        }
        return f12;
    }

    @k
    public static final void c(@k float[] fArr, @k float[] fArr2, int i12, @k float[] fArr3) {
        if (i12 == 0) {
            C47949a.a("At least one point must be provided");
        }
        int i13 = 2 >= i12 ? i12 - 1 : 2;
        int i14 = i13 + 1;
        float[][] fArr4 = new float[i14][];
        for (int i15 = 0; i15 < i14; i15++) {
            fArr4[i15] = new float[i12];
        }
        for (int i16 = 0; i16 < i12; i16++) {
            fArr4[0][i16] = 1.0f;
            for (int i17 = 1; i17 < i14; i17++) {
                fArr4[i17][i16] = fArr4[i17 - 1][i16] * fArr[i16];
            }
        }
        float[][] fArr5 = new float[i14][];
        for (int i18 = 0; i18 < i14; i18++) {
            fArr5[i18] = new float[i12];
        }
        float[][] fArr6 = new float[i14][];
        for (int i19 = 0; i19 < i14; i19++) {
            fArr6[i19] = new float[i14];
        }
        int i22 = 0;
        while (i22 < i14) {
            float[] fArr7 = fArr5[i22];
            System.arraycopy(fArr4[i22], 0, fArr7, 0, i12);
            for (int i23 = 0; i23 < i22; i23++) {
                float[] fArr8 = fArr5[i23];
                float fB2 = b(fArr7, fArr8);
                for (int i24 = 0; i24 < i12; i24++) {
                    fArr7[i24] = fArr7[i24] - (fArr8[i24] * fB2);
                }
            }
            float fSqrt = (float) Math.sqrt(b(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f12 = 1.0f / fSqrt;
            for (int i25 = 0; i25 < i12; i25++) {
                fArr7[i25] = fArr7[i25] * f12;
            }
            float[] fArr9 = fArr6[i22];
            int i26 = 0;
            while (i26 < i14) {
                fArr9[i26] = i26 < i22 ? 0.0f : b(fArr7, fArr4[i26]);
                i26++;
            }
            i22++;
        }
        for (int i27 = i13; -1 < i27; i27--) {
            float fB3 = b(fArr5[i27], fArr2);
            float[] fArr10 = fArr6[i27];
            int i28 = i27 + 1;
            if (i28 <= i13) {
                int i29 = i13;
                while (true) {
                    fB3 -= fArr10[i29] * fArr3[i29];
                    if (i29 != i28) {
                        i29--;
                    }
                }
            }
            fArr3[i27] = fB3 / fArr10[i27];
        }
    }
}

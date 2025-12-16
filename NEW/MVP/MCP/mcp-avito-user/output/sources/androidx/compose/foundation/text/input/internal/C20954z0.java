package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.v0;
import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: OffsetMappingCalculator.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/internal/z0;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.input.internal.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20954z0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public int[] f31507a = new int[30];

    /* renamed from: b, reason: collision with root package name */
    public int f31508b;

    public static long b(int i12, int i13, int i14, int i15, boolean z12) {
        int i16 = z12 ? i14 : i15;
        if (z12) {
            i14 = i15;
        }
        if (i12 < i13) {
            return androidx.compose.ui.text.w0.a(i12, i12);
        }
        if (i12 == i13) {
            return i16 == 0 ? androidx.compose.ui.text.w0.a(i13, i14 + i13) : androidx.compose.ui.text.w0.a(i13, i13);
        }
        if (i12 < i13 + i16) {
            return i14 == 0 ? androidx.compose.ui.text.w0.a(i13, i13) : androidx.compose.ui.text.w0.a(i13, i14 + i13);
        }
        int i17 = (i12 - i16) + i14;
        return androidx.compose.ui.text.w0.a(i17, i17);
    }

    public final long a(int i12, boolean z12) {
        int i13;
        int iMax;
        int i14 = -1;
        int[] iArr = this.f31507a;
        int i15 = this.f31508b;
        if (i15 < 0) {
            i13 = i12;
            iMax = i13;
        } else if (z12) {
            iMax = i12;
            int i16 = 0;
            i13 = iMax;
            while (i16 < i15) {
                int i17 = i16 * 3;
                int i18 = iArr[i17];
                int i19 = iArr[i17 + 1];
                int i22 = iArr[i17 + 2];
                long jB2 = b(i13, i18, i19, i22, z12);
                long jB3 = b(iMax, i18, i19, i22, z12);
                v0.a aVar = androidx.compose.ui.text.v0.f42734b;
                int iMin = Math.min((int) (jB2 >> 32), (int) (jB3 >> 32));
                iMax = Math.max((int) (jB2 & 4294967295L), (int) (jB3 & 4294967295L));
                i16++;
                i13 = iMin;
            }
        } else {
            int iMax2 = i12;
            int i23 = i15 - 1;
            int iMin2 = iMax2;
            while (i14 < i23) {
                int i24 = i23 * 3;
                int i25 = iArr[i24];
                int i26 = iArr[i24 + 1];
                int i27 = iArr[i24 + 2];
                long jB4 = b(iMin2, i25, i26, i27, z12);
                long jB5 = b(iMax2, i25, i26, i27, z12);
                v0.a aVar2 = androidx.compose.ui.text.v0.f42734b;
                iMin2 = Math.min((int) (jB4 >> 32), (int) (jB5 >> 32));
                iMax2 = Math.max((int) (jB4 & 4294967295L), (int) (jB5 & 4294967295L));
                i14 = -1;
                i23--;
                iArr = iArr;
            }
            i13 = iMin2;
            iMax = iMax2;
        }
        return androidx.compose.ui.text.w0.a(i13, iMax);
    }

    public final void c(int i12, int i13, int i14) {
        if (!(i14 >= 0)) {
            androidx.compose.foundation.internal.e.a("Expected newLen to be ≥ 0, was " + i14);
        }
        int iMin = Math.min(i12, i13);
        int iMax = Math.max(iMin, i13) - iMin;
        if (iMax >= 2 || iMax != i14) {
            int i15 = this.f31508b + 1;
            int[] iArr = this.f31507a;
            if (i15 > iArr.length / 3) {
                this.f31507a = Arrays.copyOf(this.f31507a, Math.max(i15 * 2, (iArr.length / 3) * 2) * 3);
            }
            int[] iArr2 = this.f31507a;
            int i16 = this.f31508b * 3;
            iArr2[i16] = iMin;
            iArr2[i16 + 1] = iMax;
            iArr2[i16 + 2] = i14;
            this.f31508b = i15;
        }
    }
}

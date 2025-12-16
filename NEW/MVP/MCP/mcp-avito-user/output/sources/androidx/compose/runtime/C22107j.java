package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/j;", "", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22107j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final long[] f38479a = N2.f38061a;

    public final int a(int i12) {
        int iNumberOfTrailingZeros;
        if (i12 < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros(((~0L) >>> i12) << i12)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (i12 < 128) {
            int i13 = i12 - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(((~0L) >>> i13) << i13);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(i12, 128);
        int i14 = (iMax / 64) - 2;
        long[] jArr = this.f38479a;
        int length = jArr.length;
        for (int i15 = i14; i15 < length; i15++) {
            long j12 = ~jArr[i15];
            if (i15 == i14) {
                int i16 = iMax % 64;
                j12 = (j12 >>> i16) << i16;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(j12);
            if (iNumberOfTrailingZeros3 < 64) {
                return C22026a.a(i15, 64, 128, iNumberOfTrailingZeros3);
            }
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r14 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BitVector ["
            r0.<init>(r1)
            long[] r1 = r14.f38479a
            int r1 = r1.length
            int r1 = r1 + 2
            r2 = 64
            int r1 = r1 * r2
            r3 = 1
            r4 = 0
            r5 = r4
        L12:
            if (r5 >= r1) goto L57
            r6 = 0
            r8 = 1
            if (r5 >= r2) goto L23
            r10 = 0
            long r8 = r8 << r5
            long r8 = r8 & r10
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 == 0) goto L54
            goto L49
        L23:
            r10 = 128(0x80, float:1.8E-43)
            if (r5 >= r10) goto L32
            r10 = 0
            int r12 = r5 + (-64)
            long r8 = r8 << r12
            long r8 = r8 & r10
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 == 0) goto L54
            goto L49
        L32:
            long[] r10 = r14.f38479a
            int r11 = r10.length
            if (r11 != 0) goto L38
            goto L54
        L38:
            int r12 = r5 / 64
            int r12 = r12 + (-2)
            if (r12 < r11) goto L3f
            goto L54
        L3f:
            int r11 = r5 % 64
            r12 = r10[r12]
            long r8 = r8 << r11
            long r8 = r8 & r12
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 == 0) goto L54
        L49:
            if (r3 != 0) goto L50
            java.lang.String r3 = ", "
            r0.append(r3)
        L50:
            r0.append(r5)
            r3 = r4
        L54:
            int r5 = r5 + 1
            goto L12
        L57:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C22107j.toString():java.lang.String");
    }
}

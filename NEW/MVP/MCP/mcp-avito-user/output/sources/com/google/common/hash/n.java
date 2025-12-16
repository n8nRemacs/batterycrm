package com.google.common.hash;

import com.google.common.hash.q;

/* compiled from: Fingerprint2011.java */
@InterfaceC37497l
/* loaded from: classes6.dex */
final class n extends AbstractC37491f {
    static {
        new n();
    }

    @XY0.e
    public static long d(long j12, long j13) {
        long j14 = (j13 ^ j12) * (-4132994306676758123L);
        long j15 = (j12 ^ (j14 ^ (j14 >>> 47))) * (-4132994306676758123L);
        return (j15 ^ (j15 >>> 47)) * (-4132994306676758123L);
    }

    public static long e(long j12) {
        return j12 ^ (j12 >>> 47);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.hash.z$c, java.lang.Enum] */
    public static void f(byte[] bArr, int i12, long j12, long j13, long[] jArr) {
        ?? r02 = z.f360287a;
        long jA2 = r02.a(i12, bArr);
        long jA3 = r02.a(i12 + 8, bArr);
        long jA4 = r02.a(i12 + 16, bArr);
        long jA5 = r02.a(i12 + 24, bArr);
        long j14 = j12 + jA2;
        long j15 = jA3 + j14 + jA4;
        long jRotateRight = Long.rotateRight(j15, 23) + Long.rotateRight(j13 + j14 + jA5, 51);
        jArr[0] = j15 + jA5;
        jArr[1] = jRotateRight + j14;
    }

    @Override // com.google.common.hash.r
    public final int b() {
        return 64;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [com.google.common.hash.z$c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.common.hash.z$c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v22, types: [com.google.common.hash.z$c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v25, types: [com.google.common.hash.z$c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.common.hash.z$c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v11, types: [com.google.common.hash.z$c, java.lang.Enum] */
    @Override // com.google.common.hash.AbstractC37491f
    public final q c(int i12, byte[] bArr) {
        long j12;
        long j13;
        long jRotateRight;
        long jD2;
        int i13;
        com.google.common.base.M.l(0, i12, bArr.length);
        if (i12 <= 32) {
            int i14 = i12 & (-8);
            int i15 = 7 & i12;
            long jE2 = (-1397348546323613475L) ^ (i12 * (-4132994306676758123L));
            for (int i16 = 0; i16 < i14; i16 += 8) {
                jE2 = (jE2 ^ (e(z.f360287a.a(i16, bArr) * (-4132994306676758123L)) * (-4132994306676758123L))) * (-4132994306676758123L);
            }
            if (i15 != 0) {
                Enum r72 = z.f360287a;
                long j14 = 0;
                for (int i17 = 0; i17 < Math.min(i15, 8); i17++) {
                    j14 |= (bArr[i14 + i17] & 255) << (i17 * 8);
                }
                jE2 = (jE2 ^ j14) * (-4132994306676758123L);
            }
            jD2 = e(e(jE2) * (-4132994306676758123L));
            i13 = 8;
        } else {
            if (i12 <= 64) {
                ?? r32 = z.f360287a;
                long jA2 = r32.a(24, bArr);
                int i18 = i12 - 16;
                long jA3 = ((i12 + r32.a(i18, bArr)) * (-6505348102511208375L)) + r32.a(0, bArr);
                long jRotateRight2 = Long.rotateRight(jA3 + jA2, 52);
                long jRotateRight3 = Long.rotateRight(jA3, 37);
                long jA4 = jA3 + r32.a(8, bArr);
                long jRotateRight4 = Long.rotateRight(jA4, 7) + jRotateRight3;
                long jA5 = jA4 + r32.a(16, bArr);
                long j15 = jA2 + jA5;
                long jRotateRight5 = Long.rotateRight(jA5, 31) + jRotateRight2 + jRotateRight4;
                long jA6 = r32.a(16, bArr) + r32.a(i12 - 32, bArr);
                long jA7 = r32.a(i12 - 8, bArr);
                long jRotateRight6 = Long.rotateRight(jA6 + jA7, 52);
                long jRotateRight7 = Long.rotateRight(jA6, 37);
                long jA8 = jA6 + r32.a(i12 - 24, bArr);
                long jRotateRight8 = Long.rotateRight(jA8, 7) + jRotateRight7;
                long jA9 = jA8 + r32.a(i18, bArr);
                jD2 = e((e(((jA9 + jA7 + jRotateRight5) * (-6505348102511208375L)) + ((Long.rotateRight(jA9, 31) + jRotateRight6 + jRotateRight8 + j15) * (-4288712594273399085L))) * (-6505348102511208375L)) + jRotateRight5) * (-4288712594273399085L);
            } else {
                ?? r12 = z.f360287a;
                long jA10 = r12.a(0, bArr);
                long jA11 = r12.a(i12 - 16, bArr) ^ (-8261664234251669945L);
                long jA12 = r12.a(i12 - 56, bArr) ^ (-6505348102511208375L);
                long[] jArr = new long[2];
                long[] jArr2 = new long[2];
                long j16 = i12;
                f(bArr, i12 - 64, j16, jA11, jArr);
                f(bArr, i12 - 32, j16 * (-8261664234251669945L), -6505348102511208375L, jArr2);
                long jE3 = (e(jArr[1]) * (-8261664234251669945L)) + jA12;
                long jRotateRight9 = Long.rotateRight(jE3 + jA10, 39) * (-8261664234251669945L);
                long jRotateRight10 = Long.rotateRight(jA11, 33) * (-8261664234251669945L);
                int i19 = (i12 - 1) & (-64);
                int i22 = 0;
                while (true) {
                    long j17 = jRotateRight9 + jRotateRight10 + jArr[0];
                    ?? r112 = z.f360287a;
                    long jRotateRight11 = Long.rotateRight(j17 + r112.a(i22 + 16, bArr), 37) * (-8261664234251669945L);
                    long jRotateRight12 = Long.rotateRight(jRotateRight10 + jArr[1] + r112.a(i22 + 48, bArr), 42) * (-8261664234251669945L);
                    j12 = jRotateRight11 ^ jArr2[1];
                    j13 = jRotateRight12 ^ jArr[0];
                    jRotateRight = Long.rotateRight(jE3 ^ jArr2[0], 33);
                    f(bArr, i22, jArr[1] * (-8261664234251669945L), j12 + jArr2[0], jArr);
                    f(bArr, i22 + 32, jRotateRight + jArr2[1], j13, jArr2);
                    i22 += 64;
                    i19 -= 64;
                    if (i19 == 0) {
                        break;
                    }
                    jE3 = j12;
                    jRotateRight10 = j13;
                    jRotateRight9 = jRotateRight;
                }
                jD2 = d((e(j13) * (-8261664234251669945L)) + d(jArr[0], jArr2[0]) + j12, d(jArr[1], jArr2[1]) + jRotateRight);
            }
            i13 = 8;
        }
        long jD3 = d(jD2 + (i12 >= 9 ? z.f360287a.a(i12 - i13, bArr) : -6505348102511208375L), i12 >= i13 ? z.f360287a.a(0, bArr) : -6505348102511208375L);
        if (jD3 == 0 || jD3 == 1) {
            jD3 -= 2;
        }
        char[] cArr = q.f360281b;
        return new q.c(jD3);
    }

    public final String toString() {
        return "Hashing.fingerprint2011()";
    }
}

package com.google.common.hash;

import com.google.common.hash.q;

/* compiled from: FarmHashFingerprint64.java */
@InterfaceC37497l
/* renamed from: com.google.common.hash.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37498m extends AbstractC37491f {
    static {
        new C37498m();
    }

    public static long d(long j12, long j13, long j14) {
        long j15 = (j12 ^ j13) * j14;
        long j16 = ((j15 ^ (j15 >>> 47)) ^ j13) * j14;
        return (j16 ^ (j16 >>> 47)) * j14;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.hash.z$c, java.lang.Enum] */
    public static void e(byte[] bArr, int i12, long j12, long j13, long[] jArr) {
        ?? r02 = z.f360287a;
        long jA2 = r02.a(i12, bArr);
        long jA3 = r02.a(i12 + 8, bArr);
        long jA4 = r02.a(i12 + 16, bArr);
        long jA5 = r02.a(i12 + 24, bArr);
        long j14 = j12 + jA2;
        long j15 = jA3 + j14 + jA4;
        long jRotateRight = Long.rotateRight(j15, 44) + Long.rotateRight(j13 + j14 + jA5, 21);
        jArr[0] = j15 + jA5;
        jArr[1] = jRotateRight + j14;
    }

    @Override // com.google.common.hash.r
    public final int b() {
        return 64;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.common.hash.z$c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.google.common.hash.z$c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.google.common.hash.z$c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v19, types: [com.google.common.hash.z$c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.google.common.hash.z$c, java.lang.Enum] */
    @Override // com.google.common.hash.AbstractC37491f
    public final q c(int i12, byte[] bArr) {
        ?? r12;
        long j12;
        long jA2;
        long jRotateRight;
        int i13;
        long[] jArr;
        com.google.common.base.M.l(0, i12, bArr.length);
        int i14 = 37;
        long jD2 = -7286425919675154353L;
        if (i12 <= 32) {
            if (i12 > 16) {
                long j13 = (i12 * 2) - 7286425919675154353L;
                ?? r13 = z.f360287a;
                long jA3 = r13.a(0, bArr) * (-5435081209227447693L);
                long jA4 = r13.a(8, bArr);
                long jA5 = r13.a(i12 - 8, bArr) * j13;
                jD2 = d(Long.rotateRight(jA5, 30) + Long.rotateRight(jA3 + jA4, 43) + (r13.a(i12 - 16, bArr) * (-7286425919675154353L)), Long.rotateRight(jA4 - 7286425919675154353L, 18) + jA3 + jA5, j13);
            } else if (i12 >= 8) {
                long j14 = (i12 * 2) - 7286425919675154353L;
                ?? r14 = z.f360287a;
                long jA6 = r14.a(0, bArr) - 7286425919675154353L;
                long jA7 = r14.a(i12 - 8, bArr);
                jD2 = d((Long.rotateRight(jA7, 37) * j14) + jA6, (Long.rotateRight(jA6, 25) + jA7) * j14, j14);
            } else if (i12 >= 4) {
                jD2 = d(((z.a(0, bArr) & 4294967295L) << 3) + i12, z.a(i12 - 4, bArr) & 4294967295L, (2 * i12) - 7286425919675154353L);
            } else if (i12 > 0) {
                long j15 = (((bArr[0] & 255) + ((bArr[i12 >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((i12 + ((bArr[i12 - 1] & 255) << 2)) * (-4348849565147123417L));
                jD2 = (-7286425919675154353L) * (j15 ^ (j15 >>> 47));
            }
        } else if (i12 <= 64) {
            long j16 = (i12 * 2) - 7286425919675154353L;
            ?? r15 = z.f360287a;
            long jA8 = r15.a(0, bArr) * (-7286425919675154353L);
            long jA9 = r15.a(8, bArr);
            long jA10 = r15.a(i12 - 8, bArr) * j16;
            long jRotateRight2 = Long.rotateRight(jA10, 30) + Long.rotateRight(jA8 + jA9, 43) + (r15.a(i12 - 16, bArr) * (-7286425919675154353L));
            long jD3 = d(jRotateRight2, Long.rotateRight(jA9 - 7286425919675154353L, 18) + jA8 + jA10, j16);
            long jA11 = r15.a(16, bArr) * j16;
            long jA12 = r15.a(24, bArr);
            long jA13 = (jRotateRight2 + r15.a(i12 - 32, bArr)) * j16;
            jD2 = d(Long.rotateRight(jA13, 30) + Long.rotateRight(jA11 + jA12, 43) + ((jD3 + r15.a(i12 - 24, bArr)) * j16), Long.rotateRight(jA12 + jA8, 18) + jA11 + jA13, j16);
        } else {
            long j17 = 81;
            long j18 = (j17 * (-5435081209227447693L)) + 113;
            long j19 = (j18 * (-7286425919675154353L)) + 113;
            long j22 = (j19 ^ (j19 >>> 47)) * (-7286425919675154353L);
            long[] jArr2 = new long[2];
            long[] jArr3 = new long[2];
            long jA14 = (j17 * (-7286425919675154353L)) + z.f360287a.a(0, bArr);
            int i15 = i12 - 1;
            int i16 = (i15 / 64) * 64;
            int i17 = i15 & 63;
            int i18 = i16 + i17;
            int i19 = i18 - 63;
            int i22 = 0;
            while (true) {
                long j23 = jA14 + j18 + jArr2[0];
                r12 = z.f360287a;
                long jRotateRight3 = Long.rotateRight(j23 + r12.a(i22 + 8, bArr), i14) * (-5435081209227447693L);
                long jRotateRight4 = Long.rotateRight(j18 + jArr2[1] + r12.a(i22 + 48, bArr), 42) * (-5435081209227447693L);
                j12 = jRotateRight3 ^ jArr3[1];
                jA2 = jArr2[0] + r12.a(i22 + 40, bArr) + jRotateRight4;
                jRotateRight = Long.rotateRight(j22 + jArr3[0], 33) * (-5435081209227447693L);
                i13 = i17;
                jArr = jArr3;
                e(bArr, i22, jArr2[1] * (-5435081209227447693L), j12 + jArr3[0], jArr2);
                e(bArr, i22 + 32, jRotateRight + jArr[1], jA2 + r12.a(i22 + 16, bArr), jArr);
                int i23 = i22 + 64;
                if (i23 == i16) {
                    break;
                }
                i22 = i23;
                jA14 = jRotateRight;
                j22 = j12;
                j18 = jA2;
                jArr3 = jArr;
                i14 = 37;
                i17 = i13;
            }
            long j24 = ((j12 & 255) << 1) - 5435081209227447693L;
            long j25 = jArr[0] + i13;
            jArr[0] = j25;
            long j26 = jArr2[0] + j25;
            jArr2[0] = j26;
            jArr[0] = jArr[0] + j26;
            long jRotateRight5 = Long.rotateRight(jRotateRight + jA2 + jArr2[0] + r12.a(i18 - 55, bArr), 37) * j24;
            long jRotateRight6 = Long.rotateRight(jA2 + jArr2[1] + r12.a(i18 - 15, bArr), 42) * j24;
            long j27 = jRotateRight5 ^ (jArr[1] * 9);
            long jA15 = (jArr2[0] * 9) + r12.a(i18 - 23, bArr) + jRotateRight6;
            long jRotateRight7 = Long.rotateRight(j12 + jArr[0], 33) * j24;
            e(bArr, i19, jArr2[1] * j24, j27 + jArr[0], jArr2);
            e(bArr, i18 - 31, jRotateRight7 + jArr[1], jA15 + r12.a(i18 - 47, bArr), jArr);
            jD2 = d(((jA15 ^ (jA15 >>> 47)) * (-4348849565147123417L)) + d(jArr2[0], jArr[0], j24) + j27, d(jArr2[1], jArr[1], j24) + jRotateRight7, j24);
        }
        long j28 = jD2;
        char[] cArr = q.f360281b;
        return new q.c(j28);
    }

    public final String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}

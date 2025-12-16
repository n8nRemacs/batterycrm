package defpackage;

import java.util.Arrays;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class l8a {
    public long[] a;
    public long[] b;
    public long[] c;
    public int d;
    public int e;
    public int f;

    public l8a(int i) {
        this.a = fzd.a;
        long[] jArr = dk8.b;
        this.b = jArr;
        this.c = jArr;
        if (i < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        d(fzd.f(i));
    }

    public final int a(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final int b(long j) {
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (i2 * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public final long c(long j) {
        int iB = b(j);
        if (iB >= 0) {
            return this.c[iB];
        }
        throw new NoSuchElementException(vb9.e(j, "Cannot find value for key "));
    }

    public final void d(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, fzd.e(i)) : 0;
        this.d = iMax;
        if (iMax == 0) {
            jArr = fzd.a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f = fzd.a(this.d) - this.e;
        this.b = new long[iMax];
        this.c = new long[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006d, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0078, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
    
        r1 = a(r3);
        r7 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0082, code lost:
    
        if (r29.f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0094, code lost:
    
        if (((r29.a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0096, code lost:
    
        r22 = 255;
        r16 = 1;
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
    
        r1 = r29.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
    
        if (r1 <= 8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b2, code lost:
    
        if (java.lang.Long.compareUnsigned(r29.e * 32, r1 * 25) > 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b4, code lost:
    
        r1 = r29.a;
        r2 = r29.d;
        r6 = 0;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ba, code lost:
    
        if (r6 >= r2) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bc, code lost:
    
        r14 = r6 >> 3;
        r15 = (r6 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ca, code lost:
    
        if (((r1[r14] >> r15) & r7) != 254) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cc, code lost:
    
        r4 = r29.a;
        r22 = r7;
        r4[r14] = (r4[r14] & (~(r22 << r15))) | (128 << r15);
        r5 = r29.d;
        r7 = ((r6 - 7) & r5) + (r5 & 7);
        r5 = r7 >> 3;
        r7 = (r7 & 7) << 3;
        r8 = r13;
        r4[r5] = ((~(r22 << r7)) & r4[r5]) | (128 << r7);
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fc, code lost:
    
        r22 = r7;
        r8 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0101, code lost:
    
        r6 = r6 + 1;
        r13 = r8;
        r7 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0107, code lost:
    
        r22 = r7;
        r8 = r13;
        r20 = 128;
        r29.f += r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0111, code lost:
    
        r16 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0115, code lost:
    
        r22 = 255;
        r8 = 1;
        r20 = 128;
        r1 = defpackage.fzd.d(r29.d);
        r2 = r29.a;
        r4 = r29.b;
        r5 = r29.c;
        r6 = r29.d;
        d(r1);
        r1 = r29.b;
        r7 = r29.c;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0130, code lost:
    
        if (r9 >= r6) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013f, code lost:
    
        if (((r2[r9 >> 3] >> ((r9 & 7) << 3)) & 255) >= 128) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0141, code lost:
    
        r12 = r4[r9];
        r14 = java.lang.Long.hashCode(r12) * r19;
        r14 = r14 ^ (r14 << 16);
        r15 = a(r14 >>> 7);
        r16 = r8;
        r17 = r9;
        r8 = r14 & 127;
        r14 = r29.a;
        r18 = r15 >> 3;
        r24 = (r15 & 7) << 3;
        r28 = r1;
        r27 = r2;
        r14[r18] = (r14[r18] & (~(255 << r24))) | (r8 << r24);
        r1 = r29.d;
        r2 = ((r15 - 7) & r1) + (r1 & 7);
        r1 = r2 >> 3;
        r2 = (r2 & 7) << 3;
        r14[r1] = (r14[r1] & (~(255 << r2))) | (r8 << r2);
        r28[r15] = r12;
        r7[r15] = r5[r17];
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0197, code lost:
    
        r28 = r1;
        r27 = r2;
        r16 = r8;
        r17 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x019f, code lost:
    
        r9 = r17 + 1;
        r8 = r16;
        r2 = r27;
        r1 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01a8, code lost:
    
        r1 = a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01ac, code lost:
    
        r29.e++;
        r2 = r29.f;
        r3 = r29.a;
        r4 = r1 >> 3;
        r5 = r3[r4];
        r7 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01c4, code lost:
    
        if (((r5 >> r7) & r22) != r20) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01c7, code lost:
    
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c9, code lost:
    
        r29.f = r2 - r16;
        r3[r4] = (r5 & (~(r22 << r7))) | (r10 << r7);
        r2 = r29.d;
        r4 = ((r1 - 7) & r2) + (r2 & 7);
        r2 = r4 >> 3;
        r4 = (r4 & 7) << 3;
        r3[r2] = (r3[r2] & (~(r22 << r4))) | (r10 << r4);
        r1 = ~r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r30, long r32) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l8a.e(long, long):void");
    }

    public final boolean equals(Object obj) {
        boolean z;
        long[] jArr;
        boolean z2;
        long[] jArr2;
        boolean z3 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l8a)) {
            return false;
        }
        l8a l8aVar = (l8a) obj;
        if (l8aVar.e != this.e) {
            return false;
        }
        long[] jArr3 = this.b;
        long[] jArr4 = this.c;
        long[] jArr5 = this.a;
        int length = jArr5.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr5[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                int i3 = 0;
                while (i3 < i2) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        z2 = z3;
                        jArr2 = jArr3;
                        if (jArr4[i4] != l8aVar.c(jArr2[i4])) {
                            return false;
                        }
                    } else {
                        z2 = z3;
                        jArr2 = jArr3;
                    }
                    j >>= 8;
                    i3++;
                    z3 = z2;
                    jArr3 = jArr2;
                }
                z = z3;
                jArr = jArr3;
                if (i2 != 8) {
                    return z;
                }
            } else {
                z = z3;
                jArr = jArr3;
            }
            if (i == length) {
                return z;
            }
            i++;
            z3 = z;
            jArr3 = jArr;
        }
    }

    public final int hashCode() {
        long[] jArr = this.b;
        long[] jArr2 = this.c;
        long[] jArr3 = this.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr3[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        iHashCode += Long.hashCode(jArr[i4]) ^ Long.hashCode(jArr2[i4]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.b;
        long[] jArr2 = this.c;
        long[] jArr3 = this.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                long j = jArr3[i5];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8;
                    int i8 = 8 - ((~(i5 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((255 & j) < 128) {
                            int i10 = (i5 << 3) + i9;
                            i2 = i5;
                            long j2 = jArr[i10];
                            i3 = i7;
                            i4 = i9;
                            long j3 = jArr2[i10];
                            sb.append(j2);
                            sb.append("=");
                            sb.append(j3);
                            i6++;
                            if (i6 < this.e) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i5;
                            i3 = i7;
                            i4 = i9;
                        }
                        j >>= i3;
                        i9 = i4 + 1;
                        i5 = i2;
                        i7 = i3;
                    }
                    int i11 = i5;
                    if (i8 != i7) {
                        break;
                    }
                    i = i11;
                } else {
                    i = i5;
                }
                if (i == length) {
                    break;
                }
                i5 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ l8a() {
        this(6);
    }
}

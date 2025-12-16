package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class g8a {
    public long[] a = fzd.a;
    public int[] b = vo7.b;
    public long[] c = dk8.b;
    public int d;
    public int e;
    public int f;

    public g8a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        c(fzd.f(i));
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

    public final int b(int i) {
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final void c(int i) {
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
        this.b = new int[iMax];
        this.c = new long[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006d, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0079, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007b, code lost:
    
        r2 = a(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
    
        if (r29.f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0097, code lost:
    
        if (((r29.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
    
        r23 = 255;
        r20 = 1;
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a1, code lost:
    
        r2 = r29.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a3, code lost:
    
        if (r2 <= 8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b5, code lost:
    
        if (java.lang.Long.compareUnsigned(r29.e * 32, r2 * 25) > 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b7, code lost:
    
        r2 = r29.a;
        r3 = r29.d;
        r7 = 0;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bd, code lost:
    
        if (r7 >= r3) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bf, code lost:
    
        r13 = r7 >> 3;
        r20 = (r7 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cd, code lost:
    
        if (((r2[r13] >> r20) & r11) != 254) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cf, code lost:
    
        r5 = r29.a;
        r23 = r11;
        r5[r13] = (r5[r13] & (~(r23 << r20))) | (128 << r20);
        r6 = r29.d;
        r11 = ((r7 - 7) & r6) + (r6 & 7);
        r6 = r11 >> 3;
        r11 = (r11 & 7) << 3;
        r20 = r14;
        r5[r6] = (r5[r6] & (~(r23 << r11))) | (128 << r11);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0101, code lost:
    
        r23 = r11;
        r20 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0107, code lost:
    
        r7 = r7 + 1;
        r14 = r20;
        r11 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010e, code lost:
    
        r23 = r11;
        r20 = r14;
        r16 = 128;
        r29.f += r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x011b, code lost:
    
        r23 = 255;
        r20 = 1;
        r16 = 128;
        r2 = defpackage.fzd.d(r29.d);
        r3 = r29.a;
        r5 = r29.b;
        r6 = r29.c;
        r7 = r29.d;
        c(r2);
        r2 = r29.b;
        r8 = r29.c;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0137, code lost:
    
        if (r11 >= r7) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0146, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0148, code lost:
    
        r12 = r5[r11];
        r13 = java.lang.Integer.hashCode(r12) * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = a(r13 >>> 7);
        r15 = r2;
        r1 = r13 & 127;
        r13 = r29.a;
        r18 = r14 >> 3;
        r19 = (r14 & 7) << 3;
        r13[r18] = (r13[r18] & (~(255 << r19))) | (r1 << r19);
        r1 = r29.d;
        r2 = ((r14 - 7) & r1) + (r1 & 7);
        r1 = r2 >> 3;
        r2 = (r2 & 7) << 3;
        r13[r1] = (r13[r1] & (~(255 << r2))) | (r1 << r2);
        r15[r14] = r12;
        r8[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x019a, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x019b, code lost:
    
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01a1, code lost:
    
        r2 = a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01a5, code lost:
    
        r29.e++;
        r1 = r29.f;
        r3 = r29.a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01bd, code lost:
    
        if (((r5 >> r7) & r23) != r16) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01c0, code lost:
    
        r20 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01c2, code lost:
    
        r29.f = r1 - r20;
        r3[r4] = (r5 & (~(r23 << r7))) | (r9 << r7);
        r1 = r29.d;
        r4 = ((r2 - 7) & r1) + (r1 & 7);
        r1 = r4 >> 3;
        r4 = (r4 & 7) << 3;
        r3[r1] = (r3[r1] & (~(r23 << r4))) | (r9 << r4);
        r13 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r30, long r31) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g8a.d(int, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof defpackage.g8a
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            g8a r1 = (defpackage.g8a) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.b
            long[] r5 = r0.c
            long[] r6 = r0.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L75
            r8 = r4
        L23:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L70
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L6e
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L6a
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r16 = r5[r14]
            int r14 = r1.b(r15)
            if (r14 < 0) goto L5e
            long[] r15 = r1.c
            r14 = r15[r14]
            int r14 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r14 == 0) goto L6a
            return r4
        L5e:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Cannot find value for key "
            java.lang.String r2 = defpackage.ho7.f(r15, r2)
            r1.<init>(r2)
            throw r1
        L6a:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3d
        L6e:
            if (r11 != r12) goto L75
        L70:
            if (r8 == r7) goto L75
            int r8 = r8 + 1
            goto L23
        L75:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g8a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int[] iArr = this.b;
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        iHashCode += Integer.hashCode(iArr[i4]) ^ Long.hashCode(jArr[i4]);
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
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.b;
        long[] jArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            int i8 = iArr[i7];
                            i2 = i3;
                            long j2 = jArr[i7];
                            sb.append(i8);
                            sb.append("=");
                            sb.append(j2);
                            i4++;
                            if (i4 < this.e) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i9 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i9;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

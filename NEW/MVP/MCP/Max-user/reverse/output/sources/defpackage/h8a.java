package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h8a {
    public long[] a = fzd.a;
    public int[] b = vo7.b;
    public Object[] c = zk6.e;
    public int d;
    public int e;
    public int f;

    public h8a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        d(fzd.f(i));
    }

    public final int a(int i) {
        long j;
        int i2;
        long j2;
        int[] iArr;
        long[] jArr;
        int i3;
        long j3;
        int i4 = -862048943;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.d;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr2 = this.a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j4 = ((jArr2[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr2[i11] >>> i12);
            long j5 = i7;
            int i14 = i10;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j7) >> 3)) & i8;
                int i15 = i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i4 = i15;
            }
            int i16 = i4;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iB = b(i6);
                long j8 = 255;
                if (this.f != 0 || ((this.a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j = 255;
                    i2 = 1;
                    j2 = 128;
                } else {
                    int i17 = this.d;
                    if (i17 <= 8 || Long.compareUnsigned(this.e * 32, i17 * 25) > 0) {
                        j = 255;
                        j2 = 128;
                        int iD = fzd.d(this.d);
                        long[] jArr3 = this.a;
                        int[] iArr2 = this.b;
                        Object[] objArr = this.c;
                        int i18 = this.d;
                        d(iD);
                        int[] iArr3 = this.b;
                        Object[] objArr2 = this.c;
                        int i19 = 0;
                        while (i19 < i18) {
                            if (((jArr3[i19 >> 3] >> ((i19 & 7) << 3)) & 255) < 128) {
                                int i20 = iArr2[i19];
                                int iHashCode2 = Integer.hashCode(i20) * i16;
                                int i21 = iHashCode2 ^ (iHashCode2 << 16);
                                int iB2 = b(i21 >>> 7);
                                i3 = i13;
                                long j9 = i21 & 127;
                                long[] jArr4 = this.a;
                                int i22 = iB2 >> 3;
                                int i23 = (iB2 & 7) << 3;
                                iArr = iArr3;
                                jArr = jArr3;
                                jArr4[i22] = (jArr4[i22] & (~(255 << i23))) | (j9 << i23);
                                int i24 = this.d;
                                int i25 = ((iB2 - 7) & i24) + (i24 & 7);
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                jArr4[i26] = (jArr4[i26] & (~(255 << i27))) | (j9 << i27);
                                iArr[iB2] = i20;
                                objArr2[iB2] = objArr[i19];
                            } else {
                                iArr = iArr3;
                                jArr = jArr3;
                                i3 = i13;
                            }
                            i19++;
                            i13 = i3;
                            jArr3 = jArr;
                            iArr3 = iArr;
                        }
                    } else {
                        long[] jArr5 = this.a;
                        int i28 = this.d;
                        int i29 = 0;
                        int i30 = 0;
                        while (i29 < i28) {
                            int i31 = i29 >> 3;
                            int i32 = (i29 & 7) << 3;
                            if (((jArr5[i31] >> i32) & j8) == 254) {
                                long[] jArr6 = this.a;
                                jArr6[i31] = (jArr6[i31] & (~(j8 << i32))) | (128 << i32);
                                int i33 = this.d;
                                int i34 = ((i29 - 7) & i33) + (i33 & 7);
                                int i35 = i34 >> 3;
                                int i36 = (i34 & 7) << 3;
                                j3 = j8;
                                jArr6[i35] = (jArr6[i35] & (~(j3 << i36))) | (128 << i36);
                                i30++;
                            } else {
                                j3 = j8;
                            }
                            i29++;
                            j8 = j3;
                        }
                        j = j8;
                        j2 = 128;
                        this.f += i30;
                    }
                    i2 = i13;
                    iB = b(i6);
                }
                this.e += i2;
                int i37 = this.f;
                long[] jArr7 = this.a;
                int i38 = iB >> 3;
                long j10 = jArr7[i38];
                int i39 = (iB & 7) << 3;
                if (((j10 >> i39) & j) != j2) {
                    i2 = 0;
                }
                this.f = i37 - i2;
                jArr7[i38] = (j10 & (~(j << i39))) | (j5 << i39);
                int i40 = this.d;
                int i41 = ((iB - 7) & i40) + (i40 & 7);
                int i42 = i41 >> 3;
                int i43 = (i41 & 7) << 3;
                jArr7[i42] = (jArr7[i42] & (~(j << i43))) | (j5 << i43);
                return iB;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i16;
        }
    }

    public final int b(int i) {
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.b
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6d
            r10 = -1
        L64:
            if (r10 < 0) goto L6b
            java.lang.Object[] r14 = r13.c
            r14 = r14[r10]
            return r14
        L6b:
            r14 = 0
            return r14
        L6d:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h8a.c(int):java.lang.Object");
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
        this.b = new int[iMax];
        this.c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
    
        r26 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00db, code lost:
    
        if (((r2 & ((~r2) << 6)) & r19) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dd, code lost:
    
        r24 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
    
        return r18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h8a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int[] iArr = this.b;
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        Object obj = objArr[i4];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i5);
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            int[] r2 = r0.b
            java.lang.Object[] r3 = r0.c
            long[] r4 = r0.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6f
            r6 = 0
            r7 = r6
            r8 = r7
        L1e:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L6a
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L38:
            if (r13 >= r11) goto L68
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L64
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            if (r14 != r0) goto L56
            java.lang.String r14 = "(this)"
        L56:
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.e
            if (r8 >= r14) goto L64
            java.lang.String r14 = ", "
            r1.append(r14)
        L64:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L68:
            if (r11 != r12) goto L6f
        L6a:
            if (r7 == r5) goto L6f
            int r7 = r7 + 1
            goto L1e
        L6f:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h8a.toString():java.lang.String");
    }
}

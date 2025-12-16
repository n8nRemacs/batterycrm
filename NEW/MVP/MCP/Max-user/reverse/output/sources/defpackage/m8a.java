package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m8a {
    public long[] a;
    public long[] b;
    public Object[] c;
    public int d;
    public int e;
    public int f;

    public m8a(int i) {
        this.a = fzd.a;
        this.b = dk8.b;
        this.c = zk6.e;
        if (i < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        e(fzd.f(i));
    }

    public final void a() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != fzd.a) {
            ys.r(jArr);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        Arrays.fill(this.c, 0, this.d, (Object) null);
        this.f = fzd.a(this.d) - this.e;
    }

    public final int b(long j) {
        long j2;
        int i;
        long j3;
        int i2;
        long[] jArr;
        long[] jArr2;
        int i3;
        int i4;
        long j4;
        int i5;
        int i6 = -862048943;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i7 = iHashCode ^ (iHashCode << 16);
        int i8 = i7 >>> 7;
        int i9 = i7 & 127;
        int i10 = this.d;
        int i11 = i8 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            int i15 = 1;
            long j5 = ((jArr3[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr3[i13] >>> i14);
            long j6 = i9;
            int i16 = i12;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
            while (j8 != 0) {
                int iNumberOfTrailingZeros = (i11 + (Long.numberOfTrailingZeros(j8) >> 3)) & i10;
                int i17 = i6;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    return iNumberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i6 = i17;
            }
            int i18 = i6;
            if ((((~j5) << 6) & j5 & (-9187201950435737472L)) != 0) {
                int iC = c(i8);
                long j9 = 255;
                if (this.f != 0 || ((this.a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    i = 1;
                    j3 = 128;
                } else {
                    int i19 = this.d;
                    if (i19 <= 8 || Long.compareUnsigned(this.e * 32, i19 * 25) > 0) {
                        j2 = 255;
                        i2 = 1;
                        j3 = 128;
                        int iD = fzd.d(this.d);
                        long[] jArr4 = this.a;
                        long[] jArr5 = this.b;
                        Object[] objArr = this.c;
                        int i20 = this.d;
                        e(iD);
                        long[] jArr6 = this.b;
                        Object[] objArr2 = this.c;
                        int i21 = 0;
                        while (i21 < i20) {
                            if (((jArr4[i21 >> 3] >> ((i21 & 7) << 3)) & 255) < 128) {
                                long j10 = jArr5[i21];
                                int iHashCode2 = Long.hashCode(j10) * i18;
                                int i22 = iHashCode2 ^ (iHashCode2 << 16);
                                int iC2 = c(i22 >>> 7);
                                i3 = i2;
                                i4 = i21;
                                long j11 = i22 & 127;
                                long[] jArr7 = this.a;
                                int i23 = iC2 >> 3;
                                int i24 = (iC2 & 7) << 3;
                                jArr = jArr6;
                                jArr2 = jArr4;
                                jArr7[i23] = (jArr7[i23] & (~(255 << i24))) | (j11 << i24);
                                int i25 = this.d;
                                int i26 = ((iC2 - 7) & i25) + (i25 & 7);
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                jArr7[i27] = (jArr7[i27] & (~(255 << i28))) | (j11 << i28);
                                jArr[iC2] = j10;
                                objArr2[iC2] = objArr[i4];
                            } else {
                                jArr = jArr6;
                                jArr2 = jArr4;
                                i3 = i2;
                                i4 = i21;
                            }
                            i21 = i4 + 1;
                            i2 = i3;
                            jArr4 = jArr2;
                            jArr6 = jArr;
                        }
                    } else {
                        long[] jArr8 = this.a;
                        int i29 = this.d;
                        int i30 = 0;
                        int i31 = 0;
                        while (i30 < i29) {
                            int i32 = i30 >> 3;
                            int i33 = (i30 & 7) << 3;
                            if (((jArr8[i32] >> i33) & j9) == 254) {
                                long[] jArr9 = this.a;
                                j4 = j9;
                                jArr9[i32] = (jArr9[i32] & (~(j4 << i33))) | (128 << i33);
                                int i34 = this.d;
                                int i35 = ((i30 - 7) & i34) + (i34 & 7);
                                int i36 = i35 >> 3;
                                int i37 = (i35 & 7) << 3;
                                i5 = i15;
                                jArr9[i36] = ((~(j4 << i37)) & jArr9[i36]) | (128 << i37);
                                i31++;
                            } else {
                                j4 = j9;
                                i5 = i15;
                            }
                            i30++;
                            i15 = i5;
                            j9 = j4;
                        }
                        j2 = j9;
                        i2 = i15;
                        j3 = 128;
                        this.f += i31;
                    }
                    i = i2;
                    iC = c(i8);
                }
                this.e++;
                int i38 = this.f;
                long[] jArr10 = this.a;
                int i39 = iC >> 3;
                long j12 = jArr10[i39];
                int i40 = (iC & 7) << 3;
                if (((j12 >> i40) & j2) != j3) {
                    i = 0;
                }
                this.f = i38 - i;
                jArr10[i39] = (j12 & (~(j2 << i40))) | (j6 << i40);
                int i41 = this.d;
                int i42 = ((iC - 7) & i41) + (i41 & 7);
                int i43 = i42 >> 3;
                int i44 = (i42 & 7) << 3;
                jArr10[i43] = (jArr10[i43] & (~(j2 << i44))) | (j6 << i44);
                return iC;
            }
            i12 = i16 + 8;
            i11 = (i11 + i12) & i10;
            i6 = i18;
        }
    }

    public final int c(int i) {
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r15) {
        /*
            r14 = this;
            int r0 = java.lang.Long.hashCode(r15)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r14.a
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
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.b
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L56
            goto L66
        L56:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6f
            r10 = -1
        L66:
            if (r10 < 0) goto L6d
            java.lang.Object[] r0 = r14.c
            r0 = r0[r10]
            return r0
        L6d:
            r0 = 0
            return r0
        L6f:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m8a.d(long):java.lang.Object");
    }

    public final void e(int i) {
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
        this.c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00da, code lost:
    
        if (((r2 & ((~r2) << 6)) & r20) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dc, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f4, code lost:
    
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
    public final boolean equals(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m8a.equals(java.lang.Object):boolean");
    }

    public final void f(long j, Object obj) {
        int iB = b(j);
        Object[] objArr = this.c;
        Object obj2 = objArr[iB];
        this.b[iB] = j;
        objArr[iB] = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r15) {
        /*
            Method dump skipped, instructions count: 174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m8a.g(long):java.lang.Object");
    }

    public final void h(long j, Object obj) {
        int iB = b(j);
        this.b[iB] = j;
        this.c[iB] = obj;
    }

    public final int hashCode() {
        long[] jArr = this.b;
        Object[] objArr = this.c;
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
                        long j2 = jArr[i4];
                        Object obj = objArr[i4];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j2);
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
        long[] jArr = this.b;
        Object[] objArr = this.c;
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
                            i2 = i3;
                            long j2 = jArr[i7];
                            Object obj = objArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
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
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
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

    public /* synthetic */ m8a() {
        this(6);
    }
}

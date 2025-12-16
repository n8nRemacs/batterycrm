package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class s8a {
    public long[] a = fzd.a;
    public Object[] b = zk6.e;
    public int[] c = vo7.b;
    public int d;
    public int e;
    public int f;

    public s8a(int i) {
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

    public final int b(Object obj) {
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (fni.a(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
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
        this.b = new Object[iMax];
        this.c = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
    
        r2 = a(r5);
        r8 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
    
        if (r29.f != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
    
        if (((r29.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
    
        r23 = 255;
        r21 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a6, code lost:
    
        r2 = r29.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        if (r2 <= 8) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b9, code lost:
    
        if (java.lang.Long.compareUnsigned(r29.e * 32, r2 * 25) > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
    
        r2 = r29.a;
        r3 = r29.d;
        r4 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
    
        if (r4 >= r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
    
        r13 = r4 >> 3;
        r14 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
    
        if (((r2[r13] >> r14) & r8) != 254) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d3, code lost:
    
        r6 = r29.a;
        r23 = r8;
        r6[r13] = (r6[r13] & (~(r23 << r14))) | (128 << r14);
        r7 = r29.d;
        r8 = ((r4 - 7) & r7) + (r7 & 7);
        r7 = r8 >> 3;
        r8 = (r8 & 7) << 3;
        r9 = r2;
        r6[r7] = ((~(r23 << r8)) & r6[r7]) | (128 << r8);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0103, code lost:
    
        r23 = r8;
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0108, code lost:
    
        r4 = r4 + 1;
        r2 = r9;
        r8 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0110, code lost:
    
        r23 = r8;
        r21 = 128;
        r29.f += r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x011b, code lost:
    
        r23 = 255;
        r21 = 128;
        r1 = defpackage.fzd.d(r29.d);
        r2 = r29.a;
        r3 = r29.b;
        r4 = r29.c;
        r6 = r29.d;
        c(r1);
        r1 = r29.b;
        r7 = r29.c;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0135, code lost:
    
        if (r8 >= r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0144, code lost:
    
        if (((r2[r8 >> 3] >> ((r8 & 7) << 3)) & 255) >= 128) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0146, code lost:
    
        r9 = r3[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0148, code lost:
    
        if (r9 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014a, code lost:
    
        r10 = r9.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014f, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0150, code lost:
    
        r10 = r10 * r20;
        r10 = r10 ^ (r10 << 16);
        r13 = a(r10 >>> 7);
        r17 = r1;
        r14 = r2;
        r1 = r10 & 127;
        r10 = r29.a;
        r18 = r13 >> 3;
        r19 = (r13 & 7) << 3;
        r10[r18] = (r10[r18] & (~(255 << r19))) | (r1 << r19);
        r1 = r29.d;
        r2 = ((r13 - 7) & r1) + (r1 & 7);
        r1 = r2 >> 3;
        r2 = (r2 & 7) << 3;
        r10[r1] = (r10[r1] & (~(255 << r2))) | (r1 << r2);
        r17[r13] = r9;
        r7[r13] = r4[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x019e, code lost:
    
        r17 = r1;
        r14 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a1, code lost:
    
        r8 = r8 + 1;
        r2 = r14;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01a7, code lost:
    
        r2 = a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ab, code lost:
    
        r29.e++;
        r1 = r29.f;
        r3 = r29.a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c3, code lost:
    
        if (((r5 >> r7) & r23) != r21) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c5, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c8, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01c9, code lost:
    
        r29.f = r1 - r15;
        r3[r4] = (r5 & (~(r23 << r7))) | (r11 << r7);
        r1 = r29.d;
        r4 = ((r2 - 7) & r1) + (r1 & 7);
        r1 = r4 >> 3;
        r4 = (r4 & 7) << 3;
        r3[r1] = (r3[r1] & (~(r23 << r4))) | (r11 << r4);
        r1 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r30, java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s8a.d(int, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
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
            boolean r3 = r1 instanceof defpackage.s8a
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            s8a r1 = (defpackage.s8a) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.b
            int[] r5 = r0.c
            long[] r6 = r0.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L80
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
            if (r11 == 0) goto L7b
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L79
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L75
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            int r16 = r1.b(r15)
            if (r16 < 0) goto L5c
            int[] r15 = r1.c
            r15 = r15[r16]
            if (r14 == r15) goto L75
            return r4
        L5c:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "There is no key "
            r2.<init>(r3)
            r2.append(r15)
            java.lang.String r3 = " in the map"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L75:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3d
        L79:
            if (r11 != r12) goto L80
        L7b:
            if (r8 == r7) goto L80
            int r8 = r8 + 1
            goto L23
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s8a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        int[] iArr = this.c;
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
                        Object obj = objArr[i4];
                        iHashCode += Integer.hashCode(iArr[i4]) ^ (obj != null ? obj.hashCode() : 0);
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
            java.lang.Object[] r2 = r0.b
            int[] r3 = r0.c
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
            if (r15 != r0) goto L4e
            java.lang.String r15 = "(this)"
        L4e:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s8a.toString():java.lang.String");
    }
}

package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class yj8 {
    public int a;
    public long[] b;
    public long[] c;
    public Object[] d;
    public int e;
    public int f;

    public final int a(int i) {
        int i2 = this.e;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.b;
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r15) {
        /*
            r14 = this;
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            int r0 = r0.hashCode()
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.e
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L17:
            long[] r4 = r14.b
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
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L60
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.c
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L5a
            goto L6a
        L5a:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L60:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L73
            r10 = -1
        L6a:
            if (r10 < 0) goto L71
            java.lang.Object[] r0 = r14.d
            r0 = r0[r10]
            return r0
        L71:
            r0 = 0
            return r0
        L73:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj8.b(long):java.lang.Object");
    }

    public final void c(int i) {
        int iMax;
        long[] jArr;
        if (i > 0) {
            iMax = Math.max(7, i > 0 ? (-1) >>> Integer.numberOfLeadingZeros(i) : 0);
        } else {
            iMax = 0;
        }
        this.e = iMax;
        if (iMax == 0) {
            jArr = gei.a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.b = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        int i4 = this.e;
        this.a = (i4 == 7 ? 6 : i4 - (i4 / 8)) - this.f;
        this.c = new long[iMax];
        this.d = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(long r15) {
        /*
            Method dump skipped, instructions count: 177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj8.d(long):void");
    }

    public final void e(int i) {
        long[] jArr;
        yj8 yj8Var = this;
        long[] jArr2 = yj8Var.b;
        long[] jArr3 = yj8Var.c;
        Object[] objArr = yj8Var.d;
        int i2 = yj8Var.e;
        c(i);
        long[] jArr4 = yj8Var.c;
        Object[] objArr2 = yj8Var.d;
        int i3 = 0;
        while (i3 < i2) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                long j = jArr3[i3];
                int iHashCode = Long.valueOf(j).hashCode() * (-862048943);
                int i4 = iHashCode ^ (iHashCode << 16);
                int iA = yj8Var.a(i4 >>> 7);
                long j2 = i4 & 127;
                long[] jArr5 = yj8Var.b;
                int i5 = iA >> 3;
                int i6 = (iA & 7) << 3;
                jArr5[i5] = (jArr5[i5] & (~(255 << i6))) | (j2 << i6);
                int i7 = yj8Var.e;
                int i8 = ((iA - 7) & i7) + (i7 & 7);
                int i9 = i8 >> 3;
                int i10 = (i8 & 7) << 3;
                jArr = jArr2;
                jArr5[i9] = (jArr5[i9] & (~(255 << i10))) | (j2 << i10);
                jArr4[iA] = j;
                objArr2[iA] = objArr[i3];
            } else {
                jArr = jArr2;
            }
            i3++;
            yj8Var = this;
            jArr2 = jArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00de, code lost:
    
        if (((r2 & ((~r2) << 6)) & r20) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
    
        r0 = -1;
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
    public final boolean equals(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj8.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0068, code lost:
    
        r11 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0073, code lost:
    
        r1 = a(r2);
        r7 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007b, code lost:
    
        if (r25.a != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008d, code lost:
    
        if (((r25.b[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008f, code lost:
    
        r23 = 255;
        r8 = 1;
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0096, code lost:
    
        r1 = r25.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0098, code lost:
    
        if (r1 <= 8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ac, code lost:
    
        if (java.lang.Long.compareUnsigned(r25.f * 32, r1 * 25) > 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ae, code lost:
    
        r1 = r25.b;
        r3 = r25.e;
        r4 = 0;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b4, code lost:
    
        if (r4 >= r3) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b6, code lost:
    
        r6 = r4 >> 3;
        r11 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c2, code lost:
    
        if (((r1[r6] >> r11) & r7) != 254) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c4, code lost:
    
        r13 = r25.b;
        r23 = r7;
        r13[r6] = (r13[r6] & (~(r23 << r11))) | (128 << r11);
        r6 = r25.e;
        r7 = ((r4 - 7) & r6) + (r6 & 7);
        r6 = r7 >> 3;
        r7 = (r7 & 7) << 3;
        r8 = r12;
        r13[r6] = (r13[r6] & (~(r23 << r7))) | (128 << r7);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f5, code lost:
    
        r23 = r7;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f8, code lost:
    
        r4 = r4 + 1;
        r12 = r8;
        r7 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fe, code lost:
    
        r23 = r7;
        r8 = r12;
        r25.a += r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0107, code lost:
    
        r23 = 255;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010b, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010e, code lost:
    
        r1 = r25.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0110, code lost:
    
        if (r1 != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0113, code lost:
    
        r11 = (r1 * 2) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0117, code lost:
    
        e(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011a, code lost:
    
        r1 = a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011e, code lost:
    
        r15 = r1;
        r25.f += r8;
        r1 = r25.a;
        r2 = r25.b;
        r3 = r15 >> 3;
        r4 = r2[r3];
        r6 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0136, code lost:
    
        if (((r4 >> r6) & r23) != r19) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0138, code lost:
    
        r18 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013b, code lost:
    
        r18 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013d, code lost:
    
        r25.a = r1 - r18;
        r2[r3] = (r4 & (~(r23 << r6))) | (r9 << r6);
        r1 = r25.e;
        r3 = ((r15 - 7) & r1) + (r1 & 7);
        r1 = r3 >> 3;
        r3 = (r3 & 7) << 3;
        r2[r1] = (r2[r1] & (~(r23 << r3))) | (r9 << r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(long r26, defpackage.ckh r28) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj8.f(long, ckh):void");
    }

    public final int hashCode() {
        long[] jArr = this.c;
        Object[] objArr = this.d;
        long[] jArr2 = this.b;
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
        if (this.f == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.c;
        Object[] objArr = this.d;
        long[] jArr2 = this.b;
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
                            if (i4 < this.f) {
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
}

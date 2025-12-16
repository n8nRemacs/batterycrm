package net.bytebuddy.jar.asm;

/* compiled from: ClassReader.java */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f418167a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f418168b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f418169c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f418170d;

    /* renamed from: e, reason: collision with root package name */
    public final h[] f418171e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f418172f;

    /* renamed from: g, reason: collision with root package name */
    public final int f418173g;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public e(byte[] bArr, boolean z12) {
        this.f418168b = bArr;
        if (z12 && o(6) > 63) {
            throw new IllegalArgumentException("Unsupported class file major version " + ((int) o(6)));
        }
        int iT2 = t(8);
        this.f418169c = new int[iT2];
        this.f418170d = new String[iT2];
        int i12 = 10;
        int i13 = 1;
        int i14 = 0;
        boolean z13 = false;
        boolean z14 = false;
        while (true) {
            int iT3 = 4;
            if (i13 >= iT2) {
                this.f418173g = i14;
                this.f418167a = i12;
                int[] iArr = null;
                this.f418171e = z13 ? new h[iT2] : null;
                if (z14) {
                    char[] cArr = new char[i14];
                    int iD2 = d();
                    for (int iT4 = t(iD2 - 2); iT4 > 0; iT4--) {
                        String strS = s(iD2, cArr);
                        int iL2 = l(iD2 + 2);
                        int i15 = iD2 + 6;
                        if ("BootstrapMethods".equals(strS)) {
                            int iT5 = t(i15);
                            int[] iArr2 = new int[iT5];
                            int iT6 = iD2 + 8;
                            for (int i16 = 0; i16 < iT5; i16++) {
                                iArr2[i16] = iT6;
                                iT6 += (t(iT6 + 2) * 2) + 4;
                            }
                            iArr = iArr2;
                        } else {
                            iD2 = i15 + iL2;
                        }
                    }
                    throw new IllegalArgumentException();
                }
                this.f418172f = iArr;
                return;
            }
            int i17 = i13 + 1;
            int i18 = i12 + 1;
            this.f418169c[i13] = i18;
            switch (bArr[i12]) {
                case 1:
                    iT3 = t(i18) + 3;
                    if (iT3 > i14) {
                        i14 = iT3;
                    }
                    i13 = i17;
                    i12 += iT3;
                case 2:
                case 13:
                case 14:
                default:
                    throw new IllegalArgumentException();
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                    i13 = i17;
                    iT3 = 5;
                    i12 += iT3;
                case 5:
                case 6:
                    i13 += 2;
                    iT3 = 9;
                    i12 += iT3;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    i13 = i17;
                    iT3 = 3;
                    i12 += iT3;
                case 15:
                    i13 = i17;
                    i12 += iT3;
                case 17:
                    z13 = true;
                    z14 = true;
                    i13 = i17;
                    iT3 = 5;
                    i12 += iT3;
                case 18:
                    z14 = true;
                    i13 = i17;
                    iT3 = 5;
                    i12 += iT3;
            }
        }
    }

    public static r c(int i12, r[] rVarArr) {
        if (rVarArr[i12] == null) {
            rVarArr[i12] = new r();
        }
        r rVar = rVarArr[i12];
        rVar.f418268a = (short) (rVar.f418268a & (-2));
        return rVar;
    }

    public final void a(int i12, f fVar) {
        b(fVar, new C44390c[0], i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:415:0x0b77, code lost:
    
        if (r2 != 0) goto L426;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(net.bytebuddy.jar.asm.f r70, net.bytebuddy.jar.asm.C44390c[] r71, int r72) {
        /*
            Method dump skipped, instructions count: 3244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.jar.asm.e.b(net.bytebuddy.jar.asm.f, net.bytebuddy.jar.asm.c[], int):void");
    }

    public final int d() {
        int i12 = this.f418167a;
        int iT2 = (t(i12 + 6) * 2) + i12 + 8;
        int iT3 = t(iT2);
        int iL2 = iT2 + 2;
        while (true) {
            int i13 = iT3 - 1;
            if (iT3 <= 0) {
                break;
            }
            int iT4 = t(iL2 + 6);
            iL2 += 8;
            while (true) {
                int i14 = iT4 - 1;
                if (iT4 > 0) {
                    iL2 += l(iL2 + 2) + 6;
                    iT4 = i14;
                }
            }
            iT3 = i13;
        }
        int iT5 = t(iL2);
        int iL3 = iL2 + 2;
        while (true) {
            int i15 = iT5 - 1;
            if (iT5 <= 0) {
                return iL3 + 2;
            }
            int iT6 = t(iL3 + 6);
            iL3 += 8;
            while (true) {
                int i16 = iT6 - 1;
                if (iT6 > 0) {
                    iL3 += l(iL3 + 2) + 6;
                    iT6 = i16;
                }
            }
            iT5 = i15;
        }
    }

    public final int e(int i12, int[] iArr) {
        if (iArr == null || i12 >= iArr.length || g(iArr[i12]) < 67) {
            return -1;
        }
        return t(iArr[i12] + 1);
    }

    public final C44390c f(C44390c[] c44390cArr, String str, int i12, int i13, char[] cArr, int i14, r[] rVarArr) {
        for (C44390c c44390c : c44390cArr) {
            if (c44390c.f418160a.equals(str)) {
                return c44390c.c(this, i12, i13, cArr);
            }
        }
        return new C44390c(str).c(this, i12, i13, null);
    }

    public final int g(int i12) {
        return this.f418168b[i12] & 255;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:147:0x03c1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0957  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0973  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x06ef A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(net.bytebuddy.jar.asm.s r48, net.bytebuddy.jar.asm.j r49, int r50) {
        /*
            Method dump skipped, instructions count: 3880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.jar.asm.e.h(net.bytebuddy.jar.asm.s, net.bytebuddy.jar.asm.j, int):void");
    }

    public final Object i(int i12, char[] cArr) {
        int[] iArr = this.f418169c;
        int i13 = iArr[i12];
        byte[] bArr = this.f418168b;
        byte b12 = bArr[i13 - 1];
        switch (b12) {
            case 3:
                return Integer.valueOf(l(i13));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(l(i13)));
            case 5:
                return Long.valueOf(m(i13));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(m(i13)));
            case 7:
                return B.p(s(i13, cArr));
            case 8:
                return s(i13, cArr);
            default:
                switch (b12) {
                    case 15:
                        int iG2 = g(i13);
                        int i14 = iArr[t(i13 + 1)];
                        int i15 = iArr[t(i14 + 2)];
                        return new p(p(i14, cArr), s(i15, cArr), s(i15 + 2, cArr), iG2, bArr[i14 - 1] == 11);
                    case 16:
                        return B.o(s(i13, cArr));
                    case 17:
                        h[] hVarArr = this.f418171e;
                        h hVar = hVarArr[i12];
                        if (hVar != null) {
                            return hVar;
                        }
                        int i16 = iArr[t(i13 + 2)];
                        String strS = s(i16, cArr);
                        String strS2 = s(i16 + 2, cArr);
                        int i17 = this.f418172f[t(i13)];
                        p pVar = (p) i(t(i17), cArr);
                        int iT2 = t(i17 + 2);
                        Object[] objArr = new Object[iT2];
                        int i18 = i17 + 4;
                        for (int i19 = 0; i19 < iT2; i19++) {
                            objArr[i19] = i(t(i18), cArr);
                            i18 += 2;
                        }
                        h hVar2 = new h(strS, strS2, pVar, objArr);
                        hVarArr[i12] = hVar2;
                        return hVar2;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x01f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j(net.bytebuddy.jar.asm.AbstractC44388a r17, int r18, java.lang.String r19, char[] r20) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.jar.asm.e.j(net.bytebuddy.jar.asm.a, int, java.lang.String, char[]):int");
    }

    public final int k(AbstractC44388a abstractC44388a, int i12, boolean z12, char[] cArr) {
        int iT2 = t(i12);
        int iJ2 = i12 + 2;
        if (!z12) {
            while (true) {
                int i13 = iT2 - 1;
                if (iT2 <= 0) {
                    break;
                }
                iJ2 = j(abstractC44388a, iJ2, null, cArr);
                iT2 = i13;
            }
        } else {
            while (true) {
                int i14 = iT2 - 1;
                if (iT2 <= 0) {
                    break;
                }
                iJ2 = j(abstractC44388a, iJ2 + 2, s(iJ2, cArr), cArr);
                iT2 = i14;
            }
        }
        if (abstractC44388a != null) {
            abstractC44388a.d();
        }
        return iJ2;
    }

    public final int l(int i12) {
        byte[] bArr = this.f418168b;
        return (bArr[i12 + 3] & 255) | ((bArr[i12] & 255) << 24) | ((bArr[i12 + 1] & 255) << 16) | ((bArr[i12 + 2] & 255) << 8);
    }

    public final long m(int i12) {
        return (l(i12) << 32) | (l(i12 + 4) & 4294967295L);
    }

    public final void n(s sVar, j jVar, int i12, boolean z12) {
        int iK2 = i12 + 1;
        int i13 = this.f418168b[i12] & 255;
        sVar.d(i13, z12);
        char[] cArr = jVar.f418214c;
        for (int i14 = 0; i14 < i13; i14++) {
            int iT2 = t(iK2);
            iK2 += 2;
            while (true) {
                int i15 = iT2 - 1;
                if (iT2 > 0) {
                    iK2 = k(sVar.D(i14, s(iK2, cArr), z12), iK2 + 2, true, cArr);
                    iT2 = i15;
                }
            }
        }
    }

    public final short o(int i12) {
        byte[] bArr = this.f418168b;
        return (short) ((bArr[i12 + 1] & 255) | ((bArr[i12] & 255) << 8));
    }

    public final String p(int i12, char[] cArr) {
        return s(this.f418169c[t(i12)], cArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int q(net.bytebuddy.jar.asm.j r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.l(r11)
            int r1 = r0 >>> 24
            r2 = 1
            if (r1 == 0) goto L70
            if (r1 == r2) goto L70
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            switch(r1) {
                case 16: goto L6d;
                case 17: goto L6d;
                case 18: goto L6d;
                case 19: goto L6a;
                case 20: goto L6a;
                case 21: goto L6a;
                case 22: goto L70;
                case 23: goto L6d;
                default: goto L10;
            }
        L10:
            switch(r1) {
                case 64: goto L24;
                case 65: goto L24;
                case 66: goto L6d;
                case 67: goto L20;
                case 68: goto L20;
                case 69: goto L20;
                case 70: goto L20;
                case 71: goto L19;
                case 72: goto L19;
                case 73: goto L19;
                case 74: goto L19;
                case 75: goto L19;
                default: goto L13;
            }
        L13:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>()
            throw r10
        L19:
            r1 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r0 = r0 & r1
            int r11 = r11 + 4
            goto L75
        L20:
            r0 = r0 & r3
        L21:
            int r11 = r11 + 3
            goto L75
        L24:
            r0 = r0 & r3
            int r1 = r11 + 1
            int r1 = r9.t(r1)
            int r11 = r11 + 3
            net.bytebuddy.jar.asm.r[] r3 = new net.bytebuddy.jar.asm.r[r1]
            r10.f418221j = r3
            net.bytebuddy.jar.asm.r[] r3 = new net.bytebuddy.jar.asm.r[r1]
            r10.f418222k = r3
            int[] r3 = new int[r1]
            r10.f418223l = r3
            r3 = 0
        L3a:
            if (r3 >= r1) goto L75
            int r4 = r9.t(r11)
            int r5 = r11 + 2
            int r5 = r9.t(r5)
            int r6 = r11 + 4
            int r6 = r9.t(r6)
            int r11 = r11 + 6
            net.bytebuddy.jar.asm.r[] r7 = r10.f418221j
            net.bytebuddy.jar.asm.r[] r8 = r10.f418218g
            net.bytebuddy.jar.asm.r r8 = c(r4, r8)
            r7[r3] = r8
            net.bytebuddy.jar.asm.r[] r7 = r10.f418222k
            int r4 = r4 + r5
            net.bytebuddy.jar.asm.r[] r5 = r10.f418218g
            net.bytebuddy.jar.asm.r r4 = c(r4, r5)
            r7[r3] = r4
            int[] r4 = r10.f418223l
            r4[r3] = r6
            int r3 = r3 + 1
            goto L3a
        L6a:
            r0 = r0 & r3
            int r11 = r11 + r2
            goto L75
        L6d:
            r0 = r0 & (-256(0xffffffffffffff00, float:NaN))
            goto L21
        L70:
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r1
            int r11 = r11 + 2
        L75:
            r10.f418219h = r0
            int r0 = r9.g(r11)
            if (r0 != 0) goto L7f
            r1 = 0
            goto L86
        L7f:
            net.bytebuddy.jar.asm.C r1 = new net.bytebuddy.jar.asm.C
            byte[] r3 = r9.f418168b
            r1.<init>(r3, r11)
        L86:
            r10.f418220i = r1
            int r11 = r11 + r2
            int r0 = r0 * 2
            int r0 = r0 + r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.jar.asm.e.q(net.bytebuddy.jar.asm.j, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] r(net.bytebuddy.jar.asm.s r11, net.bytebuddy.jar.asm.j r12, int r13, boolean r14) {
        /*
            r10 = this;
            char[] r0 = r12.f418214c
            int r1 = r10.t(r13)
            int[] r2 = new int[r1]
            int r13 = r13 + 2
            r3 = 0
        Lb:
            if (r3 >= r1) goto L86
            r2[r3] = r13
            int r4 = r10.l(r13)
            int r5 = r4 >>> 24
            r6 = 23
            if (r5 == r6) goto L4d
            switch(r5) {
                case 16: goto L4d;
                case 17: goto L4d;
                case 18: goto L4d;
                default: goto L1c;
            }
        L1c:
            switch(r5) {
                case 64: goto L28;
                case 65: goto L28;
                case 66: goto L4d;
                case 67: goto L4d;
                case 68: goto L4d;
                case 69: goto L4d;
                case 70: goto L4d;
                case 71: goto L25;
                case 72: goto L25;
                case 73: goto L25;
                case 74: goto L25;
                case 75: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>()
            throw r11
        L25:
            int r13 = r13 + 4
            goto L4f
        L28:
            int r6 = r13 + 1
            int r6 = r10.t(r6)
            int r13 = r13 + 3
        L30:
            int r7 = r6 + (-1)
            if (r6 <= 0) goto L4f
            int r6 = r10.t(r13)
            int r8 = r13 + 2
            int r8 = r10.t(r8)
            int r13 = r13 + 6
            net.bytebuddy.jar.asm.r[] r9 = r12.f418218g
            c(r6, r9)
            int r6 = r6 + r8
            net.bytebuddy.jar.asm.r[] r8 = r12.f418218g
            c(r6, r8)
            r6 = r7
            goto L30
        L4d:
            int r13 = r13 + 3
        L4f:
            int r6 = r10.g(r13)
            r7 = 1
            r8 = 66
            r9 = 0
            if (r5 != r8) goto L79
            if (r6 != 0) goto L5c
            goto L63
        L5c:
            net.bytebuddy.jar.asm.C r9 = new net.bytebuddy.jar.asm.C
            byte[] r5 = r10.f418168b
            r9.<init>(r5, r13)
        L63:
            r5 = 2
            int r13 = androidx.compose.runtime.C22026a.a(r6, r5, r7, r13)
            java.lang.String r5 = r10.s(r13, r0)
            int r13 = r13 + 2
            r4 = r4 & (-256(0xffffffffffffff00, float:NaN))
            net.bytebuddy.jar.asm.a r4 = r11.F(r4, r9, r5, r14)
            int r13 = r10.k(r4, r13, r7, r0)
            goto L83
        L79:
            r4 = 2
            r5 = 3
            int r13 = androidx.compose.runtime.C22026a.a(r6, r4, r5, r13)
            int r13 = r10.k(r9, r13, r7, r0)
        L83:
            int r3 = r3 + 1
            goto Lb
        L86:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.jar.asm.e.r(net.bytebuddy.jar.asm.s, net.bytebuddy.jar.asm.j, int, boolean):int[]");
    }

    public final String s(int i12, char[] cArr) {
        int iT2 = t(i12);
        if (i12 == 0 || iT2 == 0) {
            return null;
        }
        return u(iT2, cArr);
    }

    public final int t(int i12) {
        byte[] bArr = this.f418168b;
        return (bArr[i12 + 1] & 255) | ((bArr[i12] & 255) << 8);
    }

    public final String u(int i12, char[] cArr) {
        String[] strArr = this.f418170d;
        String str = strArr[i12];
        if (str != null) {
            return str;
        }
        int i13 = this.f418169c[i12];
        String strV = v(cArr, i13 + 2, t(i13));
        strArr[i12] = strV;
        return strV;
    }

    public final String v(char[] cArr, int i12, int i13) {
        int i14;
        int i15 = i13 + i12;
        int i16 = 0;
        while (i12 < i15) {
            int i17 = i12 + 1;
            byte[] bArr = this.f418168b;
            byte b12 = bArr[i12];
            if ((b12 & 128) == 0) {
                cArr[i16] = (char) (b12 & 127);
                i16++;
                i12 = i17;
            } else {
                if ((b12 & 224) == 192) {
                    i14 = i16 + 1;
                    i12 += 2;
                    cArr[i16] = (char) (((b12 & 31) << 6) + (bArr[i17] & 63));
                } else {
                    i14 = i16 + 1;
                    int i18 = i12 + 2;
                    i12 += 3;
                    cArr[i16] = (char) (((b12 & 15) << 12) + ((bArr[i17] & 63) << 6) + (bArr[i18] & 63));
                }
                i16 = i14;
            }
        }
        return new String(cArr, 0, i16);
    }

    public final int w(int i12, Object[] objArr, int i13, char[] cArr, r[] rVarArr) {
        int i14 = i12 + 1;
        switch (this.f418168b[i12] & 255) {
            case 0:
                objArr[i13] = 0;
                return i14;
            case 1:
                objArr[i13] = 1;
                return i14;
            case 2:
                objArr[i13] = 2;
                return i14;
            case 3:
                objArr[i13] = 3;
                return i14;
            case 4:
                objArr[i13] = 4;
                return i14;
            case 5:
                objArr[i13] = 5;
                return i14;
            case 6:
                objArr[i13] = 6;
                return i14;
            case 7:
                objArr[i13] = p(i14, cArr);
                break;
            case 8:
                objArr[i13] = c(t(i14), rVarArr);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return i12 + 3;
    }
}

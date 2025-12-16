package net.bytebuddy.jar.asm;

import net.bytebuddy.jar.asm.A;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: Frame.java */
/* loaded from: classes7.dex */
class o {

    /* renamed from: a, reason: collision with root package name */
    public r f418247a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f418248b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f418249c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f418250d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f418251e;

    /* renamed from: f, reason: collision with root package name */
    public short f418252f;

    /* renamed from: g, reason: collision with root package name */
    public short f418253g;

    /* renamed from: h, reason: collision with root package name */
    public int f418254h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f418255i;

    public o(r rVar) {
        this.f418247a = rVar;
    }

    public static int c(A a12, Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() | 4194304 : obj instanceof String ? d(a12, B.p((String) obj).h(), 0) : a12.n(((r) obj).f418271d, "") | 12582912;
    }

    public static int d(A a12, String str, int i12) {
        char cCharAt = str.charAt(i12);
        int iL2 = 4194306;
        if (cCharAt == 'F') {
            return 4194306;
        }
        if (cCharAt == 'L') {
            return a12.l(androidx.compose.ui.graphics.colorspace.e.h(1, i12 + 1, str)) | 8388608;
        }
        if (cCharAt != 'S') {
            if (cCharAt == 'V') {
                return 0;
            }
            if (cCharAt != 'I') {
                if (cCharAt == 'J') {
                    return 4194308;
                }
                if (cCharAt != 'Z') {
                    if (cCharAt == '[') {
                        int i13 = i12 + 1;
                        while (str.charAt(i13) == '[') {
                            i13++;
                        }
                        char cCharAt2 = str.charAt(i13);
                        if (cCharAt2 != 'F') {
                            if (cCharAt2 == 'L') {
                                iL2 = a12.l(androidx.compose.ui.graphics.colorspace.e.h(1, i13 + 1, str)) | 8388608;
                            } else if (cCharAt2 == 'S') {
                                iL2 = 4194316;
                            } else if (cCharAt2 == 'Z') {
                                iL2 = 4194313;
                            } else if (cCharAt2 == 'I') {
                                iL2 = 4194305;
                            } else if (cCharAt2 != 'J') {
                                switch (cCharAt2) {
                                    case 'B':
                                        iL2 = 4194314;
                                        break;
                                    case 'C':
                                        iL2 = 4194315;
                                        break;
                                    case 'D':
                                        iL2 = 4194307;
                                        break;
                                    default:
                                        throw new IllegalArgumentException();
                                }
                            } else {
                                iL2 = 4194308;
                            }
                        }
                        return ((i13 - i12) << 26) | iL2;
                    }
                    switch (cCharAt) {
                        case 'B':
                        case 'C':
                            break;
                        case 'D':
                            return 4194307;
                        default:
                            throw new IllegalArgumentException();
                    }
                }
            }
        }
        return 4194305;
    }

    public static boolean h(A a12, int i12, int[] iArr, int i13) {
        int iMin;
        int iL2;
        long j12;
        long j13;
        int i14;
        int i15 = i12;
        int i16 = iArr[i13];
        if (i16 == i15) {
            return false;
        }
        if ((67108863 & i15) == 4194309) {
            if (i16 == 4194309) {
                return false;
            }
            i15 = 4194309;
        }
        if (i16 == 0) {
            iArr[i13] = i15;
            return true;
        }
        int i17 = i16 & (-67108864);
        int i18 = 4194304;
        if (i17 != 0 || (i16 & 62914560) == 8388608) {
            if (i15 == 4194309) {
                return false;
            }
            if ((i15 & (-4194304)) != ((-4194304) & i16)) {
                int i19 = i15 & (-67108864);
                if (i19 != 0 || (i15 & 62914560) == 8388608) {
                    if (i19 != 0 && (i15 & 62914560) != 8388608) {
                        i19 -= 67108864;
                    }
                    if (i17 != 0 && (i16 & 62914560) != 8388608) {
                        i17 -= 67108864;
                    }
                    iMin = Math.min(i19, i17) | 8388608;
                    iL2 = a12.l("java/lang/Object");
                    i18 = iMin | iL2;
                }
            } else if ((i16 & 62914560) == 8388608) {
                int i22 = (i15 & (-67108864)) | 8388608;
                int i23 = i15 & 1048575;
                int i24 = 1048575 & i16;
                a12.getClass();
                if (i23 < i24) {
                    j12 = i23;
                    j13 = i24;
                } else {
                    j12 = i24;
                    j13 = i23;
                }
                long j14 = j12 | (j13 << 32);
                int i25 = (i23 + i24 + 130) & Integer.MAX_VALUE;
                A.a aVarO = a12.o(i25);
                while (true) {
                    if (aVarO == null) {
                        A.a[] aVarArr = a12.f418132l;
                        int iL3 = a12.l(a12.f418121a.r(aVarArr[i23].f418368e, aVarArr[i24].f418368e));
                        A.a aVar = new A.a(a12.f418131k, 130, j14, i25);
                        a12.p(aVar);
                        aVar.f418370g = iL3;
                        i14 = iL3;
                        break;
                    }
                    if (aVarO.f418365b == 130 && aVarO.f418133h == i25 && aVarO.f418369f == j14) {
                        i14 = aVarO.f418370g;
                        break;
                    }
                    aVarO = aVarO.f418134i;
                }
                i18 = i22 | i14;
            } else {
                iMin = ((i15 & (-67108864)) - 67108864) | 8388608;
                iL2 = a12.l("java/lang/Object");
                i18 = iMin | iL2;
            }
        } else if (i16 == 4194309) {
            if ((i15 & (-67108864)) == 0 && (i15 & 62914560) != 8388608) {
                i15 = 4194304;
            }
            i18 = i15;
        }
        if (i18 == i16) {
            return false;
        }
        iArr[i13] = i18;
        return true;
    }

    public final void a(t tVar) {
        int[] iArr = this.f418248b;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i13 >= iArr.length) {
                break;
            }
            int i16 = iArr[i13];
            i13 += (i16 == 4194308 || i16 == 4194307) ? 2 : 1;
            if (i16 == 4194304) {
                i15++;
            } else {
                i14 += i15 + 1;
                i15 = 0;
            }
        }
        int[] iArr2 = this.f418249c;
        int i17 = 0;
        int i18 = 0;
        while (i17 < iArr2.length) {
            int i19 = iArr2[i17];
            i17 += (i19 == 4194308 || i19 == 4194307) ? 2 : 1;
            i18++;
        }
        tVar.P(this.f418247a.f418271d, i14, i18);
        int i22 = 3;
        int i23 = 0;
        while (true) {
            int i24 = i14 - 1;
            if (i14 <= 0) {
                break;
            }
            int i25 = iArr[i23];
            i23 += (i25 == 4194308 || i25 == 4194307) ? 2 : 1;
            tVar.f418306W[i22] = i25;
            i14 = i24;
            i22++;
        }
        while (true) {
            int i26 = i18 - 1;
            if (i18 <= 0) {
                tVar.O();
                return;
            }
            int i27 = iArr2[i12];
            i12 += (i27 == 4194308 || i27 == 4194307) ? 2 : 1;
            tVar.f418306W[i22] = i27;
            i22++;
            i18 = i26;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0366  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(int r18, int r19, net.bytebuddy.jar.asm.A.a r20, net.bytebuddy.jar.asm.A r21) {
        /*
            Method dump skipped, instructions count: 1262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.jar.asm.o.b(int, int, net.bytebuddy.jar.asm.A$a, net.bytebuddy.jar.asm.A):void");
    }

    public final int e(int i12, int i13) {
        int i14 = (-67108864) & i12;
        int i15 = 62914560 & i12;
        if (i15 == 16777216) {
            int i16 = i14 + this.f418248b[i12 & 1048575];
            if ((i12 & 1048576) == 0 || !(i16 == 4194308 || i16 == 4194307)) {
                return i16;
            }
            return 4194304;
        }
        if (i15 != 20971520) {
            return i12;
        }
        int i17 = i14 + this.f418249c[i13 - (i12 & 1048575)];
        if ((i12 & 1048576) == 0 || !(i17 == 4194308 || i17 == 4194307)) {
            return i17;
        }
        return 4194304;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[LOOP:0: B:7:0x000d->B:23:0x004f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(net.bytebuddy.jar.asm.A r9, int r10) {
        /*
            r8 = this;
            r0 = 4194310(0x400006, float:5.87748E-39)
            if (r10 == r0) goto Lc
            r1 = -4194304(0xffffffffffc00000, float:NaN)
            r1 = r1 & r10
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 != r2) goto L52
        Lc:
            r1 = 0
        Ld:
            int r2 = r8.f418254h
            if (r1 >= r2) goto L52
            int[] r2 = r8.f418255i
            r2 = r2[r1]
            r3 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r3 = r3 & r2
            r4 = 62914560(0x3c00000, float:1.1284746E-36)
            r4 = r4 & r2
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2 & r5
            r7 = 16777216(0x1000000, float:2.3509887E-38)
            if (r4 != r7) goto L2a
            int[] r2 = r8.f418248b
            r2 = r2[r6]
        L28:
            int r2 = r2 + r3
            goto L35
        L2a:
            r7 = 20971520(0x1400000, float:3.526483E-38)
            if (r4 != r7) goto L35
            int[] r2 = r8.f418249c
            int r4 = r2.length
            int r4 = r4 - r6
            r2 = r2[r4]
            goto L28
        L35:
            if (r10 != r2) goto L4f
            r1 = 8388608(0x800000, float:1.1754944E-38)
            if (r10 != r0) goto L43
            java.lang.String r10 = r9.f418124d
            int r9 = r9.l(r10)
        L41:
            r9 = r9 | r1
            return r9
        L43:
            r10 = r10 & r5
            net.bytebuddy.jar.asm.A$a[] r0 = r9.f418132l
            r10 = r0[r10]
            java.lang.String r10 = r10.f418368e
            int r9 = r9.l(r10)
            goto L41
        L4f:
            int r1 = r1 + 1
            goto Ld
        L52:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.jar.asm.o.f(net.bytebuddy.jar.asm.A, int):int");
    }

    public final int g(int i12) {
        int[] iArr = this.f418250d;
        if (iArr == null || i12 >= iArr.length) {
            return i12 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        int i13 = iArr[i12];
        if (i13 != 0) {
            return i13;
        }
        int i14 = i12 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        iArr[i12] = i14;
        return i14;
    }

    public final boolean i(A a12, o oVar, int i12) {
        boolean zH2;
        int i13;
        int length = this.f418248b.length;
        int length2 = this.f418249c.length;
        boolean zH3 = true;
        if (oVar.f418248b == null) {
            oVar.f418248b = new int[length];
            zH2 = true;
        } else {
            zH2 = false;
        }
        int i14 = 0;
        while (i14 < length) {
            int[] iArr = this.f418250d;
            int iF2 = (iArr == null || i14 >= iArr.length || (i13 = iArr[i14]) == 0) ? this.f418248b[i14] : e(i13, length2);
            if (this.f418255i != null) {
                iF2 = f(a12, iF2);
            }
            zH2 |= h(a12, iF2, oVar.f418248b, i14);
            i14++;
        }
        if (i12 > 0) {
            for (int i15 = 0; i15 < length; i15++) {
                zH2 |= h(a12, this.f418248b[i15], oVar.f418248b, i15);
            }
            if (oVar.f418249c == null) {
                oVar.f418249c = new int[1];
            } else {
                zH3 = zH2;
            }
            return h(a12, i12, oVar.f418249c, 0) | zH3;
        }
        int length3 = this.f418249c.length + this.f418252f;
        if (oVar.f418249c == null) {
            oVar.f418249c = new int[this.f418253g + length3];
        } else {
            zH3 = zH2;
        }
        for (int i16 = 0; i16 < length3; i16++) {
            int iF3 = this.f418249c[i16];
            if (this.f418255i != null) {
                iF3 = f(a12, iF3);
            }
            zH3 |= h(a12, iF3, oVar.f418249c, i16);
        }
        for (int i17 = 0; i17 < this.f418253g; i17++) {
            int iE2 = e(this.f418251e[i17], length2);
            if (this.f418255i != null) {
                iE2 = f(a12, iE2);
            }
            zH3 |= h(a12, iE2, oVar.f418249c, length3 + i17);
        }
        return zH3;
    }

    public final int j() {
        short s5 = this.f418253g;
        if (s5 <= 0) {
            short s12 = (short) (this.f418252f - 1);
            this.f418252f = s12;
            return (-s12) | 20971520;
        }
        int[] iArr = this.f418251e;
        short s13 = (short) (s5 - 1);
        this.f418253g = s13;
        return iArr[s13];
    }

    public final void k(int i12) {
        short s5 = this.f418253g;
        if (s5 >= i12) {
            this.f418253g = (short) (s5 - i12);
        } else {
            this.f418252f = (short) (this.f418252f - (i12 - s5));
            this.f418253g = (short) 0;
        }
    }

    public final void l(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == '(') {
            k((B.e(str) >> 2) - 1);
        } else if (cCharAt == 'J' || cCharAt == 'D') {
            k(2);
        } else {
            k(1);
        }
    }

    public final void m(int i12) {
        if (this.f418251e == null) {
            this.f418251e = new int[10];
        }
        int length = this.f418251e.length;
        short s5 = this.f418253g;
        if (s5 >= length) {
            int[] iArr = new int[Math.max(s5 + 1, length * 2)];
            System.arraycopy(this.f418251e, 0, iArr, 0, length);
            this.f418251e = iArr;
        }
        int[] iArr2 = this.f418251e;
        short s12 = this.f418253g;
        short s13 = (short) (s12 + 1);
        this.f418253g = s13;
        iArr2[s12] = i12;
        short s14 = (short) (this.f418252f + s13);
        r rVar = this.f418247a;
        if (s14 > rVar.f418275h) {
            rVar.f418275h = s14;
        }
    }

    public final void n(A a12, String str) {
        int iD2 = d(a12, str, str.charAt(0) == '(' ? B.r(str) : 0);
        if (iD2 != 0) {
            m(iD2);
            if (iD2 == 4194308 || iD2 == 4194307) {
                m(4194304);
            }
        }
    }

    public final void o(A a12, int i12, String str, int i13) {
        int i14;
        int[] iArr = new int[i13];
        this.f418248b = iArr;
        this.f418249c = new int[0];
        if ((i12 & 8) == 0) {
            i14 = 1;
            if ((i12 & 262144) == 0) {
                iArr[0] = a12.l(a12.f418124d) | 8388608;
            } else {
                iArr[0] = 4194310;
            }
        } else {
            i14 = 0;
        }
        for (B b12 : B.d(str)) {
            int iD2 = d(a12, b12.h(), 0);
            int[] iArr2 = this.f418248b;
            int i15 = i14 + 1;
            iArr2[i14] = iD2;
            if (iD2 == 4194308 || iD2 == 4194307) {
                i14 += 2;
                iArr2[i15] = 4194304;
            } else {
                i14 = i15;
            }
        }
        while (i14 < i13) {
            this.f418248b[i14] = 4194304;
            i14++;
        }
    }

    public final void p(int i12, int i13) {
        if (this.f418250d == null) {
            this.f418250d = new int[10];
        }
        int length = this.f418250d.length;
        if (i12 >= length) {
            int[] iArr = new int[Math.max(i12 + 1, length * 2)];
            System.arraycopy(this.f418250d, 0, iArr, 0, length);
            this.f418250d = iArr;
        }
        this.f418250d[i12] = i13;
    }
}

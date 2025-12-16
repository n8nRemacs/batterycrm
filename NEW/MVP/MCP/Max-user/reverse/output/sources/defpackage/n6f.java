package defpackage;

import java.util.Arrays;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class n6f {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final short[] i;
    public short[] j;
    public int k;
    public short[] l;
    public int m;
    public short[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;

    public n6f(int i, int i2, float f, float f2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / HttpStatus.SC_BAD_REQUEST;
        int i4 = i / 65;
        this.g = i4;
        int i5 = i4 * 2;
        this.h = i5;
        this.i = new short[i5];
        this.j = new short[i5 * i2];
        this.l = new short[i5 * i2];
        this.n = new short[i5 * i2];
    }

    public static void e(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    public final void a(short[] sArr, int i, int i2) {
        short[] sArrC = c(this.l, this.m, i2);
        this.l = sArrC;
        int i3 = this.b;
        System.arraycopy(sArr, i * i3, sArrC, this.m * i3, i3 * i2);
        this.m += i2;
    }

    public final void b(short[] sArr, int i, int i2) {
        int i3 = this.h / i2;
        int i4 = this.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.i[i7] = (short) (i8 / i5);
        }
    }

    public final short[] c(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int d(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i6 * i2) {
                i7 = i2;
                i6 = iAbs;
            }
            if (iAbs * i5 > i8 * i2) {
                i5 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.u = i6 / i7;
        this.v = i8 / i5;
        return i7;
    }

    public final void f() {
        float f;
        float f2;
        float f3;
        double d;
        int iD;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.m;
        float f4 = this.c;
        float f5 = this.d;
        float f6 = f4 / f5;
        float f7 = this.e * f5;
        double d2 = f6;
        int i9 = this.a;
        int i10 = 1;
        int i11 = this.b;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            int i12 = this.k;
            int i13 = this.h;
            if (i12 >= i13) {
                int i14 = 0;
                while (true) {
                    int i15 = this.r;
                    if (i15 > 0) {
                        int iMin = Math.min(i13, i15);
                        a(this.j, i14, iMin);
                        this.r -= iMin;
                        i14 += iMin;
                        f2 = f6;
                        f3 = f7;
                        d = d2;
                        f = 1.0f;
                    } else {
                        short[] sArr = this.j;
                        int i16 = i9 > 4000 ? i9 / q0f.CLOSE_SOCKET_CODE_TIMEOUT : i10;
                        f = 1.0f;
                        int i17 = this.g;
                        int i18 = this.f;
                        if (i11 == i10 && i16 == i10) {
                            iD = d(sArr, i14, i18, i17);
                            f2 = f6;
                            f3 = f7;
                            d = d2;
                        } else {
                            b(sArr, i14, i16);
                            f2 = f6;
                            f3 = f7;
                            short[] sArr2 = this.i;
                            d = d2;
                            int iD2 = d(sArr2, 0, i18 / i16, i17 / i16);
                            if (i16 != 1) {
                                int i19 = iD2 * i16;
                                int i20 = i16 * 4;
                                int i21 = i19 - i20;
                                int i22 = i19 + i20;
                                if (i21 >= i18) {
                                    i18 = i21;
                                }
                                if (i22 <= i17) {
                                    i17 = i22;
                                }
                                if (i11 == 1) {
                                    iD = d(sArr, i14, i18, i17);
                                } else {
                                    b(sArr, i14, 1);
                                    iD = d(sArr2, 0, i18, i17);
                                }
                            } else {
                                iD = iD2;
                            }
                        }
                        int i23 = this.u;
                        int i24 = this.v;
                        if (i23 == 0 || (i = this.s) == 0 || i24 > i23 * 3 || i23 * 2 <= this.t * 3) {
                            i = iD;
                        }
                        this.t = i23;
                        this.s = iD;
                        if (d > 1.0d) {
                            short[] sArr3 = this.j;
                            if (f2 >= 2.0f) {
                                i3 = (int) (i / (f2 - 1.0f));
                            } else {
                                this.r = (int) (((2.0f - f2) * i) / (f2 - 1.0f));
                                i3 = i;
                            }
                            short[] sArrC = c(this.l, this.m, i3);
                            this.l = sArrC;
                            int i25 = i14 + i;
                            int i26 = i14;
                            int i27 = i3;
                            e(i27, this.b, sArrC, this.m, sArr3, i26, sArr3, i25);
                            this.m += i27;
                            i14 = i + i27 + i26;
                        } else {
                            int i28 = i14;
                            short[] sArr4 = this.j;
                            if (f2 < 0.5f) {
                                i2 = (int) ((i * f2) / (1.0f - f2));
                            } else {
                                this.r = (int) ((((2.0f * f2) - 1.0f) * i) / (1.0f - f2));
                                i2 = i;
                            }
                            int i29 = i + i2;
                            short[] sArrC2 = c(this.l, this.m, i29);
                            this.l = sArrC2;
                            System.arraycopy(sArr4, i28 * i11, sArrC2, this.m * i11, i * i11);
                            e(i2, this.b, this.l, this.m + i, sArr4, i28 + i, sArr4, i28);
                            this.m += i29;
                            i14 = i28 + i2;
                        }
                    }
                    if (i14 + i13 > i12) {
                        break;
                    }
                    i10 = 1;
                    f6 = f2;
                    f7 = f3;
                    d2 = d;
                }
                int i30 = this.k - i14;
                short[] sArr5 = this.j;
                System.arraycopy(sArr5, i14 * i11, sArr5, 0, i30 * i11);
                this.k = i30;
            }
            if (f3 != f || this.m == i8) {
            }
            int i31 = (int) (i9 / f3);
            while (true) {
                if (i31 <= 16384 && i9 <= 16384) {
                    break;
                }
                i31 /= 2;
                i9 /= 2;
            }
            int i32 = this.m - i8;
            short[] sArrC3 = c(this.n, this.o, i32);
            this.n = sArrC3;
            System.arraycopy(this.l, i8 * i11, sArrC3, this.o * i11, i32 * i11);
            this.m = i8;
            this.o += i32;
            int i33 = 0;
            while (true) {
                i4 = this.o;
                i5 = i4 - 1;
                if (i33 >= i5) {
                    break;
                }
                while (true) {
                    i6 = this.p + 1;
                    int i34 = i6 * i31;
                    i7 = this.q;
                    if (i34 <= i7 * i9) {
                        break;
                    }
                    this.l = c(this.l, this.m, 1);
                    for (int i35 = 0; i35 < i11; i35++) {
                        short[] sArr6 = this.l;
                        int i36 = (this.m * i11) + i35;
                        short[] sArr7 = this.n;
                        int i37 = (i33 * i11) + i35;
                        short s = sArr7[i37];
                        short s2 = sArr7[i37 + i11];
                        int i38 = this.q * i9;
                        int i39 = this.p;
                        int i40 = i39 * i31;
                        int i41 = (i39 + 1) * i31;
                        int i42 = i41 - i38;
                        int i43 = i41 - i40;
                        sArr6[i36] = (short) ((((i43 - i42) * s2) + (s * i42)) / i43);
                    }
                    this.q++;
                    this.m++;
                }
                this.p = i6;
                if (i6 == i9) {
                    this.p = 0;
                    fsi.d(i7 == i31);
                    this.q = 0;
                }
                i33++;
            }
            if (i5 == 0) {
                return;
            }
            short[] sArr8 = this.n;
            System.arraycopy(sArr8, i5 * i11, sArr8, 0, (i4 - i5) * i11);
            this.o -= i5;
            return;
        }
        a(this.j, 0, this.k);
        this.k = 0;
        f3 = f7;
        f = 1.0f;
        if (f3 != f) {
        }
    }
}

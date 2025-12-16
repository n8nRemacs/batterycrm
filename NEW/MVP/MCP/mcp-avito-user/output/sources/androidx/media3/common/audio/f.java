package androidx.media3.common.audio;

import androidx.compose.runtime.C22026a;
import androidx.media3.common.util.C23110a;
import com.adjust.sdk.Constants;
import java.util.Arrays;

/* compiled from: Sonic.java */
/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f47577a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47578b;

    /* renamed from: c, reason: collision with root package name */
    public final float f47579c;

    /* renamed from: d, reason: collision with root package name */
    public final float f47580d;

    /* renamed from: e, reason: collision with root package name */
    public final float f47581e;

    /* renamed from: f, reason: collision with root package name */
    public final int f47582f;

    /* renamed from: g, reason: collision with root package name */
    public final int f47583g;

    /* renamed from: h, reason: collision with root package name */
    public final int f47584h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f47585i;

    /* renamed from: j, reason: collision with root package name */
    public short[] f47586j;

    /* renamed from: k, reason: collision with root package name */
    public int f47587k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f47588l;

    /* renamed from: m, reason: collision with root package name */
    public int f47589m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f47590n;

    /* renamed from: o, reason: collision with root package name */
    public int f47591o;

    /* renamed from: p, reason: collision with root package name */
    public int f47592p;

    /* renamed from: q, reason: collision with root package name */
    public int f47593q;

    /* renamed from: r, reason: collision with root package name */
    public int f47594r;

    /* renamed from: s, reason: collision with root package name */
    public int f47595s;

    /* renamed from: t, reason: collision with root package name */
    public int f47596t;

    /* renamed from: u, reason: collision with root package name */
    public int f47597u;

    /* renamed from: v, reason: collision with root package name */
    public int f47598v;

    public f(int i12, int i13, float f12, float f13, int i14) {
        this.f47577a = i12;
        this.f47578b = i13;
        this.f47579c = f12;
        this.f47580d = f13;
        this.f47581e = i12 / i14;
        this.f47582f = i12 / Constants.MINIMAL_ERROR_STATUS_CODE;
        int i15 = i12 / 65;
        this.f47583g = i15;
        int i16 = i15 * 2;
        this.f47584h = i16;
        this.f47585i = new short[i16];
        this.f47586j = new short[i16 * i13];
        this.f47588l = new short[i16 * i13];
        this.f47590n = new short[i16 * i13];
    }

    public static void e(int i12, int i13, short[] sArr, int i14, short[] sArr2, int i15, short[] sArr3, int i16) {
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = (i14 * i13) + i17;
            int i19 = (i16 * i13) + i17;
            int i22 = (i15 * i13) + i17;
            for (int i23 = 0; i23 < i12; i23++) {
                sArr[i18] = (short) (((sArr3[i19] * i23) + ((i12 - i23) * sArr2[i22])) / i12);
                i18 += i13;
                i22 += i13;
                i19 += i13;
            }
        }
    }

    public final void a(short[] sArr, int i12, int i13) {
        short[] sArrC = c(this.f47588l, this.f47589m, i13);
        this.f47588l = sArrC;
        int i14 = this.f47578b;
        System.arraycopy(sArr, i12 * i14, sArrC, this.f47589m * i14, i14 * i13);
        this.f47589m += i13;
    }

    public final void b(short[] sArr, int i12, int i13) {
        int i14 = this.f47584h / i13;
        int i15 = this.f47578b;
        int i16 = i13 * i15;
        int i17 = i12 * i15;
        for (int i18 = 0; i18 < i14; i18++) {
            int i19 = 0;
            for (int i22 = 0; i22 < i16; i22++) {
                i19 += sArr[C22026a.a(i18, i16, i17, i22)];
            }
            this.f47585i[i18] = (short) (i19 / i16);
        }
    }

    public final short[] c(short[] sArr, int i12, int i13) {
        int length = sArr.length;
        int i14 = this.f47578b;
        int i15 = length / i14;
        return i12 + i13 <= i15 ? sArr : Arrays.copyOf(sArr, (((i15 * 3) / 2) + i13) * i14);
    }

    public final int d(short[] sArr, int i12, int i13, int i14) {
        int i15 = i12 * this.f47578b;
        int i16 = 255;
        int i17 = 1;
        int i18 = 0;
        int i19 = 0;
        while (i13 <= i14) {
            int iAbs = 0;
            for (int i22 = 0; i22 < i13; i22++) {
                iAbs += Math.abs(sArr[i15 + i22] - sArr[(i15 + i13) + i22]);
            }
            if (iAbs * i18 < i17 * i13) {
                i18 = i13;
                i17 = iAbs;
            }
            if (iAbs * i16 > i19 * i13) {
                i16 = i13;
                i19 = iAbs;
            }
            i13++;
        }
        this.f47597u = i17 / i18;
        this.f47598v = i19 / i16;
        return i18;
    }

    public final void f() {
        int i12;
        int i13;
        float f12;
        int iD2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i22;
        int i23;
        int i24 = this.f47589m;
        float f13 = this.f47579c;
        float f14 = this.f47580d;
        float f15 = f13 / f14;
        float f16 = this.f47581e * f14;
        double d12 = f15;
        int i25 = this.f47577a;
        int i26 = this.f47578b;
        int i27 = 1;
        if (d12 > 1.00001d || d12 < 0.99999d) {
            int i28 = this.f47587k;
            int i29 = this.f47584h;
            if (i28 >= i29) {
                int i32 = 0;
                while (true) {
                    int i33 = this.f47594r;
                    if (i33 > 0) {
                        int iMin = Math.min(i29, i33);
                        a(this.f47586j, i32, iMin);
                        this.f47594r -= iMin;
                        i32 += iMin;
                        i13 = i24;
                        f12 = f16;
                        i12 = i25;
                    } else {
                        short[] sArr = this.f47586j;
                        int i34 = i25 > 4000 ? i25 / 4000 : i27;
                        int i35 = this.f47583g;
                        int i36 = this.f47582f;
                        if (i26 == i27 && i34 == i27) {
                            iD2 = d(sArr, i32, i36, i35);
                            i13 = i24;
                            f12 = f16;
                            i12 = i25;
                        } else {
                            b(sArr, i32, i34);
                            i12 = i25;
                            i13 = i24;
                            short[] sArr2 = this.f47585i;
                            f12 = f16;
                            int iD3 = d(sArr2, 0, i36 / i34, i35 / i34);
                            if (i34 != 1) {
                                int i37 = iD3 * i34;
                                int i38 = i34 * 4;
                                int i39 = i37 - i38;
                                int i42 = i37 + i38;
                                if (i39 >= i36) {
                                    i36 = i39;
                                }
                                if (i42 <= i35) {
                                    i35 = i42;
                                }
                                if (i26 == 1) {
                                    iD2 = d(sArr, i32, i36, i35);
                                } else {
                                    b(sArr, i32, 1);
                                    iD2 = d(sArr2, 0, i36, i35);
                                }
                            } else {
                                iD2 = iD3;
                            }
                        }
                        int i43 = this.f47597u;
                        int i44 = this.f47598v;
                        if (i43 == 0 || (i14 = this.f47595s) == 0 || i44 > i43 * 3 || i43 * 2 <= this.f47596t * 3) {
                            i14 = iD2;
                        }
                        this.f47596t = i43;
                        this.f47595s = iD2;
                        if (d12 > 1.0d) {
                            short[] sArr3 = this.f47586j;
                            if (f15 >= 2.0f) {
                                i16 = (int) (i14 / (f15 - 1.0f));
                            } else {
                                this.f47594r = (int) (((2.0f - f15) * i14) / (f15 - 1.0f));
                                i16 = i14;
                            }
                            short[] sArrC = c(this.f47588l, this.f47589m, i16);
                            this.f47588l = sArrC;
                            int i45 = i32;
                            e(i16, this.f47578b, sArrC, this.f47589m, sArr3, i45, sArr3, i32 + i14);
                            this.f47589m += i16;
                            i32 = i14 + i16 + i45;
                        } else {
                            int i46 = i32;
                            short[] sArr4 = this.f47586j;
                            if (f15 < 0.5f) {
                                i15 = (int) ((i14 * f15) / (1.0f - f15));
                            } else {
                                this.f47594r = (int) ((((2.0f * f15) - 1.0f) * i14) / (1.0f - f15));
                                i15 = i14;
                            }
                            int i47 = i14 + i15;
                            short[] sArrC2 = c(this.f47588l, this.f47589m, i47);
                            this.f47588l = sArrC2;
                            System.arraycopy(sArr4, i46 * i26, sArrC2, this.f47589m * i26, i14 * i26);
                            e(i15, this.f47578b, this.f47588l, this.f47589m + i14, sArr4, i46 + i14, sArr4, i46);
                            this.f47589m += i47;
                            i32 = i46 + i15;
                        }
                    }
                    if (i32 + i29 > i28) {
                        break;
                    }
                    i25 = i12;
                    i24 = i13;
                    f16 = f12;
                    i27 = 1;
                }
                int i48 = this.f47587k - i32;
                short[] sArr5 = this.f47586j;
                System.arraycopy(sArr5, i32 * i26, sArr5, 0, i48 * i26);
                this.f47587k = i48;
            }
            if (f12 != 1.0f || this.f47589m == (i17 = i13)) {
            }
            int i49 = i12;
            int i52 = (int) (i49 / f12);
            int i53 = i49;
            while (true) {
                if (i52 <= 16384 && i53 <= 16384) {
                    break;
                }
                i52 /= 2;
                i53 /= 2;
            }
            int i54 = this.f47589m - i17;
            short[] sArrC3 = c(this.f47590n, this.f47591o, i54);
            this.f47590n = sArrC3;
            System.arraycopy(this.f47588l, i17 * i26, sArrC3, this.f47591o * i26, i54 * i26);
            this.f47589m = i17;
            this.f47591o += i54;
            int i55 = 0;
            while (true) {
                i18 = this.f47591o;
                i19 = i18 - 1;
                if (i55 >= i19) {
                    break;
                }
                while (true) {
                    i22 = this.f47592p + 1;
                    int i56 = i22 * i52;
                    i23 = this.f47593q;
                    if (i56 <= i23 * i53) {
                        break;
                    }
                    this.f47588l = c(this.f47588l, this.f47589m, 1);
                    for (int i57 = 0; i57 < i26; i57++) {
                        short[] sArr6 = this.f47588l;
                        int i58 = (this.f47589m * i26) + i57;
                        short[] sArr7 = this.f47590n;
                        int i59 = (i55 * i26) + i57;
                        short s5 = sArr7[i59];
                        short s12 = sArr7[i59 + i26];
                        int i62 = this.f47593q * i53;
                        int i63 = this.f47592p;
                        int i64 = i63 * i52;
                        int i65 = (i63 + 1) * i52;
                        int i66 = i65 - i62;
                        int i67 = i65 - i64;
                        sArr6[i58] = (short) ((((i67 - i66) * s12) + (s5 * i66)) / i67);
                    }
                    this.f47593q++;
                    this.f47589m++;
                }
                this.f47592p = i22;
                if (i22 == i53) {
                    this.f47592p = 0;
                    C23110a.g(i23 == i52);
                    this.f47593q = 0;
                }
                i55++;
            }
            if (i19 == 0) {
                return;
            }
            short[] sArr8 = this.f47590n;
            System.arraycopy(sArr8, i19 * i26, sArr8, 0, (i18 - i19) * i26);
            this.f47591o -= i19;
            return;
        }
        a(this.f47586j, 0, this.f47587k);
        this.f47587k = 0;
        i13 = i24;
        f12 = f16;
        i12 = i25;
        if (f12 != 1.0f) {
        }
    }
}

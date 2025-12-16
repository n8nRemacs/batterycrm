package com.yandex.mobile.ads.impl;

import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes8.dex */
final class e61 {

    /* renamed from: a, reason: collision with root package name */
    private final int f384772a;

    /* renamed from: b, reason: collision with root package name */
    private final int f384773b;

    /* renamed from: c, reason: collision with root package name */
    private final float f384774c;

    /* renamed from: d, reason: collision with root package name */
    private final float f384775d;

    /* renamed from: e, reason: collision with root package name */
    private final float f384776e;

    /* renamed from: f, reason: collision with root package name */
    private final int f384777f;

    /* renamed from: g, reason: collision with root package name */
    private final int f384778g;

    /* renamed from: h, reason: collision with root package name */
    private final int f384779h;

    /* renamed from: i, reason: collision with root package name */
    private final short[] f384780i;

    /* renamed from: j, reason: collision with root package name */
    private short[] f384781j;

    /* renamed from: k, reason: collision with root package name */
    private int f384782k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f384783l;

    /* renamed from: m, reason: collision with root package name */
    private int f384784m;

    /* renamed from: n, reason: collision with root package name */
    private short[] f384785n;

    /* renamed from: o, reason: collision with root package name */
    private int f384786o;

    /* renamed from: p, reason: collision with root package name */
    private int f384787p;

    /* renamed from: q, reason: collision with root package name */
    private int f384788q;

    /* renamed from: r, reason: collision with root package name */
    private int f384789r;

    /* renamed from: s, reason: collision with root package name */
    private int f384790s;

    /* renamed from: t, reason: collision with root package name */
    private int f384791t;

    /* renamed from: u, reason: collision with root package name */
    private int f384792u;

    /* renamed from: v, reason: collision with root package name */
    private int f384793v;

    public e61(int i12, int i13, float f12, float f13, int i14) {
        this.f384772a = i12;
        this.f384773b = i13;
        this.f384774c = f12;
        this.f384775d = f13;
        this.f384776e = i12 / i14;
        this.f384777f = i12 / Constants.MINIMAL_ERROR_STATUS_CODE;
        int i15 = i12 / 65;
        this.f384778g = i15;
        int i16 = i15 * 2;
        this.f384779h = i16;
        this.f384780i = new short[i16];
        int i17 = i16 * i13;
        this.f384781j = new short[i17];
        this.f384783l = new short[i17];
        this.f384785n = new short[i17];
    }

    private void d() {
        int iA2;
        int i12;
        double d12;
        int i13;
        float f12;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = this.f384784m;
        float f13 = this.f384774c;
        float f14 = this.f384775d;
        float f15 = f13 / f14;
        float f16 = this.f384776e * f14;
        double d13 = f15;
        int i22 = 1;
        int i23 = 0;
        if (d13 > 1.00001d || d13 < 0.99999d) {
            int i24 = this.f384782k;
            if (i24 >= this.f384779h) {
                int i25 = 0;
                while (true) {
                    int i26 = this.f384789r;
                    if (i26 > 0) {
                        int iMin = Math.min(this.f384779h, i26);
                        short[] sArr = this.f384781j;
                        short[] sArrA = a(this.f384783l, this.f384784m, iMin);
                        this.f384783l = sArrA;
                        int i27 = this.f384773b;
                        System.arraycopy(sArr, i25 * i27, sArrA, this.f384784m * i27, i27 * iMin);
                        this.f384784m += iMin;
                        this.f384789r -= iMin;
                        i25 += iMin;
                        f12 = f15;
                        d12 = d13;
                    } else {
                        short[] sArr2 = this.f384781j;
                        int i28 = this.f384772a;
                        int i29 = i28 > 4000 ? i28 / 4000 : i22;
                        int i32 = this.f384773b;
                        if (i32 == i22 && i29 == i22) {
                            iA2 = a(sArr2, i25, this.f384777f, this.f384778g);
                        } else {
                            int i33 = this.f384779h / i29;
                            int i34 = i32 * i29;
                            int i35 = i32 * i25;
                            int i36 = i23;
                            while (i36 < i33) {
                                int i37 = i23;
                                int i38 = i37;
                                while (i37 < i34) {
                                    i38 += sArr2[C22026a.a(i36, i34, i35, i37)];
                                    i37++;
                                }
                                this.f384780i[i36] = (short) (i38 / i34);
                                i36++;
                                i23 = 0;
                            }
                            int iA3 = a(this.f384780i, 0, this.f384777f / i29, this.f384778g / i29);
                            if (i29 != 1) {
                                int i39 = iA3 * i29;
                                int i42 = i29 * 4;
                                int i43 = i39 - i42;
                                int i44 = i39 + i42;
                                int i45 = this.f384777f;
                                if (i43 < i45) {
                                    i43 = i45;
                                }
                                int i46 = this.f384778g;
                                if (i44 > i46) {
                                    i44 = i46;
                                }
                                int i47 = this.f384773b;
                                if (i47 == 1) {
                                    iA2 = a(sArr2, i25, i43, i44);
                                } else {
                                    int i48 = this.f384779h;
                                    int i49 = i25 * i47;
                                    int i52 = 0;
                                    while (i52 < i48) {
                                        int i53 = 0;
                                        for (int i54 = 0; i54 < i47; i54++) {
                                            i53 += sArr2[C22026a.a(i52, i47, i49, i54)];
                                        }
                                        this.f384780i[i52] = (short) (i53 / i47);
                                        i52++;
                                        sArr2 = sArr2;
                                    }
                                    iA2 = a(this.f384780i, 0, i43, i44);
                                }
                            } else {
                                iA2 = iA3;
                            }
                        }
                        int i55 = this.f384792u;
                        int i56 = this.f384793v;
                        if (i55 == 0 || (i12 = this.f384790s) == 0 || i56 > i55 * 3 || i55 * 2 <= this.f384791t * 3) {
                            i12 = iA2;
                        }
                        this.f384791t = i55;
                        this.f384790s = iA2;
                        if (d13 > 1.0d) {
                            short[] sArr3 = this.f384781j;
                            if (f15 >= 2.0f) {
                                i14 = (int) (i12 / (f15 - 1.0f));
                            } else {
                                this.f384789r = (int) (((2.0f - f15) * i12) / (f15 - 1.0f));
                                i14 = i12;
                            }
                            short[] sArrA2 = a(this.f384783l, this.f384784m, i14);
                            this.f384783l = sArrA2;
                            int i57 = this.f384773b;
                            int i58 = this.f384784m;
                            int i59 = i25 + i12;
                            int i62 = 0;
                            while (i62 < i57) {
                                int i63 = (i58 * i57) + i62;
                                int i64 = (i59 * i57) + i62;
                                int i65 = (i25 * i57) + i62;
                                double d14 = d13;
                                for (int i66 = 0; i66 < i14; i66++) {
                                    sArrA2[i63] = (short) (((sArr3[i64] * i66) + ((i14 - i66) * sArr3[i65])) / i14);
                                    i63 += i57;
                                    i65 += i57;
                                    i64 += i57;
                                }
                                i62++;
                                d13 = d14;
                            }
                            d12 = d13;
                            this.f384784m += i14;
                            f12 = f15;
                            i25 = i12 + i14 + i25;
                        } else {
                            d12 = d13;
                            short[] sArr4 = this.f384781j;
                            if (f15 < 0.5f) {
                                i13 = (int) ((i12 * f15) / (1.0f - f15));
                            } else {
                                this.f384789r = (int) ((((2.0f * f15) - 1.0f) * i12) / (1.0f - f15));
                                i13 = i12;
                            }
                            int i67 = i12 + i13;
                            short[] sArrA3 = a(this.f384783l, this.f384784m, i67);
                            this.f384783l = sArrA3;
                            int i68 = this.f384773b;
                            System.arraycopy(sArr4, i25 * i68, sArrA3, this.f384784m * i68, i68 * i12);
                            int i69 = this.f384773b;
                            short[] sArr5 = this.f384783l;
                            int i72 = this.f384784m + i12;
                            int i73 = i12 + i25;
                            int i74 = 0;
                            while (i74 < i69) {
                                int i75 = (i72 * i69) + i74;
                                int i76 = (i25 * i69) + i74;
                                int i77 = (i73 * i69) + i74;
                                float f17 = f15;
                                int i78 = 0;
                                while (i78 < i13) {
                                    sArr5[i75] = (short) (((sArr4[i76] * i78) + ((i13 - i78) * sArr4[i77])) / i13);
                                    i75 += i69;
                                    i77 += i69;
                                    i76 += i69;
                                    i78++;
                                    sArr4 = sArr4;
                                }
                                i74++;
                                f15 = f17;
                            }
                            f12 = f15;
                            this.f384784m += i67;
                            i25 += i13;
                        }
                    }
                    if (this.f384779h + i25 > i24) {
                        break;
                    }
                    f15 = f12;
                    d13 = d12;
                    i22 = 1;
                    i23 = 0;
                }
                int i79 = this.f384782k - i25;
                short[] sArr6 = this.f384781j;
                int i82 = this.f384773b;
                System.arraycopy(sArr6, i25 * i82, sArr6, 0, i82 * i79);
                this.f384782k = i79;
            }
        } else {
            short[] sArr7 = this.f384781j;
            int i83 = this.f384782k;
            short[] sArrA4 = a(this.f384783l, i19, i83);
            this.f384783l = sArrA4;
            int i84 = this.f384773b;
            System.arraycopy(sArr7, 0, sArrA4, this.f384784m * i84, i84 * i83);
            this.f384784m += i83;
            this.f384782k = 0;
        }
        if (f16 == 1.0f || this.f384784m == i19) {
            return;
        }
        int i85 = this.f384772a;
        int i86 = (int) (i85 / f16);
        while (true) {
            if (i86 <= 16384 && i85 <= 16384) {
                break;
            }
            i86 /= 2;
            i85 /= 2;
        }
        int i87 = this.f384784m - i19;
        short[] sArrA5 = a(this.f384785n, this.f384786o, i87);
        this.f384785n = sArrA5;
        short[] sArr8 = this.f384783l;
        int i88 = this.f384773b;
        System.arraycopy(sArr8, i19 * i88, sArrA5, this.f384786o * i88, i88 * i87);
        this.f384784m = i19;
        this.f384786o += i87;
        int i89 = 0;
        while (true) {
            i15 = this.f384786o;
            i16 = i15 - 1;
            if (i89 >= i16) {
                break;
            }
            while (true) {
                i17 = this.f384787p + 1;
                int i92 = i17 * i86;
                i18 = this.f384788q;
                if (i92 <= i18 * i85) {
                    break;
                }
                this.f384783l = a(this.f384783l, this.f384784m, 1);
                int i93 = 0;
                while (true) {
                    int i94 = this.f384773b;
                    if (i93 < i94) {
                        short[] sArr9 = this.f384783l;
                        int i95 = (this.f384784m * i94) + i93;
                        short[] sArr10 = this.f384785n;
                        int i96 = (i89 * i94) + i93;
                        short s5 = sArr10[i96];
                        short s12 = sArr10[i96 + i94];
                        int i97 = this.f384788q * i85;
                        int i98 = this.f384787p;
                        int i99 = i98 * i86;
                        int i100 = (i98 + 1) * i86;
                        int i101 = i100 - i97;
                        int i102 = i100 - i99;
                        sArr9[i95] = (short) ((((i102 - i101) * s12) + (s5 * i101)) / i102);
                        i93++;
                    }
                }
                this.f384788q++;
                this.f384784m++;
            }
            this.f384787p = i17;
            if (i17 == i85) {
                this.f384787p = 0;
                db.b(i18 == i86);
                this.f384788q = 0;
            }
            i89++;
        }
        if (i16 == 0) {
            return;
        }
        short[] sArr11 = this.f384785n;
        int i103 = this.f384773b;
        System.arraycopy(sArr11, i16 * i103, sArr11, 0, (i15 - i16) * i103);
        this.f384786o -= i16;
    }

    public final void a(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f384773b, this.f384784m);
        shortBuffer.put(this.f384783l, 0, this.f384773b * iMin);
        int i12 = this.f384784m - iMin;
        this.f384784m = i12;
        short[] sArr = this.f384783l;
        int i13 = this.f384773b;
        System.arraycopy(sArr, iMin * i13, sArr, 0, i12 * i13);
    }

    public final void b(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i12 = this.f384773b;
        int i13 = iRemaining / i12;
        short[] sArrA = a(this.f384781j, this.f384782k, i13);
        this.f384781j = sArrA;
        shortBuffer.get(sArrA, this.f384782k * this.f384773b, ((i12 * i13) * 2) / 2);
        this.f384782k += i13;
        d();
    }

    public final int c() {
        return this.f384782k * this.f384773b * 2;
    }

    public final void e() {
        int i12;
        int i13 = this.f384782k;
        float f12 = this.f384774c;
        float f13 = this.f384775d;
        int i14 = this.f384784m + ((int) ((((i13 / (f12 / f13)) + this.f384786o) / (this.f384776e * f13)) + 0.5f));
        this.f384781j = a(this.f384781j, i13, (this.f384779h * 2) + i13);
        int i15 = 0;
        while (true) {
            i12 = this.f384779h * 2;
            int i16 = this.f384773b;
            if (i15 >= i12 * i16) {
                break;
            }
            this.f384781j[(i16 * i13) + i15] = 0;
            i15++;
        }
        this.f384782k = i12 + this.f384782k;
        d();
        if (this.f384784m > i14) {
            this.f384784m = i14;
        }
        this.f384782k = 0;
        this.f384789r = 0;
        this.f384786o = 0;
    }

    public final void a() {
        this.f384782k = 0;
        this.f384784m = 0;
        this.f384786o = 0;
        this.f384787p = 0;
        this.f384788q = 0;
        this.f384789r = 0;
        this.f384790s = 0;
        this.f384791t = 0;
        this.f384792u = 0;
        this.f384793v = 0;
    }

    public final int b() {
        return this.f384784m * this.f384773b * 2;
    }

    private short[] a(short[] sArr, int i12, int i13) {
        int length = sArr.length;
        int i14 = this.f384773b;
        int i15 = length / i14;
        return i12 + i13 <= i15 ? sArr : Arrays.copyOf(sArr, (((i15 * 3) / 2) + i13) * i14);
    }

    private int a(short[] sArr, int i12, int i13, int i14) {
        int i15 = i12 * this.f384773b;
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
        this.f384792u = i17 / i18;
        this.f384793v = i19 / i16;
        return i18;
    }
}

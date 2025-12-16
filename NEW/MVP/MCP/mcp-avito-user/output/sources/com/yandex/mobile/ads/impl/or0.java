package com.yandex.mobile.ads.impl;

import java.nio.charset.Charset;

/* loaded from: classes8.dex */
public final class or0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f388623a;

    /* renamed from: b, reason: collision with root package name */
    private int f388624b;

    /* renamed from: c, reason: collision with root package name */
    private int f388625c;

    /* renamed from: d, reason: collision with root package name */
    private int f388626d;

    public or0() {
        this.f388623a = pc1.f388773f;
    }

    public final void a(int i12, byte[] bArr) {
        this.f388623a = bArr;
        this.f388624b = 0;
        this.f388625c = 0;
        this.f388626d = i12;
    }

    public final int b() {
        return ((this.f388626d - this.f388624b) * 8) - this.f388625c;
    }

    public final void c(int i12) {
        int i13 = i12 / 8;
        this.f388624b = i13;
        this.f388625c = i12 - (i13 * 8);
        a();
    }

    public final int d() {
        db.b(this.f388625c == 0);
        return this.f388624b;
    }

    public final int e() {
        return (this.f388624b * 8) + this.f388625c;
    }

    public final boolean f() {
        boolean z12 = (this.f388623a[this.f388624b] & (128 >> this.f388625c)) != 0;
        h();
        return z12;
    }

    public final long g() {
        int iB2 = b(4);
        int iB3 = b(32);
        int i12 = pc1.f388768a;
        return ((iB2 & 4294967295L) << 32) | (iB3 & 4294967295L);
    }

    public final void h() {
        int i12 = this.f388625c + 1;
        this.f388625c = i12;
        if (i12 == 8) {
            this.f388625c = 0;
            this.f388624b++;
        }
        a();
    }

    public final int b(int i12) {
        int i13;
        if (i12 == 0) {
            return 0;
        }
        this.f388625c += i12;
        int i14 = 0;
        while (true) {
            i13 = this.f388625c;
            if (i13 <= 8) {
                break;
            }
            int i15 = i13 - 8;
            this.f388625c = i15;
            byte[] bArr = this.f388623a;
            int i16 = this.f388624b;
            this.f388624b = i16 + 1;
            i14 |= (bArr[i16] & 255) << i15;
        }
        byte[] bArr2 = this.f388623a;
        int i17 = this.f388624b;
        int i18 = ((-1) >>> (32 - i12)) & (i14 | ((bArr2[i17] & 255) >> (8 - i13)));
        if (i13 == 8) {
            this.f388625c = 0;
            this.f388624b = i17 + 1;
        }
        a();
        return i18;
    }

    public final void e(int i12) {
        db.b(this.f388625c == 0);
        this.f388624b += i12;
        a();
    }

    public or0(byte[] bArr) {
        this(bArr.length, bArr);
    }

    public final void d(int i12) {
        int i13 = i12 / 8;
        int i14 = this.f388624b + i13;
        this.f388624b = i14;
        int i15 = (i12 - (i13 * 8)) + this.f388625c;
        this.f388625c = i15;
        if (i15 > 7) {
            this.f388624b = i14 + 1;
            this.f388625c = i15 - 8;
        }
        a();
    }

    public or0(int i12, byte[] bArr) {
        this.f388623a = bArr;
        this.f388626d = i12;
    }

    public final void c() {
        if (this.f388625c == 0) {
            return;
        }
        this.f388625c = 0;
        this.f388624b++;
        a();
    }

    public final void a(byte[] bArr, int i12) {
        int i13 = i12 >> 3;
        for (int i14 = 0; i14 < i13; i14++) {
            byte[] bArr2 = this.f388623a;
            int i15 = this.f388624b;
            int i16 = i15 + 1;
            this.f388624b = i16;
            byte b12 = bArr2[i15];
            int i17 = this.f388625c;
            byte b13 = (byte) (b12 << i17);
            bArr[i14] = b13;
            bArr[i14] = (byte) (((255 & bArr2[i16]) >> (8 - i17)) | b13);
        }
        int i18 = i12 & 7;
        if (i18 == 0) {
            return;
        }
        byte b14 = (byte) (bArr[i13] & (255 >> i18));
        bArr[i13] = b14;
        int i19 = this.f388625c;
        if (i19 + i18 > 8) {
            byte[] bArr3 = this.f388623a;
            int i22 = this.f388624b;
            this.f388624b = i22 + 1;
            bArr[i13] = (byte) (b14 | ((bArr3[i22] & 255) << i19));
            this.f388625c = i19 - 8;
        }
        int i23 = this.f388625c + i18;
        this.f388625c = i23;
        byte[] bArr4 = this.f388623a;
        int i24 = this.f388624b;
        bArr[i13] = (byte) (((byte) (((255 & bArr4[i24]) >> (8 - i23)) << (8 - i18))) | bArr[i13]);
        if (i23 == 8) {
            this.f388625c = 0;
            this.f388624b = i24 + 1;
        }
        a();
    }

    public final void b(byte[] bArr, int i12) {
        db.b(this.f388625c == 0);
        System.arraycopy(this.f388623a, this.f388624b, bArr, 0, i12);
        this.f388624b += i12;
        a();
    }

    public final String a(int i12, Charset charset) {
        byte[] bArr = new byte[i12];
        b(bArr, i12);
        return new String(bArr, charset);
    }

    public final void a(int i12) {
        int i13 = i12 & 16383;
        int iMin = Math.min(8 - this.f388625c, 14);
        int i14 = this.f388625c;
        int i15 = (8 - i14) - iMin;
        byte[] bArr = this.f388623a;
        int i16 = this.f388624b;
        byte b12 = (byte) (((65280 >> i14) | ((1 << i15) - 1)) & bArr[i16]);
        bArr[i16] = b12;
        int i17 = 14 - iMin;
        bArr[i16] = (byte) (b12 | ((i13 >>> i17) << i15));
        int i18 = i16 + 1;
        while (i17 > 8) {
            this.f388623a[i18] = (byte) (i13 >>> (i17 - 8));
            i17 -= 8;
            i18++;
        }
        int i19 = 8 - i17;
        byte[] bArr2 = this.f388623a;
        byte b13 = (byte) (bArr2[i18] & ((1 << i19) - 1));
        bArr2[i18] = b13;
        bArr2[i18] = (byte) (((i13 & ((1 << i17) - 1)) << i19) | b13);
        d(14);
        a();
    }

    private void a() {
        int i12;
        int i13 = this.f388624b;
        db.b(i13 >= 0 && (i13 < (i12 = this.f388626d) || (i13 == i12 && this.f388625c == 0)));
    }
}

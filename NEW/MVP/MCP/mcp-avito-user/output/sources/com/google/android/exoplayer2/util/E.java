package com.google.android.exoplayer2.util;

/* compiled from: ParsableBitArray.java */
/* loaded from: classes6.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f348059a;

    /* renamed from: b, reason: collision with root package name */
    public int f348060b;

    /* renamed from: c, reason: collision with root package name */
    public int f348061c;

    /* renamed from: d, reason: collision with root package name */
    public int f348062d;

    public E() {
        this.f348059a = U.f348110e;
    }

    public final void a() {
        int i12;
        int i13 = this.f348060b;
        C36585a.d(i13 >= 0 && (i13 < (i12 = this.f348062d) || (i13 == i12 && this.f348061c == 0)));
    }

    public final int b() {
        return ((this.f348062d - this.f348060b) * 8) - this.f348061c;
    }

    public final void c() {
        if (this.f348061c == 0) {
            return;
        }
        this.f348061c = 0;
        this.f348060b++;
        a();
    }

    public final int d() {
        C36585a.d(this.f348061c == 0);
        return this.f348060b;
    }

    public final int e() {
        return (this.f348060b * 8) + this.f348061c;
    }

    public final boolean f() {
        boolean z12 = (this.f348059a[this.f348060b] & (128 >> this.f348061c)) != 0;
        l();
        return z12;
    }

    public final int g(int i12) {
        int i13;
        if (i12 == 0) {
            return 0;
        }
        this.f348061c += i12;
        int i14 = 0;
        while (true) {
            i13 = this.f348061c;
            if (i13 <= 8) {
                break;
            }
            int i15 = i13 - 8;
            this.f348061c = i15;
            byte[] bArr = this.f348059a;
            int i16 = this.f348060b;
            this.f348060b = i16 + 1;
            i14 |= (bArr[i16] & 255) << i15;
        }
        byte[] bArr2 = this.f348059a;
        int i17 = this.f348060b;
        int i18 = ((-1) >>> (32 - i12)) & (i14 | ((bArr2[i17] & 255) >> (8 - i13)));
        if (i13 == 8) {
            this.f348061c = 0;
            this.f348060b = i17 + 1;
        }
        a();
        return i18;
    }

    public final void h(int i12, byte[] bArr) {
        int i13 = i12 >> 3;
        for (int i14 = 0; i14 < i13; i14++) {
            byte[] bArr2 = this.f348059a;
            int i15 = this.f348060b;
            int i16 = i15 + 1;
            this.f348060b = i16;
            byte b12 = bArr2[i15];
            int i17 = this.f348061c;
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
        int i19 = this.f348061c;
        if (i19 + i18 > 8) {
            byte[] bArr3 = this.f348059a;
            int i22 = this.f348060b;
            this.f348060b = i22 + 1;
            bArr[i13] = (byte) (b14 | ((bArr3[i22] & 255) << i19));
            this.f348061c = i19 - 8;
        }
        int i23 = this.f348061c + i18;
        this.f348061c = i23;
        byte[] bArr4 = this.f348059a;
        int i24 = this.f348060b;
        bArr[i13] = (byte) (((byte) (((255 & bArr4[i24]) >> (8 - i23)) << (8 - i18))) | bArr[i13]);
        if (i23 == 8) {
            this.f348061c = 0;
            this.f348060b = i24 + 1;
        }
        a();
    }

    public final void i(int i12, byte[] bArr) {
        C36585a.d(this.f348061c == 0);
        System.arraycopy(this.f348059a, this.f348060b, bArr, 0, i12);
        this.f348060b += i12;
        a();
    }

    public final void j(int i12, byte[] bArr) {
        this.f348059a = bArr;
        this.f348060b = 0;
        this.f348061c = 0;
        this.f348062d = i12;
    }

    public final void k(int i12) {
        int i13 = i12 / 8;
        this.f348060b = i13;
        this.f348061c = i12 - (i13 * 8);
        a();
    }

    public final void l() {
        int i12 = this.f348061c + 1;
        this.f348061c = i12;
        if (i12 == 8) {
            this.f348061c = 0;
            this.f348060b++;
        }
        a();
    }

    public final void m(int i12) {
        int i13 = i12 / 8;
        int i14 = this.f348060b + i13;
        this.f348060b = i14;
        int i15 = (i12 - (i13 * 8)) + this.f348061c;
        this.f348061c = i15;
        if (i15 > 7) {
            this.f348060b = i14 + 1;
            this.f348061c = i15 - 8;
        }
        a();
    }

    public final void n(int i12) {
        C36585a.d(this.f348061c == 0);
        this.f348060b += i12;
        a();
    }

    public E(byte[] bArr, int i12) {
        this.f348059a = bArr;
        this.f348062d = i12;
    }
}

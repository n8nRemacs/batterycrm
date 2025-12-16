package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class qr0 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f389284a;

    /* renamed from: b, reason: collision with root package name */
    private int f389285b;

    /* renamed from: c, reason: collision with root package name */
    private int f389286c;

    /* renamed from: d, reason: collision with root package name */
    private int f389287d;

    public qr0(byte[] bArr, int i12, int i13) {
        a(bArr, i12, i13);
    }

    public final void a(byte[] bArr, int i12, int i13) {
        this.f389284a = bArr;
        this.f389286c = i12;
        this.f389285b = i13;
        boolean z12 = false;
        this.f389287d = 0;
        if (i12 >= 0 && (i12 < i13 || i12 == i13)) {
            z12 = true;
        }
        db.b(z12);
    }

    public final boolean b() {
        boolean z12 = (this.f389284a[this.f389286c] & (128 >> this.f389287d)) != 0;
        e();
        return z12;
    }

    public final int c() {
        int i12 = 0;
        while (!b()) {
            i12++;
        }
        int iB2 = ((1 << i12) - 1) + (i12 > 0 ? b(i12) : 0);
        return ((iB2 + 1) / 2) * (iB2 % 2 == 0 ? -1 : 1);
    }

    public final void d(int i12) {
        int i13;
        int i14;
        int i15 = this.f389286c;
        int i16 = i12 / 8;
        int i17 = i15 + i16;
        this.f389286c = i17;
        int i18 = (i12 - (i16 * 8)) + this.f389287d;
        this.f389287d = i18;
        boolean z12 = true;
        if (i18 > 7) {
            this.f389286c = i17 + 1;
            this.f389287d = i18 - 8;
        }
        while (true) {
            int i19 = i15 + 1;
            i13 = this.f389286c;
            if (i19 > i13) {
                break;
            }
            if (c(i19)) {
                this.f389286c++;
                i15 += 3;
            } else {
                i15 = i19;
            }
        }
        if (i13 < 0 || (i13 >= (i14 = this.f389285b) && (i13 != i14 || this.f389287d != 0))) {
            z12 = false;
        }
        db.b(z12);
    }

    public final void e() {
        int i12;
        boolean z12 = true;
        int i13 = this.f389287d + 1;
        this.f389287d = i13;
        if (i13 == 8) {
            this.f389287d = 0;
            int i14 = this.f389286c;
            this.f389286c = i14 + (c(i14 + 1) ? 2 : 1);
        }
        int i15 = this.f389286c;
        if (i15 < 0 || (i15 >= (i12 = this.f389285b) && (i15 != i12 || this.f389287d != 0))) {
            z12 = false;
        }
        db.b(z12);
    }

    public final int b(int i12) {
        int i13;
        int i14;
        this.f389287d += i12;
        boolean z12 = false;
        int i15 = 0;
        while (true) {
            i13 = this.f389287d;
            if (i13 <= 8) {
                break;
            }
            int i16 = i13 - 8;
            this.f389287d = i16;
            byte[] bArr = this.f389284a;
            int i17 = this.f389286c;
            i15 |= (bArr[i17] & 255) << i16;
            if (!c(i17 + 1)) {
                i = 1;
            }
            this.f389286c = i17 + i;
        }
        byte[] bArr2 = this.f389284a;
        int i18 = this.f389286c;
        int i19 = ((-1) >>> (32 - i12)) & (i15 | ((bArr2[i18] & 255) >> (8 - i13)));
        if (i13 == 8) {
            this.f389287d = 0;
            this.f389286c = i18 + (c(i18 + 1) ? 2 : 1);
        }
        int i22 = this.f389286c;
        if (i22 >= 0 && (i22 < (i14 = this.f389285b) || (i22 == i14 && this.f389287d == 0))) {
            z12 = true;
        }
        db.b(z12);
        return i19;
    }

    private boolean c(int i12) {
        if (2 <= i12 && i12 < this.f389285b) {
            byte[] bArr = this.f389284a;
            if (bArr[i12] == 3 && bArr[i12 - 2] == 0 && bArr[i12 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(int i12) {
        int i13 = this.f389286c;
        int i14 = i12 / 8;
        int i15 = i13 + i14;
        int i16 = (this.f389287d + i12) - (i14 * 8);
        if (i16 > 7) {
            i15++;
            i16 -= 8;
        }
        while (true) {
            int i17 = i13 + 1;
            if (i17 > i15 || i15 >= this.f389285b) {
                break;
            }
            if (c(i17)) {
                i15++;
                i13 += 3;
            } else {
                i13 = i17;
            }
        }
        int i18 = this.f389285b;
        return i15 < i18 || (i15 == i18 && i16 == 0);
    }

    public final int d() {
        int i12 = 0;
        while (!b()) {
            i12++;
        }
        return ((1 << i12) - 1) + (i12 > 0 ? b(i12) : 0);
    }

    public final boolean a() {
        int i12 = this.f389286c;
        int i13 = this.f389287d;
        int i14 = 0;
        while (this.f389286c < this.f389285b && !b()) {
            i14++;
        }
        boolean z12 = this.f389286c == this.f389285b;
        this.f389286c = i12;
        this.f389287d = i13;
        return !z12 && a((i14 * 2) + 1);
    }
}

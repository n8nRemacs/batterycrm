package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class wk1 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f391433a;

    /* renamed from: b, reason: collision with root package name */
    private final int f391434b;

    /* renamed from: c, reason: collision with root package name */
    private int f391435c;

    /* renamed from: d, reason: collision with root package name */
    private int f391436d;

    public wk1(byte[] bArr) {
        this.f391433a = bArr;
        this.f391434b = bArr.length;
    }

    public final int a(int i12) {
        int i13 = this.f391435c;
        int iMin = Math.min(i12, 8 - this.f391436d);
        int i14 = i13 + 1;
        int i15 = ((this.f391433a[i13] & 255) >> this.f391436d) & (255 >> (8 - iMin));
        while (iMin < i12) {
            i15 |= (this.f391433a[i14] & 255) << iMin;
            iMin += 8;
            i14++;
        }
        int i16 = i15 & ((-1) >>> (32 - i12));
        b(i12);
        return i16;
    }

    public final boolean b() {
        boolean z12 = (((this.f391433a[this.f391435c] & 255) >> this.f391436d) & 1) == 1;
        b(1);
        return z12;
    }

    public final void b(int i12) {
        int i13;
        int i14 = i12 / 8;
        int i15 = this.f391435c + i14;
        this.f391435c = i15;
        int i16 = (i12 - (i14 * 8)) + this.f391436d;
        this.f391436d = i16;
        boolean z12 = true;
        if (i16 > 7) {
            this.f391435c = i15 + 1;
            this.f391436d = i16 - 8;
        }
        int i17 = this.f391435c;
        if (i17 < 0 || (i17 >= (i13 = this.f391434b) && (i17 != i13 || this.f391436d != 0))) {
            z12 = false;
        }
        db.b(z12);
    }

    public final int a() {
        return (this.f391435c * 8) + this.f391436d;
    }
}

package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.C36585a;

/* compiled from: VorbisBitArray.java */
/* loaded from: classes6.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f344383a;

    /* renamed from: b, reason: collision with root package name */
    public final int f344384b;

    /* renamed from: c, reason: collision with root package name */
    public int f344385c;

    /* renamed from: d, reason: collision with root package name */
    public int f344386d;

    public C(byte[] bArr) {
        this.f344383a = bArr;
        this.f344384b = bArr.length;
    }

    public final boolean a() {
        boolean z12 = (((this.f344383a[this.f344385c] & 255) >> this.f344386d) & 1) == 1;
        c(1);
        return z12;
    }

    public final int b(int i12) {
        int i13 = this.f344385c;
        int iMin = Math.min(i12, 8 - this.f344386d);
        int i14 = i13 + 1;
        byte[] bArr = this.f344383a;
        int i15 = ((bArr[i13] & 255) >> this.f344386d) & (255 >> (8 - iMin));
        while (iMin < i12) {
            i15 |= (bArr[i14] & 255) << iMin;
            iMin += 8;
            i14++;
        }
        int i16 = i15 & ((-1) >>> (32 - i12));
        c(i12);
        return i16;
    }

    public final void c(int i12) {
        int i13;
        int i14 = i12 / 8;
        int i15 = this.f344385c + i14;
        this.f344385c = i15;
        int i16 = (i12 - (i14 * 8)) + this.f344386d;
        this.f344386d = i16;
        boolean z12 = true;
        if (i16 > 7) {
            this.f344385c = i15 + 1;
            this.f344386d = i16 - 8;
        }
        int i17 = this.f344385c;
        if (i17 < 0 || (i17 >= (i13 = this.f344384b) && (i17 != i13 || this.f344386d != 0))) {
            z12 = false;
        }
        C36585a.d(z12);
    }
}

package com.google.android.exoplayer2.util;

/* compiled from: ParsableNalUnitBitArray.java */
/* loaded from: classes6.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f348073a;

    /* renamed from: b, reason: collision with root package name */
    public int f348074b;

    /* renamed from: c, reason: collision with root package name */
    public int f348075c;

    /* renamed from: d, reason: collision with root package name */
    public int f348076d = 0;

    public G(byte[] bArr, int i12, int i13) {
        this.f348073a = bArr;
        this.f348075c = i12;
        this.f348074b = i13;
        a();
    }

    public final void a() {
        int i12;
        int i13 = this.f348075c;
        C36585a.d(i13 >= 0 && (i13 < (i12 = this.f348074b) || (i13 == i12 && this.f348076d == 0)));
    }

    public final boolean b(int i12) {
        int i13 = this.f348075c;
        int i14 = i12 / 8;
        int i15 = i13 + i14;
        int i16 = (this.f348076d + i12) - (i14 * 8);
        if (i16 > 7) {
            i15++;
            i16 -= 8;
        }
        while (true) {
            i13++;
            if (i13 > i15 || i15 >= this.f348074b) {
                break;
            }
            if (h(i13)) {
                i15++;
                i13 += 2;
            }
        }
        int i17 = this.f348074b;
        if (i15 >= i17) {
            return i15 == i17 && i16 == 0;
        }
        return true;
    }

    public final boolean c() {
        int i12 = this.f348075c;
        int i13 = this.f348076d;
        int i14 = 0;
        while (this.f348075c < this.f348074b && !d()) {
            i14++;
        }
        boolean z12 = this.f348075c == this.f348074b;
        this.f348075c = i12;
        this.f348076d = i13;
        return !z12 && b((i14 * 2) + 1);
    }

    public final boolean d() {
        boolean z12 = (this.f348073a[this.f348075c] & (128 >> this.f348076d)) != 0;
        i();
        return z12;
    }

    public final int e(int i12) {
        int i13;
        this.f348076d += i12;
        int i14 = 0;
        while (true) {
            i13 = this.f348076d;
            if (i13 <= 8) {
                break;
            }
            int i15 = i13 - 8;
            this.f348076d = i15;
            byte[] bArr = this.f348073a;
            int i16 = this.f348075c;
            i14 |= (bArr[i16] & 255) << i15;
            if (!h(i16 + 1)) {
                i = 1;
            }
            this.f348075c = i16 + i;
        }
        byte[] bArr2 = this.f348073a;
        int i17 = this.f348075c;
        int i18 = ((-1) >>> (32 - i12)) & (i14 | ((bArr2[i17] & 255) >> (8 - i13)));
        if (i13 == 8) {
            this.f348076d = 0;
            this.f348075c = i17 + (h(i17 + 1) ? 2 : 1);
        }
        a();
        return i18;
    }

    public final int f() {
        int i12 = 0;
        while (!d()) {
            i12++;
        }
        return ((1 << i12) - 1) + (i12 > 0 ? e(i12) : 0);
    }

    public final int g() {
        int iF2 = f();
        return ((iF2 + 1) / 2) * (iF2 % 2 == 0 ? -1 : 1);
    }

    public final boolean h(int i12) {
        if (2 <= i12 && i12 < this.f348074b) {
            byte[] bArr = this.f348073a;
            if (bArr[i12] == 3 && bArr[i12 - 2] == 0 && bArr[i12 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        int i12 = this.f348076d + 1;
        this.f348076d = i12;
        if (i12 == 8) {
            this.f348076d = 0;
            int i13 = this.f348075c;
            this.f348075c = i13 + (h(i13 + 1) ? 2 : 1);
        }
        a();
    }

    public final void j(int i12) {
        int i13 = this.f348075c;
        int i14 = i12 / 8;
        int i15 = i13 + i14;
        this.f348075c = i15;
        int i16 = (i12 - (i14 * 8)) + this.f348076d;
        this.f348076d = i16;
        if (i16 > 7) {
            this.f348075c = i15 + 1;
            this.f348076d = i16 - 8;
        }
        while (true) {
            i13++;
            if (i13 > this.f348075c) {
                a();
                return;
            } else if (h(i13)) {
                this.f348075c++;
                i13 += 2;
            }
        }
    }
}

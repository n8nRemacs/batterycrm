package androidx.media3.container;

import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;

/* compiled from: ParsableNalUnitBitArray.java */
@J
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f48152a;

    /* renamed from: b, reason: collision with root package name */
    public int f48153b;

    /* renamed from: c, reason: collision with root package name */
    public int f48154c;

    /* renamed from: d, reason: collision with root package name */
    public int f48155d = 0;

    public c(byte[] bArr, int i12, int i13) {
        this.f48152a = bArr;
        this.f48154c = i12;
        this.f48153b = i13;
        a();
    }

    public final void a() {
        int i12;
        int i13 = this.f48154c;
        C23110a.g(i13 >= 0 && (i13 < (i12 = this.f48153b) || (i13 == i12 && this.f48155d == 0)));
    }

    public final boolean b(int i12) {
        int i13 = this.f48154c;
        int i14 = i12 / 8;
        int i15 = i13 + i14;
        int i16 = (this.f48155d + i12) - (i14 * 8);
        if (i16 > 7) {
            i15++;
            i16 -= 8;
        }
        while (true) {
            i13++;
            if (i13 > i15 || i15 >= this.f48153b) {
                break;
            }
            if (h(i13)) {
                i15++;
                i13 += 2;
            }
        }
        int i17 = this.f48153b;
        if (i15 >= i17) {
            return i15 == i17 && i16 == 0;
        }
        return true;
    }

    public final boolean c() {
        int i12 = this.f48154c;
        int i13 = this.f48155d;
        int i14 = 0;
        while (this.f48154c < this.f48153b && !d()) {
            i14++;
        }
        boolean z12 = this.f48154c == this.f48153b;
        this.f48154c = i12;
        this.f48155d = i13;
        return !z12 && b((i14 * 2) + 1);
    }

    public final boolean d() {
        boolean z12 = (this.f48152a[this.f48154c] & (128 >> this.f48155d)) != 0;
        i();
        return z12;
    }

    public final int e(int i12) {
        int i13;
        this.f48155d += i12;
        int i14 = 0;
        while (true) {
            i13 = this.f48155d;
            if (i13 <= 8) {
                break;
            }
            int i15 = i13 - 8;
            this.f48155d = i15;
            byte[] bArr = this.f48152a;
            int i16 = this.f48154c;
            i14 |= (bArr[i16] & 255) << i15;
            if (!h(i16 + 1)) {
                i = 1;
            }
            this.f48154c = i16 + i;
        }
        byte[] bArr2 = this.f48152a;
        int i17 = this.f48154c;
        int i18 = ((-1) >>> (32 - i12)) & (i14 | ((bArr2[i17] & 255) >> (8 - i13)));
        if (i13 == 8) {
            this.f48155d = 0;
            this.f48154c = i17 + (h(i17 + 1) ? 2 : 1);
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
        if (2 <= i12 && i12 < this.f48153b) {
            byte[] bArr = this.f48152a;
            if (bArr[i12] == 3 && bArr[i12 - 2] == 0 && bArr[i12 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        int i12 = this.f48155d + 1;
        this.f48155d = i12;
        if (i12 == 8) {
            this.f48155d = 0;
            int i13 = this.f48154c;
            this.f48154c = i13 + (h(i13 + 1) ? 2 : 1);
        }
        a();
    }

    public final void j(int i12) {
        int i13 = this.f48154c;
        int i14 = i12 / 8;
        int i15 = i13 + i14;
        this.f48154c = i15;
        int i16 = (i12 - (i14 * 8)) + this.f48155d;
        this.f48155d = i16;
        if (i16 > 7) {
            this.f48154c = i15 + 1;
            this.f48155d = i16 - 8;
        }
        while (true) {
            i13++;
            if (i13 > this.f48154c) {
                a();
                return;
            } else if (h(i13)) {
                this.f48154c++;
                i13 += 2;
            }
        }
    }
}

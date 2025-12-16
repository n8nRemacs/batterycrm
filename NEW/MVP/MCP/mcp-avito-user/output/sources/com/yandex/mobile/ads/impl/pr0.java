package com.yandex.mobile.ads.impl;

import androidx.compose.foundation.text.selection.C21030p;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class pr0 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f388937a;

    /* renamed from: b, reason: collision with root package name */
    private int f388938b;

    /* renamed from: c, reason: collision with root package name */
    private int f388939c;

    public pr0() {
        this.f388937a = pc1.f388773f;
    }

    public final long A() {
        int i12;
        int i13;
        long j12 = this.f388937a[this.f388938b];
        int i14 = 7;
        while (true) {
            if (i14 < 0) {
                break;
            }
            if (((1 << i14) & j12) != 0) {
                i14--;
            } else if (i14 < 6) {
                j12 &= r6 - 1;
                i13 = 7 - i14;
            } else if (i14 == 7) {
                i13 = 1;
            }
        }
        i13 = 0;
        if (i13 == 0) {
            throw new NumberFormatException(C21030p.a(j12, "Invalid UTF-8 sequence first byte: "));
        }
        for (i12 = 1; i12 < i13; i12++) {
            if ((this.f388937a[this.f388938b + i12] & 192) != 128) {
                throw new NumberFormatException(C21030p.a(j12, "Invalid UTF-8 sequence continuation byte: "));
            }
            j12 = (j12 << 6) | (r3 & 63);
        }
        this.f388938b += i13;
        return j12;
    }

    public final void a(int i12, byte[] bArr) {
        this.f388937a = bArr;
        this.f388939c = i12;
        this.f388938b = 0;
    }

    public final int b() {
        return this.f388937a.length;
    }

    public final byte[] c() {
        return this.f388937a;
    }

    public final void d(int i12) {
        db.a(i12 >= 0 && i12 <= this.f388937a.length);
        this.f388939c = i12;
    }

    public final int e() {
        return this.f388939c;
    }

    public final void f(int i12) {
        e(this.f388938b + i12);
    }

    public final int g() {
        return this.f388937a[this.f388938b] & 255;
    }

    public final int h() {
        byte[] bArr = this.f388937a;
        int i12 = this.f388938b;
        int i13 = ((bArr[i12 + 1] & 255) << 16) | ((bArr[i12] & 255) << 24);
        int i14 = i12 + 3;
        int i15 = i13 | ((bArr[i12 + 2] & 255) << 8);
        this.f388938b = i12 + 4;
        return (bArr[i14] & 255) | i15;
    }

    public final int i() {
        byte[] bArr = this.f388937a;
        int i12 = this.f388938b;
        int i13 = i12 + 2;
        int i14 = ((bArr[i12 + 1] & 255) << 8) | (((bArr[i12] & 255) << 24) >> 8);
        this.f388938b = i12 + 3;
        return (bArr[i13] & 255) | i14;
    }

    @j.P
    public final String j() {
        if (a() == 0) {
            return null;
        }
        int i12 = this.f388938b;
        while (i12 < this.f388939c) {
            byte b12 = this.f388937a[i12];
            int i13 = pc1.f388768a;
            if (b12 == 10 || b12 == 13) {
                break;
            }
            i12++;
        }
        int i14 = this.f388938b;
        if (i12 - i14 >= 3) {
            byte[] bArr = this.f388937a;
            if (bArr[i14] == -17 && bArr[i14 + 1] == -69 && bArr[i14 + 2] == -65) {
                this.f388938b = i14 + 3;
            }
        }
        byte[] bArr2 = this.f388937a;
        int i15 = this.f388938b;
        String strA = pc1.a(bArr2, i15, i12 - i15);
        this.f388938b = i12;
        int i16 = this.f388939c;
        if (i12 == i16) {
            return strA;
        }
        byte[] bArr3 = this.f388937a;
        if (bArr3[i12] == 13) {
            int i17 = i12 + 1;
            this.f388938b = i17;
            if (i17 == i16) {
                return strA;
            }
        }
        int i18 = this.f388938b;
        if (bArr3[i18] == 10) {
            this.f388938b = i18 + 1;
        }
        return strA;
    }

    public final int k() {
        byte[] bArr = this.f388937a;
        int i12 = this.f388938b;
        int i13 = ((bArr[i12 + 1] & 255) << 8) | (bArr[i12] & 255);
        int i14 = i12 + 3;
        int i15 = i13 | ((bArr[i12 + 2] & 255) << 16);
        this.f388938b = i12 + 4;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    public final long l() {
        byte[] bArr = this.f388937a;
        int i12 = this.f388938b;
        int i13 = i12 + 7;
        long j12 = (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16) | ((bArr[i12 + 3] & 255) << 24) | ((bArr[i12 + 4] & 255) << 32) | ((bArr[i12 + 5] & 255) << 40) | ((bArr[i12 + 6] & 255) << 48);
        this.f388938b = i12 + 8;
        return ((bArr[i13] & 255) << 56) | j12;
    }

    public final short m() {
        byte[] bArr = this.f388937a;
        int i12 = this.f388938b;
        int i13 = i12 + 1;
        int i14 = bArr[i12] & 255;
        this.f388938b = i12 + 2;
        return (short) (((bArr[i13] & 255) << 8) | i14);
    }

    public final long n() {
        byte[] bArr = this.f388937a;
        int i12 = this.f388938b;
        int i13 = i12 + 3;
        long j12 = (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16);
        this.f388938b = i12 + 4;
        return ((bArr[i13] & 255) << 24) | j12;
    }

    public final int o() {
        byte[] bArr = this.f388937a;
        int i12 = this.f388938b;
        int i13 = i12 + 1;
        int i14 = bArr[i12] & 255;
        this.f388938b = i12 + 2;
        return ((bArr[i13] & 255) << 8) | i14;
    }

    public final long p() {
        byte[] bArr = this.f388937a;
        int i12 = this.f388938b;
        int i13 = i12 + 7;
        long j12 = ((bArr[i12] & 255) << 56) | ((bArr[i12 + 1] & 255) << 48) | ((bArr[i12 + 2] & 255) << 40) | ((bArr[i12 + 3] & 255) << 32) | ((bArr[i12 + 4] & 255) << 24) | ((bArr[i12 + 5] & 255) << 16) | ((bArr[i12 + 6] & 255) << 8);
        this.f388938b = i12 + 8;
        return (bArr[i13] & 255) | j12;
    }

    @j.P
    public final String q() {
        if (a() == 0) {
            return null;
        }
        int i12 = this.f388938b;
        while (i12 < this.f388939c && this.f388937a[i12] != 0) {
            i12++;
        }
        byte[] bArr = this.f388937a;
        int i13 = this.f388938b;
        String strA = pc1.a(bArr, i13, i12 - i13);
        this.f388938b = i12;
        if (i12 < this.f388939c) {
            this.f388938b = i12 + 1;
        }
        return strA;
    }

    public final short r() {
        byte[] bArr = this.f388937a;
        int i12 = this.f388938b;
        int i13 = i12 + 1;
        int i14 = (bArr[i12] & 255) << 8;
        this.f388938b = i12 + 2;
        return (short) ((bArr[i13] & 255) | i14);
    }

    public final int s() {
        return (t() << 21) | (t() << 14) | (t() << 7) | t();
    }

    public final int t() {
        byte[] bArr = this.f388937a;
        int i12 = this.f388938b;
        this.f388938b = i12 + 1;
        return bArr[i12] & 255;
    }

    public final int u() {
        byte[] bArr = this.f388937a;
        int i12 = this.f388938b;
        int i13 = (bArr[i12 + 1] & 255) | ((bArr[i12] & 255) << 8);
        this.f388938b = i12 + 4;
        return i13;
    }

    public final long v() {
        byte[] bArr = this.f388937a;
        int i12 = this.f388938b;
        int i13 = i12 + 3;
        long j12 = ((bArr[i12] & 255) << 24) | ((bArr[i12 + 1] & 255) << 16) | ((bArr[i12 + 2] & 255) << 8);
        this.f388938b = i12 + 4;
        return (bArr[i13] & 255) | j12;
    }

    public final int w() {
        byte[] bArr = this.f388937a;
        int i12 = this.f388938b;
        int i13 = i12 + 2;
        int i14 = ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12] & 255) << 16);
        this.f388938b = i12 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public final int x() {
        int iH2 = h();
        if (iH2 >= 0) {
            return iH2;
        }
        throw new IllegalStateException(ba.a("Top bit not zero: ", iH2));
    }

    public final long y() {
        long jP2 = p();
        if (jP2 >= 0) {
            return jP2;
        }
        throw new IllegalStateException(C21030p.a(jP2, "Top bit not zero: "));
    }

    public final int z() {
        byte[] bArr = this.f388937a;
        int i12 = this.f388938b;
        int i13 = i12 + 1;
        int i14 = (bArr[i12] & 255) << 8;
        this.f388938b = i12 + 2;
        return (bArr[i13] & 255) | i14;
    }

    public final String b(int i12) {
        if (i12 == 0) {
            return "";
        }
        int i13 = this.f388938b;
        int i14 = (i13 + i12) - 1;
        String strA = pc1.a(this.f388937a, i13, (i14 >= this.f388939c || this.f388937a[i14] != 0) ? i12 : i12 - 1);
        this.f388938b += i12;
        return strA;
    }

    public final void c(int i12) {
        byte[] bArr = this.f388937a;
        if (bArr.length < i12) {
            bArr = new byte[i12];
        }
        a(i12, bArr);
    }

    public final void e(int i12) {
        db.a(i12 >= 0 && i12 <= this.f388939c);
        this.f388938b = i12;
    }

    public final char f() {
        byte[] bArr = this.f388937a;
        int i12 = this.f388938b;
        return (char) ((bArr[i12 + 1] & 255) | ((bArr[i12] & 255) << 8));
    }

    public pr0(int i12) {
        this.f388937a = new byte[i12];
        this.f388939c = i12;
    }

    public final int d() {
        return this.f388938b;
    }

    public final int a() {
        return this.f388939c - this.f388938b;
    }

    public final void a(int i12) {
        byte[] bArr = this.f388937a;
        if (i12 > bArr.length) {
            this.f388937a = Arrays.copyOf(bArr, i12);
        }
    }

    public pr0(byte[] bArr) {
        this.f388937a = bArr;
        this.f388939c = bArr.length;
    }

    public final void a(byte[] bArr, int i12, int i13) {
        System.arraycopy(this.f388937a, this.f388938b, bArr, i12, i13);
        this.f388938b += i13;
    }

    public pr0(int i12, byte[] bArr) {
        this.f388937a = bArr;
        this.f388939c = i12;
    }

    public final String a(int i12, Charset charset) {
        String str = new String(this.f388937a, this.f388938b, i12, charset);
        this.f388938b += i12;
        return str;
    }
}

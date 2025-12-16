package com.google.android.exoplayer2.util;

import androidx.compose.foundation.text.selection.C21030p;
import com.google.common.base.C37262f;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: ParsableByteArray.java */
/* loaded from: classes6.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f348070a;

    /* renamed from: b, reason: collision with root package name */
    public int f348071b;

    /* renamed from: c, reason: collision with root package name */
    public int f348072c;

    public F() {
        this.f348070a = U.f348110e;
    }

    public final void A(int i12) {
        C36585a.b(i12 >= 0 && i12 <= this.f348070a.length);
        this.f348072c = i12;
    }

    public final void B(int i12) {
        C36585a.b(i12 >= 0 && i12 <= this.f348072c);
        this.f348071b = i12;
    }

    public final void C(int i12) {
        B(this.f348071b + i12);
    }

    public final int a() {
        return this.f348072c - this.f348071b;
    }

    public final void b(int i12) {
        byte[] bArr = this.f348070a;
        if (i12 > bArr.length) {
            this.f348070a = Arrays.copyOf(bArr, i12);
        }
    }

    public final void c(int i12, int i13, byte[] bArr) {
        System.arraycopy(this.f348070a, this.f348071b, bArr, i12, i13);
        this.f348071b += i13;
    }

    public final int d() {
        byte[] bArr = this.f348070a;
        int i12 = this.f348071b;
        int i13 = i12 + 1;
        this.f348071b = i13;
        int i14 = (bArr[i12] & 255) << 24;
        int i15 = i12 + 2;
        this.f348071b = i15;
        int i16 = ((bArr[i13] & 255) << 16) | i14;
        int i17 = i12 + 3;
        this.f348071b = i17;
        int i18 = i16 | ((bArr[i15] & 255) << 8);
        this.f348071b = i12 + 4;
        return (bArr[i17] & 255) | i18;
    }

    @j.P
    public final String e() {
        if (a() == 0) {
            return null;
        }
        int i12 = this.f348071b;
        while (i12 < this.f348072c) {
            byte b12 = this.f348070a[i12];
            int i13 = U.f348106a;
            if (b12 == 10 || b12 == 13) {
                break;
            }
            i12++;
        }
        int i14 = this.f348071b;
        if (i12 - i14 >= 3) {
            byte[] bArr = this.f348070a;
            if (bArr[i14] == -17 && bArr[i14 + 1] == -69 && bArr[i14 + 2] == -65) {
                this.f348071b = i14 + 3;
            }
        }
        byte[] bArr2 = this.f348070a;
        int i15 = this.f348071b;
        int i16 = U.f348106a;
        String str = new String(bArr2, i15, i12 - i15, C37262f.f359034c);
        this.f348071b = i12;
        int i17 = this.f348072c;
        if (i12 == i17) {
            return str;
        }
        byte[] bArr3 = this.f348070a;
        if (bArr3[i12] == 13) {
            int i18 = i12 + 1;
            this.f348071b = i18;
            if (i18 == i17) {
                return str;
            }
        }
        int i19 = this.f348071b;
        if (bArr3[i19] == 10) {
            this.f348071b = i19 + 1;
        }
        return str;
    }

    public final int f() {
        byte[] bArr = this.f348070a;
        int i12 = this.f348071b;
        int i13 = i12 + 1;
        this.f348071b = i13;
        int i14 = bArr[i12] & 255;
        int i15 = i12 + 2;
        this.f348071b = i15;
        int i16 = ((bArr[i13] & 255) << 8) | i14;
        int i17 = i12 + 3;
        this.f348071b = i17;
        int i18 = i16 | ((bArr[i15] & 255) << 16);
        this.f348071b = i12 + 4;
        return ((bArr[i17] & 255) << 24) | i18;
    }

    public final long g() {
        byte[] bArr = this.f348070a;
        int i12 = this.f348071b;
        this.f348071b = i12 + 1;
        this.f348071b = i12 + 2;
        this.f348071b = i12 + 3;
        long j12 = (bArr[i12] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f348071b = i12 + 4;
        long j13 = j12 | ((bArr[r8] & 255) << 24);
        this.f348071b = i12 + 5;
        long j14 = j13 | ((bArr[r7] & 255) << 32);
        this.f348071b = i12 + 6;
        long j15 = j14 | ((bArr[r8] & 255) << 40);
        this.f348071b = i12 + 7;
        long j16 = j15 | ((bArr[r7] & 255) << 48);
        this.f348071b = i12 + 8;
        return ((bArr[r8] & 255) << 56) | j16;
    }

    public final short h() {
        byte[] bArr = this.f348070a;
        int i12 = this.f348071b;
        int i13 = i12 + 1;
        this.f348071b = i13;
        int i14 = bArr[i12] & 255;
        this.f348071b = i12 + 2;
        return (short) (((bArr[i13] & 255) << 8) | i14);
    }

    public final long i() {
        byte[] bArr = this.f348070a;
        int i12 = this.f348071b;
        this.f348071b = i12 + 1;
        this.f348071b = i12 + 2;
        this.f348071b = i12 + 3;
        long j12 = (bArr[i12] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f348071b = i12 + 4;
        return ((bArr[r4] & 255) << 24) | j12;
    }

    public final int j() {
        int iF2 = f();
        if (iF2 >= 0) {
            return iF2;
        }
        throw new IllegalStateException(AK.c.g(iF2, "Top bit not zero: "));
    }

    public final int k() {
        byte[] bArr = this.f348070a;
        int i12 = this.f348071b;
        int i13 = i12 + 1;
        this.f348071b = i13;
        int i14 = bArr[i12] & 255;
        this.f348071b = i12 + 2;
        return ((bArr[i13] & 255) << 8) | i14;
    }

    public final long l() {
        byte[] bArr = this.f348070a;
        int i12 = this.f348071b;
        this.f348071b = i12 + 1;
        this.f348071b = i12 + 2;
        this.f348071b = i12 + 3;
        long j12 = ((bArr[i12] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f348071b = i12 + 4;
        long j13 = j12 | ((bArr[r4] & 255) << 32);
        this.f348071b = i12 + 5;
        long j14 = j13 | ((bArr[r7] & 255) << 24);
        this.f348071b = i12 + 6;
        long j15 = j14 | ((bArr[r4] & 255) << 16);
        this.f348071b = i12 + 7;
        long j16 = j15 | ((bArr[r7] & 255) << 8);
        this.f348071b = i12 + 8;
        return (bArr[r4] & 255) | j16;
    }

    @j.P
    public final String m() {
        if (a() == 0) {
            return null;
        }
        int i12 = this.f348071b;
        while (i12 < this.f348072c && this.f348070a[i12] != 0) {
            i12++;
        }
        byte[] bArr = this.f348070a;
        int i13 = this.f348071b;
        int i14 = U.f348106a;
        String str = new String(bArr, i13, i12 - i13, C37262f.f359034c);
        this.f348071b = i12;
        if (i12 < this.f348072c) {
            this.f348071b = i12 + 1;
        }
        return str;
    }

    public final String n(int i12) {
        if (i12 == 0) {
            return "";
        }
        int i13 = this.f348071b;
        int i14 = (i13 + i12) - 1;
        int i15 = (i14 >= this.f348072c || this.f348070a[i14] != 0) ? i12 : i12 - 1;
        byte[] bArr = this.f348070a;
        int i16 = U.f348106a;
        String str = new String(bArr, i13, i15, C37262f.f359034c);
        this.f348071b += i12;
        return str;
    }

    public final short o() {
        byte[] bArr = this.f348070a;
        int i12 = this.f348071b;
        int i13 = i12 + 1;
        this.f348071b = i13;
        int i14 = (bArr[i12] & 255) << 8;
        this.f348071b = i12 + 2;
        return (short) ((bArr[i13] & 255) | i14);
    }

    public final String p(int i12, Charset charset) {
        String str = new String(this.f348070a, this.f348071b, i12, charset);
        this.f348071b += i12;
        return str;
    }

    public final int q() {
        return (r() << 21) | (r() << 14) | (r() << 7) | r();
    }

    public final int r() {
        byte[] bArr = this.f348070a;
        int i12 = this.f348071b;
        this.f348071b = i12 + 1;
        return bArr[i12] & 255;
    }

    public final long s() {
        byte[] bArr = this.f348070a;
        int i12 = this.f348071b;
        this.f348071b = i12 + 1;
        this.f348071b = i12 + 2;
        this.f348071b = i12 + 3;
        long j12 = ((bArr[i12] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f348071b = i12 + 4;
        return (bArr[r4] & 255) | j12;
    }

    public final int t() {
        byte[] bArr = this.f348070a;
        int i12 = this.f348071b;
        int i13 = i12 + 1;
        this.f348071b = i13;
        int i14 = (bArr[i12] & 255) << 16;
        int i15 = i12 + 2;
        this.f348071b = i15;
        int i16 = ((bArr[i13] & 255) << 8) | i14;
        this.f348071b = i12 + 3;
        return (bArr[i15] & 255) | i16;
    }

    public final int u() {
        int iD2 = d();
        if (iD2 >= 0) {
            return iD2;
        }
        throw new IllegalStateException(AK.c.g(iD2, "Top bit not zero: "));
    }

    public final long v() {
        long jL2 = l();
        if (jL2 >= 0) {
            return jL2;
        }
        throw new IllegalStateException(C21030p.a(jL2, "Top bit not zero: "));
    }

    public final int w() {
        byte[] bArr = this.f348070a;
        int i12 = this.f348071b;
        int i13 = i12 + 1;
        this.f348071b = i13;
        int i14 = (bArr[i12] & 255) << 8;
        this.f348071b = i12 + 2;
        return (bArr[i13] & 255) | i14;
    }

    public final long x() {
        int i12;
        int i13;
        long j12 = this.f348070a[this.f348071b];
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
            if ((this.f348070a[this.f348071b + i12] & 192) != 128) {
                throw new NumberFormatException(C21030p.a(j12, "Invalid UTF-8 sequence continuation byte: "));
            }
            j12 = (j12 << 6) | (r3 & 63);
        }
        this.f348071b += i13;
        return j12;
    }

    public final void y(int i12) {
        byte[] bArr = this.f348070a;
        if (bArr.length < i12) {
            bArr = new byte[i12];
        }
        z(i12, bArr);
    }

    public final void z(int i12, byte[] bArr) {
        this.f348070a = bArr;
        this.f348072c = i12;
        this.f348071b = 0;
    }

    public F(int i12) {
        this.f348070a = new byte[i12];
        this.f348072c = i12;
    }

    public F(byte[] bArr) {
        this.f348070a = bArr;
        this.f348072c = bArr.length;
    }

    public F(byte[] bArr, int i12) {
        this.f348070a = bArr;
        this.f348072c = i12;
    }
}

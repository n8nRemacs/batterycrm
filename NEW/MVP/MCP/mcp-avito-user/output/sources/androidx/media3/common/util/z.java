package androidx.media3.common.util;

import androidx.compose.foundation.text.selection.C21030p;
import com.google.common.base.C37262f;
import com.google.common.collect.H1;
import j.P;
import java.nio.charset.Charset;
import java.util.Arrays;
import okhttp3.internal.http2.Settings;

/* compiled from: ParsableByteArray.java */
@J
/* loaded from: classes.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f47959d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f47960e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final H1<Charset> f47961f = H1.N(C37262f.f359032a, C37262f.f359034c, C37262f.f359037f, C37262f.f359035d, C37262f.f359036e);

    /* renamed from: a, reason: collision with root package name */
    public byte[] f47962a;

    /* renamed from: b, reason: collision with root package name */
    public int f47963b;

    /* renamed from: c, reason: collision with root package name */
    public int f47964c;

    public z() {
        this.f47962a = M.f47891e;
    }

    public final long A() {
        int i12;
        int i13;
        long j12 = this.f47962a[this.f47963b];
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
            if ((this.f47962a[this.f47963b + i12] & 192) != 128) {
                throw new NumberFormatException(C21030p.a(j12, "Invalid UTF-8 sequence continuation byte: "));
            }
            j12 = (j12 << 6) | (r3 & 63);
        }
        this.f47963b += i13;
        return j12;
    }

    @P
    public final Charset B() {
        if (a() >= 3) {
            byte[] bArr = this.f47962a;
            int i12 = this.f47963b;
            if (bArr[i12] == -17 && bArr[i12 + 1] == -69 && bArr[i12 + 2] == -65) {
                this.f47963b = i12 + 3;
                return C37262f.f359034c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f47962a;
        int i13 = this.f47963b;
        byte b12 = bArr2[i13];
        if (b12 == -2 && bArr2[i13 + 1] == -1) {
            this.f47963b = i13 + 2;
            return C37262f.f359035d;
        }
        if (b12 != -1 || bArr2[i13 + 1] != -2) {
            return null;
        }
        this.f47963b = i13 + 2;
        return C37262f.f359036e;
    }

    public final void C(int i12) {
        byte[] bArr = this.f47962a;
        if (bArr.length < i12) {
            bArr = new byte[i12];
        }
        D(i12, bArr);
    }

    public final void D(int i12, byte[] bArr) {
        this.f47962a = bArr;
        this.f47964c = i12;
        this.f47963b = 0;
    }

    public final void E(int i12) {
        C23110a.b(i12 >= 0 && i12 <= this.f47962a.length);
        this.f47964c = i12;
    }

    public final void F(int i12) {
        C23110a.b(i12 >= 0 && i12 <= this.f47964c);
        this.f47963b = i12;
    }

    public final void G(int i12) {
        F(this.f47963b + i12);
    }

    public final int a() {
        return this.f47964c - this.f47963b;
    }

    public final void b(int i12) {
        byte[] bArr = this.f47962a;
        if (i12 > bArr.length) {
            this.f47962a = Arrays.copyOf(bArr, i12);
        }
    }

    public final char c(Charset charset) {
        C23110a.a("Unsupported charset: " + charset, f47961f.contains(charset));
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        byte b12;
        int i12;
        byte b13;
        byte b14;
        if ((charset.equals(C37262f.f359034c) || charset.equals(C37262f.f359032a)) && a() >= 1) {
            long j12 = this.f47962a[this.f47963b] & 255;
            char c12 = (char) j12;
            com.google.common.base.M.e("Out of range: %s", ((long) c12) == j12, j12);
            b12 = (byte) c12;
            i12 = 1;
        } else {
            i12 = 2;
            if ((charset.equals(C37262f.f359037f) || charset.equals(C37262f.f359035d)) && a() >= 2) {
                byte[] bArr = this.f47962a;
                int i13 = this.f47963b;
                b13 = bArr[i13];
                b14 = bArr[i13 + 1];
            } else {
                if (!charset.equals(C37262f.f359036e) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f47962a;
                int i14 = this.f47963b;
                b13 = bArr2[i14 + 1];
                b14 = bArr2[i14];
            }
            b12 = (byte) ((char) ((b14 & 255) | (b13 << 8)));
        }
        long j13 = b12;
        char c13 = (char) j13;
        com.google.common.base.M.e("Out of range: %s", ((long) c13) == j13, j13);
        return (c13 << 16) + i12;
    }

    public final void e(int i12, int i13, byte[] bArr) {
        System.arraycopy(this.f47962a, this.f47963b, bArr, i12, i13);
        this.f47963b += i13;
    }

    public final char f(Charset charset, char[] cArr) {
        int iD2 = d(charset);
        if (iD2 != 0) {
            char c12 = (char) (iD2 >> 16);
            for (char c13 : cArr) {
                if (c13 == c12) {
                    this.f47963b += iD2 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                    return c12;
                }
            }
        }
        return (char) 0;
    }

    public final int g() {
        byte[] bArr = this.f47962a;
        int i12 = this.f47963b;
        int i13 = i12 + 1;
        this.f47963b = i13;
        int i14 = (bArr[i12] & 255) << 24;
        int i15 = i12 + 2;
        this.f47963b = i15;
        int i16 = ((bArr[i13] & 255) << 16) | i14;
        int i17 = i12 + 3;
        this.f47963b = i17;
        int i18 = i16 | ((bArr[i15] & 255) << 8);
        this.f47963b = i12 + 4;
        return (bArr[i17] & 255) | i18;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String h(java.nio.charset.Charset r8) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.z.h(java.nio.charset.Charset):java.lang.String");
    }

    public final int i() {
        byte[] bArr = this.f47962a;
        int i12 = this.f47963b;
        int i13 = i12 + 1;
        this.f47963b = i13;
        int i14 = bArr[i12] & 255;
        int i15 = i12 + 2;
        this.f47963b = i15;
        int i16 = ((bArr[i13] & 255) << 8) | i14;
        int i17 = i12 + 3;
        this.f47963b = i17;
        int i18 = i16 | ((bArr[i15] & 255) << 16);
        this.f47963b = i12 + 4;
        return ((bArr[i17] & 255) << 24) | i18;
    }

    public final long j() {
        byte[] bArr = this.f47962a;
        int i12 = this.f47963b;
        this.f47963b = i12 + 1;
        this.f47963b = i12 + 2;
        this.f47963b = i12 + 3;
        long j12 = (bArr[i12] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f47963b = i12 + 4;
        long j13 = j12 | ((bArr[r8] & 255) << 24);
        this.f47963b = i12 + 5;
        long j14 = j13 | ((bArr[r7] & 255) << 32);
        this.f47963b = i12 + 6;
        long j15 = j14 | ((bArr[r8] & 255) << 40);
        this.f47963b = i12 + 7;
        long j16 = j15 | ((bArr[r7] & 255) << 48);
        this.f47963b = i12 + 8;
        return ((bArr[r8] & 255) << 56) | j16;
    }

    public final short k() {
        byte[] bArr = this.f47962a;
        int i12 = this.f47963b;
        int i13 = i12 + 1;
        this.f47963b = i13;
        int i14 = bArr[i12] & 255;
        this.f47963b = i12 + 2;
        return (short) (((bArr[i13] & 255) << 8) | i14);
    }

    public final long l() {
        byte[] bArr = this.f47962a;
        int i12 = this.f47963b;
        this.f47963b = i12 + 1;
        this.f47963b = i12 + 2;
        this.f47963b = i12 + 3;
        long j12 = (bArr[i12] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f47963b = i12 + 4;
        return ((bArr[r4] & 255) << 24) | j12;
    }

    public final int m() {
        int i12 = i();
        if (i12 >= 0) {
            return i12;
        }
        throw new IllegalStateException(AK.c.g(i12, "Top bit not zero: "));
    }

    public final int n() {
        byte[] bArr = this.f47962a;
        int i12 = this.f47963b;
        int i13 = i12 + 1;
        this.f47963b = i13;
        int i14 = bArr[i12] & 255;
        this.f47963b = i12 + 2;
        return ((bArr[i13] & 255) << 8) | i14;
    }

    public final long o() {
        byte[] bArr = this.f47962a;
        int i12 = this.f47963b;
        this.f47963b = i12 + 1;
        this.f47963b = i12 + 2;
        this.f47963b = i12 + 3;
        long j12 = ((bArr[i12] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f47963b = i12 + 4;
        long j13 = j12 | ((bArr[r4] & 255) << 32);
        this.f47963b = i12 + 5;
        long j14 = j13 | ((bArr[r7] & 255) << 24);
        this.f47963b = i12 + 6;
        long j15 = j14 | ((bArr[r4] & 255) << 16);
        this.f47963b = i12 + 7;
        long j16 = j15 | ((bArr[r7] & 255) << 8);
        this.f47963b = i12 + 8;
        return (bArr[r4] & 255) | j16;
    }

    @P
    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i12 = this.f47963b;
        while (i12 < this.f47964c && this.f47962a[i12] != 0) {
            i12++;
        }
        byte[] bArr = this.f47962a;
        int i13 = this.f47963b;
        int i14 = M.f47887a;
        String str = new String(bArr, i13, i12 - i13, C37262f.f359034c);
        this.f47963b = i12;
        if (i12 < this.f47964c) {
            this.f47963b = i12 + 1;
        }
        return str;
    }

    public final String q(int i12) {
        if (i12 == 0) {
            return "";
        }
        int i13 = this.f47963b;
        int i14 = (i13 + i12) - 1;
        int i15 = (i14 >= this.f47964c || this.f47962a[i14] != 0) ? i12 : i12 - 1;
        byte[] bArr = this.f47962a;
        int i16 = M.f47887a;
        String str = new String(bArr, i13, i15, C37262f.f359034c);
        this.f47963b += i12;
        return str;
    }

    public final short r() {
        byte[] bArr = this.f47962a;
        int i12 = this.f47963b;
        int i13 = i12 + 1;
        this.f47963b = i13;
        int i14 = (bArr[i12] & 255) << 8;
        this.f47963b = i12 + 2;
        return (short) ((bArr[i13] & 255) | i14);
    }

    public final String s(int i12, Charset charset) {
        String str = new String(this.f47962a, this.f47963b, i12, charset);
        this.f47963b += i12;
        return str;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.f47962a;
        int i12 = this.f47963b;
        this.f47963b = i12 + 1;
        return bArr[i12] & 255;
    }

    public final long v() {
        byte[] bArr = this.f47962a;
        int i12 = this.f47963b;
        this.f47963b = i12 + 1;
        this.f47963b = i12 + 2;
        this.f47963b = i12 + 3;
        long j12 = ((bArr[i12] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f47963b = i12 + 4;
        return (bArr[r4] & 255) | j12;
    }

    public final int w() {
        byte[] bArr = this.f47962a;
        int i12 = this.f47963b;
        int i13 = i12 + 1;
        this.f47963b = i13;
        int i14 = (bArr[i12] & 255) << 16;
        int i15 = i12 + 2;
        this.f47963b = i15;
        int i16 = ((bArr[i13] & 255) << 8) | i14;
        this.f47963b = i12 + 3;
        return (bArr[i15] & 255) | i16;
    }

    public final int x() {
        int iG2 = g();
        if (iG2 >= 0) {
            return iG2;
        }
        throw new IllegalStateException(AK.c.g(iG2, "Top bit not zero: "));
    }

    public final long y() {
        long jO2 = o();
        if (jO2 >= 0) {
            return jO2;
        }
        throw new IllegalStateException(C21030p.a(jO2, "Top bit not zero: "));
    }

    public final int z() {
        byte[] bArr = this.f47962a;
        int i12 = this.f47963b;
        int i13 = i12 + 1;
        this.f47963b = i13;
        int i14 = (bArr[i12] & 255) << 8;
        this.f47963b = i12 + 2;
        return (bArr[i13] & 255) | i14;
    }

    public z(int i12) {
        this.f47962a = new byte[i12];
        this.f47964c = i12;
    }

    public z(byte[] bArr) {
        this.f47962a = bArr;
        this.f47964c = bArr.length;
    }

    public z(byte[] bArr, int i12) {
        this.f47962a = bArr;
        this.f47964c = i12;
    }
}

package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class qyg {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public static final long[] e = {128, 64, 32, 16, 8, 4, 2, 1};
    public byte[] a;
    public int b;
    public int c;

    public qyg(int i, boolean z) {
        switch (i) {
            case 1:
                this.a = new byte[8];
                break;
            case 2:
                this.a = xxg.f;
                break;
            default:
                this.a = new byte[8];
                break;
        }
    }

    public static long a(int i, boolean z, byte[] bArr) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public static long b(int i, boolean z, byte[] bArr) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~e[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public long A() {
        int i;
        int i2;
        long j = this.a[this.b];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r6 - 1;
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j);
            throw new NumberFormatException(sb.toString());
        }
        for (i = 1; i < i2; i++) {
            if ((this.a[this.b + i] & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(62);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j);
                throw new NumberFormatException(sb2.toString());
            }
            j = (j << 6) | (r3 & 63);
        }
        this.b += i2;
        return j;
    }

    public void B(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        C(i, bArr);
    }

    public void C(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public void D(int i) {
        fsi.b(i >= 0 && i <= this.a.length);
        this.c = i;
    }

    public void E(int i) {
        fsi.b(i >= 0 && i <= this.c);
        this.b = i;
    }

    public void F(int i) {
        E(this.b + i);
    }

    public int c() {
        return this.c - this.b;
    }

    public void d(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public void e(int i, byte[] bArr, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public int f() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String g() {
        /*
            r8 = this;
            int r0 = r8.c()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r8.b
        La:
            int r1 = r8.c
            r2 = 13
            r3 = 10
            if (r0 >= r1) goto L20
            byte[] r1 = r8.a
            r1 = r1[r0]
            int r4 = defpackage.xxg.a
            if (r1 == r3) goto L20
            if (r1 != r2) goto L1d
            goto L20
        L1d:
            int r0 = r0 + 1
            goto La
        L20:
            int r1 = r8.b
            int r4 = r0 - r1
            r5 = 3
            if (r4 < r5) goto L42
            byte[] r4 = r8.a
            r6 = r4[r1]
            r7 = -17
            if (r6 != r7) goto L42
            int r6 = r1 + 1
            r6 = r4[r6]
            r7 = -69
            if (r6 != r7) goto L42
            int r6 = r1 + 2
            r4 = r4[r6]
            r6 = -65
            if (r4 != r6) goto L42
            int r1 = r1 + r5
            r8.b = r1
        L42:
            byte[] r1 = r8.a
            int r4 = r8.b
            int r5 = r0 - r4
            int r6 = defpackage.xxg.a
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r7 = defpackage.mb2.c
            r6.<init>(r1, r4, r5, r7)
            r8.b = r0
            int r1 = r8.c
            if (r0 != r1) goto L58
            goto L6f
        L58:
            byte[] r4 = r8.a
            r5 = r4[r0]
            if (r5 != r2) goto L65
            int r0 = r0 + 1
            r8.b = r0
            if (r0 != r1) goto L65
            goto L6f
        L65:
            int r0 = r8.b
            r1 = r4[r0]
            if (r1 != r3) goto L6f
            int r0 = r0 + 1
            r8.b = r0
        L6f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qyg.g():java.lang.String");
    }

    public int h() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.b = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public long i() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i + 4;
        long j2 = j | ((bArr[r8] & 255) << 24);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 32);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r8] & 255) << 40);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 48);
        this.b = i + 8;
        return ((bArr[r8] & 255) << 56) | j5;
    }

    public long j() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i + 4;
        return ((bArr[r4] & 255) << 24) | j;
    }

    public int k() {
        int iH = h();
        if (iH >= 0) {
            return iH;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(iH);
        throw new IllegalStateException(sb.toString());
    }

    public int l() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public long m() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = ((bArr[i] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.b = i + 4;
        long j2 = j | ((bArr[r4] & 255) << 32);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 24);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r4] & 255) << 16);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 8);
        this.b = i + 8;
        return (bArr[r4] & 255) | j5;
    }

    public String n() {
        if (c() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = xxg.a;
        String str = new String(bArr, i2, i - i2, mb2.c);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return str;
    }

    public String o(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.c || this.a[i3] != 0) ? i : i - 1;
        byte[] bArr = this.a;
        int i5 = xxg.a;
        String str = new String(bArr, i2, i4, mb2.c);
        this.b += i;
        return str;
    }

    public short p() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public String q(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public int r() {
        return (s() << 21) | (s() << 14) | (s() << 7) | s();
    }

    public int s() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public long t() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.b = i + 4;
        return (bArr[r4] & 255) | j;
    }

    public int u() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public int v() {
        int iF = f();
        if (iF >= 0) {
            return iF;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(iF);
        throw new IllegalStateException(sb.toString());
    }

    public long w() {
        long jM = m();
        if (jM >= 0) {
            return jM;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(jM);
        throw new IllegalStateException(sb.toString());
    }

    public int x() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public long y(hp5 hp5Var, boolean z, boolean z2, int i) {
        int i2;
        byte[] bArr = this.a;
        if (this.b == 0) {
            if (!hp5Var.a(bArr, 0, 1, z)) {
                return -1L;
            }
            int i3 = bArr[0] & 255;
            int i4 = 0;
            while (true) {
                if (i4 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((d[i4] & i3) != 0) {
                    i2 = i4 + 1;
                    break;
                }
                i4++;
            }
            this.c = i2;
            if (i2 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.b = 1;
        }
        int i5 = this.c;
        if (i5 > i) {
            this.b = 0;
            return -2L;
        }
        if (i5 != 1) {
            hp5Var.readFully(bArr, 1, i5 - 1);
        }
        this.b = 0;
        return a(this.c, z2, bArr);
    }

    public long z(ip5 ip5Var, boolean z, boolean z2, int i) {
        int i2;
        byte[] bArr = this.a;
        if (this.b == 0) {
            if (!ip5Var.a(bArr, 0, 1, z)) {
                return -1L;
            }
            int i3 = bArr[0] & 255;
            int i4 = 0;
            while (true) {
                if (i4 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((e[i4] & i3) != 0) {
                    i2 = i4 + 1;
                    break;
                }
                i4++;
            }
            this.c = i2;
            if (i2 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.b = 1;
        }
        int i5 = this.c;
        if (i5 > i) {
            this.b = 0;
            return -2L;
        }
        if (i5 != 1) {
            ip5Var.readFully(bArr, 1, i5 - 1);
        }
        this.b = 0;
        return b(this.c, z2, bArr);
    }

    public qyg(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public qyg(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public qyg(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
    }
}

package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class pae extends xx0 {
    public final transient int[] X;
    public final transient byte[][] o;

    public pae(byte[][] bArr, int[] iArr) {
        super(xx0.d.c);
        this.o = bArr;
        this.X = iArr;
    }

    @Override // defpackage.xx0
    public final String a() {
        throw null;
    }

    @Override // defpackage.xx0
    public final xx0 c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.o;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.X;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        return new xx0(messageDigest.digest());
    }

    @Override // defpackage.xx0
    public final int d() {
        return this.X[this.o.length - 1];
    }

    @Override // defpackage.xx0
    public final String e() {
        byte[] bArrN = n();
        char[] cArr = new char[bArrN.length * 2];
        int i = 0;
        for (byte b : bArrN) {
            int i2 = i + 1;
            char[] cArr2 = rz3.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @Override // defpackage.xx0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xx0)) {
            return false;
        }
        xx0 xx0Var = (xx0) obj;
        return xx0Var.d() == d() && j(d(), xx0Var);
    }

    @Override // defpackage.xx0
    public final byte[] g() {
        return n();
    }

    @Override // defpackage.xx0
    public final byte h(int i) {
        byte[][] bArr = this.o;
        int length = bArr.length - 1;
        int[] iArr = this.X;
        qoi.a(iArr[length], i, 1L);
        int iA = q9j.a(this, i);
        return bArr[iA][(i - (iA == 0 ? 0 : iArr[iA - 1])) + iArr[bArr.length + iA]];
    }

    @Override // defpackage.xx0
    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.o;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.X;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.a = i3;
        return i3;
    }

    @Override // defpackage.xx0
    public final boolean i(int i, int i2, int i3, byte[] bArr) {
        if (i >= 0 && i <= d() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iA = q9j.a(this, i);
            while (i < i4) {
                int[] iArr = this.X;
                int i5 = iA == 0 ? 0 : iArr[iA - 1];
                int i6 = iArr[iA] - i5;
                byte[][] bArr2 = this.o;
                int i7 = iArr[bArr2.length + iA];
                int iMin = Math.min(i4, i6 + i5) - i;
                int i8 = (i - i5) + i7;
                byte[] bArr3 = bArr2[iA];
                for (int i9 = 0; i9 < iMin; i9++) {
                    if (bArr3[i9 + i8] == bArr[i9 + i2]) {
                    }
                }
                i2 += iMin;
                i += iMin;
                iA++;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.xx0
    public final boolean j(int i, xx0 xx0Var) {
        if (d() - i >= 0) {
            int iA = q9j.a(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.X;
                int i4 = iA == 0 ? 0 : iArr[iA - 1];
                int i5 = iArr[iA] - i4;
                byte[][] bArr = this.o;
                int i6 = iArr[bArr.length + iA];
                int iMin = Math.min(i, i5 + i4) - i2;
                if (xx0Var.i(i3, (i2 - i4) + i6, iMin, bArr[iA])) {
                    i3 += iMin;
                    i2 += iMin;
                    iA++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.xx0
    public final xx0 k() {
        return new xx0(n()).k();
    }

    @Override // defpackage.xx0
    public final void m(qu0 qu0Var, int i) {
        int iA = q9j.a(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.X;
            int i3 = iA == 0 ? 0 : iArr[iA - 1];
            int i4 = iArr[iA] - i3;
            byte[][] bArr = this.o;
            int i5 = iArr[bArr.length + iA];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            w9e w9eVar = new w9e(bArr[iA], i6, i6 + iMin, true, false);
            w9e w9eVar2 = qu0Var.a;
            if (w9eVar2 == null) {
                w9eVar.g = w9eVar;
                w9eVar.f = w9eVar;
                qu0Var.a = w9eVar;
            } else {
                w9eVar2.g.b(w9eVar);
            }
            i2 += iMin;
            iA++;
        }
        qu0Var.b += d();
    }

    public final byte[] n() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.o;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.X;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            System.arraycopy(bArr2[i], i4, bArr, i3, (i4 + i6) - i4);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.xx0
    public final String toString() {
        return new xx0(n()).toString();
    }
}

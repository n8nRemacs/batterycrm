package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class nm4 implements ip5 {
    public int X;
    public int Y;
    public final ke4 b;
    public final long c;
    public long d;
    public byte[] o = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        e19.a("media3.extractor");
    }

    public nm4(ke4 ke4Var, long j, long j2) {
        this.b = ke4Var;
        this.d = j;
        this.c = j2;
    }

    @Override // defpackage.ip5
    public final boolean K(int i, boolean z) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.Y, i);
        d(iMin);
        int iC = iMin;
        while (iC < i && iC != -1) {
            byte[] bArr = this.a;
            iC = c(bArr, -iC, Math.min(i, bArr.length + iC), iC, z);
        }
        if (iC != -1) {
            this.d += iC;
        }
        return iC != -1;
    }

    @Override // defpackage.ip5
    public final boolean P(int i, boolean z) throws EOFException, InterruptedIOException {
        b(i);
        int iC = this.Y - this.X;
        while (iC < i) {
            int i2 = i;
            boolean z2 = z;
            iC = c(this.o, this.X, i2, iC, z2);
            if (iC == -1) {
                return false;
            }
            this.Y = this.X + iC;
            i = i2;
            z = z2;
        }
        this.X += i;
        return true;
    }

    @Override // defpackage.ip5
    public final boolean a(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.Y;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.o, 0, bArr, i, iMin);
            d(iMin);
        }
        int iC = iMin;
        while (iC < i2 && iC != -1) {
            iC = c(bArr, i, i2, iC, z);
        }
        if (iC != -1) {
            this.d += iC;
        }
        return iC != -1;
    }

    public final void b(int i) {
        int i2 = this.X + i;
        byte[] bArr = this.o;
        if (i2 > bArr.length) {
            this.o = Arrays.copyOf(this.o, zxg.i(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final int c(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.b.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void d(int i) {
        int i2 = this.Y - i;
        this.Y = i2;
        this.X = 0;
        byte[] bArr = this.o;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.o = bArr2;
    }

    @Override // defpackage.ip5
    public final long getLength() {
        return this.c;
    }

    @Override // defpackage.ip5
    public final long getPosition() {
        return this.d;
    }

    @Override // defpackage.ip5
    public final void i(int i, byte[] bArr, int i2) {
        n(bArr, i, i2, false);
    }

    @Override // defpackage.ip5
    public final boolean n(byte[] bArr, int i, int i2, boolean z) {
        if (!P(i2, z)) {
            return false;
        }
        System.arraycopy(this.o, this.X - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.ip5
    public final long o() {
        return this.d + this.X;
    }

    @Override // defpackage.ip5
    public final void q(int i) throws EOFException, InterruptedIOException {
        P(i, false);
    }

    @Override // defpackage.ke4
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        nm4 nm4Var;
        int i3 = this.Y;
        int iC = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.o, 0, bArr, i, iMin);
            d(iMin);
            iC = iMin;
        }
        if (iC == 0) {
            nm4Var = this;
            iC = nm4Var.c(bArr, i, i2, 0, true);
        } else {
            nm4Var = this;
        }
        if (iC != -1) {
            nm4Var.d += iC;
        }
        return iC;
    }

    @Override // defpackage.ip5
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        a(bArr, i, i2, false);
    }

    @Override // defpackage.ip5
    public final int t(int i, byte[] bArr, int i2) throws EOFException, InterruptedIOException {
        nm4 nm4Var;
        int iMin;
        b(i2);
        int i3 = this.Y;
        int i4 = this.X;
        int i5 = i3 - i4;
        if (i5 == 0) {
            nm4Var = this;
            iMin = nm4Var.c(this.o, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            nm4Var.Y += iMin;
        } else {
            nm4Var = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(nm4Var.o, nm4Var.X, bArr, i, iMin);
        nm4Var.X += iMin;
        return iMin;
    }

    @Override // defpackage.ip5
    public final int v(int i) throws EOFException, InterruptedIOException {
        nm4 nm4Var;
        int iMin = Math.min(this.Y, i);
        d(iMin);
        if (iMin == 0) {
            byte[] bArr = this.a;
            nm4Var = this;
            iMin = nm4Var.c(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            nm4Var = this;
        }
        if (iMin != -1) {
            nm4Var.d += iMin;
        }
        return iMin;
    }

    @Override // defpackage.ip5
    public final void y() {
        this.X = 0;
    }

    @Override // defpackage.ip5
    public final void z(int i) throws EOFException, InterruptedIOException {
        K(i, false);
    }
}

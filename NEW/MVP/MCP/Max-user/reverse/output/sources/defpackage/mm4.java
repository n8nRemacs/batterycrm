package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class mm4 implements hp5 {
    public int X;
    public int Y;
    public final je4 b;
    public final long c;
    public long d;
    public byte[] o = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        tm5.a("goog.exo.extractor");
    }

    public mm4(je4 je4Var, long j, long j2) {
        this.b = je4Var;
        this.d = j;
        this.c = j2;
    }

    @Override // defpackage.hp5
    public final int G() throws EOFException, InterruptedIOException {
        mm4 mm4Var;
        int iMin = Math.min(this.Y, 1);
        e(iMin);
        if (iMin == 0) {
            byte[] bArr = this.a;
            mm4Var = this;
            iMin = mm4Var.d(bArr, 0, Math.min(1, bArr.length), 0, true);
        } else {
            mm4Var = this;
        }
        if (iMin != -1) {
            mm4Var.d += iMin;
        }
        return iMin;
    }

    @Override // defpackage.hp5
    public final boolean a(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.Y;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.o, 0, bArr, i, iMin);
            e(iMin);
        }
        int iD = iMin;
        while (iD < i2 && iD != -1) {
            iD = d(bArr, i, i2, iD, z);
        }
        if (iD != -1) {
            this.d += iD;
        }
        return iD != -1;
    }

    public final boolean b(int i, boolean z) throws EOFException, InterruptedIOException {
        c(i);
        int iD = this.Y - this.X;
        while (iD < i) {
            int i2 = i;
            boolean z2 = z;
            iD = d(this.o, this.X, i2, iD, z2);
            if (iD == -1) {
                return false;
            }
            this.Y = this.X + iD;
            i = i2;
            z = z2;
        }
        this.X += i;
        return true;
    }

    public final void c(int i) {
        int i2 = this.X + i;
        byte[] bArr = this.o;
        if (i2 > bArr.length) {
            this.o = Arrays.copyOf(this.o, xxg.i(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final int d(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
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

    public final void e(int i) {
        int i2 = this.Y - i;
        this.Y = i2;
        this.X = 0;
        byte[] bArr = this.o;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.o = bArr2;
    }

    @Override // defpackage.hp5
    public final long getLength() {
        return this.c;
    }

    @Override // defpackage.hp5
    public final long getPosition() {
        return this.d;
    }

    @Override // defpackage.hp5
    public final void i(int i, byte[] bArr, int i2) {
        n(bArr, i, i2, false);
    }

    @Override // defpackage.hp5
    public final boolean n(byte[] bArr, int i, int i2, boolean z) {
        if (!b(i2, z)) {
            return false;
        }
        System.arraycopy(this.o, this.X - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.hp5
    public final long o() {
        return this.d + this.X;
    }

    @Override // defpackage.hp5
    public final void q(int i) throws EOFException, InterruptedIOException {
        b(i, false);
    }

    @Override // defpackage.je4
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        mm4 mm4Var;
        int i3 = this.Y;
        int iD = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.o, 0, bArr, i, iMin);
            e(iMin);
            iD = iMin;
        }
        if (iD == 0) {
            mm4Var = this;
            iD = mm4Var.d(bArr, i, i2, 0, true);
        } else {
            mm4Var = this;
        }
        if (iD != -1) {
            mm4Var.d += iD;
        }
        return iD;
    }

    @Override // defpackage.hp5
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        a(bArr, i, i2, false);
    }

    @Override // defpackage.hp5
    public final int t(int i, byte[] bArr, int i2) throws EOFException, InterruptedIOException {
        mm4 mm4Var;
        int iMin;
        c(i2);
        int i3 = this.Y;
        int i4 = this.X;
        int i5 = i3 - i4;
        if (i5 == 0) {
            mm4Var = this;
            iMin = mm4Var.d(this.o, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            mm4Var.Y += iMin;
        } else {
            mm4Var = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(mm4Var.o, mm4Var.X, bArr, i, iMin);
        mm4Var.X += iMin;
        return iMin;
    }

    @Override // defpackage.hp5
    public final void y() {
        this.X = 0;
    }

    @Override // defpackage.hp5
    public final void z(int i) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.Y, i);
        e(iMin);
        int iD = iMin;
        while (iD < i && iD != -1) {
            byte[] bArr = this.a;
            iD = d(bArr, -iD, Math.min(i, bArr.length + iD), iD, false);
        }
        if (iD != -1) {
            this.d += iD;
        }
    }
}

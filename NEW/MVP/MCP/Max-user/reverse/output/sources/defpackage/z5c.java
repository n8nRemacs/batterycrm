package defpackage;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class z5c extends InputStream {
    public final nf9 a;
    public int b;
    public int c;

    public z5c(nf9 nf9Var) {
        boolean zI0;
        synchronized (nf9Var) {
            zI0 = vc3.i0(nf9Var.b);
        }
        if (!zI0) {
            throw new IllegalArgumentException();
        }
        this.a = nf9Var;
        this.b = 0;
        this.c = 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.Q() - this.b;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.c = this.b;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        int i = this.b;
        this.b = i + 1;
        return this.a.y(i) & 255;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.b = this.c;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        l5j.a(Boolean.valueOf(j >= 0));
        int iMin = Math.min((int) j, available());
        this.b += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            int iAvailable = available();
            if (iAvailable <= 0) {
                return -1;
            }
            if (i2 <= 0) {
                return 0;
            }
            int iMin = Math.min(iAvailable, i2);
            this.a.P(this.b, i, iMin, bArr);
            this.b += iMin;
            return iMin;
        }
        StringBuilder sb = new StringBuilder("length=");
        hf3.g(sb, bArr.length, "; regionStart=", i, "; regionLength=");
        sb.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }
}

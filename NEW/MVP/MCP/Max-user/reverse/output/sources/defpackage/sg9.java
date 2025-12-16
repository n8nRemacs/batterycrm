package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class sg9 extends InputStream {
    public final b6 a;
    public final BufferedInputStream b;
    public byte[] c;
    public int d;
    public final int o;

    public sg9(b6 b6Var, BufferedInputStream bufferedInputStream, byte[] bArr, int i, int i2) {
        this.a = b6Var;
        this.b = bufferedInputStream;
        this.c = bArr;
        this.d = i;
        this.o = i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.c != null ? this.o - this.d : this.b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        l();
        this.b.close();
    }

    public final void l() {
        byte[] bArr = this.c;
        if (bArr != null) {
            this.c = null;
            b6 b6Var = this.a;
            if (b6Var != null) {
                b6Var.g(bArr);
            }
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        if (this.c == null) {
            this.b.mark(i);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.c == null && this.b.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (bArr == null) {
            return this.b.read();
        }
        int i = this.d;
        int i2 = i + 1;
        this.d = i2;
        int i3 = bArr[i] & 255;
        if (i2 >= this.o) {
            l();
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        if (this.c == null) {
            this.b.reset();
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        long j2;
        if (this.c != null) {
            int i = this.d;
            j2 = this.o - i;
            if (j2 > j) {
                this.d = i + ((int) j);
                return j;
            }
            l();
            j -= j2;
        } else {
            j2 = 0;
        }
        return j > 0 ? this.b.skip(j) + j2 : j2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.c;
        if (bArr2 != null) {
            int i3 = this.d;
            int i4 = this.o;
            int i5 = i4 - i3;
            if (i2 > i5) {
                i2 = i5;
            }
            System.arraycopy(bArr2, i3, bArr, i, i2);
            int i6 = this.d + i2;
            this.d = i6;
            if (i6 >= i4) {
                l();
            }
            return i2;
        }
        return this.b.read(bArr, i, i2);
    }
}

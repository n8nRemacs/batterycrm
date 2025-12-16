package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class y5c extends InputStream {
    public boolean X;
    public final InputStream a;
    public final byte[] b;
    public final fod c;
    public int d;
    public int o;

    public y5c(InputStream inputStream, byte[] bArr, fod fodVar) {
        this.a = inputStream;
        bArr.getClass();
        this.b = bArr;
        fodVar.getClass();
        this.c = fodVar;
        this.d = 0;
        this.o = 0;
        this.X = false;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        l5j.f(this.o <= this.d);
        l();
        return this.a.available() + (this.d - this.o);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.X) {
            return;
        }
        this.X = true;
        this.c.b(this.b);
        super.close();
    }

    public final void finalize() throws Throwable {
        if (!this.X) {
            if (op5.a.h(6)) {
                op5.a.e("PooledByteInputStream", "Finalized without closing");
            }
            close();
        }
        super.finalize();
    }

    public final void l() throws IOException {
        if (this.X) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        l5j.f(this.o <= this.d);
        l();
        int i = this.o;
        int i2 = this.d;
        byte[] bArr = this.b;
        if (i >= i2) {
            int i3 = this.a.read(bArr);
            if (i3 <= 0) {
                return -1;
            }
            this.d = i3;
            this.o = 0;
        }
        int i4 = this.o;
        this.o = i4 + 1;
        return bArr[i4] & 255;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        l5j.f(this.o <= this.d);
        l();
        int i = this.d;
        int i2 = this.o;
        long j2 = i - i2;
        if (j2 >= j) {
            this.o = (int) (i2 + j);
            return j;
        }
        this.o = i;
        return this.a.skip(j - j2) + j2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        l5j.f(this.o <= this.d);
        l();
        int i3 = this.o;
        int i4 = this.d;
        byte[] bArr2 = this.b;
        if (i3 >= i4) {
            int i5 = this.a.read(bArr2);
            if (i5 <= 0) {
                return -1;
            }
            this.d = i5;
            this.o = 0;
        }
        int iMin = Math.min(this.d - this.o, i2);
        System.arraycopy(bArr2, this.o, bArr, i, iMin);
        this.o += iMin;
        return iMin;
    }
}

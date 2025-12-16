package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: MergedStream.java */
/* loaded from: classes3.dex */
public final class i extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final f f341174b;

    /* renamed from: c, reason: collision with root package name */
    public final InputStream f341175c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f341176d;

    /* renamed from: e, reason: collision with root package name */
    public int f341177e;

    /* renamed from: f, reason: collision with root package name */
    public final int f341178f;

    public i(f fVar, InputStream inputStream, byte[] bArr, int i12, int i13) {
        this.f341174b = fVar;
        this.f341175c = inputStream;
        this.f341176d = bArr;
        this.f341177e = i12;
        this.f341178f = i13;
    }

    public final void a() {
        byte[] bArr = this.f341176d;
        if (bArr != null) {
            this.f341176d = null;
            f fVar = this.f341174b;
            if (fVar != null) {
                fVar.e(bArr);
            }
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f341176d != null ? this.f341178f - this.f341177e : this.f341175c.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        a();
        this.f341175c.close();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i12) {
        if (this.f341176d == null) {
            this.f341175c.mark(i12);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f341176d == null && this.f341175c.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f341176d;
        if (bArr == null) {
            return this.f341175c.read();
        }
        int i12 = this.f341177e;
        int i13 = i12 + 1;
        this.f341177e = i13;
        int i14 = bArr[i12] & 255;
        if (i13 >= this.f341178f) {
            a();
        }
        return i14;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        if (this.f341176d == null) {
            this.f341175c.reset();
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j12) {
        long j13;
        if (this.f341176d != null) {
            int i12 = this.f341177e;
            j13 = this.f341178f - i12;
            if (j13 > j12) {
                this.f341177e = i12 + ((int) j12);
                return j12;
            }
            a();
            j12 -= j13;
        } else {
            j13 = 0;
        }
        return j12 > 0 ? j13 + this.f341175c.skip(j12) : j13;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i12, int i13) {
        byte[] bArr2 = this.f341176d;
        if (bArr2 != null) {
            int i14 = this.f341177e;
            int i15 = this.f341178f;
            int i16 = i15 - i14;
            if (i13 > i16) {
                i13 = i16;
            }
            System.arraycopy(bArr2, i14, bArr, i12, i13);
            int i17 = this.f341177e + i13;
            this.f341177e = i17;
            if (i17 >= i15) {
                a();
            }
            return i13;
        }
        return this.f341175c.read(bArr, i12, i13);
    }
}

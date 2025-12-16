package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import okio.Y;

/* compiled from: MarkableInputStream.java */
/* loaded from: classes7.dex */
final class s extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final InputStream f366453b;

    /* renamed from: c, reason: collision with root package name */
    public long f366454c;

    /* renamed from: d, reason: collision with root package name */
    public long f366455d;

    /* renamed from: e, reason: collision with root package name */
    public long f366456e;

    /* renamed from: f, reason: collision with root package name */
    public long f366457f = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f366458g = true;

    /* renamed from: h, reason: collision with root package name */
    public final int f366459h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.BufferedInputStream] */
    public s(Y.a aVar) {
        this.f366459h = -1;
        this.f366453b = aVar.markSupported() ? aVar : new BufferedInputStream(aVar, 4096);
        this.f366459h = 1024;
    }

    public final void a(long j12) throws IOException {
        if (this.f366454c > this.f366456e || j12 < this.f366455d) {
            throw new IOException("Cannot reset");
        }
        this.f366453b.reset();
        c(this.f366455d, j12);
        this.f366454c = j12;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f366453b.available();
    }

    public final void b(long j12) throws IOException {
        try {
            long j13 = this.f366455d;
            long j14 = this.f366454c;
            InputStream inputStream = this.f366453b;
            if (j13 >= j14 || j14 > this.f366456e) {
                this.f366455d = j14;
                inputStream.mark((int) (j12 - j14));
            } else {
                inputStream.reset();
                inputStream.mark((int) (j12 - this.f366455d));
                c(this.f366455d, this.f366454c);
            }
            this.f366456e = j12;
        } catch (IOException e12) {
            throw new IllegalStateException("Unable to mark: " + e12);
        }
    }

    public final void c(long j12, long j13) throws IOException {
        while (j12 < j13) {
            long jSkip = this.f366453b.skip(j13 - j12);
            if (jSkip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j12 += jSkip;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f366453b.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i12) throws IOException {
        long j12 = this.f366454c + i12;
        if (this.f366456e < j12) {
            b(j12);
        }
        this.f366457f = this.f366454c;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f366453b.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (!this.f366458g) {
            long j12 = this.f366454c + 1;
            long j13 = this.f366456e;
            if (j12 > j13) {
                b(j13 + this.f366459h);
            }
        }
        int i12 = this.f366453b.read();
        if (i12 != -1) {
            this.f366454c++;
        }
        return i12;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        a(this.f366457f);
    }

    @Override // java.io.InputStream
    public final long skip(long j12) throws IOException {
        if (!this.f366458g) {
            long j13 = this.f366454c + j12;
            if (j13 > this.f366456e) {
                b(j13 + this.f366459h);
            }
        }
        long jSkip = this.f366453b.skip(j12);
        this.f366454c += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        if (!this.f366458g) {
            long j12 = this.f366454c;
            if (bArr.length + j12 > this.f366456e) {
                b(j12 + bArr.length + this.f366459h);
            }
        }
        int i12 = this.f366453b.read(bArr);
        if (i12 != -1) {
            this.f366454c += i12;
        }
        return i12;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        if (!this.f366458g) {
            long j12 = this.f366454c + i13;
            if (j12 > this.f366456e) {
                b(j12 + this.f366459h);
            }
        }
        int i14 = this.f366453b.read(bArr, i12, i13);
        if (i14 != -1) {
            this.f366454c += i14;
        }
        return i14;
    }
}

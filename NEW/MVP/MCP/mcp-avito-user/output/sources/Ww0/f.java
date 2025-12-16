package wW0;

import com.facebook.common.internal.o;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;
import uW0.C48986a;

/* compiled from: PooledByteArrayBufferedInputStream.java */
@J41.c
@Nullsafe
/* loaded from: classes5.dex */
public class f extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final InputStream f441520b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f441521c;

    /* renamed from: d, reason: collision with root package name */
    public final com.facebook.common.references.h<byte[]> f441522d;

    /* renamed from: e, reason: collision with root package name */
    public int f441523e;

    /* renamed from: f, reason: collision with root package name */
    public int f441524f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f441525g;

    public f(InputStream inputStream, byte[] bArr, com.facebook.common.references.h<byte[]> hVar) {
        this.f441520b = inputStream;
        bArr.getClass();
        this.f441521c = bArr;
        hVar.getClass();
        this.f441522d = hVar;
        this.f441523e = 0;
        this.f441524f = 0;
        this.f441525g = false;
    }

    public final void a() throws IOException {
        if (this.f441525g) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        o.d(this.f441524f <= this.f441523e);
        a();
        return this.f441520b.available() + (this.f441523e - this.f441524f);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f441525g) {
            return;
        }
        this.f441525g = true;
        this.f441522d.a(this.f441521c);
        super.close();
    }

    public final void finalize() throws Throwable {
        if (!this.f441525g) {
            C48986a.b("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        o.d(this.f441524f <= this.f441523e);
        a();
        int i12 = this.f441524f;
        int i13 = this.f441523e;
        byte[] bArr = this.f441521c;
        if (i12 >= i13) {
            int i14 = this.f441520b.read(bArr);
            if (i14 <= 0) {
                return -1;
            }
            this.f441523e = i14;
            this.f441524f = 0;
        }
        int i15 = this.f441524f;
        this.f441524f = i15 + 1;
        return bArr[i15] & 255;
    }

    @Override // java.io.InputStream
    public final long skip(long j12) throws IOException {
        o.d(this.f441524f <= this.f441523e);
        a();
        int i12 = this.f441523e;
        int i13 = this.f441524f;
        long j13 = i12 - i13;
        if (j13 >= j12) {
            this.f441524f = (int) (i13 + j12);
            return j12;
        }
        this.f441524f = i12;
        return this.f441520b.skip(j12 - j13) + j13;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        o.d(this.f441524f <= this.f441523e);
        a();
        int i14 = this.f441524f;
        int i15 = this.f441523e;
        byte[] bArr2 = this.f441521c;
        if (i14 >= i15) {
            int i16 = this.f441520b.read(bArr2);
            if (i16 <= 0) {
                return -1;
            }
            this.f441523e = i16;
            this.f441524f = 0;
        }
        int iMin = Math.min(this.f441523e - this.f441524f, i13);
        System.arraycopy(bArr2, this.f441524f, bArr, i12, iMin);
        this.f441524f += iMin;
        return iMin;
    }
}

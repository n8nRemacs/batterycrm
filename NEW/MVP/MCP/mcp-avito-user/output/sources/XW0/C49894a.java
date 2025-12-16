package xW0;

import com.facebook.infer.annotation.Nullsafe;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: LimitedInputStream.java */
@Nullsafe
/* renamed from: xW0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C49894a extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public int f442520b;

    /* renamed from: c, reason: collision with root package name */
    public int f442521c;

    public C49894a(InputStream inputStream, int i12) {
        super(inputStream);
        if (i12 < 0) {
            throw new IllegalArgumentException("limit must be >= 0");
        }
        this.f442520b = i12;
        this.f442521c = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(((FilterInputStream) this).in.available(), this.f442520b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i12) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i12);
            this.f442521c = this.f442520b;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f442520b == 0) {
            return -1;
        }
        int i12 = ((FilterInputStream) this).in.read();
        if (i12 != -1) {
            this.f442520b--;
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        if (this.f442521c == -1) {
            throw new IOException("mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f442520b = this.f442521c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j12) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j12, this.f442520b));
        this.f442520b = (int) (this.f442520b - jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        int i14 = this.f442520b;
        if (i14 == 0) {
            return -1;
        }
        int i15 = ((FilterInputStream) this).in.read(bArr, i12, Math.min(i13, i14));
        if (i15 > 0) {
            this.f442520b -= i15;
        }
        return i15;
    }
}

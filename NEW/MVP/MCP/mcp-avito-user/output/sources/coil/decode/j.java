package coil.decode;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;

/* compiled from: ExifUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/decode/j;", "Ljava/io/InputStream;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class j extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InputStream f58296b;

    /* renamed from: c, reason: collision with root package name */
    public int f58297c = 1073741824;

    public j(@Y61.k InputStream inputStream) {
        this.f58296b = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f58297c;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f58296b.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i12 = this.f58296b.read();
        if (i12 == -1) {
            this.f58297c = 0;
        }
        return i12;
    }

    @Override // java.io.InputStream
    public final long skip(long j12) {
        return this.f58296b.skip(j12);
    }

    @Override // java.io.InputStream
    public final int read(@Y61.k byte[] bArr) throws IOException {
        int i12 = this.f58296b.read(bArr);
        if (i12 == -1) {
            this.f58297c = 0;
        }
        return i12;
    }

    @Override // java.io.InputStream
    public final int read(@Y61.k byte[] bArr, int i12, int i13) throws IOException {
        int i14 = this.f58296b.read(bArr, i12, i13);
        if (i14 == -1) {
            this.f58297c = 0;
        }
        return i14;
    }
}

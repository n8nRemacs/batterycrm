package kotlin.io.encoding;

import Y61.k;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;

/* compiled from: Base64IOStream.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/encoding/d;", "Ljava/io/OutputStream;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@e
/* loaded from: classes8.dex */
final class d extends OutputStream {
    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        throw new IOException("The output stream is closed.");
    }

    @Override // java.io.OutputStream
    public final void write(int i12) throws IOException {
        throw new IOException("The output stream is closed.");
    }

    @Override // java.io.OutputStream
    public final void write(@k byte[] bArr, int i12, int i13) throws IOException {
        throw new IOException("The output stream is closed.");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

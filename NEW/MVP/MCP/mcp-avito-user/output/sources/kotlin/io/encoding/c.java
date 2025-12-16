package kotlin.io.encoding;

import Y61.k;
import androidx.appcompat.app.r;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;

/* compiled from: Base64IOStream.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/encoding/c;", "Ljava/io/InputStream;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@e
/* loaded from: classes8.dex */
final class c extends InputStream {
    @Override // java.io.InputStream
    public final int read() throws IOException {
        read(null, 0, 1);
        throw null;
    }

    @Override // java.io.InputStream
    public final int read(@k byte[] bArr, int i12, int i13) throws IOException {
        if (i12 >= 0 && i13 >= 0 && i12 + i13 <= bArr.length) {
            throw new IOException("The input stream is closed.");
        }
        StringBuilder sbY = r.y(i12, i13, "offset: ", ", length: ", ", buffer size: ");
        sbY.append(bArr.length);
        throw new IndexOutOfBoundsException(sbY.toString());
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

package io.ktor.utils.io.streams;

import Y61.k;
import io.ktor.utils.io.core.G;
import java.io.OutputStream;
import kotlin.Metadata;

/* compiled from: Streams.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/streams/g;", "Ljava/io/OutputStream;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class g extends OutputStream {
    @Override // java.io.OutputStream
    public final void write(int i12) {
        throw null;
    }

    @Override // java.io.OutputStream
    public final void write(@k byte[] bArr, int i12, int i13) {
        G.b(null, bArr, i12, i13);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

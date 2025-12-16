package io.ktor.utils.io.streams;

import Y61.k;
import java.io.Reader;
import kotlin.Metadata;

/* compiled from: Streams.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/streams/h;", "Ljava/io/Reader;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class h extends Reader {
    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.io.Reader
    public final int read(@k char[] cArr, int i12, int i13) {
        throw null;
    }

    @Override // java.io.Reader
    public final long skip(long j12) {
        if (0 >= j12) {
            return 0L;
        }
        Math.min(8192, j12);
        throw null;
    }
}

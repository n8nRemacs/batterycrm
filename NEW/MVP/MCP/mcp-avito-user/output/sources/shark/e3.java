package shark;

import java.io.IOException;
import kotlin.Metadata;
import okio.C44802l;

/* compiled from: RandomAccessSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/e3;", "Lokio/e0;", "shark-hprof"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class e3 implements okio.e0 {
    @Override // okio.e0
    public final long read(@Y61.k C44802l c44802l, long j12) throws IOException {
        throw new IOException("Source closed");
    }

    @Override // okio.e0
    /* renamed from: timeout */
    public final okio.i0 getF420025c() {
        return okio.i0.NONE;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

package okio;

import com.avito.android.remote.model.AdvertStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CipherSink.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/p;", "Lokio/c0;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: okio.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C44806p implements c0 {
    @Override // okio.c0, java.io.Flushable
    public final void flush() {
        throw null;
    }

    @Override // okio.c0
    @Y61.k
    /* renamed from: timeout */
    public final i0 getF420032c() {
        throw null;
    }

    @Override // okio.c0
    public final void write(@Y61.k C44802l c44802l, long j12) {
        C44799i.b(c44802l.f420125c, 0L, j12);
        throw new IllegalStateException(AdvertStatus.CLOSED);
    }

    @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

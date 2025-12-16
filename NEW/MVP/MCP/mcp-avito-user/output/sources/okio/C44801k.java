package okio;

import kotlin.Metadata;

/* compiled from: Okio.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokio/k;", "Lokio/c0;", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: okio.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C44801k implements c0 {
    @Override // okio.c0
    @Y61.k
    /* renamed from: timeout */
    public final i0 getF420032c() {
        return i0.NONE;
    }

    @Override // okio.c0
    public final void write(@Y61.k C44802l c44802l, long j12) {
        c44802l.skip(j12);
    }

    @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okio.c0, java.io.Flushable
    public final void flush() {
    }
}

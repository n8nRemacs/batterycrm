package okio;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JvmOkio.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/Q;", "Lokio/c0;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class Q implements c0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final OutputStream f420031b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final i0 f420032c;

    public Q(@Y61.k OutputStream outputStream, @Y61.k i0 i0Var) {
        this.f420031b = outputStream;
        this.f420032c = i0Var;
    }

    @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f420031b.close();
    }

    @Override // okio.c0, java.io.Flushable
    public final void flush() throws IOException {
        this.f420031b.flush();
    }

    @Override // okio.c0
    @Y61.k
    /* renamed from: timeout, reason: from getter */
    public final i0 getF420032c() {
        return this.f420032c;
    }

    @Y61.k
    public final String toString() {
        return "sink(" + this.f420031b + ')';
    }

    @Override // okio.c0
    public final void write(@Y61.k C44802l c44802l, long j12) throws IOException {
        C44799i.b(c44802l.f420125c, 0L, j12);
        while (j12 > 0) {
            this.f420032c.throwIfReached();
            Z z12 = c44802l.f420124b;
            int iMin = (int) Math.min(j12, z12.f420052c - z12.f420051b);
            this.f420031b.write(z12.f420050a, z12.f420051b, iMin);
            int i12 = z12.f420051b + iMin;
            z12.f420051b = i12;
            long j13 = iMin;
            j12 -= j13;
            c44802l.f420125c -= j13;
            if (i12 == z12.f420052c) {
                c44802l.f420124b = z12.a();
                a0.a(z12);
            }
        }
    }
}

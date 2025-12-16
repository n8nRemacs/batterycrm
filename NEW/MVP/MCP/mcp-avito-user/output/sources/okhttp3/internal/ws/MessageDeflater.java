package okhttp3.internal.ws;

import Y61.k;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.io.c;
import okio.C44799i;
import okio.C44802l;
import okio.C44805o;
import okio.X;
import okio.r;

/* compiled from: MessageDeflater.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lokio/l;", "Lokio/o;", "suffix", "endsWith", "(Lokio/l;Lokio/o;)Z", "buffer", "Lkotlin/G0;", "deflate", "(Lokio/l;)V", "close", "()V", "Z", "deflatedBytes", "Lokio/l;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "Lokio/r;", "deflaterSink", "Lokio/r;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MessageDeflater implements Closeable {

    @k
    private final C44802l deflatedBytes;

    @k
    private final Deflater deflater;

    @k
    private final r deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z12) {
        this.noContextTakeover = z12;
        C44802l c44802l = new C44802l();
        this.deflatedBytes = c44802l;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new r(new X(c44802l), deflater);
    }

    private final boolean endsWith(C44802l c44802l, C44805o c44805o) {
        return c44802l.F0(c44802l.f420125c - c44805o.d(), c44805o);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.deflaterSink.close();
    }

    public final void deflate(@k C44802l buffer) throws IOException {
        if (this.deflatedBytes.f420125c != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(buffer, buffer.f420125c);
        this.deflaterSink.flush();
        if (endsWith(this.deflatedBytes, MessageDeflaterKt.EMPTY_DEFLATE_BLOCK)) {
            C44802l c44802l = this.deflatedBytes;
            long j12 = c44802l.f420125c - 4;
            C44802l.a aVarP = c44802l.p(C44799i.f420068a);
            try {
                aVarP.a(j12);
                c.a(aVarP, null);
            } finally {
            }
        } else {
            this.deflatedBytes.D(0);
        }
        C44802l c44802l2 = this.deflatedBytes;
        buffer.write(c44802l2, c44802l2.f420125c);
    }
}

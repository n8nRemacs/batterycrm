package okio;

import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: ForwardingSink.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0002\u0010\u0016¨\u0006\u0018"}, d2 = {"Lokio/y;", "Lokio/c0;", "delegate", "<init>", "(Lokio/c0;)V", "Lokio/l;", SearchParamsConverterKt.SOURCE, "", "byteCount", "Lkotlin/G0;", "write", "(Lokio/l;J)V", "flush", "()V", "Lokio/i0;", "timeout", "()Lokio/i0;", "close", "", "toString", "()Ljava/lang/String;", "-deprecated_delegate", "()Lokio/c0;", "Lokio/c0;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: okio.y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC44814y implements c0 {

    @Y61.k
    private final c0 delegate;

    public AbstractC44814y(@Y61.k c0 c0Var) {
        this.delegate = c0Var;
    }

    @X41.i
    @Y61.k
    @InterfaceC42830m
    /* renamed from: -deprecated_delegate, reason: not valid java name and from getter */
    public final c0 getDelegate() {
        return this.delegate;
    }

    @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @X41.i
    @Y61.k
    public final c0 delegate() {
        return this.delegate;
    }

    @Override // okio.c0, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // okio.c0
    @Y61.k
    public i0 timeout() {
        return this.delegate.timeout();
    }

    @Y61.k
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // okio.c0
    public void write(@Y61.k C44802l source, long byteCount) {
        this.delegate.write(source, byteCount);
    }
}

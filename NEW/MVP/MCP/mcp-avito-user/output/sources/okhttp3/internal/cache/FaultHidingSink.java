package okhttp3.internal.cache;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.io.IOException;
import kotlin.G0;
import kotlin.Metadata;
import okio.AbstractC44814y;
import okio.C44802l;
import okio.c0;

/* compiled from: FaultHidingSink.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Lokio/y;", "Lokio/c0;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "Lkotlin/G0;", "onException", "<init>", "(Lokio/c0;LY41/l;)V", "Lokio/l;", SearchParamsConverterKt.SOURCE, "", "byteCount", "write", "(Lokio/l;J)V", "flush", "()V", "close", "LY41/l;", "getOnException", "()LY41/l;", "", "hasErrors", "Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public class FaultHidingSink extends AbstractC44814y {
    private boolean hasErrors;

    @k
    private final l<IOException, G0> onException;

    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(@k c0 c0Var, @k l<? super IOException, G0> lVar) {
        super(c0Var);
        this.onException = lVar;
    }

    @Override // okio.AbstractC44814y, okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e12) {
            this.hasErrors = true;
            this.onException.invoke(e12);
        }
    }

    @Override // okio.AbstractC44814y, okio.c0, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e12) {
            this.hasErrors = true;
            this.onException.invoke(e12);
        }
    }

    @k
    public final l<IOException, G0> getOnException() {
        return this.onException;
    }

    @Override // okio.AbstractC44814y, okio.c0
    public void write(@k C44802l source, long byteCount) {
        if (this.hasErrors) {
            source.skip(byteCount);
            return;
        }
        try {
            super.write(source, byteCount);
        } catch (IOException e12) {
            this.hasErrors = true;
            this.onException.invoke(e12);
        }
    }
}

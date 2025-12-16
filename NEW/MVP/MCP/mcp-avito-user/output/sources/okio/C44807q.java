package okio;

import androidx.compose.foundation.text.selection.C21030p;
import com.avito.android.remote.model.AdvertStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CipherSource.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/q;", "Lokio/e0;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: okio.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C44807q implements e0 {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // okio.e0
    public final long read(@Y61.k C44802l c44802l, long j12) {
        if (j12 >= 0) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        throw new IllegalArgumentException(C21030p.a(j12, "byteCount < 0: ").toString());
    }

    @Override // okio.e0
    @Y61.k
    /* renamed from: timeout */
    public final i0 getF420025c() {
        throw null;
    }
}

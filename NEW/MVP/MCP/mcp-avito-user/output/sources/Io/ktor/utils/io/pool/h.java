package io.ktor.utils.io.pool;

import Y61.k;
import java.io.Closeable;
import kotlin.Metadata;

/* compiled from: Pool.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/utils/io/pool/h;", "", "T", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface h<T> extends Closeable {

    /* compiled from: Pool.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
    }

    void G4(@k T t12);

    @k
    T S2();
}

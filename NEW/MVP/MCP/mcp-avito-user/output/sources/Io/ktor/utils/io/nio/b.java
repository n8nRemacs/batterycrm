package io.ktor.utils.io.nio;

import V31.h;
import Y61.k;
import io.ktor.utils.io.core.E;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* compiled from: Output.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/nio/b;", "Lio/ktor/utils/io/core/E;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class b extends E {
    @Override // io.ktor.utils.io.core.E
    public final void i() {
        throw null;
    }

    @Override // io.ktor.utils.io.core.E
    public final void j(@k ByteBuffer byteBuffer, int i12, int i13) {
        if (h.c(byteBuffer, i12, i13).hasRemaining()) {
            throw null;
        }
    }
}

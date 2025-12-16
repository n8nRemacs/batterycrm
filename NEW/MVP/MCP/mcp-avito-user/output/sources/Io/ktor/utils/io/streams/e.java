package io.ktor.utils.io.streams;

import Y61.k;
import io.ktor.utils.io.core.E;
import io.ktor.utils.io.streams.a;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* compiled from: Output.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/streams/e;", "Lio/ktor/utils/io/core/E;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class e extends E {
    @Override // io.ktor.utils.io.core.E
    public final void i() {
        throw null;
    }

    @Override // io.ktor.utils.io.core.E
    public final void j(@k ByteBuffer byteBuffer, int i12, int i13) {
        if (byteBuffer.hasArray() && !byteBuffer.isReadOnly()) {
            byteBuffer.array();
            byteBuffer.arrayOffset();
            throw null;
        }
        a.C11428a c11428a = a.f401296a;
        byte[] bArrS2 = c11428a.S2();
        ByteBuffer byteBufferC = V31.h.c(byteBuffer, i12, i13);
        try {
            int iMin = Math.min(byteBufferC.remaining(), bArrS2.length);
            if (iMin == 0) {
                c11428a.G4(bArrS2);
            } else {
                byteBufferC.get(bArrS2, 0, iMin);
                throw null;
            }
        } catch (Throwable th2) {
            a.f401296a.G4(bArrS2);
            throw th2;
        }
    }
}

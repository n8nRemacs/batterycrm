package io.ktor.utils.io.streams;

import Y61.k;
import io.ktor.utils.io.core.x;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Input.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/streams/c;", "Lio/ktor/utils/io/core/x;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class c extends x {
    @Override // io.ktor.utils.io.core.x
    public final void b() {
        throw null;
    }

    @Override // io.ktor.utils.io.core.x
    public final int j(@k ByteBuffer byteBuffer, int i12, int i13) {
        if (byteBuffer.hasArray() && !byteBuffer.isReadOnly()) {
            byteBuffer.array();
            byteBuffer.arrayOffset();
            throw null;
        }
        byte[] bArrS2 = a.f401296a.S2();
        try {
            Math.min(bArrS2.length, i13);
            throw null;
        } catch (Throwable th2) {
            a.f401296a.G4(bArrS2);
            throw th2;
        }
    }
}

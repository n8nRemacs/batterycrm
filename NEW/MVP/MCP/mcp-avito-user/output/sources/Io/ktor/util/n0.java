package io.ktor.util;

import java.nio.ByteBuffer;
import kotlin.Metadata;

/* compiled from: NIO.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class n0 {
    public static final int a(@Y61.k ByteBuffer byteBuffer, @Y61.k ByteBuffer byteBuffer2, int i12) {
        int iMin = Math.min(i12, Math.min(byteBuffer.remaining(), byteBuffer2.remaining()));
        if (iMin == byteBuffer.remaining()) {
            byteBuffer2.put(byteBuffer);
        } else {
            int iLimit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + iMin);
            byteBuffer2.put(byteBuffer);
            byteBuffer.limit(iLimit);
        }
        return iMin;
    }
}

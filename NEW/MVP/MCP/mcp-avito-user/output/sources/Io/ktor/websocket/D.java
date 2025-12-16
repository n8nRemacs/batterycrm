package io.ktor.websocket;

import java.nio.ByteBuffer;
import kotlin.Metadata;

@Metadata(d1 = {"io/ktor/websocket/E", "io/ktor/websocket/F"}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class D {
    public static final void a(@Y61.k ByteBuffer byteBuffer, @Y61.k ByteBuffer byteBuffer2) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
        int iRemaining = byteBufferSlice2.remaining();
        int iRemaining2 = byteBufferSlice.remaining();
        for (int i12 = 0; i12 < iRemaining2; i12++) {
            byteBufferSlice.put(i12, (byte) (byteBufferSlice.get(i12) ^ byteBufferSlice2.get(i12 % iRemaining)));
        }
    }
}

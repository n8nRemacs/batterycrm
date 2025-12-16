package V31;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MemoryJvm.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class h {
    public static final void a(@Y61.k ByteBuffer byteBuffer, @Y61.k ByteBuffer byteBuffer2, int i12) {
        int iRemaining = byteBuffer2.remaining();
        if (byteBuffer.hasArray() && !byteBuffer.isReadOnly() && byteBuffer2.hasArray() && !byteBuffer2.isReadOnly()) {
            int iPosition = byteBuffer2.position();
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i12, byteBuffer2.array(), byteBuffer2.arrayOffset() + iPosition, iRemaining);
            byteBuffer2.position(iPosition + iRemaining);
        } else {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.limit(iRemaining + i12);
            byteBufferDuplicate.position(i12);
            byteBuffer2.put(byteBufferDuplicate);
        }
    }

    public static final void b(@Y61.k ByteBuffer byteBuffer, @Y61.k ByteBuffer byteBuffer2, int i12) {
        if (!byteBuffer.hasArray() || byteBuffer.isReadOnly()) {
            c(byteBuffer2, i12, byteBuffer.remaining()).put(byteBuffer);
            return;
        }
        byte[] bArrArray = byteBuffer.array();
        int iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
        int iRemaining = byteBuffer.remaining();
        e.b(ByteBuffer.wrap(bArrArray, iPosition, iRemaining).slice().order(ByteOrder.BIG_ENDIAN), byteBuffer2, 0, iRemaining, i12);
        byteBuffer.position(byteBuffer.limit());
    }

    @Y61.k
    public static final ByteBuffer c(@Y61.k ByteBuffer byteBuffer, int i12, int i13) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i12);
        byteBufferDuplicate.limit(i12 + i13);
        return byteBufferDuplicate.slice();
    }
}

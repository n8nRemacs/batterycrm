package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import tech.kwik.core.generic.InvalidIntegerEncodingException;

/* loaded from: classes3.dex */
public final class sne extends tei {
    public final HashMap b;

    public sne() {
        HashMap map = new HashMap();
        this.b = map;
        long j = 0;
        map.put(1L, Long.valueOf(j));
        map.put(7L, Long.valueOf(j));
        map.put(8L, 0L);
    }

    public final ByteBuffer i() {
        HashMap map = this.b;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(map.size() * 16);
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(new as(7, byteBufferAllocate));
        int iPosition = byteBufferAllocate.position();
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(epi.a(iPosition) + 1 + iPosition);
        byteBufferAllocate2.put((byte) 4);
        epi.b(iPosition, byteBufferAllocate2);
        byteBufferAllocate2.put(byteBufferAllocate.array(), 0, iPosition);
        return byteBufferAllocate2;
    }

    public final void j(ByteBuffer byteBuffer) throws IOException {
        while (byteBuffer.remaining() > 0) {
            try {
                this.b.put(Long.valueOf(epi.i(byteBuffer)), Long.valueOf(epi.i(byteBuffer)));
            } catch (InvalidIntegerEncodingException e) {
                throw new IOException(e);
            }
        }
    }
}

package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class u0f extends rn5 {
    public List a;

    @Override // defpackage.rn5
    public final byte[] a() {
        List list = this.a;
        int size = list.size() * 2;
        int i = size + 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 6);
        byteBufferAllocate.putShort(kbg.signature_algorithms.a);
        byteBufferAllocate.putShort((short) i);
        byteBufferAllocate.putShort((short) (list.size() * 2));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.putShort(((obg) it.next()).a);
        }
        return byteBufferAllocate.array();
    }
}

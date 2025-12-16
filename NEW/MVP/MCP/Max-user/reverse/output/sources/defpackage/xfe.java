package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class xfe extends g7c {
    public int a;

    @Override // defpackage.rn5
    public final byte[] a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.putShort(kbg.pre_shared_key.a);
        byteBufferAllocate.putShort((short) 2);
        byteBufferAllocate.putShort((short) this.a);
        return byteBufferAllocate.array();
    }
}

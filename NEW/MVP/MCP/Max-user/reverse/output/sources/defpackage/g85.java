package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class g85 extends rn5 {
    public Long a;

    @Override // defpackage.rn5
    public final byte[] a() {
        Long l = this.a;
        int i = l == null ? 0 : 4;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + 4);
        byteBufferAllocate.putShort(kbg.early_data.a);
        byteBufferAllocate.putShort((short) i);
        if (l != null) {
            byteBufferAllocate.putInt((int) l.longValue());
        }
        return byteBufferAllocate.array();
    }

    public final String toString() {
        String str;
        Long l = this.a;
        if (l == null) {
            str = "(empty)";
        } else {
            str = "[" + l + "]";
        }
        return wy1.h("EarlyDataExtension ", str);
    }
}

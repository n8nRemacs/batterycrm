package defpackage;

import java.nio.ByteBuffer;
import tech.kwik.agent15.alert.DecodeErrorException;

/* loaded from: classes.dex */
public final class cha extends h07 {
    public long a;
    public byte[] b;
    public byte[] c;
    public int d;
    public g85 e;

    public static byte[] e(String str, ByteBuffer byteBuffer, int i, int i2) throws DecodeErrorException {
        if (i2 < i) {
            throw new DecodeErrorException("No length specified for ".concat(str));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 << 8) | (byteBuffer.get() & 255);
        }
        if (i2 - i < i3) {
            throw new DecodeErrorException("Message too short for given length of ".concat(str));
        }
        byte[] bArr = new byte[i3];
        byteBuffer.get(bArr);
        return bArr;
    }

    @Override // defpackage.h07
    public final byte[] a() {
        g85 g85Var = this.e;
        int length = g85Var != null ? g85Var.a().length : 0;
        int length2 = this.c.length + 11 + this.b.length + 2 + length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2 + 4);
        byteBufferAllocate.putInt(length2 | (lbg.new_session_ticket.a << 24));
        byteBufferAllocate.putInt(this.d);
        byteBufferAllocate.putInt((int) this.a);
        byteBufferAllocate.put((byte) this.c.length);
        byteBufferAllocate.put(this.c);
        byteBufferAllocate.putShort((short) this.b.length);
        byteBufferAllocate.put(this.b);
        byteBufferAllocate.putShort((short) length);
        g85 g85Var2 = this.e;
        if (g85Var2 != null) {
            byteBufferAllocate.put(g85Var2.a());
        }
        return byteBufferAllocate.array();
    }

    @Override // defpackage.h07
    public final lbg b() {
        return lbg.new_session_ticket;
    }
}

package defpackage;

import java.nio.ByteBuffer;
import tech.kwik.agent15.alert.DecodeErrorException;

/* loaded from: classes.dex */
public final class urf extends rn5 {
    public final lbg a;
    public final short b;

    public urf(lbg lbgVar) {
        this.a = lbgVar;
        this.b = (short) 772;
    }

    @Override // defpackage.rn5
    public final byte[] a() {
        lbg lbgVar = lbg.client_hello;
        lbg lbgVar2 = this.a;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(lbgVar2.equals(lbgVar) ? 7 : 6);
        byteBufferAllocate.putShort(kbg.supported_versions.a);
        if (lbgVar2.equals(lbgVar)) {
            byteBufferAllocate.putShort((short) 3);
            byteBufferAllocate.put((byte) 2);
            byteBufferAllocate.put(new byte[]{3, 4});
        } else {
            byteBufferAllocate.putShort((short) 2);
            byteBufferAllocate.put(new byte[]{3, 4});
        }
        return byteBufferAllocate.array();
    }

    public urf(ByteBuffer byteBuffer, lbg lbgVar) throws DecodeErrorException {
        this.a = lbgVar;
        int iB = b(byteBuffer, kbg.supported_versions.a, 2);
        if (lbgVar == lbg.client_hello) {
            int i = byteBuffer.get() & 255;
            if (i % 2 != 0 || iB != i + 1) {
                throw new DecodeErrorException("invalid versions length");
            }
            for (int i2 = 0; i2 < i; i2 += 2) {
                short s = byteBuffer.getShort();
                if (s == 772 || this.b == 0) {
                    this.b = s;
                }
            }
            return;
        }
        if (lbgVar != lbg.server_hello) {
            throw new IllegalArgumentException();
        }
        if (iB == 2) {
            this.b = byteBuffer.getShort();
            return;
        }
        throw new DecodeErrorException("Incorrect extension length");
    }
}

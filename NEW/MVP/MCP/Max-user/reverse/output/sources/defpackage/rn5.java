package defpackage;

import java.nio.ByteBuffer;
import tech.kwik.agent15.alert.DecodeErrorException;

/* loaded from: classes.dex */
public abstract class rn5 {
    public abstract byte[] a();

    public final int b(ByteBuffer byteBuffer, int i, int i2) throws DecodeErrorException {
        if (byteBuffer.limit() - byteBuffer.position() < 4) {
            throw new DecodeErrorException("extension underflow");
        }
        if ((byteBuffer.getShort() & 65535) != i) {
            throw new IllegalStateException();
        }
        int i3 = byteBuffer.getShort() & 65535;
        if (i3 >= i2) {
            if (byteBuffer.limit() - byteBuffer.position() >= i3) {
                return i3;
            }
            throw new DecodeErrorException("extension underflow");
        }
        throw new DecodeErrorException(getClass().getSimpleName() + " can't be less than " + i2 + " bytes");
    }
}

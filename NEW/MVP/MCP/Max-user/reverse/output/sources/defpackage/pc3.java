package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class pc3 implements z42 {
    public final int a;
    public final String b;

    public pc3(InputStream inputStream) throws IOException {
        epi.e(inputStream);
        int iE = epi.e(inputStream);
        byte[] bArr = new byte[iE];
        if (mw0.e(inputStream, bArr, iE) != iE) {
            throw new EOFException("Unexpected end of stream");
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.a = byteBufferWrap.getInt();
        this.b = new String(byteBufferWrap.array(), byteBufferWrap.position(), byteBufferWrap.remaining());
    }

    @Override // defpackage.z42
    public final long getType() {
        return 10307L;
    }

    public final String toString() {
        return String.format("CloseWebtransportSessionCapsule[%d,%s]", Integer.valueOf(this.a), this.b);
    }
}

package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class z9i extends m2e {
    public final int b;
    public final int c;
    public final int d;
    public final ByteBuffer e;

    public z9i(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        byteBufferWrap.get();
        this.b = byteBufferWrap.getShort() & 65535;
        byteBufferWrap.getInt();
        byte b = byteBufferWrap.get();
        int[] iArrY = az1.y(2);
        int length = iArrY.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            int i3 = iArrY[i2];
            byte b2 = 1;
            if (i3 == 1) {
                b2 = 0;
            } else if (i3 != 2) {
                throw null;
            }
            if (b2 == b) {
                i = i3;
                break;
            }
            i2++;
        }
        this.c = i;
        this.d = byteBufferWrap.getShort() & 65535;
        this.a = byteBufferWrap.get();
        this.e = byteBufferWrap.slice();
    }
}

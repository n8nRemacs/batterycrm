package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public enum px0 {
    ;

    public static void a(int i, ByteBuffer byteBuffer) {
        if (i < 0 || i >= byteBuffer.capacity()) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
    }

    public static void c(ByteBuffer byteBuffer, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("lengths must be >= 0");
        }
        if (i2 > 0) {
            a(i, byteBuffer);
            a((i + i2) - 1, byteBuffer);
        }
    }

    public static ByteBuffer d(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder = byteBuffer.order();
        ByteOrder byteOrder = byg.a;
        return byteOrderOrder.equals(byteOrder) ? byteBuffer : byteBuffer.duplicate().order(byteOrder);
    }

    public static int e(int i, ByteBuffer byteBuffer) {
        return ((byteBuffer.get(i + 1) & 255) << 8) | (byteBuffer.get(i) & 255);
    }

    public static void g(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.put(i, (byte) i2);
        byteBuffer.put(i + 1, (byte) (i2 >>> 8));
    }

    public static px0 valueOf(String str) {
        u45.r(Enum.valueOf(px0.class, str));
        throw null;
    }
}

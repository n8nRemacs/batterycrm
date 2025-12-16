package org.webrtc;

import androidx.compose.foundation.H;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class YuvHelper {
    public static void ABGRToI420(ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, ByteBuffer byteBuffer4, int i15, int i16, int i17) {
        nativeABGRToI420((ByteBuffer) checkNotNull(byteBuffer, "src"), i12, (ByteBuffer) checkNotNull(byteBuffer2, "dstY"), i13, (ByteBuffer) checkNotNull(byteBuffer3, "dstU"), i14, (ByteBuffer) checkNotNull(byteBuffer4, "dstV"), i15, i16, i17);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, ByteBuffer byteBuffer4, int i15, int i16, int i17, int i18, int i19, int i22) {
        int i23 = (i16 + 1) / 2;
        int i24 = i17 * i16;
        int i25 = i17 * i18;
        int i26 = (i19 * i23) + i25;
        int i27 = (i19 * i22) + i25;
        int i28 = ((i23 - 1) * i19) + i27 + ((i15 + 1) / 2);
        if (byteBuffer4.capacity() < i28) {
            throw new IllegalArgumentException(H.j(i28, byteBuffer4.capacity(), "Expected destination buffer capacity to be at least ", " was "));
        }
        ByteBuffer byteBufferSlice = byteBuffer4.slice();
        ByteBuffer byteBufferSlice2 = byteBuffer4.slice();
        I420Copy(byteBuffer, i12, byteBuffer2, i13, byteBuffer3, i14, byteBufferSlice, i17, byteBufferSlice2, i19, byteBuffer4.slice(), i19, i15, i16);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, ByteBuffer byteBuffer4, int i15, int i16, int i17) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dst");
        int i18 = i17 % 180;
        int i19 = i18 == 0 ? i15 : i16;
        int i22 = i18 == 0 ? i16 : i15;
        int i23 = (i22 + 1) / 2;
        int i24 = (i19 + 1) / 2;
        int i25 = i22 * i19;
        int i26 = i23 * i24;
        int i27 = (i26 * 2) + i25;
        if (byteBuffer4.capacity() < i27) {
            throw new IllegalArgumentException(H.j(i27, byteBuffer4.capacity(), "Expected destination buffer capacity to be at least ", " was "));
        }
        int i28 = i26 + i25;
        ByteBuffer byteBufferSlice = byteBuffer4.slice();
        ByteBuffer byteBufferSlice2 = byteBuffer4.slice();
        nativeI420Rotate(byteBuffer, i12, byteBuffer2, i13, byteBuffer3, i14, byteBufferSlice, i19, byteBufferSlice2, i24, byteBuffer4.slice(), i24, i15, i16, i17);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, ByteBuffer byteBuffer4, int i15, int i16, int i17, int i18) {
        int i19 = (i15 + 1) / 2;
        int i22 = i17 * i16;
        int i23 = i17 * i18;
        int i24 = (((i16 + 1) / 2) * i19 * 2) + i23;
        if (byteBuffer4.capacity() < i24) {
            throw new IllegalArgumentException(H.j(i24, byteBuffer4.capacity(), "Expected destination buffer capacity to be at least ", " was "));
        }
        ByteBuffer byteBufferSlice = byteBuffer4.slice();
        I420ToNV12(byteBuffer, i12, byteBuffer2, i13, byteBuffer3, i14, byteBufferSlice, i17, byteBuffer4.slice(), i19 * 2, i15, i16);
    }

    private static <T> T checkNotNull(T t12, String str) {
        if (t12 != null) {
            return t12;
        }
        throw new NullPointerException(androidx.appcompat.app.r.q(str, " should not be null"));
    }

    public static void copyPlane(ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, int i14, int i15) {
        nativeCopyPlane((ByteBuffer) checkNotNull(byteBuffer, "src"), i12, (ByteBuffer) checkNotNull(byteBuffer2, "dst"), i13, i14, i15);
    }

    private static native void nativeABGRToI420(ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, ByteBuffer byteBuffer4, int i15, int i16, int i17);

    private static native void nativeCopyPlane(ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, int i14, int i15);

    private static native void nativeI420Copy(ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, ByteBuffer byteBuffer4, int i15, ByteBuffer byteBuffer5, int i16, ByteBuffer byteBuffer6, int i17, int i18, int i19);

    private static native void nativeI420Rotate(ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, ByteBuffer byteBuffer4, int i15, ByteBuffer byteBuffer5, int i16, ByteBuffer byteBuffer6, int i17, int i18, int i19, int i22);

    private static native void nativeI420ToNV12(ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, ByteBuffer byteBuffer4, int i15, ByteBuffer byteBuffer5, int i16, int i17, int i18);

    public static void I420ToNV12(ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, ByteBuffer byteBuffer4, int i15, int i16) {
        I420ToNV12(byteBuffer, i12, byteBuffer2, i13, byteBuffer3, i14, byteBuffer4, i15, i16, i15, i16);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, ByteBuffer byteBuffer4, int i15, ByteBuffer byteBuffer5, int i16, int i17, int i18) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dstY");
        checkNotNull(byteBuffer5, "dstUV");
        if (i17 > 0 && i18 > 0) {
            nativeI420ToNV12(byteBuffer, i12, byteBuffer2, i13, byteBuffer3, i14, byteBuffer4, i15, byteBuffer5, i16, i17, i18);
            return;
        }
        throw new IllegalArgumentException("I420ToNV12: width and height should not be negative");
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, ByteBuffer byteBuffer4, int i15, int i16) {
        I420Copy(byteBuffer, i12, byteBuffer2, i13, byteBuffer3, i14, byteBuffer4, i15, i16, i15, i16, (i15 + 1) / 2, (i16 + 1) / 2);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, ByteBuffer byteBuffer4, int i15, int i16, int i17, int i18) {
        I420Copy(byteBuffer, i12, byteBuffer2, i13, byteBuffer3, i14, byteBuffer4, i15, i16, i17, i18, (i17 + 1) / 2, (i18 + 1) / 2);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, ByteBuffer byteBuffer4, int i15, ByteBuffer byteBuffer5, int i16, ByteBuffer byteBuffer6, int i17, int i18, int i19) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dstY");
        checkNotNull(byteBuffer5, "dstU");
        checkNotNull(byteBuffer6, "dstV");
        if (i18 > 0 && i19 > 0) {
            nativeI420Copy(byteBuffer, i12, byteBuffer2, i13, byteBuffer3, i14, byteBuffer4, i15, byteBuffer5, i16, byteBuffer6, i17, i18, i19);
            return;
        }
        throw new IllegalArgumentException("I420Copy: width and height should not be negative");
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, ByteBuffer byteBuffer4, int i15, ByteBuffer byteBuffer5, int i16, ByteBuffer byteBuffer6, int i17, int i18, int i19, int i22) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dstY");
        checkNotNull(byteBuffer5, "dstU");
        checkNotNull(byteBuffer6, "dstV");
        nativeI420Rotate(byteBuffer, i12, byteBuffer2, i13, byteBuffer3, i14, byteBuffer4, i15, byteBuffer5, i16, byteBuffer6, i17, i18, i19, i22);
    }
}

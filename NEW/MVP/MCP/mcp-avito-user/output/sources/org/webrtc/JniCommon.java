package org.webrtc;

import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class JniCommon {
    public static native void nativeAddRef(long j12);

    public static native ByteBuffer nativeAllocateByteBuffer(int i12);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j12);
}

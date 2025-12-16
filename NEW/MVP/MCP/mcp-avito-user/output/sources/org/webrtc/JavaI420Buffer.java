package org.webrtc;

import androidx.compose.foundation.H;
import j.P;
import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* loaded from: classes9.dex */
public class JavaI420Buffer implements VideoFrame.I420Buffer {
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    private JavaI420Buffer(int i12, int i13, ByteBuffer byteBuffer, int i14, ByteBuffer byteBuffer2, int i15, ByteBuffer byteBuffer3, int i16, @P Runnable runnable) {
        this.width = i12;
        this.height = i13;
        this.dataY = byteBuffer;
        this.dataU = byteBuffer2;
        this.dataV = byteBuffer3;
        this.strideY = i14;
        this.strideU = i15;
        this.strideV = i16;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public static JavaI420Buffer allocate(int i12, int i13) {
        int i14 = (i13 + 1) / 2;
        int i15 = (i12 + 1) / 2;
        int i16 = i12 * i13;
        int i17 = i15 * i14;
        int i18 = i16 + i17;
        ByteBuffer byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i15 * 2 * i14) + i16);
        ByteBuffer byteBufferSlice = byteBufferNativeAllocateByteBuffer.slice();
        ByteBuffer byteBufferSlice2 = byteBufferNativeAllocateByteBuffer.slice();
        return new JavaI420Buffer(i12, i13, byteBufferSlice, i12, byteBufferSlice2, i15, byteBufferNativeAllocateByteBuffer.slice(), i15, new k(byteBufferNativeAllocateByteBuffer, 0));
    }

    private static void checkCapacity(ByteBuffer byteBuffer, int i12, int i13, int i14) {
        int iB2 = H.b(i13, 1, i14, i12);
        if (byteBuffer.capacity() < iB2) {
            throw new IllegalArgumentException(H.j(iB2, byteBuffer.capacity(), "Buffer must be at least ", " bytes, but was "));
        }
    }

    public static VideoFrame.Buffer cropAndScaleI420(VideoFrame.I420Buffer i420Buffer, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i14 != i16 || i15 != i17) {
            JavaI420Buffer javaI420BufferAllocate = allocate(i16, i17);
            nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i12, i13, i14, i15, javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV(), i16, i17);
            return javaI420BufferAllocate;
        }
        ByteBuffer dataY = i420Buffer.getDataY();
        ByteBuffer dataU = i420Buffer.getDataU();
        ByteBuffer dataV = i420Buffer.getDataV();
        int i18 = i12 / 2;
        int i19 = i13 / 2;
        i420Buffer.retain();
        return wrap(i16, i17, dataY.slice(), i420Buffer.getStrideY(), dataU.slice(), i420Buffer.getStrideU(), dataV.slice(), i420Buffer.getStrideV(), new c(i420Buffer, 4));
    }

    private static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, int i15, int i16, int i17, int i18, ByteBuffer byteBuffer4, int i19, ByteBuffer byteBuffer5, int i22, ByteBuffer byteBuffer6, int i23, int i24, int i25);

    public static JavaI420Buffer wrap(int i12, int i13, ByteBuffer byteBuffer, int i14, ByteBuffer byteBuffer2, int i15, ByteBuffer byteBuffer3, int i16, @P Runnable runnable) {
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null) {
            throw new IllegalArgumentException("Data buffers cannot be null.");
        }
        if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
        ByteBuffer byteBufferSlice3 = byteBuffer3.slice();
        int i17 = (i12 + 1) / 2;
        int i18 = (i13 + 1) / 2;
        checkCapacity(byteBufferSlice, i12, i13, i14);
        checkCapacity(byteBufferSlice2, i17, i18, i15);
        checkCapacity(byteBufferSlice3, i17, i18, i16);
        return new JavaI420Buffer(i12, i13, byteBufferSlice, i14, byteBufferSlice2, i15, byteBufferSlice3, i16, runnable);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i12, int i13, int i14, int i15, int i16, int i17) {
        return cropAndScaleI420(this, i12, i13, i14, i15, i16, i17);
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.strideU;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.strideV;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.strideY;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }
}

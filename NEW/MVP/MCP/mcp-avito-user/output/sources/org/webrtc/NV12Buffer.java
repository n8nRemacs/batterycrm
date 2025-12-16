package org.webrtc;

import j.P;
import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* loaded from: classes9.dex */
public class NV12Buffer implements VideoFrame.Buffer {
    private final ByteBuffer buffer;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int sliceHeight;
    private final int stride;
    private final int width;

    public NV12Buffer(int i12, int i13, int i14, int i15, ByteBuffer byteBuffer, @P Runnable runnable) {
        this.width = i12;
        this.height = i13;
        this.stride = i14;
        this.sliceHeight = i15;
        this.buffer = byteBuffer;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    private static native void nativeCropAndScale(int i12, int i13, int i14, int i15, int i16, int i17, ByteBuffer byteBuffer, int i18, int i19, int i22, int i23, ByteBuffer byteBuffer2, int i24, ByteBuffer byteBuffer3, int i25, ByteBuffer byteBuffer4, int i26);

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i12, int i13, int i14, int i15, int i16, int i17) {
        JavaI420Buffer javaI420BufferAllocate = JavaI420Buffer.allocate(i16, i17);
        nativeCropAndScale(i12, i13, i14, i15, i16, i17, this.buffer, this.width, this.height, this.stride, this.sliceHeight, javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV());
        return javaI420BufferAllocate;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
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
        int i12 = this.width;
        int i13 = this.height;
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, i12, i13, i12, i13);
    }
}

package org.webrtc;

import j.P;
import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* loaded from: classes9.dex */
public class NV21Buffer implements VideoFrame.Buffer {
    private final byte[] data;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int width;

    public NV21Buffer(byte[] bArr, int i12, int i13, @P Runnable runnable) {
        this.data = bArr;
        this.width = i12;
        this.height = i13;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    private static native void nativeCropAndScale(int i12, int i13, int i14, int i15, int i16, int i17, byte[] bArr, int i18, int i19, ByteBuffer byteBuffer, int i22, ByteBuffer byteBuffer2, int i23, ByteBuffer byteBuffer3, int i24);

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i12, int i13, int i14, int i15, int i16, int i17) {
        JavaI420Buffer javaI420BufferAllocate = JavaI420Buffer.allocate(i16, i17);
        nativeCropAndScale(i12, i13, i14, i15, i16, i17, this.data, this.width, this.height, javaI420BufferAllocate.getDataY(), javaI420BufferAllocate.getStrideY(), javaI420BufferAllocate.getDataU(), javaI420BufferAllocate.getStrideU(), javaI420BufferAllocate.getDataV(), javaI420BufferAllocate.getStrideV());
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

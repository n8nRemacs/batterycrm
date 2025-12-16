package org.webrtc;

import j.P;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class EncodedImage implements RefCounted {
    public final ByteBuffer buffer;
    public final long captureTimeMs;
    public final long captureTimeNs;
    public final int encodedHeight;
    public final int encodedWidth;
    public final FrameType frameType;

    /* renamed from: qp, reason: collision with root package name */
    @P
    public final Integer f422261qp;
    private final RefCountDelegate refCountDelegate;
    public final int rotation;

    public static class Builder {
        private ByteBuffer buffer;
        private long captureTimeNs;
        private int encodedHeight;
        private int encodedWidth;
        private FrameType frameType;

        /* renamed from: qp, reason: collision with root package name */
        @P
        private Integer f422262qp;

        @P
        private Runnable releaseCallback;
        private int rotation;

        public /* synthetic */ Builder(int i12) {
            this();
        }

        public EncodedImage createEncodedImage() {
            return new EncodedImage(this.buffer, this.releaseCallback, this.encodedWidth, this.encodedHeight, this.captureTimeNs, this.frameType, this.rotation, this.f422262qp, 0);
        }

        public Builder setBuffer(ByteBuffer byteBuffer, @P Runnable runnable) {
            this.buffer = byteBuffer;
            this.releaseCallback = runnable;
            return this;
        }

        @Deprecated
        public Builder setCaptureTimeMs(long j12) {
            this.captureTimeNs = TimeUnit.MILLISECONDS.toNanos(j12);
            return this;
        }

        public Builder setCaptureTimeNs(long j12) {
            this.captureTimeNs = j12;
            return this;
        }

        public Builder setEncodedHeight(int i12) {
            this.encodedHeight = i12;
            return this;
        }

        public Builder setEncodedWidth(int i12) {
            this.encodedWidth = i12;
            return this;
        }

        public Builder setFrameType(FrameType frameType) {
            this.frameType = frameType;
            return this;
        }

        public Builder setQp(@P Integer num) {
            this.f422262qp = num;
            return this;
        }

        public Builder setRotation(int i12) {
            this.rotation = i12;
            return this;
        }

        private Builder() {
        }
    }

    public enum FrameType {
        EmptyFrame(0),
        VideoFrameKey(3),
        VideoFrameDelta(4);

        private final int nativeIndex;

        FrameType(int i12) {
            this.nativeIndex = i12;
        }

        @CalledByNative("FrameType")
        public static FrameType fromNativeIndex(int i12) {
            for (FrameType frameType : values()) {
                if (frameType.getNative() == i12) {
                    return frameType;
                }
            }
            throw new IllegalArgumentException(AK.c.g(i12, "Unknown native frame type: "));
        }

        public int getNative() {
            return this.nativeIndex;
        }
    }

    public /* synthetic */ EncodedImage(ByteBuffer byteBuffer, Runnable runnable, int i12, int i13, long j12, FrameType frameType, int i14, Integer num, int i15) {
        this(byteBuffer, runnable, i12, i13, j12, frameType, i14, num);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    @CalledByNative
    private ByteBuffer getBuffer() {
        return this.buffer;
    }

    @CalledByNative
    private long getCaptureTimeNs() {
        return this.captureTimeNs;
    }

    @CalledByNative
    private int getEncodedHeight() {
        return this.encodedHeight;
    }

    @CalledByNative
    private int getEncodedWidth() {
        return this.encodedWidth;
    }

    @CalledByNative
    private int getFrameType() {
        return this.frameType.getNative();
    }

    @CalledByNative
    @P
    private Integer getQp() {
        return this.f422261qp;
    }

    @CalledByNative
    private int getRotation() {
        return this.rotation;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @CalledByNative
    private EncodedImage(ByteBuffer byteBuffer, @P Runnable runnable, int i12, int i13, long j12, FrameType frameType, int i14, @P Integer num) {
        this.buffer = byteBuffer;
        this.encodedWidth = i12;
        this.encodedHeight = i13;
        this.captureTimeMs = TimeUnit.NANOSECONDS.toMillis(j12);
        this.captureTimeNs = j12;
        this.frameType = frameType;
        this.rotation = i14;
        this.f422261qp = num;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }
}

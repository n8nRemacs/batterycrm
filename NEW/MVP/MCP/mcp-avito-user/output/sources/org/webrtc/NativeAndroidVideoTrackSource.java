package org.webrtc;

import j.P;
import org.webrtc.VideoFrame;
import org.webrtc.VideoProcessor;
import org.webrtc.VideoSource;

/* loaded from: classes9.dex */
class NativeAndroidVideoTrackSource {
    private final long nativeAndroidVideoTrackSource;

    public NativeAndroidVideoTrackSource(long j12) {
        this.nativeAndroidVideoTrackSource = j12;
    }

    @CalledByNative
    public static VideoProcessor.FrameAdaptationParameters createFrameAdaptationParameters(int i12, int i13, int i14, int i15, int i16, int i17, long j12, boolean z12) {
        return new VideoProcessor.FrameAdaptationParameters(i12, i13, i14, i15, i16, i17, j12, z12);
    }

    @P
    private static native VideoProcessor.FrameAdaptationParameters nativeAdaptFrame(long j12, int i12, int i13, int i14, long j13);

    private static native void nativeAdaptOutputFormat(long j12, int i12, int i13, @P Integer num, int i14, int i15, @P Integer num2, @P Integer num3);

    private static native void nativeOnFrameCaptured(long j12, int i12, long j13, VideoFrame.Buffer buffer);

    private static native void nativeSetIsScreencast(long j12, boolean z12);

    private static native void nativeSetState(long j12, boolean z12);

    @P
    public VideoProcessor.FrameAdaptationParameters adaptFrame(VideoFrame videoFrame) {
        return nativeAdaptFrame(this.nativeAndroidVideoTrackSource, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs());
    }

    public void adaptOutputFormat(VideoSource.AspectRatio aspectRatio, @P Integer num, VideoSource.AspectRatio aspectRatio2, @P Integer num2, @P Integer num3) {
        nativeAdaptOutputFormat(this.nativeAndroidVideoTrackSource, aspectRatio.width, aspectRatio.height, num, aspectRatio2.width, aspectRatio2.height, num2, num3);
    }

    public void onFrameCaptured(VideoFrame videoFrame) {
        nativeOnFrameCaptured(this.nativeAndroidVideoTrackSource, videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getBuffer());
    }

    public void setIsScreencast(boolean z12) {
        nativeSetIsScreencast(this.nativeAndroidVideoTrackSource, z12);
    }

    public void setState(boolean z12) {
        nativeSetState(this.nativeAndroidVideoTrackSource, z12);
    }
}

package org.webrtc;

import j.P;

/* loaded from: classes9.dex */
public interface VideoProcessor extends CapturerObserver {

    public static class FrameAdaptationParameters {
        public final int cropHeight;
        public final int cropWidth;
        public final int cropX;
        public final int cropY;
        public final boolean drop;
        public final int scaleHeight;
        public final int scaleWidth;
        public final long timestampNs;

        public FrameAdaptationParameters(int i12, int i13, int i14, int i15, int i16, int i17, long j12, boolean z12) {
            this.cropX = i12;
            this.cropY = i13;
            this.cropWidth = i14;
            this.cropHeight = i15;
            this.scaleWidth = i16;
            this.scaleHeight = i17;
            this.timestampNs = j12;
            this.drop = z12;
        }
    }

    @P
    static VideoFrame applyFrameAdaptationParameters(VideoFrame videoFrame, FrameAdaptationParameters frameAdaptationParameters) {
        if (frameAdaptationParameters.drop) {
            return null;
        }
        return new VideoFrame(videoFrame.getBuffer().cropAndScale(frameAdaptationParameters.cropX, frameAdaptationParameters.cropY, frameAdaptationParameters.cropWidth, frameAdaptationParameters.cropHeight, frameAdaptationParameters.scaleWidth, frameAdaptationParameters.scaleHeight), videoFrame.getRotation(), frameAdaptationParameters.timestampNs);
    }

    default void onFrameCaptured(VideoFrame videoFrame, FrameAdaptationParameters frameAdaptationParameters) {
        VideoFrame videoFrameApplyFrameAdaptationParameters = applyFrameAdaptationParameters(videoFrame, frameAdaptationParameters);
        if (videoFrameApplyFrameAdaptationParameters != null) {
            onFrameCaptured(videoFrameApplyFrameAdaptationParameters);
            videoFrameApplyFrameAdaptationParameters.release();
        }
    }

    void setSink(@P VideoSink videoSink);
}

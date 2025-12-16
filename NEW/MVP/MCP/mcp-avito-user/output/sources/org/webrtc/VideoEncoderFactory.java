package org.webrtc;

import j.P;

/* loaded from: classes9.dex */
public interface VideoEncoderFactory {

    public interface VideoEncoderSelector {
        @CalledByNative("VideoEncoderSelector")
        @P
        VideoCodecInfo onAvailableBitrate(int i12);

        @CalledByNative("VideoEncoderSelector")
        void onCurrentEncoder(VideoCodecInfo videoCodecInfo);

        @CalledByNative("VideoEncoderSelector")
        @P
        VideoCodecInfo onEncoderBroken();

        @CalledByNative("VideoEncoderSelector")
        @P
        default VideoCodecInfo onResolutionChange(int i12, int i13) {
            return null;
        }
    }

    @CalledByNative
    @P
    VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo);

    @CalledByNative
    default VideoEncoderSelector getEncoderSelector() {
        return null;
    }

    @CalledByNative
    default VideoCodecInfo[] getImplementations() {
        return getSupportedCodecs();
    }

    @CalledByNative
    VideoCodecInfo[] getSupportedCodecs();
}

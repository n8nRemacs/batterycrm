package org.webrtc;

import j.P;

/* loaded from: classes9.dex */
public interface VideoDecoderFactory {
    @CalledByNative
    @P
    VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo);

    @CalledByNative
    default VideoCodecInfo[] getSupportedCodecs() {
        return new VideoCodecInfo[0];
    }
}

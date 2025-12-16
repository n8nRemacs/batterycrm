package org.webrtc;

import org.webrtc.VideoDecoder;

/* loaded from: classes9.dex */
class VideoDecoderWrapper {
    @CalledByNative
    public static VideoDecoder.Callback createDecoderCallback(long j12) {
        return new t(j12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long j12, VideoFrame videoFrame, Integer num, Integer num2);
}

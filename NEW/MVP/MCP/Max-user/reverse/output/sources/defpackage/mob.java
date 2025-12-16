package defpackage;

import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoEncoderFactory;

/* loaded from: classes2.dex */
public final class mob implements VideoEncoderFactory {
    public mob(y6d y6dVar, IllegalStateException illegalStateException) {
        y6dVar.reportException("PatchedVideoEncoderFactory", "Video encoder factory init failed", illegalStateException);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public final VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        return null;
    }

    @Override // org.webrtc.VideoEncoderFactory
    public final VideoCodecInfo[] getSupportedCodecs() {
        return new VideoCodecInfo[0];
    }
}

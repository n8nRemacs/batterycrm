package defpackage;

import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFactory;

/* loaded from: classes2.dex */
public final class kqa implements VideoDecoderFactory {
    public kqa(y6d y6dVar, IllegalStateException illegalStateException) {
        y6dVar.reportException("OKDefaultVideoDecoderFactory", "Video decoder factory init failed", illegalStateException);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public final VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return null;
    }
}

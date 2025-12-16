package org.webrtc;

import j.P;
import java.util.List;

/* loaded from: classes9.dex */
public class SoftwareVideoDecoderFactory implements VideoDecoderFactory {
    private static final String TAG = "SoftwareVideoDecoderFactory";
    private final long nativeFactory = nativeCreateFactory();

    private static native long nativeCreateDecoder(long j12, VideoCodecInfo videoCodecInfo);

    private static native long nativeCreateFactory();

    private static native List<VideoCodecInfo> nativeGetSupportedCodecs(long j12);

    @Override // org.webrtc.VideoDecoderFactory
    @P
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        final long jNativeCreateDecoder = nativeCreateDecoder(this.nativeFactory, videoCodecInfo);
        if (jNativeCreateDecoder != 0) {
            return new WrappedNativeVideoDecoder() { // from class: org.webrtc.SoftwareVideoDecoderFactory.1
                @Override // org.webrtc.WrappedNativeVideoDecoder, org.webrtc.VideoDecoder
                public long createNativeVideoDecoder() {
                    return jNativeCreateDecoder;
                }
            };
        }
        Logging.w(TAG, "Trying to create decoder for unsupported format. " + videoCodecInfo);
        return null;
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return (VideoCodecInfo[]) nativeGetSupportedCodecs(this.nativeFactory).toArray(new VideoCodecInfo[0]);
    }
}

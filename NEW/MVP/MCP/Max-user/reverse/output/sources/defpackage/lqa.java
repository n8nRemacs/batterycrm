package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import org.webrtc.EglBase;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFactory;
import org.webrtc.VideoDecoderFallback;

/* loaded from: classes2.dex */
public final class lqa implements VideoDecoderFactory {
    public final EglBase.Context a;
    public final y6d b;
    public final bwf c = new bwf(new hai(this, 0));
    public final bwf d = new bwf(new hai(this, 1));
    public volatile boolean e = true;

    public lqa(EglBase.Context context, y6d y6dVar) {
        this.a = context;
        this.b = y6dVar;
    }

    public final py0 a(VideoCodecInfo videoCodecInfo) {
        VideoDecoder videoDecoderFallback;
        if (videoCodecInfo != null) {
            String str = videoCodecInfo.name;
            if ((!fni.a(str, "VP8") && !fni.a(str, "VP9")) || this.e) {
                try {
                    videoDecoderFallback = ((VideoDecoderFactory) this.c.getValue()).createDecoder(videoCodecInfo);
                } catch (Exception e) {
                    a9h.o("Hardware encoder creating failed! Error=", e.getMessage(), this.b, "OKDefaultVideoDecoderFactory");
                    videoDecoderFallback = null;
                }
                VideoDecoder videoDecoderCreateDecoder = ((VideoDecoderFactory) this.d.getValue()).createDecoder(videoCodecInfo);
                if (videoDecoderFallback != null && videoDecoderCreateDecoder != null) {
                    videoDecoderFallback = new VideoDecoderFallback(videoDecoderCreateDecoder, videoDecoderFallback);
                } else if (videoDecoderFallback == null) {
                    if (videoDecoderCreateDecoder != null) {
                        videoDecoderFallback = videoDecoderCreateDecoder;
                    }
                }
                return new py0(videoDecoderFallback, videoCodecInfo, this.b);
            }
            VideoDecoder videoDecoderCreateDecoder2 = ((VideoDecoderFactory) this.d.getValue()).createDecoder(videoCodecInfo);
            if (videoDecoderCreateDecoder2 != null) {
                return new py0(videoDecoderCreateDecoder2, videoCodecInfo, this.b);
            }
        }
        return null;
    }

    public final VideoCodecInfo[] b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        VideoCodecInfo[] supportedCodecs = ((VideoDecoderFactory) this.d.getValue()).getSupportedCodecs();
        Collections.addAll(linkedHashSet, Arrays.copyOf(supportedCodecs, supportedCodecs.length));
        VideoCodecInfo[] supportedCodecs2 = ((VideoDecoderFactory) this.c.getValue()).getSupportedCodecs();
        Set setSingleton = this.e ? Collections.singleton("H265") : gke.h("H265", "VP8", "VP9");
        if (setSingleton.isEmpty()) {
            Collections.addAll(linkedHashSet, Arrays.copyOf(supportedCodecs2, supportedCodecs2.length));
        } else {
            for (VideoCodecInfo videoCodecInfo : supportedCodecs2) {
                if (!setSingleton.contains(videoCodecInfo.name)) {
                    linkedHashSet.add(videoCodecInfo);
                }
            }
        }
        return (VideoCodecInfo[]) linkedHashSet.toArray(new VideoCodecInfo[0]);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public final VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        try {
            return a(videoCodecInfo);
        } catch (Throwable th) {
            this.b.reportException("OKDefaultVideoDecoderFactory", "Can't create video decoder", th);
            return null;
        }
    }

    @Override // org.webrtc.VideoDecoderFactory
    public final VideoCodecInfo[] getSupportedCodecs() {
        try {
            return b();
        } catch (Throwable th) {
            this.b.reportException("OKDefaultVideoDecoderFactory", "get.supported.codecs.failed", th);
            return new VideoCodecInfo[0];
        }
    }
}

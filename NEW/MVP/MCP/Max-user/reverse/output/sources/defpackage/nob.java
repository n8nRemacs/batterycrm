package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArraySet;
import org.webrtc.EglBase;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoEncoderFactory;
import org.webrtc.VideoEncoderFallback;

/* loaded from: classes2.dex */
public final class nob implements VideoEncoderFactory, ns8 {
    public final y6d a;
    public final pob b;
    public VideoCodecInfo c;
    public final CopyOnWriteArraySet d;
    public final bwf e;
    public final bwf f;

    public nob(EglBase.Context context, boolean z, m81 m81Var, si1 si1Var, y6d y6dVar) {
        this.a = y6dVar;
        this.b = z ? new pob(this, m81Var, y6dVar) : null;
        this.d = new CopyOnWriteArraySet();
        this.e = new bwf(new un5(context, 4, this));
        this.f = new bwf(new m2(19, this));
    }

    @Override // org.webrtc.VideoEncoderFactory
    public final VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        boolean zA;
        pob pobVar = this.b;
        if (pobVar != null) {
            zA = fni.a(videoCodecInfo.name, "VP9");
            pobVar.c.log("PatchedVideoEncoderFactoryCodecSelector", "isSoftwareCodecProhibited check for: " + videoCodecInfo + ", resulted as " + zA);
        } else {
            zA = false;
        }
        VideoEncoder videoEncoderCreateEncoder = ((VideoEncoderFactory) this.e.getValue()).createEncoder(videoCodecInfo);
        VideoEncoder videoEncoderCreateEncoder2 = (videoEncoderCreateEncoder == null || !zA) ? ((VideoEncoderFactory) this.f.getValue()).createEncoder(videoCodecInfo) : null;
        String str = videoCodecInfo.name;
        String str2 = videoEncoderCreateEncoder == null ? "false" : "true";
        String str3 = videoEncoderCreateEncoder2 == null ? "false" : "true";
        StringBuilder sbL = wy1.l("Encoder is about to create: ", str, " hw=", str2, " sw=");
        sbL.append(str3);
        this.a.log("PatchedVideoEncoderFactory", sbL.toString());
        this.c = videoCodecInfo;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            wpb wpbVar = (wpb) ((lob) it.next());
            wpbVar.getClass();
            wpbVar.i(new c(wpbVar, new hpb(wpbVar, 0), 0), "onNewCodecIsCreating");
        }
        return (videoEncoderCreateEncoder == null || videoEncoderCreateEncoder2 == null) ? videoEncoderCreateEncoder == null ? videoEncoderCreateEncoder2 : videoEncoderCreateEncoder : new VideoEncoderFallback(videoEncoderCreateEncoder2, videoEncoderCreateEncoder);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public final VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return this.b;
    }

    @Override // org.webrtc.VideoEncoderFactory
    public final VideoCodecInfo[] getSupportedCodecs() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        af3.t(linkedHashSet, ((VideoEncoderFactory) this.e.getValue()).getSupportedCodecs());
        af3.t(linkedHashSet, ((VideoEncoderFactory) this.f.getValue()).getSupportedCodecs());
        return (VideoCodecInfo[]) linkedHashSet.toArray(new VideoCodecInfo[0]);
    }

    @Override // defpackage.ns8
    public final void n(os8 os8Var) {
        pob pobVar = this.b;
        if (pobVar != null) {
            pobVar.n(os8Var);
        }
    }
}

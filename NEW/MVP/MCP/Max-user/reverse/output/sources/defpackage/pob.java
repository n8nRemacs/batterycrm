package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoEncoderFactory;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;
import ru.ok.android.onelog.NetworkClass;

/* loaded from: classes2.dex */
public final class pob implements VideoEncoderFactory.VideoEncoderSelector, ns8 {
    public final nob a;
    public final m81 b;
    public final y6d c;
    public VideoCodecInfo d;
    public VideoCodecInfo e;
    public p6d f = new p6d(1, new ps8(0.0d, 0.0d), false);
    public boolean g = true;
    public final Object h = new Object();

    public pob(nob nobVar, m81 m81Var, y6d y6dVar) {
        this.a = nobVar;
        this.b = m81Var;
        this.c = y6dVar;
    }

    public static VideoCodecInfo b(VideoCodecInfo[] videoCodecInfoArr, String str) {
        for (VideoCodecInfo videoCodecInfo : videoCodecInfoArr) {
            if (fni.a(videoCodecInfo.name, str)) {
                return videoCodecInfo;
            }
        }
        return null;
    }

    public final VideoCodecInfo a() throws JSONException {
        VideoCodecInfo videoCodecInfoB;
        p6d p6dVar;
        String str;
        if (this.e != null) {
            p6d p6dVar2 = this.f;
            if (oob.$EnumSwitchMapping$0[az1.v(p6dVar2.a)] == 1) {
                videoCodecInfoB = this.e;
            } else if (p6dVar2.c) {
                VideoCodecInfo[] supportedCodecs = ((VideoEncoderFactory) this.a.e.getValue()).getSupportedCodecs();
                VideoCodecInfo videoCodecInfoB2 = b(supportedCodecs, "VP9");
                if (videoCodecInfoB2 == null) {
                    videoCodecInfoB = b(supportedCodecs, "VP8");
                    if (videoCodecInfoB == null) {
                        videoCodecInfoB = b(((VideoEncoderFactory) this.a.f.getValue()).getSupportedCodecs(), "VP8");
                    }
                } else {
                    videoCodecInfoB = videoCodecInfoB2;
                }
            } else {
                videoCodecInfoB = b(((VideoEncoderFactory) this.a.f.getValue()).getSupportedCodecs(), "VP8");
                if (videoCodecInfoB == null) {
                    this.c.log("PatchedVideoEncoderFactoryCodecSelector", "Software VP8 encoder not found");
                }
            }
            if (!fni.a(videoCodecInfoB, this.d)) {
                VideoCodecInfo videoCodecInfo = this.d;
                String str2 = videoCodecInfo != null ? videoCodecInfo.name : null;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = videoCodecInfoB != null ? videoCodecInfoB.name : null;
                if (str3 == null) {
                    str3 = "";
                }
                this.c.log("PatchedVideoEncoderFactoryCodecSelector", wy1.j("Selected encoder \"", str3, "\" differs from current one \"", str2, "\". Let us suggest an update"));
                synchronized (this.h) {
                    if (this.g) {
                        p6dVar = null;
                    } else {
                        this.g = true;
                        p6dVar = this.f;
                    }
                }
                if (p6dVar != null) {
                    m81 m81Var = this.b;
                    JSONObject jSONObjectPut = new JSONObject().put(RttRateHintConfig.RTT, this.f.b.a).put("loss", kti.c(this.f.b.b * 100));
                    int i = this.f.a;
                    if (i == 1) {
                        str = NetworkClass.GOOD;
                    } else if (i == 2) {
                        str = "bad_1";
                    } else {
                        if (i != 3) {
                            throw null;
                        }
                        str = "bad_2";
                    }
                    m81.a(m81Var, "video_encoder_changed_by_network_adapter", EventItemValue.StringValue.m90boximpl(EventItemValue.StringValue.m91constructorimpl(jSONObjectPut.put("network_quality", str).put("codec_old", str2).put("codec_new", str3).toString())), null, 4);
                }
                return videoCodecInfoB;
            }
        }
        return null;
    }

    @Override // defpackage.ns8
    public final void n(os8 os8Var) {
        this.c.log("PatchedVideoEncoderFactoryCodecSelector", "Network condition did change. New condition is " + os8Var);
        synchronized (this.h) {
            this.f = new p6d(os8Var.a, os8Var.b, os8Var.d);
            this.g = false;
        }
    }

    @Override // org.webrtc.VideoEncoderFactory.VideoEncoderSelector
    public final VideoCodecInfo onAvailableBitrate(int i) {
        return a();
    }

    @Override // org.webrtc.VideoEncoderFactory.VideoEncoderSelector
    public final void onCurrentEncoder(VideoCodecInfo videoCodecInfo) {
        VideoCodecInfo videoCodecInfo2 = this.e;
        y6d y6dVar = this.c;
        if (videoCodecInfo2 == null && videoCodecInfo != null) {
            y6dVar.log("PatchedVideoEncoderFactoryCodecSelector", "Encoder  " + videoCodecInfo + " was selected as default");
            this.e = videoCodecInfo;
        }
        this.d = videoCodecInfo;
        y6dVar.log("PatchedVideoEncoderFactoryCodecSelector", "Codec selected: " + videoCodecInfo + " for condition " + this.f);
    }

    @Override // org.webrtc.VideoEncoderFactory.VideoEncoderSelector
    public final VideoCodecInfo onEncoderBroken() {
        boolean zA = fni.a(this.d, this.e);
        y6d y6dVar = this.c;
        if (zA) {
            VideoCodecInfo videoCodecInfo = this.e;
            if (videoCodecInfo != null) {
                y6dVar.log("PatchedVideoEncoderFactoryCodecSelector", "Default encoder " + videoCodecInfo + " was broken. reset");
            }
            this.e = null;
        }
        VideoCodecInfo videoCodecInfo2 = this.d;
        if (videoCodecInfo2 != null) {
            y6dVar.log("PatchedVideoEncoderFactoryCodecSelector", "Current encoder " + videoCodecInfo2 + " was broken. reset");
        }
        this.d = null;
        return a();
    }

    @Override // org.webrtc.VideoEncoderFactory.VideoEncoderSelector
    public final VideoCodecInfo onResolutionChange(int i, int i2) {
        return a();
    }
}

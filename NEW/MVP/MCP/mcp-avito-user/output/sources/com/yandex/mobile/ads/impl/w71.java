package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public interface w71 {

    /* renamed from: a, reason: collision with root package name */
    public static final w71 f391328a = new a();

    public class a implements w71 {
        public final u71 a(vw vwVar) {
            String str = vwVar.f391181l;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new bs(vwVar.f391183n);
                    case "application/pgs":
                        return new js0();
                    case "application/x-mp4-vtt":
                        return new lh0();
                    case "text/vtt":
                        return new tl1();
                    case "application/x-quicktime-tx3g":
                        return new nb1(vwVar.f391183n);
                    case "text/x-ssa":
                        return new p61(vwVar.f391183n);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new ei(vwVar.f391167D, str);
                    case "text/x-exoplayer-cues":
                        return new eu();
                    case "application/cea-708":
                        return new fi(vwVar.f391167D, vwVar.f391183n);
                    case "application/x-subrip":
                        return new r71();
                    case "application/ttml+xml":
                        return new hb1();
                }
            }
            throw new IllegalArgumentException(up1.a("Attempted to create decoder for unsupported MIME type: ", str));
        }

        public final boolean b(vw vwVar) {
            String str = vwVar.f391181l;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }
    }
}

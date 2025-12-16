package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public interface gg0 {

    /* renamed from: a, reason: collision with root package name */
    public static final gg0 f385743a = new a();

    public class a implements gg0 {
        @Override // com.yandex.mobile.ads.impl.gg0
        public final boolean a(vw vwVar) {
            String str = vwVar.f391181l;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // com.yandex.mobile.ads.impl.gg0
        public final b41 b(vw vwVar) {
            String str = vwVar.f391181l;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new da();
                    case "application/x-icy":
                        return new b20();
                    case "application/id3":
                        return new c20(null);
                    case "application/x-emsg":
                        return new bt();
                    case "application/x-scte35":
                        return new com.yandex.mobile.ads.exo.metadata.scte35.a();
                }
            }
            throw new IllegalArgumentException(up1.a("Attempted to create decoder for unsupported MIME type: ", str));
        }
    }

    boolean a(vw vwVar);

    b41 b(vw vwVar);
}

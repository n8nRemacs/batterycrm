package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public abstract class b7d {
    public static String COLLECTOR_VIDEO = "ok.mobile.apps.video";
    public static String COLLECTOR_WEBRTC = "webrtc.aggregation";
    public String conversationId;

    @Deprecated
    public final void log(hcf hcfVar, String str, String str2) {
        log(hcfVar.a, time(), str, str2);
    }

    public abstract void log(String str, long j, String str2, String str3);

    public abstract void log(String str, String str2, Map map);

    public abstract long time();
}

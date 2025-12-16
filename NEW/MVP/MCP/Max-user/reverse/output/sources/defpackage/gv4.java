package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class gv4 {
    public final Map a;
    public static final /* synthetic */ yy7[] c = {new toc(gv4.class, "isAbEventEnabled", "isAbEventEnabled()Z", 0), ho7.d(vid.a, gv4.class, "isStartupReportEnabled", "isStartupReportEnabled()Z", 0), new toc(gv4.class, "isHostReachabilityEnabled", "isHostReachabilityEnabled()Z", 0), new toc(gv4.class, "isLoginEnabled", "isLoginEnabled()Z", 0), new toc(gv4.class, "isUploadEnabled", "isUploadEnabled()Z", 0)};
    public static final q85 b = new q85(19);
    public static final gv4 d = new gv4(new us(0));

    public gv4(Map map) {
        this.a = map;
    }

    public final boolean a(String str) {
        return ((Boolean) this.a.getOrDefault(str, Boolean.FALSE)).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gv4) && fni.a(this.a, ((gv4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DevNullServerConfig(events=" + this.a + ")";
    }
}

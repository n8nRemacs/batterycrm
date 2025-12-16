package defpackage;

import android.app.ApplicationExitInfo;
import android.media.MediaRoute2Info;
import android.media.RouteDiscoveryPreference;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f5 {
    public static /* bridge */ /* synthetic */ ApplicationExitInfo d(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info h(Object obj) {
        return (MediaRoute2Info) obj;
    }

    public static /* synthetic */ RouteDiscoveryPreference.Builder i(zjd zjdVar) {
        return new RouteDiscoveryPreference.Builder(zjdVar, false);
    }

    public static /* synthetic */ void w() {
    }
}

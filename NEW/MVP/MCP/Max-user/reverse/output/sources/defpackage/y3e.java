package defpackage;

import ru.ok.android.externcalls.sdk.events.AnalyticsEventListener;

/* loaded from: classes.dex */
public final class y3e implements AnalyticsEventListener {
    public final k18 a;

    public y3e(k18 k18Var) {
        this.a = k18Var;
    }

    public static String a(String str) {
        if (dnf.r(str, "websocket", true)) {
            return "ws";
        }
        if (dnf.r(str, "webtransport", true)) {
            return "wt";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b7  */
    @Override // ru.ok.android.externcalls.sdk.events.AnalyticsEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnalyticsEvent(ru.ok.android.externcalls.sdk.events.AnalyticsEventListener.AnalyticsEvent r14) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y3e.onAnalyticsEvent(ru.ok.android.externcalls.sdk.events.AnalyticsEventListener$AnalyticsEvent):void");
    }
}

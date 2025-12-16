package com.akita.compose.theme.re23.style;

import kotlin.Metadata;

/* compiled from: ButtonStylesExtensions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"re23_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class N {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Y61.k
    public static final com.akita.compose.component.button.t a(@Y61.k M m12, @Y61.k String str) {
        switch (str.hashCode()) {
            case -1342830487:
                if (str.equals("primarySmallRound")) {
                    return m12.a0();
                }
                break;
            case -1188486617:
                if (str.equals("secondaryLarge")) {
                    return m12.M();
                }
                break;
            case -1132319143:
                if (str.equals("primaryLarge")) {
                    return m12.f2();
                }
                break;
            case -1126385737:
                if (str.equals("primaryMediumRound")) {
                    return m12.p1();
                }
                break;
            case -1125513179:
                if (str.equals("primarySmall")) {
                    return m12.g1();
                }
                break;
            case -710246377:
                if (str.equals("primaryMedium")) {
                    return m12.X1();
                }
                break;
            case -532569419:
                if (str.equals("primaryLargeRound")) {
                    return m12.P();
                }
                break;
        }
        return m12.f2();
    }
}

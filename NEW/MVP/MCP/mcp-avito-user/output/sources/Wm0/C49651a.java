package wm0;

import Y61.k;
import kotlin.Metadata;

/* compiled from: ChipTitleToAnalyticsMapper.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_repair-calculator_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: wm0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49651a {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @k
    public static final String a(@k String str) {
        switch (str.hashCode()) {
            case 290245949:
                if (!str.equals("Капитальный")) {
                }
                break;
            case 1253795238:
                if (!str.equals("Дизайнерский")) {
                }
                break;
            case 1659424346:
                str.equals("Черновой");
                break;
            case 1990230516:
                if (!str.equals("Косметический")) {
                }
                break;
        }
        return "rough";
    }
}

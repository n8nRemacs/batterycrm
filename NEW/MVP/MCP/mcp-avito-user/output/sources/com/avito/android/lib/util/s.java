package com.avito.android.lib.util;

import com.avito.android.R;
import j.InterfaceC42150f;
import kotlin.Metadata;

/* compiled from: PromoBlockColors.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class s {

    /* compiled from: PromoBlockColors.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f181426a;

        static {
            int[] iArr = new int[UiTheme.values().length];
            try {
                UiTheme uiTheme = UiTheme.f181325b;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f181426a = iArr;
        }
    }

    @InterfaceC42150f
    public static final int a(@Y61.k String str) {
        String str2;
        switch (str.hashCode()) {
            case -1008851410:
                return !str.equals("orange") ? R.attr.blue600 : R.attr.orange800;
            case -816343937:
                return !str.equals("violet") ? R.attr.blue600 : R.attr.violet800;
            case 112785:
                return !str.equals("red") ? R.attr.blue600 : R.attr.red600;
            case 3027034:
                str2 = "blue";
                break;
            case 93618148:
                return !str.equals("beige") ? R.attr.blue600 : R.attr.beige800;
            case 98619139:
                return !str.equals("green") ? R.attr.blue600 : R.attr.green800;
            case 113101865:
                str2 = "white";
                break;
            case 497111656:
                str2 = "warmgray";
                break;
            default:
                return R.attr.blue600;
        }
        str.equals(str2);
        return R.attr.blue600;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @InterfaceC42150f
    public static final int b(@Y61.k String str, @Y61.l UiTheme uiTheme) {
        int i12;
        if ((uiTheme == null ? -1 : a.f181426a[uiTheme.ordinal()]) == 1) {
            int iHashCode = str.hashCode();
            i12 = R.attr.blue200;
            switch (iHashCode) {
                case -1008851410:
                    return !str.equals("orange") ? R.attr.beige200 : R.attr.orange200;
                case -816343937:
                    return !str.equals("violet") ? R.attr.beige200 : R.attr.violet200;
                case 112785:
                    return !str.equals("red") ? R.attr.beige200 : R.attr.red200;
                case 3027034:
                    if (!str.equals("blue")) {
                        return R.attr.beige200;
                    }
                    break;
                case 93618148:
                    str.equals("beige");
                    return R.attr.beige200;
                case 98619139:
                    return !str.equals("green") ? R.attr.beige200 : R.attr.green200;
                case 113101865:
                    if (!str.equals("white")) {
                        return R.attr.beige200;
                    }
                    break;
                case 497111656:
                    return !str.equals("warmgray") ? R.attr.beige200 : R.attr.warmGray16;
                default:
                    return R.attr.beige200;
            }
        } else {
            int iHashCode2 = str.hashCode();
            i12 = R.attr.blue300;
            switch (iHashCode2) {
                case -1008851410:
                    return !str.equals("orange") ? R.attr.beige300 : R.attr.orange300;
                case -816343937:
                    return !str.equals("violet") ? R.attr.beige300 : R.attr.violet300;
                case 112785:
                    return !str.equals("red") ? R.attr.beige300 : R.attr.red300;
                case 3027034:
                    if (!str.equals("blue")) {
                        return R.attr.beige300;
                    }
                    break;
                case 93618148:
                    str.equals("beige");
                    return R.attr.beige300;
                case 98619139:
                    return !str.equals("green") ? R.attr.beige300 : R.attr.green300;
                case 113101865:
                    if (!str.equals("white")) {
                        return R.attr.beige300;
                    }
                    break;
                case 497111656:
                    if (!str.equals("warmgray")) {
                        return R.attr.beige300;
                    }
                    break;
                default:
                    return R.attr.beige300;
            }
        }
        return i12;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @InterfaceC42150f
    public static final int c(@Y61.k String str, @Y61.l UiTheme uiTheme) {
        int i12;
        if ((uiTheme == null ? -1 : a.f181426a[uiTheme.ordinal()]) == 1) {
            int iHashCode = str.hashCode();
            i12 = R.attr.blue600;
            switch (iHashCode) {
                case -1008851410:
                    return !str.equals("orange") ? R.attr.beige800 : R.attr.orange600;
                case -816343937:
                    return !str.equals("violet") ? R.attr.beige800 : R.attr.violet600;
                case 112785:
                    return !str.equals("red") ? R.attr.beige800 : R.attr.red600;
                case 3027034:
                    if (!str.equals("blue")) {
                        return R.attr.beige800;
                    }
                    break;
                case 93618148:
                    str.equals("beige");
                    return R.attr.beige800;
                case 98619139:
                    return !str.equals("green") ? R.attr.beige800 : R.attr.green700;
                case 113101865:
                    if (!str.equals("white")) {
                        return R.attr.beige800;
                    }
                    break;
                case 497111656:
                    return !str.equals("warmgray") ? R.attr.beige800 : R.attr.warmGray54;
                default:
                    return R.attr.beige800;
            }
        } else {
            int iHashCode2 = str.hashCode();
            i12 = R.attr.blue800;
            switch (iHashCode2) {
                case -1008851410:
                    return !str.equals("orange") ? R.attr.beige800 : R.attr.orange800;
                case -816343937:
                    return !str.equals("violet") ? R.attr.beige800 : R.attr.violet800;
                case 112785:
                    return !str.equals("red") ? R.attr.beige800 : R.attr.red800;
                case 3027034:
                    if (!str.equals("blue")) {
                        return R.attr.beige800;
                    }
                    break;
                case 93618148:
                    str.equals("beige");
                    return R.attr.beige800;
                case 98619139:
                    return !str.equals("green") ? R.attr.beige800 : R.attr.green800;
                case 113101865:
                    if (!str.equals("white")) {
                        return R.attr.beige800;
                    }
                    break;
                case 497111656:
                    if (!str.equals("warmgray")) {
                        return R.attr.beige800;
                    }
                    break;
                default:
                    return R.attr.beige800;
            }
        }
        return i12;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @InterfaceC42150f
    public static final int d(@Y61.k String str) {
        switch (str.hashCode()) {
            case -1008851410:
                if (!str.equals("orange")) {
                }
                break;
            case -816343937:
                if (!str.equals("violet")) {
                }
                break;
            case 112785:
                if (!str.equals("red")) {
                }
                break;
            case 3027034:
                if (!str.equals("blue")) {
                }
                break;
            case 93618148:
                str.equals("beige");
                break;
            case 98619139:
                if (!str.equals("green")) {
                }
                break;
            case 113101865:
                if (!str.equals("white")) {
                }
                break;
            case 497111656:
                if (!str.equals("warmgray")) {
                }
                break;
        }
        return R.attr.bannerBackgroundBeige;
    }
}

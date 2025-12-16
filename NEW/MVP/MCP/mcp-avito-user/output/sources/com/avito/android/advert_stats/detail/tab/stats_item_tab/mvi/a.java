package com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi;

import Y61.k;
import com.avito.android.advert_stats.detail.tab.AdvertDetailStatsTabItem;
import com.avito.android.advert_stats.detail.tab.StatsDialogType;
import com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItemTabInternalAction;
import com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItemTabState;
import com.avito.android.advert_stats.remote.model.detail_stats.AdvertStatTab;
import com.avito.android.advert_stats.remote.model.detail_stats.Period;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import eb.InterfaceC40078a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StatsItemTabActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Leb/a;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabState;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC40078a, StatsItemTabInternalAction, StatsItemTabState> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f86543a;

    @Inject
    public a(@k InterfaceC28373a interfaceC28373a) {
        this.f86543a = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<StatsItemTabInternalAction> b(InterfaceC40078a interfaceC40078a, StatsItemTabState statsItemTabState) {
        C43210w c43210w;
        String str;
        String str2;
        AdvertStatTab advertStatTab;
        List<Period> listG;
        Period period;
        AdvertStatTab advertStatTab2;
        Action factorDialog;
        AdvertStatTab advertStatTab3;
        String id2;
        AdvertStatTab advertStatTab4;
        String id3;
        AdvertStatTab advertStatTab5;
        String id4;
        InterfaceC40078a interfaceC40078a2 = interfaceC40078a;
        boolean z12 = interfaceC40078a2 instanceof InterfaceC40078a.b;
        AdvertDetailStatsTabItem advertDetailStatsTabItem = statsItemTabState.f86567e;
        InterfaceC28373a interfaceC28373a = this.f86543a;
        Long lValueOf = null;
        statsDialogType = null;
        statsDialogType = null;
        statsDialogType = null;
        statsDialogType = null;
        statsDialogType = null;
        statsDialogType = null;
        statsDialogType = null;
        statsDialogType = null;
        StatsDialogType statsDialogType = null;
        deepLink = null;
        deepLink = null;
        DeepLink deepLink = null;
        lValueOf = null;
        lValueOf = null;
        lValueOf = null;
        String str3 = "";
        if (z12) {
            if (advertDetailStatsTabItem != null && (advertStatTab5 = advertDetailStatsTabItem.f86183f) != null && (id4 = advertStatTab5.getId()) != null) {
                str3 = id4;
            }
            interfaceC28373a.c(new Xa.c(str3));
            if (advertDetailStatsTabItem != null && (advertStatTab4 = advertDetailStatsTabItem.f86183f) != null && (id3 = advertStatTab4.getId()) != null) {
                StatsDialogType.f86193b.getClass();
                switch (id3.hashCode()) {
                    case -1960086446:
                        if (id3.equals("responses")) {
                            statsDialogType = StatsDialogType.c.f86198c;
                            break;
                        }
                        break;
                    case -1523259765:
                        if (id3.equals("avg_views_cost")) {
                            statsDialogType = StatsDialogType.HowUnderstandChartType.AvgViewsCost.f86194c;
                            break;
                        }
                        break;
                    case -567451565:
                        if (id3.equals("contacts")) {
                            statsDialogType = StatsDialogType.b.f86197c;
                            break;
                        }
                        break;
                    case -555634806:
                        if (id3.equals("impressions")) {
                            statsDialogType = StatsDialogType.HowUnderstandChartType.Impressions.f86195c;
                            break;
                        }
                        break;
                    case 112204398:
                        if (id3.equals("views")) {
                            statsDialogType = StatsDialogType.HowUnderstandChartType.Views.f86196c;
                            break;
                        }
                        break;
                }
            }
            return statsDialogType != null ? new C43210w(new StatsItemTabInternalAction.OpenDialog(statsDialogType)) : C43175k.w();
        }
        if (interfaceC40078a2 instanceof InterfaceC40078a.c) {
            c43210w = new C43210w(new StatsItemTabInternalAction.HandleDeeplink(((InterfaceC40078a.c) interfaceC40078a2).f395236a));
        } else {
            if (interfaceC40078a2 instanceof InterfaceC40078a.d) {
                if (advertDetailStatsTabItem != null && (advertStatTab3 = advertDetailStatsTabItem.f86183f) != null && (id2 = advertStatTab3.getId()) != null) {
                    str3 = id2;
                }
                interfaceC28373a.c(new Xa.d(str3));
                if (advertDetailStatsTabItem != null && (advertStatTab2 = advertDetailStatsTabItem.f86183f) != null && (factorDialog = advertStatTab2.getFactorDialog()) != null) {
                    deepLink = factorDialog.getDeepLink();
                }
                return new C43210w(new StatsItemTabInternalAction.HandleDeeplink(deepLink));
            }
            if (interfaceC40078a2 instanceof InterfaceC40078a.h) {
                if (advertDetailStatsTabItem == null || (str = advertDetailStatsTabItem.f86179b) == null) {
                    str = "";
                }
                interfaceC28373a.c(new Xa.f(str));
                if (advertDetailStatsTabItem != null && (advertStatTab = advertDetailStatsTabItem.f86183f) != null && (listG = advertStatTab.g()) != null && (period = listG.get(((InterfaceC40078a.h) interfaceC40078a2).f395241a)) != null) {
                    lValueOf = Long.valueOf(period.getDateFrom());
                }
                if (advertDetailStatsTabItem != null && (str2 = advertDetailStatsTabItem.f86180c) != null) {
                    str3 = str2;
                }
                return new C43210w(new StatsItemTabInternalAction.SelectedPeriod(str3, ((InterfaceC40078a.h) interfaceC40078a2).f395241a, lValueOf));
            }
            if (interfaceC40078a2 instanceof InterfaceC40078a.C11090a) {
                c43210w = new C43210w(new StatsItemTabInternalAction.BarSelected(((InterfaceC40078a.C11090a) interfaceC40078a2).f395234a));
            } else {
                if (interfaceC40078a2 instanceof InterfaceC40078a.f) {
                    return new C43210w(StatsItemTabInternalAction.UnselectBarItems.f86560b);
                }
                if (interfaceC40078a2 instanceof InterfaceC40078a.g) {
                    c43210w = new C43210w(new StatsItemTabInternalAction.UpdateSelectedPeriod(((InterfaceC40078a.g) interfaceC40078a2).f395240a));
                } else {
                    if (!(interfaceC40078a2 instanceof InterfaceC40078a.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c43210w = new C43210w(new StatsItemTabInternalAction.Start(((InterfaceC40078a.e) interfaceC40078a2).f395238a));
                }
            }
        }
        return c43210w;
    }
}

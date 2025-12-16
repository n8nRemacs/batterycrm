package com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi;

import Y61.k;
import com.avito.android.advert_stats.detail.tab.AdvertDetailStatsTabItem;
import com.avito.android.advert_stats.detail.tab.items.button.ButtonItem;
import com.avito.android.advert_stats.detail.tab.items.chart.StatsBarItem;
import com.avito.android.advert_stats.detail.tab.items.chart.StatsPeriodItem;
import com.avito.android.advert_stats.detail.tab.items.chart.StatsPlotItem;
import com.avito.android.advert_stats.detail.tab.items.common_stats.CommonStatsItem;
import com.avito.android.advert_stats.detail.tab.items.contact.ContactsPerPeriodItem;
import com.avito.android.advert_stats.detail.tab.items.funnel.FunnelItemData;
import com.avito.android.advert_stats.detail.tab.items.titile.TitleItem;
import com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItem;
import com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItemTabInternalAction;
import com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItemTabState;
import com.avito.android.advert_stats.item.BarState;
import com.avito.android.advert_stats.remote.model.detail_stats.AdvertStatTab;
import com.avito.android.advert_stats.remote.model.detail_stats.ContactInfo;
import com.avito.android.advert_stats.remote.model.detail_stats.ContactItem;
import com.avito.android.advert_stats.remote.model.detail_stats.FunnelItem;
import com.avito.android.advert_stats.remote.model.detail_stats.HintTransactionStats;
import com.avito.android.advert_stats.remote.model.detail_stats.ItemPeriod;
import com.avito.android.advert_stats.remote.model.detail_stats.Period;
import com.avito.android.advert_stats.remote.model.detail_stats.Stats;
import com.avito.android.advert_stats.remote.model.detail_stats.TransitionStats;
import com.avito.android.arch.mvi.u;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35863o4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: StatsItemTabReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/h;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabInternalAction;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabState;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements u<StatsItemTabInternalAction, StatsItemTabState> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35863o4 f86569b;

    @Inject
    public h(@k InterfaceC35863o4 interfaceC35863o4) {
        this.f86569b = interfaceC35863o4;
    }

    public static ArrayList d(long j12, boolean z12, ContactInfo contactInfo, AdvertDetailStatsTabItem advertDetailStatsTabItem, InterfaceC35863o4 interfaceC35863o4) {
        AdvertStatTab advertStatTab;
        List<Period> listG;
        ContactInfo contactsPerPeriod;
        ItemPeriod itemPeriod;
        Object next;
        ArrayList arrayList = new ArrayList();
        if (advertDetailStatsTabItem != null && (advertStatTab = advertDetailStatsTabItem.f86183f) != null && (listG = advertStatTab.g()) != null) {
            if (contactInfo == null) {
                loop0: while (true) {
                    contactsPerPeriod = null;
                    for (Period period : listG) {
                        if (z12) {
                            if (period.getDateFrom() == j12) {
                                contactsPerPeriod = period.getContactsPerPeriod();
                            }
                        } else if (period.getDateFrom() <= j12 && j12 <= period.getDateTo()) {
                            List<ItemPeriod> listI = period.i();
                            if (listI != null) {
                                Iterator<T> it = listI.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    if (((ItemPeriod) next).getDate() == j12) {
                                        break;
                                    }
                                }
                                itemPeriod = (ItemPeriod) next;
                            } else {
                                itemPeriod = null;
                            }
                            if (itemPeriod != null) {
                                contactsPerPeriod = itemPeriod.getContactsPerItem();
                            }
                        }
                    }
                }
                contactInfo = contactsPerPeriod;
            }
            if (contactInfo != null) {
                arrayList.add(new TitleItem(interfaceC35863o4.a(), contactInfo.getTitle(), null, null, null, 28, null));
                for (ContactItem contactItem : contactInfo.c()) {
                    arrayList.add(new ContactsPerPeriodItem(interfaceC35863o4.a(), contactItem.getDescription(), contactItem.getValue()));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List e(long r10, boolean r12, com.avito.android.advert_stats.detail.tab.AdvertDetailStatsTabItem r13, com.avito.android.util.InterfaceC35863o4 r14) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.h.e(long, boolean, com.avito.android.advert_stats.detail.tab.AdvertDetailStatsTabItem, com.avito.android.util.o4):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int f(com.avito.android.advert_stats.detail.tab.AdvertDetailStatsTabItem r9) {
        /*
            r0 = 0
            if (r9 == 0) goto Lc
            com.avito.android.advert_stats.remote.model.detail_stats.AdvertStatTab r1 = r9.f86183f
            if (r1 == 0) goto Lc
            java.util.List r1 = r1.g()
            goto Ld
        Lc:
            r1 = r0
        Ld:
            r2 = 0
            if (r1 == 0) goto L33
            r3 = r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.avito.android.advert_stats.remote.model.detail_stats.Period r5 = (com.avito.android.advert_stats.remote.model.detail_stats.Period) r5
            long r5 = r5.getDateFrom()
            long r7 = r9.f86184g
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L17
            r0 = r4
        L2f:
            com.avito.android.advert_stats.remote.model.detail_stats.Period r0 = (com.avito.android.advert_stats.remote.model.detail_stats.Period) r0
            if (r0 != 0) goto L37
        L33:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L37:
            if (r1 == 0) goto L3e
            int r9 = r1.indexOf(r0)
            goto L3f
        L3e:
            r9 = r2
        L3f:
            if (r9 >= 0) goto L42
            goto L43
        L42:
            r2 = r9
        L43:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.h.f(com.avito.android.advert_stats.detail.tab.AdvertDetailStatsTabItem):int");
    }

    @Override // com.avito.android.arch.mvi.u
    public final StatsItemTabState a(StatsItemTabInternalAction statsItemTabInternalAction, StatsItemTabState statsItemTabState) {
        StatsItemTabState statsItemTabStateC;
        AdvertStatTab advertStatTab;
        List<Period> listG;
        Object obj;
        TransitionStats transition;
        Iterator it;
        List list;
        Iterator it2;
        int actions;
        StatsItemTabInternalAction statsItemTabInternalAction2 = statsItemTabInternalAction;
        StatsItemTabState statsItemTabState2 = statsItemTabState;
        if ((statsItemTabInternalAction2 instanceof StatsItemTabInternalAction.HandleDeeplink) || (statsItemTabInternalAction2 instanceof StatsItemTabInternalAction.OpenDialog) || (statsItemTabInternalAction2 instanceof StatsItemTabInternalAction.SelectedPeriod)) {
            return statsItemTabState2;
        }
        if (!(statsItemTabInternalAction2 instanceof StatsItemTabInternalAction.Start)) {
            if (statsItemTabInternalAction2 instanceof StatsItemTabInternalAction.BarSelected) {
                StatsBarItem statsBarItem = ((StatsItemTabInternalAction.BarSelected) statsItemTabInternalAction2).f86553b;
                statsItemTabStateC = statsBarItem.f86284e != BarState.f86679c ? c(null, statsItemTabState2, statsBarItem) : c(statsItemTabState2.f86565c, statsItemTabState2, null);
            } else {
                if (statsItemTabInternalAction2 instanceof StatsItemTabInternalAction.UnselectBarItems) {
                    Iterator<T> it3 = statsItemTabState2.f86564b.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        }
                        Object next = it3.next();
                        if (((StatsItem) next) instanceof StatsPlotItem) {
                            obj = next;
                            break;
                        }
                    }
                    StatsItem statsItem = (StatsItem) obj;
                    if (!(statsItem instanceof StatsPlotItem)) {
                        return statsItemTabState2;
                    }
                    Iterator<T> it4 = ((StatsPlotItem) statsItem).f86294c.iterator();
                    while (it4.hasNext()) {
                        Iterator<T> it5 = ((StatsPeriodItem) it4.next()).f86291c.iterator();
                        while (it5.hasNext()) {
                            ((StatsBarItem) it5.next()).f86284e = BarState.f86678b;
                        }
                    }
                    return statsItemTabState2;
                }
                if (!(statsItemTabInternalAction2 instanceof StatsItemTabInternalAction.UpdateSelectedPeriod)) {
                    throw new NoWhenBranchMatchedException();
                }
                StatsItemTabInternalAction.UpdateSelectedPeriod updateSelectedPeriod = (StatsItemTabInternalAction.UpdateSelectedPeriod) statsItemTabInternalAction2;
                AdvertDetailStatsTabItem advertDetailStatsTabItem = statsItemTabState2.f86567e;
                StatsItemTabState statsItemTabStateA = StatsItemTabState.a(statsItemTabState2, null, null, 0, advertDetailStatsTabItem != null ? AdvertDetailStatsTabItem.a(advertDetailStatsTabItem, updateSelectedPeriod.f86561b) : null, 7);
                AdvertDetailStatsTabItem advertDetailStatsTabItem2 = statsItemTabStateA.f86567e;
                int iF2 = f(advertDetailStatsTabItem2);
                if (statsItemTabStateA.f86566d == iF2) {
                    return statsItemTabStateA;
                }
                Period period = (advertDetailStatsTabItem2 == null || (advertStatTab = advertDetailStatsTabItem2.f86183f) == null || (listG = advertStatTab.g()) == null) ? null : listG.get(iF2);
                statsItemTabStateC = c(period, StatsItemTabState.a(statsItemTabStateA, null, period, iF2, null, 9), null);
            }
            return statsItemTabStateC;
        }
        AdvertDetailStatsTabItem advertDetailStatsTabItem3 = ((StatsItemTabInternalAction.Start) statsItemTabInternalAction2).f86559b;
        if (advertDetailStatsTabItem3 == null) {
            return statsItemTabState2;
        }
        ArrayList arrayList = new ArrayList();
        int iF3 = f(advertDetailStatsTabItem3);
        AdvertStatTab advertStatTab2 = advertDetailStatsTabItem3.f86183f;
        List<Period> listG2 = advertStatTab2.g();
        if (listG2 == null) {
            listG2 = C42784z0.f406748b;
        }
        List<FunnelItem> listH = listG2.get(iF3).h();
        if (listH == null) {
            listH = C42784z0.f406748b;
        }
        InterfaceC35863o4 interfaceC35863o4 = this.f86569b;
        arrayList.add(new FunnelItemData(interfaceC35863o4.a(), listH));
        int maxValue = advertStatTab2.getMaxValue();
        List<Period> list2 = listG2;
        int i12 = 10;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
        Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            Period period2 = (Period) it6.next();
            String strValueOf = String.valueOf(period2.getDateFrom());
            List<ItemPeriod> listI = period2.i();
            if (listI == null) {
                list = C42784z0.f406748b;
                it = it6;
            } else {
                List<ItemPeriod> list3 = listI;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(list3, i12));
                Iterator it7 = list3.iterator();
                int i13 = 0;
                while (it7.hasNext()) {
                    Object next2 = it7.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    ItemPeriod itemPeriod = (ItemPeriod) next2;
                    Stats stats = itemPeriod.getStats();
                    if (stats != null) {
                        it2 = it6;
                        actions = stats.getActions();
                    } else {
                        it2 = it6;
                        actions = 0;
                    }
                    String strValueOf2 = String.valueOf(itemPeriod.getDate());
                    Stats stats2 = itemPeriod.getStats();
                    Integer numValueOf = stats2 != null ? Integer.valueOf(stats2.getActions()) : null;
                    Iterator it8 = it7;
                    float f12 = actions / maxValue;
                    Stats stats3 = itemPeriod.getStats();
                    arrayList3.add(new StatsBarItem(strValueOf2, numValueOf, f12, null, i13, stats3 != null ? stats3.getVasActions() : null, new ArrayList(), itemPeriod.getDateFormatted(), itemPeriod.getIsCurrentDate(), 8, null));
                    i13 = i14;
                    it6 = it2;
                    it7 = it8;
                }
                it = it6;
                list = arrayList3;
            }
            String title = period2.getTitle();
            if (title == null) {
                title = "";
            }
            arrayList2.add(new StatsPeriodItem(strValueOf, list, title));
            it6 = it;
            i12 = 10;
        }
        arrayList.add(new StatsPlotItem(interfaceC35863o4.a(), arrayList2, iF3));
        arrayList.addAll(d(advertDetailStatsTabItem3.f86184g, true, null, advertDetailStatsTabItem3, this.f86569b));
        AttributedText descriptionDialog = advertStatTab2.getDescriptionDialog();
        if (descriptionDialog != null) {
            arrayList.add(new ButtonItem(interfaceC35863o4.a(), descriptionDialog));
        }
        List<Period> listG3 = advertStatTab2.g();
        Period period3 = listG3 != null ? listG3.get(0) : null;
        if (period3 != null && (transition = period3.getTransition()) != null) {
            arrayList.add(b(transition));
        }
        arrayList.addAll(e(advertDetailStatsTabItem3.f86184g, true, advertDetailStatsTabItem3, interfaceC35863o4));
        return new StatsItemTabState(arrayList, period3, 0, advertDetailStatsTabItem3);
    }

    public final CommonStatsItem b(TransitionStats transitionStats) {
        String strA = this.f86569b.a();
        AttributedText title = transitionStats.getTitle();
        DeepLink deepLink = transitionStats.getDeepLink();
        HintTransactionStats hint = transitionStats.getHint();
        UniversalImage icon = hint != null ? hint.getIcon() : null;
        HintTransactionStats hint2 = transitionStats.getHint();
        return new CommonStatsItem(strA, title, deepLink, icon, hint2 != null ? hint2.getDeepLink() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItemTabState c(com.avito.android.advert_stats.remote.model.detail_stats.Period r34, com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItemTabState r35, com.avito.android.advert_stats.detail.tab.items.chart.StatsBarItem r36) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.h.c(com.avito.android.advert_stats.remote.model.detail_stats.Period, com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItemTabState, com.avito.android.advert_stats.detail.tab.items.chart.StatsBarItem):com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItemTabState");
    }
}

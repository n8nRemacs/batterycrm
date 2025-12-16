package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi;

import OJ0.r;
import OJ0.s;
import OJ0.t;
import OJ0.u;
import OJ0.v;
import OJ0.w;
import RJ0.a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_stats.extended_user_stats.ConfigParams;
import com.avito.android.user_stats.extended_user_stats.StatsConfig;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.date_select.SegmentType;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesItem;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.region.RegionItemData;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.ConstructorTabInternalAction;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.ConstructorTabState;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.split.SplitListDialogItem;
import com.avito.android.user_stats.generated.api.api_1_sellers_private_statistics_general_dynamics_locations_post.Split;
import com.avito.android.util.O2;
import com.avito.user_stats.model.extended_user_stats.DynamicsHintItem;
import com.avito.user_stats.model.extended_user_stats.Hint;
import com.avito.user_stats.model.extended_user_stats.MetricGrouping;
import com.avito.user_stats.model.extended_user_stats.MetricItem;
import com.avito.user_stats.model.extended_user_stats.StatsDates;
import com.avito.user_stats.model.extended_user_stats.StatsDynamicChart;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.F0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ConstructorTabActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LRJ0/a;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabState;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.arch.mvi.a<RJ0.a, ConstructorTabInternalAction, ConstructorTabState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_stats.b f318161a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f318162b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final lE.g f318163c;

    @Inject
    public a(@Y61.k com.avito.android.user_stats.b bVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k lE.g gVar) {
        this.f318161a = bVar;
        this.f318162b = interfaceC28373a;
        this.f318163c = gVar;
    }

    public static StatsConfig d(ConstructorTabState constructorTabState, StatsDates statsDates) {
        Date dateC;
        Date dateD;
        StatsConfig statsConfig = constructorTabState.f318216h;
        Long lValueOf = null;
        if (statsConfig == null) {
            return null;
        }
        if (statsDates != null && (dateD = statsDates.getStart()) != null) {
            lValueOf = Long.valueOf(dateD.getTime());
        }
        return StatsConfig.a(statsConfig, lValueOf, (statsDates == null || (dateC = statsDates.getEnd()) == null) ? 0L : dateC.getTime(), null, null, 0, null, null, 129020);
    }

    public static StatsConfig e(int i12, ConstructorTabState constructorTabState, SegmentType segmentType) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -i12);
        StatsConfig statsConfig = constructorTabState.f318216h;
        if (statsConfig == null) {
            return null;
        }
        long timeInMillis = calendar.getTimeInMillis();
        return StatsConfig.a(statsConfig, Long.valueOf(timeInMillis), Calendar.getInstance().getTimeInMillis(), null, null, 0, segmentType, null, 120828);
    }

    public static String f(ConstructorTabState constructorTabState) {
        String str;
        StatsConfig statsConfig = constructorTabState.f318216h;
        List<String> list = statsConfig != null ? statsConfig.f317160j : null;
        return (list == null || (str = (String) C42745f0.G(list)) == null) ? "" : str;
    }

    public static String g(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1765491736) {
            if (iHashCode != -237485699) {
                if (iHashCode == 50511102 && str.equals("category")) {
                    return "categories";
                }
            } else if (str.equals("searchLocation")) {
                return "search-regions";
            }
        } else if (str.equals("itemLocation")) {
            return "items-regions";
        }
        return null;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r3v21, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v53 */
    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ConstructorTabInternalAction> b(RJ0.a aVar, ConstructorTabState constructorTabState) {
        StatsConfig statsConfigA;
        List<String> list;
        String str;
        List<MetricItem> listD;
        MetricItem metricItem;
        List<Hint> listE;
        List<String> list2;
        List<StatsDates> listC;
        ConfigParams configParams;
        Object next;
        String str2;
        String str3;
        String str4;
        int i12 = 3;
        RJ0.a aVar2 = aVar;
        ConstructorTabState constructorTabState2 = constructorTabState;
        if (aVar2 instanceof a.f) {
            return new C43210w(new ConstructorTabInternalAction.HandleDeeplink(((a.f) aVar2).f14318a));
        }
        boolean z12 = aVar2 instanceof a.i;
        InterfaceC28373a interfaceC28373a = this.f318162b;
        if (z12) {
            a.i iVar = (a.i) aVar2;
            interfaceC28373a.c(new u(iVar.f14323b));
            return new C43210w(new ConstructorTabInternalAction.HandleDeeplink(iVar.f14322a));
        }
        boolean zEquals = aVar2.equals(a.s.f14333a);
        StatsConfig statsConfig = constructorTabState2.f318216h;
        if (zEquals) {
            return i(statsConfig);
        }
        if (aVar2.equals(a.b.f14312a)) {
            return i(statsConfig);
        }
        Integer num = null;
        if (aVar2 instanceof a.w) {
            StatsConfig statsConfig2 = ((a.w) aVar2).f14337a;
            String str5 = (statsConfig == null || (str4 = statsConfig.f317161k) == null) ? "desc" : str4;
            if (statsConfig == null || (str3 = statsConfig.f317167q) == null) {
                str3 = statsConfig2.f317167q;
            }
            return C43175k.E(new C43207v(new InterfaceC43160i[]{new C43210w(new ConstructorTabInternalAction.OnColumnClick(num, 0 == true ? 1 : 0, i12, 0 == true ? 1 : 0)), h(StatsConfig.a(statsConfig2, null, 0L, null, str5, 0, null, str3, 95743))}), F0.f411136a);
        }
        boolean zEquals2 = aVar2.equals(a.l.f14326a);
        List<SplitListDialogItem> list3 = constructorTabState2.f318224p;
        if (zEquals2) {
            return new C43210w(new ConstructorTabInternalAction.OnSplitClick(list3));
        }
        if (aVar2.equals(a.h.f14321a)) {
            return new C43210w(new ConstructorTabInternalAction.OnHideTooltipClick(list3));
        }
        if (aVar2 instanceof a.n) {
            return new C43210w(new ConstructorTabInternalAction.OnSplitHintClick(((a.n) aVar2).f14328a));
        }
        boolean z13 = aVar2 instanceof a.o;
        StatsConfig statsConfig3 = constructorTabState2.f318216h;
        if (z13) {
            Iterator it = constructorTabState2.f318210b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ExpensesItem expensesItem = (ExpensesItem) next;
                if (expensesItem instanceof RegionItemData) {
                    RegionItemData regionItemData = (RegionItemData) expensesItem;
                    if (regionItemData.f318046g && regionItemData.f318042c == ((a.o) aVar2).f14329a) {
                        break;
                    }
                }
            }
            ExpensesItem expensesItem2 = (ExpensesItem) next;
            if (statsConfig == null || (str2 = statsConfig.f317167q) == null) {
                str2 = "";
            }
            boolean z14 = expensesItem2 == null;
            List<String> list4 = statsConfig3 != null ? statsConfig3.f317160j : null;
            interfaceC28373a.c(new w(str2, z14, list4 != null ? O2.a(list4) : false ? "ois_trends" : "trends", f(constructorTabState2)));
            return C43175k.E(new C43207v(new InterfaceC43160i[]{new C43210w(new ConstructorTabInternalAction.ShowSplitUxFeedback(g(str2))), new C43210w(new ConstructorTabInternalAction.OnSplitItemClick(((a.o) aVar2).f14329a))}), F0.f411136a);
        }
        if (aVar2.equals(a.k.f14325a)) {
            String str6 = L.f(statsConfig != null ? statsConfig.f317161k : null, "asc") ? "desc" : "asc";
            ArrayList arrayList = new ArrayList();
            if (statsConfig != null) {
                Iterator it2 = statsConfig.f317154d.iterator();
                while (it2.hasNext()) {
                    arrayList.add((String) it2.next());
                }
                Iterator it3 = statsConfig.f317155e.iterator();
                while (it3.hasNext()) {
                    arrayList.add((String) it3.next());
                }
                Iterator it4 = statsConfig.f317156f.iterator();
                while (it4.hasNext()) {
                    arrayList.add((String) it4.next());
                }
                Iterator it5 = statsConfig.f317157g.iterator();
                while (it5.hasNext()) {
                    arrayList.add((String) it5.next());
                }
                Iterator it6 = statsConfig.f317158h.iterator();
                while (it6.hasNext()) {
                    arrayList.add((String) it6.next());
                }
            }
            List<String> list5 = statsConfig3 != null ? statsConfig3.f317160j : null;
            interfaceC28373a.c(new t(str6, list5 != null ? O2.a(list5) : false ? "ois_trends" : "trends", f(constructorTabState2), arrayList));
            return i(statsConfig != null ? StatsConfig.a(statsConfig, null, 0L, null, str6, 0, null, null, 128511) : null);
        }
        if (aVar2 instanceof a.j) {
            interfaceC28373a.c(new OJ0.i(((a.j) aVar2).f14324a ? ConstraintKt.CONDITION_FLOW_HIDE : "show", f(constructorTabState2)));
            return new C43210w(ConstructorTabInternalAction.OnOpenVasesClick.f318192b);
        }
        if (aVar2.equals(a.r.f14332a)) {
            return c(statsConfig);
        }
        if (aVar2.equals(a.q.f14331a)) {
            return h(statsConfig);
        }
        if (aVar2.equals(a.c.f14313a)) {
            return new C43210w(ConstructorTabInternalAction.OnCloseSplitDialog.f318187b);
        }
        if (aVar2.equals(a.t.f14334a)) {
            String str7 = (statsConfig == null || (configParams = statsConfig.f317164n) == null) ? null : configParams.f317006b;
            InterfaceC43160i interfaceC43160iW = (str7 == null || !C43066x.q(str7, ".test", false)) ? C43175k.w() : new C43210w(ConstructorTabInternalAction.ShowABUxFeedback.f318202b);
            C43210w c43210w = new C43210w(ConstructorTabInternalAction.ScreenOpened.f318201b);
            C43210w c43210w2 = new C43210w(ConstructorTabInternalAction.ShowVisitUxFeedback.f318207b);
            List<String> list6 = statsConfig3 != null ? statsConfig3.f317160j : null;
            return C43175k.E(new C43207v(new InterfaceC43160i[]{interfaceC43160iW, c43210w, c43210w2, list6 != null ? O2.a(list6) : false ? new C43210w(ConstructorTabInternalAction.ShowOneStatsOpenUxFeedback.f318205b) : C43175k.w()}), F0.f411136a);
        }
        boolean z15 = aVar2 instanceof a.d;
        StatsDynamicChart statsDynamicChart = constructorTabState2.f318223o;
        StatsDates statsDates = constructorTabState2.f318221m;
        Integer num2 = constructorTabState2.f318220l;
        if (z15) {
            a.d dVar = (a.d) aVar2;
            List<String> list7 = statsConfig3 != null ? statsConfig3.f317160j : null;
            interfaceC28373a.c(new OJ0.b(dVar.f14315b, list7 != null ? O2.a(list7) : false ? "ois_trends" : "trends", f(constructorTabState2), false, 8, null));
            Integer num3 = dVar.f14314a;
            return C43175k.E(new C43207v(new InterfaceC43160i[]{i(d(constructorTabState2, num3.equals(num2) ? statsDates : (statsDynamicChart == null || (listC = statsDynamicChart.c()) == null) ? null : listC.get(num3.intValue()))), new C43210w(new ConstructorTabInternalAction.OnColumnClick(num3, dVar.f14315b))}), F0.f411136a);
        }
        if (aVar2 instanceof a.C0952a) {
            return i(e(6, constructorTabState2, SegmentType.f317719d));
        }
        if (aVar2 instanceof a.u) {
            String str8 = (statsConfig == null || (list2 = statsConfig.f317158h) == null) ? null : (String) C42745f0.G(list2);
            if (str8 == null) {
                str8 = "";
            }
            interfaceC28373a.c(new r(str8, f(constructorTabState2)));
            Hint hint = (statsDynamicChart == null || (listD = statsDynamicChart.d()) == null || (metricItem = (MetricItem) C42745f0.G(listD)) == null || (listE = metricItem.e()) == null) ? null : (Hint) C42745f0.G(listE);
            return hint == null ? C43175k.w() : new C43210w(new ConstructorTabInternalAction.OnMetricHintClick(hint));
        }
        if (aVar2 instanceof a.v) {
            DynamicsHintItem dynamicsHintItem = ((a.v) aVar2).f14336a;
            AttributedText attributedTextC = dynamicsHintItem.getTitle();
            String text = attributedTextC != null ? attributedTextC.getText() : null;
            AttributedText description = dynamicsHintItem.getDescription();
            return new C43210w(new ConstructorTabInternalAction.OnMetricHintClick(new Hint(text, description != null ? description.getText() : null, null)));
        }
        if (!(aVar2 instanceof a.e)) {
            if (aVar2.equals(a.p.f14330a)) {
                List<String> list8 = statsConfig3 != null ? statsConfig3.f317160j : null;
                interfaceC28373a.c(new OJ0.b(null, list8 != null ? O2.a(list8) : false ? "ois_trends" : "trends", f(constructorTabState2), true));
                StatsConfig statsConfigD = d(constructorTabState2, statsDates);
                return num2 == null ? new C43210w(new ConstructorTabInternalAction.OnPeriodClick(statsConfigD, SegmentType.f317720e)) : C43175k.E(new C43207v(new InterfaceC43160i[]{new C43210w(new ConstructorTabInternalAction.OnColumnClick(null, 0 == true ? 1 : 0, i12, 0 == true ? 1 : 0)), i(statsConfigD)}), F0.f411136a);
            }
            if (!(aVar2 instanceof a.m)) {
                return C43175k.w();
            }
            String str9 = ((a.m) aVar2).f14327a.f318253b;
            interfaceC28373a.c(new s(str9));
            ArrayList arrayList2 = (statsConfig == null || (list = statsConfig.f317158h) == null) ? null : new ArrayList(list);
            if (statsConfig != null) {
                statsConfigA = StatsConfig.a(statsConfig, null, 0L, arrayList2 == null ? C42784z0.f406748b : arrayList2, null, 0, null, str9, 96191);
            } else {
                statsConfigA = null;
            }
            return C43175k.E(new C43207v(new InterfaceC43160i[]{new C43210w(new ConstructorTabInternalAction.ShowSplitUxFeedback(g(str9))), new C43210w(new ConstructorTabInternalAction.OnSplitDialogClick(statsConfigA, str9)), i(statsConfigA)}), F0.f411136a);
        }
        a.e eVar = (a.e) aVar2;
        SegmentType segmentType = SegmentType.f317718c;
        int i13 = eVar.f14316a;
        if (i13 == 0) {
            str = "today";
        } else if (i13 == 1) {
            str = "week";
        } else {
            str = SelectionType.TYPE_MONTH;
            if (i13 != 2 && i13 == 3) {
                str = SelectionType.TYPE_YEAR;
            }
        }
        String strA = OJ0.n.a(Collections.singletonList(str));
        List<String> list9 = statsConfig3 != null ? statsConfig3.f317160j : null;
        interfaceC28373a.c(new OJ0.m("time_preset", strA, list9 != null ? O2.a(list9) : false ? "ois_trends" : "trends", f(constructorTabState2), ""));
        SegmentType segmentType2 = SegmentType.f317718c;
        if (i13 == 0) {
            StatsConfig statsConfigE = e(6, constructorTabState2, segmentType2);
            return C43175k.D(new C43207v(new InterfaceC43160i[]{new C43210w(new ConstructorTabInternalAction.OnPeriodClick(statsConfigE, segmentType2)), c(statsConfigE), i(d(ConstructorTabState.a(constructorTabState2, null, null, null, null, null, statsConfig != null ? StatsConfig.a(statsConfig, null, 0L, null, null, null, segmentType2, null, 122879) : null, null, null, false, null, null, null, null, null, null, 65471), new StatsDates(null, new Date(), new Date(), null, null, 25, null))), new C43210w(new ConstructorTabInternalAction.OnSelectedPeriod(eVar.f14317b))}));
        }
        SegmentType segmentType3 = SegmentType.f317719d;
        if (i13 == 1) {
            return j(6, constructorTabState2, eVar, segmentType3);
        }
        SegmentType segmentType4 = SegmentType.f317720e;
        if (i13 == 2) {
            return j(29, constructorTabState2, eVar, segmentType4);
        }
        return i13 == 3 ? j(364, constructorTabState2, eVar, SegmentType.f317721f) : C43175k.w();
    }

    public final InterfaceC43160i<ConstructorTabInternalAction> c(StatsConfig statsConfig) {
        lE.g gVar = this.f318163c;
        gVar.getClass();
        kotlin.reflect.n<Object> nVar = lE.g.f413657e[0];
        boolean zBooleanValue = ((Boolean) gVar.f413658b.a().invoke()).booleanValue();
        com.avito.android.user_stats.b bVar = this.f318161a;
        return zBooleanValue ? bVar.h(statsConfig) : bVar.d(statsConfig);
    }

    public final InterfaceC43160i<ConstructorTabInternalAction> h(StatsConfig statsConfig) {
        return statsConfig != null ? statsConfig.c() : false ? C43175k.E(new C43207v(new InterfaceC43160i[]{c(statsConfig), i(statsConfig)}), F0.f411136a) : c(statsConfig);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final InterfaceC43160i<ConstructorTabInternalAction> i(StatsConfig statsConfig) {
        List<MetricGrouping> list;
        MetricGrouping metricGrouping;
        Integer num;
        if (!(statsConfig != null ? statsConfig.c() : false)) {
            return C43175k.w();
        }
        this.f318162b.c(new v((((statsConfig == null || (num = statsConfig.f317163m) == null) ? 0 : num.intValue()) / 20) + 1));
        String slug = null;
        String str = statsConfig != null ? statsConfig.f317167q : null;
        if (str == null || str.length() == 0) {
            if (statsConfig != null && (list = statsConfig.f317166p) != null && (metricGrouping = (MetricGrouping) C42745f0.G(list)) != null) {
                slug = metricGrouping.getSlug();
            }
        } else if (statsConfig != null) {
            slug = statsConfig.f317167q;
        }
        if (slug != null) {
            int iHashCode = slug.hashCode();
            com.avito.android.user_stats.b bVar = this.f318161a;
            switch (iHashCode) {
                case -1765491736:
                    if (slug.equals("itemLocation")) {
                        return bVar.i(statsConfig, Split.ItemLocation);
                    }
                    break;
                case -237485699:
                    if (slug.equals("searchLocation")) {
                        return bVar.i(statsConfig, Split.SearchLocation);
                    }
                    break;
                case 3242771:
                    if (slug.equals("item")) {
                        return bVar.c(statsConfig);
                    }
                    break;
                case 50511102:
                    if (slug.equals("category")) {
                        return bVar.f(statsConfig);
                    }
                    break;
            }
        }
        return C43175k.w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC43160i<ConstructorTabInternalAction> j(int i12, ConstructorTabState constructorTabState, a.e eVar, SegmentType segmentType) {
        StatsConfig statsConfigE = e(i12, constructorTabState, segmentType);
        return C43175k.E(new C43207v(new InterfaceC43160i[]{new C43210w(new ConstructorTabInternalAction.OnColumnClick(null, eVar.f14317b, 1, 0 == true ? 1 : 0)), new C43210w(new ConstructorTabInternalAction.OnPeriodClick(statsConfigE, segmentType)), h(statsConfigE)}), F0.f411136a);
    }
}

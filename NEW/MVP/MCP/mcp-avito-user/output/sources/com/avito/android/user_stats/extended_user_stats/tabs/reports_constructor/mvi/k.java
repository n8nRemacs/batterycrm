package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_stats.extended_user_stats.ConfigParams;
import com.avito.android.user_stats.extended_user_stats.MetricParams;
import com.avito.android.user_stats.extended_user_stats.StatsConfig;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.chart.ChartExpensesItem;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.date_select.DateSelectItem;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.date_select.SegmentType;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total.TotalItemData;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.DataStatus;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesItem;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.empty_items.EmptyItemsData;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.hint.MetricHintItemData;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.horizontal_chart.HorizontalColumnItem;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.item_loader.LoaderItemData;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.skeleton_chart.SkeletonChartItem;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.skeleton_items.SkeletonItemsItem;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.space.SpaceItemData;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.value_item.ValueItemData;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.vas_item.VasItemData;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.vas_item_detail.VasItemDetailData;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.ConstructorTabInternalAction;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.ConstructorTabState;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.PaginationState;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.user_stats.model.extended_user_stats.DynamicsHintItem;
import com.avito.user_stats.model.extended_user_stats.DynamicsSummary;
import com.avito.user_stats.model.extended_user_stats.DynamicsVas;
import com.avito.user_stats.model.extended_user_stats.MetricItem;
import com.avito.user_stats.model.extended_user_stats.MetricTotal;
import com.avito.user_stats.model.extended_user_stats.SplitMetricsItem;
import com.avito.user_stats.model.extended_user_stats.StatsDates;
import com.avito.user_stats.model.extended_user_stats.StatsSplitLocal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ConstructorTabReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabInternalAction;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabState;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k implements u<ConstructorTabInternalAction, ConstructorTabState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f318240b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_stats.extended_user_stats.m f318241c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.o f318242d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final p f318243e;

    /* compiled from: ConstructorTabReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f318244a;

        static {
            int[] iArr = new int[SegmentType.values().length];
            try {
                SegmentType segmentType = SegmentType.f317718c;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SegmentType segmentType2 = SegmentType.f317718c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f318244a = iArr;
        }
    }

    @Inject
    public k(@Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k lE.g gVar, @Y61.k com.avito.android.user_stats.extended_user_stats.m mVar, @Y61.k QJ0.f fVar) {
        this.f318240b = interfaceC35863o4;
        this.f318241c = mVar;
        this.f318242d = new com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.o(interfaceC35863o4, fVar);
        this.f318243e = new p(interfaceC35863o4, fVar);
    }

    public static void e(ArrayList arrayList, ConstructorTabState constructorTabState) {
        for (ExpensesItem expensesItem : constructorTabState.f318210b) {
            boolean z12 = expensesItem instanceof SkeletonChartItem;
            boolean z13 = expensesItem instanceof SkeletonItemsItem;
            if (!(expensesItem instanceof LoaderItemData) && !z12 && !z13) {
                arrayList.add(expensesItem);
            }
        }
    }

    public static ArrayList j(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ExpensesItem expensesItem = (ExpensesItem) it.next();
            boolean z12 = expensesItem instanceof ChartExpensesItem;
            boolean z13 = expensesItem instanceof MetricHintItemData;
            boolean z14 = expensesItem instanceof HorizontalColumnItem;
            boolean z15 = expensesItem instanceof DateSelectItem;
            boolean z16 = expensesItem instanceof SkeletonChartItem;
            boolean z17 = expensesItem instanceof ValueItemData;
            boolean z18 = expensesItem instanceof VasItemData;
            boolean z19 = expensesItem instanceof VasItemDetailData;
            boolean z22 = expensesItem instanceof EmptyItemsData;
            if (!(expensesItem instanceof TotalItemData) && !z12 && !z13 && !z16 && !z14 && !z15 && !z17 && !z18 && !z19 && !z22) {
                arrayList.add(expensesItem);
            }
        }
        return arrayList;
    }

    public static boolean n(StatsConfig statsConfig) {
        Integer num;
        return ((statsConfig == null || (num = statsConfig.f317163m) == null) ? 0 : num.intValue()) == 0;
    }

    public static boolean o(Calendar calendar, Calendar calendar2) {
        return calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0712  */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.ConstructorTabState a(com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.ConstructorTabInternalAction r40, com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.ConstructorTabState r41) {
        /*
            Method dump skipped, instructions count: 2846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.k.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final void b(ArrayList arrayList, DataStatus dataStatus) {
        Object next;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((ExpensesItem) next) instanceof SkeletonChartItem) {
                    break;
                }
            }
        }
        if (next == null && dataStatus == DataStatus.f317809c) {
            arrayList.add(new SkeletonChartItem(this.f318240b.a()));
        }
    }

    public final void c(ArrayList arrayList, DataStatus dataStatus) {
        Object next;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((ExpensesItem) next) instanceof SkeletonItemsItem) {
                    break;
                }
            }
        }
        if (next == null && dataStatus == DataStatus.f317809c) {
            arrayList.add(new SkeletonItemsItem(this.f318240b.a()));
        }
    }

    public final void d(ArrayList arrayList, ConstructorTabState constructorTabState) {
        for (ExpensesItem expensesItem : constructorTabState.f318210b) {
            boolean z12 = expensesItem instanceof ChartExpensesItem;
            boolean z13 = expensesItem instanceof MetricHintItemData;
            boolean z14 = expensesItem instanceof HorizontalColumnItem;
            boolean z15 = expensesItem instanceof DateSelectItem;
            boolean z16 = expensesItem instanceof ValueItemData;
            boolean z17 = expensesItem instanceof VasItemData;
            boolean z18 = expensesItem instanceof VasItemDetailData;
            if ((expensesItem instanceof TotalItemData) || z12 || z13 || z14 || z15 || z16 || z17 || z18) {
                arrayList.add(expensesItem);
            }
        }
        b(arrayList, constructorTabState.f318212d);
    }

    public final Calendar f(int i12, ArrayList arrayList) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(5, -i12);
        arrayList.add(this.f318242d.d(new StatsDates(null, calendar2.getTime(), calendar.getTime(), C42784z0.f406748b, null, 16, null)));
        return calendar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.ConstructorTabState g(com.avito.android.user_stats.extended_user_stats.StatsConfig r47, com.avito.user_stats.model.extended_user_stats.StatsDynamicChart r48, com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.ConstructorTabState r49) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.k.g(com.avito.android.user_stats.extended_user_stats.StatsConfig, com.avito.user_stats.model.extended_user_stats.StatsDynamicChart, com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.ConstructorTabState):com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.ConstructorTabState");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HorizontalColumnItem h(ConstructorTabState constructorTabState, MetricItem metricItem, long j12, long j13) {
        String str;
        ArrayList arrayList;
        long j14 = (100 * j12) / j13;
        ConfigParams configParams = constructorTabState.f318218j;
        MetricParams metricParams = null;
        if (configParams != null && (arrayList = configParams.f317007c) != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (L.f(((MetricParams) next).f317148b, metricItem.getSlug())) {
                    metricParams = next;
                    break;
                }
            }
            metricParams = metricParams;
        }
        String strA = this.f318240b.a();
        if (metricParams == null || (str = metricParams.f317151e) == null) {
            str = "";
        }
        return new HorizontalColumnItem(strA, str, (int) j14, m.b(Long.valueOf(j12), metricItem), metricItem.getPlotColor());
    }

    public final ArrayList i(MetricItem metricItem, ConstructorTabState constructorTabState) {
        List<MetricItem> listC;
        MetricTotal metricTotalI;
        ArrayList arrayList = new ArrayList();
        Long lC2 = (metricItem == null || (metricTotalI = metricItem.getTotal()) == null) ? null : metricTotalI.getValue();
        List<MetricItem> listB0 = (metricItem == null || (listC = metricItem.c()) == null) ? null : C42745f0.B0(listC, new l());
        if (listB0 != null) {
            for (MetricItem metricItem2 : listB0) {
                MetricTotal metricTotalI2 = metricItem2.getTotal();
                Long lC3 = metricTotalI2 != null ? metricTotalI2.getValue() : null;
                if (lC3 != null && lC3.longValue() != 0 && lC2 != null && lC2.longValue() != 0 && !L.f(metricItem.getHidePeriodDetalization(), Boolean.TRUE)) {
                    arrayList.add(h(constructorTabState, metricItem2, lC3.longValue(), lC2.longValue()));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(new SpaceItemData(this.f318240b.a()));
        }
        return arrayList;
    }

    public final DateSelectItem k(ConstructorTabState constructorTabState, Calendar calendar, Calendar calendar2, double d12) {
        Calendar calendar3 = Calendar.getInstance();
        StatsDates statsDates = new StatsDates(null, calendar3.getTime(), calendar3.getTime(), C42784z0.f406748b, null, 16, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f318242d.d(statsDates));
        Calendar calendarF = f(6, arrayList);
        Calendar calendarF2 = f(29, arrayList);
        Calendar calendarF3 = f(364, arrayList);
        boolean zO2 = o(calendar2, calendar3);
        SegmentType segmentType = null;
        if (zO2) {
            if (o(calendar, calendarF)) {
                SegmentType segmentType2 = constructorTabState.f318222n;
                segmentType = SegmentType.f317718c;
                if ((segmentType2 != segmentType && constructorTabState.f318220l == null) || d12 == 0.0d) {
                    segmentType = SegmentType.f317719d;
                }
            } else if (o(calendar, calendarF2)) {
                segmentType = SegmentType.f317720e;
            } else if (o(calendar, calendarF3)) {
                segmentType = SegmentType.f317721f;
            }
        }
        return new DateSelectItem(this.f318240b.a(), segmentType, arrayList);
    }

    public final ConstructorTabState l(StatsConfig statsConfig, ConstructorTabState constructorTabState, StatsSplitLocal statsSplitLocal) {
        ConfigParams configParams;
        if (statsConfig == null || (configParams = statsConfig.f317164n) == null) {
            configParams = constructorTabState.f318218j;
        }
        ConfigParams configParams2 = configParams;
        boolean zN2 = n(statsConfig);
        ArrayList arrayList = new ArrayList();
        if (zN2) {
            d(arrayList, constructorTabState);
            if (statsConfig != null) {
                p.b(this.f318243e, arrayList, statsConfig, statsSplitLocal.f338664c.size());
            }
        } else {
            e(arrayList, constructorTabState);
        }
        this.f318243e.a(arrayList, (SplitMetricsItem) C42745f0.G(statsSplitLocal.f338663b), statsSplitLocal.f338664c, 0, C42784z0.f406748b);
        int size = arrayList.size();
        return ConstructorTabState.a(constructorTabState, arrayList, DataStatus.f317808b, null, null, statsSplitLocal, statsConfig != null ? StatsConfig.a(statsConfig, null, 0L, null, null, Integer.valueOf(size), null, null, 129023) : null, new PaginationState.Loaded(statsSplitLocal.f338665d > ((long) size)), configParams2, zN2, null, null, null, null, null, null, 64540);
    }

    public final ArrayList m(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DynamicsSummary dynamicsSummary = (DynamicsSummary) it.next();
                List<DynamicsVas> listC = dynamicsSummary.c();
                InterfaceC35863o4 interfaceC35863o4 = this.f318240b;
                if (listC == null || listC.isEmpty()) {
                    String strA = dynamicsSummary.getTotal() != null ? m.a(dynamicsSummary.getTotal().getValue(), dynamicsSummary.getType(), null) : "—";
                    String strA2 = interfaceC35863o4.a();
                    AttributedText attributedTextE = dynamicsSummary.getTitle();
                    List<DynamicsHintItem> listD = dynamicsSummary.d();
                    arrayList.add(new ValueItemData(strA2, attributedTextE, strA, listD != null ? (DynamicsHintItem) C42745f0.G(listD) : null));
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    List<DynamicsVas> listC2 = dynamicsSummary.c();
                    if (listC2 != null) {
                        Iterator<T> it2 = listC2.iterator();
                        while (it2.hasNext()) {
                            Image imageC = ((DynamicsVas) it2.next()).getIcon();
                            if (imageC != null) {
                                arrayList2.add(imageC);
                            }
                        }
                    }
                    arrayList.add(new VasItemData(interfaceC35863o4.a(), dynamicsSummary.getTitle(), false, C42745f0.v(arrayList2), 4, null));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList p(java.lang.Integer r22, com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.ConstructorTabState r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.k.p(java.lang.Integer, com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.ConstructorTabState, boolean):java.util.ArrayList");
    }
}

package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi;

import com.avito.android.remote.model.Image;
import com.avito.android.user_stats.extended_user_stats.StatsConfig;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.region.RegionItemData;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.sort_split.SplitItemData;
import com.avito.android.user_stats.generated.api.api_1_sellers_private_statistics_general_dynamics_categories_post.DynamicCategory;
import com.avito.android.user_stats.generated.api.api_1_sellers_private_statistics_general_dynamics_categories_post.OkRespDataSuccessMetricsItem;
import com.avito.android.user_stats.generated.api.api_1_sellers_private_statistics_general_dynamics_locations_post.OkRespDataSuccessMetricsItem2;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.O2;
import com.avito.user_stats.model.extended_user_stats.DynamicItemsMetrics;
import com.avito.user_stats.model.extended_user_stats.DynamicSplitItems;
import com.avito.user_stats.model.extended_user_stats.DynamicSplitTooltip;
import com.avito.user_stats.model.extended_user_stats.MetricGrouping;
import com.avito.user_stats.model.extended_user_stats.MetricItem;
import com.avito.user_stats.model.extended_user_stats.SplitMetricsItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StatsSplitsHelper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/p;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f318249a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final QJ0.f f318250b;

    /* compiled from: StatsSplitsHelper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f318251a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f318252b;

        static {
            int[] iArr = new int[OkRespDataSuccessMetricsItem.Type.values().length];
            try {
                iArr[OkRespDataSuccessMetricsItem.Type.Regular.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OkRespDataSuccessMetricsItem.Type.Money.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OkRespDataSuccessMetricsItem.Type.Conversion.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f318251a = iArr;
            int[] iArr2 = new int[OkRespDataSuccessMetricsItem2.Type.values().length];
            try {
                iArr2[OkRespDataSuccessMetricsItem2.Type.Regular.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OkRespDataSuccessMetricsItem2.Type.Money.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OkRespDataSuccessMetricsItem2.Type.Conversion.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f318252b = iArr2;
        }
    }

    public p(@Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k QJ0.f fVar) {
        this.f318249a = interfaceC35863o4;
        this.f318250b = fVar;
    }

    public static void b(p pVar, ArrayList arrayList, StatsConfig statsConfig, int i12) {
        MetricGrouping metricGrouping;
        String str;
        MetricGrouping metricGrouping2;
        String title;
        Object next;
        pVar.getClass();
        List<MetricGrouping> list = statsConfig.f317166p;
        String title2 = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (L.f(((MetricGrouping) next).getSlug(), statsConfig.f317167q)) {
                        break;
                    }
                }
            }
            metricGrouping = (MetricGrouping) next;
        } else {
            metricGrouping = null;
        }
        if (metricGrouping == null || (title = metricGrouping.getTitle()) == null) {
            if (list != null && (metricGrouping2 = (MetricGrouping) C42745f0.E(list)) != null) {
                title2 = metricGrouping2.getTitle();
            }
            str = title2;
        } else {
            str = title;
        }
        arrayList.add(new SplitItemData(pVar.f318249a.a(), str, statsConfig.f317161k, i12 > 1, false, O2.a(statsConfig.f317160j)));
    }

    public static DynamicSplitItems c(DynamicCategory dynamicCategory) {
        ArrayList arrayList;
        List<DynamicCategory> listA = dynamicCategory.a();
        if (listA != null) {
            List<DynamicCategory> list = listA;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c((DynamicCategory) it.next()));
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        long id2 = dynamicCategory.getId();
        List<WJ0.b> listC = dynamicCategory.c();
        ArrayList arrayList3 = new ArrayList(C42745f0.q(listC, 10));
        for (WJ0.b bVar : listC) {
            arrayList3.add(new DynamicItemsMetrics(bVar.getMissingValueTooltip(), bVar.getSlug(), bVar.getValue()));
        }
        return new DynamicSplitItems(arrayList2, id2, arrayList3, dynamicCategory.getTitle(), null);
    }

    public static DynamicSplitItems d(XJ0.b bVar) {
        ArrayList arrayList;
        String text;
        List<XJ0.b> listA = bVar.a();
        if (listA != null) {
            List<XJ0.b> list = listA;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(d((XJ0.b) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        long id2 = bVar.getId();
        List<XJ0.d> listC = bVar.c();
        ArrayList arrayList3 = new ArrayList(C42745f0.q(listC, 10));
        for (XJ0.d dVar : listC) {
            arrayList3.add(new DynamicItemsMetrics(dVar.getMissingValueTooltip(), dVar.getSlug(), dVar.getValue()));
        }
        String title = bVar.getTitle();
        XJ0.c tooltip = bVar.getTooltip();
        Image image = tooltip != null ? tooltip.getImage() : null;
        XJ0.c tooltip2 = bVar.getTooltip();
        if (tooltip2 == null || (text = tooltip2.getText()) == null) {
            text = "";
        }
        return new DynamicSplitItems(arrayList, id2, arrayList3, title, new DynamicSplitTooltip(image, text));
    }

    public final void a(@Y61.k ArrayList arrayList, @Y61.l SplitMetricsItem splitMetricsItem, @Y61.l List list, int i12, @Y61.k List list2) {
        p pVar;
        if (splitMetricsItem == null || list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DynamicSplitItems dynamicSplitItems = (DynamicSplitItems) it.next();
            Iterator it2 = dynamicSplitItems.f338644d.iterator();
            long jLongValue = 0;
            while (it2.hasNext()) {
                Long l12 = ((DynamicItemsMetrics) it2.next()).f338641d;
                jLongValue += l12 != null ? l12.longValue() : 0L;
            }
            boolean z12 = true;
            ArrayList arrayList2 = dynamicSplitItems.f338642b;
            boolean z13 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
            if (z13 && list2.contains(Long.valueOf(dynamicSplitItems.f338643c))) {
                pVar = this;
            } else {
                pVar = this;
                z12 = false;
            }
            String strA = pVar.f318249a.a();
            String strB = m.b(Long.valueOf(jLongValue), new MetricItem(splitMetricsItem.f338657c, splitMetricsItem.f338660f.f338655b, null, null, splitMetricsItem.f338658d, null, null, null, null, Boolean.FALSE));
            DynamicSplitTooltip dynamicSplitTooltip = dynamicSplitItems.f338646f;
            arrayList.add(new RegionItemData(strA, dynamicSplitItems.f338643c, dynamicSplitItems.f338645e, strB, dynamicSplitTooltip != null ? dynamicSplitTooltip.f338648c : null, z12, z13, i12));
            if (z12) {
                a(arrayList, splitMetricsItem, dynamicSplitItems.f338642b, i12 + 1, list2);
            }
        }
    }
}

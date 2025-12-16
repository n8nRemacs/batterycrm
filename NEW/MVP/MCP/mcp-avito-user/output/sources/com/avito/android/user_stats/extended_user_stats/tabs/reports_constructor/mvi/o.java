package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi;

import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_stats.generated.api.api_2_sellers_private_statistics_general_dynamics_dates_post.DynamicsAppsSummary;
import com.avito.user_stats.model.extended_user_stats.DynamicsHintItem;
import com.avito.user_stats.model.extended_user_stats.DynamicsSummary;
import com.avito.user_stats.model.extended_user_stats.DynamicsTotal;
import com.avito.user_stats.model.extended_user_stats.DynamicsVas;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ContentChartApiConverter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o {
    public static final DynamicsSummary a(DynamicsAppsSummary dynamicsAppsSummary) {
        ArrayList arrayList;
        AttributedText title = dynamicsAppsSummary.getTitle();
        ArrayList arrayList2 = null;
        DynamicsTotal dynamicsTotal = dynamicsAppsSummary.getTotal() == null ? null : new DynamicsTotal(dynamicsAppsSummary.getTotal().getValue());
        DynamicsAppsSummary.Type type = dynamicsAppsSummary.getType();
        String str = type != null ? type.f318286b : null;
        List<YJ0.c> listB = dynamicsAppsSummary.b();
        if (listB != null) {
            List<YJ0.c> list = listB;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (YJ0.c cVar : list) {
                arrayList.add(new DynamicsHintItem(cVar.getDescription(), cVar.getTitle()));
            }
        } else {
            arrayList = null;
        }
        List<YJ0.e> listA = dynamicsAppsSummary.a();
        if (listA != null) {
            List<YJ0.e> list2 = listA;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
            for (YJ0.e eVar : list2) {
                arrayList3.add(new DynamicsVas(eVar.getIcon(), eVar.getName(), eVar.getPeriod(), eVar.getSlug()));
            }
            arrayList2 = arrayList3;
        }
        return new DynamicsSummary(arrayList2, arrayList, title, dynamicsTotal, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.avito.user_stats.model.extended_user_stats.MetricItem b(com.avito.android.user_stats.generated.api.api_2_sellers_private_statistics_general_dynamics_dates_post.DynamicsDatesAppsMetricsItemV2 r15) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.o.b(com.avito.android.user_stats.generated.api.api_2_sellers_private_statistics_general_dynamics_dates_post.DynamicsDatesAppsMetricsItemV2):com.avito.user_stats.model.extended_user_stats.MetricItem");
    }
}

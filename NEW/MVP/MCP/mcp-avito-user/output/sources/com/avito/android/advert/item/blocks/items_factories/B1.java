package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.remote.fmp.AnalyticsEvent;
import com.avito.android.remote.model.fmp.util.FmpAnalyticsEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsFmpCalculatorItemFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-details_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class B1 {
    public static final ArrayList a(List list) {
        List<FmpAnalyticsEvent> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (FmpAnalyticsEvent fmpAnalyticsEvent : list2) {
            arrayList.add(new AnalyticsEvent(fmpAnalyticsEvent.getId(), fmpAnalyticsEvent.getParams(), fmpAnalyticsEvent.getVersion(), fmpAnalyticsEvent.getHasSensitiveData()));
        }
        return arrayList;
    }
}

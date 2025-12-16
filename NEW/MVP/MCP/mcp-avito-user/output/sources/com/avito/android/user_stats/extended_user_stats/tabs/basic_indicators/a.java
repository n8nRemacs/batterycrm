package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BasicIndicatorUnitComparator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/a;", "Lcom/avito/android/recycler/data_aware/b;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.recycler.data_aware.b {
    @Inject
    public a() {
    }

    @Override // com.avito.android.recycler.data_aware.b
    public final boolean a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        if (L.f(aVar != null ? Long.valueOf(aVar.getF117182c()) : null, aVar2 != null ? Long.valueOf(aVar2.getF117182c()) : null) && (aVar instanceof com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.e) && (aVar2 instanceof com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.e)) {
            return L.f(((com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.e) aVar).f317473b, ((com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.e) aVar2).f317473b);
        }
        return false;
    }
}

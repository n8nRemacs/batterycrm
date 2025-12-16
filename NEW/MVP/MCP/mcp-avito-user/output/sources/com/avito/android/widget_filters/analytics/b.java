package com.avito.android.widget_filters.analytics;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: WidgetFiltersAnalyticsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/analytics/b;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {
    void a(@Y61.k ParametrizedClickStreamEvent parametrizedClickStreamEvent);

    void b(@Y61.k a aVar, @Y61.k Map<String, String> map);

    void c(@Y61.l String str, @Y61.l String str2, @Y61.l Map map);

    void d(@Y61.l String str, @Y61.l ArrayList arrayList);

    void e(@Y61.k a aVar);

    void f(@Y61.l String str);
}

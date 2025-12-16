package com.avito.android.widget_filters.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.widget_filters.WidgetFiltersOpenParams;
import java.util.ArrayList;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WidgetFiltersAnalyticsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/analytics/c;", "Lcom/avito/android/widget_filters/analytics/b;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f329706a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f329707b;

    @Inject
    public c(@Y61.k WidgetFiltersOpenParams widgetFiltersOpenParams, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f329706a = interfaceC28373a;
        this.f329707b = widgetFiltersOpenParams.f329690d;
    }

    @Override // com.avito.android.widget_filters.analytics.b
    public final void a(@Y61.k ParametrizedClickStreamEvent parametrizedClickStreamEvent) {
        this.f329706a.c(parametrizedClickStreamEvent);
    }

    @Override // com.avito.android.widget_filters.analytics.b
    public final void b(@Y61.k a aVar, @Y61.k Map<String, String> map) {
        this.f329706a.c(new LP0.b(this.f329707b, aVar.getName(), map));
    }

    @Override // com.avito.android.widget_filters.analytics.b
    public final void c(@Y61.l String str, @Y61.l String str2, @Y61.l Map map) {
        this.f329706a.c(new LP0.d(str, str2, this.f329707b, map));
    }

    @Override // com.avito.android.widget_filters.analytics.b
    public final void d(@Y61.l String str, @Y61.l ArrayList arrayList) {
        this.f329706a.c(new LP0.e(str, this.f329707b, arrayList));
    }

    @Override // com.avito.android.widget_filters.analytics.b
    public final void e(@Y61.k a aVar) {
        this.f329706a.c(new LP0.c(this.f329707b, aVar.getName()));
    }

    @Override // com.avito.android.widget_filters.analytics.b
    public final void f(@Y61.l String str) {
        this.f329706a.c(new LP0.a(str, this.f329707b));
    }
}

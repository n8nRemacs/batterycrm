package com.avito.android.search.filter.analytics;

import com.avito.android.remote.model.SerpDisplayType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: FilterAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/analytics/c;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface c {
    void a(@Y61.l String str);

    void b(@Y61.l String str);

    int c();

    void d(@Y61.k Map<String, String> map);

    void e();

    void f(boolean z12);

    @Y61.l
    String g();

    void h(@Y61.k Map<String, ? extends Object> map);

    void i(@Y61.k String str, @Y61.l String str2, @Y61.l String str3);

    void j(@Y61.l String str);

    void k(@Y61.l String str, @Y61.k String str2, @Y61.k String str3, @Y61.k List<String> list, @Y61.k List<String> list2, @Y61.k String str4, @Y61.l String str5);

    void l();

    void m(@Y61.k SerpDisplayType serpDisplayType, @Y61.l String str);
}

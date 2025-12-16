package com.avito.android.search.filter;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.Radius;
import com.avito.android.select.ResetResult;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: FiltersPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/e0;", "", "a", "b", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.search.filter.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC34566e0 {

    /* compiled from: FiltersPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/e0$a;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.search.filter.e0$a */
    public interface a {
        @Y61.k
        String c();
    }

    /* compiled from: FiltersPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/e0$b;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.search.filter.e0$b */
    public interface b {

        /* compiled from: FiltersPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.search.filter.e0$b$a */
        public static final class a {
        }

        void Y1(@Y61.k DeepLink deepLink);
    }

    void a();

    void c0();

    void d0();

    void e0();

    void f(@Y61.k String str, @Y61.k Map<String, ? extends Set<String>> map);

    void i0();

    void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list);

    void l(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k Map map);

    void m(@Y61.l Location location);

    void n(@Y61.k String str, @Y61.k String str2);

    void o(@Y61.l Radius radius);

    void p(boolean z12);

    void q(@Y61.k FiltersFragment filtersFragment);

    void r(@Y61.k k1 k1Var);

    void s(@Y61.k ResetResult resetResult);

    void t(@Y61.k String str, @Y61.k String str2);

    void u(boolean z12);
}

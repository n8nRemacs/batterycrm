package com.avito.android.inline_filters;

import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.InlineFilters;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: FiltersInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/b;", "", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.inline_filters.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC30995b {

    /* compiled from: FiltersInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.inline_filters.b$a */
    public static final class a {
    }

    @Y61.k
    io.reactivex.rxjava3.core.z a(@Y61.l SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l String str, @Y61.l Filter filter, @Y61.l Filter filter2, @Y61.l Map map, @Y61.k Filter filter3, @Y61.l ItemsSearchLink itemsSearchLink);

    @Y61.k
    io.reactivex.rxjava3.core.z<InlineFilters> b(@Y61.k SearchParams searchParams, @Y61.k Map<String, String> map, @Y61.l PresentationType presentationType, @Y61.l Map<String, String> map2, @Y61.l List<String> list, @Y61.l String str);

    @Y61.k
    io.reactivex.rxjava3.core.z c(@Y61.k Filter filter, @Y61.k InlineFilterValue inlineFilterValue, @Y61.l SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l Map map, @Y61.l String str);

    @Y61.k
    I0 d(@Y61.k List list, @Y61.l SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l Map map, @Y61.l List list2, @Y61.l String str);
}

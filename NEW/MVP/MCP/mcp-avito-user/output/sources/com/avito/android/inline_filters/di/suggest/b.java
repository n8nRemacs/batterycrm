package com.avito.android.inline_filters.di.suggest;

import Y61.k;
import Y61.l;
import com.avito.android.di.B;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import h31.d;
import kotlin.Metadata;

/* compiled from: InlineFilterSuggestComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/di/suggest/b;", "", "a", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: InlineFilterSuggestComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/di/suggest/b$a;", "", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k c cVar, @h31.b @l SearchParams searchParams, @h31.b @k Filter filter);
    }

    void a(@k com.avito.android.inline_filters.dialog.suggest.b bVar);
}

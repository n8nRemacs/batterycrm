package com.avito.android.widget_filters.domain;

import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import java.util.ArrayList;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.text.C43059p;

/* compiled from: WidgetFiltersInitialSearchParamsWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/domain/d;", "Lcom/avito/android/widget_filters/domain/b;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.widget_filters.domain.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36156d implements InterfaceC36154b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f329851a;

    @Inject
    public C36156d(@Y61.k SearchParamsConverter searchParamsConverter) {
        this.f329851a = searchParamsConverter;
    }

    @Override // com.avito.android.widget_filters.domain.InterfaceC36154b
    @Y61.k
    public final Map<String, String> a(@Y61.k SearchParams searchParams) {
        Map mapConvertToMap$default = SearchParamsConverter.DefaultImpls.convertToMap$default(this.f329851a, searchParams, null, false, null, 14, null);
        ArrayList arrayList = new ArrayList(mapConvertToMap$default.size());
        for (Map.Entry entry : mapConvertToMap$default.entrySet()) {
            String str = (String) entry.getKey();
            arrayList.add(new Q("initialParams".concat(C43033p.w(C43059p.c(new C43059p("([^\\[\\]]+)|(\\[\\d+])"), str), "", C36155c.f329850l, 30)), (String) entry.getValue()));
        }
        return P0.p(arrayList);
    }
}

package com.avito.android.search.filter.parameters_filter;

import Y61.k;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.search.filter.di.f;
import com.avito.android.select.Arguments;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: FiltersSelectRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/parameters_filter/a;", "LZp0/d;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements Zp0.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final V0 f263751a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SearchParamsConverter f263752b;

    @Inject
    public a(@k V0 v02, @f.g @k SearchParamsConverter searchParamsConverter) {
        this.f263751a = v02;
        this.f263752b = searchParamsConverter;
    }

    @Override // Zp0.d
    @k
    public final InterfaceC19588c<? super InterfaceC19587b> a(@k Arguments arguments) {
        return new d(this.f263751a, C43066x.X("]", C43066x.U("params[", arguments.getRequestId())), arguments.getSearchParams(), this.f263752b, arguments.isSectionedPagination());
    }
}

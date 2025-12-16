package com.avito.android.inline_filters.repository_suggest;

import Y61.k;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.select.Arguments;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: InlineFiltersSelectRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/repository_suggest/a;", "LZp0/d;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements Zp0.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<V0> f172348a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SearchParamsConverter f172349b;

    @Inject
    public a(@k h31.e<V0> eVar, @k SearchParamsConverter searchParamsConverter) {
        this.f172348a = eVar;
        this.f172349b = searchParamsConverter;
    }

    @Override // Zp0.d
    @k
    public final InterfaceC19588c<? super InterfaceC19587b> a(@k Arguments arguments) {
        return new e(this.f172348a, C43066x.X("]", C43066x.U("params[", arguments.getRequestId())), arguments.getSearchParams(), this.f172349b, arguments.isSectionedPagination());
    }
}

package com.avito.android.developments_agency_search.screen.big_filters;

import com.avito.android.developments_agency_search.screen.big_filters.BigFiltersFragment;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ww.InterfaceC49690a;

/* compiled from: BigFiltersFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/search/Filter;", "<anonymous parameter 0>", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "value", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/search/Filter;Lcom/avito/android/remote/model/search/InlineFilterValue;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class c extends N implements Y41.p<Filter, InlineFilterValue, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BigFiltersFragment f136577l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BigFiltersFragment bigFiltersFragment) {
        super(2);
        this.f136577l = bigFiltersFragment;
    }

    @Override // Y41.p
    public final G0 invoke(Filter filter, InlineFilterValue inlineFilterValue) {
        BigFiltersFragment.a aVar = BigFiltersFragment.f136550r0;
        this.f136577l.g5().accept(new InterfaceC49690a.e((InlineFilterValue.InlineFilterNumericRangeValue) inlineFilterValue));
        return G0.f406611a;
    }
}

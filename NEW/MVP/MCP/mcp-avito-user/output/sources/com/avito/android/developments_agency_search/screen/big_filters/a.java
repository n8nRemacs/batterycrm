package com.avito.android.developments_agency_search.screen.big_filters;

import com.avito.android.developments_agency_search.screen.big_filters.BigFiltersFragment;
import com.avito.android.realty_agency.inline_filters_public.generated.api.api_2_nd_trx_developments_suggest_post.DevelopmentSuggestV1Suggest;
import hi0.C40944a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ww.InterfaceC49690a;

/* compiled from: BigFiltersFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters_public/generated/api/api_2_nd_trx_developments_suggest_post/DevelopmentSuggestV1Suggest;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/realty_agency/inline_filters_public/generated/api/api_2_nd_trx_developments_suggest_post/DevelopmentSuggestV1Suggest;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class a extends N implements Y41.l<DevelopmentSuggestV1Suggest, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BigFiltersFragment f136575l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BigFiltersFragment bigFiltersFragment) {
        super(1);
        this.f136575l = bigFiltersFragment;
    }

    @Override // Y41.l
    public final G0 invoke(DevelopmentSuggestV1Suggest developmentSuggestV1Suggest) {
        BigFiltersFragment.a aVar = BigFiltersFragment.f136550r0;
        this.f136575l.g5().accept(new InterfaceC49690a.d(C40944a.a(developmentSuggestV1Suggest)));
        return G0.f406611a;
    }
}

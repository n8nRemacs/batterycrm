package com.avito.android.travel_search.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.travel_search.mvi.entity.TravelSearchInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TravelSearchReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_search/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "LvF0/g;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o implements u<TravelSearchInternalAction, vF0.g> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final q f303195b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.travel_search.domain.m f303196c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.i f303197d;

    @Inject
    public o(@Y61.k q qVar, @Y61.k com.avito.android.travel_search.domain.m mVar, @Y61.k com.avito.android.serp.i iVar) {
        this.f303195b = qVar;
        this.f303196c = mVar;
        this.f303197d = iVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final vF0.g a(TravelSearchInternalAction travelSearchInternalAction, vF0.g gVar) {
        return this.f303195b.a((vF0.g) new n(travelSearchInternalAction, this).invoke(gVar));
    }
}

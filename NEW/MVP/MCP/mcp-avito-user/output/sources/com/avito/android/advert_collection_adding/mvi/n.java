package com.avito.android.advert_collection_adding.mvi;

import com.avito.android.advert_collection_adding.mvi.entity.AdvertCollectionAddingInternalAction;
import com.avito.android.advert_collection_adding.mvi.entity.AdvertCollectionAddingState;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AdvertCollectionAddingReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingState;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n implements u<AdvertCollectionAddingInternalAction, AdvertCollectionAddingState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f81918b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final r f81919c;

    @Inject
    public n(@Y61.k c cVar, @Y61.k r rVar) {
        this.f81918b = cVar;
        this.f81919c = rVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final AdvertCollectionAddingState a(AdvertCollectionAddingInternalAction advertCollectionAddingInternalAction, AdvertCollectionAddingState advertCollectionAddingState) {
        AdvertCollectionAddingInternalAction advertCollectionAddingInternalAction2 = advertCollectionAddingInternalAction;
        AdvertCollectionAddingState advertCollectionAddingState2 = advertCollectionAddingState;
        if (advertCollectionAddingState2 instanceof AdvertCollectionAddingState.Create) {
            return this.f81919c.a(advertCollectionAddingInternalAction2, advertCollectionAddingState2);
        }
        if (advertCollectionAddingState2 instanceof AdvertCollectionAddingState.Select) {
            return this.f81918b.a(advertCollectionAddingInternalAction2, advertCollectionAddingState2);
        }
        throw new NoWhenBranchMatchedException();
    }
}

package com.avito.android.advert_collection_adding.mvi;

import com.avito.android.advert_collection_adding.mvi.entity.AdvertCollectionAddingInternalAction;
import com.avito.android.advert_collection_adding.mvi.entity.AdvertCollectionAddingState;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AddToCollectionReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/c;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingState;", "<init>", "()V", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements u<AdvertCollectionAddingInternalAction, AdvertCollectionAddingState> {
    @Inject
    public c() {
    }

    @Override // com.avito.android.arch.mvi.u
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AdvertCollectionAddingState a(@Y61.k AdvertCollectionAddingInternalAction advertCollectionAddingInternalAction, @Y61.k AdvertCollectionAddingState advertCollectionAddingState) {
        if (!(advertCollectionAddingState instanceof AdvertCollectionAddingState.Select)) {
            return advertCollectionAddingState;
        }
        if (!(advertCollectionAddingInternalAction instanceof AdvertCollectionAddingInternalAction.CollectionListLoaded)) {
            if (advertCollectionAddingInternalAction instanceof AdvertCollectionAddingInternalAction.ShowCreateCollectionScreen) {
                return new AdvertCollectionAddingState.Create(false, false, null, null, 14, null);
            }
            return advertCollectionAddingInternalAction instanceof AdvertCollectionAddingInternalAction.Loading ? AdvertCollectionAddingState.Select.d((AdvertCollectionAddingState.Select) advertCollectionAddingState, true) : advertCollectionAddingInternalAction instanceof AdvertCollectionAddingInternalAction.ShowError ? AdvertCollectionAddingState.Select.d((AdvertCollectionAddingState.Select) advertCollectionAddingState, false) : advertCollectionAddingState;
        }
        AdvertCollectionAddingInternalAction.CollectionListLoaded collectionListLoaded = (AdvertCollectionAddingInternalAction.CollectionListLoaded) advertCollectionAddingInternalAction;
        if (collectionListLoaded.f81883c.isEmpty()) {
            return new AdvertCollectionAddingState.Create(collectionListLoaded.f81882b, false, null, null, 14, null);
        }
        return new AdvertCollectionAddingState.Select(collectionListLoaded.f81882b, false, collectionListLoaded.f81883c, 2, null);
    }
}

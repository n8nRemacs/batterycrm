package com.avito.android.advert_collection_adding.mvi;

import com.avito.android.advert_collection_adding.mvi.entity.AdvertCollectionAddingInternalAction;
import com.avito.android.advert_collection_adding.mvi.entity.AdvertCollectionAddingState;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CreateCollectionReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/r;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingState;", "<init>", "()V", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r implements u<AdvertCollectionAddingInternalAction, AdvertCollectionAddingState> {
    @Inject
    public r() {
    }

    @Override // com.avito.android.arch.mvi.u
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AdvertCollectionAddingState a(@Y61.k AdvertCollectionAddingInternalAction advertCollectionAddingInternalAction, @Y61.k AdvertCollectionAddingState advertCollectionAddingState) {
        if (!(advertCollectionAddingState instanceof AdvertCollectionAddingState.Create)) {
            return advertCollectionAddingState;
        }
        if (advertCollectionAddingInternalAction instanceof AdvertCollectionAddingInternalAction.ShowCreateCollectionScreen) {
            return new AdvertCollectionAddingState.Create(false, false, null, null, 14, null);
        }
        return advertCollectionAddingInternalAction instanceof AdvertCollectionAddingInternalAction.CollectionNameChanged ? AdvertCollectionAddingState.Create.d((AdvertCollectionAddingState.Create) advertCollectionAddingState, false, null, ((AdvertCollectionAddingInternalAction.CollectionNameChanged) advertCollectionAddingInternalAction).f81886b, 3) : advertCollectionAddingInternalAction instanceof AdvertCollectionAddingInternalAction.CollectionCreated ? AdvertCollectionAddingState.Create.d((AdvertCollectionAddingState.Create) advertCollectionAddingState, false, ((AdvertCollectionAddingInternalAction.CollectionCreated) advertCollectionAddingInternalAction).f81880b, null, 11) : advertCollectionAddingInternalAction instanceof AdvertCollectionAddingInternalAction.Loading ? AdvertCollectionAddingState.Create.d((AdvertCollectionAddingState.Create) advertCollectionAddingState, true, null, null, 13) : advertCollectionAddingInternalAction instanceof AdvertCollectionAddingInternalAction.ShowError ? AdvertCollectionAddingState.Create.d((AdvertCollectionAddingState.Create) advertCollectionAddingState, false, null, null, 13) : advertCollectionAddingState;
    }
}

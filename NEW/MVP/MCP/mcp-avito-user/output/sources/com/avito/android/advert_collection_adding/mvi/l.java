package com.avito.android.advert_collection_adding.mvi;

import L7.b;
import com.avito.android.advert_collection_adding.mvi.entity.AdvertCollectionAddingInternalAction;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertCollectionAddingOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "LL7/b;", "<init>", "()V", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l implements t<AdvertCollectionAddingInternalAction, L7.b> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final L7.b b(AdvertCollectionAddingInternalAction advertCollectionAddingInternalAction) {
        AdvertCollectionAddingInternalAction advertCollectionAddingInternalAction2 = advertCollectionAddingInternalAction;
        if (advertCollectionAddingInternalAction2 instanceof AdvertCollectionAddingInternalAction.CollectionCreated) {
            AdvertCollectionAddingInternalAction.CollectionCreated collectionCreated = (AdvertCollectionAddingInternalAction.CollectionCreated) advertCollectionAddingInternalAction2;
            if (collectionCreated.f81881c) {
                return new b.InterfaceC0605b.C0606b(collectionCreated.f81880b);
            }
            return null;
        }
        if (advertCollectionAddingInternalAction2 instanceof AdvertCollectionAddingInternalAction.AddedToCollection) {
            return new b.InterfaceC0605b.a(((AdvertCollectionAddingInternalAction.AddedToCollection) advertCollectionAddingInternalAction2).f81878b);
        }
        if (advertCollectionAddingInternalAction2 instanceof AdvertCollectionAddingInternalAction.ShowError) {
            return new b.c(((AdvertCollectionAddingInternalAction.ShowError) advertCollectionAddingInternalAction2).f81889b);
        }
        if (advertCollectionAddingInternalAction2 instanceof AdvertCollectionAddingInternalAction.CollectionListLoadingError) {
            return new b.c(((AdvertCollectionAddingInternalAction.CollectionListLoadingError) advertCollectionAddingInternalAction2).f81884b.getMessage());
        }
        if (advertCollectionAddingInternalAction2.equals(AdvertCollectionAddingInternalAction.CloseDialog.f81879b)) {
            return b.a.f9803a;
        }
        return null;
    }
}

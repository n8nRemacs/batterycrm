package com.avito.android.advert_collection_adding.mvi;

import L7.a;
import com.avito.android.advert_collection_adding.mvi.entity.AdvertCollectionAddingInternalAction;
import com.avito.android.advert_collection_adding.mvi.entity.AdvertCollectionAddingState;
import com.avito.android.arch.mvi.a;
import com.avito.android.remote.model.CreateAdvertCollectionResult;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CreateCollectionActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/p;", "Lcom/avito/android/arch/mvi/a;", "LL7/a;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingState$Create;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class p implements com.avito.android.arch.mvi.a<L7.a, AdvertCollectionAddingInternalAction, AdvertCollectionAddingState.Create> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection_adding.k f81922a;

    @Inject
    public p(@Y61.k com.avito.android.advert_collection_adding.k kVar) {
        this.f81922a = kVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<AdvertCollectionAddingInternalAction> b(@Y61.k L7.a aVar, @Y61.k AdvertCollectionAddingState.Create create) {
        if (aVar instanceof a.b) {
            return new C43210w(new AdvertCollectionAddingInternalAction.CollectionNameChanged(((a.b) aVar).f9798a));
        }
        if (!aVar.equals(a.d.f9801a)) {
            return aVar.equals(a.C0604a.f9797a) ? new C43210w(AdvertCollectionAddingInternalAction.CloseDialog.f81879b) : C43175k.w();
        }
        CreateAdvertCollectionResult.Created created = create.f81894f;
        com.avito.android.advert_collection_adding.k kVar = this.f81922a;
        if (created != null) {
            return kVar.b(created.getDeepLink(), created.getId());
        }
        return kVar.c(create.f81895g);
    }
}

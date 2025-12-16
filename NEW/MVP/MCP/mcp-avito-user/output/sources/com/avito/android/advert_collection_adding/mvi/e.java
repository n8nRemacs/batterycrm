package com.avito.android.advert_collection_adding.mvi;

import com.avito.android.advert_collection_adding.mvi.entity.AdvertCollectionAddingInternalAction;
import com.avito.android.advert_collection_adding.mvi.entity.AdvertCollectionAddingState;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AdvertCollectionAddingActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LL7/a;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingState;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements com.avito.android.arch.mvi.a<L7.a, AdvertCollectionAddingInternalAction, AdvertCollectionAddingState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f81876a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p f81877b;

    @Inject
    public e(@Y61.k a aVar, @Y61.k p pVar) {
        this.f81876a = aVar;
        this.f81877b = pVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AdvertCollectionAddingInternalAction> b(L7.a aVar, AdvertCollectionAddingState advertCollectionAddingState) {
        L7.a aVar2 = aVar;
        AdvertCollectionAddingState advertCollectionAddingState2 = advertCollectionAddingState;
        if (advertCollectionAddingState2 instanceof AdvertCollectionAddingState.Create) {
            return this.f81877b.b(aVar2, (AdvertCollectionAddingState.Create) advertCollectionAddingState2);
        }
        if (advertCollectionAddingState2 instanceof AdvertCollectionAddingState.Select) {
            return this.f81876a.c(aVar2);
        }
        throw new NoWhenBranchMatchedException();
    }
}

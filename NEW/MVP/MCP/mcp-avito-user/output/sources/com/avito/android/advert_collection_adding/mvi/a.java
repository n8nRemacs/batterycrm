package com.avito.android.advert_collection_adding.mvi;

import L7.a;
import com.avito.android.advert_collection_adding.mvi.entity.AdvertCollectionAddingInternalAction;
import com.avito.android.advert_collection_adding.mvi.entity.AdvertCollectionAddingState;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AddToCollectionActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LL7/a;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingState;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements com.avito.android.arch.mvi.a<L7.a, AdvertCollectionAddingInternalAction, AdvertCollectionAddingState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection_adding.k f81873a;

    @Inject
    public a(@Y61.k com.avito.android.advert_collection_adding.k kVar) {
        this.f81873a = kVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<AdvertCollectionAddingInternalAction> b(L7.a aVar, AdvertCollectionAddingState advertCollectionAddingState) {
        return c(aVar);
    }

    @Y61.k
    public final InterfaceC43160i c(@Y61.k L7.a aVar) {
        if (aVar.equals(a.e.f9802a)) {
            return new C43210w(AdvertCollectionAddingInternalAction.ShowCreateCollectionScreen.f81888b);
        }
        if (!(aVar instanceof a.c)) {
            return aVar.equals(a.C0604a.f9797a) ? new C43210w(AdvertCollectionAddingInternalAction.CloseDialog.f81879b) : C43175k.w();
        }
        a.c cVar = (a.c) aVar;
        return this.f81873a.b(cVar.f9800b, cVar.f9799a);
    }
}

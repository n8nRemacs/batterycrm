package com.avito.android.item_price_history.presentation.mvi;

import EO.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.item_price_history.presentation.ItemPriceHistoryInitialData;
import com.avito.android.item_price_history.presentation.mvi.entity.ItemPriceHistoryInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ItemPriceHistoryActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/item_price_history/presentation/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LEO/a;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction;", "LEO/c;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.arch.mvi.a<EO.a, ItemPriceHistoryInternalAction, EO.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AO.a f173787a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.h f173788b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.a f173789c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ItemPriceHistoryInitialData f173790d;

    /* renamed from: e, reason: collision with root package name */
    public long f173791e;

    @Inject
    public c(@Y61.k AO.a aVar, @Y61.k com.avito.android.favorite.h hVar, @Y61.k com.avito.android.server_time.a aVar2, @Y61.k ItemPriceHistoryInitialData itemPriceHistoryInitialData) {
        this.f173787a = aVar;
        this.f173788b = hVar;
        this.f173789c = aVar2;
        this.f173790d = itemPriceHistoryInitialData;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ItemPriceHistoryInternalAction> b(EO.a aVar, EO.c cVar) {
        EO.a aVar2 = aVar;
        EO.c cVar2 = cVar;
        if (aVar2 instanceof a.C0231a) {
            return C43175k.G(new a(this, cVar2, aVar2, null));
        }
        if (aVar2 instanceof a.b) {
            return C43175k.G(new b(this, cVar2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}

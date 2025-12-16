package com.avito.android.item_price_history.presentation.mvi;

import com.avito.android.item_price_history.presentation.ItemPriceHistoryInitialData;
import com.avito.android.item_price_history.presentation.mvi.entity.IsFavoriteState;
import com.avito.android.item_price_history.presentation.mvi.entity.ItemPriceHistoryInternalAction;
import com.avito.android.item_price_history.presentation.mvi.entity.ScreenState;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ItemPriceHistoryReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/item_price_history/presentation/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction;", "LEO/c;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o implements com.avito.android.arch.mvi.u<ItemPriceHistoryInternalAction, EO.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final s f173846b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ItemPriceHistoryInitialData f173847c;

    /* compiled from: ItemPriceHistoryReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[IsFavoriteState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IsFavoriteState isFavoriteState = IsFavoriteState.f173796b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IsFavoriteState isFavoriteState2 = IsFavoriteState.f173796b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public o(@Y61.k s sVar, @Y61.k ItemPriceHistoryInitialData itemPriceHistoryInitialData) {
        this.f173846b = sVar;
        this.f173847c = itemPriceHistoryInitialData;
    }

    @Override // com.avito.android.arch.mvi.u
    public final EO.c a(ItemPriceHistoryInternalAction itemPriceHistoryInternalAction, EO.c cVar) {
        int iOrdinal;
        ItemPriceHistoryInternalAction itemPriceHistoryInternalAction2 = itemPriceHistoryInternalAction;
        EO.c cVar2 = cVar;
        boolean z12 = itemPriceHistoryInternalAction2 instanceof ItemPriceHistoryInternalAction.ShowFirstLoading;
        s sVar = this.f173846b;
        if (z12) {
            EO.c.f4001f.getClass();
            return sVar.a(EO.c.a(cVar2, EO.c.f4002g.f4003b, null, ScreenState.f173811c, this.f173847c.f173718g, 2), cVar2);
        }
        if (itemPriceHistoryInternalAction2 instanceof ItemPriceHistoryInternalAction.ShowLoadingWithOffset) {
            return sVar.a(EO.c.a(cVar2, null, null, ScreenState.f173812d, false, 11), cVar2);
        }
        if (itemPriceHistoryInternalAction2 instanceof ItemPriceHistoryInternalAction.StopLoadingWithOffset) {
            return sVar.a(EO.c.a(cVar2, null, null, ScreenState.f173813e, false, 11), cVar2);
        }
        if (itemPriceHistoryInternalAction2 instanceof ItemPriceHistoryInternalAction.ShowContent) {
            List<BO.b> list = cVar2.f4003b.f1373a;
            BO.a aVar = ((ItemPriceHistoryInternalAction.ShowContent) itemPriceHistoryInternalAction2).f173803b;
            return sVar.a(EO.c.a(cVar2, new BO.a(C42745f0.h0(aVar.f1373a, list), aVar.f1374b), null, ScreenState.f173813e, false, 10), cVar2);
        }
        if (itemPriceHistoryInternalAction2 instanceof ItemPriceHistoryInternalAction.ShowError) {
            EO.c.f4001f.getClass();
            return sVar.a(EO.c.a(cVar2, EO.c.f4002g.f4003b, null, ScreenState.f173814f, false, 10), cVar2);
        }
        if (!(itemPriceHistoryInternalAction2 instanceof ItemPriceHistoryInternalAction.ChangeIsFavoriteState) || (iOrdinal = ((ItemPriceHistoryInternalAction.ChangeIsFavoriteState) itemPriceHistoryInternalAction2).f173801b.ordinal()) == 0) {
            return cVar2;
        }
        if (iOrdinal == 1) {
            return EO.c.a(cVar2, null, null, null, true, 7);
        }
        if (iOrdinal == 2) {
            return EO.c.a(cVar2, null, null, null, false, 7);
        }
        throw new NoWhenBranchMatchedException();
    }
}

package com.avito.android.item_price_history.presentation.mvi;

import EO.b;
import com.avito.android.item_price_history.presentation.mvi.entity.ItemPriceHistoryInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ItemPriceHistoryOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/item_price_history/presentation/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/item_price_history/presentation/mvi/entity/ItemPriceHistoryInternalAction;", "LEO/b;", "<init>", "()V", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m implements com.avito.android.arch.mvi.t<ItemPriceHistoryInternalAction, EO.b> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final EO.b b(ItemPriceHistoryInternalAction itemPriceHistoryInternalAction) {
        ItemPriceHistoryInternalAction itemPriceHistoryInternalAction2 = itemPriceHistoryInternalAction;
        if (itemPriceHistoryInternalAction2 instanceof ItemPriceHistoryInternalAction.ShowToast) {
            return new b.d(((ItemPriceHistoryInternalAction.ShowToast) itemPriceHistoryInternalAction2).f173808b);
        }
        if (itemPriceHistoryInternalAction2 instanceof ItemPriceHistoryInternalAction.ShowErrorToast) {
            ItemPriceHistoryInternalAction.ShowErrorToast showErrorToast = (ItemPriceHistoryInternalAction.ShowErrorToast) itemPriceHistoryInternalAction2;
            return new b.c(showErrorToast.f173806b, showErrorToast.f173807c);
        }
        if (itemPriceHistoryInternalAction2 instanceof ItemPriceHistoryInternalAction.ChangeIsFavoriteState) {
            return new b.a(((ItemPriceHistoryInternalAction.ChangeIsFavoriteState) itemPriceHistoryInternalAction2).f173801b);
        }
        if (itemPriceHistoryInternalAction2 instanceof ItemPriceHistoryInternalAction.PerformHapticFeedback) {
            return b.C0232b.f3997a;
        }
        return null;
    }
}

package com.avito.android.item_price_history.di;

import Y61.l;
import com.avito.android.item_price_history.presentation.items.item.ItemPriceHistoryItemItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemPriceHistoryChangePayloadCreator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/item_price_history/di/a;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.recycler.data_aware.a {
    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (L.f(aVar != null ? Long.valueOf(aVar.getId()) : null, aVar2 != null ? Long.valueOf(aVar2.getId()) : null) && (aVar instanceof ItemPriceHistoryItemItem) && (aVar2 instanceof ItemPriceHistoryItemItem)) {
            return com.avito.android.item_price_history.presentation.items.item.c.f173764a;
        }
        return null;
    }
}

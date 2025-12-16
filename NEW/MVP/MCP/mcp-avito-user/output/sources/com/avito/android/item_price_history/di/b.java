package com.avito.android.item_price_history.di;

import C11.b;
import Y41.l;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.item_price_history.presentation.ItemPriceHistoryDialogFragment;
import com.avito.android.item_price_history.presentation.ItemPriceHistoryInitialData;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ItemPriceHistoryComponent.kt */
@B
@C11.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/item_price_history/di/b;", "", "a", "b", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: ItemPriceHistoryComponent.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_price_history/di/b$a;", "", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        b a(@Y61.k cv.d dVar, @h31.b @Y61.k ItemPriceHistoryInitialData itemPriceHistoryInitialData, @h31.b @Y61.k l<? super EO.a, G0> lVar, @h31.b @Y61.k C28478k c28478k, @h31.b @Y61.k Resources resources, @h31.b @Y61.k r rVar);
    }

    /* compiled from: ItemPriceHistoryComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_price_history/di/b$b;", "Lcom/avito/android/di/h;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    /* renamed from: com.avito.android.item_price_history.di.b$b, reason: collision with other inner class name */
    public interface InterfaceC5113b extends InterfaceC29971h {
        @Y61.k
        a tg();
    }

    void a(@Y61.k ItemPriceHistoryDialogFragment itemPriceHistoryDialogFragment);
}

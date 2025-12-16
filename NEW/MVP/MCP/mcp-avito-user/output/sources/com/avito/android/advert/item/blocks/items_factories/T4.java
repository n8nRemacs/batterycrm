package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.similars.loader.SimilarsLoaderItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsSimilarsItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/T4;", "Lcom/avito/android/advert/item/blocks/items_factories/S4;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class T4 implements S4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73860a;

    @Inject
    public T4(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73860a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.S4
    @Y61.k
    public final SimilarsLoaderItem a() {
        return new SimilarsLoaderItem(0L, null, this.f73860a.getSpanCount(), null, null, 27, null);
    }
}

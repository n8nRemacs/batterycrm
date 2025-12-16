package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_details_items.status_badge.AdvertDetailsClosingReasonItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsClosingReasonItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/j0;", "Lcom/avito/android/advert/item/blocks/items_factories/i0;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.j0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27985j0 implements InterfaceC27978i0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73973a;

    @Inject
    public C27985j0(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73973a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC27978i0
    @Y61.l
    public final AdvertDetailsClosingReasonItem a(@Y61.l String str) {
        if (str == null) {
            return null;
        }
        return new AdvertDetailsClosingReasonItem(str, 0L, null, this.f73973a.a(), null, null, 54, null);
    }
}

package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.InterfaceC28240u;
import com.avito.android.advert.item.advertnumber.AdvertDetailsAdvertNumberItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertStats;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsNumberItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/X2;", "Lcom/avito/android/advert/item/blocks/items_factories/W2;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class X2 implements W2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73885a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28240u f73886b;

    @Inject
    public X2(@Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k InterfaceC28240u interfaceC28240u) {
        this.f73885a = jVar;
        this.f73886b = interfaceC28240u;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.W2
    @Y61.k
    public final AdvertDetailsAdvertNumberItem a(@Y61.k AdvertDetails advertDetails) {
        AdvertStats stats = advertDetails.getStats();
        String strQ = null;
        Integer total = stats != null ? stats.getTotal() : null;
        InterfaceC28240u interfaceC28240u = this.f73886b;
        if (total != null) {
            Integer total2 = stats.getTotal();
            strQ = interfaceC28240u.q(total2 != null ? total2.intValue() : 0);
        }
        return new AdvertDetailsAdvertNumberItem(0L, null, interfaceC28240u.j(Long.valueOf(advertDetails.getTime()), advertDetails.getId()), strQ, this.f73885a.a(), null, null, 99, null);
    }
}

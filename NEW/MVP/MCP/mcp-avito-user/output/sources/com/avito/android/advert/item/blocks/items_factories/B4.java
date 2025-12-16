package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.services_price.ServicesPriceItem;
import com.avito.android.remote.model.AdvertDetails;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsServicesPriceItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/B4;", "Lcom/avito/android/advert/item/blocks/items_factories/A4;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class B4 implements A4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73713a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.B2 f73714b;

    @Inject
    public B4(@Y61.k com.avito.android.B2 b22, @Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73713a = jVar;
        this.f73714b = b22;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.A4
    public final boolean a(@Y61.k AdvertDetails advertDetails) {
        if (advertDetails.getServicesPrice() != null) {
            com.avito.android.B2 b22 = this.f73714b;
            b22.getClass();
            kotlin.reflect.n<Object> nVar = com.avito.android.B2.f67184X[5];
            if (((Boolean) b22.f67213g.a().invoke()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.A4
    @Y61.l
    public final ServicesPriceItem b(@Y61.k AdvertDetails advertDetails) {
        if (!a(advertDetails)) {
            return null;
        }
        return new ServicesPriceItem(0L, null, this.f73713a.a(), null, null, advertDetails.getServicesPrice(), 27, null);
    }
}

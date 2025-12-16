package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_details_items.price_description_button.AdvertDetailsPriceDescriptionButtonItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertDetailsPriceDescriptionButton;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPriceDescriptionButtonItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/q3;", "Lcom/avito/android/advert/item/blocks/items_factories/p3;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.q3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28037q3 implements InterfaceC28030p3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f74010a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.price_description_button.a f74011b;

    @Inject
    public C28037q3(@Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k com.avito.android.advert.item.price_description_button.a aVar) {
        this.f74010a = jVar;
        this.f74011b = aVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28030p3
    @Y61.l
    public final AdvertDetailsPriceDescriptionButtonItem a(@Y61.k AdvertDetails advertDetails) {
        String text;
        DeepLink uri;
        AdvertDetailsPriceDescriptionButton priceDescriptionButton = advertDetails.getPriceDescriptionButton();
        if (priceDescriptionButton == null || (text = priceDescriptionButton.getText()) == null || (uri = priceDescriptionButton.getUri()) == null) {
            return null;
        }
        return new AdvertDetailsPriceDescriptionButtonItem(0L, null, uri, text, this.f74011b.a(priceDescriptionButton.getLeftIconType()), this.f74010a.a(), null, null, 195, null);
    }
}

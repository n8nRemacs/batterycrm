package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.b2c.AdvertDetailsB2CBottomItem;
import com.avito.android.remote.b2c.B2C;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.safedeal.SafeDeal;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsB2CItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/N;", "Lcom/avito/android/advert/item/blocks/items_factories/M;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class N implements M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73813a;

    @Inject
    public N(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73813a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.M
    @Y61.l
    public final AdvertDetailsB2CBottomItem a(@Y61.k AdvertDetails advertDetails) {
        List<SafeDeal.Component> listC;
        B2C b2c = advertDetails.getB2c();
        if (b2c == null || (listC = b2c.c()) == null) {
            return null;
        }
        return new AdvertDetailsB2CBottomItem(0L, null, advertDetails.getCategoryId(), listC, this.f73813a.a(), null, null, 99, null);
    }
}

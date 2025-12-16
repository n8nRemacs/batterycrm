package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.R;
import com.avito.android.advert.item.beduin_block.AdvertDetailsBeduinFormItem;
import com.avito.android.beduin_models.BeduinForm;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertDetailsBlockId;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsTiresBannerItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/e5;", "Lcom/avito/android/advert/item/blocks/items_factories/d5;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.e5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27955e5 implements InterfaceC27948d5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73947a;

    @Inject
    public C27955e5(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73947a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC27948d5
    @Y61.l
    public final AdvertDetailsBeduinFormItem a(@Y61.k AdvertDetails advertDetails) {
        BeduinForm tiresBanner = advertDetails.getTiresBanner();
        if (tiresBanner == null) {
            return null;
        }
        return new AdvertDetailsBeduinFormItem(AdvertDetailsBlockId.TIRES_BANNER, tiresBanner, this.f73947a.a(), R.dimen.tires_banner_horizontal_padding, null, null, 48, null);
    }
}

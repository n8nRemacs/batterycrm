package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.R;
import com.avito.android.advert.item.beduin_block.AdvertDetailsBeduinFormItem;
import com.avito.android.beduin_models.BeduinForm;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertDetailsBlockId;
import com.avito.android.remote.model.AvitoForBusinessBlock;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAvitoForBusinessBlockItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/K;", "Lcom/avito/android/advert/item/blocks/items_factories/J;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class K implements J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73782a;

    @Inject
    public K(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73782a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.J
    @Y61.l
    public final AdvertDetailsBeduinFormItem a(@Y61.k AdvertDetails advertDetails) {
        BeduinForm beduinForm;
        AvitoForBusinessBlock avitoForBusiness = advertDetails.getAvitoForBusiness();
        if (avitoForBusiness == null || (beduinForm = avitoForBusiness.getBeduinForm()) == null) {
            return null;
        }
        return new AdvertDetailsBeduinFormItem(AdvertDetailsBlockId.AVITO_FOR_BUSINESS, beduinForm, this.f73782a.getSpanCount(), R.dimen.content_button_horizontal_padding, null, null, 48, null);
    }
}

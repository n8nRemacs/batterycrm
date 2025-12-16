package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.R;
import com.avito.android.advert.item.beduin_block.AdvertDetailsBeduinFormItem;
import com.avito.android.beduin_models.BeduinForm;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertDetailsBlockId;
import com.avito.android.remote.model.RfpBeduinBlock;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsRfpBlockItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/U3;", "Lcom/avito/android/advert/item/blocks/items_factories/T3;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class U3 implements T3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73865a;

    @Inject
    public U3(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73865a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.T3
    @Y61.l
    public final AdvertDetailsBeduinFormItem a(@Y61.k AdvertDetails advertDetails) {
        BeduinForm beduinForm;
        RfpBeduinBlock rfpBlock = advertDetails.getRfpBlock();
        if (rfpBlock == null || (beduinForm = rfpBlock.getBeduinForm()) == null) {
            return null;
        }
        return new AdvertDetailsBeduinFormItem(AdvertDetailsBlockId.RFP, beduinForm, this.f73865a.getSpanCount(), R.dimen.content_button_horizontal_padding, null, null, 48, null);
    }
}

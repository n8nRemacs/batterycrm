package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.developer.button.DeveloperButtonItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.Developer;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsDeveloperButtonItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/S0;", "Lcom/avito/android/advert/item/blocks/items_factories/R0;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class S0 implements R0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73850a;

    @Inject
    public S0(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73850a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.R0
    @Y61.l
    public final DeveloperButtonItem a(@Y61.k AdvertDetails advertDetails) {
        ButtonAction button;
        Developer developerV2 = advertDetails.getDeveloperV2();
        if (developerV2 == null || (button = developerV2.getButton()) == null) {
            return null;
        }
        return new DeveloperButtonItem(0L, null, this.f73850a.a(), null, null, button, 27, null);
    }
}

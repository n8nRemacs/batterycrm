package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_core.information_about.InformationAboutItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.information_about.InformationAbout;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsInformationAboutItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/B2;", "Lcom/avito/android/advert/item/blocks/items_factories/A2;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class B2 implements A2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73712a;

    @Inject
    public B2(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73712a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.A2
    @Y61.l
    public final InformationAboutItem a(@Y61.k AdvertDetails advertDetails) {
        InformationAbout informationAbout = advertDetails.getInformationAbout();
        if (informationAbout == null) {
            return null;
        }
        int iA2 = this.f73712a.a();
        String title = informationAbout.getTitle();
        InformationAbout.Icon icon = informationAbout.getIcon();
        String name = icon != null ? icon.getName() : null;
        InformationAbout.Icon icon2 = informationAbout.getIcon();
        return new InformationAboutItem(0L, null, iA2, title, name, icon2 != null ? icon2.getColor() : null, informationAbout.getBottomSheetInfo().getAbout(), informationAbout.getBottomSheetInfo().getDeeplink(), informationAbout.getBottomSheetInfo().getText(), 3, null);
    }
}

package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.equipmentsTile.AdvertDetailsEquipmentsTileItem;
import com.avito.android.advert_core.equipments.redesign.Page;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertEquipments;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.OptionsTile;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsEquipmentsTileItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/n1;", "Lcom/avito/android/advert/item/blocks/items_factories/m1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.n1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28014n1 implements InterfaceC28007m1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73992a;

    @Inject
    public C28014n1(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73992a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28007m1
    @Y61.l
    public final AdvertDetailsEquipmentsTileItem a(@Y61.k AdvertDetails advertDetails) {
        List<OptionsTile> optionsTile;
        AdvertParameters parameters = advertDetails.getParameters();
        AdvertEquipments equipments = parameters != null ? parameters.getEquipments() : null;
        if ((equipments != null ? equipments.getOptionsTile() : null) == null || (optionsTile = equipments.getOptionsTile()) == null || !(!optionsTile.isEmpty())) {
            return null;
        }
        int iA2 = this.f73992a.a();
        String title = equipments.getTitle();
        String subTitle = equipments.getSubTitle();
        List<OptionsTile> optionsTile2 = equipments.getOptionsTile();
        if (optionsTile2 == null) {
            return null;
        }
        return new AdvertDetailsEquipmentsTileItem(0L, null, title, subTitle, optionsTile2, equipments.getOptions(), equipments.getAllComplectationsButton(), equipments.getButtonTitle(), Page.f83476c, advertDetails.getId(), iA2, null, null, 6147, null);
    }
}

package com.avito.android.imv_goods_advert.mvi;

import com.avito.android.advert_details_items.carousel_photogallery.CarouselPhotoGalleryItem;
import com.avito.android.advert_details_items.photogallery.AdvertDetailsGalleryItem;
import com.avito.android.arch.mvi.u;
import com.avito.android.error.z;
import com.avito.android.imv_goods_advert.mvi.entity.ImvGoodsAdvertInternalAction;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ImvGoodsAdvertReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_goods_advert/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction;", "LaN/c;", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements u<ImvGoodsAdvertInternalAction, aN.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.imv_goods_advert.a f170571b;

    @Inject
    public l(@Y61.k com.avito.android.imv_goods_advert.a aVar) {
        this.f170571b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final aN.c a(ImvGoodsAdvertInternalAction imvGoodsAdvertInternalAction, aN.c cVar) {
        ImvGoodsAdvertInternalAction imvGoodsAdvertInternalAction2 = imvGoodsAdvertInternalAction;
        aN.c cVar2 = cVar;
        boolean z12 = imvGoodsAdvertInternalAction2 instanceof ImvGoodsAdvertInternalAction.ShowContent;
        com.avito.android.imv_goods_advert.a aVar = this.f170571b;
        if (z12) {
            AdvertDetails advertDetails = ((ImvGoodsAdvertInternalAction.ShowContent) imvGoodsAdvertInternalAction2).f170553b;
            boolean zIsActive = advertDetails.isActive();
            int i12 = com.avito.android.imv_goods_advert.a.f170313i;
            return aN.c.a(cVar2, advertDetails, 0, aVar.a(advertDetails, zIsActive, 0), false, null, 18);
        }
        if (!(imvGoodsAdvertInternalAction2 instanceof ImvGoodsAdvertInternalAction.UpdateGalleryPosition)) {
            return imvGoodsAdvertInternalAction2 instanceof ImvGoodsAdvertInternalAction.ShowDescription ? aN.c.a(cVar2, null, 0, aVar.a(((ImvGoodsAdvertInternalAction.ShowDescription) imvGoodsAdvertInternalAction2).f170554b, true, cVar2.f20888c), false, null, 27) : imvGoodsAdvertInternalAction2 instanceof ImvGoodsAdvertInternalAction.ShowError ? aN.c.a(cVar2, null, 0, null, true, z.k(((ImvGoodsAdvertInternalAction.ShowError) imvGoodsAdvertInternalAction2).f170555b), 7) : cVar2;
        }
        ImvGoodsAdvertInternalAction.UpdateGalleryPosition updateGalleryPosition = (ImvGoodsAdvertInternalAction.UpdateGalleryPosition) imvGoodsAdvertInternalAction2;
        List<PersistableSpannedItem> list = cVar2.f20889d;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (PersistableSpannedItem persistableSpannedItem : list) {
            boolean z13 = persistableSpannedItem instanceof AdvertDetailsGalleryItem;
            int i13 = updateGalleryPosition.f170557b;
            if (z13) {
                ((AdvertDetailsGalleryItem) persistableSpannedItem).f85012k = i13;
            }
            if (persistableSpannedItem instanceof CarouselPhotoGalleryItem) {
                ((CarouselPhotoGalleryItem) persistableSpannedItem).f84534f = i13;
            }
            arrayList.add(persistableSpannedItem);
        }
        return aN.c.a(cVar2, null, updateGalleryPosition.f170557b, arrayList, false, null, 25);
    }
}

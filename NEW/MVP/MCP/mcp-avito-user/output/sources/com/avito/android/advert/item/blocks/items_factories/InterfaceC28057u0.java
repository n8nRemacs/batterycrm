package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.consultation.AdvertDetailsConsultationItem;
import com.avito.android.advert.item.consultation.ConsultationAfterIceBreakersItem;
import com.avito.android.advert.item.consultation.ConsultationButtonItem;
import com.avito.android.advert.item.consultation.dynamic_content.DynamicConsultationAfterIceBreakersItem;
import com.avito.android.advert.item.consultation.secondary.SecondaryConsultationItem;
import com.avito.android.advert.item.realty_quiz_banner.RealtyQuizBannerItem;
import com.avito.android.remote.model.AdvertDetails;
import kotlin.Metadata;

/* compiled from: AdvertDetailsConsultationItemsFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/u0;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.u0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC28057u0 {
    @Y61.l
    ConsultationButtonItem a(@Y61.k AdvertDetails advertDetails);

    @Y61.l
    AdvertDetailsConsultationItem b(@Y61.k AdvertDetails advertDetails);

    @Y61.l
    SecondaryConsultationItem c(@Y61.k AdvertDetails advertDetails);

    @Y61.l
    ConsultationAfterIceBreakersItem d(@Y61.k AdvertDetails advertDetails);

    @Y61.l
    RealtyQuizBannerItem e(@Y61.k AdvertDetails advertDetails);

    @Y61.l
    DynamicConsultationAfterIceBreakersItem f(@Y61.k AdvertDetails advertDetails);
}

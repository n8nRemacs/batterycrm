package com.avito.android.str_booking.domain.items_converter;

import com.avito.android.str_booking.network.di.StrBookingSectionType;
import com.avito.android.str_booking.network.models.sections.ItemInfoContent;
import com.avito.android.str_booking.network.models.sections.ItemInfoSection;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrBookingItemInfoConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/domain/items_converter/B;", "Lcom/avito/android/str_booking/domain/items_converter/A;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class B implements A {
    @Inject
    public B() {
    }

    @Override // com.avito.android.str_booking.domain.items_converter.A
    @Y61.k
    public final com.avito.android.str_booking.ui.item_info.c a(@Y61.k ItemInfoSection itemInfoSection) {
        ItemInfoContent content = itemInfoSection.getContent();
        String title = content != null ? content.getTitle() : null;
        ItemInfoContent content2 = itemInfoSection.getContent();
        String image = content2 != null ? content2.getImage() : null;
        ItemInfoContent content3 = itemInfoSection.getContent();
        String address = content3 != null ? content3.getAddress() : null;
        ItemInfoContent content4 = itemInfoSection.getContent();
        String href = content4 != null ? content4.getHref() : null;
        StringBuilder sb2 = new StringBuilder("itemInfo");
        StrBookingSectionType[] strBookingSectionTypeArr = StrBookingSectionType.f285853b;
        ItemInfoContent content5 = itemInfoSection.getContent();
        sb2.append(content5 != null ? content5.getTitle() : null);
        return new com.avito.android.str_booking.ui.item_info.c(image, title, address, href, sb2.toString());
    }
}

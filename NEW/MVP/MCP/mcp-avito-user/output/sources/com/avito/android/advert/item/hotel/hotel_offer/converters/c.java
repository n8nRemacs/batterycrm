package com.avito.android.advert.item.hotel.hotel_offer.converters;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.hotel.hotel_offer.AdvertDetailsHotelOffer;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsHotelPageOffersConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/converters/c;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c {
    @Inject
    public c() {
    }

    public static AdvertDetailsHotelOffer.InstallmentEntryPointPart a(aJ.f fVar) {
        Object next;
        AttributedText attributedText = fVar.getAttributedText();
        AdvertDetailsHotelOffer.InstallmentEntryPointPart.HighlightType.a aVar = AdvertDetailsHotelOffer.InstallmentEntryPointPart.HighlightType.f75876b;
        String highlightType = fVar.getHighlightType();
        aVar.getClass();
        Iterator it = ((AbstractC42738c) AdvertDetailsHotelOffer.InstallmentEntryPointPart.HighlightType.f75878d).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ((AdvertDetailsHotelOffer.InstallmentEntryPointPart.HighlightType) next).getClass();
            if ("flag".equals(highlightType)) {
                break;
            }
        }
        return new AdvertDetailsHotelOffer.InstallmentEntryPointPart(attributedText, (AdvertDetailsHotelOffer.InstallmentEntryPointPart.HighlightType) next);
    }
}

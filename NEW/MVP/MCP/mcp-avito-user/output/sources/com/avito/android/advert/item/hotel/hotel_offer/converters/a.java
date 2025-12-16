package com.avito.android.advert.item.hotel.hotel_offer.converters;

import androidx.compose.runtime.internal.P;
import com.avito.android.hotel.model.HotelOfferInstallmentsEntryPoint;
import com.avito.android.hotel_public.generated.api.api_2_hotel_by_item_id_get_offer_get.InstallmentEntryPointPart;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsHotelOfferResponseConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/converters/a;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* compiled from: AdvertDetailsHotelOfferResponseConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.hotel.hotel_offer.converters.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2257a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75943a;

        static {
            int[] iArr = new int[InstallmentEntryPointPart.HighlightType.values().length];
            try {
                iArr[InstallmentEntryPointPart.HighlightType.Flag.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f75943a = iArr;
        }
    }

    @Inject
    public a() {
    }

    public static HotelOfferInstallmentsEntryPoint.Part a(InstallmentEntryPointPart installmentEntryPointPart) {
        InstallmentEntryPointPart.HighlightType highlightType = installmentEntryPointPart.getHighlightType();
        return new HotelOfferInstallmentsEntryPoint.Part((highlightType == null ? -1 : C2257a.f75943a[highlightType.ordinal()]) == 1 ? HotelOfferInstallmentsEntryPoint.HighlightType.FLAG : null, installmentEntryPointPart.getAttributedText());
    }
}

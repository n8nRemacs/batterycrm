package com.avito.android.advert.item.hotel.hotel_description;

import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertHotelDescriptionPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_description/d;", "LTV0/d;", "Lcom/avito/android/advert/item/hotel/hotel_description/g;", "Lcom/avito/android/advert/item/hotel/hotel_description/AdvertHotelDescriptionItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements TV0.d<g, AdvertHotelDescriptionItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final G5.a f75855b;

    @Inject
    public d(@Y61.k G5.a aVar) {
        this.f75855b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        AdvertHotelDescriptionItem advertHotelDescriptionItem = (AdvertHotelDescriptionItem) aVar;
        String str = advertHotelDescriptionItem.f75845g;
        gVar.b(str);
        Parcelable parcelable = advertHotelDescriptionItem.f75847i;
        if (parcelable != null) {
            gVar.gb(parcelable);
        }
        gVar.Pg();
        gVar.M60(new c(advertHotelDescriptionItem, gVar, this));
        gVar.h(advertHotelDescriptionItem.f75846h);
        if (str == null) {
            str = "";
        }
        this.f75855b.u(str);
    }
}

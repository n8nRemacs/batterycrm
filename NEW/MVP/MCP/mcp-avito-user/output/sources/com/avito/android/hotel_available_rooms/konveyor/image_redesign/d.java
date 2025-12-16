package com.avito.android.hotel_available_rooms.konveyor.image_redesign;

import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: HotelRoomImageRedesignPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/image_redesign/d;", "LTV0/d;", "Lcom/avito/android/hotel_available_rooms/konveyor/image_redesign/f;", "Lcom/avito/android/hotel_available_rooms/konveyor/image_redesign/HotelRoomImageRedesignItem;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements TV0.d<f, HotelRoomImageRedesignItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<JI.a, G0> f163024b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super JI.a, G0> lVar) {
        this.f163024b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        HotelRoomImageRedesignItem hotelRoomImageRedesignItem = (HotelRoomImageRedesignItem) aVar;
        fVar.YP(hotelRoomImageRedesignItem.f163003d, hotelRoomImageRedesignItem.f163004e, hotelRoomImageRedesignItem.f163005f, hotelRoomImageRedesignItem.f163006g);
        fVar.a(new c(this, hotelRoomImageRedesignItem, i12));
    }
}

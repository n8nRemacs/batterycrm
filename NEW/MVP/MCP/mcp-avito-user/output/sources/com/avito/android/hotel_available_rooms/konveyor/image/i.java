package com.avito.android.hotel_available_rooms.konveyor.image;

import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: HotelRoomImagePresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/image/i;", "LTV0/d;", "Lcom/avito/android/hotel_available_rooms/konveyor/image/n;", "Lcom/avito/android/hotel_available_rooms/konveyor/image/HotelRoomImageItem;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements TV0.d<n, HotelRoomImageItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<JI.a, G0> f162994b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public i(@Y61.k Y41.l<? super JI.a, G0> lVar) {
        this.f162994b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        n nVar = (n) eVar;
        HotelRoomImageItem hotelRoomImageItem = (HotelRoomImageItem) aVar;
        nVar.bL(hotelRoomImageItem.f162966d, hotelRoomImageItem.f162968f, hotelRoomImageItem.f162969g);
        nVar.a(new h(this, hotelRoomImageItem, i12));
    }
}

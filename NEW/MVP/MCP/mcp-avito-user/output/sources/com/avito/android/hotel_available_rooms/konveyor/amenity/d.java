package com.avito.android.hotel_available_rooms.konveyor.amenity;

import Y41.l;
import Y61.k;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HotelRoomAmenityPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/amenity/d;", "LTV0/d;", "Lcom/avito/android/hotel_available_rooms/konveyor/amenity/f;", "Lcom/avito/android/hotel_available_rooms/konveyor/amenity/HotelRoomAmenityItem;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements TV0.d<f, HotelRoomAmenityItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<JI.a, G0> f162845b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super JI.a, G0> lVar) {
        this.f162845b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Integer numM;
        f fVar = (f) eVar;
        HotelRoomAmenityItem hotelRoomAmenityItem = (HotelRoomAmenityItem) aVar;
        String str = hotelRoomAmenityItem.f162836c;
        fVar.O4(Integer.valueOf((str == null || (numM = com.avito.android.lib.util.f.m(str)) == null) ? R.attr.textIconDone : numM.intValue()));
        fVar.setText(hotelRoomAmenityItem.f162837d);
        fVar.a(new c(hotelRoomAmenityItem, this));
    }
}

package com.avito.android.hotel_available_rooms.konveyor.gallery;

import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HotelRoomGalleryPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/gallery/i;", "LTV0/f;", "Lcom/avito/android/hotel_available_rooms/konveyor/gallery/n;", "Lcom/avito/android/hotel_available_rooms/konveyor/gallery/HotelRoomGalleryItem;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements TV0.f<n, HotelRoomGalleryItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final k f162946b;

    @Inject
    public i(@Y61.k k kVar) {
        this.f162946b = kVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        n nVar = (n) eVar;
        HotelRoomGalleryItem hotelRoomGalleryItem = (HotelRoomGalleryItem) aVar;
        nVar.y40(new g(hotelRoomGalleryItem, nVar));
        nVar.t(new h(nVar, this, hotelRoomGalleryItem));
        nVar.G0(hotelRoomGalleryItem.f162927d);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        n nVar = (n) eVar;
        HotelRoomGalleryItem hotelRoomGalleryItem = (HotelRoomGalleryItem) aVar;
        Iterator it = list.iterator();
        Object obj = null;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null ? next instanceof d : true) {
                obj = next;
            }
        }
        d dVar = (d) (obj instanceof d ? obj : null);
        if (dVar == null) {
            nVar.y40(new g(hotelRoomGalleryItem, nVar));
            nVar.t(new h(nVar, this, hotelRoomGalleryItem));
            nVar.G0(hotelRoomGalleryItem.f162927d);
        } else {
            nVar.y40(new g(hotelRoomGalleryItem, nVar));
            nVar.t(new h(nVar, this, hotelRoomGalleryItem));
            Integer num = dVar.f162938a;
            if (num != null) {
                nVar.s4(num.intValue());
            }
        }
    }
}

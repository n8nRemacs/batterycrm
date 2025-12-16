package com.avito.android.hotel_available_rooms.mvi;

import JI.b;
import com.avito.android.hotel_available_rooms.mvi.entity.HotelAvailableRoomsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HotelAvailableRoomsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/p;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction;", "LJI/b;", "<init>", "()V", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class p implements com.avito.android.arch.mvi.t<HotelAvailableRoomsInternalAction, JI.b> {
    @Inject
    public p() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final JI.b b(HotelAvailableRoomsInternalAction hotelAvailableRoomsInternalAction) {
        JI.b dVar;
        HotelAvailableRoomsInternalAction hotelAvailableRoomsInternalAction2 = hotelAvailableRoomsInternalAction;
        if (hotelAvailableRoomsInternalAction2 instanceof HotelAvailableRoomsInternalAction.CloseScreen) {
            return b.a.f8861a;
        }
        if (hotelAvailableRoomsInternalAction2 instanceof HotelAvailableRoomsInternalAction.ContentLoaded) {
            return b.c.f8864a;
        }
        if (hotelAvailableRoomsInternalAction2 instanceof HotelAvailableRoomsInternalAction.OpenDeeplink) {
            HotelAvailableRoomsInternalAction.OpenDeeplink openDeeplink = (HotelAvailableRoomsInternalAction.OpenDeeplink) hotelAvailableRoomsInternalAction2;
            dVar = new b.C0521b(openDeeplink.f163107b, openDeeplink.f163108c);
        } else {
            if (!(hotelAvailableRoomsInternalAction2 instanceof HotelAvailableRoomsInternalAction.ShowFullscreenGallery)) {
                return null;
            }
            HotelAvailableRoomsInternalAction.ShowFullscreenGallery showFullscreenGallery = (HotelAvailableRoomsInternalAction.ShowFullscreenGallery) hotelAvailableRoomsInternalAction2;
            dVar = new b.d(showFullscreenGallery.f163109b, showFullscreenGallery.f163110c, showFullscreenGallery.f163112e, showFullscreenGallery.f163113f, showFullscreenGallery.f163114g);
        }
        return dVar;
    }
}

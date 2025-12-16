package com.avito.android.hotel_available_rooms.mvi;

import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.hotel_available_rooms.domain.models.HotelAvailableRoomsData;
import com.avito.android.hotel_available_rooms.domain.models.HotelFilters;
import com.avito.android.hotel_available_rooms.mvi.entity.HotelAvailableRoomsInternalAction;
import com.avito.android.hotel_available_rooms.mvi.entity.HotelAvailableRoomsState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.B0;
import kotlin.collections.P0;
import kotlin.collections.b1;

/* compiled from: HotelAvailableRoomsReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/r;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsState;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class r implements com.avito.android.arch.mvi.u<HotelAvailableRoomsInternalAction, HotelAvailableRoomsState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f163202b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.hotel_available_rooms.konveyor.gallery.k f163203c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.provider.e f163204d;

    @Inject
    public r(@Y61.k u uVar, @Y61.k com.avito.android.hotel_available_rooms.konveyor.gallery.k kVar, @Y61.k com.avito.android.analytics.provider.e eVar) {
        this.f163202b = uVar;
        this.f163203c = kVar;
        this.f163204d = eVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final HotelAvailableRoomsState a(HotelAvailableRoomsInternalAction hotelAvailableRoomsInternalAction, HotelAvailableRoomsState hotelAvailableRoomsState) {
        HotelAvailableRoomsInternalAction hotelAvailableRoomsInternalAction2 = hotelAvailableRoomsInternalAction;
        HotelAvailableRoomsState hotelAvailableRoomsState2 = hotelAvailableRoomsState;
        boolean z12 = hotelAvailableRoomsInternalAction2 instanceof HotelAvailableRoomsInternalAction.Init;
        u uVar = this.f163202b;
        if (z12) {
            HotelAvailableRoomsInternalAction.Init init = (HotelAvailableRoomsInternalAction.Init) hotelAvailableRoomsInternalAction2;
            return uVar.a(HotelAvailableRoomsState.a(hotelAvailableRoomsState2, init.f163105b, true, null, init.f163106c, null, null, P0.c(), B0.f406639b, null, null, 784));
        }
        if (hotelAvailableRoomsInternalAction2 instanceof HotelAvailableRoomsInternalAction.ContentLoading) {
            return uVar.a(HotelAvailableRoomsState.a(hotelAvailableRoomsState2, null, false, null, null, null, null, null, null, HotelAvailableRoomsState.LoadingState.f163131b, null, 763));
        }
        if (hotelAvailableRoomsInternalAction2 instanceof HotelAvailableRoomsInternalAction.ContentError) {
            return uVar.a(HotelAvailableRoomsState.a(hotelAvailableRoomsState2, null, false, null, null, null, null, null, null, HotelAvailableRoomsState.LoadingState.f163133d, null, 763));
        }
        if (hotelAvailableRoomsInternalAction2 instanceof HotelAvailableRoomsInternalAction.ContentLoaded) {
            this.f163203c.clear();
            HotelAvailableRoomsData hotelAvailableRoomsData = ((HotelAvailableRoomsInternalAction.ContentLoaded) hotelAvailableRoomsInternalAction2).f163104b;
            HotelFilters hotelFilters = hotelAvailableRoomsData.f162771c;
            if (hotelFilters == null) {
                hotelFilters = new HotelFilters(null, null, 3, null);
            }
            return uVar.a(HotelAvailableRoomsState.a(hotelAvailableRoomsState2, null, false, hotelAvailableRoomsData, hotelFilters, new TreeClickStreamParent(this.f163204d.a(), "rooms_list", null, null), null, P0.c(), B0.f406639b, HotelAvailableRoomsState.LoadingState.f163132c, null, 545));
        }
        if (hotelAvailableRoomsInternalAction2 instanceof HotelAvailableRoomsInternalAction.AddExpandBookingItems) {
            return uVar.a(HotelAvailableRoomsState.a(hotelAvailableRoomsState2, null, false, null, null, null, null, null, b1.i(hotelAvailableRoomsState2.f163128i, ((HotelAvailableRoomsInternalAction.AddExpandBookingItems) hotelAvailableRoomsInternalAction2).f163100b), null, null, 895));
        }
        if (hotelAvailableRoomsInternalAction2 instanceof HotelAvailableRoomsInternalAction.ShowFullscreenGallery) {
            return HotelAvailableRoomsState.a(hotelAvailableRoomsState2, null, false, null, null, null, ((HotelAvailableRoomsInternalAction.ShowFullscreenGallery) hotelAvailableRoomsInternalAction2).f163111d, null, null, null, null, 991);
        }
        if (hotelAvailableRoomsInternalAction2 instanceof HotelAvailableRoomsInternalAction.UpdateGalleryPosition) {
            HotelAvailableRoomsInternalAction.UpdateGalleryPosition updateGalleryPosition = (HotelAvailableRoomsInternalAction.UpdateGalleryPosition) hotelAvailableRoomsInternalAction2;
            return uVar.a(HotelAvailableRoomsState.a(hotelAvailableRoomsState2, null, false, null, null, null, null, P0.l(hotelAvailableRoomsState2.f163127h, new Q(updateGalleryPosition.f163116b, Integer.valueOf(updateGalleryPosition.f163117c))), null, null, null, 927));
        }
        boolean z13 = hotelAvailableRoomsInternalAction2 instanceof HotelAvailableRoomsInternalAction.UpdateDateFilter;
        HotelFilters hotelFilters2 = hotelAvailableRoomsState2.f163124e;
        return z13 ? uVar.a(HotelAvailableRoomsState.a(hotelAvailableRoomsState2, null, false, null, HotelFilters.a(hotelFilters2, null, ((HotelAvailableRoomsInternalAction.UpdateDateFilter) hotelAvailableRoomsInternalAction2).f163115b, 1), null, null, null, null, null, null, 1015)) : hotelAvailableRoomsInternalAction2 instanceof HotelAvailableRoomsInternalAction.UpdateGuestFilter ? uVar.a(HotelAvailableRoomsState.a(hotelAvailableRoomsState2, null, false, null, HotelFilters.a(hotelFilters2, ((HotelAvailableRoomsInternalAction.UpdateGuestFilter) hotelAvailableRoomsInternalAction2).f163118b, null, 2), null, null, null, null, null, null, 1015)) : hotelAvailableRoomsState2;
    }
}

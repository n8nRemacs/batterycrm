package com.avito.android.hotel_available_rooms.mvi;

import com.avito.android.R;
import com.avito.android.hotel_available_rooms.domain.models.HotelAvailableRoomsData;
import com.avito.android.hotel_available_rooms.domain.models.HotelFilters;
import com.avito.android.hotel_available_rooms.mvi.entity.HotelAvailableRoomsState;
import com.avito.android.hotel_available_rooms.mvi.entity.a;
import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: HotelAvailableRoomsViewStateBuilder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/v;", "Lcom/avito/android/hotel_available_rooms/mvi/u;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class v implements u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.hotel_available_rooms.konveyor.converters.a f163208a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.hotel_available_rooms.konveyor.converters.m f163209b;

    /* compiled from: HotelAvailableRoomsViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[HotelAvailableRoomsState.LoadingState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                HotelAvailableRoomsState.LoadingState loadingState = HotelAvailableRoomsState.LoadingState.f163131b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                HotelAvailableRoomsState.LoadingState loadingState2 = HotelAvailableRoomsState.LoadingState.f163131b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public v(@Y61.k com.avito.android.hotel_available_rooms.konveyor.converters.a aVar, @Y61.k com.avito.android.hotel_available_rooms.konveyor.converters.m mVar) {
        this.f163208a = aVar;
        this.f163209b = mVar;
    }

    @Override // com.avito.android.hotel_available_rooms.mvi.u
    @Y61.k
    public final HotelAvailableRoomsState a(@Y61.k HotelAvailableRoomsState hotelAvailableRoomsState) {
        com.avito.android.hotel_available_rooms.mvi.entity.a dVar;
        int iOrdinal = hotelAvailableRoomsState.f163129j.ordinal();
        com.avito.android.hotel_available_rooms.konveyor.converters.m mVar = this.f163209b;
        HotelFilters hotelFilters = hotelAvailableRoomsState.f163124e;
        if (iOrdinal == 0) {
            dVar = new a.d(mVar.a(hotelFilters), !hotelAvailableRoomsState.f163122c);
        } else if (iOrdinal == 1) {
            HotelAvailableRoomsData hotelAvailableRoomsData = hotelAvailableRoomsState.f163123d;
            ArrayList arrayList = hotelAvailableRoomsData != null ? hotelAvailableRoomsData.f162772d : null;
            dVar = (arrayList == null || arrayList.isEmpty()) ? new a.C4768a(mVar.a(hotelFilters), com.avito.android.printable_text.b.c(R.string.hotel_available_rooms_no_data_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.hotel_available_rooms_no_data_description, new Serializable[0])) : new a.b(mVar.a(hotelFilters), this.f163208a.a(hotelAvailableRoomsState));
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = new a.c(mVar.a(hotelFilters), com.avito.android.printable_text.b.c(R.string.hotel_available_rooms_error_loading_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.hotel_available_rooms_error_loading_description, new Serializable[0]));
        }
        return HotelAvailableRoomsState.a(hotelAvailableRoomsState, null, false, null, null, null, null, null, null, null, dVar, 511);
    }
}

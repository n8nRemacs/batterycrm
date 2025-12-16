package com.avito.android.hotel_available_rooms.mvi;

import JI.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.hotel_available_rooms.domain.models.HotelFilters;
import com.avito.android.hotel_available_rooms.mvi.entity.HotelAvailableRoomsInternalAction;
import com.avito.android.hotel_available_rooms.mvi.entity.HotelAvailableRoomsState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: HotelAvailableRoomsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LJI/a;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsInternalAction;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/HotelAvailableRoomsState;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.arch.mvi.a<JI.a, HotelAvailableRoomsInternalAction, HotelAvailableRoomsState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k f163091a;

    @Inject
    public b(@Y61.k k kVar) {
        this.f163091a = kVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<HotelAvailableRoomsInternalAction> b(JI.a aVar, HotelAvailableRoomsState hotelAvailableRoomsState) {
        JI.a aVar2 = aVar;
        HotelAvailableRoomsState hotelAvailableRoomsState2 = hotelAvailableRoomsState;
        boolean z12 = aVar2 instanceof a.i;
        k kVar = this.f163091a;
        if (z12) {
            return kVar.c(((a.i) aVar2).f8856a);
        }
        if (aVar2 instanceof a.b) {
            return new C43210w(HotelAvailableRoomsInternalAction.CloseScreen.f163101b);
        }
        boolean z13 = aVar2 instanceof a.l;
        HotelFilters hotelFilters = hotelAvailableRoomsState2.f163124e;
        String str = hotelAvailableRoomsState2.f163121b;
        if (z13) {
            return kVar.b(str, hotelFilters);
        }
        int i12 = 2;
        String str2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        if (aVar2 instanceof a.C0520a) {
            return new C43210w(new HotelAvailableRoomsInternalAction.OpenDeeplink(((a.C0520a) aVar2).f8847a, str2, i12, objArr7 == true ? 1 : 0));
        }
        if (aVar2 instanceof a.e) {
            return new C43210w(new HotelAvailableRoomsInternalAction.AddExpandBookingItems(((a.e) aVar2).f8851a));
        }
        if (aVar2 instanceof a.h) {
            return C43175k.G(new a(hotelAvailableRoomsState2, (a.h) aVar2, null));
        }
        if (aVar2 instanceof a.g) {
            a.g gVar = (a.g) aVar2;
            String str3 = hotelAvailableRoomsState2.f163126g;
            return str3 == null ? C43175k.w() : new C43210w(new HotelAvailableRoomsInternalAction.UpdateGalleryPosition(str3, gVar.f8853a));
        }
        if (aVar2 instanceof a.c) {
            return new C43210w(new HotelAvailableRoomsInternalAction.OpenDeeplink(((a.c) aVar2).f8849a, objArr6 == true ? 1 : 0, i12, objArr5 == true ? 1 : 0));
        }
        if (aVar2 instanceof a.d) {
            return new C43210w(new HotelAvailableRoomsInternalAction.OpenDeeplink(((a.d) aVar2).f8850a, objArr4 == true ? 1 : 0, i12, objArr3 == true ? 1 : 0));
        }
        if (aVar2 instanceof a.k) {
            return new C43210w(new HotelAvailableRoomsInternalAction.OpenDeeplink(((a.k) aVar2).f8859a, objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0));
        }
        if (aVar2 instanceof a.f) {
            return new C43210w(new HotelAvailableRoomsInternalAction.OpenDeeplink(((a.f) aVar2).f8852a, "hotel_available_rooms_filters_request_key"));
        }
        if (!(aVar2 instanceof a.j)) {
            throw new NoWhenBranchMatchedException();
        }
        a.j jVar = (a.j) aVar2;
        return kVar.a(jVar.f8857a, jVar.f8858b, str, hotelFilters);
    }
}

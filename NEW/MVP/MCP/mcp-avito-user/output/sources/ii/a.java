package II;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.hotel_available_rooms.AvailableHotelRoomsDeeplink;
import com.avito.android.hotel_available_rooms.HotelAvailableRoomsOpenParams;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AvailableHotelRoomsDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LII/a;", "Lev/b;", "Lcom/avito/android/hotel_available_rooms/AvailableHotelRoomsDeeplink;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends AbstractC40162b<AvailableHotelRoomsDeeplink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f8073d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.hotel_available_rooms.a f8074e;

    @Inject
    public a(@k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.hotel_available_rooms.a aVar) {
        this.f8073d = interfaceC4053a;
        this.f8074e = aVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        AvailableHotelRoomsDeeplink.AvailableHotelRoomsData availableHotelRoomsData = ((AvailableHotelRoomsDeeplink) deepLink).f162645b;
        this.f8073d.R(this.f8074e.a(new HotelAvailableRoomsOpenParams(availableHotelRoomsData.getItemId(), availableHotelRoomsData.getCheckIn(), availableHotelRoomsData.getCheckOut(), availableHotelRoomsData.getAdultsCount(), availableHotelRoomsData.getFrom(), availableHotelRoomsData.f())), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}

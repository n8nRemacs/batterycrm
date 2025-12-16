package com.avito.android.deep_linking.links;

import Iu.C14159a;
import androidx.annotation.Keep;
import com.avito.android.hotel_booking.HotelBookingDeeplink;
import com.avito.android.hotel_booking.HotelBookingEnterDataDeeplink;
import com.avito.android.hotel_booking.HotelBookingSelectRadioDeeplink;
import com.avito.android.hotel_booking.HotelBookingSelectSingleValueDeeplink;
import com.avito.android.hotel_booking.HotelCreateMessengerDeeplink;
import com.avito.android.region.Region;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42756l;
import kotlin.collections.P0;

/* compiled from: avito_hotel_booking_publicGeneratedDeeplinkMetaStorage.kt */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/deep_linking/links/avito_hotel_booking_publicGeneratedDeeplinkMetaStorage;", "Lcom/avito/android/deep_linking/links/GeneratedDeepLinkMetaStorage;", "<init>", "()V", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lcom/avito/android/deep_linking/links/p;", "LIu/a;", GeneratedDeepLinkMetaStorage.PROPERTY, "Ljava/util/HashMap;", "getClassesToMetaInfo", "()Ljava/util/HashMap;", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class avito_hotel_booking_publicGeneratedDeeplinkMetaStorage implements GeneratedDeepLinkMetaStorage {

    @Y61.k
    private final HashMap<Class<? extends p>, C14159a> classesToMetaInfo;

    public avito_hotel_booking_publicGeneratedDeeplinkMetaStorage() {
        Region region = Region.f252702c;
        Region region2 = Region.f252703d;
        this.classesToMetaInfo = P0.e(new Q(HotelBookingDeeplink.class, new C14159a(1, "/hotel/booking/showForm", C42756l.l0(new Region[]{region, region2}), false)), new Q(HotelBookingEnterDataDeeplink.class, new C14159a(1, "/hotel/booking/enterData", C42756l.l0(new Region[]{region, region2}), false)), new Q(HotelBookingSelectRadioDeeplink.class, new C14159a(1, "/hotel/booking/selectRadio", C42756l.l0(new Region[]{region, region2}), false)), new Q(HotelBookingSelectSingleValueDeeplink.class, new C14159a(1, "/hotel/booking/selectSingleValue", C42756l.l0(new Region[]{region, region2}), false)), new Q(HotelCreateMessengerDeeplink.class, new C14159a(1, "/hotel/messenger/create", C42756l.l0(new Region[]{region, region2}), false)));
    }

    @Override // com.avito.android.deep_linking.links.GeneratedDeepLinkMetaStorage
    @Y61.k
    public HashMap<Class<? extends p>, C14159a> getClassesToMetaInfo() {
        return this.classesToMetaInfo;
    }
}

package DI;

import J81.f;
import J81.o;
import J81.s;
import J81.u;
import Y61.k;
import Y61.l;
import com.avito.android.hotel.model.AdvertHotelRoom;
import com.avito.android.hotel.model.HotelBookingCreateResponse;
import com.avito.android.hotel.model.HotelBookingFormResponse;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: HotelApi.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J6\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ\u0088\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\b\b\u0001\u0010\n\u001a\u00020\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u0088\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0001\u0010\n\u001a\u00020\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"LDI/c;", "", "", "itemId", "", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/hotel/model/AdvertHotelRoom;", "a", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "offerCode", "", "adultGuests", "roomId", "checkIn", "checkOut", "childAges", "params", "Lcom/avito/android/hotel/model/HotelBookingFormResponse;", "c", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/hotel/model/HotelBookingCreateResponse;", "b", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes13.dex */
public interface c {
    @f("1/hotel/{itemId}/getOffer")
    @l
    Object a(@s("itemId") @k String str, @u @k Map<String, String> map, @k Continuation<? super TypedResult<AdvertHotelRoom>> continuation);

    @o("1/hotel/booking/create")
    @J81.e
    @X41.o
    @l
    Object b(@J81.c("code") @k String str, @J81.c("adultGuests") @l Integer num, @J81.c("itemId") @l String str2, @J81.c("roomId") @l String str3, @J81.c("checkIn") @l String str4, @J81.c("checkOut") @l String str5, @J81.d @k Map<String, String> map, @J81.d @k Map<String, String> map2, @k Continuation<TypedResult<HotelBookingCreateResponse>> continuation);

    @o("1/hotel/booking/getForm")
    @J81.e
    @X41.o
    @l
    Object c(@J81.c("code") @k String str, @J81.c("adultGuests") @l Integer num, @J81.c("itemId") @l String str2, @J81.c("roomId") @l String str3, @J81.c("checkIn") @l String str4, @J81.c("checkOut") @l String str5, @J81.d @k Map<String, String> map, @J81.d @k Map<String, String> map2, @k Continuation<TypedResult<HotelBookingFormResponse>> continuation);
}

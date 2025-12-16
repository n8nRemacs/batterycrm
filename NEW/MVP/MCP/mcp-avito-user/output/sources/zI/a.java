package ZI;

import J81.f;
import J81.k;
import J81.s;
import J81.t;
import Y61.l;
import aJ.C19778b;
import bJ.InterfaceC25517a;
import com.avito.android.remote.model.TypedResult;
import dJ.C39588a;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import eJ.C40010b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: HotelApi.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JP\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0012J\\\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\b\b\u0001\u0010\t\u001a\u00020\u00022\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u0015\u0010\u0016JR\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LZI/a;", "", "", "itemId", "", "checkIn", "checkOut", "", "childGuestAges", "adultGuests", "Lcom/avito/android/remote/model/TypedResult;", "LaJ/b;", "d", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intent", "bookingId", "LdJ/a;", "c", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "context", "LbJ/a;", "a", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LeJ/b;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes13.dex */
public interface a {
    @f("2/hotel/{itemId}/getOffer")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object a(@s("itemId") long j12, @t("checkIn") @Y61.k String str, @t("checkOut") @Y61.k String str2, @l @t("childGuestAges") List<Long> list, @t("adultGuests") long j13, @l @t("context") String str3, @Y61.k Continuation<? super TypedResult<InterfaceC25517a>> continuation);

    @f("3/hotel/{itemId}/searchOffers")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object b(@s("itemId") @Y61.k String str, @t("checkIn") @Y61.k String str2, @t("checkOut") @Y61.k String str3, @l @t("childGuestAges") List<Long> list, @l @t("adultGuests") Long l12, @Y61.k Continuation<? super TypedResult<C40010b>> continuation);

    @f("2/hotel/help/chat")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object c(@t("intent") @Y61.k String str, @t("bookingId") long j12, @Y61.k Continuation<? super TypedResult<C39588a>> continuation);

    @f("1/hotel/{itemId}/itemPageOffers")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object d(@s("itemId") long j12, @t("checkIn") @Y61.k String str, @t("checkOut") @Y61.k String str2, @l @t("childGuestAges") List<Long> list, @t("adultGuests") long j13, @Y61.k Continuation<? super TypedResult<C19778b>> continuation);
}

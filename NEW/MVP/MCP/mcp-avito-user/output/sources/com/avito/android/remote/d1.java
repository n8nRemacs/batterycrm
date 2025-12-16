package com.avito.android.remote;

import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.AdvertStrSwitchResponse;
import com.avito.android.remote.model.StrBookingCalculateDetailsResponse;
import com.avito.android.remote.model.StrBookingCalendar;
import com.avito.android.remote.model.StrBookingPromoCodeApplyResponse;
import com.avito.android.remote.model.StrIncreasedCashbackApplyResponse;
import com.avito.android.remote.model.StrItemBookingSellerCalendarResponse;
import com.avito.android.remote.model.StrOrdersBuyerResponse;
import com.avito.android.remote.model.StrSellerCalendarLastMinuteOfferResponse;
import com.avito.android.remote.model.StrSellerCalendarParameters;
import com.avito.android.remote.model.StrSellerCalendarParametersUpdateResponse;
import com.avito.android.remote.model.StrUxFeedbackInfoResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ShortTermRentApi.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J~\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\fH§@¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000e0\u00132\b\b\u0001\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\u0002H'¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u0002H§@¢\u0006\u0004\b \u0010!JB\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\f2\u0014\b\u0001\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020#H§@¢\u0006\u0004\b&\u0010'JV\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\f2\u0014\b\u0001\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020#H§@¢\u0006\u0004\b(\u0010)J*\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u0002H§@¢\u0006\u0004\b+\u0010\u001aJ9\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u000e0\u00132\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010,\u001a\u00020\u00022\b\b\u0001\u0010-\u001a\u00020\u0002H'¢\u0006\u0004\b/\u00100J/\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u000e0\u00132\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u00101\u001a\u00020\fH'¢\u0006\u0004\b2\u00103J\"\u00105\u001a\b\u0012\u0004\u0012\u0002040\u000e2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b5\u0010\u001dJ4\u00107\u001a\b\u0012\u0004\u0012\u0002060\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u0002H§@¢\u0006\u0004\b7\u0010!J\u0016\u00109\u001a\b\u0012\u0004\u0012\u0002080\u000eH§@¢\u0006\u0004\b9\u0010:J,\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u000e2\u0014\b\u0001\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020#H§@¢\u0006\u0004\b=\u0010>J,\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u000e2\b\b\u0001\u0010\b\u001a\u00020\u00022\n\b\u0003\u0010?\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bA\u0010\u001aJ \u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\b\b\u0001\u0010B\u001a\u00020\u0002H§@¢\u0006\u0004\bD\u0010\u001dJ8\u0010F\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\b\b\u0001\u0010B\u001a\u00020\u00022\u0016\b\u0001\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020#H§@¢\u0006\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lcom/avito/android/remote/d1;", "", "", "checkInDate", "checkOutDate", "", "guestsCount", "itemId", "promoCode", "guestsDetailed", "paymentType", "paymentPlan", "", "nonRefundableDiscountEnable", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/StrBookingCalculateDetailsResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isEnabled", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/AdvertStrSwitchResponse;", "o", "(ZLjava/lang/String;)Lio/reactivex/rxjava3/core/z;", "currentDate", "Lcom/avito/android/remote/model/StrItemBookingSellerCalendarResponse;", "q", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/remote/model/StrSellerCalendarParameters;", "f", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startDate", "endDate", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "warningAccepted", "", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lcom/avito/android/remote/model/StrSellerCalendarParametersUpdateResponse;", "e", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/remote/model/StrBookingCalendar;", "l", AddressParameter.TYPE, "flatNumber", "Lkotlin/G0;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "enabled", "a", "(Ljava/lang/String;Z)Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/StrUxFeedbackInfoResponse;", "c", "Lcom/avito/android/remote/model/StrSellerCalendarLastMinuteOfferResponse;", "j", "Lcom/avito/android/remote/model/StrIncreasedCashbackApplyResponse;", "h", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "params", "Lcom/avito/android/remote/model/StrOrdersBuyerResponse;", "k", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bookingContext", "Lcom/avito/android/remote/model/StrBookingPromoCodeApplyResponse;", "m", ContextActionHandler.Link.URL, "LUx0/b;", "i", "content", "n", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes17.dex */
public interface d1 {

    /* compiled from: ShortTermRentApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @J81.o("1/str/tns/item/toggleOnlineBooking")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<kotlin.G0>> a(@J81.c("itemId") @Y61.k String itemId, @J81.c("enabled") boolean enabled);

    @J81.f("2/str/booking/calculate/details")
    @Y61.l
    Object b(@Y61.l @J81.t("checkInDate") String str, @Y61.l @J81.t("checkOutDate") String str2, @J81.t("guestsCount") int i12, @J81.t("itemId") @Y61.k String str3, @Y61.l @J81.t("promoCode") String str4, @Y61.l @J81.t("guestsDetailed") String str5, @Y61.l @J81.t("paymentType") String str6, @Y61.l @J81.t("paymentPlan") String str7, @Y61.l @J81.t("nonRefundableDiscountEnable") Boolean bool, @Y61.k Continuation<? super TypedResult<StrBookingCalculateDetailsResponse>> continuation);

    @J81.o("1/str/seller/uxfeedback/getInfo")
    @J81.e
    @Y61.l
    Object c(@J81.c("itemID") @Y61.l String str, @Y61.k Continuation<? super TypedResult<StrUxFeedbackInfoResponse>> continuation);

    @J81.o("1/str/connectInsurance")
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<kotlin.G0>> d(@J81.t("itemID") @Y61.k String itemId, @J81.t(AddressParameter.TYPE) @Y61.k String address, @J81.t("flatNumber") @Y61.k String flatNumber);

    @J81.o("2/str/seller/booking/calendar/parameters/base/update")
    @J81.e
    @Y61.l
    Object e(@J81.c("itemId") @Y61.k String str, @J81.c("warningAccepted") @Y61.l Boolean bool, @J81.d @Y61.k Map<String, String> map, @Y61.k Continuation<? super TypedResult<StrSellerCalendarParametersUpdateResponse>> continuation);

    @J81.f("1/str/seller/booking/calendar/parameters/base")
    @Y61.l
    Object f(@J81.t("itemId") @Y61.k String str, @Y61.k Continuation<? super TypedResult<StrSellerCalendarParameters>> continuation);

    @J81.f("1/str/seller/booking/calendar/parameters/range")
    @Y61.l
    Object g(@J81.t("itemId") @Y61.k String str, @J81.t("startDate") @Y61.k String str2, @J81.t("endDate") @Y61.k String str3, @Y61.k Continuation<? super TypedResult<StrSellerCalendarParameters>> continuation);

    @J81.o("1/str/buyer/apply/increasedCashback")
    @Y61.l
    Object h(@Y61.k Continuation<? super TypedResult<StrIncreasedCashbackApplyResponse>> continuation);

    @J81.f
    @Y61.l
    Object i(@J81.y @Y61.k String str, @Y61.k Continuation<? super TypedResult<Ux0.b>> continuation);

    @J81.f("1/str/seller/booking/calendar/parameters/range/lastMinuteOffer")
    @Y61.l
    Object j(@J81.t("itemId") @Y61.k String str, @J81.t("startDate") @Y61.k String str2, @J81.t("endDate") @Y61.k String str3, @Y61.k Continuation<? super TypedResult<StrSellerCalendarLastMinuteOfferResponse>> continuation);

    @J81.o("1/str/buyer/orders/list")
    @J81.e
    @Y61.l
    Object k(@J81.d @Y61.k Map<String, String> map, @Y61.k Continuation<? super TypedResult<StrOrdersBuyerResponse>> continuation);

    @J81.f("1/str/item/booking/calendar/data")
    @Y61.l
    Object l(@J81.t("itemId") @Y61.k String str, @J81.t("startDate") @Y61.k String str2, @Y61.k Continuation<? super TypedResult<StrBookingCalendar>> continuation);

    @J81.o("1/str/promoCode/apply")
    @J81.e
    @Y61.l
    Object m(@J81.c("promoCode") @Y61.k String str, @J81.c("bookingContext") @Y61.l String str2, @Y61.k Continuation<? super TypedResult<StrBookingPromoCodeApplyResponse>> continuation);

    @J81.o
    @J81.e
    @Y61.l
    Object n(@J81.y @Y61.k String str, @J81.d @Y61.k Map<String, String> map, @Y61.k Continuation<? super TypedResult<Ux0.b>> continuation);

    @J81.o("1/str/item/toggleEnabled")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<AdvertStrSwitchResponse>> o(@J81.c("isEnabled") boolean isEnabled, @J81.c("itemId") @Y61.k String itemId);

    @J81.o("1/str/seller/booking/calendar/parameters/range/update")
    @J81.e
    @Y61.l
    Object p(@J81.c("itemId") @Y61.k String str, @J81.c("startDate") @Y61.k String str2, @J81.c("endDate") @Y61.k String str3, @J81.c("warningAccepted") @Y61.l Boolean bool, @J81.d @Y61.k Map<String, String> map, @Y61.k Continuation<? super TypedResult<StrSellerCalendarParametersUpdateResponse>> continuation);

    @J81.f("1/str/item/booking/seller/calendar/data")
    @Y61.l
    Object q(@J81.t("itemId") @Y61.k String str, @J81.t("currentDate") @Y61.k String str2, @Y61.k Continuation<? super TypedResult<StrItemBookingSellerCalendarResponse>> continuation);
}

package com.avito.android.remote;

import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.remote.model.OrderCancellationReasons;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.delivery.DeliveryCourierPayoutRedirectResponse;
import com.avito.android.remote.model.delivery.DeliveryOrderCreateResponse;
import com.avito.android.remote.model.delivery.DeliveryPayoutRedirectResponse;
import com.avito.android.remote.model.delivery.DeliveryReturnCheckoutResult;
import com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: DeliveryApi.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J1\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJD\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0015Jµ\u0001\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00060#2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00172\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0010H'¢\u0006\u0004\b%\u0010&J1\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b(\u0010\tJ1\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00060#2\b\b\u0001\u0010\u001a\u001a\u00020\u00022\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b*\u0010+J6\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0017H§@¢\u0006\u0004\b-\u0010.J,\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00062\u0014\b\u0001\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0017H§@¢\u0006\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/avito/android/remote/B;", "", "", "orderId", "redirectTo", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/delivery/DeliveryPayoutRedirectResponse;", "h", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "Lkotlin/G0;", "b", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/OrderCancellationReasons;", "f", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "reasonId", "reasonTitle", "reasonText", "i", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deliveryType", "", "extraRequestParams", "nextScreen", "itemId", "context", "promocode", "reloadReason", "userAddressId", "supportedTabType", "isSupportAttributedTextPair", "quickAlertsSupport", "isUniversalMapSupported", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/universalDeliveryType/UniversalDeliveryTypeContent;", "c", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/delivery/DeliveryCourierPayoutRedirectResponse;", "e", "Lcom/avito/android/remote/model/DeepLinkResponse;", "d", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/delivery/DeliveryReturnCheckoutResult;", "g", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/remote/model/delivery/DeliveryOrderCreateResponse;", "a", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes17.dex */
public interface B {
    @J81.o("2/order/create")
    @J81.e
    @Y61.l
    Object a(@J81.d @Y61.k Map<String, String> map, @Y61.k Continuation<? super TypedResult<DeliveryOrderCreateResponse>> continuation);

    @J81.o("1/delivery/order/{orderId}/cancel")
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<kotlin.G0>> b(@J81.s("orderId") @Y61.k String orderId);

    @J81.k({"X-Geo-required: true"})
    @J81.f("1/delivery/method/choices")
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<UniversalDeliveryTypeContent>> c(@Y61.l @J81.t("deliveryType") String deliveryType, @J81.u @Y61.k Map<String, String> extraRequestParams, @Y61.l @J81.t("nextScreen") String nextScreen, @Y61.l @J81.t("itemId") String itemId, @Y61.l @J81.t("context") String context, @Y61.l @J81.t("promocode") String promocode, @Y61.l @J81.t("reloadReason") String reloadReason, @Y61.l @J81.t("userAddressId") Integer userAddressId, @Y61.l @J81.t("tabsType") String supportedTabType, @Y61.l @J81.t("attributedTextPairSupport") Integer isSupportAttributedTextPair, @Y61.l @J81.t("quickAlertsSupport") Integer quickAlertsSupport, @Y61.l @J81.t("isUniversalMapSupported") Integer isUniversalMapSupported);

    @J81.o("1/delivery/request/create")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<DeepLinkResponse>> d(@J81.c("itemId") @Y61.k String itemId, @J81.c("context") @Y61.l String context);

    @J81.f("1/deliveryCourier/order/request/payout")
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<DeliveryCourierPayoutRedirectResponse>> e(@J81.t("orderId") @Y61.k String orderId, @Y61.l @J81.t("redirectTo") String redirectTo);

    @J81.f("2/delivery/order/{orderId}/cancel/reasons")
    @Y61.l
    Object f(@J81.s("orderId") @Y61.k String str, @Y61.k Continuation<? super TypedResult<OrderCancellationReasons>> continuation);

    @J81.f("1/delivery/order/{orderId}/return/checkout/seller")
    @Y61.l
    Object g(@J81.s("orderId") @Y61.k String str, @J81.u @Y61.k Map<String, String> map, @Y61.k Continuation<? super TypedResult<DeliveryReturnCheckoutResult>> continuation);

    @J81.o("1/delivery/order/{orderId}/payout")
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<DeliveryPayoutRedirectResponse>> h(@J81.s("orderId") @Y61.k String orderId, @Y61.l @J81.t("redirectTo") String redirectTo);

    @J81.o("1/delivery/order/{orderId}/cancel")
    @J81.e
    @Y61.l
    Object i(@J81.s("orderId") @Y61.k String str, @J81.c("reasonId") @Y61.l Integer num, @J81.c("reasonTitle") @Y61.l String str2, @J81.c("reasonText") @Y61.l String str3, @Y61.k Continuation<? super TypedResult<kotlin.G0>> continuation);
}

package com.avito.android.remote;

import com.avito.android.beduin_models.BeduinUniversalPageContent;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.delivery.DeliverySavedAddressResult;
import com.avito.android.remote.model.delivery.DeliveryUniversalCheckoutSummary;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: DeliveryCheckoutApi.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0094\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\rH§@¢\u0006\u0004\b\u0012\u0010\u0013J¬\u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\rH§@¢\u0006\u0004\b\u0019\u0010\u001aJD\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0014\b\u0001\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001b2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0004\b\u001d\u0010\u001eJ_\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00100 2\b\b\u0001\u0010\u0006\u001a\u00020\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001bH'¢\u0006\u0004\b\"\u0010#J1\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00100 2\u0014\b\u0001\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001bH'¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/avito/android/remote/E;", "", "", "deliveryType", "fiasGuid", "serviceId", "itemId", "promocode", "checkoutViewMode", "context", "", "isSupportAttributedTextPair", "quickAlertsSupport", "", "deliveryLatitude", "deliveryLongitude", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/delivery/DeliveryUniversalCheckoutSummary;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "providerKey", AddressParameter.TYPE, "addressDetails", "courierDeliverStartDate", "courierDeliveryEndDate", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "extraRequestParams", "d", "(Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "srcp", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/delivery/DeliverySavedAddressResult;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/beduin_models/BeduinUniversalPageContent;", "e", "(Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes17.dex */
public interface E {
    @J81.k({"X-Geo-required: true"})
    @J81.f("1/delivery/savedAddress/check")
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<DeliverySavedAddressResult>> a(@J81.t("itemId") @Y61.k String itemId, @Y61.l @J81.t("context") String context, @Y61.l @J81.t("promocode") String promocode, @Y61.l @J81.t("srcp") String srcp, @J81.u @Y61.k Map<String, String> extraRequestParams);

    @J81.f("1/delivery/order/checkout?cartOnboardingBannerSupport=1")
    @InterfaceC42830m
    @J81.k({"X-Geo-required: true"})
    @Y61.l
    Object b(@J81.t("deliveryType") @Y61.k String str, @J81.t("providerKey") @Y61.k String str2, @J81.t(AddressParameter.TYPE) @Y61.k String str3, @Y61.l @J81.t("itemId") String str4, @Y61.l @J81.t("addressDetails") String str5, @Y61.l @J81.t("checkoutViewMode") String str6, @Y61.l @J81.t("context") String str7, @Y61.l @J81.t("attributedTextPairSupport") Integer num, @Y61.l @J81.t("quickAlertsSupport") Integer num2, @Y61.l @J81.t("courierDeliveryStartDate") String str8, @Y61.l @J81.t("courierDeliveryEndDate") String str9, @Y61.l @J81.t("deliveryLatitude") Double d12, @Y61.l @J81.t("deliveryLongitude") Double d13, @Y61.k Continuation<? super TypedResult<DeliveryUniversalCheckoutSummary>> continuation);

    @J81.f("1/delivery/order/checkout?cartOnboardingBannerSupport=1")
    @InterfaceC42830m
    @J81.k({"X-Geo-required: true"})
    @Y61.l
    Object c(@J81.t("deliveryType") @Y61.k String str, @J81.t("fiasGuid") @Y61.k String str2, @J81.t("serviceId") @Y61.k String str3, @Y61.l @J81.t("itemId") String str4, @Y61.l @J81.t("promocode") String str5, @Y61.l @J81.t("checkoutViewMode") String str6, @Y61.l @J81.t("context") String str7, @Y61.l @J81.t("attributedTextPairSupport") Integer num, @Y61.l @J81.t("quickAlertsSupport") Integer num2, @Y61.l @J81.t("deliveryLatitude") Double d12, @Y61.l @J81.t("deliveryLongitude") Double d13, @Y61.k Continuation<? super TypedResult<DeliveryUniversalCheckoutSummary>> continuation);

    @J81.k({"X-Geo-required: true"})
    @J81.f("1/delivery/order/checkout?cartOnboardingBannerSupport=1")
    @Y61.l
    Object d(@J81.u @Y61.k Map<String, String> map, @Y61.l @J81.t("attributedTextPairSupport") Integer num, @Y61.l @J81.t("quickAlertsSupport") Integer num2, @Y61.k Continuation<? super TypedResult<DeliveryUniversalCheckoutSummary>> continuation);

    @J81.o("1/delivery/order/realOneClick/checkout")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<BeduinUniversalPageContent>> e(@J81.d @Y61.k Map<String, String> extraRequestParams);
}

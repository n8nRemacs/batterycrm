package yj0;

import Cj0.g;
import Ej0.C13494a;
import Fj0.InterfaceC13808a;
import Gj0.C13890a;
import J81.e;
import J81.f;
import J81.k;
import J81.o;
import J81.t;
import Y61.l;
import com.avito.android.remote.autoteka.generated.api.get_step_order_status_api.GetStepOrderStatusApiResponse;
import com.avito.android.remote.autoteka.generated.api.get_step_report_status_api.GetStepReportStatusApiResponse;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AutotekaApi.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J8\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0013\u0010\u0014JP\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0001\u0010\u0017\u001a\u00020\u00042\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00072\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u00042\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u001e\u0010\u001fJF\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00072\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\"\u0010#J\u008c\u0001\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00072\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u00042\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lyj0/a;", "", "", "orderItemId", "", "externalId", "attempt", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/autoteka/generated/api/get_step_order_status_api/GetStepOrderStatusApiResponse;", "d", "(Ljava/lang/Long;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "usagePublicId", "Lcom/avito/android/remote/autoteka/generated/api/get_step_report_status_api/GetStepReportStatusApiResponse;", "a", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fromBlock", "analytX", "reportPublicId", "LEj0/a;", "f", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isContestAgreementChecked", "productSlug", "promocode", "searchKey", "LFj0/a;", "e", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LGj0/a;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "repurchase", "LCj0/g;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utmCampaign", "utmContent", "utmMedium", "utmSource", "utmTerm", "LBj0/c;", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: yj0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC50257a {
    @f("1/autoteka/sales/step/report-status")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object a(@t("usagePublicId") @Y61.k String str, @t("attempt") long j12, @Y61.k Continuation<? super TypedResult<GetStepReportStatusApiResponse>> continuation);

    @o("2/autoteka/sales/use-report-package")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @k({"X-Geo-required: true"})
    @l
    Object b(@J81.c("analytX") @l String str, @J81.c("searchKey") @Y61.k String str2, @J81.c("usagePublicId") @l String str3, @Y61.k Continuation<? super TypedResult<C13890a>> continuation);

    @f("3/autoteka/sales/step/products")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@l @t("searchKey") String str, @l @t("analytX") String str2, @l @t("fromBlock") Long l12, @l @t("repurchase") String str3, @Y61.k Continuation<? super TypedResult<g>> continuation);

    @f("1/autoteka/sales/step/order-status")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object d(@l @t("orderItemId") Long l12, @l @t("externalId") String str, @t("attempt") long j12, @Y61.k Continuation<? super TypedResult<GetStepOrderStatusApiResponse>> continuation);

    @o("2/autoteka/sales/create-order")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object e(@J81.c("analytX") @l String str, @J81.c("isContestAgreementChecked") @l Boolean bool, @J81.c("productSlug") @Y61.k String str2, @J81.c("promocode") @l String str3, @J81.c("searchKey") @l String str4, @Y61.k Continuation<? super TypedResult<InterfaceC13808a>> continuation);

    @f("1/autoteka/sales/step/report-view")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object f(@l @t("fromBlock") Long l12, @l @t("analytX") String str, @t("reportPublicId") @Y61.k String str2, @Y61.k Continuation<? super TypedResult<C13494a>> continuation);

    @f("4/autoteka/sales/step/order")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object g(@l @t("searchKey") String str, @l @t("utm_campaign") String str2, @l @t("utm_content") String str3, @l @t("utm_medium") String str4, @l @t("utm_source") String str5, @l @t("utm_term") String str6, @l @t("fromBlock") Long l12, @l @t("analytX") String str7, @t("productSlug") @Y61.k String str8, @l @t("promocode") String str9, @Y61.k Continuation<? super TypedResult<Bj0.c>> continuation);
}

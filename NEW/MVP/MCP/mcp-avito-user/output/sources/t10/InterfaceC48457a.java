package t10;

import J81.f;
import J81.k;
import J81.t;
import Y61.l;
import com.avito.android.mortgage_calculator.generated.api.api_1_mortgage_catalog_calculator_offers_get.CalculatorType;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import u10.C48759a;
import v10.C49139a;

/* compiled from: UtilApi.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ\u0084\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u000b2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lt10/a;", "", "", "entityType", "entityId", "Lcom/avito/android/remote/model/TypedResult;", "Lu10/a;", "b", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/CalculatorType;", "calculatorType", "", "propertyCost", "monthlyPayment", SearchParamsConverterKt.LOCATION_ID, "purposeId", "downPayment", "term", "landCost", "Lv10/a;", "a", "(Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/CalculatorType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;JLjava/lang/String;JJLjava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: t10.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC48457a {
    @f("1/mortgage-catalog/calculator/offers")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object a(@t("calculatorType") @Y61.k CalculatorType calculatorType, @l @t("entityType") String str, @l @t("entityId") String str2, @l @t("propertyCost") Long l12, @l @t("monthlyPayment") Long l13, @t(SearchParamsConverterKt.LOCATION_ID) long j12, @t("purposeId") @Y61.k String str3, @t("downPayment") long j13, @t("term") long j14, @l @t("landCost") Long l14, @Y61.k Continuation<? super TypedResult<C49139a>> continuation);

    @f("1/mortgage-catalog/calculator/initial-values")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object b(@t("entityType") @Y61.k String str, @l @t("entityId") String str2, @Y61.k Continuation<? super TypedResult<C48759a>> continuation);
}

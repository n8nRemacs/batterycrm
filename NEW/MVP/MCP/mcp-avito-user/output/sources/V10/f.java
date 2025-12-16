package v10;

import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_calculator.generated.api.api_1_mortgage_catalog_calculator_offers_get.CalculatorOfferDescriptionAction;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1MortgageCatalogCalculatorOffersGetResponse.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lv10/f;", "", "Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/CalculatorOfferDescriptionAction;", "action", "", "Lv10/m;", "conditions", "Lv10/n;", "discounts", "Lv10/e;", "offer", "Lv10/h;", "offersSummary", "<init>", "(Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/CalculatorOfferDescriptionAction;Ljava/util/List;Lv10/n;Lv10/e;Lv10/h;)V", "Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/CalculatorOfferDescriptionAction;", "a", "()Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/CalculatorOfferDescriptionAction;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lv10/n;", "c", "()Lv10/n;", "Lv10/e;", "d", "()Lv10/e;", "Lv10/h;", "e", "()Lv10/h;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f {

    @com.google.gson.annotations.c("action")
    @Y61.k
    private final CalculatorOfferDescriptionAction action;

    @com.google.gson.annotations.c("conditions")
    @Y61.l
    private final List<m> conditions;

    @com.google.gson.annotations.c("discounts")
    @Y61.l
    private final n discounts;

    @com.google.gson.annotations.c("offer")
    @Y61.l
    private final e offer;

    @com.google.gson.annotations.c("offersSummary")
    @Y61.l
    private final h offersSummary;

    public f(@Y61.k CalculatorOfferDescriptionAction calculatorOfferDescriptionAction, @Y61.l List<m> list, @Y61.l n nVar, @Y61.l e eVar, @Y61.l h hVar) {
        this.action = calculatorOfferDescriptionAction;
        this.conditions = list;
        this.discounts = nVar;
        this.offer = eVar;
        this.offersSummary = hVar;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final CalculatorOfferDescriptionAction getAction() {
        return this.action;
    }

    @Y61.l
    public final List<m> b() {
        return this.conditions;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final n getDiscounts() {
        return this.discounts;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final e getOffer() {
        return this.offer;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final h getOffersSummary() {
        return this.offersSummary;
    }
}

package v10;

import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_calculator.generated.api.api_1_mortgage_catalog_calculator_offers_get.LimitsFailureAction;
import kotlin.Metadata;

/* compiled from: Api1MortgageCatalogCalculatorOffersGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lv10/s;", "", "Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/LimitsFailureAction;", "action", "", "hint", "<init>", "(Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/LimitsFailureAction;Ljava/lang/String;)V", "Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/LimitsFailureAction;", "a", "()Lcom/avito/android/mortgage_calculator/generated/api/api_1_mortgage_catalog_calculator_offers_get/LimitsFailureAction;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s {

    @com.google.gson.annotations.c("action")
    @Y61.k
    private final LimitsFailureAction action;

    @com.google.gson.annotations.c("hint")
    @Y61.k
    private final String hint;

    public s(@Y61.k LimitsFailureAction limitsFailureAction, @Y61.k String str) {
        this.action = limitsFailureAction;
        this.hint = str;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final LimitsFailureAction getAction() {
        return this.action;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getHint() {
        return this.hint;
    }
}

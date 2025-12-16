package ds;

import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo.generated.api.api_3_cpa_cjm_cpx_promo_get_data_get.OkRespDataSuccessAutoBudgetValuesItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api3CpaCjmCpxPromoGetDataGetResponse.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lds/i;", "", "", "selectedValue", "Lds/j;", "title", "", "Lcom/avito/android/cpx_promo/generated/api/api_3_cpa_cjm_cpx_promo_get_data_get/OkRespDataSuccessAutoBudgetValuesItem;", "values", "<init>", "(Ljava/lang/String;Lds/j;Ljava/util/List;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lds/j;", "b", "()Lds/j;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i {

    @com.google.gson.annotations.c("selectedValue")
    @Y61.k
    private final String selectedValue;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final j title;

    @com.google.gson.annotations.c("values")
    @Y61.k
    private final List<OkRespDataSuccessAutoBudgetValuesItem> values;

    public i(@Y61.k String str, @Y61.k j jVar, @Y61.k List<OkRespDataSuccessAutoBudgetValuesItem> list) {
        this.selectedValue = str;
        this.title = jVar;
        this.values = list;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getSelectedValue() {
        return this.selectedValue;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final j getTitle() {
        return this.title;
    }

    @Y61.k
    public final List<OkRespDataSuccessAutoBudgetValuesItem> c() {
        return this.values;
    }
}

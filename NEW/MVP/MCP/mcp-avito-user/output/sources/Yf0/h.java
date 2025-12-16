package YF0;

import com.avito.android.trx_promo_impl.generated.api.api_trx_promo_configure_v_7.ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiTrxPromoConfigureV7Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LYF0/h;", "", "", "buttonTitle", "screenTitle", "startDate", "", "Lcom/avito/android/trx_promo_impl/generated/api/api_trx_promo_configure_v_7/ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem;", "validators", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h {

    @com.google.gson.annotations.c("buttonTitle")
    @Y61.k
    private final String buttonTitle;

    @com.google.gson.annotations.c("screenTitle")
    @Y61.k
    private final String screenTitle;

    @com.google.gson.annotations.c("startDate")
    @Y61.k
    private final String startDate;

    @com.google.gson.annotations.c("validators")
    @Y61.l
    private final List<ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem> validators;

    public h(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l List<ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem> list) {
        this.buttonTitle = str;
        this.screenTitle = str2;
        this.startDate = str3;
        this.validators = list;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getScreenTitle() {
        return this.screenTitle;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    @Y61.l
    public final List<ApiDatesV3WithDateRangeOptionsItemDatePickerValidatorsItem> d() {
        return this.validators;
    }
}

package ds;

import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo.generated.api.api_3_cpa_cjm_cpx_promo_get_data_get.TriggerData;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api3CpaCjmCpxPromoGetDataGetResponse.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lds/u;", "", "", "color", "description", "Lcom/avito/android/remote/model/text/AttributedText;", "forecast", RequestReviewResultKt.INFO_TYPE, "input", "Lcom/avito/android/cpx_promo/generated/api/api_3_cpa_cjm_cpx_promo_get_data_get/TriggerData;", "triggerData", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/cpx_promo/generated/api/api_3_cpa_cjm_cpx_promo_get_data_get/TriggerData;J)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "Lcom/avito/android/remote/model/text/AttributedText;", "getForecast", "()Lcom/avito/android/remote/model/text/AttributedText;", "c", "d", "Lcom/avito/android/cpx_promo/generated/api/api_3_cpa_cjm_cpx_promo_get_data_get/TriggerData;", "e", "()Lcom/avito/android/cpx_promo/generated/api/api_3_cpa_cjm_cpx_promo_get_data_get/TriggerData;", "J", "f", "()J", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class u {

    @com.google.gson.annotations.c("color")
    @Y61.k
    private final String color;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final String description;

    @com.google.gson.annotations.c("forecast")
    @Y61.l
    private final AttributedText forecast;

    @com.google.gson.annotations.c(RequestReviewResultKt.INFO_TYPE)
    @Y61.l
    private final String info;

    @com.google.gson.annotations.c("input")
    @Y61.k
    private final String input;

    @com.google.gson.annotations.c("triggerData")
    @Y61.l
    private final TriggerData triggerData;

    @com.google.gson.annotations.c("value")
    private final long value;

    public u(@Y61.k String str, @Y61.l String str2, @Y61.l AttributedText attributedText, @Y61.l String str3, @Y61.k String str4, @Y61.l TriggerData triggerData, long j12) {
        this.color = str;
        this.description = str2;
        this.forecast = attributedText;
        this.info = str3;
        this.input = str4;
        this.triggerData = triggerData;
        this.value = j12;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getInput() {
        return this.input;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final TriggerData getTriggerData() {
        return this.triggerData;
    }

    /* renamed from: f, reason: from getter */
    public final long getValue() {
        return this.value;
    }
}

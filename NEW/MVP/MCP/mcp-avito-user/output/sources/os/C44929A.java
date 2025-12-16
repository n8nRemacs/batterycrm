package os;

import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo_geo.generated.api.api_1_cpa_cjm_cpx_promo_geo_get_data_post.TriggerDataGeo;
import kotlin.Metadata;

/* compiled from: Api1CpaCjmCpxPromoGeoGetDataPostResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"Los/A;", "", "", "hintText", "", "sliderPercent", "Lcom/avito/android/cpx_promo_geo/generated/api/api_1_cpa_cjm_cpx_promo_geo_get_data_post/TriggerDataGeo;", "triggerData", "value", "<init>", "(Ljava/lang/String;DLcom/avito/android/cpx_promo_geo/generated/api/api_1_cpa_cjm_cpx_promo_geo_get_data_post/TriggerDataGeo;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "D", "b", "()D", "Lcom/avito/android/cpx_promo_geo/generated/api/api_1_cpa_cjm_cpx_promo_geo_get_data_post/TriggerDataGeo;", "c", "()Lcom/avito/android/cpx_promo_geo/generated/api/api_1_cpa_cjm_cpx_promo_geo_get_data_post/TriggerDataGeo;", "d", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: os.A, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C44929A {

    @com.google.gson.annotations.c("hintText")
    @Y61.l
    private final String hintText;

    @com.google.gson.annotations.c("sliderPercent")
    private final double sliderPercent;

    @com.google.gson.annotations.c("triggerData")
    @Y61.l
    private final TriggerDataGeo triggerData;

    @com.google.gson.annotations.c("value")
    @Y61.k
    private final String value;

    public C44929A(@Y61.l String str, double d12, @Y61.l TriggerDataGeo triggerDataGeo, @Y61.k String str2) {
        this.hintText = str;
        this.sliderPercent = d12;
        this.triggerData = triggerDataGeo;
        this.value = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getHintText() {
        return this.hintText;
    }

    /* renamed from: b, reason: from getter */
    public final double getSliderPercent() {
        return this.sliderPercent;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final TriggerDataGeo getTriggerData() {
        return this.triggerData;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}

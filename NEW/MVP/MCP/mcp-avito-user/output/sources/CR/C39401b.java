package cr;

import androidx.compose.runtime.internal.P;
import com.avito.android.competitor_analytics.generated.api.api_1_competitor_analytics_general.OkResponseSuccessToast;
import kotlin.Metadata;

/* compiled from: Api1CompetitorAnalyticsGeneralResponse.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcr/b;", "", "Lcr/d;", "detailsInfo", "Lcr/e;", "layout", "Lcr/j;", "metrics", "", "periodTitle", "Lcom/avito/android/competitor_analytics/generated/api/api_1_competitor_analytics_general/OkResponseSuccessToast;", "toast", "<init>", "(Lcr/d;Lcr/e;Lcr/j;Ljava/lang/String;Lcom/avito/android/competitor_analytics/generated/api/api_1_competitor_analytics_general/OkResponseSuccessToast;)V", "Lcr/d;", "a", "()Lcr/d;", "Lcr/e;", "b", "()Lcr/e;", "Lcr/j;", "c", "()Lcr/j;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/avito/android/competitor_analytics/generated/api/api_1_competitor_analytics_general/OkResponseSuccessToast;", "e", "()Lcom/avito/android/competitor_analytics/generated/api/api_1_competitor_analytics_general/OkResponseSuccessToast;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cr.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C39401b {

    @com.google.gson.annotations.c("detailsInfo")
    @Y61.k
    private final d detailsInfo;

    @com.google.gson.annotations.c("layout")
    @Y61.l
    private final e layout;

    @com.google.gson.annotations.c("metrics")
    @Y61.k
    private final j metrics;

    @com.google.gson.annotations.c("periodTitle")
    @Y61.k
    private final String periodTitle;

    @com.google.gson.annotations.c("toast")
    @Y61.l
    private final OkResponseSuccessToast toast;

    public C39401b(@Y61.k d dVar, @Y61.l e eVar, @Y61.k j jVar, @Y61.k String str, @Y61.l OkResponseSuccessToast okResponseSuccessToast) {
        this.detailsInfo = dVar;
        this.layout = eVar;
        this.metrics = jVar;
        this.periodTitle = str;
        this.toast = okResponseSuccessToast;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final d getDetailsInfo() {
        return this.detailsInfo;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final e getLayout() {
        return this.layout;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final j getMetrics() {
        return this.metrics;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getPeriodTitle() {
        return this.periodTitle;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final OkResponseSuccessToast getToast() {
        return this.toast;
    }
}

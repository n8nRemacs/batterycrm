package cr;

import androidx.compose.runtime.internal.P;
import com.avito.android.competitor_analytics.generated.api.api_1_competitor_analytics_general.ApiButtonOpt;
import com.avito.android.competitor_analytics.generated.api.api_1_competitor_analytics_general.OkResponseSuccessMetricsItemsItemChart;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api1CompetitorAnalyticsGeneralResponse.kt */
@P
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcr/k;", "", "Lcom/avito/android/competitor_analytics/generated/api/api_1_competitor_analytics_general/ApiButtonOpt;", "action", "Lcom/avito/android/competitor_analytics/generated/api/api_1_competitor_analytics_general/OkResponseSuccessMetricsItemsItemChart;", "chart", "Lcr/a;", "current", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "micromarket", "", "title", "Lcr/m;", "titleHint", "<init>", "(Lcom/avito/android/competitor_analytics/generated/api/api_1_competitor_analytics_general/ApiButtonOpt;Lcom/avito/android/competitor_analytics/generated/api/api_1_competitor_analytics_general/OkResponseSuccessMetricsItemsItemChart;Lcr/a;Lcom/avito/android/remote/model/text/AttributedText;Lcr/a;Ljava/lang/String;Lcr/m;)V", "Lcom/avito/android/competitor_analytics/generated/api/api_1_competitor_analytics_general/ApiButtonOpt;", "a", "()Lcom/avito/android/competitor_analytics/generated/api/api_1_competitor_analytics_general/ApiButtonOpt;", "Lcom/avito/android/competitor_analytics/generated/api/api_1_competitor_analytics_general/OkResponseSuccessMetricsItemsItemChart;", "b", "()Lcom/avito/android/competitor_analytics/generated/api/api_1_competitor_analytics_general/OkResponseSuccessMetricsItemsItemChart;", "Lcr/a;", "c", "()Lcr/a;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "e", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcr/m;", "g", "()Lcr/m;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k {

    @com.google.gson.annotations.c("action")
    @Y61.l
    private final ApiButtonOpt action;

    @com.google.gson.annotations.c("chart")
    @Y61.l
    private final OkResponseSuccessMetricsItemsItemChart chart;

    @com.google.gson.annotations.c("current")
    @Y61.k
    private final C39400a current;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final AttributedText description;

    @com.google.gson.annotations.c("micromarket")
    @Y61.k
    private final C39400a micromarket;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("titleHint")
    @Y61.l
    private final m titleHint;

    public k(@Y61.l ApiButtonOpt apiButtonOpt, @Y61.l OkResponseSuccessMetricsItemsItemChart okResponseSuccessMetricsItemsItemChart, @Y61.k C39400a c39400a, @Y61.l AttributedText attributedText, @Y61.k C39400a c39400a2, @Y61.k String str, @Y61.l m mVar) {
        this.action = apiButtonOpt;
        this.chart = okResponseSuccessMetricsItemsItemChart;
        this.current = c39400a;
        this.description = attributedText;
        this.micromarket = c39400a2;
        this.title = str;
        this.titleHint = mVar;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final ApiButtonOpt getAction() {
        return this.action;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final OkResponseSuccessMetricsItemsItemChart getChart() {
        return this.chart;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final C39400a getCurrent() {
        return this.current;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final C39400a getMicromarket() {
        return this.micromarket;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final m getTitleHint() {
        return this.titleHint;
    }
}

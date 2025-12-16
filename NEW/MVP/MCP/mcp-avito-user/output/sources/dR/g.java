package dr;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.competitor_analytics.generated.api.api_2_competitor_analytics_general.ApiButtonOpt;
import com.avito.android.competitor_analytics.generated.api.api_2_competitor_analytics_general.OkResponseSuccessMetricsItemChart;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api2CompetitorAnalyticsGeneralResponse.kt */
@P
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Ldr/g;", "", "Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/ApiButtonOpt;", "action", "Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessMetricsItemChart;", "chart", "Ldr/a;", "current", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "micromarket", "", "title", "Ldr/i;", "titleHint", "<init>", "(Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/ApiButtonOpt;Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessMetricsItemChart;Ldr/a;Lcom/avito/android/remote/model/text/AttributedText;Ldr/a;Ljava/lang/String;Ldr/i;)V", "Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/ApiButtonOpt;", "a", "()Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/ApiButtonOpt;", "Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessMetricsItemChart;", "b", "()Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessMetricsItemChart;", "Ldr/a;", "c", "()Ldr/a;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "e", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Ldr/i;", "g", "()Ldr/i;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g {

    @com.google.gson.annotations.c("action")
    @l
    private final ApiButtonOpt action;

    @com.google.gson.annotations.c("chart")
    @l
    private final OkResponseSuccessMetricsItemChart chart;

    @com.google.gson.annotations.c("current")
    @k
    private final C39786a current;

    @com.google.gson.annotations.c("description")
    @l
    private final AttributedText description;

    @com.google.gson.annotations.c("micromarket")
    @k
    private final C39786a micromarket;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("titleHint")
    @l
    private final i titleHint;

    public g(@l ApiButtonOpt apiButtonOpt, @l OkResponseSuccessMetricsItemChart okResponseSuccessMetricsItemChart, @k C39786a c39786a, @l AttributedText attributedText, @k C39786a c39786a2, @k String str, @l i iVar) {
        this.action = apiButtonOpt;
        this.chart = okResponseSuccessMetricsItemChart;
        this.current = c39786a;
        this.description = attributedText;
        this.micromarket = c39786a2;
        this.title = str;
        this.titleHint = iVar;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final ApiButtonOpt getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final OkResponseSuccessMetricsItemChart getChart() {
        return this.chart;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final C39786a getCurrent() {
        return this.current;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final C39786a getMicromarket() {
        return this.micromarket;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final i getTitleHint() {
        return this.titleHint;
    }
}

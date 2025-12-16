package dr;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.competitor_analytics.generated.api.api_2_competitor_analytics_general.OkResponseSuccessSuggests;
import com.avito.android.competitor_analytics.generated.api.api_2_competitor_analytics_general.OkResponseSuccessToast;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2CompetitorAnalyticsGeneralResponse.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Ldr/b;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "detailsInfo", "Ldr/c;", "layout", "", "Ldr/g;", "metrics", "", "periodTitle", "Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessSuggests;", "suggests", "Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessToast;", "toast", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ldr/c;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessSuggests;Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessToast;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ldr/c;", "b", "()Ldr/c;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessSuggests;", "e", "()Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessSuggests;", "Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessToast;", "f", "()Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessToast;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dr.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C39787b {

    @com.google.gson.annotations.c("detailsInfo")
    @k
    private final AttributedText detailsInfo;

    @com.google.gson.annotations.c("layout")
    @l
    private final C39788c layout;

    @com.google.gson.annotations.c("metrics")
    @k
    private final List<g> metrics;

    @com.google.gson.annotations.c("periodTitle")
    @k
    private final String periodTitle;

    @com.google.gson.annotations.c("suggests")
    @l
    private final OkResponseSuccessSuggests suggests;

    @com.google.gson.annotations.c("toast")
    @l
    private final OkResponseSuccessToast toast;

    public C39787b(@k AttributedText attributedText, @l C39788c c39788c, @k List<g> list, @k String str, @l OkResponseSuccessSuggests okResponseSuccessSuggests, @l OkResponseSuccessToast okResponseSuccessToast) {
        this.detailsInfo = attributedText;
        this.layout = c39788c;
        this.metrics = list;
        this.periodTitle = str;
        this.suggests = okResponseSuccessSuggests;
        this.toast = okResponseSuccessToast;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final AttributedText getDetailsInfo() {
        return this.detailsInfo;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C39788c getLayout() {
        return this.layout;
    }

    @k
    public final List<g> c() {
        return this.metrics;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getPeriodTitle() {
        return this.periodTitle;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final OkResponseSuccessSuggests getSuggests() {
        return this.suggests;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final OkResponseSuccessToast getToast() {
        return this.toast;
    }
}

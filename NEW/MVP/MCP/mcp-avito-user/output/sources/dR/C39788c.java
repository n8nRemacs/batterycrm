package dr;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.competitor_analytics.generated.api.api_2_competitor_analytics_general.OkResponseSuccessLayoutPeriodsItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.my.tracker.ads.AdFormat;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2CompetitorAnalyticsGeneralResponse.kt */
@P
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b\"\u0010!R\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b#\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Ldr/c;", "", "Ldr/d;", AdFormat.BANNER, "Ldr/e;", "faqHint", "Ldr/f;", "footer", "", "Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/OkResponseSuccessLayoutPeriodsItem;", "periods", "", "recommendationSubtitle", "recommendationTitle", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", "uxFeedbackDeepLink", "<init>", "(Ldr/d;Ldr/e;Ldr/f;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ldr/d;", "a", "()Ldr/d;", "Ldr/e;", "b", "()Ldr/e;", "Ldr/f;", "c", "()Ldr/f;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "f", "g", "Lcom/avito/android/deep_linking/links/DeepLink;", "h", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dr.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C39788c {

    @com.google.gson.annotations.c(AdFormat.BANNER)
    @l
    private final d banner;

    @com.google.gson.annotations.c("faqHint")
    @k
    private final e faqHint;

    @com.google.gson.annotations.c("footer")
    @l
    private final f footer;

    @com.google.gson.annotations.c("periods")
    @k
    private final List<OkResponseSuccessLayoutPeriodsItem> periods;

    @com.google.gson.annotations.c("recommendationSubtitle")
    @k
    private final String recommendationSubtitle;

    @com.google.gson.annotations.c("recommendationTitle")
    @k
    private final String recommendationTitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("uxFeedbackDeepLink")
    @l
    private final DeepLink uxFeedbackDeepLink;

    public C39788c(@l d dVar, @k e eVar, @l f fVar, @k List<OkResponseSuccessLayoutPeriodsItem> list, @k String str, @k String str2, @k String str3, @l DeepLink deepLink) {
        this.banner = dVar;
        this.faqHint = eVar;
        this.footer = fVar;
        this.periods = list;
        this.recommendationSubtitle = str;
        this.recommendationTitle = str2;
        this.title = str3;
        this.uxFeedbackDeepLink = deepLink;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final d getBanner() {
        return this.banner;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final e getFaqHint() {
        return this.faqHint;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final f getFooter() {
        return this.footer;
    }

    @k
    public final List<OkResponseSuccessLayoutPeriodsItem> d() {
        return this.periods;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getRecommendationSubtitle() {
        return this.recommendationSubtitle;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getRecommendationTitle() {
        return this.recommendationTitle;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final DeepLink getUxFeedbackDeepLink() {
        return this.uxFeedbackDeepLink;
    }
}

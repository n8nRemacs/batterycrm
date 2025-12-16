package cr;

import androidx.compose.runtime.internal.P;
import com.avito.android.competitor_analytics.generated.api.api_1_competitor_analytics_general.OkResponseSuccessLayoutPeriodsItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.my.tracker.ads.AdFormat;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1CompetitorAnalyticsGeneralResponse.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcr/e;", "", "Lcr/f;", AdFormat.BANNER, "Lcr/g;", "footer", "", "Lcom/avito/android/competitor_analytics/generated/api/api_1_competitor_analytics_general/OkResponseSuccessLayoutPeriodsItem;", "periods", "Lcr/h;", "suggest", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", "uxFeedbackDeepLink", "<init>", "(Lcr/f;Lcr/g;Ljava/util/List;Lcr/h;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcr/f;", "a", "()Lcr/f;", "Lcr/g;", "b", "()Lcr/g;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcr/h;", "d", "()Lcr/h;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "f", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e {

    @com.google.gson.annotations.c(AdFormat.BANNER)
    @Y61.l
    private final f banner;

    @com.google.gson.annotations.c("footer")
    @Y61.l
    private final g footer;

    @com.google.gson.annotations.c("periods")
    @Y61.k
    private final List<OkResponseSuccessLayoutPeriodsItem> periods;

    @com.google.gson.annotations.c("suggest")
    @Y61.l
    private final h suggest;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("uxFeedbackDeepLink")
    @Y61.l
    private final DeepLink uxFeedbackDeepLink;

    public e(@Y61.l f fVar, @Y61.l g gVar, @Y61.k List<OkResponseSuccessLayoutPeriodsItem> list, @Y61.l h hVar, @Y61.k String str, @Y61.l DeepLink deepLink) {
        this.banner = fVar;
        this.footer = gVar;
        this.periods = list;
        this.suggest = hVar;
        this.title = str;
        this.uxFeedbackDeepLink = deepLink;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final f getBanner() {
        return this.banner;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final g getFooter() {
        return this.footer;
    }

    @Y61.k
    public final List<OkResponseSuccessLayoutPeriodsItem> c() {
        return this.periods;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final h getSuggest() {
        return this.suggest;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final DeepLink getUxFeedbackDeepLink() {
        return this.uxFeedbackDeepLink;
    }
}

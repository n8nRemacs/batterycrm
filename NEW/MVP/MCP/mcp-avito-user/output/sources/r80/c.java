package R80;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.my.tracker.ads.AdFormat;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiSearchPositionV1Response.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b$\u0010#¨\u0006%"}, d2 = {"LR80/c;", "", "LR80/b;", AdFormat.BANNER, "LR80/d;", "bottomInfo", "LR80/e;", "competitorsData", "Lcom/avito/android/deep_linking/links/DeepLink;", "eventDeepLink", "", "LR80/h;", "periods", "", "screenName", "screenPeriod", "<init>", "(LR80/b;LR80/d;LR80/e;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "LR80/b;", "a", "()LR80/b;", "LR80/d;", "b", "()LR80/d;", "LR80/e;", "c", "()LR80/e;", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/List;", "e", "()Ljava/util/List;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "g", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {

    @com.google.gson.annotations.c(AdFormat.BANNER)
    @l
    private final b banner;

    @com.google.gson.annotations.c("bottomInfo")
    @l
    private final d bottomInfo;

    @com.google.gson.annotations.c("competitorsData")
    @l
    private final e competitorsData;

    @com.google.gson.annotations.c("eventDeepLink")
    @l
    private final DeepLink eventDeepLink;

    @com.google.gson.annotations.c("periods")
    @k
    private final List<h> periods;

    @com.google.gson.annotations.c("screenName")
    @k
    private final String screenName;

    @com.google.gson.annotations.c("screenPeriod")
    @k
    private final String screenPeriod;

    public c(@l b bVar, @l d dVar, @l e eVar, @l DeepLink deepLink, @k List<h> list, @k String str, @k String str2) {
        this.banner = bVar;
        this.bottomInfo = dVar;
        this.competitorsData = eVar;
        this.eventDeepLink = deepLink;
        this.periods = list;
        this.screenName = str;
        this.screenPeriod = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final b getBanner() {
        return this.banner;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final d getBottomInfo() {
        return this.bottomInfo;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final e getCompetitorsData() {
        return this.competitorsData;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final DeepLink getEventDeepLink() {
        return this.eventDeepLink;
    }

    @k
    public final List<h> e() {
        return this.periods;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getScreenName() {
        return this.screenName;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getScreenPeriod() {
        return this.screenPeriod;
    }
}

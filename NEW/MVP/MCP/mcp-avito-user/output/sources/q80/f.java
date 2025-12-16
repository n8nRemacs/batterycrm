package Q80;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiSearchPositionPeriodV1Response.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LQ80/f;", "", "LQ80/g;", "chartParams", "Lcom/avito/android/deep_linking/links/DeepLink;", "chartScrollEventDeepLink", "", "LQ80/h;", "cols", "LQ80/j;", "scrollDepth", "<init>", "(LQ80/g;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;LQ80/j;)V", "LQ80/g;", "a", "()LQ80/g;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/List;", "c", "()Ljava/util/List;", "LQ80/j;", "d", "()LQ80/j;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f {

    @com.google.gson.annotations.c("chartParams")
    @Y61.k
    private final g chartParams;

    @com.google.gson.annotations.c("chartScrollEventDeepLink")
    @Y61.l
    private final DeepLink chartScrollEventDeepLink;

    @com.google.gson.annotations.c("cols")
    @Y61.k
    private final List<h> cols;

    @com.google.gson.annotations.c("scrollDepth")
    @Y61.l
    private final j scrollDepth;

    public f(@Y61.k g gVar, @Y61.l DeepLink deepLink, @Y61.k List<h> list, @Y61.l j jVar) {
        this.chartParams = gVar;
        this.chartScrollEventDeepLink = deepLink;
        this.cols = list;
        this.scrollDepth = jVar;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final g getChartParams() {
        return this.chartParams;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final DeepLink getChartScrollEventDeepLink() {
        return this.chartScrollEventDeepLink;
    }

    @Y61.k
    public final List<h> c() {
        return this.cols;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final j getScrollDepth() {
        return this.scrollDepth;
    }
}

package Q80;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiSearchPositionPeriodV1Response.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"LQ80/p;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "delta", "Lcom/avito/android/deep_linking/links/DeepLink;", "eventDeepLink", "", "id", "link", "position", "", "LQ80/q;", "statistics", "title", "tooltipText", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "e", "Ljava/util/List;", "f", "()Ljava/util/List;", "g", "h", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p {

    @com.google.gson.annotations.c("delta")
    @Y61.l
    private final AttributedText delta;

    @com.google.gson.annotations.c("eventDeepLink")
    @Y61.l
    private final DeepLink eventDeepLink;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("link")
    @Y61.l
    private final AttributedText link;

    @com.google.gson.annotations.c("position")
    @Y61.l
    private final AttributedText position;

    @com.google.gson.annotations.c("statistics")
    @Y61.k
    private final List<q> statistics;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("tooltipText")
    @Y61.l
    private final String tooltipText;

    public p(@Y61.l AttributedText attributedText, @Y61.l DeepLink deepLink, @Y61.k String str, @Y61.l AttributedText attributedText2, @Y61.l AttributedText attributedText3, @Y61.k List<q> list, @Y61.k String str2, @Y61.l String str3) {
        this.delta = attributedText;
        this.eventDeepLink = deepLink;
        this.id = str;
        this.link = attributedText2;
        this.position = attributedText3;
        this.statistics = list;
        this.title = str2;
        this.tooltipText = str3;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final AttributedText getDelta() {
        return this.delta;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final DeepLink getEventDeepLink() {
        return this.eventDeepLink;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final AttributedText getLink() {
        return this.link;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final AttributedText getPosition() {
        return this.position;
    }

    @Y61.k
    public final List<q> f() {
        return this.statistics;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final String getTooltipText() {
        return this.tooltipText;
    }
}

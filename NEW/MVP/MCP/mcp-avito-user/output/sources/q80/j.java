package Q80;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ApiSearchPositionPeriodV1Response.kt */
@P
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"LQ80/j;", "", "LQ80/b;", "bgColor", "LQ80/k;", "hint", "Lcom/avito/android/deep_linking/links/DeepLink;", "hintDeepLink", "", "iconName", "lineColor", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "value", "<init>", "(LQ80/b;LQ80/k;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;LQ80/b;Lcom/avito/android/remote/model/text/AttributedText;J)V", "LQ80/b;", "a", "()LQ80/b;", "LQ80/k;", "getHint", "()LQ80/k;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "J", "f", "()J", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j {

    @com.google.gson.annotations.c("bgColor")
    @Y61.k
    private final C14871b bgColor;

    @com.google.gson.annotations.c("hint")
    @Y61.k
    private final k hint;

    @com.google.gson.annotations.c("hintDeepLink")
    @Y61.k
    private final DeepLink hintDeepLink;

    @com.google.gson.annotations.c("iconName")
    @Y61.k
    private final String iconName;

    @com.google.gson.annotations.c("lineColor")
    @Y61.k
    private final C14871b lineColor;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    @com.google.gson.annotations.c("value")
    private final long value;

    public j(@Y61.k C14871b c14871b, @Y61.k k kVar, @Y61.k DeepLink deepLink, @Y61.k String str, @Y61.k C14871b c14871b2, @Y61.k AttributedText attributedText, long j12) {
        this.bgColor = c14871b;
        this.hint = kVar;
        this.hintDeepLink = deepLink;
        this.iconName = str;
        this.lineColor = c14871b2;
        this.title = attributedText;
        this.value = j12;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C14871b getBgColor() {
        return this.bgColor;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final DeepLink getHintDeepLink() {
        return this.hintDeepLink;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final C14871b getLineColor() {
        return this.lineColor;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    /* renamed from: f, reason: from getter */
    public final long getValue() {
        return this.value;
    }
}

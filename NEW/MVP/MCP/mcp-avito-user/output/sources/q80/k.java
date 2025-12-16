package Q80;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ApiSearchPositionPeriodV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"LQ80/k;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "LQ80/b;", "descriptionIconColor", "Lcom/avito/android/deep_linking/links/DeepLink;", "eventDeepLink", "title", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;LQ80/b;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "LQ80/b;", "getDescriptionIconColor", "()LQ80/b;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getEventDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getTitle", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k {

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final AttributedText description;

    @com.google.gson.annotations.c("descriptionIconColor")
    @Y61.k
    private final C14871b descriptionIconColor;

    @com.google.gson.annotations.c("eventDeepLink")
    @Y61.l
    private final DeepLink eventDeepLink;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    public k(@Y61.k AttributedText attributedText, @Y61.k C14871b c14871b, @Y61.l DeepLink deepLink, @Y61.k AttributedText attributedText2) {
        this.description = attributedText;
        this.descriptionIconColor = c14871b;
        this.eventDeepLink = deepLink;
        this.title = attributedText2;
    }
}

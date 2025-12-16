package o70;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1PromonavigatorSelectionEntrypointSnippetMyItemsGetResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lo70/b;", "", "", "availableItemsCount", "", "", "images", "Lcom/avito/android/deep_linking/links/DeepLink;", "openLink", "subtitle", "title", "<init>", "(JLjava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;)V", "J", "a", "()J", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "_avito_personal-selections_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b {

    @c("availableItemsCount")
    private final long availableItemsCount;

    @c("images")
    @k
    private final List<String> images;

    @c("openLink")
    @k
    private final DeepLink openLink;

    @c("subtitle")
    @k
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    public b(long j12, @k List<String> list, @k DeepLink deepLink, @k String str, @k String str2) {
        this.availableItemsCount = j12;
        this.images = list;
        this.openLink = deepLink;
        this.subtitle = str;
        this.title = str2;
    }

    /* renamed from: a, reason: from getter */
    public final long getAvailableItemsCount() {
        return this.availableItemsCount;
    }

    @k
    public final List<String> b() {
        return this.images;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final DeepLink getOpenLink() {
        return this.openLink;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}

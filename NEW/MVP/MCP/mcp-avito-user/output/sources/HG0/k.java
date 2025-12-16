package Hg0;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: Api11ProfileRatingsGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LHg0/k;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", "action", "", "title", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k {

    @com.google.gson.annotations.c("action")
    @Y61.l
    private final DeepLink action;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    public k(@Y61.l DeepLink deepLink, @Y61.l String str) {
        this.action = deepLink;
        this.title = str;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final DeepLink getAction() {
        return this.action;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}

package d91;

import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;

/* compiled from: GetUserVisibleMessagesResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Ld91/r;", "", "Ld91/f;", "componentData", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "rawDeeplink", ContextActionHandler.Link.URL, "<init>", "(Ld91/f;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;)V", "Ld91/f;", "getComponentData", "()Ld91/f;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class r {

    @com.google.gson.annotations.c("componentData")
    @Y61.l
    private final C39544f componentData;

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @Y61.k
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("rawDeeplink")
    @Y61.l
    private final String rawDeeplink;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @Y61.k
    private final String url;

    public r(@Y61.l C39544f c39544f, @Y61.k DeepLink deepLink, @Y61.l String str, @Y61.k String str2) {
        this.componentData = c39544f;
        this.deeplink = deepLink;
        this.rawDeeplink = str;
        this.url = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getRawDeeplink() {
        return this.rawDeeplink;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getUrl() {
        return this.url;
    }
}

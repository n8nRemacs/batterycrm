package Yl0;

import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: ProfileItemsApiV13Response.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0017"}, d2 = {"LYl0/D;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", "copyDeeplink", "", "count", Constants.DEEPLINK, "LYl0/E;", "onboarding", "title", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;LYl0/E;Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "LYl0/E;", "d", "()LYl0/E;", "e", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class D {

    @com.google.gson.annotations.c("copyDeeplink")
    @Y61.l
    private final DeepLink copyDeeplink;

    @com.google.gson.annotations.c("count")
    @Y61.k
    private final String count;

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @Y61.k
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("onboarding")
    @Y61.l
    private final E onboarding;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public D(@Y61.l DeepLink deepLink, @Y61.k String str, @Y61.k DeepLink deepLink2, @Y61.l E e12, @Y61.k String str2) {
        this.copyDeeplink = deepLink;
        this.count = str;
        this.deeplink = deepLink2;
        this.onboarding = e12;
        this.title = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final DeepLink getCopyDeeplink() {
        return this.copyDeeplink;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getCount() {
        return this.count;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final E getOnboarding() {
        return this.onboarding;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}

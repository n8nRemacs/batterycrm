package cQ0;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: GetProfileAboutV3Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LcQ0/a;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "", ContextActionHandler.Link.URL, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cQ0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27085a {

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.l
    private final DeepLink uri;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @Y61.l
    private final String url;

    public C27085a(@Y61.l DeepLink deepLink, @Y61.l String str) {
        this.uri = deepLink;
        this.url = str;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }
}

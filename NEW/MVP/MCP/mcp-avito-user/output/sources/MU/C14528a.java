package Mu;

import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;

/* compiled from: AppLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LMu/a;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_deep-linking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mu.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14528a {

    @com.google.gson.annotations.c(ContextActionHandler.Link.DEEPLINK)
    @l
    private final DeepLink deepLink;

    public C14528a(@l DeepLink deepLink) {
        this.deepLink = deepLink;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }
}

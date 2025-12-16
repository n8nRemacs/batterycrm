package eJ;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.EntryPointParameter;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;

/* compiled from: Api3HotelByItemIdSearchOffersGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LeJ/k;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "LeJ/l;", EntryPointParameter.TYPE, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;LeJ/l;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "LeJ/l;", "b", "()LeJ/l;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k {

    @com.google.gson.annotations.c(ContextActionHandler.Link.DEEPLINK)
    @Y61.l
    private final DeepLink deepLink;

    @com.google.gson.annotations.c(EntryPointParameter.TYPE)
    @Y61.k
    private final l entryPoint;

    public k(@Y61.l DeepLink deepLink, @Y61.k l lVar) {
        this.deepLink = deepLink;
        this.entryPoint = lVar;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final l getEntryPoint() {
        return this.entryPoint;
    }
}

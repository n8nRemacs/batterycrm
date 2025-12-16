package rP0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;

/* compiled from: WalletVerifyPinResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LrP0/a;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "closeScreen", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rP0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47582a {

    @com.google.gson.annotations.c("closeScreen")
    @l
    private final Boolean closeScreen;

    @com.google.gson.annotations.c("link")
    @l
    private final DeepLink deepLink;

    public C47582a(@l DeepLink deepLink, @l Boolean bool) {
        this.deepLink = deepLink;
        this.closeScreen = bool;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Boolean getCloseScreen() {
        return this.closeScreen;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }
}

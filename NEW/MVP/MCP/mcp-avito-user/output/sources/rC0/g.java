package Rc0;

import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.profile_vk_linking.generated.api.profile_vk_linking_api.ButtonWithAction;
import com.avito.android.profile_vk_linking.generated.api.profile_vk_linking_api.ButtonWithDeeplink;
import com.avito.android.profile_vk_linking.generated.api.profile_vk_linking_api.ButtonWithLink;
import kotlin.Metadata;

/* compiled from: ProfileVkLinkingApiResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LRc0/g;", "", "Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithAction;", "action", "Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithDeeplink;", Constants.DEEPLINK, "", "isMore", "Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithLink;", "link", "<init>", "(Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithAction;Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithDeeplink;Ljava/lang/Boolean;Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithLink;)V", "Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithAction;", "a", "()Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithAction;", "Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithDeeplink;", "b", "()Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithDeeplink;", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithLink;", "getLink", "()Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_linking_api/ButtonWithLink;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g {

    @com.google.gson.annotations.c("action")
    @l
    private final ButtonWithAction action;

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @l
    private final ButtonWithDeeplink deeplink;

    @com.google.gson.annotations.c("isMore")
    @l
    private final Boolean isMore;

    @com.google.gson.annotations.c("link")
    @l
    private final ButtonWithLink link;

    public g(@l ButtonWithAction buttonWithAction, @l ButtonWithDeeplink buttonWithDeeplink, @l Boolean bool, @l ButtonWithLink buttonWithLink) {
        this.action = buttonWithAction;
        this.deeplink = buttonWithDeeplink;
        this.isMore = bool;
        this.link = buttonWithLink;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final ButtonWithAction getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final ButtonWithDeeplink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Boolean getIsMore() {
        return this.isMore;
    }
}

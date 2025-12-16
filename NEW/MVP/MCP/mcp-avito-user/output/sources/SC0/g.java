package Sc0;

import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.profile_vk_linking.generated.api.profile_vk_unlink_v_2.ButtonWithAction;
import com.avito.android.profile_vk_linking.generated.api.profile_vk_unlink_v_2.ButtonWithDeeplink;
import com.avito.android.profile_vk_linking.generated.api.profile_vk_unlink_v_2.ButtonWithLink;
import kotlin.Metadata;

/* compiled from: ProfileVkUnlinkV2Response.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0007\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LSc0/g;", "", "Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_unlink_v_2/ButtonWithAction;", "action", "Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_unlink_v_2/ButtonWithDeeplink;", Constants.DEEPLINK, "", "isMore", "Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_unlink_v_2/ButtonWithLink;", "link", "<init>", "(Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_unlink_v_2/ButtonWithAction;Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_unlink_v_2/ButtonWithDeeplink;Ljava/lang/Boolean;Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_unlink_v_2/ButtonWithLink;)V", "Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_unlink_v_2/ButtonWithAction;", "getAction", "()Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_unlink_v_2/ButtonWithAction;", "Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_unlink_v_2/ButtonWithDeeplink;", "getDeeplink", "()Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_unlink_v_2/ButtonWithDeeplink;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_unlink_v_2/ButtonWithLink;", "getLink", "()Lcom/avito/android/profile_vk_linking/generated/api/profile_vk_unlink_v_2/ButtonWithLink;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
}

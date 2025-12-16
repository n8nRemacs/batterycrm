package ix0;

import Y61.k;
import com.avito.android.social_management.generated.api.vk_profile_info_v_1.VkProfileInfoWidgetValueRowStatus;
import kotlin.Metadata;

/* compiled from: VkProfileInfoV1Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lix0/e;", "", "Lix0/a;", "action", "Lcom/avito/android/social_management/generated/api/vk_profile_info_v_1/VkProfileInfoWidgetValueRowStatus;", "status", "", "title", "<init>", "(Lix0/a;Lcom/avito/android/social_management/generated/api/vk_profile_info_v_1/VkProfileInfoWidgetValueRowStatus;Ljava/lang/String;)V", "Lix0/a;", "a", "()Lix0/a;", "Lcom/avito/android/social_management/generated/api/vk_profile_info_v_1/VkProfileInfoWidgetValueRowStatus;", "b", "()Lcom/avito/android/social_management/generated/api/vk_profile_info_v_1/VkProfileInfoWidgetValueRowStatus;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ix0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42132e {

    @com.google.gson.annotations.c("action")
    @k
    private final C42128a action;

    @com.google.gson.annotations.c("status")
    @k
    private final VkProfileInfoWidgetValueRowStatus status;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C42132e(@k C42128a c42128a, @k VkProfileInfoWidgetValueRowStatus vkProfileInfoWidgetValueRowStatus, @k String str) {
        this.action = c42128a;
        this.status = vkProfileInfoWidgetValueRowStatus;
        this.title = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C42128a getAction() {
        return this.action;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final VkProfileInfoWidgetValueRowStatus getStatus() {
        return this.status;
    }
}

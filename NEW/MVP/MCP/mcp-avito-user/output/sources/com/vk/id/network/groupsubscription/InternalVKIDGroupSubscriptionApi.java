package com.vk.id.network.groupsubscription;

import Y61.k;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.vk.id.common.InternalVKIDApi;
import com.vk.id.network.util.CreateRequestKt;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;

/* compiled from: InternalVKIDGroupSubscriptionApi.kt */
@s0
@InternalVKIDApi
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ\u001e\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApi;", "", "client", "Lokhttp3/OkHttpClient;", "<init>", "(Lokhttp3/OkHttpClient;)V", "getShouldShowSubscription", "Lokhttp3/Call;", "accessToken", "", "getProfileShortInfo", "getGroup", "groupId", "getMembers", "justFriends", "", "subscribeToGroup", "bodyBuilder", "Lokhttp3/FormBody$Builder;", "Companion", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalVKIDGroupSubscriptionApi {

    @k
    private static final Companion Companion = new Companion(null);

    @k
    private final OkHttpClient client;

    /* compiled from: InternalVKIDGroupSubscriptionApi.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApi$Companion;", "", "<init>", "()V", "HOST_VK_API", "", "HOST_VK_ID", "PATH_ACCOUNT_PROFILE_SHORT_INFO", "PATH_GROUPS_GET_BY_ID", "PATH_GROUPS_GET_MEMBERS", "PATH_GROUPS_JOIN", "PATH_SHOULD_SHOW_SUBSCRIPTION", "FIELD_ACCESS_TOKEN", "FIELD_GROUP_ID", "FIELD_SOURCE", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        private Companion() {
        }
    }

    public InternalVKIDGroupSubscriptionApi(@k OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    private final FormBody.Builder bodyBuilder(String accessToken) {
        return new FormBody.Builder(null, 1, null).add("v", "5.220").add("access_token", accessToken);
    }

    @k
    public final Call getGroup(@k String accessToken, @k String groupId) {
        return CreateRequestKt.createRequest$default(this.client, "https://api.vk.ru", "method/groups.getById", bodyBuilder(accessToken).add("group_ids", groupId).add(LocalPublishState.FIELDS, "description,verified,is_member").build(), null, 8, null);
    }

    @k
    public final Call getMembers(@k String accessToken, @k String groupId, boolean justFriends) {
        OkHttpClient okHttpClient = this.client;
        FormBody.Builder builderAdd = bodyBuilder(accessToken).add("group_id", groupId).add(SearchParamsConverterKt.SORT, "id_asc").add("count", "3").add(LocalPublishState.FIELDS, "photo_200");
        if (justFriends) {
            builderAdd.add("filter", "friends");
        }
        G0 g02 = G0.f406611a;
        return CreateRequestKt.createRequest$default(okHttpClient, "https://api.vk.ru", "method/groups.getMembers", builderAdd.build(), null, 8, null);
    }

    @k
    public final Call getProfileShortInfo(@k String accessToken) {
        return CreateRequestKt.createRequest$default(this.client, "https://api.vk.ru", "method/account.getProfileShortInfo", bodyBuilder(accessToken).build(), null, 8, null);
    }

    @k
    public final Call getShouldShowSubscription(@k String accessToken) {
        return CreateRequestKt.createRequest$default(this.client, "https://id.vk.ru", "vkid_sdk_is_show_subscription", bodyBuilder(accessToken).build(), null, 8, null);
    }

    @k
    public final Call subscribeToGroup(@k String accessToken, @k String groupId) {
        return CreateRequestKt.createRequest$default(this.client, "https://api.vk.ru", "method/groups.join", bodyBuilder(accessToken).add("group_id", groupId).add(SearchParamsConverterKt.SOURCE, "vkid_sdk").build(), null, 8, null);
    }
}

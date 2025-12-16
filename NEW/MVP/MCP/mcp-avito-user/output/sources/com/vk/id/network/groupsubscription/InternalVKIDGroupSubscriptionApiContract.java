package com.vk.id.network.groupsubscription;

import Y61.k;
import Y61.l;
import com.vk.id.common.InternalVKIDApi;
import com.vk.id.network.groupsubscription.data.InternalVKIDGroupByIdData;
import com.vk.id.network.groupsubscription.data.InternalVKIDGroupMembersData;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: InternalVKIDGroupSubscriptionApiContract.kt */
@InternalVKIDApi
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\u0006J \u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H¦@¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApiContract;", "", "", "accessToken", "", "shouldShowSubscription", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isServiceAccount", "groupId", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupByIdData;", "getGroup", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "justFriends", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupMembersData;", "getMembers", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/G0;", "subscribeToGroup", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface InternalVKIDGroupSubscriptionApiContract {
    @l
    Object getGroup(@k String str, @k String str2, @k Continuation<? super InternalVKIDGroupByIdData> continuation);

    @l
    Object getMembers(@k String str, @k String str2, boolean z12, @k Continuation<? super InternalVKIDGroupMembersData> continuation);

    @l
    Object isServiceAccount(@k String str, @k Continuation<? super Boolean> continuation);

    @l
    Object shouldShowSubscription(@k String str, @k Continuation<? super Boolean> continuation);

    @l
    Object subscribeToGroup(@k String str, @k String str2, @k Continuation<? super G0> continuation);
}

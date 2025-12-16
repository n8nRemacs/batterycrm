package com.vk.id.test;

import com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract;
import com.vk.id.network.groupsubscription.data.InternalVKIDGroupByIdData;
import com.vk.id.network.groupsubscription.data.InternalVKIDGroupMembersData;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;

/* compiled from: InternalVKIDTestBuilder.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\u0006J \u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"com/vk/id/test/InternalVKIDTestBuilder$mockGroupSubscriptionApi$1", "Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApiContract;", "", "accessToken", "", "shouldShowSubscription", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isServiceAccount", "groupId", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupByIdData;", "getGroup", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "justFriends", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupMembersData;", "getMembers", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/G0;", "subscribeToGroup", "Ljava/util/concurrent/atomic/AtomicInteger;", "getMembersResponseIndex", "Ljava/util/concurrent/atomic/AtomicInteger;", "subscribeToGroupResponseIndex", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalVKIDTestBuilder$mockGroupSubscriptionApi$1 implements InternalVKIDGroupSubscriptionApiContract {
    private final AtomicInteger getMembersResponseIndex;
    private final AtomicInteger subscribeToGroupResponseIndex;
    final /* synthetic */ InternalVKIDTestBuilder this$0;

    @Override // com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract
    public Object getGroup(String str, String str2, Continuation<? super InternalVKIDGroupByIdData> continuation) {
        Object obj = this.this$0.getGroupResponse;
        C42729a0.b(obj);
        return obj;
    }

    @Override // com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract
    public Object getMembers(String str, String str2, boolean z12, Continuation<? super InternalVKIDGroupMembersData> continuation) {
        Object obj = ((Z) this.this$0.getMembersResponses.get(this.getMembersResponseIndex.getAndIncrement())).f406625b;
        C42729a0.b(obj);
        return obj;
    }

    @Override // com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract
    public Object isServiceAccount(String str, Continuation<? super Boolean> continuation) {
        Object obj = this.this$0.isServiceAccountResponse;
        C42729a0.b(obj);
        return obj;
    }

    @Override // com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract
    public Object shouldShowSubscription(String str, Continuation<? super Boolean> continuation) {
        Object obj = this.this$0.shouldShowSubscriptionResponse;
        C42729a0.b(obj);
        return obj;
    }

    @Override // com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract
    public Object subscribeToGroup(String str, String str2, Continuation<? super G0> continuation) {
        C42729a0.b(((Z) this.this$0.subscribeToGroupResponses.get(this.subscribeToGroupResponseIndex.getAndIncrement())).f406625b);
        return G0.f406611a;
    }
}

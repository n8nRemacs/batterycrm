package com.vk.id.group.subscription.compose.interactor;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GroupSubscriptionInteractor.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor", f = "GroupSubscriptionInteractor.kt", i = {0, 1, 2}, l = {50, 51, 52, 52}, m = "loadGroup$group_subscription_compose_release", n = {"this", "this", "this"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes7.dex */
public final class GroupSubscriptionInteractor$loadGroup$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GroupSubscriptionInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupSubscriptionInteractor$loadGroup$1(GroupSubscriptionInteractor groupSubscriptionInteractor, Continuation<? super GroupSubscriptionInteractor$loadGroup$1> continuation) {
        super(continuation);
        this.this$0 = groupSubscriptionInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.this$0.loadGroup$group_subscription_compose_release(this);
    }
}

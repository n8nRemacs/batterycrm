package com.vk.id.group.subscription.compose.ui;

import com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GroupSubscriptionSheet.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2$1$1$1", f = "GroupSubscriptionSheet.kt", i = {}, l = {293}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2$1$1$1 extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {
    final /* synthetic */ GroupSubscriptionInteractor $interactor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2$1$1$1(GroupSubscriptionInteractor groupSubscriptionInteractor, Continuation<? super GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2$1$1$1> continuation) {
        super(1, continuation);
        this.$interactor = groupSubscriptionInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Continuation<?> continuation) {
        return new GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2$1$1$1(this.$interactor, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        if (i12 == 0) {
            C42729a0.b(obj);
            GroupSubscriptionInteractor groupSubscriptionInteractor = this.$interactor;
            this.label = 1;
            if (groupSubscriptionInteractor.saveDisplay$group_subscription_compose_release(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super G0> continuation) {
        return ((GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2$1$1$1) create(continuation)).invokeSuspend(G0.f406611a);
    }
}

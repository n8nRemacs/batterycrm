package com.vk.id.group.subscription.compose.interactor;

import Y41.l;
import Y41.p;
import com.vk.id.AccessToken;
import com.vk.id.VKID;
import java.util.Date;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.b1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.scheduling.b;

/* compiled from: GroupSubscriptionInteractor.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$saveDisplay$3", f = "GroupSubscriptionInteractor.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class GroupSubscriptionInteractor$saveDisplay$3 extends SuspendLambda implements l<Continuation<? super G0>, Object> {
    int label;
    final /* synthetic */ GroupSubscriptionInteractor this$0;

    /* compiled from: GroupSubscriptionInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$saveDisplay$3$1", f = "GroupSubscriptionInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$saveDisplay$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        int label;
        final /* synthetic */ GroupSubscriptionInteractor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GroupSubscriptionInteractor groupSubscriptionInteractor, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = groupSubscriptionInteractor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
            if (accessToken == null) {
                return G0.f406611a;
            }
            long userID = accessToken.getUserID();
            this.this$0.storage.saveDisplays(userID, b1.i(this.this$0.storage.getDisplays(userID), new Date()));
            return G0.f406611a;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((AnonymousClass1) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupSubscriptionInteractor$saveDisplay$3(GroupSubscriptionInteractor groupSubscriptionInteractor, Continuation<? super GroupSubscriptionInteractor$saveDisplay$3> continuation) {
        super(1, continuation);
        this.this$0 = groupSubscriptionInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Continuation<?> continuation) {
        return new GroupSubscriptionInteractor$saveDisplay$3(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        if (i12 == 0) {
            C42729a0.b(obj);
            b bVar = C43262l0.f411947c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (C43259k.g(bVar, anonymousClass1, this) == coroutine_suspended) {
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
        return ((GroupSubscriptionInteractor$saveDisplay$3) create(continuation)).invokeSuspend(G0.f406611a);
    }
}

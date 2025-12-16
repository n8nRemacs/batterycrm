package com.vk.id.internal.user;

import Y41.p;
import com.vk.id.internal.ipc.SilentAuthInfoProvider;
import com.vk.silentauth.SilentAuthInfo;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: UserDataFetcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/vk/silentauth/SilentAuthInfo;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/vk/silentauth/SilentAuthInfo;"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.vk.id.internal.user.UserDataFetcher$fetchUserData$2$info$1", f = "UserDataFetcher.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class UserDataFetcher$fetchUserData$2$info$1 extends SuspendLambda implements p<T, Continuation<? super SilentAuthInfo>, Object> {
    int label;
    final /* synthetic */ UserDataFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserDataFetcher$fetchUserData$2$info$1(UserDataFetcher userDataFetcher, Continuation<? super UserDataFetcher$fetchUserData$2$info$1> continuation) {
        super(2, continuation);
        this.this$0 = userDataFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new UserDataFetcher$fetchUserData$2$info$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.this$0.vkSilentAuthInfoProvider.setAppId(Integer.parseInt(this.this$0.serviceCredentials.getClientID()));
            SilentAuthInfoProvider silentAuthInfoProvider = this.this$0.vkSilentAuthInfoProvider;
            this.label = 1;
            obj = SilentAuthInfoProvider.DefaultImpls.getSilentAuthInfos$default(silentAuthInfoProvider, 0L, this, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return C42745f0.G((List) obj);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super SilentAuthInfo> continuation) {
        return ((UserDataFetcher$fetchUserData$2$info$1) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }
}

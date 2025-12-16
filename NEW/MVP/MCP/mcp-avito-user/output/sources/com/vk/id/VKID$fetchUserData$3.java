package com.vk.id;

import Y41.l;
import com.vk.id.internal.user.UserDataFetcher;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VKID.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Z;", "Lcom/vk/id/VKIDUser;", "<anonymous>", "()Lkotlin/Z;"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.vk.id.VKID$fetchUserData$3", f = "VKID.kt", i = {}, l = {686}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class VKID$fetchUserData$3 extends SuspendLambda implements l<Continuation<? super Z<? extends VKIDUser>>, Object> {
    int label;
    final /* synthetic */ VKID this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VKID$fetchUserData$3(VKID vkid, Continuation<? super VKID$fetchUserData$3> continuation) {
        super(1, continuation);
        this.this$0 = vkid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Continuation<?> continuation) {
        return new VKID$fetchUserData$3(this.this$0, continuation);
    }

    @Override // Y41.l
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Z<? extends VKIDUser>> continuation) {
        return invoke2((Continuation<? super Z<VKIDUser>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        if (i12 == 0) {
            C42729a0.b(obj);
            int i13 = Z.f406624c;
            UserDataFetcher userDataFetcher = (UserDataFetcher) this.this$0.userDataFetcher.getValue();
            this.label = 1;
            obj = userDataFetcher.fetchUserData(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return Z.a(obj);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super Z<VKIDUser>> continuation) {
        return ((VKID$fetchUserData$3) create(continuation)).invokeSuspend(G0.f406611a);
    }
}

package com.vk.id;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VKID.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lkotlin/Z;", "Lcom/vk/id/VKIDUser;", "<anonymous>", "(Ljava/lang/Throwable;)Lkotlin/Z;"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.vk.id.VKID$fetchUserData$2", f = "VKID.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class VKID$fetchUserData$2 extends SuspendLambda implements p<Throwable, Continuation<? super Z<? extends VKIDUser>>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public VKID$fetchUserData$2(Continuation<? super VKID$fetchUserData$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        VKID$fetchUserData$2 vKID$fetchUserData$2 = new VKID$fetchUserData$2(continuation);
        vKID$fetchUserData$2.L$0 = obj;
        return vKID$fetchUserData$2;
    }

    @Override // Y41.p
    public /* bridge */ /* synthetic */ Object invoke(Throwable th2, Continuation<? super Z<? extends VKIDUser>> continuation) {
        return invoke2(th2, (Continuation<? super Z<VKIDUser>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        return Z.a(new Z.b((Throwable) this.L$0));
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Throwable th2, Continuation<? super Z<VKIDUser>> continuation) {
        return ((VKID$fetchUserData$2) create(th2, continuation)).invokeSuspend(G0.f406611a);
    }
}

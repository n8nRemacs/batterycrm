package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import arrow.core.Y0;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MessageListActorSubscriptions.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Larrow/core/Y0;", "", "hasMorePagesOption", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Larrow/core/Y0;)Z"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$subscribeToMessageUpdates$4", f = "MessageListActorSubscriptions.kt", i = {0}, l = {547}, m = "invokeSuspend", n = {"hasMorePagesOption"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class p0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super Y0<? extends Boolean>>, Y0<? extends Boolean>, Continuation<? super Boolean>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f190060q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f190061r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Y0 f190062s;

    public p0() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super Y0<? extends Boolean>> interfaceC43172j, Y0<? extends Boolean> y02, Continuation<? super Boolean> continuation) {
        p0 p0Var = new p0(3, continuation);
        p0Var.f190061r = interfaceC43172j;
        p0Var.f190062s = y02;
        return p0Var.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Y0 y02;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f190060q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f190061r;
            Y0 y03 = this.f190062s;
            this.f190061r = y03;
            this.f190060q = 1;
            if (interfaceC43172j.emit(y03, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            y02 = y03;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y02 = (Y0) this.f190061r;
            C42729a0.b(obj);
        }
        return Boxing.boxBoolean(!y02.b());
    }
}

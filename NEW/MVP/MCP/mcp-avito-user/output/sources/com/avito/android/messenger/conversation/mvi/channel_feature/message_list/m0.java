package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import java.util.List;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$subscribeToMessageUpdates$$inlined$flatMapLatest$1", f = "MessageListActorSubscriptions.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
public final class m0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super List<? extends kotlin.Q<? extends LocalMessage, ? extends Q1>>>, io.reactivex.rxjava3.core.z<List<? extends kotlin.Q<? extends LocalMessage, ? extends Q1>>>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f190033q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f190034r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f190035s;

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super List<? extends kotlin.Q<? extends LocalMessage, ? extends Q1>>> interfaceC43172j, io.reactivex.rxjava3.core.z<List<? extends kotlin.Q<? extends LocalMessage, ? extends Q1>>> zVar, Continuation<? super kotlin.G0> continuation) {
        m0 m0Var = new m0(3, continuation);
        m0Var.f190034r = interfaceC43172j;
        m0Var.f190035s = zVar;
        return m0Var.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f190033q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f190034r;
            InterfaceC43160i interfaceC43160iA = kotlinx.coroutines.rx3.y.a((io.reactivex.rxjava3.core.z) this.f190035s);
            this.f190033q = 1;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}

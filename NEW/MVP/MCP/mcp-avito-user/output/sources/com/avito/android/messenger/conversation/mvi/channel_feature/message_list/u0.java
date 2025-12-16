package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.mvi.b;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MessageListActorSubscriptions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", VoiceInfo.STATE, "", "<anonymous>", "(Lcom/avito/android/messenger/conversation/mvi/context/a$a;)Z"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$subscribeToOpenKeyboardUpdates$1", f = "MessageListActorSubscriptions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class u0 extends SuspendLambda implements Y41.p<InterfaceC31987a.C5631a, Continuation<? super Boolean>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f190100q;

    public u0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        u0 u0Var = new u0(2, continuation);
        u0Var.f190100q = obj;
        return u0Var;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC31987a.C5631a c5631a, Continuation<? super Boolean> continuation) {
        return ((u0) create(c5631a, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return Boxing.boxBoolean(!(((InterfaceC31987a.C5631a) this.f190100q).f190237b instanceof b.d));
    }
}

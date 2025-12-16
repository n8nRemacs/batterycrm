package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.mvi.b;
import com.avito.android.remote.model.messenger.Channel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;

/* compiled from: MessageListActorSubscriptions.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "contextState", "", "<anonymous>", "(Lcom/avito/android/messenger/conversation/mvi/context/a$a;)Z"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$subscribeToChannelContextInteractorStateUpdates$channelLoadingFlow$1", f = "MessageListActorSubscriptions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class W extends SuspendLambda implements Y41.p<InterfaceC31987a.C5631a, Continuation<? super Boolean>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f189902q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ G0 f189903r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(G0 g02, Continuation<? super W> continuation) {
        super(2, continuation);
        this.f189903r = g02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        W w12 = new W(this.f189903r, continuation);
        w12.f189902q = obj;
        return w12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC31987a.C5631a c5631a, Continuation<? super Boolean> continuation) {
        return ((W) create(c5631a, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC31987a.C5631a c5631a = (InterfaceC31987a.C5631a) this.f189902q;
        com.avito.android.mvi.b<Channel> bVar = c5631a.f190237b;
        return Boxing.boxBoolean((bVar instanceof b.a) || ((bVar instanceof b.c) && C43066x.K(c5631a.f190236a.f430682d)));
    }
}

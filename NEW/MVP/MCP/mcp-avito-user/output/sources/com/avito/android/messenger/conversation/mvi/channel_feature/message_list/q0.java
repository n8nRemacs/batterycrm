package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import arrow.core.Y0;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import java.util.List;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MessageListActorSubscriptions.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\t\u001a,\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u00040\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00012\u001e\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u00040\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u008a@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Lkotlin/Q;", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "Lcom/avito/android/persistence/messenger/Q1;", "Lcom/avito/android/messenger/conversation/mvi/data/MessageAndMetaInfo;", "messagesAndMetaInfo", "Larrow/core/Y0;", "", "hasMore", "<anonymous>", "(Ljava/util/List;Larrow/core/Y0;)Lkotlin/Q;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$subscribeToMessageUpdates$5", f = "MessageListActorSubscriptions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class q0 extends SuspendLambda implements Y41.q<List<? extends kotlin.Q<? extends LocalMessage, ? extends Q1>>, Y0<? extends Boolean>, Continuation<? super kotlin.Q<? extends List<? extends kotlin.Q<? extends LocalMessage, ? extends Q1>>, ? extends Y0<? extends Boolean>>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ List f190067q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Y0 f190068r;

    public q0() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(List<? extends kotlin.Q<? extends LocalMessage, ? extends Q1>> list, Y0<? extends Boolean> y02, Continuation<? super kotlin.Q<? extends List<? extends kotlin.Q<? extends LocalMessage, ? extends Q1>>, ? extends Y0<? extends Boolean>>> continuation) {
        q0 q0Var = new q0(3, continuation);
        q0Var.f190067q = list;
        q0Var.f190068r = y02;
        return q0Var.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return new kotlin.Q(this.f190067q, this.f190068r);
    }
}

package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import arrow.core.Y0;
import com.avito.android.messenger.conversation.mvi.sync.Q0;
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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\f\u001a\u00020\u000b24\u0010\b\u001a0\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000j\u0002`\u00040\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0000j\u0002`\u00072\u0006\u0010\n\u001a\u00020\tH\u008a@¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "Lcom/avito/android/persistence/messenger/Q1;", "Lcom/avito/android/messenger/conversation/mvi/data/MessageAndMetaInfo;", "Larrow/core/Y0;", "", "Lcom/avito/android/messenger/conversation/mvi/channel_feature/entity/message_list/PaginationData;", "<name for destructuring parameter 0>", "Lcom/avito/android/messenger/conversation/mvi/sync/Q0$b;", "videoInfoState", "LNY/l;", "<anonymous>", "(Lkotlin/Q;Lcom/avito/android/messenger/conversation/mvi/sync/Q0$b;)LNY/l;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$combineWithVideoInfo$1", f = "MessageListActorSubscriptions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class P extends SuspendLambda implements Y41.q<kotlin.Q<? extends List<? extends kotlin.Q<? extends LocalMessage, ? extends Q1>>, ? extends Y0<? extends Boolean>>, Q0.b, Continuation<? super NY.l>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ kotlin.Q f189875q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Q0.b f189876r;

    public P() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(kotlin.Q<? extends List<? extends kotlin.Q<? extends LocalMessage, ? extends Q1>>, ? extends Y0<? extends Boolean>> q12, Q0.b bVar, Continuation<? super NY.l> continuation) {
        P p12 = new P(3, continuation);
        p12.f189875q = q12;
        p12.f189876r = bVar;
        return p12.invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        kotlin.Q q12 = this.f189875q;
        return new NY.l((List) q12.f406619b, (Y0) q12.f406620c, this.f189876r.f194684a);
    }
}

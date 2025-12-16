package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.sync.Q0;
import com.avito.android.remote.model.messenger.video.VideoInfo;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MessageListActorSubscriptions.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "contextState", "Lcom/avito/android/messenger/conversation/mvi/sync/Q0$b;", "videoInfoState", "Lkotlin/Q;", "", "", "Lcom/avito/android/remote/model/messenger/video/VideoInfo;", "<anonymous>", "(Lcom/avito/android/messenger/conversation/mvi/context/a$a;Lcom/avito/android/messenger/conversation/mvi/sync/Q0$b;)Lkotlin/Q;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$withLatestVideoInfo$1", f = "MessageListActorSubscriptions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class F0 extends SuspendLambda implements Y41.q<InterfaceC31987a.C5631a, Q0.b, Continuation<? super kotlin.Q<? extends InterfaceC31987a.C5631a, ? extends Map<String, ? extends VideoInfo>>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ InterfaceC31987a.C5631a f189771q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Q0.b f189772r;

    public F0() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC31987a.C5631a c5631a, Q0.b bVar, Continuation<? super kotlin.Q<? extends InterfaceC31987a.C5631a, ? extends Map<String, ? extends VideoInfo>>> continuation) {
        F0 f02 = new F0(3, continuation);
        f02.f189771q = c5631a;
        f02.f189772r = bVar;
        return f02.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return new kotlin.Q(this.f189771q, this.f189772r.f194684a);
    }
}

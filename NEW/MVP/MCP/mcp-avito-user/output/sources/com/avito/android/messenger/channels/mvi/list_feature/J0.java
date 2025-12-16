package com.avito.android.messenger.channels.mvi.list_feature;

import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.messenger.SessionExpiredException;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsListActorSubscriptions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "LHY/m;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActorSubscriptions$subscribeToLogouts$2", f = "ChannelsListActorSubscriptions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class J0 extends SuspendLambda implements Y41.p<kotlin.Q<? extends HY.m, ? extends HY.m>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f187754q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ W f187755r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(W w12, Continuation<? super J0> continuation) {
        super(2, continuation);
        this.f187755r = w12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        J0 j02 = new J0(this.f187755r, continuation);
        j02.f187754q = obj;
        return j02;
    }

    @Override // Y41.p
    public final Object invoke(kotlin.Q<? extends HY.m, ? extends HY.m> q12, Continuation<? super kotlin.G0> continuation) {
        return ((J0) create(q12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        MessengerUserHashInfo messengerUserHashInfo = ((HY.m) ((kotlin.Q) this.f187754q).f406620c).f7250a;
        if (messengerUserHashInfo != null && !C43066x.K(messengerUserHashInfo.f430682d)) {
            this.f187755r.f187870g.c(new NonFatalErrorEvent("Messenger: Session expired, refresh required", new SessionExpiredException(), null, null, 12, null));
        }
        return kotlin.G0.f406611a;
    }
}

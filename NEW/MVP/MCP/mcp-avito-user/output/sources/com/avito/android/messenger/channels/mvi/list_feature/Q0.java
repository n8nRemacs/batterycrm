package com.avito.android.messenger.channels.mvi.list_feature;

import com.avito.android.util.X2;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ChannelsListActorSubscriptions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHY/j;", "newPrivateBannerState", "Lkotlin/G0;", "<anonymous>", "(LHY/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActorSubscriptions$subscribeToPrivateBannerStateUpdates$1", f = "ChannelsListActorSubscriptions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class Q0 extends SuspendLambda implements Y41.p<HY.j, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f187825q;

    public Q0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        Q0 q02 = new Q0(2, continuation);
        q02.f187825q = obj;
        return q02;
    }

    @Override // Y41.p
    public final Object invoke(HY.j jVar, Continuation<? super kotlin.G0> continuation) {
        return ((Q0) create(jVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        HY.j jVar = (HY.j) this.f187825q;
        X2.f318778a.i("Mvi-ChannelsList", "privateBannerState > " + jVar, null);
        return kotlin.G0.f406611a;
    }
}

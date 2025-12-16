package com.avito.android.messenger.channels.mvi.list_feature;

import com.avito.android.messenger.channels.mvi.list_feature.W;
import java.util.List;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ChannelsListActorSubscriptions.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/list_feature/W$a;", "oldInfo", "newInfo", "<anonymous>", "(Lcom/avito/android/messenger/channels/mvi/list_feature/W$a;Lcom/avito/android/messenger/channels/mvi/list_feature/W$a;)Lcom/avito/android/messenger/channels/mvi/list_feature/W$a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActorSubscriptions$subscribeToChannelTags$channelListChanges$2", f = "ChannelsListActorSubscriptions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.channels.mvi.list_feature.s0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31808s0 extends SuspendLambda implements Y41.q<W.a, W.a, Continuation<? super W.a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f188200q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f188201r;

    public C31808s0() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(W.a aVar, W.a aVar2, Continuation<? super W.a> continuation) {
        C31808s0 c31808s0 = new C31808s0(3, continuation);
        c31808s0.f188200q = aVar;
        c31808s0.f188201r = aVar2;
        return c31808s0.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        W.a aVar = (W.a) this.f188200q;
        W.a aVar2 = (W.a) this.f188201r;
        if (!kotlin.jvm.internal.L.f(aVar.f187879a, aVar2.f187879a) || aVar.f187880b != aVar2.f187880b) {
            List<String> list = aVar2.f187882d;
            return new W.a(aVar2.f187879a, false, list, list, 2, null);
        }
        List<String> list2 = aVar.f187881c;
        List<String> list3 = aVar2.f187882d;
        return new W.a(aVar2.f187879a, false, C42745f0.v(C42745f0.h0(list3, list2)), C42745f0.d0(list3, C42745f0.P0(list2)), 2, null);
    }
}

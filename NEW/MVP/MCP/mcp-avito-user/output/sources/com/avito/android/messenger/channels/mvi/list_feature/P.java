package com.avito.android.messenger.channels.mvi.list_feature;

import HY.g;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsListActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Lkotlin/G0;", "<anonymous>", "(Lru/avito/messenger/MessengerUserHashInfo;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$7$1", f = "ChannelsListActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class P extends SuspendLambda implements Y41.p<MessengerUserHashInfo, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f187810q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g.b f187811r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.l<HY.m> f187812s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(g.b bVar, com.avito.android.arch.mvi.utils.l<HY.m> lVar, Continuation<? super P> continuation) {
        super(2, continuation);
        this.f187811r = bVar;
        this.f187812s = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        P p12 = new P(this.f187811r, this.f187812s, continuation);
        p12.f187810q = obj;
        return p12;
    }

    @Override // Y41.p
    public final Object invoke(MessengerUserHashInfo messengerUserHashInfo, Continuation<? super kotlin.G0> continuation) {
        return ((P) create(messengerUserHashInfo, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) this.f187810q;
        g.b.d dVar = (g.b.d) this.f187811r;
        if (!kotlin.jvm.internal.L.f(dVar.f7204b, messengerUserHashInfo.f430682d)) {
            com.avito.android.arch.mvi.utils.l<HY.m> lVar = this.f187812s;
            if (lVar.getValue().f7260k.contains(dVar.f7203a)) {
                lVar.setValue(HY.m.a(lVar.getValue(), null, null, null, null, null, null, false, null, null, null, kotlin.collections.b1.e(lVar.getValue().f7260k, dVar.f7203a), 3071));
            }
        }
        return kotlin.G0.f406611a;
    }
}

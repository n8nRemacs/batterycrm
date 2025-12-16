package com.avito.android.messenger.channels.mvi.list_feature;

import HY.g;
import com.avito.android.remote.model.messenger.Channel;
import java.util.List;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsListActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Lkotlin/G0;", "<anonymous>", "(Lru/avito/messenger/MessengerUserHashInfo;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$6$1", f = "ChannelsListActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class O extends SuspendLambda implements Y41.p<MessengerUserHashInfo, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f187801q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g.b f187802r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C31772a f187803s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.l<HY.m> f187804t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(g.b bVar, com.avito.android.arch.mvi.utils.l lVar, C31772a c31772a, Continuation continuation) {
        super(2, continuation);
        this.f187802r = bVar;
        this.f187803s = c31772a;
        this.f187804t = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31772a c31772a = this.f187803s;
        O o12 = new O(this.f187802r, this.f187804t, c31772a, continuation);
        o12.f187801q = obj;
        return o12;
    }

    @Override // Y41.p
    public final Object invoke(MessengerUserHashInfo messengerUserHashInfo, Continuation<? super kotlin.G0> continuation) {
        return ((O) create(messengerUserHashInfo, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) this.f187801q;
        g.b.c cVar = (g.b.c) this.f187802r;
        if (!kotlin.jvm.internal.L.f(cVar.f7202b, messengerUserHashInfo.f430682d)) {
            com.avito.android.arch.mvi.utils.l<HY.m> lVar = this.f187804t;
            List<kotlin.Q<Channel, com.avito.android.persistence.messenger.P0>> list = lVar.getValue().f7254e;
            String str = cVar.f7201a;
            C31772a c31772a = this.f187803s;
            if (C31772a.c(c31772a, list, str) || C31772a.c(c31772a, lVar.getValue().f7257h, cVar.f7201a)) {
                lVar.setValue(HY.m.a(lVar.getValue(), null, null, null, null, null, null, false, null, null, null, kotlin.collections.b1.i(lVar.getValue().f7260k, cVar.f7201a), 3071));
            }
        }
        return kotlin.G0.f406611a;
    }
}

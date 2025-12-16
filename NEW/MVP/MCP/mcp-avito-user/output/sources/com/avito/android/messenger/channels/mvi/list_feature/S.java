package com.avito.android.messenger.channels.mvi.list_feature;

import HY.m;
import com.avito.android.messenger.channels.analytics.UseCaseScenario;
import com.avito.android.messenger.channels.mvi.list_feature.C31772a;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsListActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Lkotlin/G0;", "<anonymous>", "(Lru/avito/messenger/MessengerUserHashInfo;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$refresh$2", f = "ChannelsListActor.kt", i = {}, l = {894}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class S extends SuspendLambda implements Y41.p<MessengerUserHashInfo, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f187831q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f187832r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C31772a f187833s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ UseCaseScenario f187834t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.l<HY.m> f187835u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(C31772a c31772a, UseCaseScenario useCaseScenario, com.avito.android.arch.mvi.utils.l<HY.m> lVar, Continuation<? super S> continuation) {
        super(2, continuation);
        this.f187833s = c31772a;
        this.f187834t = useCaseScenario;
        this.f187835u = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        S s5 = new S(this.f187833s, this.f187834t, this.f187835u, continuation);
        s5.f187832r = obj;
        return s5;
    }

    @Override // Y41.p
    public final Object invoke(MessengerUserHashInfo messengerUserHashInfo, Continuation<? super kotlin.G0> continuation) {
        return ((S) create(messengerUserHashInfo, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f187831q;
        if (i12 == 0) {
            C42729a0.b(obj);
            MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) this.f187832r;
            C31772a c31772a = this.f187833s;
            long andIncrement = c31772a.f187946z.getAndIncrement();
            UseCaseScenario useCaseScenario = this.f187834t;
            String str = useCaseScenario.f187092b;
            c31772a.f187928h.a();
            c31772a.f187929i.b(str);
            com.avito.android.arch.mvi.utils.l<HY.m> lVar = this.f187835u;
            int size = lVar.getValue().f7257h.size() + lVar.getValue().f7254e.size();
            com.avito.android.messenger.channels.analytics.d dVar = c31772a.f187931k;
            dVar.h(size, useCaseScenario);
            dVar.l();
            lVar.setValue(HY.m.a(lVar.getValue(), null, null, new m.c.C0424c(andIncrement), m.c.b.f7265a, null, null, false, null, null, null, null, 4083));
            C31772a.b.C5530b c5530b = new C31772a.b.C5530b(andIncrement);
            this.f187831q = 1;
            if (c31772a.j(lVar, messengerUserHashInfo, c5530b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}

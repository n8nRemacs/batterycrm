package com.avito.android.messenger.channels.mvi.list_feature;

import HY.g;
import HY.m;
import com.avito.android.messenger.channels.analytics.UseCaseScenario;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsListActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Lkotlin/G0;", "<anonymous>", "(Lru/avito/messenger/MessengerUserHashInfo;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$8$1", f = "ChannelsListActor.kt", i = {}, l = {329, 337, 341}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class Q extends SuspendLambda implements Y41.p<MessengerUserHashInfo, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f187820q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f187821r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.l<HY.m> f187822s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C31772a f187823t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g.b f187824u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(g.b bVar, com.avito.android.arch.mvi.utils.l lVar, C31772a c31772a, Continuation continuation) {
        super(2, continuation);
        this.f187822s = lVar;
        this.f187823t = c31772a;
        this.f187824u = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        Q q12 = new Q(this.f187824u, this.f187822s, this.f187823t, continuation);
        q12.f187821r = obj;
        return q12;
    }

    @Override // Y41.p
    public final Object invoke(MessengerUserHashInfo messengerUserHashInfo, Continuation<? super kotlin.G0> continuation) {
        return ((Q) create(messengerUserHashInfo, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f187820q;
        if (i12 != 0) {
            if (i12 == 1) {
                C42729a0.b(obj);
                return kotlin.G0.f406611a;
            }
            if (i12 == 2) {
                C42729a0.b(obj);
                return (kotlin.G0) obj;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return (kotlin.G0) obj;
        }
        C42729a0.b(obj);
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) this.f187821r;
        com.avito.android.arch.mvi.utils.l<HY.m> lVar = this.f187822s;
        boolean z12 = lVar.getValue().f7251b instanceof m.c.b;
        C31772a c31772a = this.f187823t;
        if (!z12) {
            UseCaseScenario useCaseScenario = UseCaseScenario.f187081f;
            this.f187820q = 1;
            if (C31772a.d(c31772a, this.f187822s, messengerUserHashInfo, true, useCaseScenario, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.G0.f406611a;
        }
        if (!(lVar.getValue().f7252c instanceof m.c.b) || !((g.b.l) this.f187824u).f7213a) {
            UseCaseScenario useCaseScenario2 = UseCaseScenario.f187081f;
            this.f187820q = 2;
            obj = c31772a.h(lVar, useCaseScenario2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (kotlin.G0) obj;
        }
        if (!(lVar.getValue().f7253d instanceof m.c.a)) {
            return kotlin.G0.f406611a;
        }
        this.f187820q = 3;
        obj = C31772a.i(lVar, new C31778d(lVar, c31772a, null), this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        return (kotlin.G0) obj;
    }
}

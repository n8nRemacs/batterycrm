package com.avito.android.messenger.channels.mvi.list_feature;

import HY.c;
import com.avito.android.messenger.channels.analytics.UseCaseScenario;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsListActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Lkotlin/G0;", "<anonymous>", "(Lru/avito/messenger/MessengerUserHashInfo;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$17$1", f = "ChannelsListActor.kt", i = {}, l = {432}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class B extends SuspendLambda implements Y41.p<MessengerUserHashInfo, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f187691q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f187692r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C31772a f187693s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.l<HY.m> f187694t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c.e f187695u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C31772a c31772a, com.avito.android.arch.mvi.utils.l<HY.m> lVar, c.e eVar, Continuation<? super B> continuation) {
        super(2, continuation);
        this.f187693s = c31772a;
        this.f187694t = lVar;
        this.f187695u = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        B b12 = new B(this.f187693s, this.f187694t, this.f187695u, continuation);
        b12.f187692r = obj;
        return b12;
    }

    @Override // Y41.p
    public final Object invoke(MessengerUserHashInfo messengerUserHashInfo, Continuation<? super kotlin.G0> continuation) {
        return ((B) create(messengerUserHashInfo, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f187691q;
        if (i12 == 0) {
            C42729a0.b(obj);
            MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) this.f187692r;
            ((c.e.b) this.f187695u).getClass();
            UseCaseScenario useCaseScenario = UseCaseScenario.f187080e;
            this.f187691q = 1;
            if (C31772a.d(this.f187693s, this.f187694t, messengerUserHashInfo, true, useCaseScenario, this) == coroutine_suspended) {
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

package com.avito.android.messenger.channels.mvi.list_feature;

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
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$applyNewFilter$2", f = "ChannelsListActor.kt", i = {}, l = {906}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.channels.mvi.list_feature.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31774b extends SuspendLambda implements Y41.p<MessengerUserHashInfo, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f187979q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f187980r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.l<HY.m> f187981s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C31772a f187982t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31774b(com.avito.android.arch.mvi.utils.l<HY.m> lVar, C31772a c31772a, Continuation<? super C31774b> continuation) {
        super(2, continuation);
        this.f187981s = lVar;
        this.f187982t = c31772a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31774b c31774b = new C31774b(this.f187981s, this.f187982t, continuation);
        c31774b.f187980r = obj;
        return c31774b;
    }

    @Override // Y41.p
    public final Object invoke(MessengerUserHashInfo messengerUserHashInfo, Continuation<? super kotlin.G0> continuation) {
        return ((C31774b) create(messengerUserHashInfo, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f187979q;
        if (i12 == 0) {
            C42729a0.b(obj);
            MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) this.f187980r;
            HY.m.f7248m.getClass();
            HY.m mVar = HY.m.f7249n;
            com.avito.android.arch.mvi.utils.l<HY.m> lVar = this.f187981s;
            lVar.setValue(HY.m.a(mVar, null, null, null, null, null, null, false, null, lVar.getValue().f7258i, null, null, 3839));
            UseCaseScenario useCaseScenario = UseCaseScenario.f187088m;
            this.f187979q = 1;
            if (C31772a.d(this.f187982t, lVar, messengerUserHashInfo, true, useCaseScenario, this) == coroutine_suspended) {
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

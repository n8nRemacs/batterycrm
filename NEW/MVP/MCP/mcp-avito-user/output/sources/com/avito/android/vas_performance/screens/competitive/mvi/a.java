package com.avito.android.vas_performance.screens.competitive.mvi;

import Y41.p;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.vas_performance.screens.competitive.mvi.entity.CompetitiveVasV2InternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CompetitiveVasV2Actor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/vas_performance/screens/competitive/mvi/entity/CompetitiveVasV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.vas_performance.screens.competitive.mvi.CompetitiveVasV2Actor$process$1", f = "CompetitiveVasV2Actor.kt", i = {0}, l = {34, 35}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super CompetitiveVasV2InternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f320436q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f320437r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DeepLink f320438s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DeepLink deepLink, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f320438s = deepLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f320438s, continuation);
        aVar.f320437r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CompetitiveVasV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f320436q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f320437r;
            CompetitiveVasV2InternalAction.SendClickStreamEvent sendClickStreamEvent = CompetitiveVasV2InternalAction.SendClickStreamEvent.f320452b;
            this.f320437r = interfaceC43172j;
            this.f320436q = 1;
            if (interfaceC43172j.emit(sendClickStreamEvent, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f320437r;
            C42729a0.b(obj);
        }
        CompetitiveVasV2InternalAction.HandleDeeplink handleDeeplink = new CompetitiveVasV2InternalAction.HandleDeeplink(this.f320438s);
        this.f320437r = null;
        this.f320436q = 2;
        if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}

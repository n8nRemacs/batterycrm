package com.avito.android.iac_calls_history.impl_module.screen.mvi;

import Y41.p;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenInternalAction;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CallsHistoryScreenActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction;", "<anonymous>", "(Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_calls_history.impl_module.screen.mvi.CallsHistoryScreenActor$process$1", f = "CallsHistoryScreenActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class c extends SuspendLambda implements p<com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.a, Continuation<? super InterfaceC43160i<? extends CallsHistoryScreenInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f164800q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f164801r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<CallsHistoryScreenState> f164802s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, Y41.a<CallsHistoryScreenState> aVar2, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f164801r = aVar;
        this.f164802s = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f164801r, this.f164802s, continuation);
        cVar.f164800q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.a aVar, Continuation<? super InterfaceC43160i<? extends CallsHistoryScreenInternalAction>> continuation) {
        return ((c) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.a aVar = (com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.a) this.f164800q;
        CallsHistoryScreenState callsHistoryScreenStateInvoke = this.f164802s.invoke();
        a aVar2 = this.f164801r;
        aVar2.getClass();
        return C43175k.G(new d(aVar, aVar2, callsHistoryScreenStateInvoke, null));
    }
}

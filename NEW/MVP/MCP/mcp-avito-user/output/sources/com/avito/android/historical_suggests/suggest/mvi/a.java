package com.avito.android.historical_suggests.suggest.mvi;

import Y41.p;
import Y61.l;
import com.avito.android.historical_suggests.suggest.mvi.entity.HistoricalSuggestsInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;
import uI.C48901b;
import vI.C49218c;
import vI.InterfaceC49216a;

/* compiled from: HistoricalSuggestsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/historical_suggests/suggest/mvi/entity/HistoricalSuggestsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.historical_suggests.suggest.mvi.HistoricalSuggestsActor$process$1", f = "HistoricalSuggestsActor.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super HistoricalSuggestsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f162122q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f162123r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C49218c f162124s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC49216a f162125t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C49218c c49218c, InterfaceC49216a interfaceC49216a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f162124s = c49218c;
        this.f162125t = interfaceC49216a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f162124s, this.f162125t, continuation);
        aVar.f162123r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super HistoricalSuggestsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f162122q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f162123r;
            C48901b c48901b = this.f162124s.f440661c;
            InterfaceC49216a.c cVar = (InterfaceC49216a.c) this.f162125t;
            if (!L.f(c48901b, cVar.f440651a)) {
                HistoricalSuggestsInternalAction.b bVar = new HistoricalSuggestsInternalAction.b(cVar.f440651a);
                this.f162122q = 1;
                if (interfaceC43172j.emit(bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}

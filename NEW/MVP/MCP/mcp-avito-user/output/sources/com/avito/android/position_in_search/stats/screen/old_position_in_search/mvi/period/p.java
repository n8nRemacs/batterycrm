package com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period;

import X80.c;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PeriodInfoActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.PeriodInfoActor$processSortClicked$1", f = "PeriodInfoActor.kt", i = {}, l = {135, 137, 141}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class p extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PeriodInfoInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f220676q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f220677r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ X80.j f220678s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(X80.j jVar, Continuation<? super p> continuation) {
        super(2, continuation);
        this.f220678s = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        p pVar = new p(this.f220678s, continuation);
        pVar.f220677r = obj;
        return pVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PeriodInfoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((p) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f220676q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f220677r;
            X80.c cVar = this.f220678s.f18714f;
            if (cVar instanceof c.a) {
                X80.i iVar = ((c.a) cVar).f18675e;
                if (iVar == null) {
                    PeriodInfoInternalAction.NoChange noChange = PeriodInfoInternalAction.NoChange.f220607b;
                    this.f220676q = 1;
                    if (interfaceC43172j.emit(noChange, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    PeriodInfoInternalAction.OpenSortDeepLink openSortDeepLink = new PeriodInfoInternalAction.OpenSortDeepLink(iVar.f18709d, iVar.f18707b);
                    this.f220676q = 2;
                    if (interfaceC43172j.emit(openSortDeepLink, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                PeriodInfoInternalAction.NoChange noChange2 = PeriodInfoInternalAction.NoChange.f220607b;
                this.f220676q = 3;
                if (interfaceC43172j.emit(noChange2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2 && i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}

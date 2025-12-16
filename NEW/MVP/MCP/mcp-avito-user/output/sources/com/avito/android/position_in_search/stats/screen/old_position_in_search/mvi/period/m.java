package com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period;

import X80.b;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.PeriodInfoActor$processLoadingActions$$inlined$flatMapLatest$1", f = "PeriodInfoActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
public final class m extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PeriodInfoInternalAction>, b.g, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f220659q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f220660r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f220661s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f220662t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a f220663u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Y41.a aVar, a aVar2, Continuation continuation) {
        super(3, continuation);
        this.f220662t = aVar2;
        this.f220663u = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super PeriodInfoInternalAction> interfaceC43172j, b.g gVar, Continuation<? super G0> continuation) {
        m mVar = new m(this.f220663u, this.f220662t, continuation);
        mVar.f220660r = interfaceC43172j;
        mVar.f220661s = gVar;
        return mVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f220659q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f220660r;
            InterfaceC43160i<PeriodInfoInternalAction> interfaceC43160iB = this.f220662t.b((b.g) this.f220661s, (X80.j) this.f220663u.invoke());
            this.f220659q = 1;
            if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
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

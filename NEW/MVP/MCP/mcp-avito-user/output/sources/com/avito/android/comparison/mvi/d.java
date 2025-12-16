package com.avito.android.comparison.mvi;

import Rq.InterfaceC15071a;
import com.avito.android.comparison.ComparisonFragmentMvi;
import com.avito.android.comparison.remote.model.ComparisonResponse;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import n41.InterfaceC44191h;

/* compiled from: ComparisonActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/comparison/remote/model/ComparisonResponse;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comparison.mvi.ComparisonActor$process$1", f = "ComparisonActor.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super io.reactivex.rxjava3.core.z<TypedResult<ComparisonResponse>>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f124121q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f124122r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15071a f124123s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f124124t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC15071a interfaceC15071a, m mVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f124123s = interfaceC15071a;
        this.f124124t = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f124123s, this.f124124t, continuation);
        dVar.f124122r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super io.reactivex.rxjava3.core.z<TypedResult<ComparisonResponse>>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC44191h interfaceC44191hC;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f124121q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f124122r;
            boolean z12 = ((InterfaceC15071a.k) this.f124123s).f14674a;
            m mVar = this.f124124t;
            if (z12) {
                com.avito.android.comparison.domain.a aVar = mVar.f124141a;
                ComparisonFragmentMvi.a aVar2 = mVar.f124142b;
                interfaceC44191hC = aVar.b(aVar2.f123787a, aVar2.f123788b);
            } else {
                com.avito.android.comparison.domain.a aVar3 = mVar.f124141a;
                ComparisonFragmentMvi.a aVar4 = mVar.f124142b;
                interfaceC44191hC = aVar3.c(aVar4.f123787a, aVar4.f123788b, false);
            }
            this.f124121q = 1;
            if (interfaceC43172j.emit(interfaceC44191hC, this) == coroutine_suspended) {
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

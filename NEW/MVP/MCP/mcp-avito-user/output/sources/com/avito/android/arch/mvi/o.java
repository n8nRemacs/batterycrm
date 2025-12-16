package com.avito.android.arch.mvi;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.e2;

/* compiled from: FeatureBuffer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.arch.mvi.FeatureBufferQueue$flush$1", f = "FeatureBuffer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class o extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p<Object> f92001q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e2 f92002r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ N f92003s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(p pVar, e2 e2Var, Y41.l lVar, Continuation continuation) {
        super(2, continuation);
        this.f92001q = pVar;
        this.f92002r = e2Var;
        this.f92003s = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new o(this.f92001q, this.f92002r, this.f92003s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((o) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        while (true) {
            p<Object> pVar = this.f92001q;
            if (pVar.f92004a.isEmpty()) {
                return G0.f406611a;
            }
            Object objPoll = pVar.f92004a.poll();
            if (objPoll != null) {
                boolean zK5 = this.f92002r.K5(objPoll);
                ?? r12 = this.f92003s;
                if (zK5) {
                    r12.invoke("emit pending " + objPoll);
                } else {
                    r12.invoke("Fail: emit pending " + objPoll);
                }
            }
        }
    }
}

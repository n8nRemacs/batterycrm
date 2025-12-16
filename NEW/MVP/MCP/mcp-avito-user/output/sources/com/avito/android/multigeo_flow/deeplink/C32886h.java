package com.avito.android.multigeo_flow.deeplink;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: JobMultiGeoEditDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.multigeo_flow.deeplink.JobMultiGeoEditDeeplinkHandler$doHandle$1", f = "JobMultiGeoEditDeeplinkHandler.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.multigeo_flow.deeplink.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32886h extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f206828q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f206829r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32886h(o oVar, Continuation<? super C32886h> continuation) {
        super(2, continuation);
        this.f206829r = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C32886h(this.f206829r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C32886h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f206828q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f206828q = 1;
            o oVar = this.f206829r;
            Object objCollect = ((AbstractC43168f) kotlinx.coroutines.rx3.y.a(oVar.f206851h.d9())).collect(new C32887i(oVar), this);
            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCollect = G0.f406611a;
            }
            if (objCollect == coroutine_suspended) {
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

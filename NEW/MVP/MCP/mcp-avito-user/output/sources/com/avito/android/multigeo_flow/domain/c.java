package com.avito.android.multigeo_flow.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: JobMultiGeoInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LP20/d;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.multigeo_flow.domain.JobMultiGeoInteractorImpl$deleteAddress$2", f = "JobMultiGeoInteractor.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super TypedResult<P20.d>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f206880q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f206881r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f206882s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f206883t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, int i12, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f206881r = dVar;
        this.f206882s = str;
        this.f206883t = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new c(this.f206881r, this.f206882s, this.f206883t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<P20.d>> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f206880q;
        if (i12 == 0) {
            C42729a0.b(obj);
            M20.a aVar = this.f206881r.f206884a.get();
            this.f206880q = 1;
            obj = aVar.a(this.f206882s, this.f206883t, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}

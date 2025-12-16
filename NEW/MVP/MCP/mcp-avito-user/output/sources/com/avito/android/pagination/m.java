package com.avito.android.pagination;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PaginationImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "FeatureAction", "Lr50/e;", "it", "Lkotlin/G0;", "<anonymous>", "(Lr50/e;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.pagination.PaginationImpl$startPagination$3", f = "PaginationImpl.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class m extends SuspendLambda implements Y41.p<r50.e, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f210578q;

    public m() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        throw null;
    }

    @Override // Y41.p
    public final Object invoke(r50.e eVar, Continuation<? super G0> continuation) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f210578q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f210578q = 1;
            throw null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        return G0.f406611a;
    }
}

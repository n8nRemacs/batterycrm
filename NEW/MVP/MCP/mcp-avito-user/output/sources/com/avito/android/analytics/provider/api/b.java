package com.avito.android.analytics.provider.api;

import Y41.p;
import Y61.k;
import Y61.l;
import bc.InterfaceC25627a;
import io.reactivex.rxjava3.core.z;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: ApiEventTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lio/reactivex/rxjava3/core/z;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lio/reactivex/rxjava3/core/z;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.analytics.provider.api.ApiEventTracker$track$2", f = "ApiEventTracker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super z<?>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC25627a f90235q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f90236r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC25627a interfaceC25627a, c cVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f90235q = interfaceC25627a;
        this.f90236r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f90235q, this.f90236r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super z<?>> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f90235q.b(this.f90236r.f90238b.get());
    }
}

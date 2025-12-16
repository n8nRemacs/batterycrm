package com.avito.android.analytics.provider.api;

import Y41.p;
import Y61.k;
import Y61.l;
import bc.InterfaceC25627a;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.z;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import l41.g;

/* compiled from: ApiEventTracker.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lio/reactivex/rxjava3/disposables/d;", "Lj41/e;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lio/reactivex/rxjava3/disposables/d;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.analytics.provider.api.ApiEventTracker$track$1", f = "ApiEventTracker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super io.reactivex.rxjava3.disposables.d>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC25627a f90232q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f90233r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC25627a interfaceC25627a, c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f90232q = interfaceC25627a;
        this.f90233r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new a(this.f90232q, this.f90233r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super io.reactivex.rxjava3.disposables.d> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        z<?> zVarB = this.f90232q.b(this.f90233r.f90237a.get());
        g<? super Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
        final V2 v22 = V2.f318762a;
        g<? super Throwable> gVar2 = new g() { // from class: com.avito.android.analytics.provider.api.a.a
            @Override // l41.g
            public final void accept(Object obj2) {
                v22.f((Throwable) obj2);
            }
        };
        zVarB.getClass();
        return zVarB.v0(gVar, gVar2, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }
}

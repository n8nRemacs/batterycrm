package com.avito.android.geo_common.interactor;

import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mF.InterfaceC43955a;

/* compiled from: LocationInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LuF/g;", "<anonymous>", "()Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.geo_common.interactor.LocationInteractorImpl$getCurrentCoordinatesObservable$1", f = "LocationInteractor.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class q extends SuspendLambda implements Y41.l<Continuation<? super TypedResult<uF.g>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f159375q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y f159376r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(y yVar, Continuation<? super q> continuation) {
        super(1, continuation);
        this.f159376r = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
        return new q(this.f159376r, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super TypedResult<uF.g>> continuation) {
        return ((q) create(continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f159375q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43955a interfaceC43955aB = this.f159376r.b();
            this.f159375q = 1;
            obj = interfaceC43955aB.s(this);
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

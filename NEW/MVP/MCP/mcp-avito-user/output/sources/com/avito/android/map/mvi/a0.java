package com.avito.android.map.mvi;

import com.avito.android.map.mvi.entity.MapErrorType;
import com.avito.android.map.mvi.entity.MapInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MyLocationInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.map.mvi.MyLocationInteractorImpl$isRequestRationale$2", f = "MyLocationInteractor.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class a0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super MapInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f185011q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f185012r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f185013s;

    public a0() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super MapInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        a0 a0Var = new a0(3, continuation);
        a0Var.f185012r = interfaceC43172j;
        a0Var.f185013s = th2;
        return a0Var.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f185011q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f185012r;
            MapInternalAction.Error error = new MapInternalAction.Error(new Exception(this.f185013s), MapErrorType.f185057f);
            this.f185012r = null;
            this.f185011q = 1;
            if (interfaceC43172j.emit(error, this) == coroutine_suspended) {
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

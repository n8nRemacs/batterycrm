package com.avito.android.autoteka.data.order;

import Y41.q;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutotekaChangeEmailInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lkotlin/G0;", "", "throwable", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.autoteka.data.order.AutotekaChangeEmailInteractorImpl$saveEmail$3", f = "AutotekaChangeEmailInteractor.kt", i = {}, l = {43, 47}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class c extends SuspendLambda implements q<InterfaceC43172j<? super TypedResult<G0>>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f96151q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f96152r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f96153s;

    public c() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super TypedResult<G0>> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        c cVar = new c(3, continuation);
        cVar.f96152r = interfaceC43172j;
        cVar.f96153s = th2;
        return cVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f96151q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f96152r;
            Throwable th2 = this.f96153s;
            if (th2 instanceof ApiException) {
                TypedResult.Error error = new TypedResult.Error(((ApiException) th2).f318522b, null, 2, null);
                this.f96152r = null;
                this.f96151q = 1;
                if (interfaceC43172j.emit(error, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                String message = th2.getMessage();
                if (message == null) {
                    message = "";
                }
                TypedResult.Error error2 = new TypedResult.Error(new ApiError.UnknownError(message, null, null, 6, null), null, 2, null);
                this.f96152r = null;
                this.f96151q = 2;
                if (interfaceC43172j.emit(error2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}

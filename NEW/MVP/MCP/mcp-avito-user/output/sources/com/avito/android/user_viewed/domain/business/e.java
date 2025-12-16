package com.avito.android.user_viewed.domain.business;

import Y41.q;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.user_viewed.domain.model.UserViewedData;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserViewedCommonInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/user_viewed/domain/model/UserViewedData;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_viewed.domain.business.UserViewedCommonInteractorImpl$observe$2$2", f = "UserViewedCommonInteractor.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class e extends SuspendLambda implements q<InterfaceC43172j<? super TypedResult<UserViewedData>>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f318339q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f318340r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f318341s;

    public e() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super TypedResult<UserViewedData>> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        e eVar = new e(3, continuation);
        eVar.f318340r = interfaceC43172j;
        eVar.f318341s = th2;
        return eVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f318339q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f318340r;
            String message = this.f318341s.getMessage();
            if (message == null) {
                message = "";
            }
            TypedResult.Error error = new TypedResult.Error(new ApiError.Failure(message), null, 2, null);
            this.f318340r = null;
            this.f318339q = 1;
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

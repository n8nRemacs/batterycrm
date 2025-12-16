package com.avito.android.profile.user_profile;

import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import com.avito.android.remote.error.ApiError;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserProfileInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.user_profile.UserProfileInteractorImpl$loadData$2", f = "UserProfileInteractor.kt", i = {}, l = {205, 206, 207}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class n extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UserProfileInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f226549q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f226550r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f226551s;

    public n() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        n nVar = new n(3, continuation);
        nVar.f226550r = interfaceC43172j;
        nVar.f226551s = th2;
        return nVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f226549q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f226550r;
            Throwable th2 = this.f226551s;
            ApiError apiErrorM = com.avito.android.error.z.m(th2);
            if (apiErrorM instanceof ApiError.Unauthorized) {
                UserProfileInternalAction.AuthorizationError authorizationError = UserProfileInternalAction.AuthorizationError.f226415b;
                this.f226550r = null;
                this.f226549q = 1;
                if (interfaceC43172j.emit(authorizationError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (apiErrorM != null) {
                UserProfileInternalAction.DataError dataError = new UserProfileInternalAction.DataError(com.avito.android.error.z.k(apiErrorM), th2);
                this.f226550r = null;
                this.f226549q = 2;
                if (interfaceC43172j.emit(dataError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                UserProfileInternalAction.DataError dataError2 = new UserProfileInternalAction.DataError("", th2);
                this.f226550r = null;
                this.f226549q = 3;
                if (interfaceC43172j.emit(dataError2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2 && i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}

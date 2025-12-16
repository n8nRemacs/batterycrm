package com.avito.android.authorization.auth.auth_socials;

import com.avito.android.authorization.auth.auth_socials.entity.AuthSocialsInternalAction;
import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.remote.model.AuthSocialsStatusResult;
import com.avito.android.remote.model.TypedResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: AuthSocialsInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/authorization/auth/auth_socials/entity/AuthSocialsInternalAction$AuthSocialsLoaded;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/authorization/auth/auth_socials/entity/AuthSocialsInternalAction$AuthSocialsLoaded;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.authorization.auth.auth_socials.AuthSocialsInteractorImpl$getAuthSocials$2", f = "AuthSocialsInteractor.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class m extends SuspendLambda implements Y41.p<T, Continuation<? super AuthSocialsInternalAction.AuthSocialsLoaded>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f92909q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f92910r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f92910r = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new m(this.f92910r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super AuthSocialsInternalAction.AuthSocialsLoaded> continuation) {
        return ((m) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f92909q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC34258d interfaceC34258d = this.f92910r.f92912a;
            this.f92909q = 1;
            obj = interfaceC34258d.e(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            return new AuthSocialsInternalAction.AuthSocialsLoaded(((AuthSocialsStatusResult) ((TypedResult.Success) typedResult).getResult()).getSocials(), true);
        }
        if (typedResult instanceof TypedResult.Error) {
            throw new IllegalStateException();
        }
        throw new NoWhenBranchMatchedException();
    }
}

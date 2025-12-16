package com.avito.android.code_confirmation.code_confirmation;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.registration.RequestCodeResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CodeConfirmationInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/registration/RequestCodeResult;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.code_confirmation.code_confirmation.CodeConfirmationInteractorImpl$requestCode$1$1", f = "CodeConfirmationInteractor.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.code_confirmation.code_confirmation.n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29401n extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super TypedResult<RequestCodeResult>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f119580q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f119581r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f119582s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f119583t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29401n(r rVar, String str, String str2, Continuation<? super C29401n> continuation) {
        super(2, continuation);
        this.f119581r = rVar;
        this.f119582s = str;
        this.f119583t = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C29401n(this.f119581r, this.f119582s, this.f119583t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super TypedResult<RequestCodeResult>> continuation) {
        return ((C29401n) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f119580q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.remote.r rVar = this.f119581r.f119619a.get();
            this.f119580q = 1;
            obj = rVar.f(this.f119582s, this.f119583t, this);
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

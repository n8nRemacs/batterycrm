package com.avito.android.code_confirmation.code_confirmation;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.registration.VerifyCodeResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CodeConfirmationInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/registration/VerifyCodeResult;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.code_confirmation.code_confirmation.CodeConfirmationInteractorImpl$sendCode$1$1", f = "CodeConfirmationInteractor.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.code_confirmation.code_confirmation.q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29404q extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super TypedResult<VerifyCodeResult>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f119614q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f119615r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f119616s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f119617t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f119618u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29404q(r rVar, String str, String str2, String str3, Continuation<? super C29404q> continuation) {
        super(2, continuation);
        this.f119615r = rVar;
        this.f119616s = str;
        this.f119617t = str2;
        this.f119618u = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C29404q(this.f119615r, this.f119616s, this.f119617t, this.f119618u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super TypedResult<VerifyCodeResult>> continuation) {
        return ((C29404q) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f119614q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.remote.r rVar = this.f119615r.f119619a.get();
            this.f119614q = 1;
            obj = rVar.o(this.f119616s, this.f119617t, this.f119618u, this);
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

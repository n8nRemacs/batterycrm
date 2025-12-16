package com.avito.android.mortgage_invite.client_form.domain;

import Y41.p;
import com.avito.android.mortgage_invite.client_form.mvi.entity.ApplicationClientFormInternalAction;
import com.avito.android.remote.error.ApiError;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ApplicationClientFormActionProcessor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/error/ApiError;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/error/ApiError;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.client_form.domain.ApplicationClientFormActionProcessorImpl$processCreateParticipantResult$3", f = "ApplicationClientFormActionProcessor.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class e extends SuspendLambda implements p<ApiError, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f205155q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f205156r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j<ApplicationClientFormInternalAction> f205157s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(InterfaceC43172j<? super ApplicationClientFormInternalAction> interfaceC43172j, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f205157s = interfaceC43172j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f205157s, continuation);
        eVar.f205156r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(ApiError apiError, Continuation<? super G0> continuation) {
        return ((e) create(apiError, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f205155q;
        if (i12 == 0) {
            C42729a0.b(obj);
            ApplicationClientFormInternalAction.ActionLoadingError actionLoadingError = new ApplicationClientFormInternalAction.ActionLoadingError((ApiError) this.f205156r);
            this.f205155q = 1;
            if (this.f205157s.emit(actionLoadingError, this) == coroutine_suspended) {
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

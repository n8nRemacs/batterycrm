package com.avito.android.oauth.presentation.mvi;

import com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction;
import com.avito.android.remote.model.TypedResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import g40.C40529a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import l40.InterfaceC43542a;

/* compiled from: OAuthInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.oauth.presentation.mvi.OAuthInteractorImpl$loadInitialInfo$1", f = "OAuthInteractorImpl.kt", i = {0}, l = {AvailableCode.HMS_IS_SPOOF, 35, 37, 40}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class C extends SuspendLambda implements Y41.p<InterfaceC43172j<? super OAuthInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f208262q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f208263r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B f208264s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(B b12, Continuation<? super C> continuation) {
        super(2, continuation);
        this.f208264s = b12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C c12 = new C(this.f208264s, continuation);
        c12.f208263r = obj;
        return c12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super OAuthInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f208262q;
        B b12 = this.f208264s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f208263r;
            com.avito.android.oauth.repository.c cVar = b12.f208248a;
            String str = b12.f208249b.f208236b;
            this.f208263r = interfaceC43172j;
            this.f208262q = 1;
            obj = cVar.f208462a.d(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3 && i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f208263r;
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            InterfaceC43542a.n nVar = InterfaceC43542a.n.f413462a;
            TypedResult.Error error = typedResult instanceof TypedResult.Error ? (TypedResult.Error) typedResult : null;
            OAuthInternalAction.ShowNetworkError showNetworkError = new OAuthInternalAction.ShowNetworkError(nVar, error != null ? error.getError() : null);
            this.f208263r = null;
            this.f208262q = 4;
            if (interfaceC43172j.emit(showNetworkError, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (((C40529a) ((TypedResult.Success) typedResult).getResult()).getHasAccess()) {
            InterfaceC43160i<OAuthInternalAction> interfaceC43160iB = b12.b();
            this.f208263r = null;
            this.f208262q = 2;
            if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            OAuthInternalAction.ShowErrorAccessDeclined showErrorAccessDeclined = OAuthInternalAction.ShowErrorAccessDeclined.f208302b;
            this.f208263r = null;
            this.f208262q = 3;
            if (interfaceC43172j.emit(showErrorAccessDeclined, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}

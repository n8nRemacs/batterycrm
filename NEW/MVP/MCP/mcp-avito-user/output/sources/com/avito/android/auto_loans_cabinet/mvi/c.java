package com.avito.android.auto_loans_cabinet.mvi;

import Fe.C13795a;
import Ke.InterfaceC14305a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetInternalAction;
import com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState;
import com.avito.android.deep_linking.links.WebViewLink;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutoLoansCabinetActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction$OpenDeeplink;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.auto_loans_cabinet.mvi.AutoLoansCabinetActor$handleReadMoreAboutAutoLoansAction$1", f = "AutoLoansCabinetActor.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AutoLoansCabinetInternalAction.OpenDeeplink>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f95427q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f95428r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14305a.e f95429s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f95430t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AutoLoansCabinetState f95431u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC14305a.e eVar, a aVar, AutoLoansCabinetState autoLoansCabinetState, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f95429s = eVar;
        this.f95430t = aVar;
        this.f95431u = autoLoansCabinetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f95429s, this.f95430t, this.f95431u, continuation);
        cVar.f95428r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AutoLoansCabinetInternalAction.OpenDeeplink> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        C13795a c13795a;
        C13795a c13795a2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f95427q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f95428r;
            AutoLoansCabinetInternalAction.OpenDeeplink openDeeplink = new AutoLoansCabinetInternalAction.OpenDeeplink(new WebViewLink.AnyDomain(this.f95429s.f9568a, null, null, 6, null));
            this.f95427q = 1;
            if (interfaceC43172j.emit(openDeeplink, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        InterfaceC28373a interfaceC28373a = this.f95430t.f95420a;
        AutoLoansCabinetState.BlanksState.Success success = (AutoLoansCabinetState.BlanksState.Success) this.f95431u.f95450b;
        if (success instanceof AutoLoansCabinetState.BlanksState.Success.NoLoans) {
            c13795a2 = new C13795a("c2c_cc_not_started", 11374, 4, (Map) null, 8, (C42822w) null);
        } else {
            if (success instanceof AutoLoansCabinetState.BlanksState.Success.Draft) {
                AutoLoansCabinetState.BlanksState.Success.Draft draft = (AutoLoansCabinetState.BlanksState.Success.Draft) success;
                c13795a = new C13795a("c2c_cc_incomplete", 11374, 4, draft.f95456e, draft.f95457f, null, 32, null);
            } else if (success instanceof AutoLoansCabinetState.BlanksState.Success.LoanApproved) {
                AutoLoansCabinetState.BlanksState.Success.LoanApproved loanApproved = (AutoLoansCabinetState.BlanksState.Success.LoanApproved) success;
                c13795a = new C13795a("c2c_cc_approved", 11374, 4, loanApproved.f95461e, loanApproved.f95462f, null, 32, null);
            } else {
                if (!(success instanceof AutoLoansCabinetState.BlanksState.Success.LoanReject)) {
                    throw new NoWhenBranchMatchedException();
                }
                AutoLoansCabinetState.BlanksState.Success.LoanReject loanReject = (AutoLoansCabinetState.BlanksState.Success.LoanReject) success;
                c13795a = new C13795a("c2c_cc_rejected", 11374, 4, loanReject.f95466e, loanReject.f95467f, null, 32, null);
            }
            c13795a2 = c13795a;
        }
        interfaceC28373a.c(c13795a2);
        return G0.f406611a;
    }
}

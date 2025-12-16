package com.avito.android.auto_loans_cabinet.mvi;

import Fe.C13795a;
import android.os.Parcelable;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetInternalAction;
import com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.deep_linking.x;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.auto_loans_cabinet.mvi.AutoLoansCabinetActor$handleAppBarButtonClick$1", f = "AutoLoansCabinetActor.kt", i = {}, l = {85, 86}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AutoLoansCabinetInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f95423q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f95424r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AutoLoansCabinetState f95425s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f95426t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AutoLoansCabinetState autoLoansCabinetState, a aVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f95425s = autoLoansCabinetState;
        this.f95426t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f95425s, this.f95426t, continuation);
        bVar.f95424r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AutoLoansCabinetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        C13795a c13795a;
        C13795a c13795a2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f95423q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f95424r;
            Parcelable parcelable = this.f95425s.f95450b;
            a aVar = this.f95426t;
            InterfaceC28373a interfaceC28373a = aVar.f95420a;
            AutoLoansCabinetState.BlanksState.Success success = (AutoLoansCabinetState.BlanksState.Success) parcelable;
            boolean z12 = success instanceof AutoLoansCabinetState.BlanksState.Success.NoLoans;
            if (z12) {
                c13795a = new C13795a("c2c_cc_not_started", 14624, 2, (Map) null, 8, (C42822w) null);
            } else {
                if (success instanceof AutoLoansCabinetState.BlanksState.Success.Draft) {
                    AutoLoansCabinetState.BlanksState.Success.Draft draft = (AutoLoansCabinetState.BlanksState.Success.Draft) success;
                    c13795a2 = new C13795a("c2c_cc_incomplete", 9752, 4, draft.f95456e, draft.f95457f, null, 32, null);
                } else if (success instanceof AutoLoansCabinetState.BlanksState.Success.LoanApproved) {
                    AutoLoansCabinetState.BlanksState.Success.LoanApproved loanApproved = (AutoLoansCabinetState.BlanksState.Success.LoanApproved) success;
                    c13795a2 = new C13795a("c2c_cc_approved", 9752, 4, loanApproved.f95461e, loanApproved.f95462f, null, 32, null);
                } else {
                    if (!(success instanceof AutoLoansCabinetState.BlanksState.Success.LoanReject)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AutoLoansCabinetState.BlanksState.Success.LoanReject loanReject = (AutoLoansCabinetState.BlanksState.Success.LoanReject) success;
                    c13795a = new C13795a(loanReject.f95466e, "c2c_cc_rejected", loanReject.f95467f, "more_info");
                }
                c13795a = c13795a2;
            }
            interfaceC28373a.c(c13795a);
            x xVar = aVar.f95421b;
            if (z12) {
                AutoLoansCabinetInternalAction.OpenDeeplink openDeeplink = new AutoLoansCabinetInternalAction.OpenDeeplink((ItemsSearchLink) xVar.b("ru.avito://1/items/search?categoryId=9&locationId=107620&params%5B1283%5D=14756&params%5B147411%5D%5B0%5D=3236337&params%5B147411%5D%5B10%5D=3236349&params%5B147411%5D%5B1%5D=3236339&params%5B147411%5D%5B2%5D=3236338&params%5B147411%5D%5B3%5D=3236341&params%5B147411%5D%5B4%5D=3236342&params%5B147411%5D%5B5%5D=3236340&params%5B147411%5D%5B6%5D=3236343&params%5B147411%5D%5B7%5D=3236344&params%5B147411%5D%5B8%5D=3236347&params%5B147411%5D%5B9%5D=3236346&params%5B177964%5D=1&presentationType=serp&priceMax=0&priceMin=700000"));
                this.f95423q = 1;
                if (interfaceC43172j.emit(openDeeplink, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (success instanceof Ke.c) {
                AutoLoansCabinetInternalAction.OpenDeeplink openDeeplink2 = new AutoLoansCabinetInternalAction.OpenDeeplink(xVar.b("ru.avito://1/beduin/v2/universalPage/modal?screenName=autoloanWizard&pagePath=%2Fapi%2F1%2Fautoloan%2Fform%2Fcontinue%3FitemId%3D" + ((Ke.c) parcelable).getF95466e() + "%26loansType%3Dauto"));
                this.f95423q = 2;
                if (interfaceC43172j.emit(openDeeplink2, this) == coroutine_suspended) {
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

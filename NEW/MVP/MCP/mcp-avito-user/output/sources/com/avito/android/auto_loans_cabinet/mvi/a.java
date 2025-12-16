package com.avito.android.auto_loans_cabinet.mvi;

import Fe.C13795a;
import Ke.InterfaceC14305a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetInternalAction;
import com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState;
import com.avito.android.auto_loans_cabinet.mvi.entity.BannerType;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.deep_linking.x;
import java.util.Collections;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AutoLoansCabinetActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LKe/a;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC14305a, AutoLoansCabinetInternalAction, AutoLoansCabinetState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f95420a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final x f95421b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.auto_loans_cabinet.domain.a f95422c;

    /* compiled from: AutoLoansCabinetActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.auto_loans_cabinet.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2829a {
        static {
            int[] iArr = new int[BannerType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BannerType bannerType = BannerType.f95474b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BannerType bannerType2 = BannerType.f95474b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public a(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k x xVar, @Y61.k com.avito.android.auto_loans_cabinet.domain.a aVar) {
        this.f95420a = interfaceC28373a;
        this.f95421b = xVar;
        this.f95422c = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AutoLoansCabinetInternalAction> b(InterfaceC14305a interfaceC14305a, AutoLoansCabinetState autoLoansCabinetState) {
        C13795a c13795a;
        C13795a c13795a2;
        InterfaceC14305a interfaceC14305a2 = interfaceC14305a;
        AutoLoansCabinetState autoLoansCabinetState2 = autoLoansCabinetState;
        if (interfaceC14305a2 instanceof InterfaceC14305a.b) {
            return new C43210w(AutoLoansCabinetInternalAction.Back.f95441b);
        }
        if (interfaceC14305a2 instanceof InterfaceC14305a.f) {
            return this.f95422c.a();
        }
        if (interfaceC14305a2 instanceof InterfaceC14305a.e) {
            return C43175k.G(new c((InterfaceC14305a.e) interfaceC14305a2, this, autoLoansCabinetState2, null));
        }
        if (!(interfaceC14305a2 instanceof InterfaceC14305a.c)) {
            if (interfaceC14305a2 instanceof InterfaceC14305a.C0584a) {
                return C43175k.G(new b(autoLoansCabinetState2, this, null));
            }
            if (interfaceC14305a2 instanceof InterfaceC14305a.d) {
                return new C43210w(AutoLoansCabinetInternalAction.CloseLoanDetailsBottomSheet.f95442b);
            }
            if (interfaceC14305a2 instanceof InterfaceC14305a.g) {
                return C43175k.G(new d(this, autoLoansCabinetState2, (InterfaceC14305a.g) interfaceC14305a2, null));
            }
            throw new NoWhenBranchMatchedException();
        }
        AutoLoansCabinetState.BlanksState.Success success = (AutoLoansCabinetState.BlanksState.Success) autoLoansCabinetState2.f95450b;
        int iOrdinal = ((InterfaceC14305a.c) interfaceC14305a2).f9566a.ordinal();
        if (iOrdinal == 0) {
            return new C43207v(new AutoLoansCabinetInternalAction[0]);
        }
        InterfaceC28373a interfaceC28373a = this.f95420a;
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (success instanceof AutoLoansCabinetState.BlanksState.Success.NoLoans) {
                c13795a2 = new C13795a(15825, 0, "c2c_cc_not_started", Collections.singletonMap("data", Collections.singletonMap("button", "credit_info")));
            } else if (success instanceof AutoLoansCabinetState.BlanksState.Success.Draft) {
                AutoLoansCabinetState.BlanksState.Success.Draft draft = (AutoLoansCabinetState.BlanksState.Success.Draft) success;
                c13795a2 = new C13795a(draft.f95456e, "c2c_cc_incomplete", draft.f95457f, "credit_info");
            } else if (success instanceof AutoLoansCabinetState.BlanksState.Success.LoanApproved) {
                AutoLoansCabinetState.BlanksState.Success.LoanApproved loanApproved = (AutoLoansCabinetState.BlanksState.Success.LoanApproved) success;
                c13795a2 = new C13795a(loanApproved.f95461e, "c2c_cc_approved", loanApproved.f95462f, "credit_info");
            } else {
                if (!(success instanceof AutoLoansCabinetState.BlanksState.Success.LoanReject)) {
                    throw new NoWhenBranchMatchedException();
                }
                AutoLoansCabinetState.BlanksState.Success.LoanReject loanReject = (AutoLoansCabinetState.BlanksState.Success.LoanReject) success;
                c13795a2 = new C13795a(loanReject.f95466e, "c2c_cc_rejected", loanReject.f95467f, "credit_info");
            }
            interfaceC28373a.c(c13795a2);
            return new C43210w(AutoLoansCabinetInternalAction.OpenLoanDetailsBottomSheet.f95447b);
        }
        if (success instanceof AutoLoansCabinetState.BlanksState.Success.NoLoans) {
            c13795a = new C13795a("c2c_cc_not_started", 14624, 2, (Map) null, 8, (C42822w) null);
        } else if (success instanceof AutoLoansCabinetState.BlanksState.Success.Draft) {
            c13795a = new C13795a("c2c_cc_incomplete", 14624, 2, (Map) null, 8, (C42822w) null);
        } else if (success instanceof AutoLoansCabinetState.BlanksState.Success.LoanApproved) {
            c13795a = new C13795a("c2c_cc_approved", 14624, 2, (Map) null, 8, (C42822w) null);
        } else {
            if (!(success instanceof AutoLoansCabinetState.BlanksState.Success.LoanReject)) {
                throw new NoWhenBranchMatchedException();
            }
            c13795a = new C13795a("c2c_cc_rejected", 14624, 2, (Map) null, 8, (C42822w) null);
        }
        interfaceC28373a.c(c13795a);
        return new C43210w(new AutoLoansCabinetInternalAction.OpenDeeplink((ItemsSearchLink) this.f95421b.b("ru.avito://1/items/search?categoryId=9&locationId=107620&params%5B1283%5D=14756&params%5B147411%5D%5B0%5D=3236337&params%5B147411%5D%5B10%5D=3236349&params%5B147411%5D%5B1%5D=3236339&params%5B147411%5D%5B2%5D=3236338&params%5B147411%5D%5B3%5D=3236341&params%5B147411%5D%5B4%5D=3236342&params%5B147411%5D%5B5%5D=3236340&params%5B147411%5D%5B6%5D=3236343&params%5B147411%5D%5B7%5D=3236344&params%5B147411%5D%5B8%5D=3236347&params%5B147411%5D%5B9%5D=3236346&params%5B177964%5D=1&presentationType=serp&priceMax=0&priceMin=700000")));
    }
}

package Y00;

import KZ.C14272b;
import KZ.C14279i;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.mortgage.api.model.items.application.ApplicationAppealCreditInfo;
import com.avito.android.mortgage.api.model.items.application.ApplicationAppealCreditInfoFloatField;
import com.avito.android.mortgage.api.model.items.application.ApplicationAppealCreditInfoIntField;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageRootAnalyticsInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LY00/h;", "LY00/g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Y00.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C18247h implements InterfaceC18246g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f19231a;

    @Inject
    public C18247h(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f19231a = interfaceC28373a;
    }

    @Override // Y00.InterfaceC18246g
    public final void a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k C14272b c14272b) {
        C14279i selectBankButton = c14272b.getSelectBankButton();
        this.f19231a.c(new o(str, str2, str3, c14272b.getTitle(), (selectBankButton == null || !selectBankButton.getIsSelected()) ? "choose_bank" : "choose_another_bank"));
    }

    @Override // Y00.InterfaceC18246g
    public final void b(@Y61.k String str, @Y61.k String str2, @Y61.k List<C14272b> list) {
        ApplicationAppealCreditInfoIntField loanTerm;
        ApplicationAppealCreditInfoFloatField rate;
        ApplicationAppealCreditInfoIntField monthlyPayment;
        ApplicationAppealCreditInfoIntField initialPayment;
        ApplicationAppealCreditInfoIntField loanAmount;
        for (C14272b c14272b : list) {
            String title = c14272b.getTitle();
            String state = c14272b.getState();
            ApplicationAppealCreditInfo creditInfo = c14272b.getCreditInfo();
            Integer numValueOf = (creditInfo == null || (loanAmount = creditInfo.getLoanAmount()) == null) ? null : Integer.valueOf(loanAmount.c());
            ApplicationAppealCreditInfo creditInfo2 = c14272b.getCreditInfo();
            Integer numValueOf2 = (creditInfo2 == null || (initialPayment = creditInfo2.getInitialPayment()) == null) ? null : Integer.valueOf(initialPayment.c());
            ApplicationAppealCreditInfo creditInfo3 = c14272b.getCreditInfo();
            Integer numValueOf3 = (creditInfo3 == null || (monthlyPayment = creditInfo3.getMonthlyPayment()) == null) ? null : Integer.valueOf(monthlyPayment.c());
            ApplicationAppealCreditInfo creditInfo4 = c14272b.getCreditInfo();
            Float fValueOf = (creditInfo4 == null || (rate = creditInfo4.getRate()) == null) ? null : Float.valueOf(rate.c());
            ApplicationAppealCreditInfo creditInfo5 = c14272b.getCreditInfo();
            this.f19231a.c(new n(str, str2, title, state, numValueOf, numValueOf2, numValueOf3, fValueOf, (creditInfo5 == null || (loanTerm = creditInfo5.getLoanTerm()) == null) ? null : Integer.valueOf(loanTerm.c())));
        }
    }
}

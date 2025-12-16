package com.avito.android.mortgage.root.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.suggestion.model.SuggestionArguments;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import f10.c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MortgageRootOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/A;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lf10/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class A implements com.avito.android.arch.mvi.t<MortgageRootInternalAction, f10.c> {
    @Inject
    public A() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final f10.c b(MortgageRootInternalAction mortgageRootInternalAction) {
        f10.c nVar;
        MortgageRootInternalAction mortgageRootInternalAction2 = mortgageRootInternalAction;
        if (mortgageRootInternalAction2 instanceof MortgageRootInternalAction.GoBack) {
            return c.b.f395625a;
        }
        if (mortgageRootInternalAction2 instanceof MortgageRootInternalAction.OpenApplicantTypeSelector) {
            nVar = new c.f(((MortgageRootInternalAction.OpenApplicantTypeSelector) mortgageRootInternalAction2).f203199b);
        } else if (mortgageRootInternalAction2 instanceof MortgageRootInternalAction.OpenDetails) {
            nVar = new c.i(((MortgageRootInternalAction.OpenDetails) mortgageRootInternalAction2).f203208b);
        } else if (mortgageRootInternalAction2 instanceof MortgageRootInternalAction.OpenConfirmCloseDialog) {
            nVar = new c.h(((MortgageRootInternalAction.OpenConfirmCloseDialog) mortgageRootInternalAction2).f203207b);
        } else if (mortgageRootInternalAction2 instanceof MortgageRootInternalAction.OpenSendingConfirm) {
            nVar = new c.m(((MortgageRootInternalAction.OpenSendingConfirm) mortgageRootInternalAction2).f203213b);
        } else if (mortgageRootInternalAction2 instanceof MortgageRootInternalAction.OpenAcceptDialog) {
            nVar = new c.e(((MortgageRootInternalAction.OpenAcceptDialog) mortgageRootInternalAction2).f203198b);
        } else {
            if (mortgageRootInternalAction2 instanceof MortgageRootInternalAction.ApplicationDeleteCompleted) {
                return c.C11122c.f395626a;
            }
            if (mortgageRootInternalAction2 instanceof MortgageRootInternalAction.OpenMortgageTerms) {
                nVar = new c.k(((MortgageRootInternalAction.OpenMortgageTerms) mortgageRootInternalAction2).f203211b);
            } else if (mortgageRootInternalAction2 instanceof MortgageRootInternalAction.OpenSelectedAppeal) {
                nVar = new c.l(((MortgageRootInternalAction.OpenSelectedAppeal) mortgageRootInternalAction2).f203212b);
            } else if (mortgageRootInternalAction2 instanceof MortgageRootInternalAction.HandleDeeplink) {
                nVar = new c.d(((MortgageRootInternalAction.HandleDeeplink) mortgageRootInternalAction2).f203194b);
            } else if (mortgageRootInternalAction2 instanceof MortgageRootInternalAction.StepLoadingFailed) {
                nVar = new c.o(((MortgageRootInternalAction.StepLoadingFailed) mortgageRootInternalAction2).f203247b);
            } else if (mortgageRootInternalAction2 instanceof MortgageRootInternalAction.ApplicationDeleteFailed) {
                nVar = new c.o(((MortgageRootInternalAction.ApplicationDeleteFailed) mortgageRootInternalAction2).f203157b);
            } else if (mortgageRootInternalAction2 instanceof MortgageRootInternalAction.ApplicationLoadingFailed) {
                nVar = new c.o(((MortgageRootInternalAction.ApplicationLoadingFailed) mortgageRootInternalAction2).f203164b);
            } else if (mortgageRootInternalAction2 instanceof MortgageRootInternalAction.ApplicationReloadingFailed) {
                nVar = new c.o(((MortgageRootInternalAction.ApplicationReloadingFailed) mortgageRootInternalAction2).f203178b);
            } else if (mortgageRootInternalAction2 instanceof MortgageRootInternalAction.CreateApplicantLoadingFailed) {
                nVar = new c.o(((MortgageRootInternalAction.CreateApplicantLoadingFailed) mortgageRootInternalAction2).f203188b);
            } else if (mortgageRootInternalAction2 instanceof MortgageRootInternalAction.OpenImmutableDataDescription) {
                nVar = new c.j(((MortgageRootInternalAction.OpenImmutableDataDescription) mortgageRootInternalAction2).f203209b);
            } else if (mortgageRootInternalAction2 instanceof MortgageRootInternalAction.OpenBankApplicationLoadingCompleted) {
                nVar = new c.a(((MortgageRootInternalAction.OpenBankApplicationLoadingCompleted) mortgageRootInternalAction2).f203200b);
            } else if (mortgageRootInternalAction2 instanceof MortgageRootInternalAction.OpenBankApplicationLoadingFailed) {
                nVar = new c.o(((MortgageRootInternalAction.OpenBankApplicationLoadingFailed) mortgageRootInternalAction2).f203201b);
            } else if (mortgageRootInternalAction2 instanceof MortgageRootInternalAction.SelectBankLoadingFailed) {
                nVar = new c.o(((MortgageRootInternalAction.SelectBankLoadingFailed) mortgageRootInternalAction2).f203236b);
            } else if (mortgageRootInternalAction2 instanceof MortgageRootInternalAction.OpenBankDetails) {
                nVar = new c.g(((MortgageRootInternalAction.OpenBankDetails) mortgageRootInternalAction2).f203206b);
            } else {
                if (!(mortgageRootInternalAction2 instanceof MortgageRootInternalAction.RealtyObjectDetailsAddressFocused)) {
                    return null;
                }
                MortgageRootInternalAction.RealtyObjectDetailsAddressFocused realtyObjectDetailsAddressFocused = (MortgageRootInternalAction.RealtyObjectDetailsAddressFocused) mortgageRootInternalAction2;
                nVar = new c.n(new SuggestionArguments("", realtyObjectDetailsAddressFocused.f203218b, realtyObjectDetailsAddressFocused.f203219c, realtyObjectDetailsAddressFocused.f203220d, realtyObjectDetailsAddressFocused.f203221e, "REALTY_OBJECT_DETAILS_ADDRESS"));
            }
        }
        return nVar;
    }
}

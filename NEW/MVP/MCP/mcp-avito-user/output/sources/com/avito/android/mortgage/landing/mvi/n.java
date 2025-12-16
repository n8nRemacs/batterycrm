package com.avito.android.mortgage.landing.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.t;
import com.avito.android.mortgage.landing.mvi.entity.LandingInternalAction;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import w00.InterfaceC49417c;

/* compiled from: LandingOneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "Lw00/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n implements t<LandingInternalAction, InterfaceC49417c> {
    @Inject
    public n() {
    }

    public static PrintableText a(ApiError apiError) {
        PrintableText printableTextF = com.avito.android.printable_text.b.f(apiError.getMessage());
        if (apiError.getMessage().length() <= 0) {
            printableTextF = null;
        }
        return printableTextF == null ? com.avito.android.printable_text.b.c(R.string.error_layout_check_connection, new Serializable[0]) : printableTextF;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49417c b(LandingInternalAction landingInternalAction) {
        LandingInternalAction landingInternalAction2 = landingInternalAction;
        if (landingInternalAction2 instanceof LandingInternalAction.OpenSelectorDialog) {
            return new InterfaceC49417c.j(((LandingInternalAction.OpenSelectorDialog) landingInternalAction2).f200196b);
        }
        if (landingInternalAction2 instanceof LandingInternalAction.ProgramsInfoClicked) {
            LandingInternalAction.ProgramsInfoClicked programsInfoClicked = (LandingInternalAction.ProgramsInfoClicked) landingInternalAction2;
            return new InterfaceC49417c.i(programsInfoClicked.f200199b, programsInfoClicked.f200200c);
        }
        if (landingInternalAction2 instanceof LandingInternalAction.ApplicationIdLoadingCompleted ? true : landingInternalAction2 instanceof LandingInternalAction.OpenAlreadyHaveApplicationDialog) {
            return InterfaceC49417c.f.f441131a;
        }
        if (landingInternalAction2 instanceof LandingInternalAction.RequestAuthorization) {
            ApiError apiError = ((LandingInternalAction.RequestAuthorization) landingInternalAction2).f200204b;
            return apiError == null ? InterfaceC49417c.b.f441127a : new InterfaceC49417c.l(com.avito.android.printable_text.b.c(R.string.landing_authorize_request, new Serializable[0]), apiError);
        }
        if (landingInternalAction2 instanceof LandingInternalAction.SubmitLoadingFailed) {
            ApiError apiError2 = ((LandingInternalAction.SubmitLoadingFailed) landingInternalAction2).f200212b;
            return new InterfaceC49417c.l(a(apiError2), apiError2);
        }
        if (landingInternalAction2 instanceof LandingInternalAction.CalculationLoadingFailed) {
            ApiError apiError3 = ((LandingInternalAction.CalculationLoadingFailed) landingInternalAction2).f200165b;
            return new InterfaceC49417c.l(a(apiError3), apiError3);
        }
        if (landingInternalAction2 instanceof LandingInternalAction.NavigateToApplication) {
            LandingInternalAction.NavigateToApplication navigateToApplication = (LandingInternalAction.NavigateToApplication) landingInternalAction2;
            return new InterfaceC49417c.g(navigateToApplication.f200180b, navigateToApplication.f200181c);
        }
        if (landingInternalAction2 instanceof LandingInternalAction.OpenApplicationClicked) {
            LandingInternalAction.OpenApplicationClicked openApplicationClicked = (LandingInternalAction.OpenApplicationClicked) landingInternalAction2;
            return new InterfaceC49417c.g(openApplicationClicked.f200194b, openApplicationClicked.f200195c);
        }
        if (landingInternalAction2 instanceof LandingInternalAction.ApplyBusinessRules) {
            return InterfaceC49417c.m.f441141a;
        }
        if (landingInternalAction2 instanceof LandingInternalAction.ScrollToOffersClicked) {
            return new InterfaceC49417c.k(((LandingInternalAction.ScrollToOffersClicked) landingInternalAction2).f200209b);
        }
        if (landingInternalAction2 instanceof LandingInternalAction.HandlePreApprovalBannerDeeplink) {
            ((LandingInternalAction.HandlePreApprovalBannerDeeplink) landingInternalAction2).getClass();
            return new InterfaceC49417c.e(null);
        }
        if (landingInternalAction2 instanceof LandingInternalAction.HandleHeaderActionDeeplink) {
            return new InterfaceC49417c.e(((LandingInternalAction.HandleHeaderActionDeeplink) landingInternalAction2).f200175b);
        }
        if (landingInternalAction2 instanceof LandingInternalAction.HandleBottomUspBannerDeeplink) {
            return new InterfaceC49417c.e(((LandingInternalAction.HandleBottomUspBannerDeeplink) landingInternalAction2).f200173b);
        }
        if (landingInternalAction2 instanceof LandingInternalAction.HandleDeeplink) {
            return new InterfaceC49417c.e(((LandingInternalAction.HandleDeeplink) landingInternalAction2).f200174b);
        }
        if (landingInternalAction2 instanceof LandingInternalAction.CollapseHeader) {
            return InterfaceC49417c.d.f441129a;
        }
        if (landingInternalAction2 instanceof LandingInternalAction.NavigateToParticipants) {
            return new InterfaceC49417c.h(((LandingInternalAction.NavigateToParticipants) landingInternalAction2).f200182b);
        }
        if (landingInternalAction2 instanceof LandingInternalAction.Close) {
            return InterfaceC49417c.C12804c.f441128a;
        }
        if (landingInternalAction2 instanceof LandingInternalAction.ApplicationCreated) {
            return new InterfaceC49417c.a(((LandingInternalAction.ApplicationCreated) landingInternalAction2).f200157b);
        }
        return null;
    }
}

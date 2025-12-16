package com.avito.android.authorization.auto_recovery.factor_unavailable_reason;

import AA.a;
import Ah.InterfaceC13032a;
import Bh.InterfaceC13146a;
import DC0.a;
import EB0.a;
import FC0.a;
import FE.a;
import HB0.a;
import MD0.a;
import NB0.a;
import UD0.a;
import VD0.a;
import android.os.Bundle;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.FactorUnavailableReasonFragment;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi.entity.FactorUnavailableReasonAction;
import com.avito.android.authorization.auto_recovery.require_tfa.RequireTfaFragment;
import com.avito.android.authorization.login.InterfaceC28677f;
import com.avito.android.authorization.login.LoginActivity;
import com.avito.android.bbl.screens.configure.BblConfigureFragment;
import com.avito.android.bbl.screens.configure.deeplink.BblConfigureSaveLink;
import com.avito.android.bbl.screens.configure.v2.BblConfigureV2Fragment;
import com.avito.android.bbl.screens.configure.v4.ui.BblConfigureV4Fragment;
import com.avito.android.checkout.CheckoutFragment;
import com.avito.android.checkout.deeplink.CheckoutPromoCodeV2DeepLink;
import com.avito.android.checkout.deeplink.CheckoutSaveV2DeepLink;
import com.avito.android.code_confirmation.code_confirmation.CodeConfirmationActivity;
import com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.employee_stub_impl.view.EmployeeStubFragment;
import com.avito.android.extended_profile_map.ExtendedProfileMapFragment;
import com.avito.android.extended_profile_map.y;
import com.avito.android.fees_methods.screen.fees_by_package.ui.FeesByPackageFragment;
import com.avito.android.lf_levels.LfLevelsFragment;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.overlay.SpinnerOverlay;
import com.avito.android.tariff.cpx.configure.advance.CpxConfigureAdvanceFragment;
import com.avito.android.tariff.cpx.configure.advance.deeplink.TariffCpxConfigureAdvanceSaveDeepLink;
import com.avito.android.tariff.cpx.configure.advance_manual.CpxConfigureAdvanceManualFragment;
import com.avito.android.tariff.cpx.configure.levels.TariffCpxConfigureLevelsFragment;
import com.avito.android.tariff.cpx.info.advance.TariffCpxInfoAdvanceDialogFragment;
import com.avito.android.tariff.cpx.level.feature.TariffCpxLevelFeatureFragment;
import com.avito.android.tariff.cpx.levels.CpxLevelsFragment;
import com.avito.android.tariff.cpx.limit.sheet.TariffCpxLimitFragment;
import com.avito.android.tariff_cpt.configure.levels.TariffCptConfigureLevelsFragment;
import com.avito.android.tariff_cpt.level_feature.TariffCptLevelFeatureFragment;
import com.avito.android.tariff_cpt.levels.TariffCptLevelsFragment;
import com.avito.android.tariff_lf_publication.count.TariffLfPublicationCountFragment;
import com.avito.android.tariff_lf_publication.level.TariffLfPublicationLevelFragment;
import com.avito.android.tariff_lf_publication.region.TariffLfPublicationRegionFragment;
import com.avito.android.verification.verification_fetch_invoice.VerificationFetchInvoiceFragment;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import kotlin.reflect.n;
import mB0.InterfaceC43942a;
import oB0.InterfaceC44620a;
import qC0.InterfaceC47279a;
import qK0.C47313c;
import sB0.c;
import wR.InterfaceC49553a;
import xo.InterfaceC49972a;
import yh.InterfaceC50249a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class d implements a.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f93110b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f93111c;

    public /* synthetic */ d(Object obj, int i12) {
        this.f93110b = i12;
        this.f93111c = obj;
    }

    @Override // com.avito.android.deeplink_handler.view.a.g
    public final void g(com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        Bundle bundle5;
        Bundle bundle6;
        z = false;
        boolean z13 = false;
        z = false;
        boolean z14 = false;
        lValueOf = null;
        lValueOf = null;
        Long lValueOf = null;
        lValueOf = null;
        lValueOf = null;
        Long lValueOf2 = null;
        Object obj = this.f93111c;
        switch (this.f93110b) {
            case 0:
                FactorUnavailableReasonFragment.a aVar2 = FactorUnavailableReasonFragment.f93079y0;
                FactorUnavailableReasonFragment factorUnavailableReasonFragment = (FactorUnavailableReasonFragment) obj;
                if (!z12) {
                    factorUnavailableReasonFragment.q5(FactorUnavailableReasonAction.b.f93152b);
                    break;
                } else {
                    factorUnavailableReasonFragment.q5(FactorUnavailableReasonAction.c.f93153b);
                    break;
                }
            case 1:
                C47313c c47313c = ((RequireTfaFragment) obj).f93306u0;
                n<Object> nVar = RequireTfaFragment.f93298x0[4];
                ((SpinnerOverlay) c47313c.a()).setVisibility(z12 ? 0 : 8);
                break;
            case 2:
                InterfaceC28677f interfaceC28677f = ((LoginActivity) obj).f93978m;
                (interfaceC28677f != null ? interfaceC28677f : null).setLoading(z12);
                break;
            case 3:
                BblConfigureFragment.a aVar3 = BblConfigureFragment.f99091E0;
                Integer numValueOf = (aVar == null || (bundle = aVar.f134522c) == null) ? null : Integer.valueOf(bundle.getInt("kty_bbl_configure_save_button_id"));
                if ((aVar != null ? aVar.f134520a : null) instanceof BblConfigureSaveLink) {
                    ((BblConfigureFragment) obj).w5().accept(new InterfaceC50249a.f(z12, numValueOf));
                    break;
                }
                break;
            case 4:
                BblConfigureV2Fragment.a aVar4 = BblConfigureV2Fragment.f99264C0;
                Integer numValueOf2 = (aVar == null || (bundle2 = aVar.f134522c) == null) ? null : Integer.valueOf(bundle2.getInt("kty_bbl_configure_save_button_id"));
                if ((aVar != null ? aVar.f134520a : null) instanceof BblConfigureSaveLink) {
                    ((BblConfigureV2Fragment) obj).w5().accept(new InterfaceC13032a.f(z12, numValueOf2));
                    break;
                }
                break;
            case 5:
                BblConfigureV4Fragment.a aVar5 = BblConfigureV4Fragment.f99514s0;
                if ((aVar != null ? aVar.f134520a : null) instanceof BblConfigureSaveLink) {
                    ((com.avito.android.bbl.screens.configure.v4.ui.f) ((BblConfigureV4Fragment) obj).f99516o0.getValue()).accept(new InterfaceC13146a.b(z12));
                    break;
                }
                break;
            case 6:
                CheckoutFragment.a aVar6 = CheckoutFragment.f118107C0;
                DeepLink deepLink = aVar != null ? aVar.f134520a : null;
                CheckoutFragment checkoutFragment = (CheckoutFragment) obj;
                if (!(deepLink instanceof CheckoutSaveV2DeepLink)) {
                    if (deepLink instanceof CheckoutPromoCodeV2DeepLink) {
                        checkoutFragment.q5().accept(new InterfaceC49972a.h(z12));
                        break;
                    }
                } else {
                    Bundle bundle7 = aVar.f134522c;
                    checkoutFragment.q5().accept(new InterfaceC49972a.j(z12, bundle7 != null ? Integer.valueOf(bundle7.getInt("checkout_button_id")) : null));
                    break;
                }
                break;
            case 7:
                CodeConfirmationPresenter codeConfirmationPresenter = ((CodeConfirmationActivity) obj).f119397m;
                (codeConfirmationPresenter != null ? codeConfirmationPresenter : null).b(z12);
                break;
            case 8:
                EmployeeStubFragment.a aVar7 = EmployeeStubFragment.f147600s0;
                ((Button) obj).setLoading(z12);
                break;
            case 9:
                ExtendedProfileMapFragment.a aVar8 = ExtendedProfileMapFragment.f151156A0;
                ((y) ((ExtendedProfileMapFragment) obj).f151158u0.getValue()).accept(new a.i(z12));
                break;
            case 10:
                FeesByPackageFragment.a aVar9 = FeesByPackageFragment.f158064s0;
                ((com.avito.android.fees_methods.screen.fees_by_package.ui.i) ((FeesByPackageFragment) obj).f158069r0.getValue()).accept(new a.c(z12));
                break;
            case 11:
                LfLevelsFragment.a aVar10 = LfLevelsFragment.f175291w0;
                ((LfLevelsFragment) obj).f5().accept(new InterfaceC49553a.e(z12));
                break;
            case 12:
                CpxConfigureAdvanceFragment.a aVar11 = CpxConfigureAdvanceFragment.f295530C0;
                if ((aVar != null ? aVar.f134520a : null) instanceof TariffCpxConfigureAdvanceSaveDeepLink) {
                    ((CpxConfigureAdvanceFragment) obj).q5().accept(new InterfaceC43942a.g(z12));
                    break;
                }
                break;
            case 13:
                CpxConfigureAdvanceManualFragment.a aVar12 = CpxConfigureAdvanceManualFragment.f295770u0;
                ((CpxConfigureAdvanceManualFragment) obj).f5().accept(new InterfaceC44620a.c(z12));
                break;
            case 14:
                TariffCpxConfigureLevelsFragment.a aVar13 = TariffCpxConfigureLevelsFragment.f296048E0;
                if (aVar != null && (bundle4 = aVar.f134522c) != null && bundle4.containsKey("cpx_configure_levels_level_card_id")) {
                    lValueOf2 = Long.valueOf(bundle4.getLong("cpx_configure_levels_level_card_id"));
                }
                if (aVar != null && (bundle3 = aVar.f134522c) != null) {
                    z14 = bundle3.getBoolean("cpx_configure_levels_next_button_clicked");
                }
                TariffCpxConfigureLevelsFragment tariffCpxConfigureLevelsFragment = (TariffCpxConfigureLevelsFragment) obj;
                if (lValueOf2 == null) {
                    if (z14) {
                        tariffCpxConfigureLevelsFragment.t5().accept(new c.d(z12));
                        break;
                    }
                } else {
                    tariffCpxConfigureLevelsFragment.t5().accept(new c.C12610c(z12, lValueOf2.longValue()));
                    break;
                }
                break;
            case 15:
                Button button = ((TariffCpxInfoAdvanceDialogFragment) obj).f296269m0;
                (button != null ? button : null).setLoading(z12);
                break;
            case 16:
                TariffCpxLevelFeatureFragment.a aVar14 = TariffCpxLevelFeatureFragment.f296924q0;
                ((com.avito.android.tariff.cpx.level.feature.c) ((TariffCpxLevelFeatureFragment) obj).f296927i0.getValue()).accept(new a.c(z12));
                break;
            case 17:
                CpxLevelsFragment.a aVar15 = CpxLevelsFragment.f297006w0;
                ((CpxLevelsFragment) obj).f5().accept(new a.e(z12));
                break;
            case 18:
                TariffCpxLimitFragment.a aVar16 = TariffCpxLimitFragment.f297225w0;
                ((TariffCpxLimitFragment) obj).f5().accept(new a.c(z12));
                break;
            case 19:
                TariffCptConfigureLevelsFragment.a aVar17 = TariffCptConfigureLevelsFragment.f297795A0;
                if (aVar != null && (bundle6 = aVar.f134522c) != null && bundle6.containsKey("cpt_configure_levels_level_card_id")) {
                    lValueOf = Long.valueOf(bundle6.getLong("cpt_configure_levels_level_card_id"));
                }
                if (aVar != null && (bundle5 = aVar.f134522c) != null) {
                    z13 = bundle5.getBoolean("cpt_configure_levels_next_button_clicked");
                }
                TariffCptConfigureLevelsFragment tariffCptConfigureLevelsFragment = (TariffCptConfigureLevelsFragment) obj;
                if (lValueOf == null) {
                    if (z13) {
                        tariffCptConfigureLevelsFragment.t5().accept(new InterfaceC47279a.f(z12));
                        break;
                    }
                } else {
                    tariffCptConfigureLevelsFragment.t5().accept(new InterfaceC47279a.d(z12, lValueOf.longValue()));
                    break;
                }
                break;
            case 20:
                TariffCptLevelFeatureFragment.a aVar18 = TariffCptLevelFeatureFragment.f298421r0;
                ((com.avito.android.tariff_cpt.level_feature.b) ((TariffCptLevelFeatureFragment) obj).f298428m0.getValue()).accept(new a.c(z12));
                break;
            case 21:
                TariffCptLevelsFragment.a aVar19 = TariffCptLevelsFragment.f298504x0;
                ((TariffCptLevelsFragment) obj).f5().accept(new a.e(z12));
                break;
            case 22:
                TariffLfPublicationCountFragment.a aVar20 = TariffLfPublicationCountFragment.f300720G0;
                ((TariffLfPublicationCountFragment) obj).q5().accept(new a.e(aVar, z12));
                break;
            case 23:
                TariffLfPublicationLevelFragment.a aVar21 = TariffLfPublicationLevelFragment.f300869s0;
                ((com.avito.android.tariff_lf_publication.level.h) ((TariffLfPublicationLevelFragment) obj).f300873q0.getValue()).accept(new a.c(z12));
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                TariffLfPublicationRegionFragment.a aVar22 = TariffLfPublicationRegionFragment.f301018A0;
                ((TariffLfPublicationRegionFragment) obj).q5().accept(new a.d(aVar, z12));
                break;
            default:
                VerificationFetchInvoiceFragment.q5((VerificationFetchInvoiceFragment) obj, aVar, z12);
                break;
        }
    }
}

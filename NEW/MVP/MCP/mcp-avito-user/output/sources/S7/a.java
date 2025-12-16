package S7;

import android.view.View;
import com.avito.android.advert.item.comfortable_deal.ExpertBlockBottomSheetDialog;
import com.avito.android.advert_stats.detail.tab.items.button.dialogs.HowUnderstandChartDialogFragment;
import com.avito.android.advert_stats.detail.tab.items.button.dialogs.MoreContactsDialogFragment;
import com.avito.android.advert_stats.detail.tab.items.button.dialogs.ResponsesDialogFragment;
import com.avito.android.anonymous_number_dialog.AnonymousNumberDialogFragment;
import com.avito.android.authorization.gorelkin.ParsingPermissionFragment;
import com.avito.android.gig_apply.ui.s;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.sbc.create.common.DiscountAlternativesBottomDialog;
import com.avito.android.sbc.create.common.SbcConfiguratorFastChipsOnboardingDialog;
import com.avito.android.user_adverts.tab_actions.info.UserAdvertsActionResultInfoFragment;
import com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator.i;
import com.avito.android.util.N0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f14822c;

    public /* synthetic */ a(d dVar, int i12) {
        this.f14821b = i12;
        this.f14822c = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d dVar = this.f14822c;
        switch (this.f14821b) {
            case 0:
                dVar.r();
                break;
            case 1:
                dVar.r();
                break;
            case 2:
                ExpertBlockBottomSheetDialog.a aVar = ExpertBlockBottomSheetDialog.f74273i0;
                dVar.dismiss();
                break;
            case 3:
                N0.a(dVar);
                break;
            case 4:
                dVar.r();
                break;
            case 5:
                dVar.cancel();
                break;
            case 6:
                dVar.cancel();
                break;
            case 7:
                dVar.dismiss();
                break;
            case 8:
                AnonymousNumberDialogFragment.a aVar2 = AnonymousNumberDialogFragment.f91267f0;
                dVar.r();
                break;
            case 9:
                ParsingPermissionFragment.a aVar3 = ParsingPermissionFragment.f93867D0;
                dVar.dismiss();
                break;
            case 10:
                ParsingPermissionFragment.a aVar4 = ParsingPermissionFragment.f93867D0;
                dVar.dismiss();
                break;
            case 11:
                dVar.dismiss();
                break;
            case 12:
                int i12 = s.f160019a0;
                dVar.dismiss();
                break;
            case 13:
                dVar.dismiss();
                break;
            case 14:
                DiscountAlternativesBottomDialog.a aVar5 = DiscountAlternativesBottomDialog.f259170h0;
                dVar.dismiss();
                break;
            case 15:
                SbcConfiguratorFastChipsOnboardingDialog.a aVar6 = SbcConfiguratorFastChipsOnboardingDialog.f259173h0;
                dVar.r();
                break;
            case 16:
                dVar.r();
                break;
            case 17:
                dVar.r();
                break;
            case 18:
                dVar.dismiss();
                break;
            case 19:
                UserAdvertsActionResultInfoFragment.a aVar7 = UserAdvertsActionResultInfoFragment.f314612n0;
                dVar.dismiss();
                break;
            case 20:
                int i13 = i.f317454d;
                dVar.dismiss();
                break;
            case 21:
                HowUnderstandChartDialogFragment.a aVar8 = HowUnderstandChartDialogFragment.f86255h0;
                dVar.dismiss();
                break;
            case 22:
                MoreContactsDialogFragment.a aVar9 = MoreContactsDialogFragment.f86256h0;
                dVar.dismiss();
                break;
            case 23:
                ResponsesDialogFragment.a aVar10 = ResponsesDialogFragment.f86257h0;
                dVar.dismiss();
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                dVar.dismiss();
                break;
            default:
                N0.a(dVar);
                break;
        }
    }
}

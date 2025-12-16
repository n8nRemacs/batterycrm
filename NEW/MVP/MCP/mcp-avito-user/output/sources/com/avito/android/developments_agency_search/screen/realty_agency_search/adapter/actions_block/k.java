package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block;

import AA.a;
import DA.a;
import Lw.InterfaceC14443a;
import QI.a;
import TI.a;
import Ux.InterfaceC15579a;
import VI.a;
import Xz.InterfaceC17066a;
import android.text.Editable;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.early_access_advert.feedback_screen.EarlyAccessAdvertFeedbackFragment;
import com.avito.android.extended_profile_map.w;
import com.avito.android.extended_profile_personal_link_edit.PersonalLinkEditFragment;
import com.avito.android.gallery.ui.PhotoGalleryActivity;
import com.avito.android.gallery.ui.adapter.GalleryFragment;
import com.avito.android.gig_apply.ui.GigApplyActivity;
import com.avito.android.help_center.L;
import com.avito.android.help_center.help_center_articles.q;
import com.avito.android.help_center.help_center_request.p;
import com.avito.android.hotel_booking.enter_data.EnterDataFragment;
import com.avito.android.hotel_booking.select_radio.SelectRadioFragment;
import com.avito.android.hotel_booking.select_single_value.SelectSingleValueFragment;
import com.avito.android.imv_cars_details.presentation.ImvCarsDetailsFragment;
import com.avito.android.imv_goods_poll.ImvGoodsPollDialog;
import com.avito.android.imv_goods_poll.ImvGoodsPollDialogSuccess;
import com.avito.android.imv_goods_poll.m;
import com.avito.android.lib.design.input.Input;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import fN.InterfaceC40319a;
import kotlin.G0;
import kotlin.reflect.n;
import pH.AbstractC46953a;
import qK0.C47313c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f138282b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f138283c;

    public /* synthetic */ k(Object obj, int i12) {
        this.f138282b = i12;
        this.f138283c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        Object obj = this.f138283c;
        switch (this.f138282b) {
            case 0:
                ((l) obj).f138286c.toggle();
                break;
            case 1:
                ((com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder.h) obj).f139021a.invoke(InterfaceC14443a.f.b.f10197a);
                break;
            case 2:
                ((com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder.j) obj).f139026a.invoke(InterfaceC14443a.C0637a.f10177a);
                break;
            case 3:
                ((com.avito.android.document_verification_status_screen.ui.f) obj).f144884c.invoke();
                break;
            case 4:
                EarlyAccessAdvertFeedbackFragment.a aVar = EarlyAccessAdvertFeedbackFragment.f145620s0;
                ((com.avito.android.early_access_advert.feedback_screen.d) ((EarlyAccessAdvertFeedbackFragment) obj).f145623o0.getValue()).accept(InterfaceC15579a.d.f16785a);
                break;
            case 5:
                Y41.a<G0> aVar2 = ((com.avito.android.edit_address.adapter.location.j) obj).f145790b;
                if (aVar2 != null) {
                    aVar2.invoke();
                    break;
                }
                break;
            case 6:
                ((com.avito.android.evidence_request.mvi.evidence_details.g) obj).f148991b.accept(InterfaceC17066a.c.f19182a);
                break;
            case 7:
                ((w) obj).f151331e.invoke(a.c.f162a);
                break;
            case 8:
                PersonalLinkEditFragment.a aVar3 = PersonalLinkEditFragment.f151444y0;
                ((PersonalLinkEditFragment) obj).r5().accept(a.b.f3075a);
                break;
            case 9:
                com.avito.android.favorites.adapter.avito_for_business_exit.e eVar = (com.avito.android.favorites.adapter.avito_for_business_exit.e) obj;
                eVar.f156521c.l2();
                eVar.f156520b.c(new MC.a());
                break;
            case 10:
                Y41.a<G0> aVar4 = ((com.avito.android.favorites.adapter.group_card.l) obj).f156588f;
                if (aVar4 != null) {
                    aVar4.invoke();
                    break;
                }
                break;
            case 11:
                com.avito.android.favorites.adapter.promo_banner_with_benefits.k kVar = (com.avito.android.favorites.adapter.promo_banner_with_benefits.k) obj;
                Y41.l<? super String, G0> lVar = kVar.f156757p;
                Input input = kVar.f156749h;
                if (lVar != null) {
                    Editable editableM53getText = input.m53getText();
                    string = editableM53getText != null ? editableM53getText.toString() : null;
                    lVar.invoke(string != null ? string : "");
                }
                input.f();
                break;
            case 12:
                com.avito.android.favorites.adapter.promo_banner_with_description.k kVar2 = (com.avito.android.favorites.adapter.promo_banner_with_description.k) obj;
                Y41.l<? super String, G0> lVar2 = kVar2.f156796m;
                Input input2 = kVar2.f156791h;
                if (lVar2 != null) {
                    Editable editableM53getText2 = input2.m53getText();
                    string = editableM53getText2 != null ? editableM53getText2.toString() : null;
                    lVar2.invoke(string != null ? string : "");
                }
                input2.f();
                break;
            case 13:
                PhotoGalleryActivity.a aVar5 = PhotoGalleryActivity.f159233u;
                ((PhotoGalleryActivity) obj).onBackPressed();
                break;
            case 14:
                GalleryFragment.b bVar = ((GalleryFragment) obj).f159253r0;
                if (bVar != null) {
                    bVar.a();
                    break;
                }
                break;
            case 15:
                int i12 = GigApplyActivity.f159825y;
                ((com.avito.android.gig_apply.mvi.l) ((GigApplyActivity) obj).f159827n.getValue()).accept(AbstractC46953a.C12258a.f428301a);
                break;
            case 16:
                ((com.avito.android.guests_selector.items.swither.g) obj).f161517b.toggle();
                break;
            case 17:
                ((L) obj).f161614b.accept(G0.f406611a);
                break;
            case 18:
                ((q) obj).f161753a.accept(G0.f406611a);
                break;
            case 19:
                ((p) obj).f161831b.accept(G0.f406611a);
                break;
            case 20:
                Y41.a<G0> aVar6 = ((com.avito.android.hotel_available_rooms.konveyor.text.h) obj).f163085d;
                if (aVar6 != null) {
                    aVar6.invoke();
                    break;
                }
                break;
            case 21:
                EnterDataFragment.a aVar7 = EnterDataFragment.f163474n0;
                ((EnterDataFragment) obj).f5().accept(a.C0896a.f13654a);
                break;
            case 22:
                Y41.a<G0> aVar8 = ((com.avito.android.hotel_booking.konveyor.checkbox.i) obj).f163645c;
                if (aVar8 != null) {
                    aVar8.invoke();
                    break;
                }
                break;
            case 23:
                Y41.a<G0> aVar9 = ((com.avito.android.hotel_booking.konveyor.select.i) obj).f163774d;
                if (aVar9 != null) {
                    aVar9.invoke();
                    break;
                }
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                SelectRadioFragment.a aVar10 = SelectRadioFragment.f163976n0;
                ((SelectRadioFragment) obj).g5().accept(a.C1055a.f15513a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                SelectSingleValueFragment.a aVar11 = SelectSingleValueFragment.f164053n0;
                ((SelectSingleValueFragment) obj).f5().accept(a.C1170a.f17048a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ImvCarsDetailsFragment.a aVar12 = ImvCarsDetailsFragment.f170012x0;
                ActivityC22955m activityC22955mL1 = ((ImvCarsDetailsFragment) obj).l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.finish();
                    break;
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ImvGoodsPollDialog.a aVar13 = ImvGoodsPollDialog.f170583s0;
                ImvGoodsPollDialog imvGoodsPollDialog = (ImvGoodsPollDialog) obj;
                m mVar = (m) imvGoodsPollDialog.f170586i0.getValue();
                C47313c c47313c = imvGoodsPollDialog.f170594q0;
                n<Object> nVar = ImvGoodsPollDialog.f170584t0[4];
                mVar.accept(new InterfaceC40319a.C11146a(((Input) c47313c.a()).getDeformattedText()));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ImvGoodsPollDialogSuccess.a aVar14 = ImvGoodsPollDialogSuccess.f170603l0;
                ((ImvGoodsPollDialogSuccess) obj).f5();
                break;
            default:
                int i13 = com.avito.android.imv_services_dialog.b.f170751T;
                ((com.avito.android.imv_services_dialog.b) obj).dismiss();
                break;
        }
    }
}

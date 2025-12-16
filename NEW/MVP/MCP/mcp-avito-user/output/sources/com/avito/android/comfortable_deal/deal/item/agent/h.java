package com.avito.android.comfortable_deal.deal.item.agent;

import Aw.InterfaceC13090a;
import HV.a;
import Iw.InterfaceC14163a;
import Ns.InterfaceC14606a;
import St.C15220a;
import Ws.InterfaceC15794a;
import Xv.InterfaceC17050a;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import bs.InterfaceC25698a;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.cpx_promo.delayedstart.CpxPromoDelayedStartFragment;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputFragment;
import com.avito.android.cpx_promo.priceinput.l;
import com.avito.android.credits.calculator.C29615b;
import com.avito.android.credits.credit_partner_screen.CreditPartnerFragment;
import com.avito.android.credits.p;
import com.avito.android.crm_candidates.features.add_note.logics.n;
import com.avito.android.crm_candidates.view.base.JobCrmAddNoteFragment;
import com.avito.android.crm_candidates.view.base.JobCrmNotesListFragment;
import com.avito.android.crm_candidates.view.ui.search_view.JobCrmCandidatesSearchView;
import com.avito.android.crm_paid_cvs.view.dialogs.SearchView;
import com.avito.android.cv_actualization.view.phone_select.ui.JsxCvActualizationPhoneSelectFragment;
import com.avito.android.cv_validation_bottom_sheet.mvi.a;
import com.avito.android.cv_validation_bottom_sheet.mvi.t;
import com.avito.android.cv_validation_bottom_sheet.ui.CvValidationBottomSheet;
import com.avito.android.cv_validation_bottom_sheet.ui.CvValidationBottomSheetOpenParams;
import com.avito.android.date_time_picker.TimePickerArguments;
import com.avito.android.date_time_picker.TimePickerDialog;
import com.avito.android.delivery_tarifikator.presentation.region_screen.TarifikatorRegionFragment;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import fq.InterfaceC40463a;
import is.InterfaceC42096a;
import kotlin.G0;
import ys.InterfaceC50286a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f121173b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f121174c;

    public /* synthetic */ h(Object obj, int i12) {
        this.f121173b = i12;
        this.f121174c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f121174c;
        switch (this.f121173b) {
            case 0:
                Y41.a<G0> aVar = ((i) obj).f121182i;
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
            case 1:
                Y41.a<G0> aVar2 = ((com.avito.android.comfortable_deal.deal.item.commenterror.h) obj).f121301b;
                if (aVar2 != null) {
                    aVar2.invoke();
                    break;
                }
                break;
            case 2:
                Y41.a<G0> aVar3 = ((com.avito.android.comfortable_deal.deal.item.responsibleagent.has_agent.g) obj).f121464f;
                if (aVar3 != null) {
                    aVar3.invoke();
                    break;
                }
                break;
            case 3:
                Y41.a<G0> aVar4 = ((com.avito.android.comfortable_deal.deal.item.seller.j) obj).f121523k;
                if (aVar4 != null) {
                    aVar4.invoke();
                    break;
                }
                break;
            case 4:
                Y41.a<G0> aVar5 = ((com.avito.android.comfortable_deal.deal.item.teammember.h) obj).f121551e;
                if (aVar5 != null) {
                    aVar5.invoke();
                    break;
                }
                break;
            case 5:
                ((com.avito.android.comfortable_deal.stages_transition.d) obj).f122820c.invoke(InterfaceC40463a.g.f396135a);
                break;
            case 6:
                ((com.avito.android.comfortable_deal.submitting.recycler.items.selectItem.g) obj).f123249d.callOnClick();
                break;
            case 7:
                Y41.a<G0> aVar6 = ((com.avito.android.component.advert_badge_bar.title.g) obj).f125017c;
                if (aVar6 != null) {
                    aVar6.invoke();
                    break;
                }
                break;
            case 8:
                ((ContactBar.InfoStickyBlock.InstallmentsActionText) obj).f125122f.invoke();
                break;
            case 9:
                CpxPromoDelayedStartFragment.b bVar = CpxPromoDelayedStartFragment.f126813r0;
                ((com.avito.android.cpx_promo.delayedstart.e) ((CpxPromoDelayedStartFragment) obj).f126815o0.getValue()).accept(InterfaceC25698a.b.f57494a);
                break;
            case 10:
                CpxPromoPriceInputFragment.a aVar7 = CpxPromoPriceInputFragment.f127271s0;
                ((l) ((CpxPromoPriceInputFragment) obj).f127273i0.getValue()).accept(InterfaceC42096a.b.f405315a);
                break;
            case 11:
                int i12 = C29615b.f128664x;
                p pVar = ((C29615b) obj).f128709k;
                if (pVar != null) {
                    pVar.lc();
                    break;
                }
                break;
            case 12:
                CreditPartnerFragment.a aVar8 = CreditPartnerFragment.f128738H0;
                ((CreditPartnerFragment) obj).E5().accept(InterfaceC50286a.d.f443527a);
                break;
            case 13:
                JobCrmAddNoteFragment.a aVar9 = JobCrmAddNoteFragment.f129775v0;
                JobCrmAddNoteFragment jobCrmAddNoteFragment = (JobCrmAddNoteFragment) obj;
                n nVar = (n) jobCrmAddNoteFragment.f129782t0.getValue();
                Input input = jobCrmAddNoteFragment.f129778p0;
                nVar.accept(new InterfaceC14606a.c((input != null ? input : null).getDeformattedText()));
                break;
            case 14:
                JobCrmNotesListFragment.a aVar10 = JobCrmNotesListFragment.f129877u0;
                ((com.avito.android.crm_candidates.features.notes_list.logics.n) ((JobCrmNotesListFragment) obj).f129879o0.getValue()).accept(new InterfaceC15794a.C1287a(null));
                break;
            case 15:
                Input.t(((JobCrmCandidatesSearchView) obj).f130279b, "", false, 6);
                break;
            case 16:
                ((com.avito.android.crm_paid_cvs.render.a) obj).f130664j.invoke();
                break;
            case 17:
                Input.t(((SearchView) obj).f130779b, "", false, 6);
                break;
            case 18:
                JsxCvActualizationPhoneSelectFragment.a aVar11 = JsxCvActualizationPhoneSelectFragment.f131373y0;
                ((com.avito.android.cv_actualization.view.e) ((JsxCvActualizationPhoneSelectFragment) obj).f131382u0.getValue()).finish();
                break;
            case 19:
                CvValidationBottomSheet.a aVar12 = CvValidationBottomSheet.f131925r0;
                CvValidationBottomSheet cvValidationBottomSheet = (CvValidationBottomSheet) obj;
                ((t) cvValidationBottomSheet.f131932m0.getValue()).accept(a.C3949a.f131870a);
                InterfaceC28373a interfaceC28373a = cvValidationBottomSheet.f131927h0;
                if (interfaceC28373a == null) {
                    interfaceC28373a = null;
                }
                String strValueOf = String.valueOf(((CvValidationBottomSheetOpenParams) cvValidationBottomSheet.f131933n0.getValue(cvValidationBottomSheet, CvValidationBottomSheet.f131926s0[0])).f131951h);
                com.avito.android.analytics.provider.a aVar13 = cvValidationBottomSheet.f131928i0;
                interfaceC28373a.c(new C15220a(strValueOf, (aVar13 != null ? aVar13 : null).a()));
                break;
            case 20:
                Y41.a<G0> aVar14 = ((com.avito.android.cyclic_gallery_widget.image_carousel.native_video.f) obj).f132063g;
                if (aVar14 != null) {
                    aVar14.invoke();
                    break;
                }
                break;
            case 21:
                Y41.a<G0> aVar15 = ((com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.h) obj).f132148l;
                if (aVar15 != null) {
                    aVar15.invoke();
                    break;
                }
                break;
            case 22:
                com.avito.android.date_time_picker.a aVar16 = (com.avito.android.date_time_picker.a) obj;
                aVar16.f132655F.invoke(Long.valueOf(aVar16.f132656G.getTimeInMillis()));
                aVar16.r();
                break;
            case 23:
                TimePickerDialog timePickerDialog = (TimePickerDialog) obj;
                TimePickerArguments timePickerArguments = timePickerDialog.f132615E;
                org.threeten.bp.f fVarS = timePickerArguments.f132609f.R(timePickerDialog.f132620J).S(timePickerDialog.f132621K);
                TimePickerArguments timePickerArguments2 = timePickerDialog.f132615E;
                if (!timePickerArguments2.f132612i.G3(timePickerArguments2.f132609f, timePickerDialog.f132620J, timePickerDialog.f132621K)) {
                    int iOrdinal = timePickerArguments.f132608e.ordinal();
                    if (iOrdinal != 0 && iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            ToastBarState toastBarState = new ToastBarState(com.avito.android.printable_text.b.f(timePickerDialog.f132623M), null, ToastBarPosition.f181044b, null, null, null, null, 0, false, false, null, null, 4090, null);
                            Button button = timePickerDialog.f132624N;
                            if (button == null) {
                                button = null;
                            }
                            Context context = button.getContext();
                            Button button2 = timePickerDialog.f132624N;
                            Button button3 = button2 != null ? button2 : null;
                            a.C0407a c0407a = HV.a.f7100w;
                            int iJ2 = C35835l0.j(R.attr.toastBarError, context);
                            c0407a.getClass();
                            IV.a.d(button3, toastBarState, a.C0407a.b(iJ2, context));
                            break;
                        }
                    } else {
                        TextView textView = timePickerDialog.f132626P;
                        if (textView == null) {
                            textView = null;
                        }
                        D6.H(textView);
                        TextView textView2 = timePickerDialog.f132626P;
                        (textView2 != null ? textView2 : null).setText(timePickerDialog.f132623M);
                        break;
                    }
                } else {
                    timePickerDialog.f132616F.accept(fVarS);
                    timePickerDialog.r();
                    break;
                }
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs.e eVar = ((com.avito.android.delivery_tarifikator.presentation.konveyor.item.customtariffs.k) obj).f135384g;
                if (eVar != null) {
                    eVar.z1();
                    break;
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                TarifikatorRegionFragment.a aVar17 = TarifikatorRegionFragment.f135744D0;
                ((TarifikatorRegionFragment) obj).r5().accept(InterfaceC17050a.h.f19141a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.c) obj).f137185a.invoke(InterfaceC13090a.C0028a.f695a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((com.avito.android.developments_agency_search.screen.deal_room.edit_client.a) obj).f137533H.invoke();
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((com.avito.android.developments_agency_search.screen.deal_room.notes.a) obj).f137801G.invoke();
                break;
            default:
                ((com.avito.android.developments_agency_search.screen.location_group.i) obj).f138120b.invoke(InterfaceC14163a.C0493a.f8608a);
                break;
        }
    }
}

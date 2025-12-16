package com.avito.android.crm_candidates.view.dialogs;

import Ca1.ViewOnClickListenerC13236c;
import Ev.InterfaceC13531b;
import Y41.l;
import Zz.InterfaceC19624a;
import android.content.ClipData;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.os.C22777e;
import com.avito.android.R;
import com.avito.android.crm_candidates.view.list_items.chips_filter.j;
import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import com.avito.android.crm_paid_cvs.dto.OptionItem;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.CvListState;
import com.avito.android.cv_actualization.view.phone_select.ui.items.phone.JsxCvActualizationPhoneSelectPhoneItem;
import com.avito.android.cv_validation_bottom_sheet.list.CvItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.delivery_combined_buttons_public.BuyButton;
import com.avito.android.delivery_combined_buttons_public.CartButton;
import com.avito.android.delivery_combined_buttons_public.CombinedButtonType;
import com.avito.android.document_verification_status_screen.models.ButtonAction;
import com.avito.android.employee_stub_impl.view.EmployeeStubFragment;
import com.avito.android.employee_stub_public.EmployeeStubData;
import com.avito.android.esia_redirect_screen.buttons_list.link_item.EsiaRedirectButtonsLinkItem;
import com.avito.android.esia_redirect_screen.buttons_list.primary_item.EsiaRedirectButtonsPrimaryItem;
import com.avito.android.esia_redirect_screen.buttons_list.secondary_item.EsiaRedirectButtonsSecondaryItem;
import com.avito.android.evidence_request.details.files.view.g;
import com.avito.android.evidence_request.mvi.evidence_details.adapter.files.i;
import com.avito.android.evidence_request.reasons.ProofTypesFragment;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.photo_list_view.G;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.remote.model.ConsultationFormData;
import com.avito.android.remote.model.DealConfirmationSheet;
import com.avito.android.remote.model.ExtendedProfilePhone;
import com.avito.android.remote.model.LandingInfo;
import com.avito.android.util.D6;
import com.avito.android.util.L4;
import com.google.android.material.internal.CheckableImageButton;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.Serializable;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f129985b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f129986c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f129987d;

    public /* synthetic */ f(int i12, Object obj, Object obj2) {
        this.f129985b = i12;
        this.f129986c = obj;
        this.f129987d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v27, types: [com.avito.android.developments_advice.ConsultationFormActivity] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.avito.android.deep_linking.links.DeepLink] */
    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r4v17, types: [android.app.Dialog, com.avito.android.lib.design.bottom_sheet.d, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i12 = 0;
        ?? r32 = this.f129986c;
        Object obj = this.f129987d;
        switch (this.f129985b) {
            case 0:
                int i13 = g.f129988E;
                Y41.a aVar = (Y41.a) r32;
                if (aVar != null) {
                    aVar.invoke();
                }
                ((g) obj).r();
                break;
            case 1:
                int i14 = j.f130099e;
                ((l) r32).invoke((JobCrmListFilterItem) obj);
                break;
            case 2:
                ((com.avito.android.crm_paid_cvs.render.a) r32).f130666l.invoke(((CvListState) obj).f130494b);
                break;
            case 3:
                com.avito.android.crm_paid_cvs.view.dialogs.e eVar = (com.avito.android.crm_paid_cvs.view.dialogs.e) r32;
                eVar.f130808G = true;
                ((l) obj).invoke(eVar.f130807F.getDeformattedText());
                eVar.dismiss();
                break;
            case 4:
                int i15 = com.avito.android.crm_paid_cvs.view.dialogs.e.f130805I;
                ((CheckableImageButton) obj).setChecked(!r4.f356716b);
                ((Y41.a) r32).invoke();
                break;
            case 5:
                int i16 = com.avito.android.crm_paid_cvs.view.list_items.chips_filter.j.f130823e;
                ((l) r32).invoke((OptionItem) obj);
                break;
            case 6:
                int i17 = com.avito.android.cv_actualization.view.phone_select.ui.items.phone.a.f131444c;
                ((l) r32).invoke(((JsxCvActualizationPhoneSelectPhoneItem) obj).f131442b);
                break;
            case 7:
                int i18 = com.avito.android.cv_validation_bottom_sheet.list.f.f131865f;
                ((l) r32).invoke((CvItem) obj);
                break;
            case 8:
                ((N) r32).invoke(((DealConfirmationSheet.Button) obj).getDeepLink());
                break;
            case 9:
                r32.invoke(new InterfaceC13531b.C0266b(((BuyButton) obj).f134929b, C22777e.b(new Q("combinedButtonType", CombinedButtonType.f134950b))));
                break;
            case 10:
                r32.invoke(new InterfaceC13531b.C0266b(((CartButton.GoToCartButton) obj).f134949g, C22777e.b(new Q("combinedButtonType", CombinedButtonType.f134951c))));
                break;
            case 11:
                int i19 = com.avito.android.delivery_tarifikator.presentation.konveyor.item.regioninfo.i.f135397e;
                ((com.avito.android.delivery_tarifikator.presentation.konveyor.item.regioninfo.d) r32).R4(((com.avito.android.delivery_tarifikator.presentation.konveyor.item.regioninfo.c) obj).f135391c);
                break;
            case 12:
                Resources resources = ((View) obj).getResources();
                com.avito.android.developments_advice.j jVar = (com.avito.android.developments_advice.j) r32;
                if (jVar.f136121t.size() > 1) {
                    com.avito.android.lib.design.bottom_sheet.d dVar = jVar.f136122u;
                    if (dVar != null) {
                        dVar.dismiss();
                    }
                    ?? dVar2 = new com.avito.android.lib.design.bottom_sheet.d(jVar.f136104c.getContext(), i12, 2, );
                    LinearLayout linearLayout = new LinearLayout(dVar2.getContext());
                    linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    linearLayout.setOrientation(1);
                    int i22 = jVar.f136123v;
                    D6.f(linearLayout, i22, 0, i22, i22, 2);
                    for (String str2 : jVar.f136121t) {
                        ListItem listItem = new ListItem(linearLayout.getRootView().getContext(), null);
                        StringBuilder sb2 = new StringBuilder("+7 ");
                        L4 l42 = jVar.f136103b;
                        if (str2 == null) {
                            l42.getClass();
                            str = "";
                        } else {
                            str = l42.b(0, str2).f318924a;
                        }
                        sb2.append(str);
                        listItem.setTitle(sb2.toString());
                        listItem.setOnClickListener(new ViewOnClickListenerC13236c(jVar, str2, (Object) dVar2, 25));
                        linearLayout.addView(listItem);
                    }
                    dVar2.G(linearLayout, true);
                    com.avito.android.lib.design.bottom_sheet.d.M(dVar2, resources.getString(R.string.consultation_form_phone_picker), true, true, 2);
                    com.avito.android.lib.design.bottom_sheet.d.I(dVar2, true);
                    com.avito.android.lib.util.g.a(dVar2);
                    jVar.f136122u = dVar2;
                    break;
                }
                break;
            case 13:
                ConsultationFormData consultationFormData = (ConsultationFormData) r32;
                LandingInfo landing = consultationFormData.getLanding();
                if ((landing != null ? landing.getMainTextLinkUrl() : null) != null) {
                    LandingInfo landing2 = consultationFormData.getLanding();
                    ((com.avito.android.developments_advice.j) obj).f136102a.b2(landing2 != null ? landing2.getMainTextLinkUrl() : 0);
                    break;
                }
                break;
            case 14:
                int i23 = com.avito.android.developments_agency_search.screen.deal_room.notes.a.f137798H;
                ((com.avito.android.developments_agency_search.screen.deal_room.notes.a) obj).f137800F.invoke(((Input) r32).getDeformattedText());
                break;
            case 15:
                com.avito.android.document_verification_status_screen.ui.f fVar = (com.avito.android.document_verification_status_screen.ui.f) r32;
                fVar.f144883b.invoke((ButtonAction) obj, fVar.f144893l);
                break;
            case 16:
                EmployeeStubFragment employeeStubFragment = (EmployeeStubFragment) r32;
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = employeeStubFragment.f147601n0;
                com.avito.android.deeplink_handler.handler.composite.b.a(aVar2 != null ? aVar2 : null, ((EmployeeStubData.FromDeeplink) obj).f147622g);
                employeeStubFragment.requireActivity().finish();
                break;
            case 17:
                int i24 = com.avito.android.esia_redirect_screen.buttons_list.link_item.c.f147943c;
                ((l) r32).invoke((EsiaRedirectButtonsLinkItem) obj);
                break;
            case 18:
                int i25 = com.avito.android.esia_redirect_screen.buttons_list.primary_item.c.f147954c;
                ((l) r32).invoke((EsiaRedirectButtonsPrimaryItem) obj);
                break;
            case 19:
                int i26 = com.avito.android.esia_redirect_screen.buttons_list.secondary_item.c.f147965c;
                ((l) r32).invoke((EsiaRedirectButtonsSecondaryItem) obj);
                break;
            case 20:
                int i27 = g.a.f148477d;
                ((g.a) r32).f218106b.B(((InterfaceC33208b) obj).getF218092a(), null);
                break;
            case 21:
                int i28 = g.b.f148479k;
                ((g.b) r32).f218106b.o(((InterfaceC33208b) obj).getF218092a());
                break;
            case 22:
                int i29 = g.b.f148479k;
                ((g.b) r32).f218106b.f(((G) obj).f218068a);
                break;
            case 23:
                int i32 = i.a.f148788d;
                ((i.a) r32).f218106b.B(((InterfaceC33208b) obj).getF218092a(), null);
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                int i33 = i.b.f148790j;
                ((i.b) r32).f218106b.o(((InterfaceC33208b) obj).getF218092a());
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int i34 = i.b.f148790j;
                ((i.b) r32).f218106b.f(((G) obj).f218068a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((com.avito.android.evidence_request.mvi.proof_types.c) r32).f149172b.accept(new InterfaceC19624a.b((String) obj));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                com.avito.android.evidence_request.reasons.c cVar = ((ProofTypesFragment) r32).f149194q0;
                (cVar != null ? cVar : null).oa((String) obj);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((com.avito.android.extended_profile_map.bottom_sheet.f) r32).f151190c.invoke((DeepLink) obj);
                break;
            default:
                int i35 = com.avito.android.extended_profile_phone_dialog.b.f151557H;
                String formattedPhone = ((ExtendedProfilePhone) obj).getFormattedPhone();
                com.avito.android.extended_profile_phone_dialog.b bVar = (com.avito.android.extended_profile_phone_dialog.b) r32;
                bVar.f151559F.getClass();
                bVar.f151558E.setPrimaryClip(ClipData.newPlainText(null, formattedPhone));
                com.avito.android.component.toast.c.d(com.avito.android.component.toast.c.f125244a, bVar, com.avito.android.printable_text.b.c(R.string.phone_dialog_copied_message, new Serializable[0]), null, null, 0, ToastBarPosition.f181046d, 958);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ f(l lVar, DealConfirmationSheet.Button button) {
        this.f129985b = 8;
        this.f129986c = (N) lVar;
        this.f129987d = button;
    }

    public /* synthetic */ f(CheckableImageButton checkableImageButton, Y41.a aVar) {
        this.f129985b = 4;
        this.f129987d = checkableImageButton;
        this.f129986c = aVar;
    }
}

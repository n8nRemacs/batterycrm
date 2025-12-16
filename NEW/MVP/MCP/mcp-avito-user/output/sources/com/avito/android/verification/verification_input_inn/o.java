package com.avito.android.verification.verification_input_inn;

import B91.D;
import B91.G;
import Ba1.z;
import YM0.a;
import ZO0.b;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import androidx.appcompat.app.l;
import androidx.view.C22984Q;
import androidx.view.N0;
import com.avito.android.R;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert_core.development_offers.carousel_bottomsheet.DevelopmentOffersBottomSheetDialog;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorites.i1;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.ConsultationFormData;
import com.avito.android.remote.model.DevelopmentOffer;
import com.avito.android.remote.model.DevelopmentOffers;
import com.avito.android.remote.model.SimpleAdvertAction;
import com.avito.android.remote.model.advert_details.realty.DevelopmentsAdvice;
import com.avito.android.remote.model.advert_details.realty.DevelopmentsAdviceKt;
import com.avito.android.remote.model.advert_details.realty.DevelopmentsAdviceView;
import com.avito.android.visual_rubricator.I;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem;
import com.avito.android.work_profile.domain.entity.Employer;
import com.avito.android.work_profile.profile.applies.ui.items.applies_banner.AppliesBannerItem;
import com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy.VacancyInfo;
import com.avito.android.work_profile.profile.gig.ui.list.banner_item.GigBannerItem;
import com.avito.android.work_profile.profile.gig.ui.list.button_item.GigButtonItem;
import com.google.android.material.snackbar.Snackbar;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.my.target.E;
import e11.P;
import h11.InterfaceC40761a;
import hy.C41191c;
import hy.DialogC41189a;
import ia1.C41373a;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import ku0.InterfaceC43499a;
import ru.cyberity.cbr.camera.photo.presentation.b;
import ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel;
import ru.cyberity.cbr.core.presentation.support.CBRSupportFragment;
import ru.cyberity.cbr.core.presentation.support.CBRSupportViewModel;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataFileFieldView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f325632b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f325633c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f325634d;

    public /* synthetic */ o(int i12, Object obj, Object obj2) {
        this.f325632b = i12;
        this.f325633c = obj;
        this.f325634d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Resources.NotFoundException {
        DevelopmentsAdvice developmentsAdvice;
        DevelopmentsAdviceView form;
        int i12 = 0;
        ConsultationFormData consultationFormData = null;
        Object obj = this.f325634d;
        Object obj2 = this.f325633c;
        switch (this.f325632b) {
            case 0:
                ((p) obj2).f325635a.A3(((k) obj).f325625b);
                return;
            case 1:
                ((Y41.l) obj2).invoke(new a.b(((com.avito.android.verification.verification_status_list.n) obj).f325826d.f442450h));
                return;
            case 2:
                int i13 = com.avito.android.video_picker.ui.item.video_card.g.f325993g;
                ((Y41.l) obj2).invoke((Uri) obj);
                return;
            case 3:
                I i14 = ((com.avito.android.visual_rubricator.element.j) obj2).f327401b;
                if (i14 != null) {
                    i14.k((VisualRubricatorWidgetElementItem) obj, null);
                    return;
                }
                return;
            case 4:
                ((com.avito.android.wallet.page.mvi.g) obj2).f328215c.invoke(new b.a(((ZO0.c) obj).f20129d));
                return;
            case 5:
                ((com.avito.android.wallet.page.mvi.g) obj2).f328215c.invoke(new b.g(((ZO0.l) obj).f20157b));
                return;
            case 6:
                Y41.l<? super NP0.f, G0> lVar = ((com.avito.android.widget_filters.ui.items.guests.m) obj2).f330463v;
                if (lVar != null) {
                    lVar.invoke((NP0.f) obj);
                    return;
                }
                return;
            case 7:
                int i15 = com.avito.android.work_profile.profile.applies.ui.items.applies_banner.g.f330943g;
                DeepLink deepLink = ((AppliesBannerItem) obj2).f330934f.f330936c;
                if (deepLink != null) {
                    ((Y41.l) obj).invoke(deepLink);
                    return;
                }
                return;
            case 8:
                int i16 = com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy.l.f330979q;
                ((Y41.l) obj2).invoke(((VacancyInfo) obj).f330964g);
                return;
            case 9:
                int i17 = com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy.l.f330979q;
                ((Y41.l) obj2).invoke(((Employer) obj).getUri());
                return;
            case 10:
                int i18 = com.avito.android.work_profile.profile.gig.ui.list.banner_item.e.f331186e;
                ((Y41.l) obj2).invoke(((GigBannerItem) obj).f331178e);
                return;
            case 11:
                int i19 = com.avito.android.work_profile.profile.gig.ui.list.button_item.c.f331214j;
                ((Y41.l) obj2).invoke(((GigButtonItem) obj).f331192d);
                return;
            case 12:
                int[] iArr = Snackbar.f357318E;
                Snackbar snackbar = (Snackbar) obj2;
                snackbar.getClass();
                ((View.OnClickListener) obj).onClick(view);
                snackbar.b(1);
                return;
            case 13:
                InterfaceC40761a.InterfaceC11238a interfaceC11238a = ((E) obj2).f364370g.get();
                if (interfaceC11238a == null) {
                    return;
                }
                interfaceC11238a.a((h11.b) obj);
                return;
            case 14:
                com.my.target.G0 g02 = (com.my.target.G0) obj2;
                g02.getClass();
                g02.f364396b.f((P) obj, null, view.getContext());
                return;
            case 15:
                int i22 = DialogC41189a.f398312E;
                ArrayList arrayList = new ArrayList();
                C41191c c41191c = (C41191c) obj2;
                Boolean[] boolArr = c41191c.f398317e;
                int length = boolArr.length;
                int i23 = 0;
                while (i12 < length) {
                    int i24 = i23 + 1;
                    if (boolArr[i12].booleanValue()) {
                        arrayList.add(Integer.valueOf(i23));
                    }
                    i12++;
                    i23 = i24;
                }
                c41191c.f398315c.invoke(arrayList);
                ((DialogC41189a) obj).dismiss();
                return;
            case 16:
                D d12 = (D) obj2;
                d12.f1013c.enableLoader();
                d12.f1014d.setEnabled(false);
                ru.mts.biometry.sdk.feature.recognition.ui.error.c cVar = (ru.mts.biometry.sdk.feature.recognition.ui.error.c) obj;
                C43259k.d(C22984Q.a(cVar), C43262l0.f411947c, null, new C41373a(cVar, null), 2);
                return;
            case 17:
                D d13 = (D) obj2;
                d13.f1013c.enableLoader();
                d13.f1014d.setEnabled(false);
                ru.mts.biometry.sdk.feature.recognition.ui.error.e eVar = (ru.mts.biometry.sdk.feature.recognition.ui.error.e) obj;
                C43259k.d(C22984Q.a(eVar), C43262l0.f411947c, null, new ia1.b(eVar, null), 2);
                return;
            case 18:
                D d14 = (D) obj2;
                d14.f1013c.enableLoader();
                d14.f1014d.setEnabled(false);
                ru.mts.biometry.sdk.feature.recognition.ui.error.g gVar = (ru.mts.biometry.sdk.feature.recognition.ui.error.g) obj;
                C43259k.d(C22984Q.a(gVar), C43262l0.f411947c, null, new ia1.c(gVar, null), 2);
                return;
            case 19:
                kotlin.reflect.n[] nVarArr = ru.mts.biometry.sdk.feature.recognition.ui.intro.e.f436502i0;
                z.a((ru.mts.biometry.sdk.feature.recognition.ui.intro.e) obj2, (String[]) ((E91.g) obj).f3849d.toArray(new String[0]));
                return;
            case 20:
                kotlin.reflect.n[] nVarArr2 = ru.mts.biometry.sdk.feature.recognition.ui.intro.e.f436502i0;
                ((G) obj2).f1035c.enableLoader();
                kotlin.reflect.n nVar = ru.mts.biometry.sdk.feature.recognition.ui.intro.e.f436502i0[0];
                ru.mts.biometry.sdk.feature.recognition.ui.intro.e eVar2 = (ru.mts.biometry.sdk.feature.recognition.ui.intro.e) obj;
                ja1.f fVar = (ja1.f) eVar2.f436503h0.a(eVar2);
                C43259k.d(N0.a(fVar), C43262l0.f411947c, null, new ja1.e(fVar, null), 2);
                return;
            case 21:
                long jCurrentTimeMillis = System.currentTimeMillis();
                l0.g gVar2 = (l0.g) obj2;
                if (jCurrentTimeMillis - gVar2.f406841b >= 300) {
                    gVar2.f406841b = jCurrentTimeMillis;
                    ((InterfaceC43499a) obj).onClick();
                    return;
                }
                return;
            case 22:
                ((Y41.a) obj2).invoke();
                ((com.avito.android.lib.design.toast_bar.k) obj).f();
                return;
            case 23:
                DevelopmentOffersBottomSheetDialog developmentOffersBottomSheetDialog = (DevelopmentOffersBottomSheetDialog) obj2;
                DevelopmentOffers developmentOffers = developmentOffersBottomSheetDialog.f83315g0;
                if (developmentOffers.getShouldShowDevelopmentsAdvice()) {
                    DevelopmentOffer developmentOffer = (DevelopmentOffer) obj;
                    boolean zIsMoznoteka = developmentOffer.isMoznoteka();
                    Z0 z02 = developmentOffersBottomSheetDialog.f83314f0;
                    if (zIsMoznoteka && developmentOffers.getBrandspaceButtonUri() != null) {
                        if (z02 != null) {
                            SimpleAdvertAction brandspaceButtonUri = developmentOffers.getBrandspaceButtonUri();
                            if (brandspaceButtonUri == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            z02.u(brandspaceButtonUri, "item_button");
                            return;
                        }
                        return;
                    }
                    if (z02 != null) {
                        Integer id2 = developmentOffer.getId();
                        AdvertDetails advertDetails = z02.f72294C;
                        if (advertDetails != null && (developmentsAdvice = advertDetails.getDevelopmentsAdvice()) != null && (form = developmentsAdvice.getForm()) != null) {
                            consultationFormData = DevelopmentsAdviceKt.toConsultationFormData(form, developmentOffersBottomSheetDialog.f83319k0);
                        }
                        String str = z02.f72297b;
                        z02.D(str, id2, consultationFormData, "consultation_discounts");
                        com.avito.android.advert_core.analytics.a aVar = z02.f72293B;
                        if (aVar != null) {
                            aVar.I6(str, "item_discounts");
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                com.avito.android.lib.util.g.a(new l.a(((ru.avito.component.payments.method.d) obj2).f430390b.getContext(), R.style.Theme_Avito_Dialog_Alert).setTitle(R.string.bonuses).setMessage((String) obj).setPositiveButton(R.string.close, new i1(3)).create());
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((ru.avito.component.serp.job.a) obj2).f430463d.accept((AdvertAction) obj);
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ru.cyberity.cbr.camera.photo.presentation.a.a((ru.cyberity.cbr.camera.photo.presentation.a) obj2, (b.C12420b) obj, view);
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ru.cyberity.cbr.core.presentation.screen.verification.a.a((ru.cyberity.cbr.core.presentation.screen.verification.a) obj2, (CBRVerificationStepViewModel.e.c) obj, view);
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                CBRSupportFragment.m282handleState$lambda2$lambda1((CBRSupportViewModel.SupportItem) obj2, (CBRSupportFragment) obj, view);
                return;
            default:
                CBRApplicantDataFileFieldView.m303populateViewItems$lambda7$lambda6$lambda5((CBRApplicantDataFileFieldView) obj2, (CBRApplicantDataFileFieldView.Attachment) obj, view);
                return;
        }
    }
}

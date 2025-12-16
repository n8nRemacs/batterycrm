package com.avito.android.cpt.pre_activation.ui;

import JI.a;
import RI.b;
import Xr.InterfaceC17040a;
import Xz.InterfaceC17066a;
import Y41.l;
import androidx.compose.runtime.InterfaceC22204y1;
import c60.InterfaceC26947a;
import com.avito.android.credits.calculator.q;
import com.avito.android.credits.p;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.details_sheet.DetailsSheetActivity;
import com.avito.android.edit_text_field.C30336l;
import com.avito.android.favorites.adapter.promo_banner_with_benefits.k;
import com.avito.android.lf_levels.LfLevelsFragment;
import com.avito.android.loyalty.ui.badge_details_v3.BadgeDetailsV3DialogFragment;
import com.avito.android.loyalty.ui.criteria.CriteriaActivity;
import com.avito.android.loyalty.ui.criteria_gray.CriteriaGrayActivity;
import com.avito.android.loyalty.ui.quality_service.EffectDetailsActivity;
import com.avito.android.loyalty.ui.quality_service.QualityServiceActivity;
import com.avito.android.loyalty.ui.quality_service_gray.QualityServiceGrayActivity;
import com.avito.android.messenger.map.viewing.A;
import com.avito.android.passport.profile_add.create_flow.verification_popup.VerificationPopupFragment;
import com.avito.android.passport.profile_add.merge.code_request.CodeRequestFragment;
import com.avito.android.passport.profile_add.merge.profile_to_convert.ProfileToConvertFragment;
import com.avito.android.util.V2;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import e60.InterfaceC39956a;
import f10.InterfaceC40199a;
import fX.InterfaceC40353a;
import iX.InterfaceC41355a;
import kX.InterfaceC42640a;
import kotlin.G0;
import pX.InterfaceC47025a;
import rX.InterfaceC47607a;
import wR.InterfaceC49553a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class c implements w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f126763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f126764c;

    public /* synthetic */ c(Object obj, int i12) {
        this.f126763b = i12;
        this.f126764c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.deep_linking.links.w
    public final void i7(DeepLink deepLink) {
        p pVar;
        int i12 = 2;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object obj = this.f126764c;
        switch (this.f126763b) {
            case 0:
                ((l) ((InterfaceC22204y1) obj).getF42167b()).invoke(new InterfaceC17040a.d(deepLink));
                break;
            case 1:
                int i13 = q.f128699p;
                if (!(deepLink instanceof NoMatchLink) && (pVar = ((q) obj).f128709k) != null) {
                    pVar.b4(deepLink);
                    break;
                }
                break;
            case 2:
                com.avito.android.deeplink_handler.handler.composite.a aVar = ((DetailsSheetActivity) obj).f135925q;
                if (aVar == null) {
                    aVar = null;
                }
                b.a.a(aVar, deepLink, null, null, 6);
                break;
            case 3:
                b.a.a(((C30336l) obj).f147004f, deepLink, null, null, 6);
                break;
            case 4:
                ((com.avito.android.evidence_request.details.headerDescription.d) obj).f148529b.accept(deepLink);
                break;
            case 5:
                ((com.avito.android.evidence_request.details.params.disclaimer.d) obj).f148551b.accept(deepLink);
                break;
            case 6:
                ((com.avito.android.evidence_request.mvi.evidence_details.adapter.disclaimer.d) obj).f148767b.invoke(new InterfaceC17066a.d(deepLink));
                break;
            case 7:
                ((com.avito.android.evidence_request.mvi.evidence_details.adapter.headerDescription.d) obj).f148808b.invoke(new InterfaceC17066a.d(deepLink));
                break;
            case 8:
                l<? super DeepLink, G0> lVar = ((k) obj).f156759r;
                if (lVar != null) {
                    lVar.invoke(deepLink);
                    break;
                }
                break;
            case 9:
                l<? super DeepLink, G0> lVar2 = ((com.avito.android.favorites.adapter.promo_banner_with_description.k) obj).f156798o;
                if (lVar2 != null) {
                    lVar2.invoke(deepLink);
                    break;
                }
                break;
            case 10:
                ((com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.disclaimer.e) obj).f158349b.invoke(deepLink);
                break;
            case 11:
                ((com.avito.android.hotel_available_rooms.konveyor.booking.e) obj).f162865b.invoke(new a.d(deepLink));
                break;
            case 12:
                l<? super DeepLink, G0> lVar3 = ((com.avito.android.hotel_available_rooms.konveyor.text.h) obj).f163084c;
                if (lVar3 != null) {
                    lVar3.invoke(deepLink);
                    break;
                }
                break;
            case 13:
                ((com.avito.android.hotel_booking.konveyor.offer.d) obj).f163720b.invoke(new b.f(deepLink, objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0));
                break;
            case 14:
                ((com.avito.android.hotel_booking.konveyor.radiogroup.h) obj).f163742b.invoke(new b.f(deepLink, str, i12, objArr3 == true ? 1 : 0));
                break;
            case 15:
                LfLevelsFragment.a aVar2 = LfLevelsFragment.f175291w0;
                ((LfLevelsFragment) obj).f5().accept(new InterfaceC49553a.c(deepLink));
                break;
            case 16:
                BadgeDetailsV3DialogFragment.a aVar3 = BadgeDetailsV3DialogFragment.f183265n0;
                ((com.avito.android.loyalty.ui.badge_details_v3.j) ((BadgeDetailsV3DialogFragment) obj).f183267i0.getValue()).accept(new InterfaceC40353a.b(deepLink));
                break;
            case 17:
                int i14 = CriteriaActivity.f183403x;
                ((com.avito.android.loyalty.ui.criteria.j) ((CriteriaActivity) obj).f183405n.getValue()).accept(new InterfaceC41355a.c(deepLink));
                break;
            case 18:
                int i15 = CriteriaGrayActivity.f183562w;
                ((CriteriaGrayActivity) obj).a2().accept(new InterfaceC42640a.c(deepLink));
                break;
            case 19:
                com.avito.android.deeplink_handler.handler.composite.a aVar4 = ((EffectDetailsActivity) obj).f183769o;
                if (aVar4 == null) {
                    aVar4 = null;
                }
                b.a.a(aVar4, deepLink, null, null, 6);
                break;
            case 20:
                com.avito.android.deeplink_handler.handler.composite.a aVar5 = ((com.avito.android.loyalty.ui.quality_service.d) obj).f183800H;
                if (aVar5 == null) {
                    aVar5 = null;
                }
                b.a.a(aVar5, deepLink, null, null, 6);
                break;
            case 21:
                int i16 = QualityServiceActivity.f183777s;
                ((QualityServiceActivity) obj).a2().accept(new InterfaceC47025a.C12276a(deepLink));
                break;
            case 22:
                int i17 = QualityServiceGrayActivity.f184032w;
                ((com.avito.android.loyalty.ui.quality_service_gray.h) ((QualityServiceGrayActivity) obj).f184034n.getValue()).accept(new InterfaceC47607a.b(deepLink));
                break;
            case 23:
                if (!(deepLink instanceof NoMatchLink)) {
                    A a12 = (A) obj;
                    V2.f318762a.i(a12.f207131E, "onDeepLinkClick(" + deepLink + "):\n\t valid Deeplink", null);
                    b.a.a(a12.f196771Z, deepLink, null, null, 6);
                    break;
                }
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                ((com.avito.android.mortgage.root.list.items.borrower_title.e) obj).f202485b.invoke(new InterfaceC40199a.C40214p(deepLink));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((com.avito.android.mortgage.root.list.items.title.d) obj).f202887b.invoke(new InterfaceC40199a.C40214p(deepLink));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                com.avito.android.deeplink_handler.handler.composite.a aVar6 = ((VerificationPopupFragment) obj).f212211p0;
                if (aVar6 == null) {
                    aVar6 = null;
                }
                b.a.a(aVar6, deepLink, null, null, 6);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                CodeRequestFragment.a aVar7 = CodeRequestFragment.f212821B0;
                ((CodeRequestFragment) obj).r5().accept(new InterfaceC26947a.C2030a(deepLink));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ProfileToConvertFragment.a aVar8 = ProfileToConvertFragment.f213078w0;
                ((ProfileToConvertFragment) obj).q5().accept(new InterfaceC39956a.b(deepLink));
                break;
            default:
                com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position.a aVar9 = ((com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position.g) obj).f221083l;
                if (aVar9 != null) {
                    aVar9.f221060f.invoke(deepLink);
                    break;
                }
                break;
        }
    }
}

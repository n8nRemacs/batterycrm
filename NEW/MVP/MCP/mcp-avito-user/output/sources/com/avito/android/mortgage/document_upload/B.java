package com.avito.android.mortgage.document_upload;

import NM0.a;
import UD0.a;
import c90.InterfaceC26960a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.safety.safety_settings.mvi.entity.a;
import com.avito.android.serp.adapter.header.HeaderWidget;
import com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment;
import com.avito.android.tariff.cpx.configure.landing.CpxConfigureLandingFragment;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import gB0.InterfaceC40566a;
import mD0.InterfaceC43949a;
import oC0.InterfaceC44623a;
import qB0.InterfaceC47272c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class B implements com.avito.android.deep_linking.links.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f199020b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l f199021c;

    public /* synthetic */ B(int i12, Y41.l lVar) {
        this.f199020b = i12;
        this.f199021c = lVar;
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(DeepLink deepLink) {
        Y41.l lVar = this.f199021c;
        switch (this.f199020b) {
            case 0:
                lVar.invoke(deepLink);
                break;
            case 1:
                int i12 = com.avito.android.mortgage.landing.list.items.steps.e.f199983g;
                lVar.invoke(deepLink);
                break;
            case 2:
                int i13 = com.avito.android.passport.profile_list_item.s.f213664c;
                lVar.invoke(deepLink);
                break;
            case 3:
                lVar.invoke(new InterfaceC26960a.d(deepLink));
                break;
            case 4:
                lVar.invoke(new InterfaceC26960a.d(deepLink));
                break;
            case 5:
                lVar.invoke(new InterfaceC26960a.d(deepLink));
                break;
            case 6:
                int i14 = com.avito.android.publish.items.location_addresses.k.f237016j;
                lVar.invoke(deepLink);
                break;
            case 7:
                int i15 = com.avito.android.publish.slots.check_verification.item.i.f243194i;
                lVar.invoke(deepLink);
                break;
            case 8:
                int i16 = com.avito.android.rating_ui.reviews.review.p.f250364J;
                lVar.invoke(deepLink);
                break;
            case 9:
                lVar.invoke(a.m.a(deepLink));
                break;
            case 10:
                lVar.invoke(a.m.a(deepLink));
                break;
            case 11:
                int i17 = HeaderWidget.f270133f;
                lVar.invoke(deepLink);
                break;
            case 12:
                lVar.invoke(deepLink);
                break;
            case 13:
                lVar.invoke(deepLink);
                break;
            case 14:
                CprConfigureAdvanceFragment.a aVar = CprConfigureAdvanceFragment.f295152C0;
                lVar.invoke(new InterfaceC40566a.b(deepLink));
                break;
            case 15:
                CpxConfigureLandingFragment.a aVar2 = CpxConfigureLandingFragment.f295861E0;
                lVar.invoke(new InterfaceC47272c.e(deepLink));
                break;
            case 16:
                lVar.invoke(deepLink);
                break;
            case 17:
                lVar.invoke(new InterfaceC44623a.b(deepLink));
                break;
            case 18:
                lVar.invoke(new InterfaceC44623a.b(deepLink));
                break;
            case 19:
                lVar.invoke(new InterfaceC44623a.b(deepLink));
                break;
            case 20:
                int i18 = com.avito.android.tariff_cpt.info.ui.items.card.h.f298282f;
                lVar.invoke(deepLink);
                break;
            case 21:
                int i19 = com.avito.android.tariff_cpt.info.ui.items.card.h.f298282f;
                lVar.invoke(deepLink);
                break;
            case 22:
                int i22 = com.avito.android.tariff_cpt.info.ui.items.card.h.f298282f;
                lVar.invoke(deepLink);
                break;
            case 23:
                lVar.invoke(new InterfaceC43949a.c(deepLink));
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                lVar.invoke(new a.b(deepLink));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lVar.invoke(new a.b(deepLink));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i23 = com.avito.android.travel_bnpl_calculator.b.f301653a;
                if (lVar != null) {
                    lVar.invoke(deepLink);
                    break;
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i24 = com.avito.android.travel_payment_methods.items.payment_method.p.f302525h;
                lVar.invoke(deepLink);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lVar.invoke(deepLink);
                break;
            default:
                lVar.invoke(new a.C0730a(deepLink));
                break;
        }
    }
}

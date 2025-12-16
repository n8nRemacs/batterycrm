package com.avito.android.advert.item.consultation;

import Nd.InterfaceC14561a;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.os.C22777e;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert.item.ownership_discrepancy.AdvertDetailsOwnershipDiscrepancyBottomSheet;
import com.avito.android.advert.notes.v;
import com.avito.android.auction.offer.AuctionOfferFragment;
import com.avito.android.authorization.auth.AuthFragment;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.FactorUnavailableReasonFragment;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi.entity.FactorUnavailableReasonAction;
import com.avito.android.authorization.duplicate_pd.DuplicatePdActivity;
import com.avito.android.authorization.duplicate_pd.DuplicatePdArgs;
import com.avito.android.authorization.duplicate_pd.DuplicatePdHelpFragment;
import com.avito.android.authorization.duplicate_pd.DuplicatePdInfoFragment;
import com.avito.android.autoteka.presentation.choosingPurchase.AutotekaFullscreenChoosingPurchaseActivity;
import com.avito.android.autoteka.presentation.directPurchase.AutotekaDirectPurchaseActivity;
import com.avito.android.autoteka.presentation.landing.AutotekaLandingFragment;
import com.avito.android.autoteka.presentation.payment.AutotekaPaymentActivity;
import com.avito.android.autoteka.presentation.report.AutotekaReportActivity;
import com.avito.android.cyclic_gallery_widget.image_carousel.i;
import com.avito.android.developments_advice.remote.model.CallInterval;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.photo_gallery.adapter.q;
import com.avito.android.photo_gallery.ui.PhotoGallery;
import com.avito.android.photo_gallery.ui.PhotoGallery2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.K2;
import com.avito.android.util.L5;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import l6.InterfaceC43549a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class B implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f74637b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f74638c;

    public /* synthetic */ B(Object obj, int i12) {
        this.f74637b = i12;
        this.f74638c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String asSoonAsPossibleTitle;
        int i12 = 2;
        C42822w c42822w = null;
        int i13 = 0;
        Object obj = this.f74638c;
        switch (this.f74637b) {
            case 0:
                int i14 = D.f74656l;
                D d12 = (D) obj;
                View view2 = d12.f74657b;
                com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(view2.getContext(), i13, i12, c42822w);
                dVar.D(R.layout.advert_details_consultation_time_interval_picker, true);
                com.avito.android.lib.design.bottom_sheet.d.M(dVar, ((CallInterval) C42745f0.E(d12.f74665j)).getDayTitle(), true, true, 2);
                com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
                LinearLayout linearLayout = (LinearLayout) dVar.findViewById(R.id.container);
                int i15 = 0;
                for (Object obj2 : d12.f74665j) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    CallInterval callInterval = (CallInterval) obj2;
                    ListItemCheckmark listItemCheckmark = new ListItemCheckmark(view2.getContext(), null);
                    if (callInterval.getAsSoonAsPossible()) {
                        asSoonAsPossibleTitle = callInterval.getAsSoonAsPossibleTitle();
                        if (asSoonAsPossibleTitle == null) {
                            asSoonAsPossibleTitle = "";
                        }
                    } else {
                        asSoonAsPossibleTitle = callInterval.getFrom() + (char) 8211 + callInterval.getTo();
                    }
                    listItemCheckmark.setTitle(asSoonAsPossibleTitle);
                    if (callInterval.f136192b) {
                        listItemCheckmark.setChecked(true);
                    }
                    listItemCheckmark.setOnClickListener(new C(d12, i15, dVar, i13));
                    linearLayout.addView(listItemCheckmark);
                    i15 = i16;
                }
                com.avito.android.lib.util.g.a(dVar);
                return;
            case 1:
                int i17 = S.f74691B;
                S s5 = (S) obj;
                View view3 = s5.f74693b;
                com.avito.android.lib.design.bottom_sheet.d dVar2 = new com.avito.android.lib.design.bottom_sheet.d(view3.getContext(), i13, i12, c42822w);
                dVar2.D(R.layout.advert_details_consultation_time_interval_picker_super, true);
                com.avito.android.lib.design.bottom_sheet.d.M(dVar2, ((CallInterval) C42745f0.E(s5.f74716y)).getDayTitle(), true, true, 2);
                com.avito.android.lib.design.bottom_sheet.d.I(dVar2, true);
                LinearLayout linearLayout2 = (LinearLayout) dVar2.findViewById(R.id.container);
                for (Object obj3 : s5.f74716y) {
                    int i18 = i13 + 1;
                    if (i13 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    CallInterval callInterval2 = (CallInterval) obj3;
                    ListItemCheckmark listItemCheckmark2 = new ListItemCheckmark(view3.getContext(), null);
                    listItemCheckmark2.setTitle(T.b(callInterval2));
                    if (callInterval2.f136192b) {
                        listItemCheckmark2.setChecked(true);
                    }
                    listItemCheckmark2.setOnClickListener(new C(s5, i13, dVar2, z ? 1 : 0));
                    linearLayout2.addView(listItemCheckmark2);
                    i13 = i18;
                }
                com.avito.android.lib.util.g.a(dVar2);
                return;
            case 2:
                Y41.a<G0> aVar = ((com.avito.android.advert.item.early_access_fakedoor.konveyor.h) obj).f75314e;
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
            case 3:
                Y41.a<G0> aVar2 = ((com.avito.android.advert.item.mortgage_snippet.h) obj).f77710g;
                if (aVar2 != null) {
                    aVar2.invoke();
                    return;
                }
                return;
            case 4:
                AdvertDetailsOwnershipDiscrepancyBottomSheet.a aVar3 = AdvertDetailsOwnershipDiscrepancyBottomSheet.f78072s0;
                ((com.avito.android.advert.item.ownership_discrepancy.d) ((AdvertDetailsOwnershipDiscrepancyBottomSheet) obj).f78075i0.getValue()).accept(InterfaceC43549a.C11774a.f413524a);
                return;
            case 5:
                com.avito.android.advert.item.realty_imv.h hVar = (com.avito.android.advert.item.realty_imv.h) obj;
                com.avito.android.advert.item.realty_imv.d dVar3 = hVar.f78346q;
                if (dVar3 != null) {
                    dVar3.f78327a.f78329b.L2(dVar3.f78328b.f78318g);
                }
                hVar.f78341l.setVisibility(8);
                hVar.f78344o.setVisibility(8);
                hVar.f78345p.setVisibility(0);
                return;
            case 6:
                com.avito.android.advert.item.safedeal.trust_factors.discount_voucher.f fVar = (com.avito.android.advert.item.safedeal.trust_factors.discount_voucher.f) obj;
                fVar.f79124h.setVisibility(4);
                fVar.f79125i.setVisibility(0);
                int i19 = Build.VERSION.SDK_INT;
                FrameLayout frameLayout = fVar.f79123g;
                if (i19 >= 30) {
                    frameLayout.performHapticFeedback(12);
                }
                Y41.a<G0> aVar4 = fVar.f79126j;
                if (aVar4 != null) {
                    aVar4.invoke();
                }
                frameLayout.setOnClickListener(null);
                return;
            case 7:
                ((com.avito.android.advert.item.scroll_up.d) obj).f79333b.c2();
                return;
            case 8:
                ((com.avito.android.advert.notes.y) obj).f80952b.accept(new v.a());
                return;
            case 9:
                com.avito.android.advert_core.advert.o oVar = (com.avito.android.advert_core.advert.o) obj;
                if (oVar != null) {
                    oVar.H1();
                    return;
                }
                return;
            case 10:
                com.avito.android.advert_core.development_offers.b bVar = (com.avito.android.advert_core.development_offers.b) obj;
                Z0 z02 = bVar.f83297d;
                if (z02 != null) {
                    z02.u(bVar.f83300g, "item_karusel");
                    return;
                }
                return;
            case 11:
                com.avito.android.advert_details_items.photogallery.o oVar2 = (com.avito.android.advert_details_items.photogallery.o) obj;
                PhotoGallery photoGallery = oVar2.f85094c;
                if (photoGallery.getCurrentItem() instanceof q.h) {
                    com.avito.android.advert_details_items.photogallery.k kVar = oVar2.f85095d;
                    if (kVar != null) {
                        kVar.Y(photoGallery.getPager().getCurrentItem());
                        return;
                    }
                    return;
                }
                if (!(photoGallery.getCurrentItem() instanceof q.c ? C35835l0.o(photoGallery.getContext()) : true)) {
                    L5.a(view.getContext(), R.string.advert_core_network_unavailable_message, 0);
                    return;
                }
                com.avito.android.advert_details_items.photogallery.k kVar2 = oVar2.f85095d;
                if (kVar2 != null) {
                    kVar2.V(photoGallery.getPager().getCurrentItem(), false);
                    return;
                }
                return;
            case 12:
                com.avito.android.advert_details_items.photogallery.p pVar = (com.avito.android.advert_details_items.photogallery.p) obj;
                PhotoGallery2 photoGallery2 = pVar.f85100c;
                com.avito.android.photo_gallery.adapter.q currentItem = photoGallery2.getCurrentItem();
                if (currentItem instanceof q.h) {
                    com.avito.android.advert_details_items.photogallery.k kVar3 = pVar.f85102e;
                    if (kVar3 != null) {
                        kVar3.Y(photoGallery2.getPager().getCurrentItem());
                        return;
                    }
                    return;
                }
                if (!(currentItem instanceof q.c ? C35835l0.o(photoGallery2.getContext()) : true)) {
                    L5.a(view.getContext(), R.string.advert_core_network_unavailable_message, 0);
                    return;
                }
                com.avito.android.advert_details_items.photogallery.k kVar4 = pVar.f85102e;
                if (kVar4 != null) {
                    kVar4.V(photoGallery2.getPager().getCurrentItem(), false);
                    return;
                }
                return;
            case 13:
                ((com.avito.android.advertising.adapter.items.buzzoola.premium.juristic.e) obj).f87420c.accept(new i.e(-1));
                return;
            case 14:
                ((com.avito.android.advertising.adapter.items.buzzoola.premium.legal.e) obj).f87436c.accept(new i.e(-1));
                return;
            case 15:
                ((com.avito.android.advertising.adapter.items.buzzoola.premium_v2.title.f) obj).f87501c.accept(new i.e(-1));
                return;
            case 16:
                ((com.avito.android.ai_assistant.adapter.repeat_button.f) obj).f88847b.onClick();
                return;
            case 17:
                com.avito.android.lib.design.input.a aVar5 = ((com.avito.android.ai_assistant.screens.chat.q) obj).f89489j;
                aVar5.requestFocus();
                K2.i(aVar5);
                return;
            case 18:
                ((com.avito.android.auction.details.o) obj).f92385h.accept(G0.f406611a);
                return;
            case 19:
                AuctionOfferFragment.a aVar6 = AuctionOfferFragment.f92425x0;
                ((AuctionOfferFragment) obj).q5().accept(InterfaceC14561a.g.f11623a);
                return;
            case 20:
                AuthFragment.a aVar7 = AuthFragment.f92815O0;
                AuthFragment authFragment = (AuthFragment) obj;
                authFragment.requireActivity().finish();
                authFragment.requireActivity().setResult(0);
                return;
            case 21:
                FactorUnavailableReasonFragment.a aVar8 = FactorUnavailableReasonFragment.f93079y0;
                ((FactorUnavailableReasonFragment) obj).q5(FactorUnavailableReasonAction.a.f93151b);
                return;
            case 22:
                DuplicatePdInfoFragment.a aVar9 = DuplicatePdInfoFragment.f93822n0;
                DuplicatePdActivity duplicatePdActivity = (DuplicatePdActivity) ((DuplicatePdInfoFragment) obj).requireActivity();
                Intent intent = duplicatePdActivity.getIntent();
                Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key_duplicate_pd_activity_args", DuplicatePdArgs.class) : intent.getParcelableExtra("key_duplicate_pd_activity_args");
                DuplicatePdHelpFragment.f93816n0.getClass();
                DuplicatePdHelpFragment duplicatePdHelpFragment = new DuplicatePdHelpFragment();
                duplicatePdHelpFragment.setArguments(C22777e.b(new kotlin.Q("key_pd_help_args", (DuplicatePdArgs) parcelableExtra)));
                androidx.fragment.app.H hE2 = duplicatePdActivity.getSupportFragmentManager().e();
                hE2.n(R.id.fragment_container, duplicatePdHelpFragment, null);
                hE2.c(null);
                hE2.e();
                return;
            case 23:
                ((com.avito.android.authorization.login.Q) obj).f93993c.accept(G0.f406611a);
                return;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                ((com.avito.android.authorization.upgrade_password.E) obj).f94751c.accept(G0.f406611a);
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int i22 = AutotekaFullscreenChoosingPurchaseActivity.f97091y;
                ((AutotekaFullscreenChoosingPurchaseActivity) obj).finish();
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i23 = AutotekaDirectPurchaseActivity.f97272r;
                ((AutotekaDirectPurchaseActivity) obj).finish();
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                AutotekaLandingFragment.a aVar10 = AutotekaLandingFragment.f97301I0;
                ActivityC22955m activityC22955mL1 = ((AutotekaLandingFragment) obj).l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.finish();
                    return;
                }
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                AutotekaPaymentActivity.a aVar11 = AutotekaPaymentActivity.f97386y;
                ((AutotekaPaymentActivity) obj).finish();
                return;
            default:
                int i24 = AutotekaReportActivity.f97671y;
                ((AutotekaReportActivity) obj).finish();
                return;
        }
    }
}

package com.avito.android.advert.closed;

import Y41.l;
import Y41.p;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.L;
import com.avito.android.M;
import com.avito.android.advert.closed.ClosedAdvertFragment;
import com.avito.android.advert.item.ClosedAdvertArguments;
import com.avito.android.advert.item.autoteka.teaser.m;
import com.avito.android.advert.item.autoteka.teaser_v3.j;
import com.avito.android.advert.item.autoteka_select.teaser.h;
import com.avito.android.advert.item.autoteka_select.teaser.i;
import com.avito.android.advert.item.comfortable_deal.k;
import com.avito.android.advert.item.compatibility.v3.r;
import com.avito.android.advert.item.consultation.C28108n;
import com.avito.android.advert.item.consultation.D;
import com.avito.android.advert.item.consultation.O;
import com.avito.android.advert.item.consultation.S;
import com.avito.android.advert.item.cv_phone_actualization.AdvertCvPhoneActualizationAction;
import com.avito.android.advert.item.developer.button.g;
import com.avito.android.advert.item.fair_price.model.AdvertFairPriceModel;
import com.avito.android.advert.item.icebreakers.o;
import com.avito.android.advert.item.spare_parts.data.CarCompatibility;
import com.avito.android.advert.item.spare_parts.data.SparePartsGroup;
import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.autoteka.model.AutotekaChoosingPurchaseButtonParams;
import com.avito.android.avito_for_business.AvitoForBusinessMainBxContentTabData;
import com.avito.android.bottom_navigation.C28885g;
import com.avito.android.bottom_navigation.N;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.developments_advice.remote.model.CallInterval;
import com.avito.android.home.bottom_navigation.BottomNavigationFragment;
import com.avito.android.home.bottom_navigation.n;
import com.avito.android.hotel.model.HotelActionButton;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.delivery_suggests.DeliverySuggests;
import com.avito.android.remote.model.AdditionalSellerAdditionalButton;
import com.avito.android.remote.model.ExpertBlock;
import com.avito.android.remote.model.advert_details.realty.IncomingLineButton;
import com.avito.android.remote.model.auto_select.SelectButtonParams;
import com.avito.android.remote.model.autotekateaser.AutotekaReportLink;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.autotekateaser.StandaloneAutotekaLink;
import com.avito.android.remote.model.cv.CvMotivationBanner;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.G0;
import rg.C47652a;
import x4.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f68840b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f68841c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f68842d;

    public /* synthetic */ b(int i12, Object obj, Object obj2) {
        this.f68840b = i12;
        this.f68841c = obj;
        this.f68842d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r4v27, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BottomNavigationSpace bottomNavigationSpace;
        DeepLink deepLink;
        c.a aVar;
        Editable editableM53getText;
        String string;
        Editable editableM53getText2;
        String string2;
        String str = "";
        Object obj = null;
        Object obj2 = this.f68842d;
        Object obj3 = this.f68841c;
        switch (this.f68840b) {
            case 0:
                ClosedAdvertFragment.a aVar2 = ClosedAdvertFragment.f68834x0;
                ClosedAdvertFragment closedAdvertFragment = (ClosedAdvertFragment) obj3;
                ActivityC22955m activityC22955mL1 = closedAdvertFragment.l1();
                if (activityC22955mL1 == null) {
                    return;
                }
                ClosedAdvertArguments closedAdvertArguments = (ClosedAdvertArguments) obj2;
                if (closedAdvertArguments == null || (bottomNavigationSpace = closedAdvertArguments.f71603c) == null) {
                    bottomNavigationSpace = BottomNavigationSpace.f107065b;
                }
                int iOrdinal = bottomNavigationSpace.ordinal();
                if (iOrdinal == 0) {
                    if (activityC22955mL1 instanceof ClosedAdvertActivity) {
                        activityC22955mL1.finish();
                    } else {
                        closedAdvertFragment.r5();
                    }
                    M m12 = closedAdvertFragment.f68835t0;
                    if (m12 == null) {
                        m12 = null;
                    }
                    closedAdvertFragment.startActivity(L.a.a(m12, null, 3));
                    return;
                }
                if (iOrdinal != 1) {
                    return;
                }
                if (!(activityC22955mL1 instanceof ClosedAdvertActivity)) {
                    C47652a c47652a = closedAdvertFragment.f68837v0;
                    N n12 = new N(new AvitoForBusinessMainBxContentTabData((c47652a != null ? c47652a : 0).b()));
                    C28885g c28885g = ((BottomNavigationFragment) closedAdvertFragment.y5()).f162252H0;
                    if (c28885g != null) {
                        ((n) BottomNavigationFragment.this.requireActivity()).s0(n12);
                        return;
                    }
                    return;
                }
                activityC22955mL1.finish();
                C47652a c47652a2 = closedAdvertFragment.f68837v0;
                if (c47652a2 == null) {
                    c47652a2 = null;
                }
                ItemsSearchLink itemsSearchLinkC = c47652a2.c();
                com.avito.android.deeplink_handler.handler.composite.a aVar3 = closedAdvertFragment.f68836u0;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                b.a.a(aVar3, itemsSearchLinkC, null, null, 6);
                return;
            case 1:
                ((com.avito.android.advert.item.additionalSeller.n) obj3).f72602b.m1(((AdditionalSellerAdditionalButton) obj2).getDetails());
                return;
            case 2:
                c.a aVar4 = ((m) obj3).f73044h;
                if (aVar4 != null) {
                    aVar4.h0(((StandaloneAutotekaLink) obj2).getLink().getUrl());
                    return;
                }
                return;
            case 3:
                c.a aVar5 = ((m) obj3).f73044h;
                if (aVar5 != null) {
                    aVar5.g0(FromBlock.f96087g, (AutotekaReportLink) obj2);
                    return;
                }
                return;
            case 4:
                c.a aVar6 = ((m) obj3).f73044h;
                if (aVar6 != null) {
                    FromBlock fromBlock = FromBlock.f96083c;
                    aVar6.i0((DeepLink) obj2);
                    return;
                }
                return;
            case 5:
                int i12 = j.f73138l;
                ((l) obj3).invoke(((AutotekaChoosingPurchaseButtonParams) obj2).f97068b);
                return;
            case 6:
                int i13 = j.f73138l;
                ((l) obj3).invoke(((AutotekaTeaserResult) obj2).getReportLink().getUrl());
                return;
            case 7:
                c.a aVar7 = ((h) obj3).f73170g;
                if (aVar7 != null) {
                    aVar7.h0(((StandaloneAutotekaLink) obj2).getLink().getUrl());
                    return;
                }
                return;
            case 8:
                c.a aVar8 = ((h) obj3).f73170g;
                if (aVar8 != null) {
                    aVar8.g0(FromBlock.f96091k, (AutotekaReportLink) obj2);
                    return;
                }
                return;
            case 9:
                SelectButtonParams selectButtonParams = (SelectButtonParams) obj3;
                if (selectButtonParams == null || (deepLink = selectButtonParams.getDeepLink()) == null || (aVar = ((i) obj2).f80529c) == null) {
                    return;
                }
                aVar.Y(deepLink);
                return;
            case 10:
                int i14 = k.f74307m;
                DeepLink deepLink2 = ((ExpertBlock) obj3).getDeepLink();
                if (deepLink2 != null) {
                    ((l) obj2).invoke(deepLink2);
                    return;
                }
                return;
            case 11:
                int i15 = r.f74498u;
                b.a.a(((r) obj3).f74503d, ((CarCompatibility.Button) obj2).f80412c, null, null, 6);
                return;
            case 12:
                int i16 = com.avito.android.advert.item.compatibility.v3.item.brand_compatibility.i.f74432f;
                ((com.avito.android.advert.item.compatibility.v3.b) obj3).h(new com.avito.android.advert.item.compatibility.v3.a((SparePartsGroup) obj2, false, 2, c47652a));
                return;
            case 13:
                ((l) obj3).invoke(((C28108n) obj2).f74786e);
                return;
            case 14:
                int i17 = C28108n.f74782g;
                IncomingLineButton incomingLineButton = (IncomingLineButton) obj2;
                ((l) obj3).invoke(incomingLineButton != null ? incomingLineButton.getUri() : null);
                return;
            case 15:
                D d12 = (D) obj3;
                Input input = d12.f74662g;
                if (input.getDeformattedText().length() == 0) {
                    Input.f179303W.getClass();
                    input.setState(Input.f179305b0);
                    return;
                }
                Input input2 = d12.f74664i;
                if (input2 != null && (editableM53getText = input2.m53getText()) != null && (string = editableM53getText.toString()) != null) {
                    str = string;
                }
                String str2 = d12.f74666k;
                String deformattedText = input.getDeformattedText();
                for (Object obj4 : d12.f74665j) {
                    if (((CallInterval) obj4).f136192b) {
                        ((Y41.r) obj2).invoke(str2, deformattedText, obj4, str);
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 16:
                l lVar = (l) obj3;
                if (lVar != null) {
                    lVar.invoke(((O) obj2).f74686b);
                    return;
                } else {
                    int i18 = O.f74685c;
                    return;
                }
            case 17:
                S s5 = (S) obj3;
                Input input3 = s5.f74699h;
                if (input3.getDeformattedText().length() == 0) {
                    Input.f179303W.getClass();
                    input3.setState(Input.f179305b0);
                    return;
                }
                String str3 = s5.f74692A;
                String deformattedText2 = input3.getDeformattedText();
                Iterator<T> it = s5.f74716y.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((CallInterval) next).f136192b) {
                            obj = next;
                        }
                    }
                }
                Input input4 = s5.f74705n;
                if (input4 != null && (editableM53getText2 = input4.m53getText()) != null && (string2 = editableM53getText2.toString()) != null) {
                    str = string2;
                }
                ((Y41.r) obj2).invoke(str3, deformattedText2, obj, str);
                return;
            case 18:
                com.avito.android.advert.item.consultation.secondary.h hVar = (com.avito.android.advert.item.consultation.secondary.h) obj3;
                Input input5 = hVar.f74820h;
                if (input5.getDeformattedText().length() != 0) {
                    ((p) obj2).invoke(hVar.f74825m, input5.getDeformattedText());
                    return;
                } else {
                    Input.f179303W.getClass();
                    input5.setState(Input.f179305b0);
                    return;
                }
            case 19:
                int i19 = com.avito.android.advert.item.cv_motivation_banner.i.f75018i;
                b.a.a(((com.avito.android.advert.item.cv_motivation_banner.i) obj3).f75019b, ((CvMotivationBanner) obj2).getDeepLink(), null, null, 6);
                return;
            case 20:
                int i22 = com.avito.android.advert.item.cv_phone_actualization.i.f75049e;
                ((l) obj3).invoke((AdvertCvPhoneActualizationAction) obj2);
                return;
            case 21:
                int i23 = com.avito.android.advert.item.delivery_suggests.m.f75120l;
                if (Build.VERSION.SDK_INT >= 30) {
                    view.performHapticFeedback(16);
                }
                DeliverySuggests.Item item = (DeliverySuggests.Item) obj2;
                DeepLink deepLinkF = item.getOnTapDeepLink();
                DeliverySuggests.Item.SelectionSettings selectionSettingsH = item.getSelectionSettings();
                ((kotlin.jvm.internal.N) obj3).invoke(deepLinkF, selectionSettingsH != null ? selectionSettingsH.getId() : null);
                return;
            case 22:
                ((g) obj3).f75177b.K1((DeepLink) obj2);
                return;
            case 23:
                ((com.avito.android.advert.item.developer.trust.g) obj3).f75195b.T0((DeepLink) obj2);
                return;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                ((l) obj3).invoke(((AdvertFairPriceModel.Explanation.ActionButton) obj2).f75410d);
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                l<? super HotelActionButton, G0> lVar2 = ((com.avito.android.advert.item.hotel.hotel_offer.floating_view.i) obj3).f75999g;
                if (lVar2 != null) {
                    lVar2.invoke((HotelActionButton) obj2);
                    return;
                }
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                l<? super HotelActionButton, G0> lVar3 = ((com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.r) obj3).f76150B;
                if (lVar3 != null) {
                    lVar3.invoke((HotelActionButton) obj2);
                    return;
                }
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Editable editableM53getText3 = ((o) obj3).f76498e.m53getText();
                if (editableM53getText3 == null || editableM53getText3.length() <= 0) {
                    return;
                }
                ((Y41.a) obj2).invoke();
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Editable editableM53getText4 = ((com.avito.android.advert.item.icebreakers_redesign.m) obj3).f76560d.m53getText();
                if (editableM53getText4 == null || editableM53getText4.length() <= 0) {
                    return;
                }
                ((Y41.a) obj2).invoke();
                return;
            default:
                com.avito.android.advert.item.leadauto.o oVar = (com.avito.android.advert.item.leadauto.o) obj3;
                Input input6 = oVar.f77306c;
                if (input6.getDeformattedText().length() != 0 && oVar.o30()) {
                    Input.f179303W.getClass();
                    input6.setState(Input.f179304a0);
                } else {
                    Input.f179303W.getClass();
                    input6.setState(Input.f179305b0);
                }
                ((Y41.a) obj2).invoke();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(com.avito.android.advert.item.delivery_suggests.m mVar, p pVar, DeliverySuggests.Item item) {
        this.f68840b = 21;
        this.f68841c = (kotlin.jvm.internal.N) pVar;
        this.f68842d = item;
    }
}

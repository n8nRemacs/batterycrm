package com.avito.android.search.filter.adapter.select;

import Hs0.InterfaceC14030a;
import Iq0.C14144a;
import Mq0.InterfaceC14521a;
import Oq0.d;
import android.os.Bundle;
import android.view.View;
import com.avito.android.analytics.event.BannerEvent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.AdviceDetail;
import com.avito.android.remote.model.BuyWithDeliveryButton;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.cv.CvDisplayAction;
import com.avito.android.remote.model.developer_profile.DeveloperProfile;
import com.avito.android.remote.model.gallery.GalleryHeaderWidget;
import com.avito.android.remote.model.promo.PromoHeaderWidget;
import com.avito.android.search_view.Toolbar23SearchView;
import com.avito.android.section.horizontal.button.HorizontalSectionButtonItem;
import com.avito.android.select.bottom_sheet.blueprints.r;
import com.avito.android.seller_coach.hints_dialog.item.hint.d;
import com.avito.android.serp.adapter.action_promo_banner.ActionPromoBannerItem;
import com.avito.android.serp.adapter.floating_promo_widget.FloatingPromoWidgetItem;
import com.avito.android.serp.adapter.gallery.j;
import com.avito.android.serp.adapter.reformulations.ReformulationElement;
import com.avito.android.serp.adapter.resizable_service_widget.row.item.ResizableServiceWidgetRowListItem;
import com.avito.android.serp.adapter.serp_advert_card.B;
import com.avito.android.serp.adapter.serp_advert_card.s;
import com.avito.android.serp.adapter.vertical_main.cv.cv_creation.CvCreationItemAction;
import com.avito.android.serp.adapter.vertical_main.mini_search_widget.MiniSearchWidgetRecentSearches;
import com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.SellerItem;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepState;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderState;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import it0.InterfaceC42106a;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;
import js0.d;
import jt0.InterfaceC42425a;
import kotlin.G0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import rn0.InterfaceC47691c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f262587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f262588c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f262589d;

    public /* synthetic */ m(int i12, Object obj, Object obj2) {
        this.f262587b = i12;
        this.f262588c = obj;
        this.f262589d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v41, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r6v1, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r6v21, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r6v23, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r6v4, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r6v5, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r6v6, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Bundle bundle;
        G0 g02 = null;
        Object obj = this.f262589d;
        Object obj2 = this.f262588c;
        switch (this.f262587b) {
            case 0:
                Input.t(((n) obj2).f262594e, "", false, 6);
                ((N) obj).invoke();
                break;
            case 1:
                int i12 = Toolbar23SearchView.f264435C0;
                DeepLink action = ((NavigationBarStyle.DisplayType.SearchWithActionTitle) obj2).getAction();
                if (action != null) {
                    ((Toolbar23SearchView) obj).f264465c0.accept(action);
                    break;
                }
                break;
            case 2:
                Action action2 = ((HorizontalSectionButtonItem) obj2).f264691e;
                com.avito.android.section.horizontal.button.f fVar = (com.avito.android.section.horizontal.button.f) obj;
                if (action2 != null) {
                    b.a.a(fVar.f264700b, action2.getDeepLink(), null, null, 6);
                    g02 = G0.f406611a;
                }
                if (g02 == null) {
                    fVar.f264701c.d();
                    break;
                }
                break;
            case 3:
                com.avito.android.select.bottom_sheet.blueprints.a aVar = (com.avito.android.select.bottom_sheet.blueprints.a) obj2;
                aVar.f265036c.toggle();
                aVar.f265037d.toggle();
                ((N) obj).invoke();
                break;
            case 4:
                r.B80((r) obj2, (N) obj);
                break;
            case 5:
                ((com.avito.android.select.sectioned_multiselect.Items.section_item.h) obj2).f266337d.toggle();
                ((N) obj).invoke();
                break;
            case 6:
                com.avito.android.select_districts.items.selected.m mVar = (com.avito.android.select_districts.items.selected.m) obj2;
                mVar.n3(!mVar.f266998g);
                ((Y41.l) obj).invoke(Boolean.valueOf(mVar.f266998g));
                break;
            case 7:
                int i13 = com.avito.android.seller_coach.hints_dialog.item.hint.h.f267499j;
                ((d.a) obj2).a((com.avito.android.seller_coach.hints_dialog.item.hint.a) obj);
                break;
            case 8:
                int i14 = com.avito.android.seller_coach.hints_dialog.view.c.f267553V;
                com.avito.android.seller_coach.hints_dialog.view.c cVar = (com.avito.android.seller_coach.hints_dialog.view.c) obj2;
                com.avito.android.seller_coach.hints_dialog.vm.a aVarV = cVar.V();
                AdviceDetail adviceDetail = aVarV.f267596N;
                if (adviceDetail != null) {
                    com.avito.android.seller_coach.hints_dialog.vm.a.oe(aVarV, null, null, 3);
                    aVarV.f267593K.c(new C14144a(adviceDetail.getTitle(), adviceDetail.getAdviceId(), aVarV.f267597O));
                }
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = cVar.f267558I;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                DeepLink deepLink = ((com.avito.android.seller_coach.hints_dialog.vm.g) obj).f267615d;
                if (deepLink instanceof MyAdvertLink.Edit) {
                    bundle = new Bundle();
                    bundle.putParcelable("up_intent", null);
                } else {
                    bundle = null;
                }
                b.a.a(aVar2, deepLink, null, bundle, 2);
                cVar.r();
                break;
            case 9:
                InterfaceC14521a.C0702a c0702a = (InterfaceC14521a.C0702a) ((InterfaceC14521a) obj);
                ((com.avito.android.seller_promotions.konveyor.snippet.h) obj2).f267854c.invoke(new d.a(c0702a.f11021a, c0702a.f11022b));
                break;
            case 10:
                com.avito.android.serp.adapter.action_promo_banner.h hVar = (com.avito.android.serp.adapter.action_promo_banner.h) obj2;
                hVar.f268621e.K5(G0.f406611a);
                String str = ((ActionPromoBannerItem) obj).f268597b;
                hVar.f268620d.putBoolean(str, true);
                hVar.f268619c.c(new BannerEvent.f(str));
                break;
            case 11:
                ((Y41.l) obj2).invoke(((FloatingPromoWidgetItem) obj).f269981g);
                break;
            case 12:
                ((Y41.l) obj2).invoke((GalleryHeaderWidget.ActiveButton) obj);
                break;
            case 13:
                int i15 = j.b.f270037d;
                ((com.avito.android.serp.adapter.gallery.j) obj2).f270035c.invoke(Integer.valueOf(((j.b) obj).getAbsoluteAdapterPosition()));
                break;
            case 14:
                int i16 = com.avito.android.serp.adapter.promo.n.f270499l;
                ((Y41.l) obj2).invoke(((PromoHeaderWidget.Button) obj).getDeepLink());
                break;
            case 15:
                com.avito.android.serp.adapter.reformulations.r rVar = (com.avito.android.serp.adapter.reformulations.r) obj2;
                rVar.f270650b.O(rVar, (List) obj);
                break;
            case 16:
                ReformulationElement reformulationElement = (ReformulationElement) obj;
                ((com.avito.android.serp.adapter.reformulations.r) obj2).f270650b.k(reformulationElement.f270621c, reformulationElement.f270620b);
                break;
            case 17:
                int i17 = com.avito.android.serp.adapter.resizable_service_widget.row.item.g.f270747d;
                ((Y41.l) obj2).invoke((ResizableServiceWidgetRowListItem) obj);
                break;
            case 18:
                ((Y41.l) obj2).invoke(((Action) obj).getDeepLink());
                break;
            case 19:
                ((N) obj).invoke(((DeveloperProfile) obj2).getUri());
                break;
            case 20:
                DecimalFormat decimalFormat = s.f272150d0;
                ((Y41.l) obj2).invoke(((BuyWithDeliveryButton) obj).getDeeplink());
                break;
            case 21:
                DecimalFormat decimalFormat2 = B.f271723i0;
                ((N) obj).invoke(((BuyWithDeliveryButton) obj2).getDeeplink());
                break;
            case 22:
                int i18 = com.avito.android.serp.adapter.vertical_main.cv.cv_creation.h.f272763e;
                ((Y41.l) obj2).invoke(((CvCreationItemAction) obj).f272747c);
                break;
            case 23:
                int i19 = com.avito.android.serp.adapter.vertical_main.cv.cv_display.j.f272795e;
                ((Y41.l) obj2).invoke(((CvDisplayAction) obj).getDeeplink());
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                ?? r12 = ((com.avito.android.serp.adapter.vertical_main.mini_search_widget.b) obj2).f273054j;
                if (r12 != 0) {
                    r12.invoke(((MiniSearchWidgetRecentSearches.Item) obj).f273045c);
                    break;
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                SellerItem sellerItem = (SellerItem) obj;
                com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.no_reviews.e eVar = (com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.no_reviews.e) obj2;
                d.a.a(eVar.f273177c, null, null, null, null, null, null, Collections.singletonMap("action_value", sellerItem.f273162c), sellerItem.f273167h, 63);
                InterfaceC47691c.a.a(eVar.f273176b.get(), sellerItem.f273168i, null, 14);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                SellerItem sellerItem2 = (SellerItem) obj;
                com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.reviews.c cVar2 = (com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.reviews.c) obj2;
                d.a.a(cVar2.f273188c, null, null, null, null, null, null, Collections.singletonMap("action_value", sellerItem2.f273162c), sellerItem2.f273167h, 63);
                InterfaceC47691c.a.a(cVar2.f273187b.get(), sellerItem2.f273168i, null, 14);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (((ServiceBookingMviStepState.ServiceBookingContent.SrvBookingNextAction) obj2) != null) {
                    ((Y41.l) obj).invoke(InterfaceC14030a.j.f7787a);
                    break;
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Y41.l) obj2).invoke(new InterfaceC42425a.f((InterfaceC42106a) C42745f0.G(((CalendarHeaderState) obj).f276018o)));
                break;
            default:
                DeepLink deepLink2 = ((CalendarHeaderState.b.a) ((CalendarHeaderState.b) obj2)).f276029e;
                if (deepLink2 != null) {
                    ((Y41.l) obj).invoke(new InterfaceC42425a.e(deepLink2));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ m(Y41.l lVar, BuyWithDeliveryButton buyWithDeliveryButton) {
        this.f262587b = 21;
        this.f262589d = (N) lVar;
        this.f262588c = buyWithDeliveryButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ m(Y41.l lVar, DeveloperProfile developerProfile) {
        this.f262587b = 19;
        this.f262589d = (N) lVar;
        this.f262588c = developerProfile;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ m(n nVar, Y41.a aVar) {
        this.f262587b = 0;
        this.f262588c = nVar;
        this.f262589d = (N) aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ m(com.avito.android.select.bottom_sheet.blueprints.a aVar, Y41.a aVar2) {
        this.f262587b = 3;
        this.f262588c = aVar;
        this.f262589d = (N) aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ m(r rVar, Y41.a aVar) {
        this.f262587b = 4;
        this.f262588c = rVar;
        this.f262589d = (N) aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ m(com.avito.android.select.sectioned_multiselect.Items.section_item.h hVar, Y41.a aVar) {
        this.f262587b = 5;
        this.f262588c = hVar;
        this.f262589d = (N) aVar;
    }
}

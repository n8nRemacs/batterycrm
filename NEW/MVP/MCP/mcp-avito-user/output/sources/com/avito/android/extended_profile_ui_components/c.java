package com.avito.android.extended_profile_ui_components;

import RI.b;
import SM.a;
import android.view.View;
import android.widget.TextView;
import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
import com.avito.android.R;
import com.avito.android.analytics.event.C28408c0;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.comparison.remote.model.EmptyStateInfo;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.extended_profile_ui_components.ActionsBottomMenuData;
import com.avito.android.extended_profile_widgets.adapter.seller_promotion.SellerPromotionItem;
import com.avito.android.favorite_comparison.presentation.a;
import com.avito.android.favorites.adapter.advert.FavoriteAdvertItem;
import com.avito.android.favorites.adapter.advert.d;
import com.avito.android.favorites.adapter.promo_banner_with_benefits.PromoBannerRecallWithBenefitsItem;
import com.avito.android.favorites.adapter.promo_banner_with_description.PromoBannerRecallWithDescriptionItem;
import com.avito.android.gallery.ui.GalleryView;
import com.avito.android.gig_apply.models.PaymentState;
import com.avito.android.gig_apply.ui.E;
import com.avito.android.gig_apply.ui.GigApplyErrorDialogFragment;
import com.avito.android.gig_apply.ui.GigApplyErrorResult;
import com.avito.android.gig_snippet.GigSnippetWidget;
import com.avito.android.gig_snippet.list.next_button.GigShiftNextButtonItem;
import com.avito.android.gig_snippet.list.snippet.GigShiftSnippetItem;
import com.avito.android.hotel_booking.HotelBookingActivity;
import com.avito.android.hotel_booking.mvi.entity.a;
import com.avito.android.important_addresses_selection.presentation.ImportantAddressesSelectionDialogFragment;
import com.avito.android.important_addresses_selection.presentation.items.additionalButton.ImportantAddressesSelectionAdditionalActionItem;
import com.avito.android.item_map.view.C31071h;
import com.avito.android.item_map.view.S;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.remote.imv_cars_details.models.AffectingParams;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.BuyWithDeliveryInFavorites;
import com.avito.android.remote.model.ExtendedProfileBaseInfoMl;
import com.avito.android.remote.model.autotekateaser.AutotekaLink;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import com.avito.android.remote.model.developments_catalog.AmenityButton;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import iF.InterfaceC41277a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Q;
import kotlin.collections.C42745f0;
import pH.C46951A;
import wZ.C49578b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f153318b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f153319c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f153320d;

    public /* synthetic */ c(int i12, Object obj, Object obj2) {
        this.f153318b = i12;
        this.f153319c = obj;
        this.f153320d = obj2;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        DeepLink deeplink;
        String str3;
        Object obj = this.f153320d;
        Object obj2 = this.f153319c;
        switch (this.f153318b) {
            case 0:
                ((d) obj2).f153324d.invoke(((ActionsBottomMenuData.a) obj).f153274d);
                break;
            case 1:
                ((n) obj2).f153365a.invoke(((FloatingButton) obj).f153296c);
                break;
            case 2:
                int i12 = com.avito.android.extended_profile_widgets.adapter.base_info_ml.k.f154272k;
                DeepLink uri = ((ExtendedProfileBaseInfoMl.Phone) obj2).getUri();
                if (uri != null) {
                    ((Y41.l) obj).invoke(uri);
                    break;
                }
                break;
            case 3:
                int i13 = com.avito.android.extended_profile_widgets.adapter.base_info_ml.k.f154272k;
                DeepLink uri2 = ((ExtendedProfileBaseInfoMl.Messenger) obj2).getUri();
                if (uri2 != null) {
                    ((Y41.l) obj).invoke(uri2);
                    break;
                }
                break;
            case 4:
                int i14 = com.avito.android.extended_profile_widgets.adapter.contact_bar.g.f154367f;
                ((ContactBar.c) obj2).b((ContactBar.Button.Action) obj);
                break;
            case 5:
                ((com.avito.android.extended_profile_widgets.adapter.seller_promotion.c) obj2).f154928b.invoke(new oB.o(((SellerPromotionItem) obj).f154920d.getDeepLink(), null, 2, null));
                break;
            case 6:
                ((com.avito.android.favorite_comparison.presentation.n) obj2).f155346b.m1().onNext(new a.b(((EmptyStateInfo) obj).getLink()));
                break;
            case 7:
                ((com.avito.android.favorite_comparison.presentation.items.comparison_list_item.g) obj2).f155335b.onNext(new a.b(((com.avito.android.favorite_comparison.presentation.items.comparison_list_item.a) obj).f155329f));
                break;
            case 8:
                d.a aVar = ((com.avito.android.favorites.adapter.advert.p) obj2).f156460b;
                if (aVar != null) {
                    FavoriteAdvertItem favoriteAdvertItem = (FavoriteAdvertItem) obj;
                    Stepper stepper = favoriteAdvertItem.f156419q;
                    aVar.b(stepper.f116271b, 1, favoriteAdvertItem.f156404b, stepper.f116272c);
                    break;
                }
                break;
            case 9:
                d.a aVar2 = ((com.avito.android.favorites.adapter.advert.p) obj2).f156460b;
                if (aVar2 != null) {
                    aVar2.e(((BuyWithDeliveryInFavorites) obj).getDeeplink());
                    break;
                }
                break;
            case 10:
                int i15 = com.avito.android.favorites.adapter.advert.s.f156471H;
                ((Y41.l) obj2).invoke(((AutotekaLink) obj).getUrl());
                break;
            case 11:
                int i16 = com.avito.android.favorites.adapter.advert.s.f156471H;
                ((Y41.l) obj2).invoke((AutotekaPurchaseAction) obj);
                break;
            case 12:
                int i17 = com.avito.android.favorites.adapter.promo_banner_with_benefits.k.f156742s;
                PromoBannerRecallWithBenefitsItem promoBannerRecallWithBenefitsItem = (PromoBannerRecallWithBenefitsItem) obj;
                com.avito.android.favorites.adapter.promo_banner_with_benefits.k kVar = (com.avito.android.favorites.adapter.promo_banner_with_benefits.k) obj2;
                if (!promoBannerRecallWithBenefitsItem.f156726m) {
                    Y41.l<? super String, G0> lVar = kVar.f156756o;
                    if (lVar != null) {
                        lVar.invoke("");
                        break;
                    }
                } else {
                    Y41.l<? super List<String>, G0> lVar2 = kVar.f156758q;
                    if (lVar2 != null) {
                        lVar2.invoke(promoBannerRecallWithBenefitsItem.f156725l);
                        break;
                    }
                }
                break;
            case 13:
                int i18 = com.avito.android.favorites.adapter.promo_banner_with_description.k.f156784p;
                PromoBannerRecallWithDescriptionItem promoBannerRecallWithDescriptionItem = (PromoBannerRecallWithDescriptionItem) obj;
                com.avito.android.favorites.adapter.promo_banner_with_description.k kVar2 = (com.avito.android.favorites.adapter.promo_banner_with_description.k) obj2;
                if (!promoBannerRecallWithDescriptionItem.f156768j) {
                    Y41.l<? super String, G0> lVar3 = kVar2.f156795l;
                    if (lVar3 != null) {
                        lVar3.invoke("");
                        break;
                    }
                } else {
                    Y41.l<? super List<String>, G0> lVar4 = kVar2.f156797n;
                    if (lVar4 != null) {
                        lVar4.invoke(promoBannerRecallWithDescriptionItem.f156767i);
                        break;
                    }
                }
                break;
            case 14:
                int i19 = com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.alert.j.f158320i;
                DeepLink deepLink = ((C49578b) obj2).f441547b;
                if (deepLink != null) {
                    ((Y41.l) obj).invoke(deepLink);
                    break;
                }
                break;
            case 15:
                ((InterfaceC41277a) obj2).d(((GalleryView) obj).f159225b.getCurrentItem());
                break;
            case 16:
                GigApplyErrorDialogFragment gigApplyErrorDialogFragment = (GigApplyErrorDialogFragment) obj2;
                DeepLink deepLink2 = GigApplyErrorDialogFragment.f5(gigApplyErrorDialogFragment).f159854e;
                if (deepLink2 != null) {
                    C22960s.a(C22777e.b(new Q("GIG_APPLY_ERROR_BOTTOM_SHEET_RESULT_KEY", new GigApplyErrorResult.OpenDeeplink(deepLink2))), gigApplyErrorDialogFragment, "GIG_APPLY_ERROR_BOTTOM_SHEET_REQUEST_KEY");
                }
                ((com.avito.android.lib.design.bottom_sheet.d) obj).dismiss();
                break;
            case 17:
                int i22 = com.avito.android.gig_apply.ui.s.f160019a0;
                C46951A c46951a = (C46951A) obj;
                String str4 = c46951a.f428296a;
                if (str4 != null && (str = c46951a.f428297b) != null && (str2 = c46951a.f428298c) != null) {
                    com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(((com.avito.android.gig_apply.ui.s) obj2).f160046a, 0, 2, null);
                    dVar.setContentView(R.layout.gig_slot_avito_bonus_bottom_sheet);
                    com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
                    I5.a((TextView) dVar.findViewById(R.id.title), str4, false);
                    I5.a((TextView) dVar.findViewById(R.id.subtitle), str, false);
                    Button button = (Button) dVar.findViewById(R.id.close_button);
                    button.setOnClickListener(new S7.a(dVar, 12));
                    com.avito.android.lib.design.button.b.a(button, str2, false);
                    com.avito.android.lib.util.g.a(dVar);
                    break;
                }
                break;
            case 18:
                int i23 = E.f159817h;
                ((Y41.l) obj2).invoke(((PaymentState) obj).f159700d);
                break;
            case 19:
                int i24 = GigSnippetWidget.f160993i;
                ((Y41.l) obj2).invoke(((GigShiftSnippetItem) obj).f161027e);
                break;
            case 20:
                int i25 = com.avito.android.gig_snippet.list.next_button.c.f161016d;
                ((Y41.l) obj2).invoke(((GigShiftNextButtonItem) obj).f161011c);
                break;
            case 21:
                ((com.avito.android.home.navbar.f) obj2).f162448b.invoke();
                ((com.avito.android.home.navbar.i) obj).f162464c.c(new C28408c0());
                break;
            case 22:
                HotelBookingActivity.a aVar3 = HotelBookingActivity.f163213t;
                ButtonAction buttonAction = ((a.d) ((com.avito.android.hotel_booking.mvi.entity.a) obj2)).f163893c;
                if (buttonAction != null && (deeplink = buttonAction.getDeeplink()) != null) {
                    ((HotelBookingActivity) obj).a2().accept(new b.o(deeplink));
                    break;
                }
                break;
            case 23:
                ImportantAddressesSelectionDialogFragment.a aVar4 = ImportantAddressesSelectionDialogFragment.f169783p0;
                Button button2 = (Button) obj2;
                button2.setMinimumWidth(D6.s(button2));
                button2.setLoading(true);
                ((com.avito.android.important_addresses_selection.presentation.mvi.l) ((ImportantAddressesSelectionDialogFragment) obj).f169785i0.getValue()).accept(a.c.f14921a);
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                int i26 = com.avito.android.important_addresses_selection.presentation.items.additionalButton.f.f169833g;
                ((com.avito.android.important_addresses_selection.presentation.items.additionalButton.f) obj2).f169835c.invoke(new a.C1007a(((ImportantAddressesSelectionAdditionalActionItem) obj).f169823g));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                AffectingParams affectingParams = (AffectingParams) obj;
                XM.b bVar = new XM.b(((Button) ((com.avito.android.imv_cars_details.presentation.items.all_affecting_params.f) obj2).f170054b).getContext(), affectingParams.getHeaderText());
                List<String> items = affectingParams.getItems();
                ArrayList arrayList = new ArrayList(C42745f0.q(items, 10));
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    arrayList.add(new XM.a((String) it.next()));
                }
                com.avito.android.lib.design.bottom_sheet.d dVar2 = bVar.f18855a;
                ((Chips) dVar2.findViewById(R.id.all_affecting_parameters_chips)).setData(arrayList);
                com.avito.android.lib.util.g.a(dVar2);
                dVar2.s();
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                com.avito.android.inline_filters.dialog.select.adapter.g gVar = (com.avito.android.inline_filters.dialog.select.adapter.g) obj2;
                gVar.f172084c.toggle();
                gVar.f172085d.toggle();
                ((Y41.a) obj).invoke();
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                String type = ((AmenityButton) obj).getType();
                ((com.avito.android.item_map.amenity.h) obj2).d(type != null ? type : "");
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                S.f fVar = (S.f) obj2;
                fVar.f173516c.a(fVar.f173518e.getText().toString());
                C31071h c31071h = (C31071h) obj;
                String str5 = c31071h.f173620b;
                if (str5 != null && (str3 = c31071h.f173621c) != null) {
                    ScreenIdField screenIdField = ScreenIdField.f90251c;
                    fVar.f173517d.b(str5, str3);
                    break;
                }
                break;
            default:
                b.a.a(((S.h) obj2).f173522c, (DeepLink) obj, null, null, 6);
                break;
        }
    }
}

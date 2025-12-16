package com.avito.android.advert.item.ownership_cost.dialogs.region_select.item;

import Y41.l;
import Y41.p;
import android.view.View;
import android.widget.ImageView;
import com.avito.android.advert.item.safedeal.info.f;
import com.avito.android.advert.item.safedeal.trust_factors.expandable_list_item.TrustFactorsExpandableListItemItem;
import com.avito.android.advert.item.service_order_request.ServiceOrderRequestItem;
import com.avito.android.advert.item.teaser.AutotekaSelectV2TeaserView;
import com.avito.android.advert_core.comfortable_deal_promo.AdvertDetailsComfortableDealPromoItem;
import com.avito.android.advert_core.comfortable_deal_promo.j;
import com.avito.android.advert_core.service_education.o;
import com.avito.android.advert_details_items.address.f;
import com.avito.android.advert_details_items.georeference.AdvertDetailsGeoReferenceItem;
import com.avito.android.advert_details_items.georeference.c;
import com.avito.android.advert_details_items.neighboring_dates.i;
import com.avito.android.advert_details_items.neighboring_dates.items.NeighboringDatesItem;
import com.avito.android.advert_details_items.price_description_button.AdvertDetailsPriceDescriptionButtonItem;
import com.avito.android.advert_details_items.search_suggests.AdvertDetailsSearchSuggestItem;
import com.avito.android.advert_multi_items.model.ModificationViewState;
import com.avito.android.advert_multi_items.param_chips.modification_chip.ModificationChipItem;
import com.avito.android.advert_multi_items.param_images.modification_image.ModificationImageItem;
import com.avito.android.advert_stats.detail.tab.items.cost_extended.CostExtendedByPeriodItem;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.tooltip.k;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.ItemAction;
import com.avito.android.remote.model.OwnershipCostResponse;
import com.avito.android.remote.model.PortfolioProject;
import com.avito.android.remote.model.advert_details.realty.RealtyImvHint;
import com.avito.android.remote.model.auto_select.SelectButtonParams;
import com.avito.android.remote.model.auto_select.SelectControlsButtonParams;
import com.avito.android.remote.model.domoteka_report_teaser.Action;
import com.avito.android.remote.model.price_list.PriceList;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import eb.InterfaceC40078a;
import kotlin.G0;
import kotlin.reflect.n;
import x4.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f77934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f77935c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f77936d;

    public /* synthetic */ g(int i12, Object obj, Object obj2) {
        this.f77934b = i12;
        this.f77935c = obj;
        this.f77936d = obj2;
    }

    /* JADX WARN: Type inference failed for: r14v42, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DeepLink deepLink;
        c.a aVar;
        Object obj = this.f77936d;
        Object obj2 = this.f77935c;
        switch (this.f77934b) {
            case 0:
                int i12 = h.f77937c;
                ((l) obj2).invoke((OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region) obj);
                break;
            case 1:
                com.avito.android.advert.item.realty_imv.h hVar = (com.avito.android.advert.item.realty_imv.h) obj2;
                com.avito.android.advert.item.realty_imv.d dVar = hVar.f78346q;
                if (dVar != null) {
                    dVar.f78327a.f78329b.i0(dVar.f78328b.f78318g);
                }
                hVar.f78332c.t0(((RealtyImvHint) obj).getExtended());
                break;
            case 2:
                com.avito.android.advert.item.realty_imv.h hVar2 = (com.avito.android.advert.item.realty_imv.h) obj2;
                com.avito.android.advert.item.realty_imv.d dVar2 = hVar2.f78346q;
                if (dVar2 != null) {
                    dVar2.f78327a.f78329b.P0(dVar2.f78328b.f78318g);
                }
                ((k) obj).e(hVar2.f78339j);
                break;
            case 3:
                int i13 = com.avito.android.advert.item.safedeal.info.g.f78883c;
                ((f.b) obj2).d((DeepLink) obj);
                break;
            case 4:
                ((com.avito.android.advert.item.safedeal.trust_factors.expandable_list_item.c) obj2).f79139b.t(((TrustFactorsExpandableListItemItem) obj).f79128c);
                break;
            case 5:
                ((com.avito.android.advert.item.safedeal.trust_factors.header.d) obj2).f79164b.j((DeepLink) obj);
                break;
            case 6:
                ((com.avito.android.advert.item.safedeal.trust_factors.list_item.d) obj2).f79204b.j((DeepLink) obj);
                break;
            case 7:
                n<Object>[] nVarArr = com.avito.android.advert.item.select.controls.f.f79408e;
                com.avito.android.advert.item.select.controls.f fVar = (com.avito.android.advert.item.select.controls.f) obj2;
                ((l) fVar.f79411d.getValue(fVar, com.avito.android.advert.item.select.controls.f.f79408e[0])).invoke(((SelectControlsButtonParams) obj).getDeepLink());
                break;
            case 8:
                int i14 = com.avito.android.advert.item.service_app_filling.button.g.f79793c;
                ((com.avito.android.advert.item.service_app_filling.a) obj2).a((DeepLink) obj);
                break;
            case 9:
                int i15 = com.avito.android.advert.item.service_order_request.l.f79908i;
                if (!((ServiceOrderRequestItem) obj2).f79871d.f79882d) {
                    ((Y41.a) obj).invoke();
                    break;
                }
                break;
            case 10:
                int i16 = AutotekaSelectV2TeaserView.f80519h;
                SelectButtonParams selectButtonParams = (SelectButtonParams) obj2;
                if (selectButtonParams != null && (deepLink = selectButtonParams.getDeepLink()) != null && (aVar = (c.a) obj) != null) {
                    aVar.Y(deepLink);
                    break;
                }
                break;
            case 11:
                int i17 = com.avito.android.advert_core.auto_select_banner.h.f82912h;
                ((l) obj2).invoke(((SelectButtonParams) obj).getDeepLink());
                break;
            case 12:
                int i18 = j.f83088h;
                ((l) obj2).invoke((AdvertDetailsComfortableDealPromoItem.Button) obj);
                break;
            case 13:
                int i19 = com.avito.android.advert_core.domoteka_report_teaser.g.f83458f;
                ((l) obj2).invoke(((Action) obj).getDeepLink());
                break;
            case 14:
                ((l) obj2).invoke(String.valueOf(((com.avito.android.advert_core.pp_recall_promo.n) obj).f83989d.m53getText()));
                break;
            case 15:
                int i22 = com.avito.android.advert_core.price_list.preview.d.f84124f;
                PriceList.Value value = (PriceList.Value) obj;
                ((p) obj2).invoke(value.getTitle(), value.getImv());
                break;
            case 16:
                ImageView imageView = ((com.avito.android.advert_core.price_list.v2.section.g) obj2).f84176g;
                imageView.animate().rotation(imageView.getRotation() != 0.0f ? 0.0f : 180.0f).start();
                ((Y41.a) obj).invoke();
                break;
            case 17:
                ImageView imageView2 = ((o) obj2).f84332g;
                imageView2.animate().rotation(imageView2.getRotation() != 0.0f ? 0.0f : 180.0f).start();
                ((Y41.a) obj).invoke();
                break;
            case 18:
                ((f.b) obj2).a((String) obj, false);
                break;
            case 19:
                DeepLink deeplink = ((ButtonAction) obj2).getDeeplink();
                if (deeplink != null) {
                    b.a.a(((com.avito.android.advert_details_items.geo_market_report.c) obj).f84776b, deeplink, null, null, 6);
                    break;
                }
                break;
            case 20:
                int i23 = com.avito.android.advert_details_items.georeference.g.f84821e;
                AdvertDetailsGeoReferenceItem advertDetailsGeoReferenceItem = (AdvertDetailsGeoReferenceItem) obj;
                ((c.a) obj2).G0(advertDetailsGeoReferenceItem.f84807h, advertDetailsGeoReferenceItem.f84808i, advertDetailsGeoReferenceItem.f84809j, advertDetailsGeoReferenceItem.f84810k, advertDetailsGeoReferenceItem.f84811l);
                break;
            case 21:
                ((i) obj2).f84912f.invoke(((NeighboringDatesItem.NeighboringDatesChipItem) ((NeighboringDatesItem) obj)).f84924d);
                break;
            case 22:
                int i24 = com.avito.android.advert_details_items.portfolio.j.f85133f;
                DeepLink uri = ((PortfolioProject) obj).getAction().getUri();
                if (uri != null) {
                    ((l) obj2).invoke(uri);
                    break;
                }
                break;
            case 23:
                b.a.a(((com.avito.android.advert_details_items.price_description_button.e) obj2).f85301b, ((AdvertDetailsPriceDescriptionButtonItem) obj).f85288d, null, null, 6);
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                int i25 = com.avito.android.advert_details_items.search_suggests.h.f85527e;
                ((l) obj2).invoke((AdvertDetailsSearchSuggestItem) obj);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                l<? super ItemAction, G0> lVar = ((com.avito.android.advert_item_actions.view.f) obj2).f85867c;
                if (lVar != null) {
                    lVar.invoke((ItemAction) obj);
                    break;
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i26 = com.avito.android.advert_multi_items.param_chips.modification_chip.c.f85930e;
                ModificationChipItem modificationChipItem = (ModificationChipItem) obj2;
                if (modificationChipItem.f85924d != ModificationViewState.f85897c) {
                    ((com.avito.android.advert_multi_items.param_chips.modification_chip.c) obj).f85931b.E1(modificationChipItem);
                    break;
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i27 = com.avito.android.advert_multi_items.param_images.modification_image.c.f85963i;
                ModificationImageItem modificationImageItem = (ModificationImageItem) obj2;
                if (modificationImageItem.f85954d != ModificationViewState.f85897c) {
                    ((com.avito.android.advert_multi_items.param_images.modification_image.c) obj).f85964b.E1(modificationImageItem);
                    break;
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int i28 = com.avito.android.advert_stats.detail.tab.items.cost_extended.g.f86419i;
                ((com.avito.android.advert_stats.detail.tab.items.cost_extended.g) obj2).f86422d.invoke(new InterfaceC40078a.c(((CostExtendedByPeriodItem) obj).f86409f.getDeepLink()));
                break;
            default:
                com.avito.android.advertising.adapter.items.buzzoola.avl.f fVar2 = (com.avito.android.advertising.adapter.items.buzzoola.avl.f) obj2;
                com.avito.android.advertising.ui.buzzoola.i iVar = fVar2.f87283g;
                if (iVar != null) {
                    iVar.dismiss();
                }
                com.avito.android.advertising.ui.buzzoola.i iVar2 = new com.avito.android.advertising.ui.buzzoola.i(view.getContext());
                fVar2.f87283g = iVar2;
                com.avito.android.advertising.ui.h hVar3 = com.avito.android.advertising.ui.h.f88704a;
                BuzzoolaBanner.BuzzoolaAVL buzzoolaAVL = (BuzzoolaBanner.BuzzoolaAVL) obj;
                String str = buzzoolaAVL.f88200f;
                hVar3.getClass();
                iVar2.V(buzzoolaAVL.f88199e, com.avito.android.advertising.ui.h.g(str, buzzoolaAVL.f88201g), new com.avito.android.advert.item.properties.g(1, fVar2, iVar2));
                break;
        }
    }

    public /* synthetic */ g(PortfolioProject portfolioProject, l lVar) {
        this.f77934b = 22;
        this.f77936d = portfolioProject;
        this.f77935c = lVar;
    }
}

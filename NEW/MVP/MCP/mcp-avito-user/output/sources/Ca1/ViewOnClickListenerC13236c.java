package Ca1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.os.C22777e;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert.item.I1;
import com.avito.android.advert.item.show_on_map.AdvertDetailsShowOnMapItem;
import com.avito.android.advert.item.show_on_map.i;
import com.avito.android.advert_core.pp_recall_promo.AdvertDetailsPpRecallPromoItem;
import com.avito.android.advert_details_items.address.f;
import com.avito.android.advertising.adapter.items.buzzoola.profile_promo.ProfilePromoBannerItem;
import com.avito.android.advertising.kebab.q;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import com.avito.android.avito_map.AvitoMapPolyline;
import com.avito.android.campaigns_sale.network.remote.model.HeaderTooltip;
import com.avito.android.crm_paid_cvs.dto.CvStatus;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.item_map.remote.model.route.Meta;
import com.avito.android.item_map.routes.RouteButtonViewState;
import com.avito.android.item_map.routes.RoutesPresenterState;
import com.avito.android.item_map.view.V;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.ExtendedProfilePhone;
import com.avito.android.remote.model.OwnershipCostResponse;
import com.avito.android.remote.model.buyer_bonuses.BuyerBonusesInfo;
import com.avito.android.remote.model.buyer_bonuses.Icon;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.split.SplitListDialogItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.N0;
import com.avito.android.util.p6;
import com.google.android.material.internal.CheckableImageButton;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import mw.InterfaceC44144a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: Ca1.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC13236c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2256b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2257c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2259e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ViewOnClickListenerC13236c(Y41.l lVar, ExtendedProfilePhone extendedProfilePhone, com.avito.android.extended_profile_phone_dialog.b bVar) {
        this.f2256b = 26;
        this.f2257c = (N) lVar;
        this.f2258d = extendedProfilePhone;
        this.f2259e = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.avito.android.advertising.kebab.f] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r6v29, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Y41.l<? super DeepLink, G0> lVar;
        ?? SingletonList;
        AvitoMapPolyline avitoMapPolyline;
        int i12 = 4;
        int i13 = 0;
        Object obj = this.f2258d;
        Object obj2 = this.f2257c;
        Object obj3 = this.f2259e;
        switch (this.f2256b) {
            case 0:
                long jCurrentTimeMillis = System.currentTimeMillis();
                l0.g gVar = (l0.g) obj2;
                if (jCurrentTimeMillis - gVar.f406841b >= 1000) {
                    gVar.f406841b = jCurrentTimeMillis;
                    View.OnClickListener onClickListener = (View.OnClickListener) obj;
                    if (onClickListener != null) {
                        onClickListener.onClick((View) obj3);
                        break;
                    }
                }
                break;
            case 1:
                Y41.l<? super SplitListDialogItem, G0> lVar2 = ((UJ0.a) obj2).f16339b;
                if (lVar2 != null) {
                    lVar2.invoke((SplitListDialogItem) obj);
                }
                ((com.avito.android.lib.design.bottom_sheet.d) obj3).r();
                break;
            case 2:
                ((com.avito.android.advert.advert_details_popup.e) obj2).f68620b.add((String) obj);
                ((Y41.a) obj3).invoke();
                break;
            case 3:
                ((com.avito.android.lib.design.bottom_sheet.d) obj2).dismiss();
                I1 i14 = (I1) obj;
                i14.f71702e.g(null, (DeepLink) obj3, null);
                i14.f71706f0.C3();
                break;
            case 4:
                ((com.avito.android.advert.item.ownership_cost.items.results.e) obj2).a((View) obj3, (OwnershipCostResponse.OwnershipCostResults.CostResultTab) obj, false);
                break;
            case 5:
                DeepLink deepLink = ((SafeDeal.TooltipData.Button) obj2).getDeepLink();
                if (deepLink != null) {
                    ((com.avito.android.advert.item.safedeal.trust_factors.d) obj3).e(deepLink);
                }
                ((com.avito.android.lib.design.tooltip.k) obj).dismiss();
                break;
            case 6:
                ((com.avito.android.advert.item.safedeal.trust_factors.button.c) obj2).f79055b.c((DeepLink) obj, C22777e.b(new Q("componentId", ((SafeDeal.Component.Button) obj3).getId())));
                break;
            case 7:
                ViewGroup viewGroup = ((com.avito.android.advert.item.service_booking.k) obj2).f79848b;
                 = viewGroup instanceof RecyclerView ? (RecyclerView) viewGroup : 0;
                if ( == 0 || !d0()) {
                    ((Y41.a) obj).invoke();
                    ((com.avito.android.lib.design.tooltip.k) obj3).dismiss();
                    break;
                }
                break;
            case 8:
                int i15 = com.avito.android.advert.item.show_on_map.j.f80203c;
                ((i.b) obj2).o((AdvertDetailsShowOnMapItem) obj, (String) obj3);
                break;
            case 9:
                if (((View) obj3).getAlpha() != 0.0f) {
                    com.avito.android.advert.navbar.f fVar = (com.avito.android.advert.navbar.f) obj2;
                    fVar.f80819a.z(((com.avito.android.advert.navbar.a) obj).f80806b, fVar.f80842x);
                    break;
                }
                break;
            case 10:
                com.avito.android.advert_core.advert.k kVar = ((com.avito.android.advert_core.advert.g) obj2).f82671a;
                if (kVar != null) {
                    kVar.O0((DeepLink) obj3, (String) obj);
                    break;
                }
                break;
            case 11:
                com.avito.android.advert_core.advert.k kVar2 = ((com.avito.android.advert_core.advert.i) obj2).f82680a;
                if (kVar2 != null) {
                    kVar2.O0((DeepLink) obj3, (String) obj);
                    break;
                }
                break;
            case 12:
                ((com.avito.android.lib.design.bottom_sheet.d) obj2).dismiss();
                DeepLink deepLink2 = ((AdvertDetailsPpRecallPromoItem.SelectItem) obj).f83943d;
                if (deepLink2 != null && (lVar = ((com.avito.android.advert_core.pp_recall_promo.n) obj3).f83997l) != null) {
                    lVar.invoke(deepLink2);
                    break;
                }
                break;
            case 13:
                ((f.b) obj2).a(((String) obj) + ((l0.h) obj3).f406842b, false);
                break;
            case 14:
                Context context = ((com.avito.android.advert_details_items.buyer_bonuses.h) obj2).f84489b;
                View viewInflate = View.inflate(context, R.layout.advert_details_buyer_bonuses_info_dialog, null);
                com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, i13, 2, );
                dVar.setContentView(viewInflate);
                dVar.setCancelable(true);
                dVar.setCanceledOnTouchOutside(true);
                com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
                com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
                com.avito.android.advert_details_items.buyer_bonuses.b bVar = new com.avito.android.advert_details_items.buyer_bonuses.b(viewInflate);
                BuyerBonusesInfo buyerBonusesInfo = (BuyerBonusesInfo) obj;
                buyerBonusesInfo.getText().setOnDeepLinkClickListener(new com.avito.android.advert_details_items.buyer_bonuses.g(i13, dVar, (Y41.l) obj3));
                AttributedText text = buyerBonusesInfo.getText();
                TextView textView = bVar.f84481d;
                if (textView != null) {
                    com.avito.android.util.text.j.a(textView, text, null);
                }
                if (textView != null) {
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                }
                Icon icon = buyerBonusesInfo.getIcon();
                String amount = buyerBonusesInfo.getAmount();
                AttributedText description = buyerBonusesInfo.getDescription();
                TextView textView2 = bVar.f84479b;
                if (textView2 != null) {
                    I5.a(textView2, amount, false);
                }
                TextView textView3 = bVar.f84480c;
                if (textView3 != null) {
                    com.avito.android.util.text.j.a(textView3, description, null);
                }
                String name = icon.getName();
                if (name != null) {
                    Integer numA = com.avito.android.lib.util.q.a(name);
                    Drawable drawableH = numA != null ? C35835l0.h(numA.intValue(), bVar.f84478a) : null;
                    ImageView imageView = bVar.f84482e;
                    if (imageView != null) {
                        imageView.setImageDrawable(drawableH);
                    }
                }
                com.avito.android.lib.util.g.a(dVar);
                break;
            case 15:
                ProfilePromoBannerItem profilePromoBannerItem = (ProfilePromoBannerItem) obj;
                List<AvitoNetworkBanner.HideReason> listD = profilePromoBannerItem.getBanner().D();
                if (listD != null) {
                    List<AvitoNetworkBanner.HideReason> list = listD;
                    SingletonList = new ArrayList(C42745f0.q(list, 10));
                    for (AvitoNetworkBanner.HideReason hideReason : list) {
                        SingletonList.add(new q.b(profilePromoBannerItem, hideReason.f87968b, hideReason.f87969c));
                    }
                } else {
                    SingletonList = Collections.singletonList(new q.a(profilePromoBannerItem));
                }
                ((com.avito.android.advertising.adapter.items.avito.profile_promo_constructor.f) obj2).f87193e.a((AvitoNetworkBanner.MarkInfo) obj3, SingletonList, profilePromoBannerItem.getBannerInfo());
                break;
            case 16:
                com.avito.android.advertising.adapter.items.buzzoola.premium.j jVar = (com.avito.android.advertising.adapter.items.buzzoola.premium.j) obj2;
                com.avito.android.advertising.ui.buzzoola.i iVar = jVar.f87410g;
                if (iVar != null) {
                    iVar.dismiss();
                }
                com.avito.android.advertising.ui.buzzoola.i iVar2 = new com.avito.android.advertising.ui.buzzoola.i(view.getContext());
                jVar.f87410g = iVar2;
                iVar2.V((String) obj, (String) obj3, new com.avito.android.advert.item.properties.g(3, jVar, iVar2));
                break;
            case 17:
                com.avito.android.advertising.adapter.items.buzzoola.premium_v2.j jVar2 = (com.avito.android.advertising.adapter.items.buzzoola.premium_v2.j) obj2;
                com.avito.android.advertising.ui.buzzoola.i iVar3 = jVar2.f87475g;
                if (iVar3 != null) {
                    iVar3.dismiss();
                }
                com.avito.android.advertising.ui.buzzoola.i iVar4 = new com.avito.android.advertising.ui.buzzoola.i(view.getContext());
                jVar2.f87475g = iVar4;
                iVar4.V((String) obj, (String) obj3, new com.avito.android.advert.item.properties.g(i12, jVar2, iVar4));
                break;
            case 18:
                com.avito.android.advertising.adapter.items.buzzoola.video.l lVar3 = (com.avito.android.advertising.adapter.items.buzzoola.video.l) obj2;
                com.avito.android.advertising.ui.buzzoola.i iVar5 = lVar3.f87582l;
                if (iVar5 != null) {
                    iVar5.dismiss();
                }
                com.avito.android.advertising.ui.buzzoola.i iVar6 = new com.avito.android.advertising.ui.buzzoola.i(view.getContext());
                lVar3.f87582l = iVar6;
                iVar6.V((String) obj, (String) obj3, new com.avito.android.advert.item.properties.g(5, lVar3, iVar6));
                break;
            case 19:
                int i16 = com.avito.android.blueprints.radio_card.item.g.f106522k;
                ((com.avito.android.blueprints.radio_card.item.g) obj2).f106523b.setSelected(!r5.f8964e);
                ((Y41.p) obj3).invoke((JO.m) obj, Boolean.valueOf(!r5.f8964e));
                break;
            case 20:
                int i17 = com.avito.android.blueprints.radio_card.item.g.f106522k;
                SelectParameter.Value.LinkButton linkButton = (SelectParameter.Value.LinkButton) obj2;
                DeepLink uri = linkButton.getUri();
                if (uri != null) {
                    ((Y41.l) obj).invoke(uri);
                }
                String url = linkButton.getUrl();
                if (url != null) {
                    ((Y41.l) obj3).invoke(url);
                    break;
                }
                break;
            case 21:
                int i18 = com.avito.android.blueprints.selector_card.item.d.f106623e;
                ((com.avito.android.blueprints.selector_card.item.d) obj2).f106624b.setSelected(!r5.f8964e);
                ((Y41.p) obj3).invoke((JO.m) obj, Boolean.valueOf(!r5.f8964e));
                break;
            case 22:
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj2;
                checkableImageButton.setChecked(!checkableImageButton.f356716b);
                ((com.avito.android.bxcontent.beduin_v2.favorite.c) obj).f109525m.invoke(new com.avito.android.bxcontent.beduin_v2.favorite.b((com.avito.android.bxcontent.beduin_v2.favorite.g) obj3, checkableImageButton));
                break;
            case 23:
                int i19 = com.avito.android.campaigns_sale.konveyor.editBlock.p.f114000u;
                ((com.avito.android.campaigns_sale.konveyor.editBlock.p) obj2).D80((HeaderTooltip) obj, view, (Y41.a) obj3, null);
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                com.avito.android.crm_paid_cvs.view.dialogs.h hVar = (com.avito.android.crm_paid_cvs.view.dialogs.h) obj2;
                p6 p6Var = new p6(hVar.f130813G);
                while (p6Var.hasNext()) {
                    D6.w(((View) p6Var.next()).findViewById(R.id.select_mark));
                }
                D6.H((View) obj3);
                hVar.f130811E = (CvStatus) obj;
                hVar.dismiss();
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                com.avito.android.developments_advice.j jVar3 = (com.avito.android.developments_advice.j) obj2;
                String str = (String) obj;
                Input.t(jVar3.f136111j, str, false, 4);
                jVar3.f136102a.a2().accept(new InterfaceC44144a.d(str));
                N0.a((com.avito.android.lib.design.bottom_sheet.d) obj3);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i22 = com.avito.android.extended_profile_phone_dialog.b.f151557H;
                ((N) obj2).invoke(((ExtendedProfilePhone) obj).getDeepLink());
                ((com.avito.android.extended_profile_phone_dialog.b) obj3).dismiss();
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((com.avito.android.lib.design.bottom_sheet.d) obj2).dismiss();
                ((Y41.l) obj).invoke((String) obj3);
                break;
            default:
                com.avito.android.item_map.routes.l lVar4 = (com.avito.android.item_map.routes.l) obj2;
                RoutesPresenterState routesPresenterState = lVar4.f173397g;
                lVar4.f173397g = new RoutesPresenterState(routesPresenterState.f173371b, routesPresenterState.f173372c, ((com.avito.android.item_map.routes.b) obj3).f173375b);
                com.avito.android.item_map.routes.d dVar2 = lVar4.f173394d;
                Meta meta = (Meta) obj;
                if (dVar2 != null) {
                    String strValueOf = String.valueOf(meta.getButtonText());
                    LinkedHashMap linkedHashMap = dVar2.f173382d;
                    com.avito.android.item_map.routes.a aVar = (com.avito.android.item_map.routes.a) linkedHashMap.get(strValueOf);
                    if (aVar != null) {
                        aVar.b(RouteButtonViewState.f173368c);
                    }
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        if (!L.f(entry.getKey(), strValueOf)) {
                            ((com.avito.android.item_map.routes.a) entry.getValue()).b(RouteButtonViewState.f173367b);
                        }
                    }
                }
                V v12 = lVar4.f173393c;
                if (v12 != null) {
                    String strValueOf2 = String.valueOf(meta.getButtonText());
                    LinkedHashMap linkedHashMap2 = v12.f173558N;
                    AvitoMapPolyline avitoMapPolyline2 = (AvitoMapPolyline) linkedHashMap2.get(strValueOf2);
                    if (avitoMapPolyline2 != null) {
                        RouteButtonViewState routeButtonViewState = RouteButtonViewState.f173367b;
                        avitoMapPolyline2.changeColor(v12.f173568c.h());
                        avitoMapPolyline2.setZIndex(1.0f);
                    }
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        if (!L.f(entry2.getKey(), strValueOf2) && (avitoMapPolyline = (AvitoMapPolyline) entry2.getValue()) != null) {
                            RouteButtonViewState routeButtonViewState2 = RouteButtonViewState.f173367b;
                            avitoMapPolyline.changeColor(v12.f173568c.g());
                            avitoMapPolyline.setZIndex(0.0f);
                        }
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC13236c(View view, com.avito.android.advert.navbar.f fVar, com.avito.android.advert.navbar.a aVar) {
        this.f2256b = 9;
        this.f2259e = view;
        this.f2257c = fVar;
        this.f2258d = aVar;
    }

    public /* synthetic */ ViewOnClickListenerC13236c(com.avito.android.advert_core.advert.j jVar, String str, String str2, DeepLink deepLink, int i12) {
        this.f2256b = i12;
        this.f2257c = jVar;
        this.f2258d = str;
        this.f2259e = deepLink;
    }

    public /* synthetic */ ViewOnClickListenerC13236c(Object obj, View view, Parcelable parcelable, int i12) {
        this.f2256b = i12;
        this.f2257c = obj;
        this.f2259e = view;
        this.f2258d = parcelable;
    }

    public /* synthetic */ ViewOnClickListenerC13236c(Object obj, Object obj2, Object obj3, int i12) {
        this.f2256b = i12;
        this.f2257c = obj;
        this.f2258d = obj2;
        this.f2259e = obj3;
    }
}

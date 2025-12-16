package com.avito.android.favorites;

import com.avito.android.cart_snippet_actions.models.api.CartSnippetActionsStepper;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorites.adapter.advert.FavoriteAdvertItem;
import com.avito.android.favorites.adapter.advert.RelatedProductsWithState;
import com.avito.android.favorites.adapter.avito_for_business_exit.AvitoForBusinessExitBlockItem;
import com.avito.android.favorites.adapter.banner.SalesPromoItem;
import com.avito.android.favorites.adapter.disclaimer.DisclaimerWidgetItem;
import com.avito.android.favorites.adapter.group_card.GroupCardItem;
import com.avito.android.favorites.adapter.interactive_title.FavoriteInteractiveTitleListItem;
import com.avito.android.favorites.adapter.promo.FavoritesPromoItem;
import com.avito.android.favorites.adapter.promo_banner_with_benefits.PromoBannerRecallWithBenefitsItem;
import com.avito.android.favorites.adapter.promo_banner_with_description.PromoBannerRecallWithDescriptionItem;
import com.avito.android.related_products.RelatedProductsEntryPointState;
import com.avito.android.remote.model.AdvertPrice;
import com.avito.android.remote.model.AvitoForBusinessExitBlock;
import com.avito.android.remote.model.BuyWithDeliveryInFavorites;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.DisclaimerWidget;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.FavoriteAdvertActionButton;
import com.avito.android.remote.model.FavoriteAdvertPrice;
import com.avito.android.remote.model.FavoriteAdvertV1;
import com.avito.android.remote.model.FavoriteElement;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.GroupCard;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.PromoBannerRecallWithBenefits;
import com.avito.android.remote.model.PromoBannerRecallWithDescription;
import com.avito.android.remote.model.RelatedProducts;
import com.avito.android.remote.model.SerpBannerContainer;
import com.avito.android.remote.model.StocksQuantity;
import com.avito.android.remote.model.WitcherElement;
import com.avito.android.remote.model.autotekateaser.AutotekaLink;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import com.avito.android.remote.model.vertical_main.InteractiveTitleWidget;
import com.avito.android.remote.model.vertical_main.MovableImage;
import com.avito.android.remote.model.vertical_main.PromoAction;
import com.avito.android.remote.model.vertical_main.PromoStyle;
import com.avito.android.remote.model.vertical_main.PromoWidget;
import com.avito.android.remote.model.vertical_main.SalesPromoWidget;
import com.avito.android.remote.model.vertical_main.VerticalInsets;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import wn.C49654a;

/* compiled from: FavoriteAdvertItemConverter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/c;", "Lcom/avito/android/favorites/b;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.favorites.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30606c implements InterfaceC30603b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<AdvertPrice> f156800a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30657f f156801b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final YC.a f156802c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Yo.p f156803d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30669j0 f156804e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorites.adapter.disclaimer.c f156805f;

    @Inject
    public C30606c(@Y61.k InterfaceC35945t1<AdvertPrice> interfaceC35945t1, @Y61.k InterfaceC30657f interfaceC30657f, @Y61.k YC.a aVar, @Y61.k Yo.p pVar, @Y61.k InterfaceC30669j0 interfaceC30669j0, @Y61.k com.avito.android.favorites.adapter.disclaimer.c cVar) {
        this.f156800a = interfaceC35945t1;
        this.f156801b = interfaceC30657f;
        this.f156802c = aVar;
        this.f156803d = pVar;
        this.f156804e = interfaceC30669j0;
        this.f156805f = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11, types: [com.avito.android.favorites.adapter.advert.FavoriteAdvertItem] */
    /* JADX WARN: Type inference failed for: r7v14, types: [com.avito.android.favorites.adapter.promo.FavoritesPromoItem] */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.avito.android.advertising.CommercialLoadingItem] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.avito.android.favorites.adapter.group_card.GroupCardItem] */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.avito.android.favorites.adapter.avito_for_business_exit.AvitoForBusinessExitBlockItem] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.avito.android.favorites.adapter.promo_banner_with_benefits.PromoBannerRecallWithBenefitsItem] */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.avito.android.favorites.adapter.promo_banner_with_description.PromoBannerRecallWithDescriptionItem] */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.avito.android.favorites.adapter.banner.SalesPromoItem] */
    /* JADX WARN: Type inference failed for: r7v8, types: [com.avito.android.favorites.adapter.interactive_title.FavoriteInteractiveTitleListItem] */
    /* JADX WARN: Type inference failed for: r7v9, types: [com.avito.android.serp.adapter.witcher.WitcherItem] */
    @Override // com.avito.android.favorites.InterfaceC30603b
    @Y61.k
    public final ArrayList a(@Y61.k List list) {
        Stepper stepper;
        GeoReference geoReference;
        String title;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            DisclaimerWidgetItem disclaimerWidgetItem = null;
            disclaimerWidgetItem = null;
            disclaimerWidgetItem = null;
            disclaimerWidgetItem = null;
            disclaimerWidgetItem = null;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            FavoriteElement favoriteElement = (FavoriteElement) obj;
            if (favoriteElement instanceof PromoWidget) {
                PromoWidget promoWidget = (PromoWidget) favoriteElement;
                String text = promoWidget.getText();
                if (((text != null && text.length() != 0) || O2.a(promoWidget.getActions())) && (title = promoWidget.getTitle()) != null) {
                    String text2 = promoWidget.getText();
                    List<PromoAction> actions = promoWidget.getActions();
                    String image = promoWidget.getImage();
                    MovableImage movableImage = promoWidget.getMovableImage();
                    PromoStyle style = promoWidget.getStyle();
                    if (style == null) {
                        style = PromoStyle.WARMGRAY;
                    }
                    disclaimerWidgetItem = new FavoritesPromoItem("vertical_promo", title, text2, actions, style, image, movableImage, promoWidget.getPromoId(), false, 256, null);
                }
            } else if (favoriteElement instanceof FavoriteAdvertV1) {
                FavoriteAdvertV1 favoriteAdvertV1 = (FavoriteAdvertV1) favoriteElement;
                String strValueOf = String.valueOf(favoriteAdvertV1.getId());
                String title2 = favoriteAdvertV1.getTitle();
                FavoriteAdvertPrice price = favoriteAdvertV1.getPrice();
                String value = price != null ? price.getValue() : null;
                FavoriteAdvertPrice price2 = favoriteAdvertV1.getPrice();
                String previousPrice = price2 != null ? price2.getPreviousPrice() : null;
                FavoriteAdvertPrice price3 = favoriteAdvertV1.getPrice();
                String previousPriceHint = price3 != null ? price3.getPreviousPriceHint() : null;
                FavoriteAdvertPrice price4 = favoriteAdvertV1.getPrice();
                DiscountIcon discountIcon = price4 != null ? price4.getDiscountIcon() : null;
                Long timestamp = favoriteAdvertV1.getTimestamp();
                boolean zIsActive = favoriteAdvertV1.isActive();
                boolean zIsFavorite = favoriteAdvertV1.isFavorite();
                DimmedImage image2 = favoriteAdvertV1.getImages().getImage();
                Image image3 = image2 != null ? image2.getImage() : null;
                String note = favoriteAdvertV1.getNote();
                DeepLink deeplink = favoriteAdvertV1.getDeeplink();
                String address = favoriteAdvertV1.getAddress();
                List<GeoReference> geoReferences = favoriteAdvertV1.getGeoReferences();
                String content = (geoReferences == null || (geoReference = (GeoReference) C42745f0.G(geoReferences)) == null) ? null : geoReference.getContent();
                StocksQuantity stocksQuantity = favoriteAdvertV1.getStocksQuantity();
                CartSnippetActionsStepper cartButton = favoriteAdvertV1.getCartButton();
                if (cartButton != null) {
                    Integer maxValue = cartButton.getMaxValue();
                    int iIntValue = maxValue != null ? maxValue.intValue() : Integer.MAX_VALUE;
                    Boolean isStocksVisible = cartButton.getIsStocksVisible();
                    Boolean bool = Boolean.FALSE;
                    stepper = new Stepper(cartButton.getValue(), iIntValue, bool, C49654a.a(cartButton.getValue(), iIntValue), kotlin.jvm.internal.L.f(isStocksVisible, bool));
                } else {
                    stepper = null;
                }
                int categoryId = favoriteAdvertV1.getCategoryId();
                BadgeSticker badgeSticker = favoriteAdvertV1.getBadgeSticker();
                BuyWithDeliveryInFavorites buyWithDelivery = favoriteAdvertV1.getBuyWithDelivery();
                DeepLink deeplink2 = favoriteAdvertV1.getDeeplink();
                AdvertDetailsLink advertDetailsLink = deeplink2 instanceof AdvertDetailsLink ? (AdvertDetailsLink) deeplink2 : null;
                String str = advertDetailsLink != null ? advertDetailsLink.f132948c : null;
                AutotekaPurchaseAction autotekaPurchaseAction = favoriteAdvertV1.getAutotekaPurchaseAction();
                AutotekaLink autotekaLink = favoriteAdvertV1.getAutotekaLink();
                FavoriteAdvertActionButton actionButton = favoriteAdvertV1.getActionButton();
                RelatedProducts relatedProducts = favoriteAdvertV1.getRelatedProducts();
                disclaimerWidgetItem = new FavoriteAdvertItem(strValueOf, title2, value, previousPrice, previousPriceHint, discountIcon, timestamp, zIsActive, image3, categoryId, note, deeplink, address, content, stocksQuantity, stepper, badgeSticker, buyWithDelivery, autotekaPurchaseAction, autotekaLink, actionButton, relatedProducts != null ? new RelatedProductsWithState(relatedProducts, RelatedProductsEntryPointState.f252814b) : null, favoriteAdvertV1.getContacts(), favoriteAdvertV1.getGeoReferences(), favoriteAdvertV1.getDistance(), null, favoriteAdvertV1.getKeyAttributes(), favoriteAdvertV1.getSnippetType(), favoriteAdvertV1.getSellerInfo(), favoriteAdvertV1.getAnalyticParams(), zIsFavorite, str, null, null, false, favoriteAdvertV1.getDisplayType(), favoriteAdvertV1.getLocation(), favoriteAdvertV1.getXHash(), favoriteAdvertV1.getBadgeBar(), favoriteAdvertV1.getJobAggregationDisclaimer(), 33554432, 7, null);
            } else if (favoriteElement instanceof WitcherElement) {
                disclaimerWidgetItem = this.f156804e.b((WitcherElement) favoriteElement);
            } else if (favoriteElement instanceof InteractiveTitleWidget) {
                InteractiveTitleWidget interactiveTitleWidget = (InteractiveTitleWidget) favoriteElement;
                String title3 = interactiveTitleWidget.getTitle();
                DeepLink deeplink3 = interactiveTitleWidget.getDeeplink();
                VerticalInsets verticalInsets = interactiveTitleWidget.getVerticalInsets();
                int top = verticalInsets != null ? verticalInsets.getTop() : 0;
                VerticalInsets verticalInsets2 = interactiveTitleWidget.getVerticalInsets();
                disclaimerWidgetItem = new FavoriteInteractiveTitleListItem(null, title3, deeplink3, top, verticalInsets2 != null ? verticalInsets2.getBottom() : 0, 1, null);
            } else if (favoriteElement instanceof SalesPromoWidget) {
                SalesPromoWidget salesPromoWidget = (SalesPromoWidget) favoriteElement;
                disclaimerWidgetItem = new SalesPromoItem("sale_promo", salesPromoWidget.getId(), salesPromoWidget.getTitle(), salesPromoWidget.getSubtitle(), salesPromoWidget.getImage(), salesPromoWidget.getLink(), salesPromoWidget.getUri(), salesPromoWidget.getBackgroundColor(), salesPromoWidget.getBackgroundGradient(), salesPromoWidget.getBackgroundImage(), salesPromoWidget.getAnalyticalParams());
            } else {
                boolean z12 = favoriteElement instanceof PromoBannerRecallWithDescription;
                Yo.p pVar = this.f156803d;
                YC.a aVar = this.f156802c;
                if (z12) {
                    PromoBannerRecallWithDescription promoBannerRecallWithDescription = (PromoBannerRecallWithDescription) favoriteElement;
                    if (aVar.b(promoBannerRecallWithDescription.getBannerName())) {
                        pVar.f(null, "favorites", "middle", "rre_trx_favorites_2024_v1");
                        disclaimerWidgetItem = new PromoBannerRecallWithDescriptionItem(promoBannerRecallWithDescription.getBannerName(), promoBannerRecallWithDescription.getTitle(), promoBannerRecallWithDescription.getDescription(), promoBannerRecallWithDescription.getButtonText(), promoBannerRecallWithDescription.getInputTitle(), promoBannerRecallWithDescription.getDisclaimer(), promoBannerRecallWithDescription.getBackgroundImage(), promoBannerRecallWithDescription.getCloseItems(), true, false);
                    }
                } else if (favoriteElement instanceof PromoBannerRecallWithBenefits) {
                    PromoBannerRecallWithBenefits promoBannerRecallWithBenefits = (PromoBannerRecallWithBenefits) favoriteElement;
                    if (aVar.b(promoBannerRecallWithBenefits.getBannerName())) {
                        pVar.f(null, "favorites", "middle", "rre_trx_favorites_2024_v2");
                        disclaimerWidgetItem = new PromoBannerRecallWithBenefitsItem(promoBannerRecallWithBenefits.getBannerName(), promoBannerRecallWithBenefits.getTitle(), promoBannerRecallWithBenefits.getDescription(), promoBannerRecallWithBenefits.getButtonText(), promoBannerRecallWithBenefits.getInputTitle(), promoBannerRecallWithBenefits.getDisclaimer(), promoBannerRecallWithBenefits.getLeftImage(), promoBannerRecallWithBenefits.getRightImage(), promoBannerRecallWithBenefits.getLeftText(), promoBannerRecallWithBenefits.getRightText(), promoBannerRecallWithBenefits.getCloseItems(), true, false);
                    }
                } else if (favoriteElement instanceof AvitoForBusinessExitBlock) {
                    AvitoForBusinessExitBlock avitoForBusinessExitBlock = (AvitoForBusinessExitBlock) favoriteElement;
                    disclaimerWidgetItem = new AvitoForBusinessExitBlockItem(UUID.randomUUID().toString(), avitoForBusinessExitBlock.getTitle(), new AvitoForBusinessExitBlockItem.Button(avitoForBusinessExitBlock.getButton().getText()));
                } else if (favoriteElement instanceof GroupCard) {
                    GroupCard groupCard = (GroupCard) favoriteElement;
                    disclaimerWidgetItem = new GroupCardItem(AK.c.g(i12, "group_card"), groupCard.getTitle(), groupCard.getSubtitle(), groupCard.getImage(), groupCard.getDeeplink());
                } else if (favoriteElement instanceof SerpBannerContainer) {
                    disclaimerWidgetItem = com.avito.android.advertising.g.c((SerpBannerContainer) favoriteElement, UUID.randomUUID().toString());
                } else if (favoriteElement instanceof DisclaimerWidget) {
                    this.f156805f.getClass();
                    disclaimerWidgetItem = new DisclaimerWidgetItem(null, ((DisclaimerWidget) favoriteElement).getTitle(), 1, null);
                }
            }
            if (disclaimerWidgetItem != null) {
                arrayList.add(disclaimerWidgetItem);
            }
            i12 = i13;
        }
        return arrayList;
    }
}

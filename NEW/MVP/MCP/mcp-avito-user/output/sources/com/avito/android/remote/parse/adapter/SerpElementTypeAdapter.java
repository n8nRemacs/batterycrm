package com.avito.android.remote.parse.adapter;

import com.avito.android.C36135w2;
import com.avito.android.gig_snippet.models.GigShiftsWidgetItem;
import com.avito.android.promo_snippet.models.GigPromoSnippetWidget;
import com.avito.android.remote.model.ActionPromoBanner;
import com.avito.android.remote.model.AddAddressSuggest;
import com.avito.android.remote.model.AttributedHeaderWidget;
import com.avito.android.remote.model.ConstructorAdvertNetworkModel;
import com.avito.android.remote.model.Disclaimer;
import com.avito.android.remote.model.FloatingPromoWidget;
import com.avito.android.remote.model.HeaderElement;
import com.avito.android.remote.model.InfoBanner;
import com.avito.android.remote.model.OtherAdverts;
import com.avito.android.remote.model.PromoBanner;
import com.avito.android.remote.model.ReformulationsWidget;
import com.avito.android.remote.model.SellerElement;
import com.avito.android.remote.model.SerpAdvert;
import com.avito.android.remote.model.SerpAdvertEmptyPlaceholder;
import com.avito.android.remote.model.SerpAdvertGroupTitle;
import com.avito.android.remote.model.SerpAdvertXl;
import com.avito.android.remote.model.SerpBannerContainer;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SerpVipAdverts;
import com.avito.android.remote.model.SerpWarning;
import com.avito.android.remote.model.ServiceTypeKt;
import com.avito.android.remote.model.UserAdvert;
import com.avito.android.remote.model.WitcherElement;
import com.avito.android.remote.model.advert_list.beduin_item.BeduinItemElement;
import com.avito.android.remote.model.advertising.AvitoNetworkBannerItem;
import com.avito.android.remote.model.advertising.BuzzoolaNetworkBannerItem;
import com.avito.android.remote.model.advertising.EmbeddedAdvBanner;
import com.avito.android.remote.model.advertising.MyTargetNetworkBannerItem;
import com.avito.android.remote.model.advertising.YandexNetworkBannerItem;
import com.avito.android.remote.model.alert_banner.AlertBannerWidget;
import com.avito.android.remote.model.auto_model.AutoModelWidget;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.cv.CvCreationWidget;
import com.avito.android.remote.model.cv.CvDisplayWidget;
import com.avito.android.remote.model.developments_catalog.serp.FiltersTabs;
import com.avito.android.remote.model.developments_catalog.serp.SerpDevelopment;
import com.avito.android.remote.model.developments_catalog.serp.SerpDevelopmentXl;
import com.avito.android.remote.model.gallery.GalleryHeaderWidget;
import com.avito.android.remote.model.inset.ItemsCarouselWidget;
import com.avito.android.remote.model.location_notification.LocationNotification;
import com.avito.android.remote.model.map_banner.MapBanner;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.model_card_entry.ModelCardEntryWidgetEntity;
import com.avito.android.remote.model.promo.PromoHeaderWidget;
import com.avito.android.remote.model.replace_main_widget.ReplaceMainPageWidget;
import com.avito.android.remote.model.resizable_service_widget.ResizableServiceWidget;
import com.avito.android.remote.model.safedeal.BxActiveOrdersWidget;
import com.avito.android.remote.model.sales.SalesHeaderWidget;
import com.avito.android.remote.model.serp.FeedsWidget;
import com.avito.android.remote.model.serp.SerpBeduinV2Widget;
import com.avito.android.remote.model.serp.Snippet;
import com.avito.android.remote.model.service_order_widget.ServiceOrderWidget;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.services_menu_widget.ServicesMenuWidget;
import com.avito.android.remote.model.slider.SliderWidget;
import com.avito.android.remote.model.stories.StoriesWidget;
import com.avito.android.remote.model.swipe_sellers.TopSellersSerpWidget;
import com.avito.android.remote.model.universal_promo_banner.UniversalPromoBanner;
import com.avito.android.remote.model.user_adverts.DiscountBanner;
import com.avito.android.remote.model.vertical_main.AvitoBlogWidget;
import com.avito.android.remote.model.vertical_main.BrandspaceWidget;
import com.avito.android.remote.model.vertical_main.CollectionsRecommendationWidget;
import com.avito.android.remote.model.vertical_main.FeaturedWidget;
import com.avito.android.remote.model.vertical_main.InteractiveTitleWidget;
import com.avito.android.remote.model.vertical_main.MallShortcutsWidget;
import com.avito.android.remote.model.vertical_main.MiniSearchWidget;
import com.avito.android.remote.model.vertical_main.PublishFormWidget;
import com.avito.android.remote.model.vertical_main.RubricatorWidget;
import com.avito.android.remote.model.vertical_main.SearchFormWidget;
import com.avito.android.remote.model.vertical_main.SellersCarouselWidget;
import com.avito.android.remote.model.vertical_main.TopSellersWidget;
import com.avito.android.remote.model.vertical_main.UspBannersWidget;
import com.my.tracker.ads.AdFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: SerpElementTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/SerpElementTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/SerpElement;", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SerpElementTypeAdapter extends RuntimeTypeAdapter<SerpElement> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final C36135w2 f254238a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<String, Class<? extends SerpElement>> f254239b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final T f254240c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f254241d;

    /* compiled from: SerpElementTypeAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "Ljava/lang/Class;", "Lcom/avito/android/remote/model/SerpElement;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Map<String, Class<? extends SerpElement>>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Map<String, Class<? extends SerpElement>> invoke() {
            LinkedHashMap linkedHashMapJ = P0.j(new kotlin.Q("developmentsItem", SerpDevelopment.class), new kotlin.Q("item", SerpAdvert.class), new kotlin.Q("xlItem", SerpAdvertXl.class), new kotlin.Q(AdFormat.BANNER, SerpBannerContainer.class), new kotlin.Q("advBannerWidget", SerpBannerContainer.class), new kotlin.Q("embeddedAdvBanner", EmbeddedAdvBanner.class), new kotlin.Q(ServiceTypeKt.SERVICE_VIP, SerpVipAdverts.class), new kotlin.Q("buzzoola", BuzzoolaNetworkBannerItem.class), new kotlin.Q("yandex", YandexNetworkBannerItem.class), new kotlin.Q("avito", AvitoNetworkBannerItem.class), new kotlin.Q("user_item", UserAdvert.class), new kotlin.Q("discount_banner", DiscountBanner.class), new kotlin.Q("other_items", OtherAdverts.class), new kotlin.Q(ServiceTransportationWidget.DisclaimerField.TYPE, Disclaimer.class), new kotlin.Q("myTarget", MyTargetNetworkBannerItem.class), new kotlin.Q("snippet", Snippet.class), new kotlin.Q(ConstraintKt.WARNING, SerpWarning.class), new kotlin.Q("addressEntryPointWidget", AddAddressSuggest.class), new kotlin.Q("groupTitle", SerpAdvertGroupTitle.class), new kotlin.Q(ChannelContext.Item.PLACEHOLDER, SerpAdvertEmptyPlaceholder.class), new kotlin.Q("header", HeaderElement.class), new kotlin.Q("witcher", WitcherElement.class), new kotlin.Q("laasTooltip", LocationNotification.class), new kotlin.Q("sellerItem", SellerElement.class), new kotlin.Q("mapBanner", MapBanner.class), new kotlin.Q("searchFormWidget", SearchFormWidget.class), new kotlin.Q("publishFormWidget", PublishFormWidget.class), new kotlin.Q("reformulationsWidget", ReformulationsWidget.class), new kotlin.Q("itemsWidget", FeaturedWidget.class), new kotlin.Q("developmentsCatalog", FeaturedWidget.class), new kotlin.Q("brandspaceWidget", BrandspaceWidget.class), new kotlin.Q("resizableServiceWidget", ResizableServiceWidget.class), new kotlin.Q("avitoBlogWidget", AvitoBlogWidget.class), new kotlin.Q("topSellersWidget", TopSellersWidget.class), new kotlin.Q("activeOrdersWidget", BxActiveOrdersWidget.class), new kotlin.Q("storiesWidget", StoriesWidget.class), new kotlin.Q("topSellersSwipe", TopSellersSerpWidget.class), new kotlin.Q("cvCreateWidget", CvCreationWidget.class), new kotlin.Q("cvDisplayWidget", CvDisplayWidget.class), new kotlin.Q("info_banner", InfoBanner.class), new kotlin.Q("alertBanner", AlertBannerWidget.class), new kotlin.Q("feedsWidget", FeedsWidget.class), new kotlin.Q("beduinV2ContentWidget", SerpBeduinV2Widget.class), new kotlin.Q("itemConstructorized", ConstructorAdvertNetworkModel.class), new kotlin.Q("promo_banner", PromoBanner.class), new kotlin.Q("rubricatorWidget", RubricatorWidget.class), new kotlin.Q("uspBannerWidget", UspBannersWidget.class), new kotlin.Q("mallShortcutsWidget", MallShortcutsWidget.class), new kotlin.Q("development", SerpDevelopment.class), new kotlin.Q("filtersTabs", FiltersTabs.class), new kotlin.Q("xlDevelopment", SerpDevelopmentXl.class), new kotlin.Q("interactiveTitleWidget", InteractiveTitleWidget.class), new kotlin.Q("beduin_item", BeduinItemElement.class), new kotlin.Q("brandspaceItem", SerpDevelopment.class), new kotlin.Q("universalPromoBanner", UniversalPromoBanner.class), new kotlin.Q("itemsCarouselWidget", ItemsCarouselWidget.class), new kotlin.Q("xlAutoModel", AutoModelWidget.class), new kotlin.Q("miniSearchWidget", MiniSearchWidget.class), new kotlin.Q("catalogEntryPointWidget", ModelCardEntryWidgetEntity.class), new kotlin.Q("servicesMenuWidget", ServicesMenuWidget.class), new kotlin.Q("promoHeaderWidget", PromoHeaderWidget.class), new kotlin.Q("galleryHeaderWidget", GalleryHeaderWidget.class), new kotlin.Q("salesHeaderWidget", SalesHeaderWidget.class), new kotlin.Q("collectionsRecommendationsWidget", CollectionsRecommendationWidget.class), new kotlin.Q("yourSlotsWidget", GigShiftsWidgetItem.class), new kotlin.Q("serviceOrderWidget", ServiceOrderWidget.class), new kotlin.Q("transportationFormWidget", ServiceTransportationWidget.class), new kotlin.Q("sellersCarouselWidget", SellersCarouselWidget.class), new kotlin.Q("gigMotivationWidget", GigPromoSnippetWidget.class), new kotlin.Q("attributedHeader", AttributedHeaderWidget.class), new kotlin.Q("replaceMainPageWidget", ReplaceMainPageWidget.class));
            SerpElementTypeAdapter serpElementTypeAdapter = SerpElementTypeAdapter.this;
            C36135w2 c36135w2 = serpElementTypeAdapter.f254238a;
            if (c36135w2 != null) {
                kotlin.reflect.n<Object> nVar = C36135w2.f327457X[14];
                if (((Boolean) c36135w2.f327492m.a().invoke()).booleanValue()) {
                    linkedHashMapJ.put("actionPromoBanner", ActionPromoBanner.class);
                }
            }
            C36135w2 c36135w22 = serpElementTypeAdapter.f254238a;
            if (c36135w22 != null) {
                kotlin.reflect.n<Object> nVar2 = C36135w2.f327457X[23];
                if (((Boolean) c36135w22.f327499t.a().invoke()).booleanValue()) {
                    linkedHashMapJ.put("sliderWidget", SliderWidget.class);
                }
            }
            if (c36135w22 != null) {
                kotlin.reflect.n<Object> nVar3 = C36135w2.f327457X[15];
                if (((Boolean) c36135w22.f327493n.a().invoke()).booleanValue()) {
                    linkedHashMapJ.put("floatingPromo", FloatingPromoWidget.class);
                }
            }
            if (c36135w22 != null) {
                kotlin.reflect.n<Object> nVar4 = C36135w2.f327457X[20];
                if (((Boolean) c36135w22.f327496q.a().invoke()).booleanValue()) {
                    linkedHashMapJ.put("catalogEntryPointWidget", ModelCardEntryWidgetEntity.class);
                }
            }
            linkedHashMapJ.putAll(serpElementTypeAdapter.f254239b);
            return linkedHashMapJ;
        }
    }

    public SerpElementTypeAdapter() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter, com.google.gson.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deserialize(com.google.gson.i r8, java.lang.reflect.Type r9, com.google.gson.g r10) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            com.google.gson.k r2 = r8.i()
            java.lang.String r3 = "type"
            com.google.gson.i r3 = r2.D(r3)
            r4 = 0
            if (r3 == 0) goto L14
            java.lang.String r3 = com.avito.android.remote.C34328m0.e(r3)
            goto L15
        L14:
            r3 = r4
        L15:
            java.lang.String r5 = "item"
            boolean r3 = kotlin.jvm.internal.L.f(r3, r5)
            if (r3 == 0) goto L4e
            java.lang.String r3 = "isConstructor"
            com.google.gson.i r3 = r2.D(r3)
            if (r3 == 0) goto L30
            java.lang.Boolean r3 = com.avito.android.remote.C34328m0.a(r3)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.L.f(r3, r5)
            goto L31
        L30:
            r3 = r1
        L31:
            if (r3 == 0) goto L4e
            java.lang.String r9 = "value"
            com.google.gson.i r9 = r2.D(r9)
            if (r9 == 0) goto L40
            com.google.gson.k r9 = r9.i()
            goto L41
        L40:
            r9 = r4
        L41:
            if (r9 != 0) goto L45
            goto Ldd
        L45:
            java.lang.Class<com.avito.android.remote.model.ConstructorAdvertNetworkModel> r2 = com.avito.android.remote.model.ConstructorAdvertNetworkModel.class
            java.lang.Object r9 = r10.b(r9, r2)
            com.avito.android.remote.model.SerpElement r9 = (com.avito.android.remote.model.SerpElement) r9
            goto L54
        L4e:
            java.lang.Object r9 = super.deserialize(r8, r9, r10)
            com.avito.android.remote.model.SerpElement r9 = (com.avito.android.remote.model.SerpElement) r9
        L54:
            com.avito.android.remote.parse.adapter.T r2 = r7.f254240c
            if (r2 == 0) goto Ldc
            com.google.gson.k r8 = r8.i()
            boolean r3 = r9 instanceof com.avito.android.remote.model.AnalyticsElement
            if (r3 == 0) goto L8e
            r3 = r9
            com.avito.android.remote.model.AnalyticsElement r3 = (com.avito.android.remote.model.AnalyticsElement) r3
            com.avito.android.remote.model.widget_analytics.Analytics r5 = r3.getAnalytics()
            if (r5 != 0) goto L8e
            java.lang.String r5 = "analytics"
            com.google.gson.i r5 = r8.D(r5)     // Catch: java.lang.Exception -> L8a
            if (r5 == 0) goto L76
            com.google.gson.k r5 = com.avito.android.remote.C34328m0.d(r5)     // Catch: java.lang.Exception -> L8a
            goto L77
        L76:
            r5 = r4
        L77:
            com.google.gson.i[] r6 = new com.google.gson.i[r0]     // Catch: java.lang.Exception -> L8a
            r6[r1] = r5     // Catch: java.lang.Exception -> L8a
            r5 = r6[r1]     // Catch: java.lang.Exception -> L8a
            if (r5 != 0) goto L81
            r5 = r4
            goto L87
        L81:
            java.lang.Class<com.avito.android.remote.model.widget_analytics.Analytics> r6 = com.avito.android.remote.model.widget_analytics.Analytics.class
            java.lang.Object r5 = r10.b(r5, r6)     // Catch: java.lang.Exception -> L8a
        L87:
            com.avito.android.remote.model.widget_analytics.Analytics r5 = (com.avito.android.remote.model.widget_analytics.Analytics) r5     // Catch: java.lang.Exception -> L8a
            goto L8b
        L8a:
            r5 = r4
        L8b:
            r3.setAnalytics(r5)
        L8e:
            boolean r3 = r9 instanceof com.avito.android.remote.model.SettingsElement
            if (r3 == 0) goto Ldc
            r3 = r9
            com.avito.android.remote.model.SettingsElement r3 = (com.avito.android.remote.model.SettingsElement) r3
            com.avito.android.remote.model.widget_settings.Settings r5 = r3.getSettings()
            if (r5 != 0) goto Ldc
            com.avito.android.w2 r2 = r2.f254249a
            r2.getClass()
            kotlin.reflect.n<java.lang.Object>[] r5 = com.avito.android.C36135w2.f327457X
            r6 = 47
            r5 = r5[r6]
            com.avito.android.A0$a r2 = r2.f327475R
            DE0.a r2 = r2.a()
            java.lang.Object r2 = r2.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Ldc
            java.lang.String r2 = "settings"
            com.google.gson.i r8 = r8.D(r2)     // Catch: java.lang.Exception -> Ld9
            if (r8 == 0) goto Lc5
            com.google.gson.k r8 = com.avito.android.remote.C34328m0.d(r8)     // Catch: java.lang.Exception -> Ld9
            goto Lc6
        Lc5:
            r8 = r4
        Lc6:
            com.google.gson.i[] r0 = new com.google.gson.i[r0]     // Catch: java.lang.Exception -> Ld9
            r0[r1] = r8     // Catch: java.lang.Exception -> Ld9
            r8 = r0[r1]     // Catch: java.lang.Exception -> Ld9
            if (r8 != 0) goto Ld0
            r8 = r4
            goto Ld6
        Ld0:
            java.lang.Class<com.avito.android.remote.model.widget_settings.Settings> r0 = com.avito.android.remote.model.widget_settings.Settings.class
            java.lang.Object r8 = r10.b(r8, r0)     // Catch: java.lang.Exception -> Ld9
        Ld6:
            com.avito.android.remote.model.widget_settings.Settings r8 = (com.avito.android.remote.model.widget_settings.Settings) r8     // Catch: java.lang.Exception -> Ld9
            r4 = r8
        Ld9:
            r3.setSettings(r4)
        Ldc:
            r4 = r9
        Ldd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.parse.adapter.SerpElementTypeAdapter.deserialize(com.google.gson.i, java.lang.reflect.Type, com.google.gson.g):java.lang.Object");
    }

    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Class<? extends SerpElement>> getMapping() {
        return (Map) this.f254241d.getValue();
    }

    public /* synthetic */ SerpElementTypeAdapter(C36135w2 c36135w2, Map map, T t12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : c36135w2, (i12 & 2) != 0 ? P0.c() : map, (i12 & 4) != 0 ? null : t12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SerpElementTypeAdapter(@Y61.l C36135w2 c36135w2, @Y61.k Map<String, ? extends Class<? extends SerpElement>> map, @Y61.l T t12) {
        super(null, null, null, 7, null);
        this.f254238a = c36135w2;
        this.f254239b = map;
        this.f254240c = t12;
        this.f254241d = C42727D.c(new a());
    }
}

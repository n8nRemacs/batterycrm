package com.avito.android.di.module;

import com.avito.android.C28727b1;
import com.avito.android.remote.model.ActionPromoBanner;
import com.avito.android.remote.model.AttributedHeaderWidget;
import com.avito.android.remote.model.ConstructorAdvertNetworkModel;
import com.avito.android.remote.model.Disclaimer;
import com.avito.android.remote.model.HeaderElement;
import com.avito.android.remote.model.InfoBanner;
import com.avito.android.remote.model.OtherAdverts;
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
import com.avito.android.remote.model.advertising.EmbeddedProfilePromo;
import com.avito.android.remote.model.advertising.MyTargetNetworkBannerItem;
import com.avito.android.remote.model.advertising.YandexNetworkBannerItem;
import com.avito.android.remote.model.alert_banner.AlertBannerWidget;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.cv.CvCreationWidget;
import com.avito.android.remote.model.cv.CvDisplayWidget;
import com.avito.android.remote.model.developments_catalog.serp.FiltersTabs;
import com.avito.android.remote.model.developments_catalog.serp.SerpDevelopment;
import com.avito.android.remote.model.developments_catalog.serp.SerpDevelopmentXl;
import com.avito.android.remote.model.inset.ItemsCarouselWidget;
import com.avito.android.remote.model.location_notification.LocationNotification;
import com.avito.android.remote.model.map_banner.MapBanner;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.replace_main_widget.ReplaceMainPageWidget;
import com.avito.android.remote.model.resizable_service_widget.ResizableServiceWidget;
import com.avito.android.remote.model.safedeal.BxActiveOrdersWidget;
import com.avito.android.remote.model.serp.FeedsWidget;
import com.avito.android.remote.model.serp.HeroBannerWidget;
import com.avito.android.remote.model.serp.SearchPromoHeaderWidget;
import com.avito.android.remote.model.serp.SerpBeduinV2Widget;
import com.avito.android.remote.model.serp.Snippet;
import com.avito.android.remote.model.service_order_widget.ServiceOrderWidget;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.services_menu_widget.ServicesMenuWidget;
import com.avito.android.remote.model.stories.StoriesWidget;
import com.avito.android.remote.model.swipe_sellers.TopSellersSerpWidget;
import com.avito.android.remote.model.user_adverts.DiscountBanner;
import com.avito.android.remote.model.vertical_main.AvitoBlogWidget;
import com.avito.android.remote.model.vertical_main.BrandspaceWidget;
import com.avito.android.remote.model.vertical_main.FeaturedWidget;
import com.avito.android.remote.model.vertical_main.InteractiveTitleWidget;
import com.avito.android.remote.model.vertical_main.MallShortcutsWidget;
import com.avito.android.remote.model.vertical_main.MiniSearchWidget;
import com.avito.android.remote.model.vertical_main.PublishFormWidget;
import com.avito.android.remote.model.vertical_main.RubricatorWidget;
import com.avito.android.remote.model.vertical_main.SearchFormWidget;
import com.avito.android.remote.model.vertical_main.TopSellersWidget;
import com.avito.android.remote.model.vertical_main.UspBannersWidget;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.my.tracker.ads.AdFormat;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ur.InterfaceC49101b;

/* compiled from: CoreOptimalJsonModule_ProvideSerpElementAdapterFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/di/module/D3;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class D3 implements dagger.internal.h<Set<com.google.gson.r>> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f143882e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C28727b1 f143883a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.p f143884b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.p f143885c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ur.e f143886d;

    /* compiled from: CoreOptimalJsonModule_ProvideSerpElementAdapterFactoriesFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/D3$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public D3(@Y61.k C28727b1 c28727b1, @Y61.k dagger.internal.p pVar, @Y61.k dagger.internal.p pVar2, @Y61.k ur.e eVar) {
        this.f143883a = c28727b1;
        this.f143884b = pVar;
        this.f143885c = pVar2;
        this.f143886d = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA;
        h31.e eVarA = dagger.internal.g.a(dagger.internal.w.a(this.f143883a));
        Map map = (Map) this.f143884b.get();
        Map map2 = (Map) this.f143885c.get();
        InterfaceC49101b interfaceC49101b = (InterfaceC49101b) this.f143886d.get();
        f143882e.getClass();
        C30200u3 c30200u3 = C30200u3.f144612a;
        if (interfaceC49101b.d()) {
            optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, SerpElement.class);
            optimalRuntimeTypeAdapterFactoryA.b(SerpAdvert.class, "item");
            optimalRuntimeTypeAdapterFactoryA.b(SerpAdvertXl.class, "xlItem");
            optimalRuntimeTypeAdapterFactoryA.b(SerpBannerContainer.class, AdFormat.BANNER);
            optimalRuntimeTypeAdapterFactoryA.b(SerpBannerContainer.class, "advBannerWidget");
            optimalRuntimeTypeAdapterFactoryA.b(EmbeddedProfilePromo.class, "profilePromo");
            optimalRuntimeTypeAdapterFactoryA.b(EmbeddedAdvBanner.class, "embeddedAdvBanner");
            optimalRuntimeTypeAdapterFactoryA.b(SerpVipAdverts.class, ServiceTypeKt.SERVICE_VIP);
            optimalRuntimeTypeAdapterFactoryA.b(BuzzoolaNetworkBannerItem.class, "buzzoola");
            optimalRuntimeTypeAdapterFactoryA.b(YandexNetworkBannerItem.class, "yandex");
            optimalRuntimeTypeAdapterFactoryA.b(AvitoNetworkBannerItem.class, "avito");
            optimalRuntimeTypeAdapterFactoryA.b(UserAdvert.class, "user_item");
            optimalRuntimeTypeAdapterFactoryA.b(DiscountBanner.class, "discount_banner");
            optimalRuntimeTypeAdapterFactoryA.b(OtherAdverts.class, "other_items");
            optimalRuntimeTypeAdapterFactoryA.b(InfoBanner.class, "info_banner");
            optimalRuntimeTypeAdapterFactoryA.b(Disclaimer.class, ServiceTransportationWidget.DisclaimerField.TYPE);
            optimalRuntimeTypeAdapterFactoryA.b(MyTargetNetworkBannerItem.class, "myTarget");
            optimalRuntimeTypeAdapterFactoryA.b(Snippet.class, "snippet");
            optimalRuntimeTypeAdapterFactoryA.b(SerpWarning.class, ConstraintKt.WARNING);
            optimalRuntimeTypeAdapterFactoryA.b(SerpAdvertGroupTitle.class, "groupTitle");
            optimalRuntimeTypeAdapterFactoryA.b(SerpAdvertEmptyPlaceholder.class, ChannelContext.Item.PLACEHOLDER);
            optimalRuntimeTypeAdapterFactoryA.b(HeaderElement.class, "header");
            optimalRuntimeTypeAdapterFactoryA.b(WitcherElement.class, "witcher");
            optimalRuntimeTypeAdapterFactoryA.b(LocationNotification.class, "laasTooltip");
            optimalRuntimeTypeAdapterFactoryA.b(MapBanner.class, "mapBanner");
            optimalRuntimeTypeAdapterFactoryA.b(ResizableServiceWidget.class, "resizableServiceWidget");
            optimalRuntimeTypeAdapterFactoryA.b(BxActiveOrdersWidget.class, "activeOrdersWidget");
            optimalRuntimeTypeAdapterFactoryA.b(StoriesWidget.class, "storiesWidget");
            optimalRuntimeTypeAdapterFactoryA.b(FeedsWidget.class, "feedsWidget");
            optimalRuntimeTypeAdapterFactoryA.b(SerpDevelopment.class, "developmentsItem");
            optimalRuntimeTypeAdapterFactoryA.b(SellerElement.class, "sellerItem");
            optimalRuntimeTypeAdapterFactoryA.b(SearchFormWidget.class, "searchFormWidget");
            optimalRuntimeTypeAdapterFactoryA.b(PublishFormWidget.class, "publishFormWidget");
            optimalRuntimeTypeAdapterFactoryA.b(ReformulationsWidget.class, "reformulationsWidget");
            optimalRuntimeTypeAdapterFactoryA.b(FeaturedWidget.class, "itemsWidget");
            optimalRuntimeTypeAdapterFactoryA.b(ActionPromoBanner.class, "actionPromoBanner");
            optimalRuntimeTypeAdapterFactoryA.b(FeaturedWidget.class, "developmentsCatalog");
            optimalRuntimeTypeAdapterFactoryA.b(BrandspaceWidget.class, "brandspaceWidget");
            optimalRuntimeTypeAdapterFactoryA.b(AvitoBlogWidget.class, "avitoBlogWidget");
            optimalRuntimeTypeAdapterFactoryA.b(TopSellersWidget.class, "topSellersWidget");
            optimalRuntimeTypeAdapterFactoryA.b(TopSellersSerpWidget.class, "topSellersSwipe");
            optimalRuntimeTypeAdapterFactoryA.b(CvCreationWidget.class, "cvCreateWidget");
            optimalRuntimeTypeAdapterFactoryA.b(CvDisplayWidget.class, "cvDisplayWidget");
            optimalRuntimeTypeAdapterFactoryA.b(AlertBannerWidget.class, "alertBanner");
            optimalRuntimeTypeAdapterFactoryA.b(SerpBeduinV2Widget.class, "beduinV2ContentWidget");
            optimalRuntimeTypeAdapterFactoryA.b(ConstructorAdvertNetworkModel.class, "itemConstructorized");
            optimalRuntimeTypeAdapterFactoryA.b(RubricatorWidget.class, "rubricatorWidget");
            optimalRuntimeTypeAdapterFactoryA.b(UspBannersWidget.class, "uspBannerWidget");
            optimalRuntimeTypeAdapterFactoryA.b(MallShortcutsWidget.class, "mallShortcutsWidget");
            optimalRuntimeTypeAdapterFactoryA.b(SerpDevelopment.class, "development");
            optimalRuntimeTypeAdapterFactoryA.b(FiltersTabs.class, "filtersTabs");
            optimalRuntimeTypeAdapterFactoryA.b(SerpDevelopmentXl.class, "xlDevelopment");
            optimalRuntimeTypeAdapterFactoryA.b(InteractiveTitleWidget.class, "interactiveTitleWidget");
            optimalRuntimeTypeAdapterFactoryA.b(BeduinItemElement.class, "beduin_item");
            optimalRuntimeTypeAdapterFactoryA.b(ReplaceMainPageWidget.class, "replaceMainPageWidget");
            optimalRuntimeTypeAdapterFactoryA.b(MiniSearchWidget.class, "miniSearchWidget");
            optimalRuntimeTypeAdapterFactoryA.b(SerpDevelopment.class, "brandspaceItem");
            optimalRuntimeTypeAdapterFactoryA.b(ServicesMenuWidget.class, "servicesMenuWidget");
            optimalRuntimeTypeAdapterFactoryA.b(ItemsCarouselWidget.class, "itemsCarouselWidget");
            optimalRuntimeTypeAdapterFactoryA.b(HeroBannerWidget.class, "heroBannerWidget");
            optimalRuntimeTypeAdapterFactoryA.b(ServiceOrderWidget.class, "serviceOrderWidget");
            optimalRuntimeTypeAdapterFactoryA.b(AttributedHeaderWidget.class, "attributedHeader");
            com.avito.android.Z0 z02 = (com.avito.android.Z0) eVarA.get();
            z02.getClass();
            kotlin.reflect.n<Object> nVar = com.avito.android.Z0.f67595D[10];
            if (((Boolean) z02.f67610m.a().invoke()).booleanValue()) {
                optimalRuntimeTypeAdapterFactoryA.b(SearchPromoHeaderWidget.class, "searchPromoHeaderWidget");
            }
            for (Map.Entry entry : map.entrySet()) {
                optimalRuntimeTypeAdapterFactoryA.b((Class) entry.getValue(), (String) entry.getKey());
            }
        } else {
            OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA2 = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, SerpElement.class);
            for (Map.Entry entry2 : map2.entrySet()) {
                optimalRuntimeTypeAdapterFactoryA2.b((Class) entry2.getValue(), (String) entry2.getKey());
            }
            optimalRuntimeTypeAdapterFactoryA = optimalRuntimeTypeAdapterFactoryA2;
        }
        return Collections.singleton(optimalRuntimeTypeAdapterFactoryA);
    }
}

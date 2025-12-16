package com.avito.android.serp.adapter;

import Au0.InterfaceC13083a;
import Bv0.InterfaceC13189a;
import Cr0.C13347a;
import Ix0.InterfaceC14171a;
import Jr0.InterfaceC14241a;
import as0.C24171b;
import com.avito.android.R;
import com.avito.android.advertising.adapter.CommercialBannerItem;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.gig_snippet.models.GigShiftsWidgetItem;
import com.avito.android.promo_snippet.models.GigPromoSnippetWidget;
import com.avito.android.remote.model.ActionPromoBanner;
import com.avito.android.remote.model.AddAddressSuggest;
import com.avito.android.remote.model.AttributedHeaderWidget;
import com.avito.android.remote.model.ConstructorAdvertNetworkModel;
import com.avito.android.remote.model.FloatingPromoWidget;
import com.avito.android.remote.model.HeaderElement;
import com.avito.android.remote.model.ReformulationsWidget;
import com.avito.android.remote.model.SellerElement;
import com.avito.android.remote.model.SerpAdvert;
import com.avito.android.remote.model.SerpAdvertEmptyPlaceholder;
import com.avito.android.remote.model.SerpAdvertGroupTitle;
import com.avito.android.remote.model.SerpAdvertXl;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SerpVipAdverts;
import com.avito.android.remote.model.SerpWarning;
import com.avito.android.remote.model.WitcherElement;
import com.avito.android.remote.model.advertising.EmbeddedAdvBanner;
import com.avito.android.remote.model.advertising.EmbeddedProfilePromo;
import com.avito.android.remote.model.alert_banner.AlertBannerWidget;
import com.avito.android.remote.model.auto_model.AutoModelWidget;
import com.avito.android.remote.model.cv.CvCreationWidget;
import com.avito.android.remote.model.cv.CvDisplayWidget;
import com.avito.android.remote.model.developments_catalog.serp.FiltersTabs;
import com.avito.android.remote.model.developments_catalog.serp.SerpDevelopment;
import com.avito.android.remote.model.developments_catalog.serp.SerpDevelopmentXl;
import com.avito.android.remote.model.gallery.GalleryHeaderWidget;
import com.avito.android.remote.model.inset.ItemsCarouselWidget;
import com.avito.android.remote.model.location_notification.LocationNotification;
import com.avito.android.remote.model.map_banner.MapBanner;
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
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.vertical_main.AvitoBlogWidget;
import com.avito.android.remote.model.vertical_main.BrandspaceWidget;
import com.avito.android.remote.model.vertical_main.CollectionsRecommendationWidget;
import com.avito.android.remote.model.vertical_main.FeaturedWidget;
import com.avito.android.remote.model.vertical_main.FilterFormWidget;
import com.avito.android.remote.model.vertical_main.InteractiveTitleWidget;
import com.avito.android.remote.model.vertical_main.MallShortcutsWidget;
import com.avito.android.remote.model.vertical_main.MiniSearchWidget;
import com.avito.android.remote.model.vertical_main.RubricatorWidget;
import com.avito.android.remote.model.vertical_main.SellersCarouselWidget;
import com.avito.android.remote.model.vertical_main.StyleBlock;
import com.avito.android.remote.model.vertical_main.StyleBlockType;
import com.avito.android.remote.model.vertical_main.TopSellersWidget;
import com.avito.android.remote.model.vertical_main.UspBannersWidget;
import com.avito.android.serp.adapter.InterfaceC34904z0;
import com.avito.android.serp.adapter.alert_banner.AlertBannerItem;
import com.avito.android.serp.adapter.alert_banner.c;
import com.avito.android.serp.adapter.beduin_v2.BeduinV2Element;
import com.avito.android.serp.adapter.carousel_widget.InterfaceC34693c;
import com.avito.android.serp.adapter.empty_search.EmptySearchElement;
import com.avito.android.serp.adapter.gig_promo_snippet.GigPromoSnippetItem;
import com.avito.android.serp.adapter.gig_shifts.GigShiftsItem;
import com.avito.android.serp.adapter.top_sellers_serp.TopSellersSerpWidgetItem;
import com.avito.android.serp.adapter.vertical_main.collectionsRecommendations.CollectionsRecommendationWidgetItem;
import com.avito.android.serp.adapter.vertical_main.top_sellers.TopSellersWidgetItem;
import com.avito.android.serp.adapter.witcher.InterfaceC34887f;
import com.avito.android.visual_rubricator.ShortcutsWidget;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import tn0.InterfaceC48695a;

/* compiled from: SerpElementItemConverter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/M0;", "Lcom/avito/android/serp/adapter/L0;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class M0 implements L0 {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.constructor_advert.ui.serp.constructor.f f268519A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.avito_blog.g f268520B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.top_sellers.d f268521C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.visual_rubricator.N f268522D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14171a f268523E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.top_sellers_serp.c f268524F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.cv.cv_creation.c f268525G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.cv.cv_display.c f268526H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.alert_banner.c f268527I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.home_section_tab.b f268528J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.beduin_v2.h f268529K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.sale.d f268530L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34693c f268531M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f268532N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final Set<com.avito.android.serp.b<?, ?>> f268533O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C13347a f268534P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.usp_banner_widget.a f268535Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.mall_shortcuts.c f268536R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.interactive_title_widget.a f268537S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.suggest_address.s f268538T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.action_promo_banner.c f268539U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.promo.c f268540V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.replace_main_widget.d f268541W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.gallery.e f268542X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.floating_promo_widget.d f268543Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.auto_model_widget.c f268544Z;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34904z0 f268545a;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.mini_search_widget.f f268546a0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.advert_xl.D f268547b;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.model_card.c f268548b0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final gr0.b f268549c;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.mini_menu.s f268550c0;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.warning.a f268551d;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.gig_snippet.f f268552d0;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.snippet.c f268553e;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.promo_snippet.a f268554e0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.empty_search.d f268555f;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.slider.c f268556f0;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.beduin_v2.a f268557g;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.collectionsRecommendations.d f268558g0;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.title.c f268559h;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final C24171b f268560h0;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.empty_placeholder.f f268561i;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.attributed_header_widget.c f268562i0;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34730e0 f268563j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34887f f268564k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.location_notification.e f268565l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14241a f268566m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final H0 f268567n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final J0 f268568o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34680a0 f268569p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.map_banner.c f268570q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.brandspace_widget.d f268571r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.i f268572s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.category_vertical_filter.e f268573t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13083a f268574u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13189a f268575v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.reformulations.b f268576w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48695a f268577x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final I3.a f268578y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.featured.b f268579z;

    /* compiled from: SerpElementItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f268580a;

        static {
            int[] iArr = new int[StyleBlockType.values().length];
            try {
                iArr[StyleBlockType.CATEGORY_SEARCH_WIDGET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f268580a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public M0(@Y61.k InterfaceC34904z0 interfaceC34904z0, @Y61.k com.avito.android.serp.adapter.advert_xl.D d12, @Y61.k gr0.b bVar, @Y61.k com.avito.android.serp.adapter.warning.a aVar, @Y61.k com.avito.android.serp.adapter.snippet.c cVar, @Y61.k com.avito.android.serp.adapter.empty_search.d dVar, @Y61.k com.avito.android.serp.adapter.beduin_v2.a aVar2, @Y61.k com.avito.android.serp.adapter.title.c cVar2, @Y61.k com.avito.android.serp.adapter.empty_placeholder.f fVar, @Y61.k InterfaceC34730e0 interfaceC34730e0, @Y61.k InterfaceC34887f interfaceC34887f, @Y61.k com.avito.android.serp.adapter.location_notification.e eVar, @Y61.k InterfaceC14241a interfaceC14241a, @Y61.k H0 h02, @Y61.k J0 j02, @Y61.k InterfaceC34680a0 interfaceC34680a0, @Y61.k com.avito.android.serp.adapter.map_banner.c cVar3, @Y61.k com.avito.android.serp.adapter.brandspace_widget.d dVar2, @Y61.k com.avito.android.serp.adapter.vertical_main.i iVar, @Y61.k com.avito.android.serp.adapter.vertical_main.category_vertical_filter.e eVar2, @Y61.k InterfaceC13083a interfaceC13083a, @Y61.k InterfaceC13189a interfaceC13189a, @Y61.k com.avito.android.serp.adapter.reformulations.b bVar2, @Y61.k InterfaceC48695a interfaceC48695a, @Y61.k I3.a aVar3, @Y61.k com.avito.android.serp.adapter.vertical_main.featured.b bVar3, @Y61.k com.avito.android.constructor_advert.ui.serp.constructor.f fVar2, @Y61.k com.avito.android.serp.adapter.vertical_main.avito_blog.g gVar, @Y61.k com.avito.android.serp.adapter.vertical_main.top_sellers.d dVar3, @Y61.k com.avito.android.visual_rubricator.N n12, @Y61.k InterfaceC14171a interfaceC14171a, @Y61.k com.avito.android.serp.adapter.top_sellers_serp.c cVar4, @Y61.k com.avito.android.serp.adapter.vertical_main.cv.cv_creation.c cVar5, @Y61.k com.avito.android.serp.adapter.vertical_main.cv.cv_display.c cVar6, @Y61.k com.avito.android.serp.adapter.alert_banner.c cVar7, @Y61.k com.avito.android.serp.adapter.home_section_tab.b bVar4, @Y61.k com.avito.android.serp.adapter.beduin_v2.h hVar, @Y61.k com.avito.android.serp.adapter.sale.d dVar4, @Y61.k InterfaceC34693c interfaceC34693c, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k Set<? extends com.avito.android.serp.b<?, ?>> set, @Y61.k C13347a c13347a, @Y61.k com.avito.android.serp.adapter.vertical_main.usp_banner_widget.a aVar4, @Y61.k com.avito.android.serp.adapter.vertical_main.mall_shortcuts.c cVar8, @Y61.k com.avito.android.serp.adapter.vertical_main.interactive_title_widget.a aVar5, @Y61.k com.avito.android.serp.adapter.suggest_address.s sVar, @Y61.k com.avito.android.serp.adapter.action_promo_banner.c cVar9, @Y61.k com.avito.android.serp.adapter.promo.c cVar10, @Y61.k com.avito.android.serp.adapter.replace_main_widget.d dVar5, @Y61.k com.avito.android.serp.adapter.gallery.e eVar3, @Y61.k com.avito.android.serp.adapter.floating_promo_widget.d dVar6, @Y61.k com.avito.android.serp.adapter.auto_model_widget.c cVar11, @Y61.k com.avito.android.serp.adapter.vertical_main.mini_search_widget.f fVar3, @Y61.k com.avito.android.serp.adapter.model_card.c cVar12, @Y61.k com.avito.android.serp.adapter.mini_menu.s sVar2, @Y61.k com.avito.android.gig_snippet.f fVar4, @Y61.k com.avito.android.promo_snippet.a aVar6, @Y61.k com.avito.android.serp.adapter.slider.c cVar13, @Y61.k com.avito.android.serp.adapter.vertical_main.collectionsRecommendations.d dVar7, @Y61.k C24171b c24171b, @Y61.k com.avito.android.serp.adapter.attributed_header_widget.c cVar14) {
        this.f268545a = interfaceC34904z0;
        this.f268547b = d12;
        this.f268549c = bVar;
        this.f268551d = aVar;
        this.f268553e = cVar;
        this.f268555f = dVar;
        this.f268557g = aVar2;
        this.f268559h = cVar2;
        this.f268561i = fVar;
        this.f268563j = interfaceC34730e0;
        this.f268564k = interfaceC34887f;
        this.f268565l = eVar;
        this.f268566m = interfaceC14241a;
        this.f268567n = h02;
        this.f268568o = j02;
        this.f268569p = interfaceC34680a0;
        this.f268570q = cVar3;
        this.f268571r = dVar2;
        this.f268572s = iVar;
        this.f268573t = eVar2;
        this.f268574u = interfaceC13083a;
        this.f268575v = interfaceC13189a;
        this.f268576w = bVar2;
        this.f268577x = interfaceC48695a;
        this.f268578y = aVar3;
        this.f268579z = bVar3;
        this.f268519A = fVar2;
        this.f268520B = gVar;
        this.f268521C = dVar3;
        this.f268522D = n12;
        this.f268523E = interfaceC14171a;
        this.f268524F = cVar4;
        this.f268525G = cVar5;
        this.f268526H = cVar6;
        this.f268527I = cVar7;
        this.f268528J = bVar4;
        this.f268529K = hVar;
        this.f268530L = dVar4;
        this.f268531M = interfaceC34693c;
        this.f268532N = interfaceC28373a;
        this.f268533O = set;
        this.f268534P = c13347a;
        this.f268535Q = aVar4;
        this.f268536R = cVar8;
        this.f268537S = aVar5;
        this.f268538T = sVar;
        this.f268539U = cVar9;
        this.f268540V = cVar10;
        this.f268541W = dVar5;
        this.f268542X = eVar3;
        this.f268543Y = dVar6;
        this.f268544Z = cVar11;
        this.f268546a0 = fVar3;
        this.f268548b0 = cVar12;
        this.f268550c0 = sVar2;
        this.f268552d0 = fVar4;
        this.f268554e0 = aVar6;
        this.f268556f0 = cVar13;
        this.f268558g0 = dVar7;
        this.f268560h0 = c24171b;
        this.f268562i0 = cVar14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v120, types: [com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem] */
    /* JADX WARN: Type inference failed for: r0v121, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v122, types: [com.avito.android.serp.adapter.vertical_main.category_vertical_filter.item.CategoryVerticalFilterItem] */
    /* JADX WARN: Type inference failed for: r3v92, types: [com.avito.android.serp.adapter.vertical_main.category_vertical_filter.e] */
    public static ArrayList b(M0 m02, List list, SerpDisplayType serpDisplayType, String str, String str2, boolean z12, List list2, int i12) throws Throwable {
        ArrayList arrayList;
        boolean z13;
        Throwable th2;
        boolean z14;
        int i13;
        SerpDisplayType serpDisplayType2;
        String str3;
        Throwable th3;
        String str4;
        Object next;
        l1 l1VarB;
        SerpDisplayType serpDisplayType3 = serpDisplayType;
        int i14 = 1;
        boolean z15 = false;
        boolean z16 = (i12 & 2) == 0;
        Throwable th4 = null;
        String str5 = (i12 & 8) != 0 ? null : str2;
        boolean z17 = (i12 & 16) != 0 ? false : z12;
        List list3 = (i12 & 64) != 0 ? C42784z0.f406748b : list2;
        m02.getClass();
        ArrayList arrayList2 = new ArrayList(list.size());
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                Throwable th5 = th4;
                C42745f0.H0();
                throw th5;
            }
            SerpElement serpElement = (SerpElement) obj;
            try {
                if (serpElement instanceof SerpAdvertXl) {
                    try {
                        arrayList2.add(m02.f268547b.a((SerpAdvertXl) serpElement, serpDisplayType3));
                        arrayList = arrayList2;
                        z13 = z17;
                        th2 = th4;
                        z14 = z15;
                        i13 = i14;
                        serpDisplayType2 = serpDisplayType3;
                        str3 = str5;
                    } catch (Throwable th6) {
                        th3 = th6;
                        arrayList = arrayList2;
                        z13 = z17;
                        th2 = th4;
                        z14 = z15;
                        i13 = i14;
                        serpDisplayType2 = serpDisplayType3;
                        str3 = str5;
                        m02.f268532N.c(new NonFatalErrorEvent("Failure during convert serp elements", th3, null, null, 12, null));
                        str5 = str3;
                        z15 = z14;
                        i14 = i13;
                        serpDisplayType3 = serpDisplayType2;
                        z17 = z13;
                        i15 = i16;
                        th4 = th2;
                        arrayList2 = arrayList;
                    }
                } else if (serpElement instanceof SerpAdvert) {
                    arrayList2.add(InterfaceC34904z0.a.a(m02.f268545a, (SerpAdvert) serpElement, z16, false, serpDisplayType, null, 0, null, list3, false, 1520));
                    arrayList = arrayList2;
                    z13 = z17;
                    th2 = th4;
                    z14 = z15;
                    i13 = i14;
                    serpDisplayType2 = serpDisplayType3;
                    str3 = str5;
                } else if (serpElement instanceof SerpVipAdverts) {
                    try {
                        arrayList = arrayList2;
                        z13 = z17;
                        str4 = str5;
                        z14 = z15;
                        i13 = i14;
                        serpDisplayType2 = serpDisplayType3;
                    } catch (Throwable th7) {
                        th = th7;
                        arrayList = arrayList2;
                        z13 = z17;
                        str4 = str5;
                        z14 = z15;
                        i13 = i14;
                        serpDisplayType2 = serpDisplayType3;
                    }
                    try {
                        C42745f0.h(b(m02, ((SerpVipAdverts) serpElement).getAdverts(), serpDisplayType, str, null, false, null, 120), arrayList);
                        str3 = str4;
                        th2 = null;
                    } catch (Throwable th8) {
                        th = th8;
                        th3 = th;
                        str3 = str4;
                        th2 = null;
                        m02.f268532N.c(new NonFatalErrorEvent("Failure during convert serp elements", th3, null, null, 12, null));
                        str5 = str3;
                        z15 = z14;
                        i14 = i13;
                        serpDisplayType3 = serpDisplayType2;
                        z17 = z13;
                        i15 = i16;
                        th4 = th2;
                        arrayList2 = arrayList;
                    }
                } else {
                    arrayList = arrayList2;
                    z13 = z17;
                    str4 = str5;
                    z14 = z15;
                    i13 = i14;
                    serpDisplayType2 = serpDisplayType3;
                    try {
                        boolean z18 = serpElement instanceof CommercialBannerItem;
                        gr0.b bVar = m02.f268549c;
                        if (z18) {
                            arrayList.add(bVar.c((CommercialBannerItem) serpElement, serpDisplayType2));
                        } else if (serpElement instanceof EmbeddedProfilePromo) {
                            arrayList.add(bVar.b((EmbeddedProfilePromo) serpElement, serpDisplayType2));
                        } else if (serpElement instanceof EmbeddedAdvBanner) {
                            arrayList.add(bVar.a((EmbeddedAdvBanner) serpElement, serpDisplayType2));
                        } else if (serpElement instanceof SerpWarning) {
                            arrayList.add(m02.f268551d.a((SerpWarning) serpElement));
                        } else if (serpElement instanceof Snippet) {
                            arrayList.add(m02.f268553e.a((Snippet) serpElement));
                        } else if (serpElement instanceof EmptySearchElement) {
                            arrayList.add(m02.f268555f.a((EmptySearchElement) serpElement));
                        } else if (serpElement instanceof BeduinV2Element) {
                            arrayList.add(m02.f268557g.a((BeduinV2Element) serpElement));
                        } else if (serpElement instanceof SerpAdvertGroupTitle) {
                            arrayList.add(m02.f268559h.a((SerpAdvertGroupTitle) serpElement));
                        } else if (serpElement instanceof SerpAdvertEmptyPlaceholder) {
                            arrayList.add(m02.f268561i.a((SerpAdvertEmptyPlaceholder) serpElement));
                        } else if (serpElement instanceof HeaderElement) {
                            arrayList.add(m02.f268563j.a((HeaderElement) serpElement));
                        } else if (serpElement instanceof WitcherElement) {
                            arrayList.add(m02.f268564k.a((WitcherElement) serpElement, z13));
                        } else if (serpElement instanceof LocationNotification) {
                            arrayList.add(m02.f268565l.a((LocationNotification) serpElement));
                        } else if (serpElement instanceof SellerElement) {
                            arrayList.add(m02.f268566m.a((SellerElement) serpElement));
                        } else if (serpElement instanceof MapBanner) {
                            arrayList.add(m02.f268570q.a((MapBanner) serpElement));
                        } else {
                            if (serpElement instanceof FeaturedWidget) {
                                try {
                                    str3 = str4;
                                } catch (Throwable th9) {
                                    th = th9;
                                    str3 = str4;
                                }
                                try {
                                    C42745f0.h(m02.f268579z.a((FeaturedWidget) serpElement, i15, str3), arrayList);
                                } catch (Throwable th10) {
                                    th = th10;
                                    th3 = th;
                                    th2 = null;
                                    m02.f268532N.c(new NonFatalErrorEvent("Failure during convert serp elements", th3, null, null, 12, null));
                                    str5 = str3;
                                    z15 = z14;
                                    i14 = i13;
                                    serpDisplayType3 = serpDisplayType2;
                                    z17 = z13;
                                    i15 = i16;
                                    th4 = th2;
                                    arrayList2 = arrayList;
                                }
                            } else {
                                str3 = str4;
                                try {
                                    if (serpElement instanceof BrandspaceWidget) {
                                        arrayList.add(m02.f268571r.a((BrandspaceWidget) serpElement));
                                    } else if (serpElement instanceof ServiceOrderWidget) {
                                        arrayList.add(m02.f268574u.a((ServiceOrderWidget) serpElement));
                                    } else if (serpElement instanceof ServiceTransportationWidget) {
                                        try {
                                            th2 = null;
                                        } catch (Throwable th11) {
                                            th = th11;
                                            th2 = null;
                                        }
                                        try {
                                            arrayList.add(m02.f268575v.a((ServiceTransportationWidget) serpElement, null, z13));
                                        } catch (Throwable th12) {
                                            th = th12;
                                            th3 = th;
                                            m02.f268532N.c(new NonFatalErrorEvent("Failure during convert serp elements", th3, null, null, 12, null));
                                            str5 = str3;
                                            z15 = z14;
                                            i14 = i13;
                                            serpDisplayType3 = serpDisplayType2;
                                            z17 = z13;
                                            i15 = i16;
                                            th4 = th2;
                                            arrayList2 = arrayList;
                                        }
                                    } else {
                                        th2 = null;
                                        if (serpElement instanceof FilterFormWidget) {
                                            ?? A12 = m02.f268572s.a((FilterFormWidget) serpElement, str3);
                                            StyleBlock styleBlock = ((FilterFormWidget) serpElement).getStyleBlock();
                                            StyleBlockType type = styleBlock != null ? styleBlock.getType() : null;
                                            if ((type == null ? -1 : a.f268580a[type.ordinal()]) == i13) {
                                                A12 = m02.f268573t.a((FilterFormWidget) serpElement, A12);
                                            }
                                            arrayList.add(A12);
                                        } else if (serpElement instanceof RubricatorWidget) {
                                            arrayList.add(m02.f268577x.a((RubricatorWidget) serpElement, i15));
                                        } else if (serpElement instanceof BxActiveOrdersWidget) {
                                            arrayList.add(m02.f268578y.a((BxActiveOrdersWidget) serpElement));
                                        } else if (serpElement instanceof ReformulationsWidget) {
                                            arrayList.add(m02.f268576w.a((ReformulationsWidget) serpElement));
                                        } else if (serpElement instanceof ConstructorAdvertNetworkModel) {
                                            ConstructorAdvertItem constructorAdvertItemA = m02.f268519A.a((ConstructorAdvertNetworkModel) serpElement, serpDisplayType2, false, "", -1, "", null);
                                            arrayList.add(constructorAdvertItemA != null ? com.avito.android.serp.adapter.constructor.z.a(constructorAdvertItemA, serpDisplayType2) : null);
                                        } else if (serpElement instanceof AutoModelWidget) {
                                            arrayList.add(m02.f268544Z.a((AutoModelWidget) serpElement));
                                        } else if (serpElement instanceof AvitoBlogWidget) {
                                            arrayList.add(m02.f268520B.a((AvitoBlogWidget) serpElement, i15));
                                        } else if (serpElement instanceof TopSellersWidget) {
                                            com.avito.android.serp.adapter.vertical_main.top_sellers.d dVar = m02.f268521C;
                                            TopSellersWidget topSellersWidget = (TopSellersWidget) serpElement;
                                            dVar.getClass();
                                            arrayList.add(new TopSellersWidgetItem(com.avito.android.bxcontent.mvi.entity.f.k(dVar.f273250a, new StringBuilder("topSellersWidget")), topSellersWidget.getTitle(), topSellersWidget.getSellers(), topSellersWidget.getAnalytics(), str3 != null ? Collections.singletonMap("mcid", str3) : null, topSellersWidget.getF157695e()));
                                        } else if (serpElement instanceof ShortcutsWidget) {
                                            arrayList.add(m02.f268522D.c((ShortcutsWidget) serpElement, str3));
                                        } else if (serpElement instanceof SerpDevelopmentXl) {
                                            arrayList.add(m02.f268568o.a((SerpDevelopmentXl) serpElement, serpDisplayType2));
                                        } else if (serpElement instanceof SerpDevelopment) {
                                            arrayList.add(m02.f268567n.a((SerpDevelopment) serpElement, serpDisplayType2));
                                        } else if (serpElement instanceof FiltersTabs) {
                                            arrayList.add(m02.f268569p.a((FiltersTabs) serpElement));
                                        } else if (serpElement instanceof StoriesWidget) {
                                            arrayList.add(m02.f268523E.a((StoriesWidget) serpElement, str3, z13));
                                        } else if (serpElement instanceof TopSellersSerpWidget) {
                                            com.avito.android.serp.adapter.top_sellers_serp.c cVar = m02.f268524F;
                                            TopSellersSerpWidget topSellersSerpWidget = (TopSellersSerpWidget) serpElement;
                                            cVar.getClass();
                                            arrayList.add(new TopSellersSerpWidgetItem("topSellersSerpWidget" + cVar.f272468a.a(), topSellersSerpWidget.getTitle(), topSellersSerpWidget.getSellers(), topSellersSerpWidget.getF157695e()));
                                        } else if (serpElement instanceof CvCreationWidget) {
                                            arrayList.add(m02.f268525G.a((CvCreationWidget) serpElement));
                                        } else if (serpElement instanceof CvDisplayWidget) {
                                            arrayList.add(m02.f268526H.a((CvDisplayWidget) serpElement));
                                        } else if (serpElement instanceof AlertBannerWidget) {
                                            AlertBannerWidget alertBannerWidget = (AlertBannerWidget) serpElement;
                                            m02.f268527I.getClass();
                                            String id2 = alertBannerWidget.getId();
                                            AttributedText title = alertBannerWidget.getTitle();
                                            AttributedText body = alertBannerWidget.getBody();
                                            int i17 = c.a.f268909a[alertBannerWidget.getStyle().ordinal()];
                                            arrayList.add(new AlertBannerItem(id2, title, body, i17 != i13 ? i17 != 2 ? i17 != 3 ? i17 != 5 ? i17 != 6 ? R.attr.alertBannerDefault : R.attr.alertBannerWhite : R.attr.alertBannerSuccess : R.attr.alertBannerWarning : R.attr.alertBannerInfo : R.attr.alertBannerDanger, alertBannerWidget.getAction(), alertBannerWidget.getLink()));
                                        } else if (serpElement instanceof FeedsWidget) {
                                            arrayList.add(m02.f268528J.a((FeedsWidget) serpElement));
                                        } else if (serpElement instanceof SerpBeduinV2Widget) {
                                            arrayList.add(m02.f268529K.a((SerpBeduinV2Widget) serpElement));
                                        } else if (serpElement instanceof ResizableServiceWidget) {
                                            arrayList.add(m02.f268534P.a((ResizableServiceWidget) serpElement));
                                        } else if (serpElement instanceof UspBannersWidget) {
                                            arrayList.add(m02.f268535Q.a((UspBannersWidget) serpElement));
                                        } else if (serpElement instanceof MallShortcutsWidget) {
                                            arrayList.add(m02.f268536R.a((MallShortcutsWidget) serpElement));
                                        } else if (serpElement instanceof SalesHeaderWidget) {
                                            arrayList.add(m02.f268530L.a((SalesHeaderWidget) serpElement));
                                        } else if (serpElement instanceof InteractiveTitleWidget) {
                                            arrayList.add(m02.f268537S.a((InteractiveTitleWidget) serpElement));
                                        } else if (serpElement instanceof ItemsCarouselWidget) {
                                            arrayList.add(m02.f268531M.a((ItemsCarouselWidget) serpElement, z13, z14, i15));
                                        } else if (serpElement instanceof AddAddressSuggest) {
                                            arrayList.add(m02.f268538T.a((AddAddressSuggest) serpElement));
                                        } else if (serpElement instanceof ActionPromoBanner) {
                                            arrayList.add(m02.f268539U.a((ActionPromoBanner) serpElement));
                                        } else if (serpElement instanceof PromoHeaderWidget) {
                                            arrayList.add(m02.f268540V.a((PromoHeaderWidget) serpElement, str3));
                                        } else if (serpElement instanceof ReplaceMainPageWidget) {
                                            arrayList.add(m02.f268541W.a((ReplaceMainPageWidget) serpElement));
                                        } else if (serpElement instanceof GalleryHeaderWidget) {
                                            arrayList.add(m02.f268542X.a((GalleryHeaderWidget) serpElement));
                                        } else if (serpElement instanceof FloatingPromoWidget) {
                                            arrayList.add(m02.f268543Y.a((FloatingPromoWidget) serpElement));
                                        } else if (serpElement instanceof MiniSearchWidget) {
                                            arrayList.add(m02.f268546a0.a((MiniSearchWidget) serpElement));
                                        } else if (serpElement instanceof ModelCardEntryWidgetEntity) {
                                            arrayList.add(m02.f268548b0.a((ModelCardEntryWidgetEntity) serpElement));
                                        } else if (serpElement instanceof ServicesMenuWidget) {
                                            m02.f268550c0.getClass();
                                            arrayList.add(com.avito.android.serp.adapter.mini_menu.s.a((ServicesMenuWidget) serpElement));
                                        } else if (serpElement instanceof SliderWidget) {
                                            arrayList.add(m02.f268556f0.a((SliderWidget) serpElement, z14));
                                        } else if (serpElement instanceof CollectionsRecommendationWidget) {
                                            com.avito.android.serp.adapter.vertical_main.collectionsRecommendations.d dVar2 = m02.f268558g0;
                                            CollectionsRecommendationWidget collectionsRecommendationWidget = (CollectionsRecommendationWidget) serpElement;
                                            dVar2.getClass();
                                            arrayList.add(new CollectionsRecommendationWidgetItem(com.avito.android.bxcontent.mvi.entity.f.k(dVar2.f272710a, new StringBuilder("collectionsRecommendationsWidget")), collectionsRecommendationWidget.getTitle(), collectionsRecommendationWidget.getBadgeInfo(), collectionsRecommendationWidget.getItems(), collectionsRecommendationWidget.getAnalytics(), collectionsRecommendationWidget.getF157695e()));
                                        } else if (serpElement instanceof GigShiftsWidgetItem) {
                                            arrayList.add(new GigShiftsItem(UUID.randomUUID().toString(), m02.f268552d0.a((GigShiftsWidgetItem) serpElement), ((GigShiftsWidgetItem) serpElement).getAnalytics(), ((GigShiftsWidgetItem) serpElement).getF157695e()));
                                        } else if (serpElement instanceof GigPromoSnippetWidget) {
                                            arrayList.add(new GigPromoSnippetItem(UUID.randomUUID().toString(), m02.f268554e0.a((GigPromoSnippetWidget) serpElement), ((GigPromoSnippetWidget) serpElement).getAnalytics(), ((GigPromoSnippetWidget) serpElement).getF157695e()));
                                        } else if (serpElement instanceof SellersCarouselWidget) {
                                            arrayList.add(m02.f268560h0.a((SellersCarouselWidget) serpElement));
                                        } else if (serpElement instanceof AttributedHeaderWidget) {
                                            arrayList.add(m02.f268562i0.a((AttributedHeaderWidget) serpElement));
                                        } else {
                                            Iterator it = m02.f268533O.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    next = null;
                                                    break;
                                                }
                                                next = it.next();
                                                if (kotlin.jvm.internal.L.f(((com.avito.android.serp.b) next).a(), serpElement.getClass())) {
                                                    break;
                                                }
                                            }
                                            com.avito.android.serp.b bVar2 = (com.avito.android.serp.b) next;
                                            if (bVar2 != null) {
                                                try {
                                                    l1VarB = bVar2.b(serpElement, str, str3, i15);
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th3 = th;
                                                    m02.f268532N.c(new NonFatalErrorEvent("Failure during convert serp elements", th3, null, null, 12, null));
                                                    str5 = str3;
                                                    z15 = z14;
                                                    i14 = i13;
                                                    serpDisplayType3 = serpDisplayType2;
                                                    z17 = z13;
                                                    i15 = i16;
                                                    th4 = th2;
                                                    arrayList2 = arrayList;
                                                }
                                            } else {
                                                l1VarB = null;
                                            }
                                            arrayList.add(l1VarB);
                                        }
                                    }
                                } catch (Throwable th14) {
                                    th = th14;
                                    th2 = null;
                                    th3 = th;
                                    m02.f268532N.c(new NonFatalErrorEvent("Failure during convert serp elements", th3, null, null, 12, null));
                                    str5 = str3;
                                    z15 = z14;
                                    i14 = i13;
                                    serpDisplayType3 = serpDisplayType2;
                                    z17 = z13;
                                    i15 = i16;
                                    th4 = th2;
                                    arrayList2 = arrayList;
                                }
                            }
                            th2 = null;
                        }
                        str3 = str4;
                        th2 = null;
                    } catch (Throwable th15) {
                        th = th15;
                        str3 = str4;
                    }
                }
            } catch (Throwable th16) {
                th = th16;
                arrayList = arrayList2;
                z13 = z17;
                th2 = th4;
                z14 = z15;
                i13 = i14;
                serpDisplayType2 = serpDisplayType3;
                str3 = str5;
            }
            str5 = str3;
            z15 = z14;
            i14 = i13;
            serpDisplayType3 = serpDisplayType2;
            z17 = z13;
            i15 = i16;
            th4 = th2;
            arrayList2 = arrayList;
        }
        return C42745f0.C(arrayList2);
    }

    @Override // com.avito.android.serp.adapter.L0
    @Y61.k
    public final ArrayList a(@Y61.k List list, @Y61.k SerpDisplayType serpDisplayType, @Y61.l String str, @Y61.l String str2, boolean z12, @Y61.k List list2) {
        return b(this, list, serpDisplayType, str, str2, z12, list2, 2);
    }
}

package com.avito.android.advert_core.analytics;

import D8.d;
import Uc.C15507a;
import Uc.C15508b;
import Vh0.C15680b;
import Vh0.C15682d;
import Vh0.C15683e;
import Y61.k;
import Y61.l;
import ac.C19864a;
import c8.g;
import c9.C26958a;
import c9.C26959b;
import com.avito.android.C29640d;
import com.avito.android.V;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.account.E;
import com.avito.android.adapter.analytic.GalleryFromBlock;
import com.avito.android.advert_core.analytics.additional_seller.HouseReviewsShowActions;
import com.avito.android.advert_core.analytics.address.GeoFromBlock;
import com.avito.android.advert_core.analytics.auto_ownership_discrepancy.AutoParametersIconEventType;
import com.avito.android.advert_core.analytics.branding_gallery.AnalyticsBrandingType;
import com.avito.android.advert_core.analytics.flats_groups.AboutDeveloperFlatsAppearsEvent;
import com.avito.android.advert_core.analytics.flats_groups.AboutDeveloperFlatsButtonClickEvent;
import com.avito.android.advert_core.analytics.flats_groups.FlatsButtonClickEvent;
import com.avito.android.advert_core.analytics.modelspecs.ModelCardFrom;
import com.avito.android.advert_core.analytics.ownership_cost.OwnershipCostEventBlockType;
import com.avito.android.advert_core.analytics.recomendations.ExpandableTitleClickEvent;
import com.avito.android.advert_core.analytics.similars.ClickSimilarItemFavoritesAction;
import com.avito.android.advert_core.analytics.toolbar.BackFromPage;
import com.avito.android.advert_core.analytics.toolbar.NoteAction;
import com.avito.android.advert_core.contactbar.SourceScreen;
import com.avito.android.advert_core.development_offers.analytics.PageScrollDirection;
import com.avito.android.advert_core.offers.analytics.c;
import com.avito.android.advert_core.sellerprofile.ShowSellersProfileSource;
import com.avito.android.advertising.analytics.events.BannerEvent;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import com.avito.android.advertising.loaders.j;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.C28435q;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.analytics.event.M;
import com.avito.android.analytics.event.N;
import com.avito.android.analytics.event.W0;
import com.avito.android.analytics.event.h1;
import com.avito.android.analytics.event.i1;
import com.avito.android.analytics.event.r;
import com.avito.android.analytics.event.service_booking.SbSignUpEvent;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.analytics.statsd.y;
import com.avito.android.analytics_ratings_reviews.ReviewsOpenPageFrom;
import com.avito.android.permissions.z;
import com.avito.android.rec.ScreenSource;
import com.avito.android.remote.model.AdditionalSeller;
import com.avito.android.remote.model.AdditionalSellerAnalyticsInfo;
import com.avito.android.remote.model.AdjustParameters;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertSeller;
import com.avito.android.remote.model.AdvertStatus;
import com.avito.android.remote.model.CategoryIds;
import com.avito.android.remote.model.Developer;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.RenderMetadata;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.advert_details.realty.ConsultationAfterIceBreaker;
import com.avito.android.remote.model.advert_details.realty.DevelopmentsAdvice;
import com.avito.android.remote.model.item_reviews.ItemReviews;
import com.avito.android.remote.model.item_reviews.ItemReviewsEntry;
import com.avito.android.remote.model.item_reviews.ItemReviewsMain;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35793f6;
import com.avito.android.util.C35800g5;
import com.avito.android.util.Kundle;
import com.avito.android.util.O2;
import com.yandex.metrica.ValidationException;
import com.yandex.metrica.YandexMetrica;
import d8.C39529a;
import d9.C39534a;
import e8.C39963a;
import e9.C39970a;
import f8.C40243a;
import g8.C40545a;
import g8.b;
import g9.C40548a;
import g9.C40549b;
import h9.C40783a;
import i8.C41239a;
import i9.C41252a;
import i9.h;
import i9.i;
import i9.m;
import i9.n;
import i9.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import k8.C42536a;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l8.C43598a;
import m8.C43923a;
import n8.C44211a;
import o8.u;
import p8.C46915a;
import p9.C46922a;
import p9.e;
import r8.C47507a;
import s8.C48012a;
import sc.C48156e;
import sc.C48158g;
import u8.C48861a;
import v8.C49178a;
import y8.C50080a;
import y8.C50081b;
import z8.C50394b;

/* compiled from: AdvertDetailsAnalyticsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert_core/analytics/AdvertDetailsAnalyticsInteractorImpl;", "Lcom/avito/android/advert_core/analytics/a;", "LF9/a;", "Lp9/e;", "Lcom/avito/android/advertising/loaders/j;", "Lcom/avito/android/V;", "MultiItemSource", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertDetailsAnalyticsInteractorImpl implements a, F9.a, e, j, V {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f82748b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c f82749c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final E f82750d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.analytics.provider.e f82751e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public TreeClickStreamParent f82752f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C29640d f82753g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final z f82754h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C19864a f82755i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final c8.e f82756j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j f82757k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ V f82758l;

    /* renamed from: m, reason: collision with root package name */
    public long f82759m;

    /* renamed from: o, reason: collision with root package name */
    @l
    public String f82761o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f82762p;

    /* renamed from: q, reason: collision with root package name */
    public AdvertDetails f82763q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public String f82764r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public String f82765s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public String f82766t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public String f82767u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f82769w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f82770x;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final C35793f6 f82760n = new C35793f6();

    /* renamed from: v, reason: collision with root package name */
    @k
    public final C48156e f82768v = C48156e.f437918a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertDetailsAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/analytics/AdvertDetailsAnalyticsInteractorImpl$MultiItemSource;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MultiItemSource {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ MultiItemSource[] f82771b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f82772c;

        static {
            MultiItemSource[] multiItemSourceArr = {new MultiItemSource("NOT_MULTI_ITEM", 0), new MultiItemSource("MULTI_ITEM_SERP", 1), new MultiItemSource("MULTI_ITEM_SWITCH", 2)};
            f82771b = multiItemSourceArr;
            f82772c = kotlin.enums.c.a(multiItemSourceArr);
        }

        public static MultiItemSource valueOf(String str) {
            return (MultiItemSource) Enum.valueOf(MultiItemSource.class, str);
        }

        public static MultiItemSource[] values() {
            return (MultiItemSource[]) f82771b.clone();
        }
    }

    @Inject
    public AdvertDetailsAnalyticsInteractorImpl(@k InterfaceC28373a interfaceC28373a, @k j jVar, @k V v12, @k c cVar, @k E e12, @k com.avito.android.analytics.provider.e eVar, @l @g TreeClickStreamParent treeClickStreamParent, @k C29640d c29640d, @k z zVar, @k C19864a c19864a, @k c8.e eVar2) {
        this.f82748b = interfaceC28373a;
        this.f82749c = cVar;
        this.f82750d = e12;
        this.f82751e = eVar;
        this.f82752f = treeClickStreamParent;
        this.f82753g = c29640d;
        this.f82754h = zVar;
        this.f82755i = c19864a;
        this.f82756j = eVar2;
        this.f82757k = jVar;
        this.f82758l = v12;
        this.f82759m = eVar.a();
    }

    @Override // com.avito.android.credits.e
    public final void A(int i12, int i13, int i14) {
        this.f82758l.A(i12, i13, i14);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void A3(@k AdvertDetails advertDetails) {
        if (this.f82753g.v().invoke().booleanValue()) {
            this.f82748b.c(new C39529a(this.f82752f, advertDetails));
        }
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void A6(@l String str, @l String str2, @l String str3) {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        AdvertDetails advertDetails2 = this.f82763q;
        if (advertDetails2 == null) {
            advertDetails2 = null;
        }
        String developmentId = advertDetails2.getDevelopmentId();
        AdvertDetails advertDetails3 = this.f82763q;
        if (advertDetails3 == null) {
            advertDetails3 = null;
        }
        Developer developerV2 = advertDetails3.getDeveloperV2();
        String id3 = developerV2 != null ? developerV2.getId() : null;
        AdvertDetails advertDetails4 = this.f82763q;
        if (advertDetails4 == null) {
            advertDetails4 = null;
        }
        String locationId = advertDetails4.getLocationId();
        AdvertDetails advertDetails5 = this.f82763q;
        this.f82748b.c(new C15683e(id2, developmentId, id3, locationId, str2, null, str, str3, (advertDetails5 != null ? advertDetails5 : null).getXHash()));
    }

    @Override // com.avito.android.V
    public final void B(int i12, int i13, int i14, boolean z12) {
        this.f82758l.B(i12, i13, i14, z12);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void B1(@k String str) {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        AdvertDetails advertDetails2 = this.f82763q;
        this.f82748b.c(new C39534a(id2, str, (advertDetails2 != null ? advertDetails2 : null).getXHash()));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void B5() {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        this.f82748b.c(new b(advertDetails.getId(), this.f82750d.a()));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void C3() {
        AdditionalSellerAnalyticsInfo analyticsInfo;
        AdvertDetails advertDetails = this.f82763q;
        Integer addressId = null;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        HouseReviewsShowActions houseReviewsShowActions = HouseReviewsShowActions.f82784f;
        AdvertDetails advertDetails2 = this.f82763q;
        if (advertDetails2 == null) {
            advertDetails2 = null;
        }
        AdditionalSeller additionalSeller = advertDetails2.getAdditionalSeller();
        if (additionalSeller != null && (analyticsInfo = additionalSeller.getAnalyticsInfo()) != null) {
            addressId = analyticsInfo.getAddressId();
        }
        this.f82748b.c(new e8.c(id2, houseReviewsShowActions, addressId, "item_onboarding"));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void C5(boolean z12) {
        AdditionalSellerAnalyticsInfo analyticsInfo;
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        HouseReviewsShowActions houseReviewsShowActions = z12 ? HouseReviewsShowActions.f82782d : HouseReviewsShowActions.f82781c;
        AdvertDetails advertDetails2 = this.f82763q;
        if (advertDetails2 == null) {
            advertDetails2 = null;
        }
        AdditionalSeller additionalSeller = advertDetails2.getAdditionalSeller();
        this.f82748b.c(new e8.c(id2, houseReviewsShowActions, (additionalSeller == null || (analyticsInfo = additionalSeller.getAnalyticsInfo()) == null) ? null : analyticsInfo.getAddressId(), null, 8, null));
    }

    @Override // com.avito.android.V
    public final void D() {
        this.f82758l.D();
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void D3(int i12, int i13, @k String str) {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        AdvertDetails advertDetails2 = this.f82763q;
        if (advertDetails2 == null) {
            advertDetails2 = null;
        }
        String categoryId = advertDetails2.getCategoryId();
        AdvertDetails advertDetails3 = this.f82763q;
        if (advertDetails3 == null) {
            advertDetails3 = null;
        }
        AdjustParameters adjustParameters = advertDetails3.getAdjustParameters();
        this.f82748b.c(new d(i12, i13, id2, categoryId, adjustParameters != null ? adjustParameters.getMicroCategoryId() : null, str));
    }

    @Override // com.avito.android.V
    public final void E() {
        this.f82758l.E();
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void E4(@k String str, boolean z12) {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        this.f82748b.c(new T8.a(advertDetails.getId(), str, z12));
    }

    @Override // p9.e
    public final void F(@l Integer num) {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        this.f82748b.c(new C46922a(advertDetails.getId(), null, num, 0, 0, null, 58, null));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void F3(@k String str, int i12, int i13, int i14, @l String str2, @k ModelCardFrom modelCardFrom, @k ModelCardFrom modelCardFrom2) {
        this.f82748b.c(new I8.a(str, i12, i13, i14, str2, modelCardFrom, modelCardFrom2));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void F4(@k AdvertDetails advertDetails, @l ScreenSource screenSource) {
        this.f82759m = this.f82751e.a();
        String str = advertDetails.isActive() ? "active" : AdvertStatus.CLOSED;
        if (advertDetails.isActive()) {
            this.f82768v.getClass();
            C48158g c48158g = C48158g.f437919a;
            Map mapSingletonMap = Collections.singletonMap("platform", "android");
            c48158g.getClass();
            try {
                YandexMetrica.reportEvent("item_view", (Map<String, Object>) mapSingletonMap);
            } catch (ValidationException unused) {
            }
            this.f82748b.c(new i9.k(this.f82759m, this.f82752f, advertDetails, str, screenSource, H(), G(), this.f82766t, this.f82764r));
        }
        this.f82752f = Q5(false);
    }

    public final String G() {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails != null) {
            if (advertDetails == null) {
                advertDetails = null;
            }
            if (advertDetails.getMultiItemParams() == null) {
                MultiItemSource[] multiItemSourceArr = MultiItemSource.f82771b;
                return "0";
            }
        }
        if (this.f82765s == null) {
            MultiItemSource[] multiItemSourceArr2 = MultiItemSource.f82771b;
            return "1";
        }
        MultiItemSource[] multiItemSourceArr3 = MultiItemSource.f82771b;
        return "2";
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void G1(@k ContactBarData contactBarData, boolean z12, @k SourceScreen sourceScreen, @l String str, @l String str2) {
        InterfaceC28373a interfaceC28373a = this.f82748b;
        if (z12) {
            interfaceC28373a.c(new u(contactBarData.getAdvertId()));
            return;
        }
        long jA2 = this.f82751e.a();
        TreeClickStreamParent treeClickStreamParent = this.f82752f;
        String advertId = contactBarData.getAdvertId();
        String categoryId = contactBarData.getCategoryId();
        boolean zIsFromCompany = contactBarData.isFromCompany();
        String metroId = contactBarData.getMetroId();
        String locationId = contactBarData.getLocationId();
        String shopId = contactBarData.getShopId();
        String source = contactBarData.getSource();
        Boolean boolH = H();
        String strG = G();
        String str3 = this.f82766t;
        String str4 = this.f82767u;
        interfaceC28373a.c(new i1(this.f82753g, this.f82748b, jA2, treeClickStreamParent, advertId, categoryId, zIsFromCompany, metroId, locationId, shopId, source, sourceScreen.f83155b, str, str2, boolH, strG, str3, str4));
        this.f82768v.a();
    }

    public final Boolean H() {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            return null;
        }
        J8.a aVar = J8.a.f8792a;
        String str = this.f82765s;
        aVar.getClass();
        if (advertDetails.getMultiItemParams() == null) {
            return null;
        }
        Boolean bool = (str == null || str.equals(advertDetails.getId())) ? Boolean.FALSE : Boolean.TRUE;
        return bool;
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void I5(@k String str) {
        if (this.f82753g.v().invoke().booleanValue()) {
            this.f82748b.c(new X8.a(this.f82752f, str));
        }
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void I6(@k String str, @k String str2) {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        this.f82748b.c(new C15680b(str, null, advertDetails.getLocationId(), str2, 2, null));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void J1() {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        AdvertDetails advertDetails2 = this.f82763q;
        this.f82748b.c(new k8.b(id2, (advertDetails2 != null ? advertDetails2 : null).getCategoryId()));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void J2(@k AdvertDetails advertDetails) {
        this.f82748b.c(new z8.d(this.f82752f, advertDetails.getId(), false));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void J3() {
        ConsultationAfterIceBreaker consultationAfterIceBreaker;
        ConsultationAfterIceBreaker consultationAfterIceBreaker2;
        ConsultationAfterIceBreaker consultationAfterIceBreaker3;
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        AdvertDetails advertDetails2 = this.f82763q;
        if (advertDetails2 == null) {
            advertDetails2 = null;
        }
        String developmentId = advertDetails2.getDevelopmentId();
        AdvertDetails advertDetails3 = this.f82763q;
        if (advertDetails3 == null) {
            advertDetails3 = null;
        }
        Developer developerV2 = advertDetails3.getDeveloperV2();
        String id3 = developerV2 != null ? developerV2.getId() : null;
        AdvertDetails advertDetails4 = this.f82763q;
        if (advertDetails4 == null) {
            advertDetails4 = null;
        }
        DevelopmentsAdvice developmentsAdvice = advertDetails4.getDevelopmentsAdvice();
        String locationId = developmentsAdvice != null ? developmentsAdvice.getLocationId() : null;
        AdvertDetails advertDetails5 = this.f82763q;
        if (advertDetails5 == null) {
            advertDetails5 = null;
        }
        DevelopmentsAdvice developmentsAdvice2 = advertDetails5.getDevelopmentsAdvice();
        String formPage = (developmentsAdvice2 == null || (consultationAfterIceBreaker3 = developmentsAdvice2.getConsultationAfterIceBreaker()) == null) ? null : consultationAfterIceBreaker3.getFormPage();
        String str = this.f82764r;
        AdvertDetails advertDetails6 = this.f82763q;
        if (advertDetails6 == null) {
            advertDetails6 = null;
        }
        DevelopmentsAdvice developmentsAdvice3 = advertDetails6.getDevelopmentsAdvice();
        String nodeType = (developmentsAdvice3 == null || (consultationAfterIceBreaker2 = developmentsAdvice3.getConsultationAfterIceBreaker()) == null) ? null : consultationAfterIceBreaker2.getNodeType();
        AdvertDetails advertDetails7 = this.f82763q;
        if (advertDetails7 == null) {
            advertDetails7 = null;
        }
        DevelopmentsAdvice developmentsAdvice4 = advertDetails7.getDevelopmentsAdvice();
        this.f82748b.c(new C15682d(id2, developmentId, id3, locationId, formPage, str, nodeType, (developmentsAdvice4 == null || (consultationAfterIceBreaker = developmentsAdvice4.getConsultationAfterIceBreaker()) == null) ? null : consultationAfterIceBreaker.getRequestType()));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void K0(@k BannerInfo bannerInfo, @l Integer num, @k BannerEvent.Type type) {
        this.f82757k.K0(bannerInfo, num, type);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void K6(long j12, @l String str) {
        if (this.f82749c.a(j12)) {
            AdvertDetails advertDetails = this.f82763q;
            if (advertDetails == null) {
                advertDetails = null;
            }
            this.f82748b.c(new com.avito.android.advert_core.offers.analytics.b(advertDetails.getId(), str));
        }
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void L1(int i12, int i13, @k String str) {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        AdvertDetails advertDetails2 = this.f82763q;
        if (advertDetails2 == null) {
            advertDetails2 = null;
        }
        String categoryId = advertDetails2.getCategoryId();
        AdvertDetails advertDetails3 = this.f82763q;
        if (advertDetails3 == null) {
            advertDetails3 = null;
        }
        AdjustParameters adjustParameters = advertDetails3.getAdjustParameters();
        this.f82748b.c(new D8.c(id2, categoryId, adjustParameters != null ? adjustParameters.getMicroCategoryId() : null, str, i12, i13, this.f82767u, null, 128, null));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void L2(@k String str) {
        this.f82748b.c(new Q8.b(str));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void L3(@k String str, @k String str2) {
        this.f82748b.c(new N(str, str2, this.f82750d.a()));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void L4(@k String str, boolean z12, @k BackFromPage backFromPage) {
        this.f82748b.c(new h(this.f82751e.a(), this.f82752f, str, z12, backFromPage));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void L6(@k String str, @k String str2) {
        String templateSlug;
        Boolean boolIsDegraded;
        Integer targetLayoutVersion;
        Integer targetNodeID;
        Integer requestedLayoutVersion;
        Integer requestedNodeID;
        String requestId;
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            return;
        }
        RenderMetadata renderMetadata = advertDetails.getRenderMetadata();
        String str3 = (renderMetadata == null || (requestId = renderMetadata.getRequestId()) == null) ? "" : requestId;
        AdvertDetails advertDetails2 = this.f82763q;
        if (advertDetails2 == null) {
            advertDetails2 = null;
        }
        String id2 = advertDetails2.getId();
        AdvertDetails advertDetails3 = this.f82763q;
        if (advertDetails3 == null) {
            advertDetails3 = null;
        }
        RenderMetadata renderMetadata2 = advertDetails3.getRenderMetadata();
        boolean zBooleanValue = false;
        int templateId = renderMetadata2 != null ? renderMetadata2.getTemplateId() : 0;
        AdvertDetails advertDetails4 = this.f82763q;
        if (advertDetails4 == null) {
            advertDetails4 = null;
        }
        RenderMetadata renderMetadata3 = advertDetails4.getRenderMetadata();
        if (renderMetadata3 == null || (templateSlug = renderMetadata3.getTemplateSlug()) == null) {
            templateSlug = "";
        }
        AdvertDetails advertDetails5 = this.f82763q;
        if (advertDetails5 == null) {
            advertDetails5 = null;
        }
        RenderMetadata renderMetadata4 = advertDetails5.getRenderMetadata();
        Integer numValueOf = Integer.valueOf((renderMetadata4 == null || (requestedNodeID = renderMetadata4.getRequestedNodeID()) == null) ? 0 : requestedNodeID.intValue());
        AdvertDetails advertDetails6 = this.f82763q;
        if (advertDetails6 == null) {
            advertDetails6 = null;
        }
        RenderMetadata renderMetadata5 = advertDetails6.getRenderMetadata();
        Integer numValueOf2 = Integer.valueOf((renderMetadata5 == null || (requestedLayoutVersion = renderMetadata5.getRequestedLayoutVersion()) == null) ? 0 : requestedLayoutVersion.intValue());
        AdvertDetails advertDetails7 = this.f82763q;
        if (advertDetails7 == null) {
            advertDetails7 = null;
        }
        RenderMetadata renderMetadata6 = advertDetails7.getRenderMetadata();
        Integer numValueOf3 = Integer.valueOf((renderMetadata6 == null || (targetNodeID = renderMetadata6.getTargetNodeID()) == null) ? 0 : targetNodeID.intValue());
        AdvertDetails advertDetails8 = this.f82763q;
        if (advertDetails8 == null) {
            advertDetails8 = null;
        }
        RenderMetadata renderMetadata7 = advertDetails8.getRenderMetadata();
        Integer numValueOf4 = Integer.valueOf((renderMetadata7 == null || (targetLayoutVersion = renderMetadata7.getTargetLayoutVersion()) == null) ? 0 : targetLayoutVersion.intValue());
        AdvertDetails advertDetails9 = this.f82763q;
        RenderMetadata renderMetadata8 = (advertDetails9 != null ? advertDetails9 : null).getRenderMetadata();
        if (renderMetadata8 != null && (boolIsDegraded = renderMetadata8.isDegraded()) != null) {
            zBooleanValue = boolIsDegraded.booleanValue();
        }
        this.f82748b.c(new C41239a(str3, id2, templateId, templateSlug, numValueOf, numValueOf2, numValueOf3, numValueOf4, Boolean.valueOf(zBooleanValue), str, str2));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void M3() {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        this.f82748b.c(new u8.b(advertDetails.getId()));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void M4(@k String str, @k BannerInfo bannerInfo) {
        this.f82757k.M4(str, bannerInfo);
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void M6(@k BannerInfo bannerInfo, int i12, @k BannerEvent.Type type) {
        this.f82757k.M6(bannerInfo, i12, type);
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void N3(@k String str, @k BannerInfo bannerInfo) {
        this.f82757k.N3(str, bannerInfo);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void N5(@k AdvertDetails advertDetails, @k String str, @k AdvertDetailsStyleAnalytics advertDetailsStyleAnalytics) {
        if (this.f82753g.v().invoke().booleanValue()) {
            TreeClickStreamParent treeClickStreamParent = this.f82752f;
            String xHash = advertDetails.getXHash();
            if (xHash == null) {
                xHash = this.f82764r;
            }
            this.f82748b.c(new C40549b(treeClickStreamParent, advertDetails, str, xHash, advertDetailsStyleAnalytics, this.f82767u));
        }
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void O(@k ParametrizedEvent parametrizedEvent) {
        int id2 = parametrizedEvent.getId();
        int version = parametrizedEvent.getVersion();
        Map<String, Object> parameters = parametrizedEvent.getParameters();
        if (parameters == null) {
            parameters = P0.c();
        }
        this.f82748b.c(new ParametrizedClickStreamEvent(id2, version, parameters, null, 8, null));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void O1(@k String str, @k String str2) {
        this.f82748b.c(new C49178a(str2, str));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void O2(@k String str, @l String str2, @l String str3) {
        if (this.f82753g.v().invoke().booleanValue()) {
            this.f82748b.c(new f8.b(this.f82752f, str, str2, str3));
        }
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void O4(@k String str, @k ReviewsOpenPageFrom.ItemScroll itemScroll, @l String str2, @l String str3) {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        this.f82748b.c(new C15508b(str, itemScroll, null, null, null, C43066x.z0(advertDetails.getId()), str2, str3, null, null, 284, null));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void O6(@k String str, @k String str2, @k String str3, @l String str4) {
        String strA = this.f82750d.a();
        AboutDeveloperFlatsButtonClickEvent.FromPage[] fromPageArr = AboutDeveloperFlatsButtonClickEvent.FromPage.f82818b;
        this.f82748b.c(new AboutDeveloperFlatsButtonClickEvent(str, strA, str2, str3, str4));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void P0(@k String str) {
        this.f82748b.c(new Q8.c(str));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void P1(@k String str, @l String str2, @l String str3, @k SbSignUpEvent.ServiceBookingSource serviceBookingSource) {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String xHash = advertDetails.getXHash();
        if (xHash == null) {
            xHash = this.f82764r;
        }
        this.f82748b.c(new SbSignUpEvent(str, str2, str3, serviceBookingSource, xHash));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void P3(@k String str, @k BannerInfo bannerInfo, int i12) {
        this.f82757k.P3(str, bannerInfo, i12);
    }

    @Override // com.avito.android.advertising.adapter.items.buzzoola.premium.q
    public final void P6(@k Kundle kundle) {
        this.f82757k.P6(kundle);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void Q4() {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        AdvertDetails advertDetails2 = this.f82763q;
        this.f82748b.c(new L8.a(id2, (advertDetails2 != null ? advertDetails2 : null).getXHash()));
    }

    @Override // com.avito.android.advert_core.analytics.a
    @k
    public final TreeClickStreamParent Q5(boolean z12) {
        return new TreeClickStreamParent(this.f82759m, z12 ? "item_scroll" : "ADVERT_DETAILS", null, null);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void Q6() {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        AdvertDetails advertDetails2 = this.f82763q;
        this.f82748b.c(new C42536a(id2, (advertDetails2 != null ? advertDetails2 : null).getCategoryId()));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void R2(@l String str) {
        this.f82748b.c(new Uc.e(null, str, ReviewsOpenPageFrom.Item.f91256d, 1, null));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void R3() {
        if (!this.f82770x) {
            AdvertDetails advertDetails = this.f82763q;
            if (advertDetails == null) {
                advertDetails = null;
            }
            String id2 = advertDetails.getId();
            String strA = this.f82750d.a();
            AutoParametersIconEventType[] autoParametersIconEventTypeArr = AutoParametersIconEventType.f82798b;
            this.f82748b.c(new C40545a(id2, strA, "no_pts"));
        }
        this.f82770x = true;
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void R4(@k String str, @k String str2, int i12, float f12) {
        this.f82748b.c(new C15507a(str, str2.equals(CategoryIds.AUTO.CARS.getId()) ? "1" : str2.equals(CategoryIds.ELECTRONICS.PHONES.getId()) ? "2" : str2.equals(CategoryIds.ELECTRONICS.LAPTOPS.getId()) ? "3" : str2.equals(CategoryIds.AUTO.TRUCKS.getId()) ? "4" : "", i12, f12));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void R5(@k AdvertDetails advertDetails) {
        if (this.f82753g.v().invoke().booleanValue()) {
            this.f82748b.c(new r8.c(this.f82752f, advertDetails));
        }
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void R6(@l String str) {
        this.f82765s = str;
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void S1() {
        long jA2 = this.f82751e.a();
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        AdvertDetails advertDetails2 = this.f82763q;
        if (advertDetails2 == null) {
            advertDetails2 = null;
        }
        String categoryId = advertDetails2.getCategoryId();
        AdvertDetails advertDetails3 = this.f82763q;
        if (advertDetails3 == null) {
            advertDetails3 = null;
        }
        boolean zIsFromCompany = advertDetails3.isFromCompany();
        AdvertDetails advertDetails4 = this.f82763q;
        if (advertDetails4 == null) {
            advertDetails4 = null;
        }
        String metroId = advertDetails4.getMetroId();
        AdvertDetails advertDetails5 = this.f82763q;
        if (advertDetails5 == null) {
            advertDetails5 = null;
        }
        String locationId = advertDetails5.getLocationId();
        AdvertDetails advertDetails6 = this.f82763q;
        if (advertDetails6 == null) {
            advertDetails6 = null;
        }
        String shopId = advertDetails6.getShopId();
        SourceScreen sourceScreen = SourceScreen.f83145c;
        String str = this.f82764r;
        Boolean boolH = H();
        String strG = G();
        String str2 = this.f82766t;
        String str3 = this.f82767u;
        AdvertDetails advertDetails7 = this.f82763q;
        if (advertDetails7 == null) {
            advertDetails7 = null;
        }
        AdvertSeller seller = advertDetails7.getSeller();
        String userKey = seller != null ? seller.getUserKey() : null;
        AdvertDetails advertDetails8 = this.f82763q;
        if (advertDetails8 == null) {
            advertDetails8 = null;
        }
        AdjustParameters adjustParameters = advertDetails8.getAdjustParameters();
        this.f82748b.c(new h1(jA2, id2, categoryId, adjustParameters != null ? adjustParameters.getMicroCategoryId() : null, zIsFromCompany, metroId, locationId, userKey, shopId, "item", 0, str, boolH, strG, str2, str3, null));
        this.f82768v.a();
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void S2(@k String str, @k String str2) {
        this.f82748b.c(new C39963a(str, str2));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void S6(@k BannerInfo bannerInfo, @k BuzzoolaBanner buzzoolaBanner) {
        m4(bannerInfo, buzzoolaBanner, null, BannerEvent.Type.f87774c);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void T1() {
        ItemReviewsMain main;
        List<ItemReviewsEntry> entries;
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        ItemReviews itemReviews = advertDetails.getItemReviews();
        boolean zA2 = (itemReviews == null || (main = itemReviews.getMain()) == null || (entries = main.getEntries()) == null) ? false : O2.a(entries);
        String strA = this.f82750d.a();
        AdvertDetails advertDetails2 = this.f82763q;
        this.f82748b.c(new e9.b(strA, (advertDetails2 != null ? advertDetails2 : null).getId(), zA2));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void T2(@k String str) {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String categoryId = advertDetails.getCategoryId();
        AdvertDetails advertDetails2 = this.f82763q;
        if (advertDetails2 == null) {
            advertDetails2 = null;
        }
        AdvertSeller seller = advertDetails2.getSeller();
        String userKey = seller != null ? seller.getUserKey() : null;
        AdvertDetails advertDetails3 = this.f82763q;
        if (advertDetails3 == null) {
            advertDetails3 = null;
        }
        AdjustParameters adjustParameters = advertDetails3.getAdjustParameters();
        String microCategoryId = adjustParameters != null ? adjustParameters.getMicroCategoryId() : null;
        AdvertDetails advertDetails4 = this.f82763q;
        if (advertDetails4 == null) {
            advertDetails4 = null;
        }
        String id2 = advertDetails4.getId();
        AdvertDetails advertDetails5 = this.f82763q;
        this.f82748b.c(new C28435q(categoryId, userKey, microCategoryId, id2, (advertDetails5 != null ? advertDetails5 : null).getXHash(), str, this.f82767u));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void T6(@k String str, @k BannerInfo bannerInfo) {
        this.f82757k.T6(str, bannerInfo);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void U0() {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        this.f82748b.c(new C48861a(advertDetails.getId()));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void U1(@l String str) {
        String strA = this.f82750d.a();
        GalleryFromBlock[] galleryFromBlockArr = GalleryFromBlock.f68396b;
        this.f82748b.c(new N3.a(strA, str, "advertisement"));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void U6(@l Long l12) {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String categoryId = advertDetails.getCategoryId();
        AdvertDetails advertDetails2 = this.f82763q;
        if (advertDetails2 == null) {
            advertDetails2 = null;
        }
        AdvertSeller seller = advertDetails2.getSeller();
        String userKey = seller != null ? seller.getUserKey() : null;
        AdvertDetails advertDetails3 = this.f82763q;
        if (advertDetails3 == null) {
            advertDetails3 = null;
        }
        AdjustParameters adjustParameters = advertDetails3.getAdjustParameters();
        String microCategoryId = adjustParameters != null ? adjustParameters.getMicroCategoryId() : null;
        AdvertDetails advertDetails4 = this.f82763q;
        if (advertDetails4 == null) {
            advertDetails4 = null;
        }
        String id2 = advertDetails4.getId();
        AdvertDetails advertDetails5 = this.f82763q;
        this.f82748b.c(new M(categoryId, l12, userKey, microCategoryId, id2, (advertDetails5 != null ? advertDetails5 : null).getXHash(), this.f82767u));
    }

    @Override // com.avito.android.advert_core.analytics.a, F9.a
    public final void V(@k String str, @l String str2, @l String str3, @k GeoFromBlock geoFromBlock) {
        this.f82748b.c(new C40243a(this.f82752f, str, str2, str3, geoFromBlock.f82797b));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void V1(@k ExpandableTitleClickEvent.ActionType actionType, @k AdvertDetailsStyleAnalytics advertDetailsStyleAnalytics, @l String str) {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        this.f82748b.c(new ExpandableTitleClickEvent(advertDetails.getId(), actionType, advertDetailsStyleAnalytics, str, this.f82767u));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void V2(@k String str, @k String str2, @k String str3, @l String str4) {
        String strA = this.f82750d.a();
        AboutDeveloperFlatsAppearsEvent.FromPage[] fromPageArr = AboutDeveloperFlatsAppearsEvent.FromPage.f82815b;
        this.f82748b.c(new AboutDeveloperFlatsAppearsEvent(str, strA, str2, str3, str4));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void V4(@k String str, @k BannerInfo bannerInfo) {
        this.f82757k.V4(str, bannerInfo);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void W0(@k AdvertDetails advertDetails) {
        if (this.f82753g.v().invoke().booleanValue()) {
            this.f82748b.c(new C50394b(this.f82752f, advertDetails));
        }
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void W1(@k AdvertDetails advertDetails) {
        if (this.f82753g.v().invoke().booleanValue()) {
            this.f82748b.c(new i(this.f82752f, advertDetails));
        }
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void W3(@k AdvertDetails advertDetails) {
        if (!this.f82753g.v().invoke().booleanValue() || this.f82762p) {
            return;
        }
        this.f82762p = true;
        this.f82748b.c(new r8.b(this.f82752f, advertDetails));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void W5(@l String str) {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        this.f82748b.c(new com.avito.android.advert_core.offers.analytics.a(advertDetails.getId(), str));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void W6(@k AdvertDetails advertDetails, @k ShowSellersProfileSource showSellersProfileSource) {
        if (this.f82753g.v().invoke().booleanValue()) {
            this.f82748b.c(new Z8.b(this.f82752f, advertDetails, showSellersProfileSource, this.f82764r, this.f82767u));
        }
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void X0(@l String str, @l String str2, @k String str3) {
        String strA = this.f82750d.a();
        if (str == null || str2 == null) {
            return;
        }
        this.f82748b.c(new G8.a(strA, str, str2, str3));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void X1() {
        this.f82748b.c(new m());
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void X2(@k SimpleTestGroupWithNone simpleTestGroupWithNone) {
        this.f82748b.c(new y.a("clickToSendIcebreakers.advert." + simpleTestGroupWithNone.name(), 0L, 2, null));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void X3(@k BannerInfo bannerInfo, int i12, @l String str, @k BannerEvent.Type type) {
        this.f82757k.X3(bannerInfo, i12, str, type);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void X4(@k AdvertDetails advertDetails, @k String str) {
        if (this.f82753g.v().invoke().booleanValue()) {
            this.f82748b.c(new C50080a(this.f82752f, advertDetails, str));
        }
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void X5() {
        if (!this.f82769w) {
            AdvertDetails advertDetails = this.f82763q;
            if (advertDetails == null) {
                advertDetails = null;
            }
            String id2 = advertDetails.getId();
            String strA = this.f82750d.a();
            AutoParametersIconEventType[] autoParametersIconEventTypeArr = AutoParametersIconEventType.f82798b;
            this.f82748b.c(new C40545a(id2, strA, "wrong_owners_number"));
        }
        this.f82769w = true;
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void Y(@k String str, @l String str2, boolean z12) {
        this.f82748b.c(new com.avito.android.analytics.call.c(str, null, str2, z12 ? "xs" : "s", 0, null, null, this.f82755i.v().getValue().booleanValue(), 96, null));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void Y6(@l String str, @l String str2) {
        if (this.f82753g.v().invoke().booleanValue()) {
            this.f82748b.c(new Y8.b(str, str2));
        }
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void Z1(@k String str, @l String str2, @l LinkedHashMap linkedHashMap) {
        this.f82748b.c(new M8.b(str, str2, linkedHashMap));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void Z2(@k AdvertDetails advertDetails) {
        if (this.f82753g.v().invoke().booleanValue()) {
            this.f82748b.c(new C50081b(this.f82752f, advertDetails));
        }
    }

    @Override // com.avito.android.Y
    @k
    /* renamed from: a */
    public final String getF128566d() {
        return this.f82758l.getF128566d();
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void a1(@k String str) {
        this.f82748b.c(new e8.b(str));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void a2() {
        SourceScreen sourceScreen = SourceScreen.f83145c;
        long jA2 = this.f82751e.a();
        TreeClickStreamParent treeClickStreamParent = this.f82752f;
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        AdvertDetails advertDetails2 = this.f82763q;
        if (advertDetails2 == null) {
            advertDetails2 = null;
        }
        String categoryId = advertDetails2.getCategoryId();
        AdvertDetails advertDetails3 = this.f82763q;
        if (advertDetails3 == null) {
            advertDetails3 = null;
        }
        boolean zIsFromCompany = advertDetails3.isFromCompany();
        AdvertDetails advertDetails4 = this.f82763q;
        if (advertDetails4 == null) {
            advertDetails4 = null;
        }
        String metroId = advertDetails4.getMetroId();
        AdvertDetails advertDetails5 = this.f82763q;
        if (advertDetails5 == null) {
            advertDetails5 = null;
        }
        String locationId = advertDetails5.getLocationId();
        AdvertDetails advertDetails6 = this.f82763q;
        this.f82748b.c(new i1(this.f82753g, this.f82748b, jA2, treeClickStreamParent, id2, categoryId, zIsFromCompany, metroId, locationId, (advertDetails6 != null ? advertDetails6 : null).getShopId(), "chat_history", 0, null, null, H(), G(), this.f82766t, this.f82767u, 8192, null));
        this.f82768v.a();
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void a5(@k String str) {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        AdvertDetails advertDetails2 = this.f82763q;
        if (advertDetails2 == null) {
            advertDetails2 = null;
        }
        AdjustParameters adjustParameters = advertDetails2.getAdjustParameters();
        this.f82748b.c(new S8.a(id2, adjustParameters != null ? adjustParameters.getMicroCategoryId() : null, this.f82750d.a(), str));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void a7() {
        AdditionalSellerAnalyticsInfo analyticsInfo;
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        HouseReviewsShowActions houseReviewsShowActions = HouseReviewsShowActions.f82783e;
        AdvertDetails advertDetails2 = this.f82763q;
        if (advertDetails2 == null) {
            advertDetails2 = null;
        }
        AdditionalSeller additionalSeller = advertDetails2.getAdditionalSeller();
        this.f82748b.c(new e8.c(id2, houseReviewsShowActions, (additionalSeller == null || (analyticsInfo = additionalSeller.getAnalyticsInfo()) == null) ? null : analyticsInfo.getAddressId(), null, 8, null));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void b7() {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        AdvertDetails advertDetails2 = this.f82763q;
        if (advertDetails2 == null) {
            advertDetails2 = null;
        }
        String categoryId = advertDetails2.getCategoryId();
        AdvertDetails advertDetails3 = this.f82763q;
        if (advertDetails3 == null) {
            advertDetails3 = null;
        }
        AdjustParameters adjustParameters = advertDetails3.getAdjustParameters();
        this.f82748b.c(new D8.a(id2, categoryId, adjustParameters != null ? adjustParameters.getMicroCategoryId() : null));
    }

    @Override // com.avito.android.Z
    @l
    /* renamed from: c */
    public final String getF128569g() {
        return this.f82758l.getF128569g();
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void c3(@k String str, boolean z12) {
        this.f82748b.c(new com.avito.android.advert_core.analytics.closed_advert.a(str, z12 ? "success" : "network_error", z12 ? "blocked" : null));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void c7(@k AdvertDetails advertDetails) {
        this.f82748b.c(new com.avito.android.advert_core.analytics.closed_advert.a(advertDetails.getId(), "success", advertDetails.isActive() ? "active" : AdvertStatus.CLOSED));
    }

    @Override // com.avito.android.V
    public final void d() {
        this.f82758l.d();
    }

    @Override // com.avito.android.V
    @k
    public final Kundle d0() {
        return this.f82758l.d0();
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void d1(@l String str) {
        this.f82748b.c(new N3.c(this.f82750d.a(), str));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void d3(@k AdvertDetails advertDetails, @k NoteAction noteAction, @l String str) {
        if (this.f82753g.v().invoke().booleanValue()) {
            this.f82748b.c(new C41252a(this.f82752f, advertDetails, noteAction, str));
        }
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void d4(@k String str) {
        this.f82748b.c(new Q8.a(str));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void d5(@k String str, @k BannerInfo bannerInfo) {
        this.f82757k.d5(str, bannerInfo);
    }

    @Override // com.avito.android.V
    public final void e(boolean z12) {
        this.f82758l.e(z12);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void e3(int i12, @k AdvertDetails advertDetails, @l String str) {
        if (this.f82753g.v().invoke().booleanValue()) {
            this.f82748b.c(new g9.c(this.f82752f, advertDetails, str, i12));
        }
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void e5(@l Long l12) {
        this.f82748b.c(new F8.a(l12));
    }

    @Override // com.avito.android.S0
    public final void f(@l String str) {
        this.f82758l.f(str);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void f1() {
        String templateSlug;
        Boolean boolIsDegraded;
        Integer targetLayoutVersion;
        Integer targetNodeID;
        Integer requestedLayoutVersion;
        Integer requestedNodeID;
        String requestId;
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            return;
        }
        RenderMetadata renderMetadata = advertDetails.getRenderMetadata();
        String str = (renderMetadata == null || (requestId = renderMetadata.getRequestId()) == null) ? "" : requestId;
        AdvertDetails advertDetails2 = this.f82763q;
        if (advertDetails2 == null) {
            advertDetails2 = null;
        }
        String id2 = advertDetails2.getId();
        AdvertDetails advertDetails3 = this.f82763q;
        if (advertDetails3 == null) {
            advertDetails3 = null;
        }
        RenderMetadata renderMetadata2 = advertDetails3.getRenderMetadata();
        boolean zBooleanValue = false;
        int templateId = renderMetadata2 != null ? renderMetadata2.getTemplateId() : 0;
        AdvertDetails advertDetails4 = this.f82763q;
        if (advertDetails4 == null) {
            advertDetails4 = null;
        }
        RenderMetadata renderMetadata3 = advertDetails4.getRenderMetadata();
        if (renderMetadata3 == null || (templateSlug = renderMetadata3.getTemplateSlug()) == null) {
            templateSlug = "";
        }
        AdvertDetails advertDetails5 = this.f82763q;
        if (advertDetails5 == null) {
            advertDetails5 = null;
        }
        RenderMetadata renderMetadata4 = advertDetails5.getRenderMetadata();
        Integer numValueOf = Integer.valueOf((renderMetadata4 == null || (requestedNodeID = renderMetadata4.getRequestedNodeID()) == null) ? 0 : requestedNodeID.intValue());
        AdvertDetails advertDetails6 = this.f82763q;
        if (advertDetails6 == null) {
            advertDetails6 = null;
        }
        RenderMetadata renderMetadata5 = advertDetails6.getRenderMetadata();
        Integer numValueOf2 = Integer.valueOf((renderMetadata5 == null || (requestedLayoutVersion = renderMetadata5.getRequestedLayoutVersion()) == null) ? 0 : requestedLayoutVersion.intValue());
        AdvertDetails advertDetails7 = this.f82763q;
        if (advertDetails7 == null) {
            advertDetails7 = null;
        }
        RenderMetadata renderMetadata6 = advertDetails7.getRenderMetadata();
        Integer numValueOf3 = Integer.valueOf((renderMetadata6 == null || (targetNodeID = renderMetadata6.getTargetNodeID()) == null) ? 0 : targetNodeID.intValue());
        AdvertDetails advertDetails8 = this.f82763q;
        if (advertDetails8 == null) {
            advertDetails8 = null;
        }
        RenderMetadata renderMetadata7 = advertDetails8.getRenderMetadata();
        Integer numValueOf4 = Integer.valueOf((renderMetadata7 == null || (targetLayoutVersion = renderMetadata7.getTargetLayoutVersion()) == null) ? 0 : targetLayoutVersion.intValue());
        AdvertDetails advertDetails9 = this.f82763q;
        RenderMetadata renderMetadata8 = (advertDetails9 != null ? advertDetails9 : null).getRenderMetadata();
        if (renderMetadata8 != null && (boolIsDegraded = renderMetadata8.isDegraded()) != null) {
            zBooleanValue = boolIsDegraded.booleanValue();
        }
        this.f82748b.c(new i8.b(str, id2, templateId, templateSlug, numValueOf, numValueOf2, numValueOf3, numValueOf4, Boolean.valueOf(zBooleanValue)));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void f6() {
        ItemReviewsMain main;
        List<ItemReviewsEntry> entries;
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        ItemReviews itemReviews = advertDetails.getItemReviews();
        boolean zA2 = (itemReviews == null || (main = itemReviews.getMain()) == null || (entries = main.getEntries()) == null) ? false : O2.a(entries);
        String strA = this.f82750d.a();
        AdvertDetails advertDetails2 = this.f82763q;
        this.f82748b.c(new C39970a(strA, (advertDetails2 != null ? advertDetails2 : null).getId(), zA2));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void f7() {
        AdditionalSellerAnalyticsInfo analyticsInfo;
        AdvertDetails advertDetails = this.f82763q;
        Integer addressId = null;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        HouseReviewsShowActions houseReviewsShowActions = HouseReviewsShowActions.f82785g;
        AdvertDetails advertDetails2 = this.f82763q;
        if (advertDetails2 == null) {
            advertDetails2 = null;
        }
        AdditionalSeller additionalSeller = advertDetails2.getAdditionalSeller();
        if (additionalSeller != null && (analyticsInfo = additionalSeller.getAnalyticsInfo()) != null) {
            addressId = analyticsInfo.getAddressId();
        }
        this.f82748b.c(new e8.c(id2, houseReviewsShowActions, addressId, "item_onboarding"));
    }

    @Override // com.avito.android.V
    public final void g() {
        this.f82758l.g();
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void g0(@l String str) {
        this.f82767u = str;
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void g5(@k String str, @k BannerInfo bannerInfo) {
        this.f82757k.g5(str, bannerInfo);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void g7(@k AdvertDetails advertDetails) {
        if (this.f82753g.v().invoke().booleanValue()) {
            this.f82748b.c(new C46915a(this.f82752f, advertDetails));
        }
    }

    @Override // x8.InterfaceC49790a
    public final void h(@k String str, @l String str2, @l String str3) {
        this.f82748b.c(new x8.c(str, str2, str3));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void h0(@k String str, @k ContactSource contactSource, @l String str2, @l ScreenIdField screenIdField, @l String str3) {
        this.f82748b.c(new i1(this.f82753g, this.f82748b, this.f82751e.a(), this.f82752f, str, contactSource.f89925b ? "xl" : "s", Integer.valueOf(contactSource.f89926c), screenIdField != null ? screenIdField.f90257b : null, str2, str3));
        this.f82768v.a();
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void h3(@k String str, @k List<String> list, @k List<String> list2) {
        this.f82748b.c(new C48012a(str, list, list2));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void h7(int i12, @l String str, @l String str2) {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        AdvertDetails advertDetails2 = this.f82763q;
        if (advertDetails2 == null) {
            advertDetails2 = null;
        }
        AdjustParameters adjustParameters = advertDetails2.getAdjustParameters();
        this.f82748b.c(new K8.a(adjustParameters != null ? adjustParameters.getMicroCategoryId() : null, i12, str2, id2, str));
    }

    @Override // com.avito.android.Z
    public final void i(@l String str) {
        this.f82758l.i(str);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void i0(@k String str) {
        this.f82748b.c(new Q8.d(str));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void i1(@k AnalyticsBrandingType analyticsBrandingType) {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        AdvertDetails advertDetails2 = this.f82763q;
        l8.b bVar = new l8.b(id2, (advertDetails2 != null ? advertDetails2 : null).getCategoryId(), analyticsBrandingType);
        c8.e eVar = this.f82756j;
        LinkedHashSet linkedHashSet = eVar.f57683b;
        if (linkedHashSet.contains(bVar)) {
            return;
        }
        linkedHashSet.add(bVar);
        eVar.f57682a.c(bVar);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void i3(@k AdvertDetails advertDetails) {
        if (this.f82753g.v().invoke().booleanValue()) {
            this.f82748b.c(new C47507a(this.f82752f, advertDetails));
        }
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void i4(@k BannerInfo bannerInfo) {
        K0(bannerInfo, null, BannerEvent.Type.f87774c);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void i5(@k String str, @l String str2) {
        this.f82748b.c(new FlatsButtonClickEvent(str, FlatsButtonClickEvent.FromPage.f82821c, str2));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void i7(@k String str, @k String str2) {
        this.f82748b.c(new i9.b(str, str2));
    }

    @Override // com.avito.android.credits.e
    public final void j(@l String str) {
        this.f82758l.j(str);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void j4(@l String str) {
        this.f82764r = str;
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void j5(@k AdvertDetails advertDetails, @k ClickSimilarItemFavoritesAction clickSimilarItemFavoritesAction, @k String str) {
        if (this.f82753g.v().invoke().booleanValue()) {
            TreeClickStreamParent treeClickStreamParent = this.f82752f;
            String xHash = advertDetails.getXHash();
            if (xHash == null) {
                xHash = this.f82764r;
            }
            this.f82748b.c(new C40548a(treeClickStreamParent, advertDetails, clickSimilarItemFavoritesAction, str, xHash));
        }
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void j6(@k String str, @k BannerInfo bannerInfo) {
        this.f82757k.j6(str, bannerInfo);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void j7(@k List<Integer> list) {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        AdvertDetails advertDetails2 = this.f82763q;
        this.f82748b.c(new C43598a(id2, (advertDetails2 != null ? advertDetails2 : null).getCategoryId(), list));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void k(@k String str) {
        this.f82748b.c(new W0(str, "button"));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void k0(@l String str, @l String str2, @l String str3) {
        if (this.f82753g.v().invoke().booleanValue()) {
            this.f82748b.c(new Y8.a(str, str2, str3));
        }
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void k3(@l String str, @l String str2) {
        this.f82748b.c(new C26959b(str, str2));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void k4(@k String str, @k BannerInfo bannerInfo) {
        this.f82757k.k4(str, bannerInfo);
    }

    @Override // com.avito.android.credits.e
    public final void l() {
        this.f82758l.l();
    }

    @Override // com.avito.android.V
    public final void m() {
        this.f82758l.m();
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void m4(@k BannerInfo bannerInfo, @l com.avito.android.advertising.b bVar, @l Integer num, @k BannerEvent.Type type) {
        this.f82757k.m4(bannerInfo, bVar, num, type);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void m6() {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        AdvertDetails advertDetails2 = this.f82763q;
        if (advertDetails2 == null) {
            advertDetails2 = null;
        }
        AdjustParameters adjustParameters = advertDetails2.getAdjustParameters();
        this.f82748b.c(new S8.b(id2, adjustParameters != null ? adjustParameters.getMicroCategoryId() : null, this.f82750d.a()));
    }

    @Override // p9.e
    public final void n(@k String str) {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        String str2 = this.f82764r;
        SourceScreen sourceScreen = SourceScreen.f83145c;
        this.f82748b.c(new com.avito.android.analytics.call.c(id2, null, str2, str, 0, "ADVERT_DETAILS", null, this.f82755i.v().getValue().booleanValue(), 64, null));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void n0(@k BannerInfo bannerInfo, int i12) {
        M6(bannerInfo, i12, BannerEvent.Type.f87774c);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void n4(int i12, @k String str, @k ArrayList arrayList) {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        AdvertDetails advertDetails2 = this.f82763q;
        if (advertDetails2 == null) {
            advertDetails2 = null;
        }
        String categoryId = advertDetails2.getCategoryId();
        AdvertDetails advertDetails3 = this.f82763q;
        if (advertDetails3 == null) {
            advertDetails3 = null;
        }
        AdjustParameters adjustParameters = advertDetails3.getAdjustParameters();
        this.f82748b.c(new D8.e(id2, categoryId, adjustParameters != null ? adjustParameters.getMicroCategoryId() : null, str, i12, arrayList));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void n5(@k BannerInfo bannerInfo, @l Integer num, @l String str) {
        this.f82757k.n5(bannerInfo, num, str);
    }

    @Override // com.avito.android.V
    public final void o(boolean z12) {
        this.f82758l.o(z12);
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void o0(int i12, @k BannerInfo bannerInfo, @k String str, @k String str2, @l String str3) {
        this.f82757k.o0(i12, bannerInfo, str, str2, str3);
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void o6(@k BannerInfo bannerInfo, @l Integer num, boolean z12, @l Throwable th2, @l String str, @l Integer num2, @k BannerEvent.Type type) {
        this.f82757k.o6(bannerInfo, num, z12, th2, str, num2, type);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void p(@k AdvertDetails advertDetails) {
        this.f82763q = advertDetails;
        this.f82756j.f57683b.clear();
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void p0() {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        this.f82748b.c(new Z8.a(advertDetails.getId()));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void p3(@k String str, @l String str2) {
        this.f82748b.c(new o(str, str2));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void p5(@k AdvertDetails advertDetails, boolean z12) {
        if (this.f82753g.v().invoke().booleanValue()) {
            TreeClickStreamParent treeClickStreamParent = this.f82752f;
            InterfaceC28373a interfaceC28373a = this.f82748b;
            if (!z12 || treeClickStreamParent == null) {
                interfaceC28373a.c(new z8.c(treeClickStreamParent, advertDetails));
                return;
            }
            interfaceC28373a.c(new z8.c(new TreeClickStreamParent(treeClickStreamParent.f90258b, "item_scroll", treeClickStreamParent.f90260d, treeClickStreamParent.f90261e), advertDetails));
        }
    }

    @Override // com.avito.android.V
    public final void q() {
        this.f82758l.q();
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void q0(int i12, @k AdvertDetails advertDetails, @l String str) {
        Long lZ02 = C43066x.z0(advertDetails.getId());
        this.f82748b.c(new B8.a(lZ02 != null ? lZ02.longValue() : 0L, i12, str));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void q7(@k String str) {
        this.f82748b.c(new com.avito.android.advert_core.analytics.closed_advert.c(str));
    }

    @Override // com.avito.android.V
    public final void r() {
        this.f82758l.r();
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void r3(@k BannerInfo bannerInfo, int i12, @k BannerEvent.Type type) {
        this.f82757k.r3(bannerInfo, i12, type);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void r4(@k String str, @k String str2) {
        this.f82748b.c(new C40783a(str, str2));
    }

    @Override // com.avito.android.V
    public final void s(@l String str) {
        this.f82758l.s(str);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void s0() {
        if (this.f82753g.v().invoke().booleanValue()) {
            this.f82761o = this.f82760n.a();
        }
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void s3() {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        this.f82748b.c(new A8.a(advertDetails.getId()));
    }

    @Override // com.avito.android.credits.e
    public final void t(@l String str) {
        this.f82758l.t(str);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void t4(@k BannerInfo bannerInfo, int i12) {
        r3(bannerInfo, i12, BannerEvent.Type.f87774c);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void t7(int i12, @k String str) {
        String strA = this.f82750d.a();
        if (strA == null) {
            strA = "";
        }
        String str2 = strA;
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        AdvertDetails advertDetails2 = this.f82763q;
        this.f82748b.c(new C43923a(str2, id2, i12, (advertDetails2 != null ? advertDetails2 : null).getXHash(), str, H(), this.f82767u));
    }

    @Override // p9.e
    public final void u(@k PageScrollDirection pageScrollDirection) {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        this.f82748b.c(new p9.c(advertDetails.getId(), null, pageScrollDirection, 0, 0, null, 58, null));
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void u3(@k BannerInfo bannerInfo, int i12) {
        BannerEvent.Type type = BannerEvent.Type.f87773b;
        this.f82757k.u3(bannerInfo, i12);
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void u5(@k String str) {
        this.f82748b.c(new n(str));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void u6(@k String str, @l String str2, @l String str3, boolean z12) {
        this.f82748b.c(new V8.a(str, str2, str3, z12));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void u7(@k BannerInfo bannerInfo, @k AdvertDetails advertDetails) {
        X3(bannerInfo, 0, advertDetails.getId(), BannerEvent.Type.f87774c);
    }

    @Override // com.avito.android.credits.e
    public final void v() {
        this.f82758l.v();
    }

    @Override // com.avito.android.advert_core.analytics.a
    @l
    /* renamed from: v0, reason: from getter */
    public final String getF82761o() {
        return this.f82761o;
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void v1(@k String str) {
        this.f82748b.c(new com.avito.android.advert_core.analytics.closed_advert.d(str));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void v3(@k String str, @k String str2, @l String str3) {
        this.f82748b.c(new c8.b(str, str2, str3));
    }

    @Override // com.avito.android.credits.e
    public final void w() {
        this.f82758l.w();
    }

    @Override // p9.e
    public final void x() {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        this.f82748b.c(new p9.d(advertDetails.getId(), null, 0, 0, null, 30, null));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void x0(@k AdvertDetails advertDetails) {
        this.f82748b.c(new U8.a(advertDetails));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void x1(@k String str, @l OwnershipCostEventBlockType ownershipCostEventBlockType, @l String str2, @l LinkedHashMap linkedHashMap) {
        this.f82748b.c(new M8.a(str, ownershipCostEventBlockType, str2, linkedHashMap));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void x3(@k String str) {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        AdvertDetails advertDetails2 = this.f82763q;
        if (advertDetails2 == null) {
            advertDetails2 = null;
        }
        String categoryId = advertDetails2.getCategoryId();
        AdvertDetails advertDetails3 = this.f82763q;
        if (advertDetails3 == null) {
            advertDetails3 = null;
        }
        AdjustParameters adjustParameters = advertDetails3.getAdjustParameters();
        this.f82748b.c(new C44211a(id2, categoryId, adjustParameters != null ? adjustParameters.getMicroCategoryId() : null, str));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void x5(@l String str) {
        this.f82766t = str;
    }

    @Override // x8.InterfaceC49790a
    public final void y(@k String str, @l String str2, @l String str3) {
        this.f82748b.c(new x8.b(str, str2, str3));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void y0(@l String str, @l String str2) {
        this.f82748b.c(new C26958a(str, str2));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void y1(@k ContactBarData contactBarData, @k SourceScreen sourceScreen, @l String str) {
        r.a aVar = r.f90128e;
        TreeClickStreamParent treeClickStreamParent = this.f82752f;
        String advertId = contactBarData.getAdvertId();
        String categoryId = contactBarData.getCategoryId();
        boolean zIsFromCompany = contactBarData.isFromCompany();
        String metroId = contactBarData.getMetroId();
        String locationId = contactBarData.getLocationId();
        String shopId = contactBarData.getShopId();
        boolean zB2 = this.f82754h.b("android.permission.RECORD_AUDIO").b();
        Boolean boolH = H();
        String strG = G();
        String str2 = this.f82766t;
        String str3 = this.f82767u;
        aVar.getClass();
        this.f82748b.c(new r(treeClickStreamParent, advertId, categoryId, zIsFromCompany, metroId, locationId, shopId, sourceScreen.f83155b, C35800g5.b(new C35792f5(str)), zB2, boolH, strG, str2, str3, null));
        this.f82768v.a();
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void y3(int i12, int i13, @k String str) {
        AdvertDetails advertDetails = this.f82763q;
        if (advertDetails == null) {
            advertDetails = null;
        }
        String id2 = advertDetails.getId();
        AdvertDetails advertDetails2 = this.f82763q;
        if (advertDetails2 == null) {
            advertDetails2 = null;
        }
        String categoryId = advertDetails2.getCategoryId();
        AdvertDetails advertDetails3 = this.f82763q;
        if (advertDetails3 == null) {
            advertDetails3 = null;
        }
        AdjustParameters adjustParameters = advertDetails3.getAdjustParameters();
        this.f82748b.c(new D8.b(i12, i13, id2, categoryId, adjustParameters != null ? adjustParameters.getMicroCategoryId() : null, str));
    }

    @Override // com.avito.android.advert_core.analytics.a
    public final void y6(@k BannerInfo bannerInfo, boolean z12, @k AdvertDetails advertDetails) {
        String id2 = advertDetails.getId();
        BannerEvent.Type type = BannerEvent.Type.f87773b;
        j.a.a(this, bannerInfo, null, z12, null, id2, 8);
    }

    @Override // com.avito.android.credits.e
    public final void z() {
        this.f82758l.z();
    }

    @Override // com.avito.android.advertising.loaders.j
    public final void z0(@k BannerInfo bannerInfo, @l Integer num, @k BannerEvent.Type type) {
        this.f82757k.z0(bannerInfo, num, type);
    }
}

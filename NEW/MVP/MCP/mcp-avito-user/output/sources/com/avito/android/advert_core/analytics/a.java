package com.avito.android.advert_core.analytics;

import Y61.k;
import Y61.l;
import com.avito.android.V;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.advert_core.analytics.address.GeoFromBlock;
import com.avito.android.advert_core.analytics.branding_gallery.AnalyticsBrandingType;
import com.avito.android.advert_core.analytics.modelspecs.ModelCardFrom;
import com.avito.android.advert_core.analytics.ownership_cost.OwnershipCostEventBlockType;
import com.avito.android.advert_core.analytics.recomendations.ExpandableTitleClickEvent;
import com.avito.android.advert_core.analytics.similars.ClickSimilarItemFavoritesAction;
import com.avito.android.advert_core.analytics.toolbar.BackFromPage;
import com.avito.android.advert_core.analytics.toolbar.NoteAction;
import com.avito.android.advert_core.contactbar.SourceScreen;
import com.avito.android.advert_core.sellerprofile.ShowSellersProfileSource;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import com.avito.android.advertising.loaders.j;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.analytics.event.service_booking.SbSignUpEvent;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.analytics_ratings_reviews.ReviewsOpenPageFrom;
import com.avito.android.rec.ScreenSource;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.advert_details.ContactBarData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import p9.e;
import x8.InterfaceC49790a;

/* compiled from: AdvertDetailsAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_core/analytics/a;", "Lcom/avito/android/advertising/loaders/j;", "Lcom/avito/android/V;", "Lp9/e;", "Lx8/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface a extends j, V, e, InterfaceC49790a {

    /* compiled from: AdvertDetailsAnalyticsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert_core.analytics.a$a, reason: collision with other inner class name */
    public static final class C2454a {
    }

    void A3(@k AdvertDetails advertDetails);

    void A6(@l String str, @l String str2, @l String str3);

    void B1(@k String str);

    void B5();

    void C3();

    void C5(boolean z12);

    void D3(int i12, int i13, @k String str);

    void E4(@k String str, boolean z12);

    void F3(@k String str, int i12, int i13, int i14, @l String str2, @k ModelCardFrom modelCardFrom, @k ModelCardFrom modelCardFrom2);

    void F4(@k AdvertDetails advertDetails, @l ScreenSource screenSource);

    void G1(@k ContactBarData contactBarData, boolean z12, @k SourceScreen sourceScreen, @l String str, @l String str2);

    void I5(@k String str);

    void I6(@k String str, @k String str2);

    void J1();

    void J2(@k AdvertDetails advertDetails);

    void J3();

    void K6(long j12, @l String str);

    void L1(int i12, int i13, @k String str);

    void L2(@k String str);

    void L3(@k String str, @k String str2);

    void L4(@k String str, boolean z12, @k BackFromPage backFromPage);

    void L6(@k String str, @k String str2);

    void M3();

    void N5(@k AdvertDetails advertDetails, @k String str, @k AdvertDetailsStyleAnalytics advertDetailsStyleAnalytics);

    void O(@k ParametrizedEvent parametrizedEvent);

    void O1(@k String str, @k String str2);

    void O2(@k String str, @l String str2, @l String str3);

    void O4(@k String str, @k ReviewsOpenPageFrom.ItemScroll itemScroll, @l String str2, @l String str3);

    void O6(@k String str, @k String str2, @k String str3, @l String str4);

    void P0(@k String str);

    void P1(@k String str, @l String str2, @l String str3, @k SbSignUpEvent.ServiceBookingSource serviceBookingSource);

    void Q4();

    @k
    TreeClickStreamParent Q5(boolean z12);

    void Q6();

    void R2(@l String str);

    void R3();

    void R4(@k String str, @k String str2, int i12, float f12);

    void R5(@k AdvertDetails advertDetails);

    void R6(@l String str);

    void S1();

    void S2(@k String str, @k String str2);

    void S6(@k BannerInfo bannerInfo, @k BuzzoolaBanner buzzoolaBanner);

    void T1();

    void T2(@k String str);

    void U0();

    void U1(@l String str);

    void U6(@l Long l12);

    void V(@k String str, @l String str2, @l String str3, @k GeoFromBlock geoFromBlock);

    void V1(@k ExpandableTitleClickEvent.ActionType actionType, @k AdvertDetailsStyleAnalytics advertDetailsStyleAnalytics, @l String str);

    void V2(@k String str, @k String str2, @k String str3, @l String str4);

    void W0(@k AdvertDetails advertDetails);

    void W1(@k AdvertDetails advertDetails);

    void W3(@k AdvertDetails advertDetails);

    void W5(@l String str);

    void W6(@k AdvertDetails advertDetails, @k ShowSellersProfileSource showSellersProfileSource);

    void X0(@l String str, @l String str2, @k String str3);

    void X1();

    void X2(@k SimpleTestGroupWithNone simpleTestGroupWithNone);

    void X4(@k AdvertDetails advertDetails, @k String str);

    void X5();

    void Y(@k String str, @l String str2, boolean z12);

    void Y6(@l String str, @l String str2);

    void Z1(@k String str, @l String str2, @l LinkedHashMap linkedHashMap);

    void Z2(@k AdvertDetails advertDetails);

    void a1(@k String str);

    void a2();

    void a5(@k String str);

    void a7();

    void b7();

    void c3(@k String str, boolean z12);

    void c7(@k AdvertDetails advertDetails);

    void d1(@l String str);

    void d3(@k AdvertDetails advertDetails, @k NoteAction noteAction, @l String str);

    void d4(@k String str);

    void e3(int i12, @k AdvertDetails advertDetails, @l String str);

    void e5(@l Long l12);

    void f1();

    void f6();

    void f7();

    void g0(@l String str);

    void g7(@k AdvertDetails advertDetails);

    void h0(@k String str, @k ContactSource contactSource, @l String str2, @l ScreenIdField screenIdField, @l String str3);

    void h3(@k String str, @k List<String> list, @k List<String> list2);

    void h7(int i12, @l String str, @l String str2);

    void i0(@k String str);

    void i1(@k AnalyticsBrandingType analyticsBrandingType);

    void i3(@k AdvertDetails advertDetails);

    void i4(@k BannerInfo bannerInfo);

    void i5(@k String str, @l String str2);

    void i7(@k String str, @k String str2);

    void j4(@l String str);

    void j5(@k AdvertDetails advertDetails, @k ClickSimilarItemFavoritesAction clickSimilarItemFavoritesAction, @k String str);

    void j7(@k List<Integer> list);

    void k(@k String str);

    void k0(@l String str, @l String str2, @l String str3);

    void k3(@l String str, @l String str2);

    void m6();

    void n0(@k BannerInfo bannerInfo, int i12);

    void n4(int i12, @k String str, @k ArrayList arrayList);

    void p(@k AdvertDetails advertDetails);

    void p0();

    void p3(@k String str, @l String str2);

    void p5(@k AdvertDetails advertDetails, boolean z12);

    void q0(int i12, @k AdvertDetails advertDetails, @l String str);

    void q7(@k String str);

    void r4(@k String str, @k String str2);

    void s0();

    void s3();

    void t4(@k BannerInfo bannerInfo, int i12);

    void t7(int i12, @k String str);

    void u5(@k String str);

    void u6(@k String str, @l String str2, @l String str3, boolean z12);

    void u7(@k BannerInfo bannerInfo, @k AdvertDetails advertDetails);

    @l
    String v0();

    void v1(@k String str);

    void v3(@k String str, @k String str2, @l String str3);

    void x0(@k AdvertDetails advertDetails);

    void x1(@k String str, @l OwnershipCostEventBlockType ownershipCostEventBlockType, @l String str2, @l LinkedHashMap linkedHashMap);

    void x3(@k String str);

    void x5(@l String str);

    void y0(@l String str, @l String str2);

    void y1(@k ContactBarData contactBarData, @k SourceScreen sourceScreen, @l String str);

    void y3(int i12, int i13, @k String str);

    void y6(@k BannerInfo bannerInfo, boolean z12, @k AdvertDetails advertDetails);
}

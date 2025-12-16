package com.avito.android.remote.adapter;

import KO.a;
import Y61.k;
import Z41.g;
import Zx.C19616a;
import com.avito.android.B2;
import com.avito.android.C29640d;
import com.avito.android.N2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.deep_linking.links.BodyCondition;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.AddedByAvitoParams;
import com.avito.android.remote.model.AdditionalSeller;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.AdvertSellerShortTermRent;
import com.avito.android.remote.model.AdvertSharing;
import com.avito.android.remote.model.AnonymousNumber;
import com.avito.android.remote.model.BeduinV2;
import com.avito.android.remote.model.CarMarketPrice;
import com.avito.android.remote.model.CheckInRules;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.ItemPromotion;
import com.avito.android.remote.model.MyAdvertAutoSelect;
import com.avito.android.remote.model.MyAdvertSafeDeal;
import com.avito.android.remote.model.MyAdvertVas;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.RejectReason;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.ServicesSellerSubscriptionBanner;
import com.avito.android.remote.model.Verification;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.advert_badge_bar.AdvertBadgeBar;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.remote.model.adverts.PremierPartner;
import com.avito.android.remote.model.adverts.PromoBlockData;
import com.avito.android.remote.model.adverts.Sales;
import com.avito.android.remote.model.adverts.StockManagement;
import com.avito.android.remote.model.adverts.multi_item.MultiItemParam;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.domoteka_report_teaser.DomotekaReportTeaser;
import com.avito.android.remote.model.evidence.EvidenceData;
import com.avito.android.remote.model.feature_teaser.AdvertDetailsFeaturesTeasers;
import com.avito.android.remote.model.feature_teaser.ApartmentFeature;
import com.avito.android.remote.model.installments.InstallmentsPromoBlockData;
import com.avito.android.remote.model.my_advert.AppliedServicesInfo;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.remote.model.urgency.MultiUrgencyBlockResponse;
import com.avito.android.remote.model.user_adverts.auction.AuctionBanner;
import com.avito.android.remote.model.ux_feedback.UxFeedbackConfigOld;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.x;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import ik0.C41419a;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.n;
import lD.C43617a;

/* compiled from: MyAdvertDetailsDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/adapter/MyAdvertDetailsDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MyAdvertDetailsDeserializer implements h<MyAdvertDetails> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final N2 f253067a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final B2 f253068b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C29640d f253069c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C43617a f253070d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C19616a f253071e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a f253072f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC28373a f253073g;

    public MyAdvertDetailsDeserializer(@k N2 n22, @k B2 b22, @k C29640d c29640d, @k C43617a c43617a, @k C19616a c19616a, @k a aVar, @k InterfaceC28373a interfaceC28373a) {
        this.f253067a = n22;
        this.f253068b = b22;
        this.f253069c = c29640d;
        this.f253070d = c43617a;
        this.f253071e = c19616a;
        this.f253072f = aVar;
        this.f253073g = interfaceC28373a;
    }

    public static String a(com.google.gson.k kVar, String str, String str2) {
        i iVarD;
        i iVarD2;
        i iVarD3;
        if (str2 == null || str2.length() == 0 || kVar == null || (iVarD = kVar.D(str)) == null || (iVarD2 = iVarD.i().D(str2)) == null || (iVarD3 = iVarD2.i().D("name")) == null) {
            return null;
        }
        return iVarD3.s();
    }

    @Override // com.google.gson.h
    public final MyAdvertDetails deserialize(i iVar, Type type, g gVar) {
        ArrayList arrayList;
        String strS;
        String str;
        String str2;
        String str3;
        ArrayList arrayList2;
        AuctionBanner auctionBanner;
        ArrayList arrayList3;
        ArrayList arrayList4;
        NativeVideo nativeVideo;
        NativeVideo nativeVideo2;
        Class<RejectReason> cls;
        C43617a c43617a;
        ArrayList arrayList5;
        MyAdvertDetails.ActivationInfo activationInfo;
        MyAdvertDetails.CompetitorAnalyticsInfo competitorAnalyticsInfo;
        String str4;
        ArrayList arrayList6;
        MyAdvertDetails.RealtyOwnerVerification realtyOwnerVerification;
        N2 n22;
        ArrayList arrayList7;
        N2 n23;
        ArrayList arrayList8;
        MyAdvertAutoSelect myAdvertAutoSelect;
        ArrayList arrayList9;
        ArrayList arrayList10;
        DomotekaReportTeaser domotekaReportTeaser;
        String str5;
        Class<DeepLink> cls2;
        ArrayList arrayList11;
        MyAdvertDetails.Portfolio portfolio;
        ArrayList arrayList12;
        MyAdvertDetails.ContactsBbl contactsBbl;
        ArrayList arrayList13;
        f fVarC;
        MyAdvertDetails.ContactsBbl contactsBblCopy$default;
        f fVarC2;
        ArrayList arrayList14;
        ArrayList<PromoBlockData> arrayList15;
        int i12;
        Map mapC;
        ArrayList arrayList16;
        String strS2;
        i iVarD;
        com.google.gson.k kVarI = iVar.i();
        String strS3 = kVarI.D("id").s();
        String strS4 = kVarI.D("categoryId").s();
        i iVarD2 = kVarI.D(SearchParamsConverterKt.LOCATION_ID);
        String strS5 = iVarD2 != null ? iVarD2.s() : null;
        i iVarD3 = kVarI.D(SearchParamsConverterKt.METRO_ID);
        String strS6 = iVarD3 != null ? iVarD3.s() : null;
        i iVarD4 = iVar.i().D("geoReferences");
        f fVarH = iVarD4 != null ? iVarD4.h() : null;
        if (fVarH == null) {
            arrayList = null;
        } else {
            int size = fVarH.f362000b.size();
            ArrayList arrayList17 = new ArrayList(size);
            int iC2 = 0;
            while (iC2 < size) {
                i iVarW = fVarH.w(iC2);
                iC2 = b.c(gVar, iVarW != null ? iVarW.i() : null, GeoReference.class, arrayList17, iC2, 1);
                size = size;
                arrayList17 = arrayList17;
            }
            arrayList = arrayList17;
        }
        i iVarD5 = kVarI.D(AddressParameter.TYPE);
        String strS7 = iVarD5 != null ? iVarD5.s() : null;
        String strS8 = kVarI.D("title").s();
        i iVarD6 = kVarI.D("screenTop");
        String strE = (iVarD6 == null || (iVarD = iVarD6.i().D("title")) == null) ? null : C34328m0.e(iVarD);
        String str6 = "";
        String str7 = strE == null ? "" : strE;
        i iVarD7 = kVarI.D(SearchParamsConverterKt.DIRECTION_ID);
        String strS9 = iVarD7 != null ? iVarD7.s() : null;
        i iVarD8 = kVarI.D(SearchParamsConverterKt.DISTRICT_ID);
        String strS10 = iVarD8 != null ? iVarD8.s() : null;
        i iVarD9 = kVarI.D(CrashHianalyticsData.TIME);
        long jL2 = iVarD9 != null ? iVarD9.l() : 0L;
        i iVarD10 = kVarI.D("ttlHumanized");
        String strS11 = iVarD10 != null ? iVarD10.s() : null;
        i iVarD11 = kVarI.D("wizardId");
        if (iVarD11 == null || (strS2 = iVarD11.s()) == null) {
            i iVarD12 = kVarI.D("params");
            if (iVarD12 == null) {
                str6 = null;
            } else {
                i iVarD13 = iVarD12.i().D("wizardId");
                if (iVarD13 != null && (strS = iVarD13.s()) != null) {
                    str6 = strS;
                }
            }
            str = str6;
        } else {
            str = strS2;
        }
        i iVarD14 = kVarI.D("coords");
        Coordinates coordinates = (Coordinates) (iVarD14 == null ? null : gVar.b(iVarD14, Coordinates.class));
        i iVarD15 = kVarI.D("sharing");
        AdvertSharing advertSharing = (AdvertSharing) (iVarD15 == null ? null : gVar.b(iVarD15, AdvertSharing.class));
        i iVarD16 = kVarI.D("actions");
        f fVarH2 = iVarD16 != null ? iVarD16.h() : null;
        if (fVarH2 == null) {
            str2 = strS9;
            str3 = strS10;
            arrayList2 = null;
        } else {
            int size2 = fVarH2.f362000b.size();
            ArrayList arrayList18 = new ArrayList(size2);
            int iC3 = 0;
            while (iC3 < size2) {
                i iVarW2 = fVarH2.w(iC3);
                iC3 = b.c(gVar, iVarW2 != null ? iVarW2.i() : null, Action.class, arrayList18, iC3, 1);
                size2 = size2;
                arrayList18 = arrayList18;
            }
            str2 = strS9;
            str3 = strS10;
            arrayList2 = arrayList18;
        }
        i iVarD17 = kVarI.D("description");
        String strS12 = iVarD17 != null ? iVarD17.s() : null;
        i iVarD18 = kVarI.D("descriptionHtml");
        String strS13 = iVarD18 != null ? iVarD18.s() : null;
        i iVarD19 = kVarI.D("anonymousNumber");
        AnonymousNumber anonymousNumber = (AnonymousNumber) (iVarD19 == null ? null : gVar.b(iVarD19, AnonymousNumber.class));
        i iVarD20 = kVarI.D("enableDelivery");
        boolean zD2 = iVarD20 != null ? iVarD20.d() : false;
        String strS14 = kVarI.D("userType").s();
        i iVarD21 = kVarI.D("seller");
        MyAdvertDetails.Seller seller = (MyAdvertDetails.Seller) (iVarD21 == null ? null : gVar.b(iVarD21, MyAdvertDetails.Seller.class));
        i iVarD22 = kVarI.D("phone");
        String strS15 = iVarD22 != null ? iVarD22.s() : null;
        i iVarD23 = kVarI.D("protection");
        Boolean boolValueOf = iVarD23 != null ? Boolean.valueOf(iVarD23.d()) : null;
        i iVarD24 = kVarI.D("vas");
        MyAdvertVas myAdvertVas = (MyAdvertVas) (iVarD24 == null ? null : gVar.b(iVarD24, MyAdvertVas.class));
        i iVarD25 = kVarI.D("shop");
        MyAdvertDetails.Shop shop = (MyAdvertDetails.Shop) (iVarD25 == null ? null : gVar.b(iVarD25, MyAdvertDetails.Shop.class));
        i iVarD26 = kVarI.D("limitBanner");
        MyAdvertDetails.VasBundlesBanner vasBundlesBanner = (MyAdvertDetails.VasBundlesBanner) (iVarD26 == null ? null : gVar.b(iVarD26, MyAdvertDetails.VasBundlesBanner.class));
        i iVarD27 = kVarI.D("alertBanner");
        MyAdvertDetails.AlertBanner alertBanner = (MyAdvertDetails.AlertBanner) (iVarD27 == null ? null : gVar.b(iVarD27, MyAdvertDetails.AlertBanner.class));
        C43617a c43617a2 = this.f253070d;
        c43617a2.getClass();
        n<Object> nVar = C43617a.f413588V[35];
        if (((Boolean) c43617a2.f413599K.a().invoke()).booleanValue()) {
            i iVarD28 = kVarI.D("auctionBanner");
            auctionBanner = (AuctionBanner) (iVarD28 == null ? null : gVar.b(iVarD28, AuctionBanner.class));
        } else {
            auctionBanner = null;
        }
        i iVarD29 = kVarI.D(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS);
        AdvertParameters advertParameters = (AdvertParameters) (iVarD29 == null ? null : gVar.b(iVarD29, AdvertParameters.class));
        i iVarD30 = kVarI.D("images");
        if (iVarD30 == null) {
            arrayList4 = null;
        } else {
            if (iVarD30 instanceof f) {
                f fVarH3 = iVarD30.h();
                int size3 = fVarH3.f362000b.size();
                ArrayList arrayList19 = new ArrayList();
                for (int i13 = 0; i13 < size3; i13++) {
                    arrayList19.add((MyAdvertDetails.ExtendedImage) gVar.b(fVarH3.w(i13).i(), MyAdvertDetails.ExtendedImage.class));
                }
                arrayList3 = arrayList19;
            } else if (iVarD30 instanceof com.google.gson.k) {
                MyAdvertDetails.ExtendedImage extendedImage = (MyAdvertDetails.ExtendedImage) gVar.b(iVarD30.i().D("main"), MyAdvertDetails.ExtendedImage.class);
                arrayList3 = new ArrayList();
                arrayList3.add(extendedImage);
            } else {
                arrayList3 = null;
            }
            arrayList4 = arrayList3;
        }
        i iVarD31 = kVarI.D("video");
        Video video = (Video) (iVarD31 == null ? null : gVar.b(iVarD31, Video.class));
        i iVarD32 = kVarI.D("nativeVideo");
        if (iVarD32 == null) {
            nativeVideo2 = null;
        } else {
            try {
                nativeVideo = (NativeVideo) gVar.b(iVarD32, NativeVideo.class);
            } catch (Exception e12) {
                this.f253073g.c(new C41419a(strS4, strS3, e12.getMessage()));
                nativeVideo = null;
            }
            nativeVideo2 = nativeVideo;
        }
        String strS16 = kVarI.D("status").s();
        i iVarD33 = kVarI.D("price");
        MyAdvertDetails.Price price = (MyAdvertDetails.Price) (iVarD33 == null ? null : gVar.b(iVarD33, MyAdvertDetails.Price.class));
        i iVarD34 = kVarI.D("sales");
        Sales sales = (Sales) (iVarD34 == null ? null : gVar.b(iVarD34, Sales.class));
        i iVarD35 = kVarI.D("stockManagement");
        StockManagement stockManagement = (StockManagement) (iVarD35 == null ? null : gVar.b(iVarD35, StockManagement.class));
        i iVarD36 = kVarI.D("stats");
        MyAdvertDetails.Stats stats = (MyAdvertDetails.Stats) (iVarD36 == null ? null : gVar.b(iVarD36, MyAdvertDetails.Stats.class));
        i iVarD37 = kVarI.D("analyticsWidgets");
        BeduinV2 beduinV2 = (BeduinV2) (iVarD37 == null ? null : gVar.b(iVarD37, BeduinV2.class));
        i iVarD38 = kVarI.D("reasonsTitle");
        String strS17 = iVarD38 != null ? iVarD38.s() : null;
        i iVarD39 = kVarI.D("reservationInfo");
        MyAdvertDetails.ReservationInfo reservationInfo = (MyAdvertDetails.ReservationInfo) (iVarD39 == null ? null : gVar.b(iVarD39, MyAdvertDetails.ReservationInfo.class));
        i iVarD40 = kVarI.D("reasons");
        f fVarH4 = iVarD40 != null ? iVarD40.h() : null;
        Class<RejectReason> cls3 = RejectReason.class;
        if (fVarH4 == null) {
            cls = cls3;
            c43617a = c43617a2;
            arrayList5 = null;
        } else {
            int size4 = fVarH4.f362000b.size();
            ArrayList arrayList20 = new ArrayList(size4);
            int iC4 = 0;
            while (iC4 < size4) {
                i iVarW3 = fVarH4.w(iC4);
                ArrayList arrayList21 = arrayList20;
                iC4 = b.c(gVar, iVarW3 != null ? iVarW3.i() : null, cls3, arrayList21, iC4, 1);
                arrayList20 = arrayList21;
                size4 = size4;
                cls3 = cls3;
                c43617a2 = c43617a2;
            }
            cls = cls3;
            c43617a = c43617a2;
            arrayList5 = arrayList20;
        }
        i iVarD41 = kVarI.D("evidenceData");
        EvidenceData evidenceData = (EvidenceData) (iVarD41 == null ? null : gVar.b(iVarD41, EvidenceData.class));
        i iVarD42 = kVarI.D("moderationInfo");
        String str8 = (String) (iVarD42 == null ? null : gVar.b(iVarD42, String.class));
        x<String, i> xVar = kVarI.f362194b;
        if (xVar.containsKey("activationInfo")) {
            i iVarD43 = kVarI.D("activationInfo");
            activationInfo = (MyAdvertDetails.ActivationInfo) (iVarD43 == null ? null : gVar.b(iVarD43, MyAdvertDetails.ActivationInfo.class));
        } else {
            activationInfo = null;
        }
        a aVar = this.f253072f;
        aVar.getClass();
        n<Object> nVar2 = a.f9442h[0];
        if (((Boolean) aVar.f9443b.a().invoke()).booleanValue() && xVar.containsKey("competitorAnalyticsInfo")) {
            i iVarD44 = kVarI.D("competitorAnalyticsInfo");
            competitorAnalyticsInfo = (MyAdvertDetails.CompetitorAnalyticsInfo) (iVarD44 == null ? null : gVar.b(iVarD44, MyAdvertDetails.CompetitorAnalyticsInfo.class));
        } else {
            competitorAnalyticsInfo = null;
        }
        i iVarD45 = kVarI.D("refs");
        com.google.gson.k kVarI2 = iVarD45 != null ? iVarD45.i() : null;
        String strA = a(kVarI2, "locations", strS5);
        String strA2 = a(kVarI2, MetroParameter.TYPE, strS6);
        String str9 = str3;
        String strA3 = a(kVarI2, "districts", str9);
        String strA4 = a(kVarI2, "directions", str2);
        i iVarD46 = kVarI.D("shortTermRent");
        AdvertSellerShortTermRent advertSellerShortTermRent = (AdvertSellerShortTermRent) (iVarD46 == null ? null : gVar.b(iVarD46, AdvertSellerShortTermRent.class));
        i iVarD47 = kVarI.D("appliedServices");
        AppliedServicesInfo appliedServicesInfo = (AppliedServicesInfo) (iVarD47 == null ? null : gVar.b(iVarD47, AppliedServicesInfo.class));
        i iVarD48 = kVarI.D("verification");
        Verification verification = (Verification) (iVarD48 == null ? null : gVar.b(iVarD48, Verification.class));
        i iVarD49 = kVarI.D("safeDeal");
        MyAdvertSafeDeal myAdvertSafeDeal = (MyAdvertSafeDeal) (iVarD49 == null ? null : gVar.b(iVarD49, MyAdvertSafeDeal.class));
        i iVarD50 = kVarI.D("advertOptions");
        f fVarH5 = iVarD50 != null ? iVarD50.h() : null;
        if (fVarH5 == null) {
            str4 = str9;
            arrayList6 = null;
        } else {
            int size5 = fVarH5.f362000b.size();
            ArrayList arrayList22 = new ArrayList(size5);
            int iC5 = 0;
            while (iC5 < size5) {
                i iVarW4 = fVarH5.w(iC5);
                ArrayList arrayList23 = arrayList22;
                iC5 = b.c(gVar, iVarW4 != null ? iVarW4.i() : null, ApartmentFeature.class, arrayList23, iC5, 1);
                arrayList22 = arrayList23;
                size5 = size5;
                str9 = str9;
                fVarH5 = fVarH5;
            }
            str4 = str9;
            arrayList6 = arrayList22;
        }
        i iVarD51 = kVarI.D("features");
        AdvertDetailsFeaturesTeasers advertDetailsFeaturesTeasers = (AdvertDetailsFeaturesTeasers) (iVarD51 == null ? null : gVar.b(iVarD51, AdvertDetailsFeaturesTeasers.class));
        i iVarD52 = kVarI.D("autoPublish");
        MyAdvertDetails.AutoPublish autoPublish = (MyAdvertDetails.AutoPublish) (iVarD52 == null ? null : gVar.b(iVarD52, MyAdvertDetails.AutoPublish.class));
        i iVarD53 = kVarI.D("creditInfoItem");
        MyAdvertDetails.CreditInfoItem creditInfoItem = (MyAdvertDetails.CreditInfoItem) (iVarD53 == null ? null : gVar.b(iVarD53, MyAdvertDetails.CreditInfoItem.class));
        i iVarD54 = kVarI.D("serviceBookingEntrypoint");
        MyAdvertDetails.SbStatusBlock sbStatusBlock = (MyAdvertDetails.SbStatusBlock) (iVarD54 == null ? null : gVar.b(iVarD54, MyAdvertDetails.SbStatusBlock.class));
        i iVarD55 = kVarI.D("serviceBookingInfo");
        MyAdvertDetails.ServiceBookingReminderBlock serviceBookingReminderBlock = (MyAdvertDetails.ServiceBookingReminderBlock) (iVarD55 == null ? null : gVar.b(iVarD55, MyAdvertDetails.ServiceBookingReminderBlock.class));
        i iVarD56 = kVarI.D("installmentsPromoBlock");
        InstallmentsPromoBlockData installmentsPromoBlockData = (InstallmentsPromoBlockData) (iVarD56 == null ? null : gVar.b(iVarD56, InstallmentsPromoBlockData.class));
        i iVarD57 = kVarI.D("bodyCondition");
        BodyCondition bodyCondition = (BodyCondition) (iVarD57 == null ? null : gVar.b(iVarD57, BodyCondition.class));
        i iVarD58 = kVarI.D("carMarketPrice");
        CarMarketPrice carMarketPrice = (CarMarketPrice) (iVarD58 == null ? null : gVar.b(iVarD58, CarMarketPrice.class));
        i iVarD59 = kVarI.D("isIacChosen");
        Boolean boolValueOf2 = iVarD59 != null ? Boolean.valueOf(iVarD59.d()) : null;
        i iVarD60 = kVarI.D("agreement");
        MyAdvertDetails.SalesContract salesContract = (MyAdvertDetails.SalesContract) (iVarD60 == null ? null : gVar.b(iVarD60, MyAdvertDetails.SalesContract.class));
        N2 n24 = this.f253067a;
        n24.getClass();
        n<Object>[] nVarArr = N2.f67352m;
        n<Object> nVar3 = nVarArr[0];
        if (((Boolean) n24.f67353b.a().invoke()).booleanValue()) {
            i iVarD61 = kVarI.D("realtyOwnerVerificationStatus");
            realtyOwnerVerification = (MyAdvertDetails.RealtyOwnerVerification) (iVarD61 == null ? null : gVar.b(iVarD61, MyAdvertDetails.RealtyOwnerVerification.class));
        } else {
            realtyOwnerVerification = null;
        }
        i iVarD62 = kVarI.D("reliableOwner");
        MyAdvertDetails.ReliableOwner reliableOwner = (MyAdvertDetails.ReliableOwner) (iVarD62 == null ? null : gVar.b(iVarD62, MyAdvertDetails.ReliableOwner.class));
        int i14 = 1;
        n<Object> nVar4 = nVarArr[1];
        if (((Boolean) n24.f67354c.a().invoke()).booleanValue()) {
            i iVarD63 = kVarI.D("promoBlockFeed");
            f fVarH6 = iVarD63 != null ? iVarD63.h() : null;
            if (fVarH6 == null) {
                i12 = 1;
                n22 = n24;
                arrayList15 = null;
            } else {
                int size6 = fVarH6.f362000b.size();
                arrayList15 = new ArrayList(size6);
                int iC6 = 0;
                while (iC6 < size6) {
                    i iVarW5 = fVarH6.w(iC6);
                    ArrayList arrayList24 = arrayList15;
                    iC6 = b.c(gVar, iVarW5 != null ? iVarW5.i() : null, PromoBlockData.class, arrayList24, iC6, 1);
                    i14 = i14;
                    size6 = size6;
                    fVarH6 = fVarH6;
                    arrayList15 = arrayList24;
                    n24 = n24;
                }
                i12 = i14;
                n22 = n24;
            }
            if (arrayList15 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = arrayList15.iterator();
                while (it.hasNext()) {
                    Theme theme = ((PromoBlockData) it.next()).getTheme();
                    Object fVar = linkedHashMap.get(theme);
                    if (fVar == null && !linkedHashMap.containsKey(theme)) {
                        fVar = new l0.f();
                    }
                    l0.f fVar2 = (l0.f) fVar;
                    fVar2.f406840b += i12;
                    linkedHashMap.put(theme, fVar2);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if ((entry instanceof Z41.a) && !(entry instanceof g.a)) {
                        v0.i(entry, "kotlin.collections.MutableMap.MutableEntry");
                        throw null;
                    }
                    try {
                        entry.setValue(Integer.valueOf(((l0.f) entry.getValue()).f406840b));
                    } catch (ClassCastException e13) {
                        L.i(e13, v0.class.getName());
                        throw e13;
                    }
                }
                mapC = v0.c(linkedHashMap);
            } else {
                mapC = null;
            }
            if (mapC == null) {
                mapC = P0.c();
            }
            Theme theme2 = Theme.AVITO_RE_23;
            if (!mapC.containsKey(theme2)) {
                theme2 = Theme.AVITO_LOOK_AND_FEEL;
                if (!mapC.containsKey(theme2)) {
                    theme2 = Theme.AVITO;
                }
            }
            if (arrayList15 != null) {
                arrayList16 = new ArrayList(C42745f0.q(arrayList15, 10));
                for (PromoBlockData promoBlockData : arrayList15) {
                    arrayList16.add(promoBlockData.copy((1023 & 1) != 0 ? promoBlockData.id : null, (1023 & 2) != 0 ? promoBlockData.title : null, (1023 & 4) != 0 ? promoBlockData.progressBar : null, (1023 & 8) != 0 ? promoBlockData._insights : null, (1023 & 16) != 0 ? promoBlockData._actions : null, (1023 & 32) != 0 ? promoBlockData.footer : null, (1023 & 64) != 0 ? promoBlockData.style : null, (1023 & 128) != 0 ? promoBlockData.type : null, (1023 & 256) != 0 ? promoBlockData.position : null, (1023 & 512) != 0 ? promoBlockData.closable : false, (1023 & 1024) != 0 ? promoBlockData._theme : theme2));
                }
            } else {
                arrayList16 = null;
            }
            arrayList7 = arrayList16;
        } else {
            n22 = n24;
            arrayList7 = null;
        }
        i iVarD64 = kVarI.D("customReason");
        RejectReason rejectReason = (RejectReason) (iVarD64 == null ? null : gVar.b(iVarD64, cls));
        i iVarD65 = kVarI.D("rulesParams");
        CheckInRules checkInRules = (CheckInRules) (iVarD65 == null ? null : gVar.b(iVarD65, CheckInRules.class));
        i iVarD66 = kVarI.D("additionalSeller");
        AdditionalSeller additionalSeller = (AdditionalSeller) (iVarD66 == null ? null : gVar.b(iVarD66, AdditionalSeller.class));
        i iVarD67 = kVarI.D("fashionAuthenticity");
        MyAdvertDetails.FashionAuthenticity fashionAuthenticity = (MyAdvertDetails.FashionAuthenticity) (iVarD67 == null ? null : gVar.b(iVarD67, MyAdvertDetails.FashionAuthenticity.class));
        i iVarD68 = kVarI.D(AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR);
        AdvertBadgeBar advertBadgeBar = (AdvertBadgeBar) (iVarD68 == null ? null : gVar.b(iVarD68, AdvertBadgeBar.class));
        i iVarD69 = kVarI.D("itemPromotion");
        ItemPromotion itemPromotion = (ItemPromotion) (iVarD69 == null ? null : gVar.b(iVarD69, ItemPromotion.class));
        i iVarD70 = kVarI.D("buyoutPhone");
        MyAdvertDetails.BuyoutPhone buyoutPhone = (MyAdvertDetails.BuyoutPhone) (iVarD70 == null ? null : gVar.b(iVarD70, MyAdvertDetails.BuyoutPhone.class));
        i iVarD71 = kVarI.D("itemReviews");
        MyAdvertDetails.ItemReviews itemReviews = (MyAdvertDetails.ItemReviews) (iVarD71 == null ? null : gVar.b(iVarD71, MyAdvertDetails.ItemReviews.class));
        n<Object> nVar5 = N2.f67352m[3];
        N2 n25 = n22;
        if (((Boolean) n25.f67356e.a().invoke()).booleanValue()) {
            i iVarD72 = kVarI.D("verificationRecommendationActions");
            f fVarH7 = iVarD72 != null ? iVarD72.h() : null;
            if (fVarH7 == null) {
                n23 = n25;
                arrayList14 = null;
            } else {
                int size7 = fVarH7.f362000b.size();
                ArrayList arrayList25 = new ArrayList(size7);
                int iC7 = 0;
                while (iC7 < size7) {
                    i iVarW6 = fVarH7.w(iC7);
                    ArrayList arrayList26 = arrayList25;
                    iC7 = b.c(gVar, iVarW6 != null ? iVarW6.i() : null, BeduinAction.class, arrayList26, iC7, 1);
                    n25 = n25;
                    arrayList25 = arrayList26;
                    size7 = size7;
                    fVarH7 = fVarH7;
                }
                n23 = n25;
                arrayList14 = arrayList25;
            }
            arrayList8 = arrayList14;
        } else {
            n23 = n25;
            arrayList8 = null;
        }
        n<Object> nVar6 = C43617a.f413588V[22];
        if (((Boolean) c43617a.f413632x.a().invoke()).booleanValue()) {
            i iVarD73 = kVarI.D("autoSelect");
            myAdvertAutoSelect = (MyAdvertAutoSelect) (iVarD73 == null ? null : gVar.b(iVarD73, MyAdvertAutoSelect.class));
        } else {
            myAdvertAutoSelect = null;
        }
        i iVarD74 = kVarI.D("premierPartner");
        PremierPartner premierPartner = (PremierPartner) (iVarD74 == null ? null : gVar.b(iVarD74, PremierPartner.class));
        i iVarD75 = kVarI.D("publishWarningBanner");
        MyAdvertDetails.PublishWarningBanner publishWarningBanner = (MyAdvertDetails.PublishWarningBanner) (iVarD75 == null ? null : gVar.b(iVarD75, MyAdvertDetails.PublishWarningBanner.class));
        i iVarD76 = kVarI.D("uxFeedbackConfigs");
        f fVarH8 = iVarD76 != null ? iVarD76.h() : null;
        if (fVarH8 == null) {
            arrayList9 = null;
        } else {
            int size8 = fVarH8.f362000b.size();
            ArrayList arrayList27 = new ArrayList(size8);
            int iC8 = 0;
            while (iC8 < size8) {
                i iVarW7 = fVarH8.w(iC8);
                iC8 = b.c(gVar, iVarW7 != null ? iVarW7.i() : null, UxFeedbackConfigOld.class, arrayList27, iC8, 1);
                fVarH8 = fVarH8;
                size8 = size8;
            }
            arrayList9 = arrayList27;
        }
        i iVarD77 = kVarI.D("uxFeedbackDeepLinks");
        Class<DeepLink> cls4 = DeepLink.class;
        if (iVarD77 != null) {
            ArrayList arrayList28 = iVarD77.h().f362000b;
            ArrayList arrayList29 = new ArrayList(arrayList28.size());
            Iterator it2 = arrayList28.iterator();
            while (it2.hasNext()) {
                arrayList29.add(gVar.b((i) it2.next(), cls4));
            }
            arrayList10 = arrayList29;
        } else {
            arrayList10 = null;
        }
        i iVarD78 = kVarI.D("fillParametersBanner");
        MyAdvertDetails.FillParametersBanner fillParametersBanner = (MyAdvertDetails.FillParametersBanner) (iVarD78 == null ? null : gVar.b(iVarD78, MyAdvertDetails.FillParametersBanner.class));
        C29640d c29640d = this.f253069c;
        c29640d.getClass();
        n<Object> nVar7 = C29640d.f132175X[20];
        if (((Boolean) c29640d.f132218u.a().invoke()).booleanValue()) {
            i iVarD79 = kVarI.D("domotekaReportTeaser");
            domotekaReportTeaser = (DomotekaReportTeaser) (iVarD79 == null ? null : gVar.b(iVarD79, DomotekaReportTeaser.class));
        } else {
            domotekaReportTeaser = null;
        }
        i iVarD80 = kVarI.D("multiUrgencyServicesBlock");
        MultiUrgencyBlockResponse multiUrgencyBlockResponse = (MultiUrgencyBlockResponse) (iVarD80 == null ? null : gVar.b(iVarD80, MultiUrgencyBlockResponse.class));
        i iVarD81 = iVar.i().D("autoDescriptionFeedback");
        DeepLink deepLink = (DeepLink) (iVarD81 == null ? null : gVar.b(iVarD81, cls4));
        i iVarD82 = kVarI.D("multiAddresses");
        MyAdvertDetails.MultiAddresses multiAddresses = (MyAdvertDetails.MultiAddresses) (iVarD82 == null ? null : gVar.b(iVarD82, MyAdvertDetails.MultiAddresses.class));
        n<Object> nVar8 = N2.f67352m[4];
        if (((Boolean) n23.f67357f.a().invoke()).booleanValue()) {
            i iVarD83 = kVarI.D("multiItemParams");
            f fVarH9 = iVarD83 != null ? iVarD83.h() : null;
            if (fVarH9 == null) {
                str5 = str2;
                arrayList11 = null;
                cls2 = cls4;
            } else {
                int size9 = fVarH9.f362000b.size();
                ArrayList arrayList30 = new ArrayList(size9);
                int iC9 = 0;
                while (iC9 < size9) {
                    i iVarW8 = fVarH9.w(iC9);
                    iC9 = b.c(gVar, iVarW8 != null ? iVarW8.i() : null, MultiItemParam.class, arrayList30, iC9, 1);
                    cls4 = cls4;
                    str2 = str2;
                    size9 = size9;
                }
                str5 = str2;
                cls2 = cls4;
                arrayList11 = arrayList30;
            }
        } else {
            str5 = str2;
            cls2 = cls4;
            arrayList11 = null;
        }
        i iVarD84 = kVarI.D("machineryRentalTransactionBlock");
        MyAdvertDetails.MachineryRentalBanner machineryRentalBanner = (MyAdvertDetails.MachineryRentalBanner) (iVarD84 == null ? null : gVar.b(iVarD84, MyAdvertDetails.MachineryRentalBanner.class));
        i iVarD85 = kVarI.D("deliverySettings");
        MyAdvertDetails.DeliverySettings deliverySettings = (MyAdvertDetails.DeliverySettings) (iVarD85 == null ? null : gVar.b(iVarD85, MyAdvertDetails.DeliverySettings.class));
        i iVarD86 = kVarI.D("promoActivitiesBlock");
        MyAdvertDetails.PromoActivities promoActivities = (MyAdvertDetails.PromoActivities) (iVarD86 == null ? null : gVar.b(iVarD86, MyAdvertDetails.PromoActivities.class));
        if (this.f253068b.x().invoke().booleanValue()) {
            i iVarD87 = kVarI.D("portfolio");
            portfolio = (MyAdvertDetails.Portfolio) (iVarD87 == null ? null : gVar.b(iVarD87, MyAdvertDetails.Portfolio.class));
        } else {
            portfolio = null;
        }
        i iVarD88 = kVarI.D("comfortableDealRoom");
        MyAdvertDetails.EntryPointToAccountOwnerBanner entryPointToAccountOwnerBanner = (MyAdvertDetails.EntryPointToAccountOwnerBanner) (iVarD88 == null ? null : gVar.b(iVarD88, MyAdvertDetails.EntryPointToAccountOwnerBanner.class));
        i iVarD89 = kVarI.D("addedByAvitoImagesIndexes");
        if (iVarD89 == null || (fVarC2 = C34328m0.c(iVarD89)) == null) {
            arrayList12 = null;
        } else {
            ArrayList arrayList31 = fVarC2.f362000b;
            arrayList12 = new ArrayList(arrayList31.size());
            Iterator it3 = arrayList31.iterator();
            while (it3.hasNext()) {
                arrayList12.add(gVar.b((i) it3.next(), Integer.class));
            }
        }
        i iVarD90 = kVarI.D("addedByAvitoImagesLabel");
        String strS18 = iVarD90 != null ? iVarD90.s() : null;
        AddedByAvitoParams addedByAvitoParams = (arrayList12 == null || strS18 == null) ? null : new AddedByAvitoParams(C42745f0.P0(arrayList12), strS18);
        i iVarD91 = iVar.i().D("onAdvertLoadedDeepLink");
        DeepLink deepLink2 = (DeepLink) (iVarD91 == null ? null : gVar.b(iVarD91, cls2));
        i iVarD92 = iVar.i().D("servicesSellerSubscriptionBanner");
        ServicesSellerSubscriptionBanner servicesSellerSubscriptionBanner = (ServicesSellerSubscriptionBanner) (iVarD92 == null ? null : gVar.b(iVarD92, ServicesSellerSubscriptionBanner.class));
        C19616a c19616a = this.f253071e;
        c19616a.getClass();
        n<Object>[] nVarArr2 = C19616a.f20576q;
        n<Object> nVar9 = nVarArr2[4];
        if (((Boolean) c19616a.f20581f.a().invoke()).booleanValue()) {
            i iVarD93 = kVarI.D("contactsBbl");
            MyAdvertDetails.ContactsBbl contactsBbl2 = (MyAdvertDetails.ContactsBbl) (iVarD93 == null ? null : gVar.b(iVarD93, MyAdvertDetails.ContactsBbl.class));
            if (contactsBbl2 != null) {
                MyAdvertDetails.ContactsBbl.HistoryData historyData = contactsBbl2.getHistoryData();
                n<Object> nVar10 = nVarArr2[8];
                contactsBblCopy$default = MyAdvertDetails.ContactsBbl.copy$default(contactsBbl2, null, null, null, ((Boolean) c19616a.f20585j.a().invoke()).booleanValue() ? historyData : null, 7, null);
            } else {
                contactsBblCopy$default = null;
            }
            contactsBbl = contactsBblCopy$default;
        } else {
            contactsBbl = null;
        }
        i iVarD94 = kVarI.D("jobListItems");
        if (iVarD94 == null || (fVarC = C34328m0.c(iVarD94)) == null) {
            arrayList13 = null;
        } else {
            ArrayList arrayList32 = fVarC.f362000b;
            ArrayList arrayList33 = new ArrayList(arrayList32.size());
            Iterator it4 = arrayList32.iterator();
            while (it4.hasNext()) {
                arrayList33.add(gVar.b((i) it4.next(), MyAdvertDetails.JobListItem.class));
            }
            arrayList13 = arrayList33;
        }
        i iVarD95 = iVar.i().D("supportAutomation");
        MyAdvertDetails.SupportAutomation supportAutomation = (MyAdvertDetails.SupportAutomation) (iVarD95 == null ? null : gVar.b(iVarD95, MyAdvertDetails.SupportAutomation.class));
        i iVarD96 = kVarI.D("copyAdvertTooltip");
        MyAdvertDetails.CopyAdvertTooltip copyAdvertTooltip = (MyAdvertDetails.CopyAdvertTooltip) (iVarD96 == null ? null : gVar.b(iVarD96, MyAdvertDetails.CopyAdvertTooltip.class));
        i iVarD97 = kVarI.D("bannerFromSxBanners");
        return new MyAdvertDetails(strS3, strA, strA2, strA3, strA4, strS4, strS5, strS6, strS7, arrayList, strS8, str7, str5, str4, jL2, strS11, str, coordinates, advertSharing, arrayList2, strS12, strS13, bodyCondition, anonymousNumber, zD2, strS14, seller, strS15, boolValueOf, myAdvertVas, shop, vasBundlesBanner, alertBanner, auctionBanner, advertParameters, arrayList4, video, nativeVideo2, strS16, price, sales, stockManagement, stats, beduinV2, strS17, arrayList5, rejectReason, evidenceData, str8, reservationInfo, activationInfo, competitorAnalyticsInfo, advertSellerShortTermRent, appliedServicesInfo, verification, myAdvertSafeDeal, advertDetailsFeaturesTeasers, arrayList6, autoPublish == null ? new MyAdvertDetails.AutoPublish(null, 1, null) : autoPublish, creditInfoItem, sbStatusBlock, serviceBookingReminderBlock, carMarketPrice, boolValueOf2, salesContract, realtyOwnerVerification, reliableOwner, arrayList7, installmentsPromoBlockData, checkInRules, additionalSeller, fashionAuthenticity, advertBadgeBar, itemPromotion, buyoutPhone, arrayList8, itemReviews, myAdvertAutoSelect, premierPartner, publishWarningBanner, arrayList9, arrayList10, fillParametersBanner, domotekaReportTeaser, multiUrgencyBlockResponse, deepLink, multiAddresses, arrayList11, machineryRentalBanner, deliverySettings, promoActivities, entryPointToAccountOwnerBanner, addedByAvitoParams, deepLink2, portfolio, servicesSellerSubscriptionBanner, contactsBbl, arrayList13, supportAutomation, copyAdvertTooltip, (MyAdvertDetails.BannerFromSxBanners) (iVarD97 == null ? null : gVar.b(iVarD97, MyAdvertDetails.BannerFromSxBanners.class)));
    }
}

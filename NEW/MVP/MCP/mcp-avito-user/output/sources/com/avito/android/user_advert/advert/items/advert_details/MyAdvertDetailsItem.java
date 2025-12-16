package com.avito.android.user_advert.advert.items.advert_details;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.deep_linking.links.BodyCondition;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.AddedByAvitoParams;
import com.avito.android.remote.model.AdditionalSeller;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.AdvertSellerShortTermRent;
import com.avito.android.remote.model.AdvertSharing;
import com.avito.android.remote.model.AnonymousNumber;
import com.avito.android.remote.model.BeduinV2;
import com.avito.android.remote.model.CarMarketPrice;
import com.avito.android.remote.model.CheckInRules;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ItemPromotion;
import com.avito.android.remote.model.MyAdvertAutoSelect;
import com.avito.android.remote.model.MyAdvertSafeDeal;
import com.avito.android.remote.model.MyAdvertVas;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.RejectReason;
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
import com.avito.android.remote.model.domoteka_report_teaser.DomotekaReportTeaser;
import com.avito.android.remote.model.evidence.EvidenceData;
import com.avito.android.remote.model.feature_teaser.AdvertDetailsFeaturesTeasers;
import com.avito.android.remote.model.feature_teaser.ApartmentFeature;
import com.avito.android.remote.model.installments.InstallmentsPromoBlockData;
import com.avito.android.remote.model.my_advert.AppliedServicesInfo;
import com.avito.android.remote.model.urgency.MultiUrgencyBlockResponse;
import com.avito.android.remote.model.user_adverts.auction.AuctionBanner;
import com.avito.android.remote.model.ux_feedback.UxFeedbackConfigOld;
import com.avito.android.user_advert.advert.AdvertStats;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;

/* compiled from: MyAdvertDetailsItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/advert_details/MyAdvertDetailsItem;", "Landroid/os/Parcelable;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MyAdvertDetailsItem implements Parcelable {

    @k
    public static final Parcelable.Creator<MyAdvertDetailsItem> CREATOR = new a();

    /* renamed from: A, reason: collision with root package name */
    @l
    public final MyAdvertVas f309080A;

    /* renamed from: A0, reason: collision with root package name */
    @l
    public final List<UxFeedbackConfigOld> f309081A0;

    /* renamed from: B, reason: collision with root package name */
    @l
    public final MyAdvertDetails.ActivationInfo f309082B;

    /* renamed from: B0, reason: collision with root package name */
    @l
    public final List<DeepLink> f309083B0;

    /* renamed from: C, reason: collision with root package name */
    @l
    public final MyAdvertDetails.Shop f309084C;

    /* renamed from: C0, reason: collision with root package name */
    @l
    public final MyAdvertDetails.FillParametersBanner f309085C0;

    /* renamed from: D, reason: collision with root package name */
    @l
    public final MyAdvertDetails.VasBundlesBanner f309086D;

    /* renamed from: D0, reason: collision with root package name */
    @l
    public final DomotekaReportTeaser f309087D0;

    /* renamed from: E, reason: collision with root package name */
    @l
    public final MyAdvertDetails.AlertBanner f309088E;

    /* renamed from: E0, reason: collision with root package name */
    @l
    public final MultiUrgencyBlockResponse f309089E0;

    /* renamed from: F, reason: collision with root package name */
    @l
    public final AuctionBanner f309090F;

    /* renamed from: F0, reason: collision with root package name */
    @l
    public final DeepLink f309091F0;

    /* renamed from: G, reason: collision with root package name */
    @l
    public final AdvertParameters f309092G;

    /* renamed from: G0, reason: collision with root package name */
    @l
    public final MyAdvertDetails.MultiAddresses f309093G0;

    /* renamed from: H, reason: collision with root package name */
    @k
    public final List<Image> f309094H;

    /* renamed from: H0, reason: collision with root package name */
    @l
    public final List<MultiItemParam> f309095H0;

    /* renamed from: I, reason: collision with root package name */
    @l
    public final Video f309096I;

    /* renamed from: I0, reason: collision with root package name */
    @l
    public final MyAdvertDetails.MachineryRentalBanner f309097I0;

    /* renamed from: J, reason: collision with root package name */
    @l
    public final NativeVideo f309098J;

    /* renamed from: J0, reason: collision with root package name */
    @l
    public final MyAdvertDetails.DeliverySettings f309099J0;

    /* renamed from: K, reason: collision with root package name */
    @k
    public String f309100K;

    /* renamed from: K0, reason: collision with root package name */
    @l
    public final MyAdvertDetails.PromoActivities f309101K0;

    /* renamed from: L, reason: collision with root package name */
    @l
    public final MyAdvertDetails.Price f309102L;

    /* renamed from: L0, reason: collision with root package name */
    @l
    public final MyAdvertDetails.EntryPointToAccountOwnerBanner f309103L0;

    /* renamed from: M, reason: collision with root package name */
    @l
    public final Sales f309104M;

    /* renamed from: M0, reason: collision with root package name */
    @l
    public final AddedByAvitoParams f309105M0;

    /* renamed from: N, reason: collision with root package name */
    @l
    public final StockManagement f309106N;

    /* renamed from: N0, reason: collision with root package name */
    @l
    public final DeepLink f309107N0;

    /* renamed from: O, reason: collision with root package name */
    @l
    public final AdvertStats f309108O;

    /* renamed from: O0, reason: collision with root package name */
    @l
    public final ServicesSellerSubscriptionBanner f309109O0;

    /* renamed from: P, reason: collision with root package name */
    @l
    public final BeduinV2 f309110P;

    /* renamed from: P0, reason: collision with root package name */
    @l
    public final MyAdvertDetails.ContactsBbl f309111P0;

    /* renamed from: Q, reason: collision with root package name */
    @l
    public final String f309112Q;

    /* renamed from: Q0, reason: collision with root package name */
    @l
    public final MyAdvertDetails.Portfolio f309113Q0;

    /* renamed from: R, reason: collision with root package name */
    @l
    public final List<RejectReason> f309114R;

    /* renamed from: R0, reason: collision with root package name */
    @l
    public final MyAdvertDetails.CompetitorAnalyticsInfo f309115R0;

    /* renamed from: S, reason: collision with root package name */
    @l
    public final RejectReason f309116S;

    /* renamed from: S0, reason: collision with root package name */
    @l
    public final List<MyAdvertDetails.JobListItem> f309117S0;

    /* renamed from: T, reason: collision with root package name */
    @l
    public final EvidenceData f309118T;

    /* renamed from: T0, reason: collision with root package name */
    @l
    public final MyAdvertDetails.SupportAutomation f309119T0;

    /* renamed from: U, reason: collision with root package name */
    @l
    public final String f309120U;

    /* renamed from: U0, reason: collision with root package name */
    @l
    public final MyAdvertDetails.CopyAdvertTooltip f309121U0;

    /* renamed from: V, reason: collision with root package name */
    @l
    public final MyAdvertDetails.ReservationInfo f309122V;

    /* renamed from: V0, reason: collision with root package name */
    @l
    public final MyAdvertDetails.BannerFromSxBanners f309123V0;

    /* renamed from: W, reason: collision with root package name */
    public final boolean f309124W;

    /* renamed from: X, reason: collision with root package name */
    public final boolean f309125X;

    /* renamed from: Y, reason: collision with root package name */
    @l
    public final AdvertSellerShortTermRent f309126Y;

    /* renamed from: Z, reason: collision with root package name */
    @l
    public final AppliedServicesInfo f309127Z;

    /* renamed from: a0, reason: collision with root package name */
    @l
    public final Verification f309128a0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309129b;

    /* renamed from: b0, reason: collision with root package name */
    @l
    public final MyAdvertDetails.RealtyOwnerVerification f309130b0;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f309131c;

    /* renamed from: c0, reason: collision with root package name */
    @l
    public final MyAdvertDetails.ReliableOwner f309132c0;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f309133d;

    /* renamed from: d0, reason: collision with root package name */
    @l
    public final List<PromoBlockData> f309134d0;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f309135e;

    /* renamed from: e0, reason: collision with root package name */
    @l
    public final InstallmentsPromoBlockData f309136e0;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f309137f;

    /* renamed from: f0, reason: collision with root package name */
    @l
    public final MyAdvertSafeDeal f309138f0;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f309139g;

    /* renamed from: g0, reason: collision with root package name */
    @l
    public final AdvertDetailsFeaturesTeasers f309140g0;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f309141h;

    /* renamed from: h0, reason: collision with root package name */
    @l
    public final List<ApartmentFeature> f309142h0;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f309143i;

    /* renamed from: i0, reason: collision with root package name */
    @l
    public final MyAdvertDetails.AutoPublishSwitcher f309144i0;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f309145j;

    /* renamed from: j0, reason: collision with root package name */
    @l
    public final MyAdvertDetails.CreditInfoItem f309146j0;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final List<GeoReference> f309147k;

    /* renamed from: k0, reason: collision with root package name */
    @l
    public final MyAdvertDetails.SbStatusBlock f309148k0;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f309149l;

    /* renamed from: l0, reason: collision with root package name */
    @l
    public final MyAdvertDetails.ServiceBookingReminderBlock f309150l0;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final String f309151m;

    /* renamed from: m0, reason: collision with root package name */
    @l
    public final CarMarketPrice f309152m0;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final Long f309153n;

    /* renamed from: n0, reason: collision with root package name */
    @l
    public final Boolean f309154n0;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final String f309155o;

    /* renamed from: o0, reason: collision with root package name */
    @l
    public final MyAdvertDetails.SalesContract f309156o0;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final String f309157p;

    /* renamed from: p0, reason: collision with root package name */
    @l
    public final CheckInRules f309158p0;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final Coordinates f309159q;

    /* renamed from: q0, reason: collision with root package name */
    @l
    public final AdditionalSeller f309160q0;

    /* renamed from: r, reason: collision with root package name */
    @l
    public final AdvertSharing f309161r;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public final List<BeduinModel> f309162r0;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final List<Action> f309163s;

    /* renamed from: s0, reason: collision with root package name */
    @l
    public final AdvertBadgeBar f309164s0;

    /* renamed from: t, reason: collision with root package name */
    @l
    public final CharSequence f309165t;

    /* renamed from: t0, reason: collision with root package name */
    @l
    public final ItemPromotion f309166t0;

    /* renamed from: u, reason: collision with root package name */
    @l
    public final AnonymousNumber f309167u;

    /* renamed from: u0, reason: collision with root package name */
    @l
    public final MyAdvertDetails.BuyoutPhone f309168u0;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f309169v;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public final List<BeduinAction> f309170v0;

    /* renamed from: w, reason: collision with root package name */
    @k
    public final String f309171w;

    /* renamed from: w0, reason: collision with root package name */
    @l
    public final BodyCondition f309172w0;

    /* renamed from: x, reason: collision with root package name */
    @l
    public final MyAdvertDetails.Seller f309173x;

    /* renamed from: x0, reason: collision with root package name */
    @l
    public final MyAdvertDetails.ItemReviews f309174x0;

    /* renamed from: y, reason: collision with root package name */
    @l
    public final String f309175y;

    /* renamed from: y0, reason: collision with root package name */
    @l
    public final MyAdvertAutoSelect f309176y0;

    /* renamed from: z, reason: collision with root package name */
    @l
    public final Boolean f309177z;

    /* renamed from: z0, reason: collision with root package name */
    @l
    public final PremierPartner f309178z0;

    /* compiled from: MyAdvertDetailsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MyAdvertDetailsItem> {
        @Override // android.os.Parcelable.Creator
        public final MyAdvertDetailsItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Boolean boolValueOf2;
            ArrayList arrayList6;
            ArrayList arrayList7;
            ArrayList arrayList8;
            ArrayList arrayList9;
            ArrayList arrayList10;
            ArrayList arrayList11;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList12 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(MyAdvertDetailsItem.class, parcel, arrayList12, iL2, 1);
                }
                arrayList = arrayList12;
            }
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            Coordinates coordinates = (Coordinates) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            AdvertSharing advertSharing = (AdvertSharing) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            int i13 = parcel.readInt();
            ArrayList arrayList13 = new ArrayList(i13);
            int iL3 = 0;
            while (iL3 != i13) {
                iL3 = com.avito.android.actions_sheet.a.l(MyAdvertDetailsItem.class, parcel, arrayList13, iL3, 1);
                i13 = i13;
            }
            CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            AnonymousNumber anonymousNumber = (AnonymousNumber) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            boolean z12 = parcel.readInt() != 0;
            String string14 = parcel.readString();
            MyAdvertDetails.Seller seller = (MyAdvertDetails.Seller) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            String string15 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            MyAdvertVas myAdvertVas = (MyAdvertVas) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            MyAdvertDetails.ActivationInfo activationInfo = (MyAdvertDetails.ActivationInfo) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            MyAdvertDetails.Shop shop = (MyAdvertDetails.Shop) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            MyAdvertDetails.VasBundlesBanner vasBundlesBanner = (MyAdvertDetails.VasBundlesBanner) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            MyAdvertDetails.AlertBanner alertBanner = (MyAdvertDetails.AlertBanner) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            AuctionBanner auctionBanner = (AuctionBanner) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            AdvertParameters advertParameters = (AdvertParameters) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            int i14 = parcel.readInt();
            ArrayList arrayList14 = new ArrayList(i14);
            int iL4 = 0;
            while (iL4 != i14) {
                iL4 = com.avito.android.actions_sheet.a.l(MyAdvertDetailsItem.class, parcel, arrayList14, iL4, 1);
                i14 = i14;
            }
            Video video = (Video) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            NativeVideo nativeVideo = (NativeVideo) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            String string16 = parcel.readString();
            MyAdvertDetails.Price price = (MyAdvertDetails.Price) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            Sales sales = (Sales) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            StockManagement stockManagement = (StockManagement) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            AdvertStats advertStatsCreateFromParcel = parcel.readInt() == 0 ? null : AdvertStats.CREATOR.createFromParcel(parcel);
            BeduinV2 beduinV2 = (BeduinV2) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            String string17 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList14;
                arrayList3 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList15 = new ArrayList(i15);
                arrayList2 = arrayList14;
                int iL5 = 0;
                while (iL5 != i15) {
                    iL5 = com.avito.android.actions_sheet.a.l(MyAdvertDetailsItem.class, parcel, arrayList15, iL5, 1);
                    i15 = i15;
                }
                arrayList3 = arrayList15;
            }
            RejectReason rejectReason = (RejectReason) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            EvidenceData evidenceData = (EvidenceData) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            String string18 = parcel.readString();
            MyAdvertDetails.ReservationInfo reservationInfo = (MyAdvertDetails.ReservationInfo) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            AdvertSellerShortTermRent advertSellerShortTermRent = (AdvertSellerShortTermRent) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            AppliedServicesInfo appliedServicesInfo = (AppliedServicesInfo) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            Verification verification = (Verification) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            MyAdvertDetails.RealtyOwnerVerification realtyOwnerVerification = (MyAdvertDetails.RealtyOwnerVerification) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            MyAdvertDetails.ReliableOwner reliableOwner = (MyAdvertDetails.ReliableOwner) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i16 = parcel.readInt();
                ArrayList arrayList16 = new ArrayList(i16);
                int iL6 = 0;
                while (iL6 != i16) {
                    iL6 = com.avito.android.actions_sheet.a.l(MyAdvertDetailsItem.class, parcel, arrayList16, iL6, 1);
                    i16 = i16;
                }
                arrayList4 = arrayList16;
            }
            InstallmentsPromoBlockData installmentsPromoBlockData = (InstallmentsPromoBlockData) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            MyAdvertSafeDeal myAdvertSafeDeal = (MyAdvertSafeDeal) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            AdvertDetailsFeaturesTeasers advertDetailsFeaturesTeasers = (AdvertDetailsFeaturesTeasers) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int i17 = parcel.readInt();
                ArrayList arrayList17 = new ArrayList(i17);
                int iL7 = 0;
                while (iL7 != i17) {
                    iL7 = com.avito.android.actions_sheet.a.l(MyAdvertDetailsItem.class, parcel, arrayList17, iL7, 1);
                    i17 = i17;
                }
                arrayList5 = arrayList17;
            }
            MyAdvertDetails.AutoPublishSwitcher autoPublishSwitcher = (MyAdvertDetails.AutoPublishSwitcher) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            MyAdvertDetails.CreditInfoItem creditInfoItem = (MyAdvertDetails.CreditInfoItem) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            MyAdvertDetails.SbStatusBlock sbStatusBlock = (MyAdvertDetails.SbStatusBlock) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            MyAdvertDetails.ServiceBookingReminderBlock serviceBookingReminderBlock = (MyAdvertDetails.ServiceBookingReminderBlock) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            CarMarketPrice carMarketPrice = (CarMarketPrice) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            MyAdvertDetails.SalesContract salesContract = (MyAdvertDetails.SalesContract) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            CheckInRules checkInRules = (CheckInRules) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            AdditionalSeller additionalSeller = (AdditionalSeller) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int i18 = parcel.readInt();
                ArrayList arrayList18 = new ArrayList(i18);
                int iL8 = 0;
                while (iL8 != i18) {
                    iL8 = com.avito.android.actions_sheet.a.l(MyAdvertDetailsItem.class, parcel, arrayList18, iL8, 1);
                    i18 = i18;
                }
                arrayList6 = arrayList18;
            }
            AdvertBadgeBar advertBadgeBar = (AdvertBadgeBar) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            ItemPromotion itemPromotion = (ItemPromotion) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            MyAdvertDetails.BuyoutPhone buyoutPhone = (MyAdvertDetails.BuyoutPhone) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList7 = null;
            } else {
                int i19 = parcel.readInt();
                ArrayList arrayList19 = new ArrayList(i19);
                int iL9 = 0;
                while (iL9 != i19) {
                    iL9 = com.avito.android.actions_sheet.a.l(MyAdvertDetailsItem.class, parcel, arrayList19, iL9, 1);
                    i19 = i19;
                }
                arrayList7 = arrayList19;
            }
            BodyCondition bodyCondition = (BodyCondition) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            MyAdvertDetails.ItemReviews itemReviews = (MyAdvertDetails.ItemReviews) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            MyAdvertAutoSelect myAdvertAutoSelect = (MyAdvertAutoSelect) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            PremierPartner premierPartner = (PremierPartner) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList8 = null;
            } else {
                int i22 = parcel.readInt();
                ArrayList arrayList20 = new ArrayList(i22);
                int iL10 = 0;
                while (iL10 != i22) {
                    iL10 = com.avito.android.actions_sheet.a.l(MyAdvertDetailsItem.class, parcel, arrayList20, iL10, 1);
                    i22 = i22;
                }
                arrayList8 = arrayList20;
            }
            if (parcel.readInt() == 0) {
                arrayList9 = null;
            } else {
                int i23 = parcel.readInt();
                ArrayList arrayList21 = new ArrayList(i23);
                int iL11 = 0;
                while (iL11 != i23) {
                    iL11 = com.avito.android.actions_sheet.a.l(MyAdvertDetailsItem.class, parcel, arrayList21, iL11, 1);
                    i23 = i23;
                }
                arrayList9 = arrayList21;
            }
            MyAdvertDetails.FillParametersBanner fillParametersBanner = (MyAdvertDetails.FillParametersBanner) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            DomotekaReportTeaser domotekaReportTeaser = (DomotekaReportTeaser) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            MultiUrgencyBlockResponse multiUrgencyBlockResponse = (MultiUrgencyBlockResponse) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            DeepLink deepLink = (DeepLink) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            MyAdvertDetails.MultiAddresses multiAddresses = (MyAdvertDetails.MultiAddresses) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList10 = null;
            } else {
                int i24 = parcel.readInt();
                ArrayList arrayList22 = new ArrayList(i24);
                int iL12 = 0;
                while (iL12 != i24) {
                    iL12 = com.avito.android.actions_sheet.a.l(MyAdvertDetailsItem.class, parcel, arrayList22, iL12, 1);
                    i24 = i24;
                }
                arrayList10 = arrayList22;
            }
            MyAdvertDetails.MachineryRentalBanner machineryRentalBanner = (MyAdvertDetails.MachineryRentalBanner) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            MyAdvertDetails.DeliverySettings deliverySettings = (MyAdvertDetails.DeliverySettings) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            MyAdvertDetails.PromoActivities promoActivities = (MyAdvertDetails.PromoActivities) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            MyAdvertDetails.EntryPointToAccountOwnerBanner entryPointToAccountOwnerBanner = (MyAdvertDetails.EntryPointToAccountOwnerBanner) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            AddedByAvitoParams addedByAvitoParams = (AddedByAvitoParams) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            DeepLink deepLink2 = (DeepLink) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            ServicesSellerSubscriptionBanner servicesSellerSubscriptionBanner = (ServicesSellerSubscriptionBanner) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            MyAdvertDetails.ContactsBbl contactsBbl = (MyAdvertDetails.ContactsBbl) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            MyAdvertDetails.Portfolio portfolio = (MyAdvertDetails.Portfolio) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            MyAdvertDetails.CompetitorAnalyticsInfo competitorAnalyticsInfo = (MyAdvertDetails.CompetitorAnalyticsInfo) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList11 = null;
            } else {
                int i25 = parcel.readInt();
                ArrayList arrayList23 = new ArrayList(i25);
                int iL13 = 0;
                while (iL13 != i25) {
                    iL13 = com.avito.android.actions_sheet.a.l(MyAdvertDetailsItem.class, parcel, arrayList23, iL13, 1);
                    i25 = i25;
                }
                arrayList11 = arrayList23;
            }
            return new MyAdvertDetailsItem(string, string2, string3, string4, string5, string6, string7, string8, string9, arrayList, string10, string11, lValueOf, string12, string13, coordinates, advertSharing, arrayList13, charSequence, anonymousNumber, z12, string14, seller, string15, boolValueOf, myAdvertVas, activationInfo, shop, vasBundlesBanner, alertBanner, auctionBanner, advertParameters, arrayList2, video, nativeVideo, string16, price, sales, stockManagement, advertStatsCreateFromParcel, beduinV2, string17, arrayList3, rejectReason, evidenceData, string18, reservationInfo, z13, z14, advertSellerShortTermRent, appliedServicesInfo, verification, realtyOwnerVerification, reliableOwner, arrayList4, installmentsPromoBlockData, myAdvertSafeDeal, advertDetailsFeaturesTeasers, arrayList5, autoPublishSwitcher, creditInfoItem, sbStatusBlock, serviceBookingReminderBlock, carMarketPrice, boolValueOf2, salesContract, checkInRules, additionalSeller, arrayList6, advertBadgeBar, itemPromotion, buyoutPhone, arrayList7, bodyCondition, itemReviews, myAdvertAutoSelect, premierPartner, arrayList8, arrayList9, fillParametersBanner, domotekaReportTeaser, multiUrgencyBlockResponse, deepLink, multiAddresses, arrayList10, machineryRentalBanner, deliverySettings, promoActivities, entryPointToAccountOwnerBanner, addedByAvitoParams, deepLink2, servicesSellerSubscriptionBanner, contactsBbl, portfolio, competitorAnalyticsInfo, arrayList11, (MyAdvertDetails.SupportAutomation) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader()), (MyAdvertDetails.CopyAdvertTooltip) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader()), (MyAdvertDetails.BannerFromSxBanners) parcel.readParcelable(MyAdvertDetailsItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MyAdvertDetailsItem[] newArray(int i12) {
            return new MyAdvertDetailsItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MyAdvertDetailsItem(@k String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l String str8, @l String str9, @l List<GeoReference> list, @k String str10, @k String str11, @l Long l12, @l String str12, @l String str13, @l Coordinates coordinates, @l AdvertSharing advertSharing, @k List<Action> list2, @l CharSequence charSequence, @l AnonymousNumber anonymousNumber, boolean z12, @k String str14, @l MyAdvertDetails.Seller seller, @l String str15, @l Boolean bool, @l MyAdvertVas myAdvertVas, @l MyAdvertDetails.ActivationInfo activationInfo, @l MyAdvertDetails.Shop shop, @l MyAdvertDetails.VasBundlesBanner vasBundlesBanner, @l MyAdvertDetails.AlertBanner alertBanner, @l AuctionBanner auctionBanner, @l AdvertParameters advertParameters, @k List<Image> list3, @l Video video, @l NativeVideo nativeVideo, @k String str16, @l MyAdvertDetails.Price price, @l Sales sales, @l StockManagement stockManagement, @l AdvertStats advertStats, @l BeduinV2 beduinV2, @l String str17, @l List<RejectReason> list4, @l RejectReason rejectReason, @l EvidenceData evidenceData, @l String str18, @l MyAdvertDetails.ReservationInfo reservationInfo, boolean z13, boolean z14, @l AdvertSellerShortTermRent advertSellerShortTermRent, @l AppliedServicesInfo appliedServicesInfo, @l Verification verification, @l MyAdvertDetails.RealtyOwnerVerification realtyOwnerVerification, @l MyAdvertDetails.ReliableOwner reliableOwner, @l List<PromoBlockData> list5, @l InstallmentsPromoBlockData installmentsPromoBlockData, @l MyAdvertSafeDeal myAdvertSafeDeal, @l AdvertDetailsFeaturesTeasers advertDetailsFeaturesTeasers, @l List<ApartmentFeature> list6, @l MyAdvertDetails.AutoPublishSwitcher autoPublishSwitcher, @l MyAdvertDetails.CreditInfoItem creditInfoItem, @l MyAdvertDetails.SbStatusBlock sbStatusBlock, @l MyAdvertDetails.ServiceBookingReminderBlock serviceBookingReminderBlock, @l CarMarketPrice carMarketPrice, @l Boolean bool2, @l MyAdvertDetails.SalesContract salesContract, @l CheckInRules checkInRules, @l AdditionalSeller additionalSeller, @l List<? extends BeduinModel> list7, @l AdvertBadgeBar advertBadgeBar, @l ItemPromotion itemPromotion, @l MyAdvertDetails.BuyoutPhone buyoutPhone, @l List<? extends BeduinAction> list8, @l BodyCondition bodyCondition, @l MyAdvertDetails.ItemReviews itemReviews, @l MyAdvertAutoSelect myAdvertAutoSelect, @l PremierPartner premierPartner, @l List<UxFeedbackConfigOld> list9, @l List<? extends DeepLink> list10, @l MyAdvertDetails.FillParametersBanner fillParametersBanner, @l DomotekaReportTeaser domotekaReportTeaser, @l MultiUrgencyBlockResponse multiUrgencyBlockResponse, @l DeepLink deepLink, @l MyAdvertDetails.MultiAddresses multiAddresses, @l List<? extends MultiItemParam> list11, @l MyAdvertDetails.MachineryRentalBanner machineryRentalBanner, @l MyAdvertDetails.DeliverySettings deliverySettings, @l MyAdvertDetails.PromoActivities promoActivities, @l MyAdvertDetails.EntryPointToAccountOwnerBanner entryPointToAccountOwnerBanner, @l AddedByAvitoParams addedByAvitoParams, @l DeepLink deepLink2, @l ServicesSellerSubscriptionBanner servicesSellerSubscriptionBanner, @l MyAdvertDetails.ContactsBbl contactsBbl, @l MyAdvertDetails.Portfolio portfolio, @l MyAdvertDetails.CompetitorAnalyticsInfo competitorAnalyticsInfo, @l List<MyAdvertDetails.JobListItem> list12, @l MyAdvertDetails.SupportAutomation supportAutomation, @l MyAdvertDetails.CopyAdvertTooltip copyAdvertTooltip, @l MyAdvertDetails.BannerFromSxBanners bannerFromSxBanners) {
        this.f309129b = str;
        this.f309131c = str2;
        this.f309133d = str3;
        this.f309135e = str4;
        this.f309137f = str5;
        this.f309139g = str6;
        this.f309141h = str7;
        this.f309143i = str8;
        this.f309145j = str9;
        this.f309147k = list;
        this.f309149l = str10;
        this.f309151m = str11;
        this.f309153n = l12;
        this.f309155o = str12;
        this.f309157p = str13;
        this.f309159q = coordinates;
        this.f309161r = advertSharing;
        this.f309163s = list2;
        this.f309165t = charSequence;
        this.f309167u = anonymousNumber;
        this.f309169v = z12;
        this.f309171w = str14;
        this.f309173x = seller;
        this.f309175y = str15;
        this.f309177z = bool;
        this.f309080A = myAdvertVas;
        this.f309082B = activationInfo;
        this.f309084C = shop;
        this.f309086D = vasBundlesBanner;
        this.f309088E = alertBanner;
        this.f309090F = auctionBanner;
        this.f309092G = advertParameters;
        this.f309094H = list3;
        this.f309096I = video;
        this.f309098J = nativeVideo;
        this.f309100K = str16;
        this.f309102L = price;
        this.f309104M = sales;
        this.f309106N = stockManagement;
        this.f309108O = advertStats;
        this.f309110P = beduinV2;
        this.f309112Q = str17;
        this.f309114R = list4;
        this.f309116S = rejectReason;
        this.f309118T = evidenceData;
        this.f309120U = str18;
        this.f309122V = reservationInfo;
        this.f309124W = z13;
        this.f309125X = z14;
        this.f309126Y = advertSellerShortTermRent;
        this.f309127Z = appliedServicesInfo;
        this.f309128a0 = verification;
        this.f309130b0 = realtyOwnerVerification;
        this.f309132c0 = reliableOwner;
        this.f309134d0 = list5;
        this.f309136e0 = installmentsPromoBlockData;
        this.f309138f0 = myAdvertSafeDeal;
        this.f309140g0 = advertDetailsFeaturesTeasers;
        this.f309142h0 = list6;
        this.f309144i0 = autoPublishSwitcher;
        this.f309146j0 = creditInfoItem;
        this.f309148k0 = sbStatusBlock;
        this.f309150l0 = serviceBookingReminderBlock;
        this.f309152m0 = carMarketPrice;
        this.f309154n0 = bool2;
        this.f309156o0 = salesContract;
        this.f309158p0 = checkInRules;
        this.f309160q0 = additionalSeller;
        this.f309162r0 = list7;
        this.f309164s0 = advertBadgeBar;
        this.f309166t0 = itemPromotion;
        this.f309168u0 = buyoutPhone;
        this.f309170v0 = list8;
        this.f309172w0 = bodyCondition;
        this.f309174x0 = itemReviews;
        this.f309176y0 = myAdvertAutoSelect;
        this.f309178z0 = premierPartner;
        this.f309081A0 = list9;
        this.f309083B0 = list10;
        this.f309085C0 = fillParametersBanner;
        this.f309087D0 = domotekaReportTeaser;
        this.f309089E0 = multiUrgencyBlockResponse;
        this.f309091F0 = deepLink;
        this.f309093G0 = multiAddresses;
        this.f309095H0 = list11;
        this.f309097I0 = machineryRentalBanner;
        this.f309099J0 = deliverySettings;
        this.f309101K0 = promoActivities;
        this.f309103L0 = entryPointToAccountOwnerBanner;
        this.f309105M0 = addedByAvitoParams;
        this.f309107N0 = deepLink2;
        this.f309109O0 = servicesSellerSubscriptionBanner;
        this.f309111P0 = contactsBbl;
        this.f309113Q0 = portfolio;
        this.f309115R0 = competitorAnalyticsInfo;
        this.f309117S0 = list12;
        this.f309119T0 = supportAutomation;
        this.f309121U0 = copyAdvertTooltip;
        this.f309123V0 = bannerFromSxBanners;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f309129b);
        parcel.writeString(this.f309131c);
        parcel.writeString(this.f309133d);
        parcel.writeString(this.f309135e);
        parcel.writeString(this.f309137f);
        parcel.writeString(this.f309139g);
        parcel.writeString(this.f309141h);
        parcel.writeString(this.f309143i);
        parcel.writeString(this.f309145j);
        List<GeoReference> list = this.f309147k;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeString(this.f309149l);
        parcel.writeString(this.f309151m);
        Long l12 = this.f309153n;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.f309155o);
        parcel.writeString(this.f309157p);
        parcel.writeParcelable(this.f309159q, i12);
        parcel.writeParcelable(this.f309161r, i12);
        Iterator itJ = C0.j(this.f309163s, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        TextUtils.writeToParcel(this.f309165t, parcel, i12);
        parcel.writeParcelable(this.f309167u, i12);
        parcel.writeInt(this.f309169v ? 1 : 0);
        parcel.writeString(this.f309171w);
        parcel.writeParcelable(this.f309173x, i12);
        parcel.writeString(this.f309175y);
        Boolean bool = this.f309177z;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.f309080A, i12);
        parcel.writeParcelable(this.f309082B, i12);
        parcel.writeParcelable(this.f309084C, i12);
        parcel.writeParcelable(this.f309086D, i12);
        parcel.writeParcelable(this.f309088E, i12);
        parcel.writeParcelable(this.f309090F, i12);
        parcel.writeParcelable(this.f309092G, i12);
        Iterator itJ2 = C0.j(this.f309094H, parcel);
        while (itJ2.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ2.next(), i12);
        }
        parcel.writeParcelable(this.f309096I, i12);
        parcel.writeParcelable(this.f309098J, i12);
        parcel.writeString(this.f309100K);
        parcel.writeParcelable(this.f309102L, i12);
        parcel.writeParcelable(this.f309104M, i12);
        parcel.writeParcelable(this.f309106N, i12);
        AdvertStats advertStats = this.f309108O;
        if (advertStats == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertStats.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f309110P, i12);
        parcel.writeString(this.f309112Q);
        List<RejectReason> list2 = this.f309114R;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        parcel.writeParcelable(this.f309116S, i12);
        parcel.writeParcelable(this.f309118T, i12);
        parcel.writeString(this.f309120U);
        parcel.writeParcelable(this.f309122V, i12);
        parcel.writeInt(this.f309124W ? 1 : 0);
        parcel.writeInt(this.f309125X ? 1 : 0);
        parcel.writeParcelable(this.f309126Y, i12);
        parcel.writeParcelable(this.f309127Z, i12);
        parcel.writeParcelable(this.f309128a0, i12);
        parcel.writeParcelable(this.f309130b0, i12);
        parcel.writeParcelable(this.f309132c0, i12);
        List<PromoBlockData> list3 = this.f309134d0;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), i12);
            }
        }
        parcel.writeParcelable(this.f309136e0, i12);
        parcel.writeParcelable(this.f309138f0, i12);
        parcel.writeParcelable(this.f309140g0, i12);
        List<ApartmentFeature> list4 = this.f309142h0;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA4 = com.avito.android.actions_sheet.a.A(list4, parcel, 1);
            while (itA4.hasNext()) {
                parcel.writeParcelable((Parcelable) itA4.next(), i12);
            }
        }
        parcel.writeParcelable(this.f309144i0, i12);
        parcel.writeParcelable(this.f309146j0, i12);
        parcel.writeParcelable(this.f309148k0, i12);
        parcel.writeParcelable(this.f309150l0, i12);
        parcel.writeParcelable(this.f309152m0, i12);
        Boolean bool2 = this.f309154n0;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeParcelable(this.f309156o0, i12);
        parcel.writeParcelable(this.f309158p0, i12);
        parcel.writeParcelable(this.f309160q0, i12);
        List<BeduinModel> list5 = this.f309162r0;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA5 = com.avito.android.actions_sheet.a.A(list5, parcel, 1);
            while (itA5.hasNext()) {
                parcel.writeParcelable((Parcelable) itA5.next(), i12);
            }
        }
        parcel.writeParcelable(this.f309164s0, i12);
        parcel.writeParcelable(this.f309166t0, i12);
        parcel.writeParcelable(this.f309168u0, i12);
        List<BeduinAction> list6 = this.f309170v0;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA6 = com.avito.android.actions_sheet.a.A(list6, parcel, 1);
            while (itA6.hasNext()) {
                parcel.writeParcelable((Parcelable) itA6.next(), i12);
            }
        }
        parcel.writeParcelable(this.f309172w0, i12);
        parcel.writeParcelable(this.f309174x0, i12);
        parcel.writeParcelable(this.f309176y0, i12);
        parcel.writeParcelable(this.f309178z0, i12);
        List<UxFeedbackConfigOld> list7 = this.f309081A0;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA7 = com.avito.android.actions_sheet.a.A(list7, parcel, 1);
            while (itA7.hasNext()) {
                parcel.writeParcelable((Parcelable) itA7.next(), i12);
            }
        }
        List<DeepLink> list8 = this.f309083B0;
        if (list8 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA8 = com.avito.android.actions_sheet.a.A(list8, parcel, 1);
            while (itA8.hasNext()) {
                parcel.writeParcelable((Parcelable) itA8.next(), i12);
            }
        }
        parcel.writeParcelable(this.f309085C0, i12);
        parcel.writeParcelable(this.f309087D0, i12);
        parcel.writeParcelable(this.f309089E0, i12);
        parcel.writeParcelable(this.f309091F0, i12);
        parcel.writeParcelable(this.f309093G0, i12);
        List<MultiItemParam> list9 = this.f309095H0;
        if (list9 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA9 = com.avito.android.actions_sheet.a.A(list9, parcel, 1);
            while (itA9.hasNext()) {
                parcel.writeParcelable((Parcelable) itA9.next(), i12);
            }
        }
        parcel.writeParcelable(this.f309097I0, i12);
        parcel.writeParcelable(this.f309099J0, i12);
        parcel.writeParcelable(this.f309101K0, i12);
        parcel.writeParcelable(this.f309103L0, i12);
        parcel.writeParcelable(this.f309105M0, i12);
        parcel.writeParcelable(this.f309107N0, i12);
        parcel.writeParcelable(this.f309109O0, i12);
        parcel.writeParcelable(this.f309111P0, i12);
        parcel.writeParcelable(this.f309113Q0, i12);
        parcel.writeParcelable(this.f309115R0, i12);
        List<MyAdvertDetails.JobListItem> list10 = this.f309117S0;
        if (list10 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA10 = com.avito.android.actions_sheet.a.A(list10, parcel, 1);
            while (itA10.hasNext()) {
                parcel.writeParcelable((Parcelable) itA10.next(), i12);
            }
        }
        parcel.writeParcelable(this.f309119T0, i12);
        parcel.writeParcelable(this.f309121U0, i12);
        parcel.writeParcelable(this.f309123V0, i12);
    }

    public /* synthetic */ MyAdvertDetailsItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, String str11, Long l12, String str12, String str13, Coordinates coordinates, AdvertSharing advertSharing, List list2, CharSequence charSequence, AnonymousNumber anonymousNumber, boolean z12, String str14, MyAdvertDetails.Seller seller, String str15, Boolean bool, MyAdvertVas myAdvertVas, MyAdvertDetails.ActivationInfo activationInfo, MyAdvertDetails.Shop shop, MyAdvertDetails.VasBundlesBanner vasBundlesBanner, MyAdvertDetails.AlertBanner alertBanner, AuctionBanner auctionBanner, AdvertParameters advertParameters, List list3, Video video, NativeVideo nativeVideo, String str16, MyAdvertDetails.Price price, Sales sales, StockManagement stockManagement, AdvertStats advertStats, BeduinV2 beduinV2, String str17, List list4, RejectReason rejectReason, EvidenceData evidenceData, String str18, MyAdvertDetails.ReservationInfo reservationInfo, boolean z13, boolean z14, AdvertSellerShortTermRent advertSellerShortTermRent, AppliedServicesInfo appliedServicesInfo, Verification verification, MyAdvertDetails.RealtyOwnerVerification realtyOwnerVerification, MyAdvertDetails.ReliableOwner reliableOwner, List list5, InstallmentsPromoBlockData installmentsPromoBlockData, MyAdvertSafeDeal myAdvertSafeDeal, AdvertDetailsFeaturesTeasers advertDetailsFeaturesTeasers, List list6, MyAdvertDetails.AutoPublishSwitcher autoPublishSwitcher, MyAdvertDetails.CreditInfoItem creditInfoItem, MyAdvertDetails.SbStatusBlock sbStatusBlock, MyAdvertDetails.ServiceBookingReminderBlock serviceBookingReminderBlock, CarMarketPrice carMarketPrice, Boolean bool2, MyAdvertDetails.SalesContract salesContract, CheckInRules checkInRules, AdditionalSeller additionalSeller, List list7, AdvertBadgeBar advertBadgeBar, ItemPromotion itemPromotion, MyAdvertDetails.BuyoutPhone buyoutPhone, List list8, BodyCondition bodyCondition, MyAdvertDetails.ItemReviews itemReviews, MyAdvertAutoSelect myAdvertAutoSelect, PremierPartner premierPartner, List list9, List list10, MyAdvertDetails.FillParametersBanner fillParametersBanner, DomotekaReportTeaser domotekaReportTeaser, MultiUrgencyBlockResponse multiUrgencyBlockResponse, DeepLink deepLink, MyAdvertDetails.MultiAddresses multiAddresses, List list11, MyAdvertDetails.MachineryRentalBanner machineryRentalBanner, MyAdvertDetails.DeliverySettings deliverySettings, MyAdvertDetails.PromoActivities promoActivities, MyAdvertDetails.EntryPointToAccountOwnerBanner entryPointToAccountOwnerBanner, AddedByAvitoParams addedByAvitoParams, DeepLink deepLink2, ServicesSellerSubscriptionBanner servicesSellerSubscriptionBanner, MyAdvertDetails.ContactsBbl contactsBbl, MyAdvertDetails.Portfolio portfolio, MyAdvertDetails.CompetitorAnalyticsInfo competitorAnalyticsInfo, List list12, MyAdvertDetails.SupportAutomation supportAutomation, MyAdvertDetails.CopyAdvertTooltip copyAdvertTooltip, MyAdvertDetails.BannerFromSxBanners bannerFromSxBanners, int i12, int i13, int i14, int i15, C42822w c42822w) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, list, str10, str11, l12, str12, str13, coordinates, advertSharing, list2, charSequence, anonymousNumber, z12, str14, seller, str15, bool, myAdvertVas, activationInfo, shop, vasBundlesBanner, alertBanner, auctionBanner, advertParameters, list3, video, nativeVideo, str16, price, sales, stockManagement, advertStats, beduinV2, str17, list4, rejectReason, evidenceData, str18, reservationInfo, z13, z14, advertSellerShortTermRent, appliedServicesInfo, verification, (i13 & 1048576) != 0 ? null : realtyOwnerVerification, (i13 & 2097152) != 0 ? null : reliableOwner, (i13 & 4194304) != 0 ? null : list5, (i13 & 8388608) != 0 ? null : installmentsPromoBlockData, myAdvertSafeDeal, (i13 & 33554432) != 0 ? null : advertDetailsFeaturesTeasers, (i13 & 67108864) != 0 ? null : list6, (i13 & 134217728) != 0 ? null : autoPublishSwitcher, (i13 & 268435456) != 0 ? null : creditInfoItem, (i13 & 536870912) != 0 ? null : sbStatusBlock, (i13 & 1073741824) != 0 ? null : serviceBookingReminderBlock, (i13 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : carMarketPrice, (i14 & 1) != 0 ? null : bool2, (i14 & 2) != 0 ? null : salesContract, (i14 & 4) != 0 ? null : checkInRules, (i14 & 8) != 0 ? null : additionalSeller, list7, (i14 & 32) != 0 ? null : advertBadgeBar, (i14 & 64) != 0 ? null : itemPromotion, buyoutPhone, (i14 & 256) != 0 ? null : list8, (i14 & 512) != 0 ? null : bodyCondition, (i14 & 1024) != 0 ? null : itemReviews, (i14 & 2048) != 0 ? null : myAdvertAutoSelect, (i14 & 4096) != 0 ? null : premierPartner, (i14 & 8192) != 0 ? null : list9, (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list10, (32768 & i14) != 0 ? null : fillParametersBanner, (65536 & i14) != 0 ? null : domotekaReportTeaser, (131072 & i14) != 0 ? null : multiUrgencyBlockResponse, (262144 & i14) != 0 ? null : deepLink, (524288 & i14) != 0 ? null : multiAddresses, (1048576 & i14) != 0 ? null : list11, (i14 & 2097152) != 0 ? null : machineryRentalBanner, (i14 & 4194304) != 0 ? null : deliverySettings, (i14 & 8388608) != 0 ? null : promoActivities, (16777216 & i14) != 0 ? null : entryPointToAccountOwnerBanner, (i14 & 33554432) != 0 ? null : addedByAvitoParams, (i14 & 67108864) != 0 ? null : deepLink2, (i14 & 134217728) != 0 ? null : servicesSellerSubscriptionBanner, (i14 & 268435456) != 0 ? null : contactsBbl, (i14 & 536870912) != 0 ? null : portfolio, (i14 & 1073741824) != 0 ? null : competitorAnalyticsInfo, (i14 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : list12, (i15 & 1) != 0 ? null : supportAutomation, (i15 & 2) != 0 ? null : copyAdvertTooltip, (i15 & 4) != 0 ? null : bannerFromSxBanners);
    }
}

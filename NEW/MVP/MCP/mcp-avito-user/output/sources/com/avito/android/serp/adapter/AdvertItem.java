package com.avito.android.serp.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C20199a;
import com.avito.android.async_phone.AsyncPhoneItem;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.AdvertComparison;
import com.avito.android.remote.model.AdvertItemActions;
import com.avito.android.remote.model.AdvertSellerInfo;
import com.avito.android.remote.model.AdvertTravelPriceVersion;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.remote.model.BuyWithDeliveryButton;
import com.avito.android.remote.model.ConstructorAdvertGalleryItemModel;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.FavoritesToast;
import com.avito.android.remote.model.GeoDistance;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.GigShiftInfo;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.KeyAttributes;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.RadiusInfo;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.TravelInstallments;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.buyer_bonuses.BuyerBonuses;
import com.avito.android.remote.model.hotel.HotelRating;
import com.avito.android.remote.model.price_list.PriceList;
import com.avito.android.remote.model.realtor_bonus.RealtorBonus;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import com.avito.android.remote.model.serp.SerpAdvertSpecification;
import com.avito.android.remote.model.snippet_type.SnippetType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.badge.PriceTypeBadge;
import com.avito.android.serp.adapter.serp_advert_card.ShownItemsAbTestGroup;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import com.avito.android.util.J3;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import okhttp3.internal.http2.Http2;
import ru.avito.component.serp.DeliveryTerms;
import ru.avito.component.serp.PhoneLoadingState;
import ru.avito.component.serp.rating_and_reviews.RatingAndReviews;
import shark.AndroidResourceIdNames;

/* compiled from: AdvertItem.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0001\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/serp/adapter/AdvertItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/L;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/serp/adapter/m1;", "LLa/h;", "Lcom/avito/android/async_phone/AsyncPhoneItem;", "Lcom/avito/android/serp/adapter/Z;", "Lcom/avito/android/serp/adapter/M;", "Lcom/avito/android/serp/adapter/vertical_main/featured/a;", "Lcom/avito/android/serp/adapter/InAppCallsAwareItem;", "b", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes3.dex */
public final /* data */ class AdvertItem implements Q, L, PersistableSerpItem, m1, La.h, AsyncPhoneItem, Z, M, com.avito.android.serp.adapter.vertical_main.featured.a, InAppCallsAwareItem {

    @X41.f
    @Y61.k
    public static final Parcelable.Creator<AdvertItem> CREATOR;

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public final DimmedImage f268368A;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.l
    public final BadgeSticker f268369A0;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public final String f268370B;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.l
    public final SnippetType f268371B0;

    /* renamed from: C, reason: collision with root package name */
    public final int f268372C;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.l
    public final BuyWithDeliveryButton f268373C0;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f268374D;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.l
    public final KeyAttributes f268375D0;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f268376E;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.l
    public final BuyerBonuses f268377E0;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f268378F;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.l
    public final String f268379F0;

    /* renamed from: G, reason: collision with root package name */
    public boolean f268380G;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.l
    public final HotelRating f268381G0;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f268382H;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.l
    public final GeoDistance f268383H0;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public final AdvertComparison f268384I;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.l
    public UniversalColor f268385I0;

    /* renamed from: J, reason: collision with root package name */
    @Y61.l
    public final Boolean f268386J;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.l
    public UniversalColor f268387J0;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public final String f268388K;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.l
    public UniversalColor f268389K0;

    /* renamed from: L, reason: collision with root package name */
    public final boolean f268390L;

    /* renamed from: L0, reason: collision with root package name */
    public final boolean f268391L0;

    /* renamed from: M, reason: collision with root package name */
    @Y61.l
    public final String f268392M;

    /* renamed from: M0, reason: collision with root package name */
    public final boolean f268393M0;

    /* renamed from: N, reason: collision with root package name */
    public boolean f268394N;

    /* renamed from: N0, reason: collision with root package name */
    @Y61.k
    public final String f268395N0;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final DeepLink f268396O;

    /* renamed from: O0, reason: collision with root package name */
    public final int f268397O0;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f268398P;

    /* renamed from: P0, reason: collision with root package name */
    @Y61.k
    public final String f268399P0;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f268400Q;

    /* renamed from: Q0, reason: collision with root package name */
    @Y61.l
    public final RatingAndReviews f268401Q0;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public final String f268402R;

    /* renamed from: R0, reason: collision with root package name */
    public final boolean f268403R0;

    /* renamed from: S, reason: collision with root package name */
    @Y61.l
    public final List<DimmedImage> f268404S;

    /* renamed from: S0, reason: collision with root package name */
    public final boolean f268405S0;

    /* renamed from: T, reason: collision with root package name */
    @Y61.l
    public final List<ConstructorAdvertGalleryItemModel> f268406T;

    /* renamed from: T0, reason: collision with root package name */
    @Y61.l
    public final AdvertItemRedesignGroup f268407T0;

    /* renamed from: U, reason: collision with root package name */
    @Y61.l
    public final AdvertActions f268408U;

    /* renamed from: U0, reason: collision with root package name */
    public final boolean f268409U0;

    /* renamed from: V, reason: collision with root package name */
    @Y61.l
    public final Action f268410V;

    /* renamed from: V0, reason: collision with root package name */
    public final boolean f268411V0;

    /* renamed from: W, reason: collision with root package name */
    @Y61.l
    public final String f268412W;

    /* renamed from: W0, reason: collision with root package name */
    @Y61.l
    public final TravelInstallments f268413W0;

    /* renamed from: X, reason: collision with root package name */
    @Y61.l
    public final PriceTypeBadge f268414X;

    /* renamed from: X0, reason: collision with root package name */
    @Y61.l
    public final AdvertTravelPriceVersion f268415X0;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.l
    public final SerpBadgeBar f268416Y;

    /* renamed from: Y0, reason: collision with root package name */
    public boolean f268417Y0;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.l
    public final AdvertItemActions f268418Z;

    /* renamed from: Z0, reason: collision with root package name */
    @Y61.k
    public PhoneLoadingState f268419Z0;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.l
    public final String f268420a0;

    /* renamed from: a1, reason: collision with root package name */
    @Y61.l
    public Object f268421a1;

    /* renamed from: b, reason: collision with root package name */
    public final long f268422b;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.l
    public final Integer f268423b0;

    /* renamed from: b1, reason: collision with root package name */
    public final boolean f268424b1;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f268425c;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.l
    public final List<GeoReference> f268426c0;

    /* renamed from: c1, reason: collision with root package name */
    public final boolean f268427c1;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f268428d;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.l
    public final QuorumFilterInfo f268429d0;

    /* renamed from: d1, reason: collision with root package name */
    @Y61.l
    public final Boolean f268430d1;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f268431e;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.l
    public final RadiusInfo f268432e0;

    /* renamed from: e1, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f268433e1;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f268434f;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.l
    public final AdvertSellerInfo f268435f0;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f268436g;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.l
    public final GigShiftInfo f268437g0;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final UniversalColor f268438h;

    /* renamed from: h0, reason: collision with root package name */
    public final boolean f268439h0;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f268440i;

    /* renamed from: i0, reason: collision with root package name */
    public final boolean f268441i0;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f268442j;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.l
    public final String f268443j0;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f268444k;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.l
    public final List<String> f268445k0;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f268446l;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.l
    public final String f268447l0;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f268448m;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.l
    public final String f268449m0;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final DiscountIcon f268450n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f268451n0;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final PriceList f268452o;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.l
    public final Integer f268453o0;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final String f268454p;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.l
    public final String f268455p0;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f268456q;

    /* renamed from: q0, reason: collision with root package name */
    public final boolean f268457q0;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final DeliveryTerms f268458r;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.l
    public final AdvertisementVerticalAlias f268459r0;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final String f268460s;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.l
    public final FavoritesToast f268461s0;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final String f268462t;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final ShownItemsAbTestGroup f268463t0;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final String f268464u;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.l
    public final SerpAdvertSpecification f268465u0;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final String f268466v;

    /* renamed from: v0, reason: collision with root package name */
    public final boolean f268467v0;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final String f268468w;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.l
    public final AttributedText f268469w0;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final String f268470x;

    /* renamed from: x0, reason: collision with root package name */
    public final boolean f268471x0;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public final String f268472y;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.l
    public final RealtorBonus f268473y0;

    /* renamed from: z, reason: collision with root package name */
    public final long f268474z;

    /* renamed from: z0, reason: collision with root package name */
    public final boolean f268475z0;

    /* compiled from: AdvertItem.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/serp/adapter/AdvertItem;", "Landroid/os/Parcel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Parcel, AdvertItem> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f268476l = new a();

        /* compiled from: AdvertItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.serp.adapter.AdvertItem$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C8030a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a<AdvertTravelPriceVersion> f268477a = kotlin.enums.c.a(AdvertTravelPriceVersion.values());
        }

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final AdvertItem invoke(Parcel parcel) {
            String str;
            String str2;
            String str3;
            String str4;
            C20199a c20199a;
            Parcel parcel2 = parcel;
            long j12 = parcel2.readLong();
            String string = parcel2.readString();
            String string2 = parcel2.readString();
            String string3 = parcel2.readString();
            String string4 = parcel2.readString();
            boolean zC2 = J3.c(parcel2);
            UniversalColor universalColor = (UniversalColor) parcel2.readParcelable(UniversalColor.class.getClassLoader());
            String string5 = parcel2.readString();
            String string6 = parcel2.readString();
            String string7 = parcel2.readString();
            String string8 = parcel2.readString();
            String string9 = parcel2.readString();
            DiscountIcon discountIcon = (DiscountIcon) parcel2.readParcelable(DiscountIcon.class.getClassLoader());
            PriceList priceList = (PriceList) parcel2.readParcelable(PriceList.class.getClassLoader());
            String string10 = parcel2.readString();
            boolean zC3 = J3.c(parcel2);
            DeliveryTerms deliveryTerms = (DeliveryTerms) parcel2.readParcelable(DeliveryTerms.class.getClassLoader());
            String string11 = parcel2.readString();
            String string12 = parcel2.readString();
            String string13 = parcel2.readString();
            String string14 = parcel2.readString();
            long j13 = parcel2.readLong();
            String string15 = parcel2.readString();
            String string16 = parcel2.readString();
            DimmedImage dimmedImage = (DimmedImage) parcel2.readParcelable(DimmedImage.class.getClassLoader());
            String string17 = parcel2.readString();
            int i12 = parcel2.readInt();
            SerpViewType serpViewType = SerpViewType.values()[parcel2.readInt()];
            boolean zC4 = J3.c(parcel2);
            SerpDisplayType serpDisplayType = SerpDisplayType.values()[parcel2.readInt()];
            boolean zC5 = J3.c(parcel2);
            boolean zC6 = J3.c(parcel2);
            String string18 = parcel2.readString();
            boolean zC7 = J3.c(parcel2);
            String string19 = parcel2.readString();
            boolean zC8 = J3.c(parcel2);
            DeepLink deepLink = (DeepLink) parcel2.readParcelable(DeepLink.class.getClassLoader());
            int i13 = parcel2.readInt();
            if (i13 < 0) {
                str2 = string6;
                str3 = string7;
                str4 = string8;
                str = string9;
                c20199a = null;
            } else {
                str = string9;
                C20199a c20199a2 = new C20199a(i13);
                while (i13 > 0) {
                    String str5 = string8;
                    Object value = parcel2.readValue(String.class.getClassLoader());
                    String str6 = string7;
                    if (value == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    String str7 = (String) value;
                    String str8 = string6;
                    Object value2 = parcel2.readValue(String.class.getClassLoader());
                    if (value2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    c20199a2.put(str7, (String) value2);
                    i13--;
                    string8 = str5;
                    string7 = str6;
                    string6 = str8;
                }
                str2 = string6;
                str3 = string7;
                str4 = string8;
                c20199a = c20199a2;
            }
            String string20 = parcel2.readString();
            List listA = J3.a(parcel2, DimmedImage.class.getClassLoader());
            List listA2 = J3.a(parcel2, ConstructorAdvertGalleryItemModel.class.getClassLoader());
            AdvertActions advertActions = (AdvertActions) parcel2.readParcelable(AdvertActions.class.getClassLoader());
            Action action = (Action) parcel2.readParcelable(Action.class.getClassLoader());
            String string21 = parcel2.readString();
            PriceTypeBadge priceTypeBadge = (PriceTypeBadge) parcel2.readParcelable(PriceTypeBadge.class.getClassLoader());
            SerpBadgeBar serpBadgeBar = (SerpBadgeBar) parcel2.readParcelable(SerpBadgeBar.class.getClassLoader());
            AdvertItemActions advertItemActions = (AdvertItemActions) parcel2.readParcelable(AdvertItemActions.class.getClassLoader());
            String string22 = parcel2.readString();
            List listA3 = J3.a(parcel2, GeoReference.class.getClassLoader());
            QuorumFilterInfo quorumFilterInfo = (QuorumFilterInfo) parcel2.readParcelable(QuorumFilterInfo.class.getClassLoader());
            RadiusInfo radiusInfo = (RadiusInfo) parcel2.readParcelable(RadiusInfo.class.getClassLoader());
            AdvertSellerInfo advertSellerInfo = (AdvertSellerInfo) parcel2.readParcelable(AdvertSellerInfo.class.getClassLoader());
            GigShiftInfo gigShiftInfo = (GigShiftInfo) parcel2.readParcelable(GigShiftInfo.class.getClassLoader());
            boolean zC9 = J3.c(parcel2);
            String string23 = parcel2.readString();
            String string24 = parcel2.readString();
            String string25 = parcel2.readString();
            boolean zC10 = J3.c(parcel2);
            Object value3 = parcel2.readValue(Integer.class.getClassLoader());
            if (!(value3 instanceof Integer)) {
                value3 = null;
            }
            Integer num = (Integer) value3;
            String string26 = parcel2.readString();
            boolean zC11 = J3.c(parcel2);
            AdvertisementVerticalAlias[] advertisementVerticalAliasArrValues = AdvertisementVerticalAlias.values();
            int i14 = parcel2.readInt();
            AdvertisementVerticalAlias advertisementVerticalAlias = i14 == -1 ? null : advertisementVerticalAliasArrValues[i14];
            ShownItemsAbTestGroup shownItemsAbTestGroup = ShownItemsAbTestGroup.values()[parcel2.readInt()];
            SerpAdvertSpecification serpAdvertSpecification = (SerpAdvertSpecification) parcel2.readParcelable(SerpAdvertSpecification.class.getClassLoader());
            RealtorBonus realtorBonus = (RealtorBonus) parcel2.readParcelable(RealtorBonus.class.getClassLoader());
            boolean zC12 = J3.c(parcel2);
            boolean zC13 = J3.c(parcel2);
            boolean zC14 = J3.c(parcel2);
            BadgeSticker badgeSticker = (BadgeSticker) parcel2.readParcelable(BadgeSticker.class.getClassLoader());
            SnippetType snippetType = (SnippetType) parcel2.readParcelable(SnippetType.class.getClassLoader());
            KeyAttributes keyAttributes = (KeyAttributes) parcel2.readParcelable(KeyAttributes.class.getClassLoader());
            BuyerBonuses buyerBonuses = (BuyerBonuses) parcel2.readParcelable(BuyerBonuses.class.getClassLoader());
            String string27 = parcel2.readString();
            HotelRating hotelRating = (HotelRating) parcel2.readParcelable(HotelRating.class.getClassLoader());
            GeoDistance geoDistance = (GeoDistance) parcel2.readParcelable(GeoDistance.class.getClassLoader());
            boolean zC15 = J3.c(parcel2);
            boolean zC16 = J3.c(parcel2);
            String string28 = parcel2.readString();
            String str9 = string28 == null ? "" : string28;
            int i15 = parcel2.readInt();
            String string29 = parcel2.readString();
            String str10 = string29 == null ? "" : string29;
            RatingAndReviews ratingAndReviews = (RatingAndReviews) parcel2.readParcelable(RatingAndReviews.class.getClassLoader());
            boolean zC17 = J3.c(parcel2);
            boolean zC18 = J3.c(parcel2);
            boolean zC19 = J3.c(parcel2);
            Enum[] enumArr = (Enum[]) ((AbstractC42734a) C8030a.f268477a).toArray(new AdvertTravelPriceVersion[0]);
            int i16 = parcel2.readInt();
            AdvertItem advertItem = new AdvertItem(j12, string, string2, string3, string4, zC2, universalColor, string5, str2, str3, str4, str, discountIcon, priceList, string10, zC3, deliveryTerms, null, string11, string12, string13, string14, string15, string16, j13, dimmedImage, string17, i12, serpViewType, zC4, serpDisplayType, zC5, zC6, null, null, string18, zC7, string19, zC8, deepLink, c20199a, null, string20, listA, listA2, advertActions, action, string21, priceTypeBadge, serpBadgeBar, advertItemActions, string22, null, listA3, quorumFilterInfo, radiusInfo, advertSellerInfo, gigShiftInfo, false, zC9, string23, null, string24, string25, zC10, num, string26, zC11, advertisementVerticalAlias, null, shownItemsAbTestGroup, serpAdvertSpecification, zC12, null, zC13, realtorBonus, zC14, badgeSticker, snippetType, null, keyAttributes, buyerBonuses, string27, hotelRating, geoDistance, null, null, null, zC15, zC16, str9, i15, str10, ratingAndReviews, zC18, zC19, null, zC17, false, null, (AdvertTravelPriceVersion) (i16 != -1 ? enumArr[i16] : null), 131072, 605028870, 14713376, 13, null);
            advertItem.f268419Z0 = PhoneLoadingState.values()[parcel2.readInt()];
            return advertItem;
        }
    }

    /* compiled from: AdvertItem.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/serp/adapter/AdvertItem$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/serp/adapter/AdvertItem;", "CREATOR", "Landroid/os/Parcelable$Creator;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: AdvertItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f268478a;

        static {
            int[] iArr = new int[AdvertItemRedesignGroup.values().length];
            try {
                Parcelable.Creator<AdvertItemRedesignGroup> creator = AdvertItemRedesignGroup.CREATOR;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<AdvertItemRedesignGroup> creator2 = AdvertItemRedesignGroup.CREATOR;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f268478a = iArr;
        }
    }

    /* compiled from: AdvertItem.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/g0;", "invoke", "()Lcom/avito/android/serp/adapter/g0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<C34734g0> {
        public d() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
        @Override // Y41.a
        public final C34734g0 invoke() {
            List<AdvertAction> actions;
            ?? next;
            AdvertItem advertItem = AdvertItem.this;
            AdvertSellerInfo advertSellerInfo = advertItem.f268435f0;
            String userKey = advertSellerInfo != null ? advertSellerInfo.getUserKey() : null;
            AdvertSellerInfo advertSellerInfo2 = advertItem.f268435f0;
            String name = advertSellerInfo2 != null ? advertSellerInfo2.getName() : null;
            Image image = advertSellerInfo2 != null ? advertSellerInfo2.getImage() : null;
            DimmedImage dimmedImage = advertItem.f268368A;
            Image image2 = dimmedImage != null ? dimmedImage.getImage() : null;
            AdvertActions advertActions = advertItem.f268408U;
            if (advertActions != null && (actions = advertActions.getActions()) != null) {
                Iterator it = actions.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = 0;
                        break;
                    }
                    next = it.next();
                    if (next != 0 ? next instanceof AdvertAction.Messenger : true) {
                        break;
                    }
                }
                messenger = next instanceof AdvertAction.Messenger ? next : null;
            }
            return new C34734g0(userKey, name, image, advertItem.f268425c, advertItem.f268420a0, advertItem.f268428d, advertItem.f268440i, image2, messenger);
        }
    }

    static {
        new b(null);
        a aVar = a.f268476l;
        int i12 = I3.f318630a;
        CREATOR = new H3(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdvertItem(long r6, @Y61.k java.lang.String r8, @Y61.k java.lang.String r9, @Y61.l java.lang.String r10, @Y61.l java.lang.String r11, boolean r12, @Y61.l com.avito.android.remote.model.UniversalColor r13, @Y61.l java.lang.String r14, @Y61.l java.lang.String r15, @Y61.l java.lang.String r16, @Y61.l java.lang.String r17, @Y61.l java.lang.String r18, @Y61.l com.avito.android.remote.model.DiscountIcon r19, @Y61.l com.avito.android.remote.model.price_list.PriceList r20, @Y61.l java.lang.String r21, boolean r22, @Y61.l ru.avito.component.serp.DeliveryTerms r23, @Y61.l java.lang.String r24, @Y61.l java.lang.String r25, @Y61.l java.lang.String r26, @Y61.l java.lang.String r27, @Y61.l java.lang.String r28, @Y61.l java.lang.String r29, @Y61.l java.lang.String r30, long r31, @Y61.l com.avito.android.remote.model.DimmedImage r33, @Y61.l java.lang.String r34, int r35, @Y61.k com.avito.android.serp.adapter.SerpViewType r36, boolean r37, @Y61.k com.avito.android.remote.model.SerpDisplayType r38, boolean r39, boolean r40, @Y61.l com.avito.android.remote.model.AdvertComparison r41, @Y61.l java.lang.Boolean r42, @Y61.l java.lang.String r43, boolean r44, @Y61.l java.lang.String r45, boolean r46, @Y61.k com.avito.android.deep_linking.links.DeepLink r47, @Y61.l java.util.Map<java.lang.String, java.lang.String> r48, @Y61.l java.util.Map<java.lang.String, java.lang.String> r49, @Y61.l java.lang.String r50, @Y61.l java.util.List<com.avito.android.remote.model.DimmedImage> r51, @Y61.l java.util.List<? extends com.avito.android.remote.model.ConstructorAdvertGalleryItemModel> r52, @Y61.l com.avito.android.remote.model.AdvertActions r53, @Y61.l com.avito.android.remote.model.Action r54, @Y61.l java.lang.String r55, @Y61.l com.avito.android.serp.adapter.badge.PriceTypeBadge r56, @Y61.l com.avito.android.remote.model.badge_bar.SerpBadgeBar r57, @Y61.l com.avito.android.remote.model.AdvertItemActions r58, @Y61.l java.lang.String r59, @Y61.l java.lang.Integer r60, @Y61.l java.util.List<com.avito.android.remote.model.GeoReference> r61, @Y61.l com.avito.android.remote.model.QuorumFilterInfo r62, @Y61.l com.avito.android.remote.model.RadiusInfo r63, @Y61.l com.avito.android.remote.model.AdvertSellerInfo r64, @Y61.l com.avito.android.remote.model.GigShiftInfo r65, boolean r66, boolean r67, @Y61.l java.lang.String r68, @Y61.l java.util.List<java.lang.String> r69, @Y61.l java.lang.String r70, @Y61.l java.lang.String r71, boolean r72, @Y61.l java.lang.Integer r73, @Y61.l java.lang.String r74, boolean r75, @Y61.l com.avito.android.remote.model.AdvertisementVerticalAlias r76, @Y61.l com.avito.android.remote.model.FavoritesToast r77, @Y61.k com.avito.android.serp.adapter.serp_advert_card.ShownItemsAbTestGroup r78, @Y61.l com.avito.android.remote.model.serp.SerpAdvertSpecification r79, boolean r80, @Y61.l com.avito.android.remote.model.text.AttributedText r81, boolean r82, @Y61.l com.avito.android.remote.model.realtor_bonus.RealtorBonus r83, boolean r84, @Y61.l com.avito.android.remote.model.sales.utils.BadgeSticker r85, @Y61.l com.avito.android.remote.model.snippet_type.SnippetType r86, @Y61.l com.avito.android.remote.model.BuyWithDeliveryButton r87, @Y61.l com.avito.android.remote.model.KeyAttributes r88, @Y61.l com.avito.android.remote.model.buyer_bonuses.BuyerBonuses r89, @Y61.l java.lang.String r90, @Y61.l com.avito.android.remote.model.hotel.HotelRating r91, @Y61.l com.avito.android.remote.model.GeoDistance r92, @Y61.l com.avito.android.remote.model.UniversalColor r93, @Y61.l com.avito.android.remote.model.UniversalColor r94, @Y61.l com.avito.android.remote.model.UniversalColor r95, boolean r96, boolean r97, @Y61.k java.lang.String r98, int r99, @Y61.k java.lang.String r100, @Y61.l ru.avito.component.serp.rating_and_reviews.RatingAndReviews r101, boolean r102, boolean r103, @Y61.l com.avito.android.serp.adapter.AdvertItemRedesignGroup r104, boolean r105, boolean r106, @Y61.l com.avito.android.remote.model.TravelInstallments r107, @Y61.l com.avito.android.remote.model.AdvertTravelPriceVersion r108) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.AdvertItem.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.avito.android.remote.model.UniversalColor, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.avito.android.remote.model.DiscountIcon, com.avito.android.remote.model.price_list.PriceList, java.lang.String, boolean, ru.avito.component.serp.DeliveryTerms, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, com.avito.android.remote.model.DimmedImage, java.lang.String, int, com.avito.android.serp.adapter.SerpViewType, boolean, com.avito.android.remote.model.SerpDisplayType, boolean, boolean, com.avito.android.remote.model.AdvertComparison, java.lang.Boolean, java.lang.String, boolean, java.lang.String, boolean, com.avito.android.deep_linking.links.DeepLink, java.util.Map, java.util.Map, java.lang.String, java.util.List, java.util.List, com.avito.android.remote.model.AdvertActions, com.avito.android.remote.model.Action, java.lang.String, com.avito.android.serp.adapter.badge.PriceTypeBadge, com.avito.android.remote.model.badge_bar.SerpBadgeBar, com.avito.android.remote.model.AdvertItemActions, java.lang.String, java.lang.Integer, java.util.List, com.avito.android.remote.model.QuorumFilterInfo, com.avito.android.remote.model.RadiusInfo, com.avito.android.remote.model.AdvertSellerInfo, com.avito.android.remote.model.GigShiftInfo, boolean, boolean, java.lang.String, java.util.List, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.String, boolean, com.avito.android.remote.model.AdvertisementVerticalAlias, com.avito.android.remote.model.FavoritesToast, com.avito.android.serp.adapter.serp_advert_card.ShownItemsAbTestGroup, com.avito.android.remote.model.serp.SerpAdvertSpecification, boolean, com.avito.android.remote.model.text.AttributedText, boolean, com.avito.android.remote.model.realtor_bonus.RealtorBonus, boolean, com.avito.android.remote.model.sales.utils.BadgeSticker, com.avito.android.remote.model.snippet_type.SnippetType, com.avito.android.remote.model.BuyWithDeliveryButton, com.avito.android.remote.model.KeyAttributes, com.avito.android.remote.model.buyer_bonuses.BuyerBonuses, java.lang.String, com.avito.android.remote.model.hotel.HotelRating, com.avito.android.remote.model.GeoDistance, com.avito.android.remote.model.UniversalColor, com.avito.android.remote.model.UniversalColor, com.avito.android.remote.model.UniversalColor, boolean, boolean, java.lang.String, int, java.lang.String, ru.avito.component.serp.rating_and_reviews.RatingAndReviews, boolean, boolean, com.avito.android.serp.adapter.AdvertItemRedesignGroup, boolean, boolean, com.avito.android.remote.model.TravelInstallments, com.avito.android.remote.model.AdvertTravelPriceVersion):void");
    }

    public static AdvertItem b(AdvertItem advertItem, DimmedImage dimmedImage, boolean z12, List list, AdvertItemActions advertItemActions, int i12, int i13, int i14) {
        long j12;
        DimmedImage dimmedImage2;
        int i15;
        boolean z13;
        SerpDisplayType serpDisplayType;
        boolean z14;
        boolean z15;
        boolean z16;
        String str;
        boolean z17;
        long j13 = advertItem.f268422b;
        String str2 = advertItem.f268425c;
        String str3 = advertItem.f268428d;
        String str4 = advertItem.f268431e;
        String str5 = advertItem.f268434f;
        boolean z18 = advertItem.f268436g;
        UniversalColor universalColor = advertItem.f268438h;
        String str6 = advertItem.f268440i;
        String str7 = advertItem.f268442j;
        String str8 = advertItem.f268444k;
        String str9 = advertItem.f268446l;
        String str10 = advertItem.f268448m;
        DiscountIcon discountIcon = advertItem.f268450n;
        PriceList priceList = advertItem.f268452o;
        String str11 = advertItem.f268454p;
        boolean z19 = advertItem.f268456q;
        DeliveryTerms deliveryTerms = advertItem.f268458r;
        String str12 = advertItem.f268460s;
        String str13 = advertItem.f268462t;
        String str14 = advertItem.f268464u;
        String str15 = advertItem.f268466v;
        String str16 = advertItem.f268468w;
        String str17 = advertItem.f268470x;
        String str18 = advertItem.f268472y;
        long j14 = advertItem.f268474z;
        if ((i12 & 33554432) != 0) {
            j12 = j14;
            dimmedImage2 = advertItem.f268368A;
        } else {
            j12 = j14;
            dimmedImage2 = dimmedImage;
        }
        String str19 = advertItem.f268370B;
        int i16 = advertItem.f268372C;
        SerpViewType serpViewType = advertItem.f268374D;
        if ((i12 & 536870912) != 0) {
            i15 = i16;
            z13 = advertItem.f268376E;
        } else {
            i15 = i16;
            z13 = false;
        }
        boolean z22 = z13;
        SerpDisplayType serpDisplayType2 = advertItem.f268378F;
        if ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0) {
            serpDisplayType = serpDisplayType2;
            z14 = advertItem.f268380G;
        } else {
            serpDisplayType = serpDisplayType2;
            z14 = z12;
        }
        boolean z23 = advertItem.f268382H;
        AdvertComparison advertComparison = advertItem.f268384I;
        Boolean bool = advertItem.f268386J;
        String str20 = advertItem.f268388K;
        boolean z24 = advertItem.f268390L;
        String str21 = advertItem.f268392M;
        if ((i13 & 64) != 0) {
            z15 = z23;
            z16 = advertItem.f268394N;
        } else {
            z15 = z23;
            z16 = true;
        }
        DeepLink deepLink = advertItem.f268396O;
        Map<String, String> map = advertItem.f268398P;
        Map<String, String> map2 = advertItem.f268400Q;
        String str22 = advertItem.f268402R;
        List list2 = (i13 & 2048) != 0 ? advertItem.f268404S : list;
        List<ConstructorAdvertGalleryItemModel> list3 = advertItem.f268406T;
        AdvertActions advertActions = advertItem.f268408U;
        Action action = advertItem.f268410V;
        String str23 = advertItem.f268412W;
        PriceTypeBadge priceTypeBadge = advertItem.f268414X;
        SerpBadgeBar serpBadgeBar = advertItem.f268416Y;
        AdvertItemActions advertItemActions2 = (i13 & 262144) != 0 ? advertItem.f268418Z : advertItemActions;
        String str24 = advertItem.f268420a0;
        Integer num = advertItem.f268423b0;
        List<GeoReference> list4 = advertItem.f268426c0;
        QuorumFilterInfo quorumFilterInfo = advertItem.f268429d0;
        RadiusInfo radiusInfo = advertItem.f268432e0;
        AdvertSellerInfo advertSellerInfo = advertItem.f268435f0;
        GigShiftInfo gigShiftInfo = advertItem.f268437g0;
        boolean z25 = advertItem.f268439h0;
        boolean z26 = advertItem.f268441i0;
        String str25 = advertItem.f268443j0;
        List<String> list5 = advertItem.f268445k0;
        String str26 = advertItem.f268447l0;
        String str27 = advertItem.f268449m0;
        if ((i14 & 1) != 0) {
            str = str24;
            z17 = advertItem.f268451n0;
        } else {
            str = str24;
            z17 = true;
        }
        Integer num2 = advertItem.f268453o0;
        String str28 = advertItem.f268455p0;
        boolean z27 = advertItem.f268457q0;
        AdvertisementVerticalAlias advertisementVerticalAlias = advertItem.f268459r0;
        FavoritesToast favoritesToast = advertItem.f268461s0;
        ShownItemsAbTestGroup shownItemsAbTestGroup = advertItem.f268463t0;
        SerpAdvertSpecification serpAdvertSpecification = advertItem.f268465u0;
        boolean z28 = advertItem.f268467v0;
        AttributedText attributedText = advertItem.f268469w0;
        boolean z29 = advertItem.f268471x0;
        RealtorBonus realtorBonus = advertItem.f268473y0;
        boolean z32 = advertItem.f268475z0;
        BadgeSticker badgeSticker = advertItem.f268369A0;
        SnippetType snippetType = advertItem.f268371B0;
        BuyWithDeliveryButton buyWithDeliveryButton = advertItem.f268373C0;
        KeyAttributes keyAttributes = advertItem.f268375D0;
        BuyerBonuses buyerBonuses = advertItem.f268377E0;
        String str29 = advertItem.f268379F0;
        HotelRating hotelRating = advertItem.f268381G0;
        GeoDistance geoDistance = advertItem.f268383H0;
        UniversalColor universalColor2 = advertItem.f268385I0;
        UniversalColor universalColor3 = advertItem.f268387J0;
        UniversalColor universalColor4 = advertItem.f268389K0;
        boolean z33 = advertItem.f268391L0;
        boolean z34 = advertItem.f268393M0;
        String str30 = advertItem.f268395N0;
        int i17 = advertItem.f268397O0;
        String str31 = advertItem.f268399P0;
        RatingAndReviews ratingAndReviews = advertItem.f268401Q0;
        boolean z35 = advertItem.f268403R0;
        boolean z36 = advertItem.f268405S0;
        AdvertItemRedesignGroup advertItemRedesignGroup = advertItem.f268407T0;
        boolean z37 = advertItem.f268409U0;
        boolean z38 = advertItem.f268411V0;
        TravelInstallments travelInstallments = advertItem.f268413W0;
        AdvertTravelPriceVersion advertTravelPriceVersion = advertItem.f268415X0;
        advertItem.getClass();
        return new AdvertItem(j13, str2, str3, str4, str5, z18, universalColor, str6, str7, str8, str9, str10, discountIcon, priceList, str11, z19, deliveryTerms, str12, str13, str14, str15, str16, str17, str18, j12, dimmedImage2, str19, i15, serpViewType, z22, serpDisplayType, z14, z15, advertComparison, bool, str20, z24, str21, z16, deepLink, map, map2, str22, list2, list3, advertActions, action, str23, priceTypeBadge, serpBadgeBar, advertItemActions2, str, num, list4, quorumFilterInfo, radiusInfo, advertSellerInfo, gigShiftInfo, z25, z26, str25, list5, str26, str27, z17, num2, str28, z27, advertisementVerticalAlias, favoritesToast, shownItemsAbTestGroup, serpAdvertSpecification, z28, attributedText, z29, realtorBonus, z32, badgeSticker, snippetType, buyWithDeliveryButton, keyAttributes, buyerBonuses, str29, hotelRating, geoDistance, universalColor2, universalColor3, universalColor4, z33, z34, str30, i17, str31, ratingAndReviews, z35, z36, advertItemRedesignGroup, z37, z38, travelInstallments, advertTravelPriceVersion);
    }

    @Override // La.h
    public final AdvertItem C0(AdvertItemActions advertItemActions) {
        return b(this, null, false, null, advertItemActions, -1, -262145, -1);
    }

    @Override // La.h
    @Y61.l
    /* renamed from: I0, reason: from getter */
    public final AdvertItemActions getF268418Z() {
        return this.f268418Z;
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f268378F = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AdvertItem.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AdvertItem advertItem = (AdvertItem) obj;
        return this.f268422b == advertItem.f268422b && kotlin.jvm.internal.L.f(this.f268425c, advertItem.f268425c) && kotlin.jvm.internal.L.f(this.f268428d, advertItem.f268428d) && kotlin.jvm.internal.L.f(this.f268431e, advertItem.f268431e) && kotlin.jvm.internal.L.f(this.f268434f, advertItem.f268434f) && this.f268436g == advertItem.f268436g && kotlin.jvm.internal.L.f(this.f268438h, advertItem.f268438h) && kotlin.jvm.internal.L.f(this.f268440i, advertItem.f268440i) && kotlin.jvm.internal.L.f(this.f268442j, advertItem.f268442j) && kotlin.jvm.internal.L.f(this.f268444k, advertItem.f268444k) && kotlin.jvm.internal.L.f(this.f268446l, advertItem.f268446l) && kotlin.jvm.internal.L.f(this.f268448m, advertItem.f268448m) && kotlin.jvm.internal.L.f(this.f268450n, advertItem.f268450n) && kotlin.jvm.internal.L.f(this.f268452o, advertItem.f268452o) && kotlin.jvm.internal.L.f(this.f268454p, advertItem.f268454p) && this.f268456q == advertItem.f268456q && kotlin.jvm.internal.L.f(this.f268458r, advertItem.f268458r) && kotlin.jvm.internal.L.f(this.f268462t, advertItem.f268462t) && kotlin.jvm.internal.L.f(this.f268464u, advertItem.f268464u) && kotlin.jvm.internal.L.f(this.f268466v, advertItem.f268466v) && kotlin.jvm.internal.L.f(this.f268468w, advertItem.f268468w) && kotlin.jvm.internal.L.f(this.f268470x, advertItem.f268470x) && kotlin.jvm.internal.L.f(this.f268472y, advertItem.f268472y) && this.f268474z == advertItem.f268474z && kotlin.jvm.internal.L.f(this.f268368A, advertItem.f268368A) && kotlin.jvm.internal.L.f(this.f268370B, advertItem.f268370B) && this.f268372C == advertItem.f268372C && this.f268374D == advertItem.f268374D && this.f268376E == advertItem.f268376E && this.f268378F == advertItem.f268378F && this.f268380G == advertItem.f268380G && this.f268382H == advertItem.f268382H && kotlin.jvm.internal.L.f(this.f268388K, advertItem.f268388K) && this.f268390L == advertItem.f268390L && kotlin.jvm.internal.L.f(this.f268392M, advertItem.f268392M) && this.f268394N == advertItem.f268394N && kotlin.jvm.internal.L.f(this.f268396O, advertItem.f268396O) && kotlin.jvm.internal.L.f(this.f268398P, advertItem.f268398P) && kotlin.jvm.internal.L.f(this.f268402R, advertItem.f268402R) && kotlin.jvm.internal.L.f(this.f268404S, advertItem.f268404S) && kotlin.jvm.internal.L.f(this.f268406T, advertItem.f268406T) && kotlin.jvm.internal.L.f(this.f268408U, advertItem.f268408U) && kotlin.jvm.internal.L.f(this.f268410V, advertItem.f268410V) && kotlin.jvm.internal.L.f(this.f268412W, advertItem.f268412W) && kotlin.jvm.internal.L.f(this.f268414X, advertItem.f268414X) && kotlin.jvm.internal.L.f(this.f268416Y, advertItem.f268416Y) && kotlin.jvm.internal.L.f(this.f268418Z, advertItem.f268418Z) && kotlin.jvm.internal.L.f(this.f268420a0, advertItem.f268420a0) && kotlin.jvm.internal.L.f(this.f268426c0, advertItem.f268426c0) && kotlin.jvm.internal.L.f(this.f268429d0, advertItem.f268429d0) && kotlin.jvm.internal.L.f(this.f268432e0, advertItem.f268432e0) && kotlin.jvm.internal.L.f(this.f268435f0, advertItem.f268435f0) && kotlin.jvm.internal.L.f(this.f268437g0, advertItem.f268437g0) && this.f268441i0 == advertItem.f268441i0 && kotlin.jvm.internal.L.f(this.f268443j0, advertItem.f268443j0) && kotlin.jvm.internal.L.f(this.f268447l0, advertItem.f268447l0) && kotlin.jvm.internal.L.f(this.f268449m0, advertItem.f268449m0) && this.f268451n0 == advertItem.f268451n0 && kotlin.jvm.internal.L.f(this.f268453o0, advertItem.f268453o0) && kotlin.jvm.internal.L.f(this.f268455p0, advertItem.f268455p0) && this.f268457q0 == advertItem.f268457q0 && this.f268459r0 == advertItem.f268459r0 && this.f268463t0 == advertItem.f268463t0 && kotlin.jvm.internal.L.f(this.f268465u0, advertItem.f268465u0) && this.f268417Y0 == advertItem.f268417Y0 && this.f268419Z0 == advertItem.f268419Z0 && this.f268424b1 == advertItem.f268424b1 && kotlin.jvm.internal.L.f(getInAppCallsAwareItemData(), advertItem.getInAppCallsAwareItemData()) && this.f268467v0 == advertItem.f268467v0 && this.f268471x0 == advertItem.f268471x0 && kotlin.jvm.internal.L.f(this.f268473y0, advertItem.f268473y0) && this.f268475z0 == advertItem.f268475z0 && kotlin.jvm.internal.L.f(this.f268369A0, advertItem.f268369A0) && this.f268371B0 == advertItem.f268371B0 && kotlin.jvm.internal.L.f(this.f268373C0, advertItem.f268373C0) && kotlin.jvm.internal.L.f(this.f268375D0, advertItem.f268375D0) && kotlin.jvm.internal.L.f(this.f268377E0, advertItem.f268377E0) && kotlin.jvm.internal.L.f(this.f268379F0, advertItem.f268379F0) && kotlin.jvm.internal.L.f(this.f268381G0, advertItem.f268381G0) && kotlin.jvm.internal.L.f(this.f268383H0, advertItem.f268383H0) && this.f268391L0 == advertItem.f268391L0 && this.f268393M0 == advertItem.f268393M0 && kotlin.jvm.internal.L.f(this.f268395N0, advertItem.f268395N0) && this.f268397O0 == advertItem.f268397O0 && kotlin.jvm.internal.L.f(this.f268399P0, advertItem.f268399P0) && kotlin.jvm.internal.L.f(this.f268401Q0, advertItem.f268401Q0) && this.f268409U0 == advertItem.f268409U0 && this.f268403R0 == advertItem.f268403R0;
    }

    @Override // com.avito.android.serp.adapter.S
    @Y61.l
    /* renamed from: getAnalyticsContext, reason: from getter */
    public final String getF109521b() {
        return this.f268388K;
    }

    @Override // com.avito.android.serp.adapter.S
    @Y61.l
    /* renamed from: getFavoritesToast, reason: from getter */
    public final FavoritesToast getF268773Z() {
        return this.f268461s0;
    }

    @Override // com.avito.android.serp.adapter.Z
    public final int getFeaturedSectionPosition() {
        throw null;
    }

    @Override // com.avito.android.serp.adapter.Z
    @Y61.k
    public final String getFeaturedSectionTitle() {
        throw null;
    }

    @Override // com.avito.android.serp.adapter.Z
    @Y61.k
    public final String getFeaturedSectionType() {
        throw null;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition, reason: from getter */
    public final boolean getF272887i() {
        return this.f268391L0;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF73058b() {
        return this.f268422b;
    }

    @Override // com.avito.android.serp.adapter.InAppCallsAwareItem
    @Y61.k
    public final C34734g0 getInAppCallsAwareItemData() {
        return (C34734g0) this.f268433e1.getValue();
    }

    @Override // com.avito.android.async_phone.AsyncPhoneItem
    @Y61.k
    /* renamed from: getPhoneLoadingState, reason: from getter */
    public final PhoneLoadingState getF268802o0() {
        return this.f268419Z0;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF78716h() {
        return this.f268372C;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF95179b() {
        return this.f268425c;
    }

    @Override // com.avito.android.serp.adapter.S
    @Y61.l
    /* renamed from: getVerticalAlias, reason: from getter */
    public final AdvertisementVerticalAlias getF109522c() {
        return this.f268459r0;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF78717i() {
        return this.f268374D;
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(Long.hashCode(this.f268422b) * 31, 31, this.f268425c), 31, this.f268428d);
        String str = this.f268431e;
        int iHashCode = (iD2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f268434f;
        int i12 = androidx.appcompat.app.r.i((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f268436g);
        UniversalColor universalColor = this.f268438h;
        int iHashCode2 = (i12 + (universalColor != null ? universalColor.hashCode() : 0)) * 31;
        String str3 = this.f268440i;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f268442j;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f268444k;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f268446l;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f268448m;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        DiscountIcon discountIcon = this.f268450n;
        int iHashCode8 = (iHashCode7 + (discountIcon != null ? discountIcon.hashCode() : 0)) * 31;
        PriceList priceList = this.f268452o;
        int i13 = androidx.appcompat.app.r.i((iHashCode8 + (priceList != null ? priceList.hashCode() : 0)) * 31, 31, this.f268456q);
        DeliveryTerms deliveryTerms = this.f268458r;
        int iHashCode9 = (i13 + (deliveryTerms != null ? deliveryTerms.hashCode() : 0)) * 31;
        String str8 = this.f268462t;
        int iHashCode10 = (iHashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f268464u;
        int iHashCode11 = (iHashCode10 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f268466v;
        int iHashCode12 = (iHashCode11 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f268468w;
        int iHashCode13 = (iHashCode12 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.f268470x;
        int iHashCode14 = (iHashCode13 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.f268472y;
        int iG2 = androidx.appcompat.app.r.g((iHashCode14 + (str13 != null ? str13.hashCode() : 0)) * 31, 31, this.f268474z);
        DimmedImage dimmedImage = this.f268368A;
        int iHashCode15 = (iG2 + (dimmedImage != null ? dimmedImage.hashCode() : 0)) * 31;
        String str14 = this.f268370B;
        int i14 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(com.avito.android.actions_sheet.a.h(this.f268378F, androidx.appcompat.app.r.i(com.avito.android.actions_sheet.a.j(this.f268374D, (((iHashCode15 + (str14 != null ? str14.hashCode() : 0)) * 31) + this.f268372C) * 31, 31), 31, this.f268376E), 31), 31, this.f268380G), 31, this.f268382H);
        String str15 = this.f268388K;
        int i15 = androidx.appcompat.app.r.i((i14 + (str15 != null ? str15.hashCode() : 0)) * 31, 31, this.f268390L);
        String str16 = this.f268392M;
        int iE2 = com.avito.android.actions_sheet.a.e(this.f268396O, androidx.appcompat.app.r.i((i15 + (str16 != null ? str16.hashCode() : 0)) * 31, 31, this.f268394N), 31);
        Map<String, String> map = this.f268398P;
        int iHashCode16 = (iE2 + (map != null ? map.hashCode() : 0)) * 31;
        String str17 = this.f268402R;
        int iHashCode17 = (iHashCode16 + (str17 != null ? str17.hashCode() : 0)) * 31;
        List<DimmedImage> list = this.f268404S;
        int iHashCode18 = (iHashCode17 + (list != null ? list.hashCode() : 0)) * 31;
        List<ConstructorAdvertGalleryItemModel> list2 = this.f268406T;
        int iHashCode19 = (iHashCode18 + (list2 != null ? list2.hashCode() : 0)) * 31;
        AdvertActions advertActions = this.f268408U;
        int iHashCode20 = (iHashCode19 + (advertActions != null ? advertActions.hashCode() : 0)) * 31;
        Action action = this.f268410V;
        int iHashCode21 = (iHashCode20 + (action != null ? action.hashCode() : 0)) * 31;
        String str18 = this.f268412W;
        int iHashCode22 = (iHashCode21 + (str18 != null ? str18.hashCode() : 0)) * 31;
        PriceTypeBadge priceTypeBadge = this.f268414X;
        int iHashCode23 = (iHashCode22 + (priceTypeBadge != null ? priceTypeBadge.hashCode() : 0)) * 31;
        SerpBadgeBar serpBadgeBar = this.f268416Y;
        int iHashCode24 = (iHashCode23 + (serpBadgeBar != null ? serpBadgeBar.hashCode() : 0)) * 31;
        AdvertItemActions advertItemActions = this.f268418Z;
        int iHashCode25 = (iHashCode24 + (advertItemActions != null ? advertItemActions.hashCode() : 0)) * 31;
        String str19 = this.f268420a0;
        int iHashCode26 = (iHashCode25 + (str19 != null ? str19.hashCode() : 0)) * 31;
        List<GeoReference> list3 = this.f268426c0;
        int iHashCode27 = (iHashCode26 + (list3 != null ? list3.hashCode() : 0)) * 31;
        QuorumFilterInfo quorumFilterInfo = this.f268429d0;
        int iHashCode28 = (iHashCode27 + (quorumFilterInfo != null ? quorumFilterInfo.hashCode() : 0)) * 31;
        RadiusInfo radiusInfo = this.f268432e0;
        int iHashCode29 = (iHashCode28 + (radiusInfo != null ? radiusInfo.hashCode() : 0)) * 31;
        AdvertSellerInfo advertSellerInfo = this.f268435f0;
        int iHashCode30 = (iHashCode29 + (advertSellerInfo != null ? advertSellerInfo.hashCode() : 0)) * 31;
        GigShiftInfo gigShiftInfo = this.f268437g0;
        int i16 = androidx.appcompat.app.r.i((iHashCode30 + (gigShiftInfo != null ? gigShiftInfo.hashCode() : 0)) * 31, 31, this.f268441i0);
        String str20 = this.f268443j0;
        int iHashCode31 = (i16 + (str20 != null ? str20.hashCode() : 0)) * 31;
        String str21 = this.f268447l0;
        int iHashCode32 = (iHashCode31 + (str21 != null ? str21.hashCode() : 0)) * 31;
        String str22 = this.f268449m0;
        int i17 = androidx.appcompat.app.r.i((iHashCode32 + (str22 != null ? str22.hashCode() : 0)) * 31, 31, this.f268451n0);
        Integer num = this.f268453o0;
        int iIntValue = (i17 + (num != null ? num.intValue() : 0)) * 31;
        String str23 = this.f268455p0;
        int i18 = androidx.appcompat.app.r.i((iIntValue + (str23 != null ? str23.hashCode() : 0)) * 31, 31, this.f268457q0);
        AdvertisementVerticalAlias advertisementVerticalAlias = this.f268459r0;
        int iHashCode33 = (this.f268463t0.hashCode() + ((i18 + (advertisementVerticalAlias != null ? advertisementVerticalAlias.hashCode() : 0)) * 31)) * 31;
        SerpAdvertSpecification serpAdvertSpecification = this.f268465u0;
        int i19 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((getInAppCallsAwareItemData().hashCode() + androidx.appcompat.app.r.i((this.f268419Z0.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode33 + (serpAdvertSpecification != null ? serpAdvertSpecification.hashCode() : 0)) * 31, 31, false), 31, this.f268417Y0)) * 31, 31, this.f268424b1)) * 31, 31, this.f268467v0), 31, this.f268471x0);
        RealtorBonus realtorBonus = this.f268473y0;
        int i22 = androidx.appcompat.app.r.i((i19 + (realtorBonus != null ? realtorBonus.hashCode() : 0)) * 31, 31, this.f268475z0);
        BadgeSticker badgeSticker = this.f268369A0;
        int iHashCode34 = (i22 + (badgeSticker != null ? badgeSticker.hashCode() : 0)) * 31;
        SnippetType snippetType = this.f268371B0;
        int iHashCode35 = (iHashCode34 + (snippetType != null ? snippetType.hashCode() : 0)) * 31;
        BuyWithDeliveryButton buyWithDeliveryButton = this.f268373C0;
        int iHashCode36 = (iHashCode35 + (buyWithDeliveryButton != null ? buyWithDeliveryButton.hashCode() : 0)) * 31;
        KeyAttributes keyAttributes = this.f268375D0;
        int iHashCode37 = (iHashCode36 + (keyAttributes != null ? keyAttributes.hashCode() : 0)) * 31;
        BuyerBonuses buyerBonuses = this.f268377E0;
        int iHashCode38 = (iHashCode37 + (buyerBonuses != null ? buyerBonuses.hashCode() : 0)) * 31;
        String str24 = this.f268379F0;
        int iHashCode39 = (iHashCode38 + (str24 != null ? str24.hashCode() : 0)) * 31;
        HotelRating hotelRating = this.f268381G0;
        int iD3 = androidx.compose.foundation.H.d(androidx.appcompat.app.r.e(this.f268397O0, androidx.compose.foundation.H.d(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode39 + (hotelRating != null ? hotelRating.hashCode() : 0)) * 31, 31, this.f268391L0), 31, this.f268393M0), 31, this.f268395N0), 31), 31, this.f268399P0);
        RatingAndReviews ratingAndReviews = this.f268401Q0;
        return Boolean.hashCode(this.f268403R0) + androidx.appcompat.app.r.i((iD3 + (ratingAndReviews != null ? ratingAndReviews.hashCode() : 0)) * 31, 31, this.f268409U0);
    }

    @Override // com.avito.android.serp.adapter.S
    /* renamed from: isFavorite, reason: from getter */
    public final boolean getF268783f() {
        return this.f268380G;
    }

    @Override // com.avito.android.serp.adapter.Z
    public final boolean isFeatured() {
        throw null;
    }

    @Override // com.avito.android.serp.adapter.m1
    /* renamed from: isViewed, reason: from getter */
    public final boolean getF268760M() {
        return this.f268394N;
    }

    @Override // com.avito.android.serp.adapter.S
    public final void setFavorite(boolean z12) {
        this.f268380G = z12;
    }

    @Override // La.b
    public final void setHidden(boolean z12) {
        this.f268451n0 = z12;
    }

    @Override // com.avito.android.async_phone.AsyncPhoneItem
    public final void setPhoneLoadingState(@Y61.k PhoneLoadingState phoneLoadingState) {
        this.f268419Z0 = phoneLoadingState;
    }

    @Override // com.avito.android.serp.adapter.m1
    public final void setViewed(boolean z12) {
        this.f268394N = z12;
    }

    @Override // com.avito.android.serp.adapter.L
    @Y61.l
    /* renamed from: t1, reason: from getter */
    public final Integer getF268423b0() {
        return this.f268423b0;
    }

    @Y61.k
    public final String toString() {
        return "AdvertItem(id=" + this.f268422b + ", stringId=" + this.f268425c + ", title=" + this.f268428d + ", subtitle=" + this.f268431e + ", description=" + this.f268434f + ", isHighlighted=" + this.f268436g + ", highlightColor=" + this.f268438h + ", price=" + this.f268440i + ", priceWithoutDiscount=" + this.f268442j + ", normalizedPrice=" + this.f268444k + ", previousPrice=" + this.f268446l + ", previousPriceHint=" + this.f268448m + ", discountIcon=" + this.f268450n + ", priceList=" + this.f268452o + ", priceSubtitle=" + this.f268454p + ", hasDelivery=" + this.f268456q + ", deliveryTerms=" + this.f268458r + ", deliveryText=" + this.f268460s + ", location=" + this.f268462t + ", distance=" + this.f268464u + ", address=" + this.f268466v + ", addressesAdditionalInfo=" + this.f268468w + ", formattedTime=" + this.f268470x + ", schedule=" + this.f268472y + ", time=" + this.f268474z + ", image=" + this.f268368A + ", shopName=" + this.f268370B + ", spanCount=" + this.f268372C + ", viewType=" + this.f268374D + ", isActive=" + this.f268376E + ", displayType=" + this.f268378F + ", isFavorite=" + this.f268380G + ", isFavoriteVisible=" + this.f268382H + ", comparison=" + this.f268384I + ", reserved=" + this.f268386J + ", analyticsContext=" + this.f268388K + ", isVerifiedSeller=" + this.f268390L + ", verification=" + this.f268392M + ", isViewed=" + this.f268394N + ", deepLink=" + this.f268396O + ", analyticParams=" + this.f268398P + ", additionalAnalyticsParams=" + this.f268400Q + ", shortTermRentTag=" + this.f268402R + ", imageList=" + this.f268404S + ", galleryItems=" + this.f268406T + ", contacts=" + this.f268408U + ", additionalAction=" + this.f268410V + ", additionalName=" + this.f268412W + ", badge=" + this.f268414X + ", badgeBar=" + this.f268416Y + ", moreActions=" + this.f268418Z + ", categoryId=" + this.f268420a0 + ", intCategoryId=" + this.f268423b0 + ", geoReferences=" + this.f268426c0 + ", quorumFilterInfo=" + this.f268429d0 + ", radiusInfo=" + this.f268432e0 + ", sellerInfo=" + this.f268435f0 + ", gigShiftInfo=" + this.f268437g0 + ", hasRealtyLayout=" + this.f268439h0 + ", hasVideo=" + this.f268441i0 + ", nativeVideoABCategory=" + this.f268443j0 + ", exposureParams=" + this.f268445k0 + ", inStock=" + this.f268447l0 + ", trustFactor=" + this.f268449m0 + ", isHidden=" + this.f268451n0 + ", locationId=" + this.f268453o0 + ", xHash=" + this.f268455p0 + ", hidesViewedBadge=" + this.f268457q0 + ", verticalAlias=" + this.f268459r0 + ", favoritesToast=" + this.f268461s0 + ", shownItemsTestGroup=" + this.f268463t0 + ", specification=" + this.f268465u0 + ", trackVacanciesSurvey=" + this.f268467v0 + ", cvDescription=" + this.f268469w0 + ", hasDiscount=" + this.f268471x0 + ", realtorBonus=" + this.f268473y0 + ", hasSimilarButton=" + this.f268475z0 + ", badgeSticker=" + this.f268369A0 + ", snippetType=" + this.f268371B0 + ", buyWithDeliveryButton=" + this.f268373C0 + ", keyAttributes=" + this.f268375D0 + ", buyerBonuses=" + this.f268377E0 + ", dateRange=" + this.f268379F0 + ", hotelRating=" + this.f268381G0 + ", geoDistance=" + this.f268383H0 + ", titleAndPriceTextColor=" + this.f268385I0 + ", oldPriceColor=" + this.f268387J0 + ", discountPriceColor=" + this.f268389K0 + ", hasStablePosition=" + this.f268391L0 + ", isFeatured=" + this.f268393M0 + ", featuredSectionTitle=" + this.f268395N0 + ", featuredSectionPosition=" + this.f268397O0 + ", featuredSectionType=" + this.f268399P0 + ", ratingAndReviews=" + this.f268401Q0 + ", isRedesign=" + this.f268403R0 + ", isComplementaryRedesign=" + this.f268405S0 + ", redesignGroup=" + this.f268407T0 + ", isStrRedesign=" + this.f268409U0 + ", isExtendedGallery=" + this.f268411V0 + ", travelInstallments=" + this.f268413W0 + ", travelPriceVersion=" + this.f268415X0 + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f268422b);
        parcel.writeString(this.f268425c);
        parcel.writeString(this.f268428d);
        parcel.writeString(this.f268431e);
        parcel.writeString(this.f268434f);
        androidx.collection.o1<ClassLoader, androidx.collection.o1<String, Parcelable.Creator<?>>> o1Var = J3.f318636a;
        parcel.writeInt(this.f268436g ? 1 : 0);
        parcel.writeParcelable(this.f268438h, i12);
        parcel.writeString(this.f268440i);
        parcel.writeString(this.f268442j);
        parcel.writeString(this.f268444k);
        parcel.writeString(this.f268446l);
        parcel.writeString(this.f268448m);
        parcel.writeParcelable(this.f268450n, i12);
        parcel.writeParcelable(this.f268452o, i12);
        parcel.writeString(this.f268454p);
        parcel.writeInt(this.f268456q ? 1 : 0);
        parcel.writeParcelable(this.f268458r, i12);
        parcel.writeString(this.f268462t);
        parcel.writeString(this.f268464u);
        parcel.writeString(this.f268466v);
        parcel.writeString(this.f268468w);
        parcel.writeLong(this.f268474z);
        parcel.writeString(this.f268470x);
        parcel.writeString(this.f268472y);
        parcel.writeParcelable(this.f268368A, i12);
        parcel.writeString(this.f268370B);
        parcel.writeInt(this.f268372C);
        J3.d(parcel, this.f268374D);
        parcel.writeInt(this.f268376E ? 1 : 0);
        J3.d(parcel, this.f268378F);
        parcel.writeInt(this.f268380G ? 1 : 0);
        parcel.writeInt(this.f268382H ? 1 : 0);
        parcel.writeString(this.f268388K);
        parcel.writeInt(this.f268390L ? 1 : 0);
        parcel.writeString(this.f268392M);
        parcel.writeInt(this.f268394N ? 1 : 0);
        parcel.writeParcelable(this.f268396O, i12);
        J3.f(parcel, this.f268398P);
        parcel.writeString(this.f268402R);
        J3.e(this.f268404S, parcel, 0);
        J3.e(this.f268406T, parcel, 0);
        parcel.writeParcelable(this.f268408U, i12);
        parcel.writeParcelable(this.f268410V, i12);
        parcel.writeString(this.f268412W);
        parcel.writeParcelable(this.f268414X, i12);
        parcel.writeParcelable(this.f268416Y, i12);
        parcel.writeParcelable(this.f268418Z, i12);
        parcel.writeString(this.f268420a0);
        J3.e(this.f268426c0, parcel, i12);
        parcel.writeParcelable(this.f268429d0, i12);
        parcel.writeParcelable(this.f268432e0, i12);
        parcel.writeParcelable(this.f268435f0, i12);
        parcel.writeParcelable(this.f268437g0, i12);
        parcel.writeInt(this.f268441i0 ? 1 : 0);
        parcel.writeString(this.f268443j0);
        parcel.writeString(this.f268447l0);
        parcel.writeString(this.f268449m0);
        parcel.writeInt(this.f268451n0 ? 1 : 0);
        parcel.writeValue(this.f268453o0);
        parcel.writeString(this.f268455p0);
        parcel.writeInt(this.f268457q0 ? 1 : 0);
        AdvertisementVerticalAlias advertisementVerticalAlias = this.f268459r0;
        if (advertisementVerticalAlias == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(advertisementVerticalAlias.ordinal());
        }
        J3.d(parcel, this.f268463t0);
        parcel.writeParcelable(this.f268465u0, i12);
        parcel.writeParcelable(this.f268473y0, i12);
        parcel.writeInt(this.f268467v0 ? 1 : 0);
        parcel.writeInt(this.f268471x0 ? 1 : 0);
        parcel.writeInt(this.f268475z0 ? 1 : 0);
        parcel.writeParcelable(this.f268369A0, i12);
        parcel.writeParcelable(this.f268371B0, i12);
        parcel.writeParcelable(this.f268375D0, i12);
        parcel.writeParcelable(this.f268377E0, i12);
        parcel.writeString(this.f268379F0);
        parcel.writeParcelable(this.f268381G0, i12);
        parcel.writeParcelable(this.f268383H0, i12);
        parcel.writeInt(this.f268391L0 ? 1 : 0);
        parcel.writeInt(this.f268393M0 ? 1 : 0);
        parcel.writeString(this.f268395N0);
        parcel.writeInt(this.f268397O0);
        parcel.writeString(this.f268399P0);
        parcel.writeParcelable(this.f268401Q0, i12);
        parcel.writeInt(this.f268409U0 ? 1 : 0);
        parcel.writeInt(this.f268403R0 ? 1 : 0);
        parcel.writeInt(this.f268405S0 ? 1 : 0);
        AdvertTravelPriceVersion advertTravelPriceVersion = this.f268415X0;
        if (advertTravelPriceVersion == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(advertTravelPriceVersion.ordinal());
        }
        J3.d(parcel, this.f268419Z0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertItem(long j12, String str, String str2, String str3, String str4, boolean z12, UniversalColor universalColor, String str5, String str6, String str7, String str8, String str9, DiscountIcon discountIcon, PriceList priceList, String str10, boolean z13, DeliveryTerms deliveryTerms, String str11, String str12, String str13, String str14, String str15, String str16, String str17, long j13, DimmedImage dimmedImage, String str18, int i12, SerpViewType serpViewType, boolean z14, SerpDisplayType serpDisplayType, boolean z15, boolean z16, AdvertComparison advertComparison, Boolean bool, String str19, boolean z17, String str20, boolean z18, DeepLink deepLink, Map map, Map map2, String str21, List list, List list2, AdvertActions advertActions, Action action, String str22, PriceTypeBadge priceTypeBadge, SerpBadgeBar serpBadgeBar, AdvertItemActions advertItemActions, String str23, Integer num, List list3, QuorumFilterInfo quorumFilterInfo, RadiusInfo radiusInfo, AdvertSellerInfo advertSellerInfo, GigShiftInfo gigShiftInfo, boolean z19, boolean z22, String str24, List list4, String str25, String str26, boolean z23, Integer num2, String str27, boolean z24, AdvertisementVerticalAlias advertisementVerticalAlias, FavoritesToast favoritesToast, ShownItemsAbTestGroup shownItemsAbTestGroup, SerpAdvertSpecification serpAdvertSpecification, boolean z25, AttributedText attributedText, boolean z26, RealtorBonus realtorBonus, boolean z27, BadgeSticker badgeSticker, SnippetType snippetType, BuyWithDeliveryButton buyWithDeliveryButton, KeyAttributes keyAttributes, BuyerBonuses buyerBonuses, String str28, HotelRating hotelRating, GeoDistance geoDistance, UniversalColor universalColor2, UniversalColor universalColor3, UniversalColor universalColor4, boolean z28, boolean z29, String str29, int i13, String str30, RatingAndReviews ratingAndReviews, boolean z32, boolean z33, AdvertItemRedesignGroup advertItemRedesignGroup, boolean z34, boolean z35, TravelInstallments travelInstallments, AdvertTravelPriceVersion advertTravelPriceVersion, int i14, int i15, int i16, int i17, C42822w c42822w) {
        Integer numY0;
        String str31 = (i14 & 8) != 0 ? null : str3;
        String str32 = (i14 & 16) != 0 ? null : str4;
        UniversalColor universalColor5 = (i14 & 64) != 0 ? null : universalColor;
        String str33 = (i14 & 256) != 0 ? null : str6;
        String str34 = (i14 & 512) != 0 ? null : str7;
        String str35 = (i14 & 1024) != 0 ? null : str8;
        String str36 = (i14 & 2048) != 0 ? null : str9;
        DiscountIcon discountIcon2 = (i14 & 4096) != 0 ? null : discountIcon;
        PriceList priceList2 = (i14 & 8192) != 0 ? null : priceList;
        String str37 = (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str10;
        DeliveryTerms deliveryTerms2 = (i14 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : deliveryTerms;
        String str38 = (i14 & 131072) != 0 ? null : str11;
        String str39 = (i14 & 262144) != 0 ? null : str12;
        String str40 = (i14 & 524288) != 0 ? null : str13;
        String str41 = (i14 & 1048576) != 0 ? null : str14;
        String str42 = (i14 & 2097152) != 0 ? null : str15;
        String str43 = (i14 & 4194304) != 0 ? null : str16;
        String str44 = (i14 & 8388608) != 0 ? null : str17;
        DimmedImage dimmedImage2 = (i14 & 33554432) != 0 ? null : dimmedImage;
        String str45 = (i14 & 67108864) != 0 ? null : str18;
        boolean z36 = (i14 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? false : z15;
        boolean z37 = (i15 & 1) != 0 ? true : z16;
        AdvertComparison advertComparison2 = (i15 & 2) != 0 ? null : advertComparison;
        Boolean bool2 = (i15 & 4) != 0 ? null : bool;
        String str46 = (i15 & 8) != 0 ? null : str19;
        boolean z38 = (i15 & 16) != 0 ? false : z17;
        String str47 = (i15 & 32) != 0 ? null : str20;
        boolean z39 = (i15 & 64) != 0 ? false : z18;
        Map map3 = (i15 & 256) != 0 ? null : map;
        Map map4 = (i15 & 512) != 0 ? null : map2;
        String str48 = (i15 & 1024) != 0 ? null : str21;
        List list5 = (i15 & 2048) != 0 ? null : list;
        List list6 = (i15 & 4096) != 0 ? null : list2;
        AdvertActions advertActions2 = (i15 & 8192) != 0 ? null : advertActions;
        Action action2 = (i15 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : action;
        String str49 = (32768 & i15) != 0 ? null : str22;
        PriceTypeBadge priceTypeBadge2 = (i15 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : priceTypeBadge;
        SerpBadgeBar serpBadgeBar2 = (i15 & 131072) != 0 ? null : serpBadgeBar;
        AdvertItemActions advertItemActions2 = (i15 & 262144) != 0 ? null : advertItemActions;
        String str50 = (i15 & 524288) != 0 ? null : str23;
        if ((i15 & 1048576) != 0) {
            numY0 = str50 != null ? C43066x.y0(str50) : null;
        } else {
            numY0 = num;
        }
        this(j12, str, str2, str31, str32, z12, universalColor5, str5, str33, str34, str35, str36, discountIcon2, priceList2, str37, z13, deliveryTerms2, str38, str39, str40, str41, str42, str43, str44, j13, dimmedImage2, str45, i12, serpViewType, z14, serpDisplayType, z36, z37, advertComparison2, bool2, str46, z38, str47, z39, deepLink, map3, map4, str48, list5, list6, advertActions2, action2, str49, priceTypeBadge2, serpBadgeBar2, advertItemActions2, str50, numY0, (i15 & 2097152) != 0 ? null : list3, (i15 & 4194304) != 0 ? null : quorumFilterInfo, (i15 & 8388608) != 0 ? null : radiusInfo, (16777216 & i15) != 0 ? null : advertSellerInfo, (i15 & 33554432) != 0 ? null : gigShiftInfo, (67108864 & i15) != 0 ? false : z19, (134217728 & i15) != 0 ? false : z22, (268435456 & i15) != 0 ? null : str24, (536870912 & i15) != 0 ? null : list4, (1073741824 & i15) != 0 ? null : str25, (Integer.MIN_VALUE & i15) != 0 ? null : str26, (i16 & 1) != 0 ? false : z23, (i16 & 2) != 0 ? null : num2, (i16 & 4) != 0 ? null : str27, (i16 & 8) != 0 ? false : z24, (i16 & 16) != 0 ? null : advertisementVerticalAlias, (i16 & 32) != 0 ? null : favoritesToast, (i16 & 64) != 0 ? ShownItemsAbTestGroup.f271856b : shownItemsAbTestGroup, (i16 & 128) != 0 ? null : serpAdvertSpecification, (i16 & 256) != 0 ? false : z25, (i16 & 512) != 0 ? null : attributedText, (i16 & 1024) != 0 ? false : z26, (i16 & 2048) != 0 ? null : realtorBonus, (i16 & 4096) != 0 ? false : z27, (i16 & 8192) != 0 ? null : badgeSticker, (i16 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : snippetType, (32768 & i16) != 0 ? null : buyWithDeliveryButton, (i16 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : keyAttributes, (i16 & 131072) != 0 ? null : buyerBonuses, (i16 & 262144) != 0 ? null : str28, (i16 & 524288) != 0 ? null : hotelRating, (i16 & 1048576) != 0 ? null : geoDistance, (i16 & 2097152) != 0 ? null : universalColor2, (i16 & 4194304) != 0 ? null : universalColor3, (i16 & 8388608) != 0 ? null : universalColor4, (16777216 & i16) != 0 ? false : z28, (i16 & 33554432) != 0 ? false : z29, str29, i13, str30, (536870912 & i16) != 0 ? null : ratingAndReviews, (1073741824 & i16) != 0 ? false : z32, (Integer.MIN_VALUE & i16) != 0 ? false : z33, (i17 & 1) != 0 ? null : advertItemRedesignGroup, (i17 & 2) != 0 ? false : z34, (i17 & 4) != 0 ? false : z35, (i17 & 8) != 0 ? null : travelInstallments, (i17 & 16) != 0 ? null : advertTravelPriceVersion);
    }
}

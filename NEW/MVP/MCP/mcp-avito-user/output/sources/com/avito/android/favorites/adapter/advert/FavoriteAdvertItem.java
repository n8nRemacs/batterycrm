package com.avito.android.favorites.adapter.advert;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorites.adapter.FavoriteListItem;
import com.avito.android.remote.model.AdvertSellerInfo;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.remote.model.BuyWithDeliveryInFavorites;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.FavoriteAdvertActionButton;
import com.avito.android.remote.model.FavoritesToast;
import com.avito.android.remote.model.GeoDistance;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.KeyAttributes;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.StocksQuantity;
import com.avito.android.remote.model.autotekateaser.AutotekaLink;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.favorite_contacts.Contacts;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import com.avito.android.remote.model.snippet_type.SnippetType;
import com.avito.android.serp.adapter.L;
import com.avito.android.serp.adapter.m1;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: FavoriteAdvertItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorites/adapter/advert/FavoriteAdvertItem;", "Lcom/avito/android/favorites/adapter/FavoriteListItem;", "Lcom/avito/android/serp/adapter/L;", "Lcom/avito/android/serp/adapter/m1;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FavoriteAdvertItem implements FavoriteListItem, L, m1 {

    @Y61.k
    public static final Parcelable.Creator<FavoriteAdvertItem> CREATOR = new a();

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public final GeoDistance f156389A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public final KeyAttributes f156390B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public final SnippetType f156391C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public final AdvertSellerInfo f156392D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f156393E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f156394F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public final String f156395G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public final AdvertisementVerticalAlias f156396H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public final FavoritesToast f156397I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f156398J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public final SerpDisplayType f156399K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.l
    public final String f156400L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.l
    public final String f156401M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public final SerpBadgeBar f156402N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.l
    public final String f156403O;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f156404b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f156405c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f156406d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f156407e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f156408f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final DiscountIcon f156409g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Long f156410h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f156411i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Image f156412j;

    /* renamed from: k, reason: collision with root package name */
    public final int f156413k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f156414l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final DeepLink f156415m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final String f156416n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final String f156417o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final StocksQuantity f156418p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final Stepper f156419q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final BadgeSticker f156420r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final BuyWithDeliveryInFavorites f156421s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final AutotekaPurchaseAction f156422t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final AutotekaLink f156423u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final FavoriteAdvertActionButton f156424v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final RelatedProductsWithState f156425w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final Contacts f156426x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public final List<GeoReference> f156427y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public final String f156428z;

    /* compiled from: FavoriteAdvertItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FavoriteAdvertItem> {
        @Override // android.os.Parcelable.Creator
        public final FavoriteAdvertItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String str;
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            DiscountIcon discountIcon = (DiscountIcon) parcel.readParcelable(FavoriteAdvertItem.class.getClassLoader());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            boolean z12 = parcel.readInt() != 0;
            Image image = (Image) parcel.readParcelable(FavoriteAdvertItem.class.getClassLoader());
            int i12 = parcel.readInt();
            String string6 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(FavoriteAdvertItem.class.getClassLoader());
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            StocksQuantity stocksQuantity = (StocksQuantity) parcel.readParcelable(FavoriteAdvertItem.class.getClassLoader());
            Stepper stepper = (Stepper) parcel.readParcelable(FavoriteAdvertItem.class.getClassLoader());
            BadgeSticker badgeSticker = (BadgeSticker) parcel.readParcelable(FavoriteAdvertItem.class.getClassLoader());
            BuyWithDeliveryInFavorites buyWithDeliveryInFavorites = (BuyWithDeliveryInFavorites) parcel.readParcelable(FavoriteAdvertItem.class.getClassLoader());
            AutotekaPurchaseAction autotekaPurchaseAction = (AutotekaPurchaseAction) parcel.readParcelable(FavoriteAdvertItem.class.getClassLoader());
            AutotekaLink autotekaLink = (AutotekaLink) parcel.readParcelable(FavoriteAdvertItem.class.getClassLoader());
            FavoriteAdvertActionButton favoriteAdvertActionButton = (FavoriteAdvertActionButton) parcel.readParcelable(FavoriteAdvertItem.class.getClassLoader());
            RelatedProductsWithState relatedProductsWithStateCreateFromParcel = parcel.readInt() == 0 ? null : RelatedProductsWithState.CREATOR.createFromParcel(parcel);
            Contacts contacts = (Contacts) parcel.readParcelable(FavoriteAdvertItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(FavoriteAdvertItem.class, parcel, arrayList2, iL2, 1);
                    i13 = i13;
                }
                arrayList = arrayList2;
            }
            String string9 = parcel.readString();
            GeoDistance geoDistance = (GeoDistance) parcel.readParcelable(FavoriteAdvertItem.class.getClassLoader());
            KeyAttributes keyAttributes = (KeyAttributes) parcel.readParcelable(FavoriteAdvertItem.class.getClassLoader());
            SnippetType snippetType = (SnippetType) parcel.readParcelable(FavoriteAdvertItem.class.getClassLoader());
            AdvertSellerInfo advertSellerInfo = (AdvertSellerInfo) parcel.readParcelable(FavoriteAdvertItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                str = string6;
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                int iA2 = 0;
                while (iA2 != i14) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                    i14 = i14;
                    string6 = string6;
                }
                str = string6;
                linkedHashMap = linkedHashMap2;
            }
            return new FavoriteAdvertItem(string, string2, string3, string4, string5, discountIcon, lValueOf, z12, image, i12, str, deepLink, string7, string8, stocksQuantity, stepper, badgeSticker, buyWithDeliveryInFavorites, autotekaPurchaseAction, autotekaLink, favoriteAdvertActionButton, relatedProductsWithStateCreateFromParcel, contacts, arrayList, string9, geoDistance, keyAttributes, snippetType, advertSellerInfo, linkedHashMap, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : AdvertisementVerticalAlias.valueOf(parcel.readString()), (FavoritesToast) parcel.readParcelable(FavoriteAdvertItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : SerpDisplayType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (SerpBadgeBar) parcel.readParcelable(FavoriteAdvertItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FavoriteAdvertItem[] newArray(int i12) {
            return new FavoriteAdvertItem[i12];
        }
    }

    public FavoriteAdvertItem(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l DiscountIcon discountIcon, @Y61.l Long l12, boolean z12, @Y61.l Image image, int i12, @Y61.l String str6, @Y61.l DeepLink deepLink, @Y61.l String str7, @Y61.l String str8, @Y61.l StocksQuantity stocksQuantity, @Y61.l Stepper stepper, @Y61.l BadgeSticker badgeSticker, @Y61.l BuyWithDeliveryInFavorites buyWithDeliveryInFavorites, @Y61.l AutotekaPurchaseAction autotekaPurchaseAction, @Y61.l AutotekaLink autotekaLink, @Y61.l FavoriteAdvertActionButton favoriteAdvertActionButton, @Y61.l RelatedProductsWithState relatedProductsWithState, @Y61.l Contacts contacts, @Y61.l List<GeoReference> list, @Y61.l String str9, @Y61.l GeoDistance geoDistance, @Y61.l KeyAttributes keyAttributes, @Y61.l SnippetType snippetType, @Y61.l AdvertSellerInfo advertSellerInfo, @Y61.l Map<String, String> map, boolean z13, @Y61.l String str10, @Y61.l AdvertisementVerticalAlias advertisementVerticalAlias, @Y61.l FavoritesToast favoritesToast, boolean z14, @Y61.l SerpDisplayType serpDisplayType, @Y61.l String str11, @Y61.l String str12, @Y61.l SerpBadgeBar serpBadgeBar, @Y61.l String str13) {
        this.f156404b = str;
        this.f156405c = str2;
        this.f156406d = str3;
        this.f156407e = str4;
        this.f156408f = str5;
        this.f156409g = discountIcon;
        this.f156410h = l12;
        this.f156411i = z12;
        this.f156412j = image;
        this.f156413k = i12;
        this.f156414l = str6;
        this.f156415m = deepLink;
        this.f156416n = str7;
        this.f156417o = str8;
        this.f156418p = stocksQuantity;
        this.f156419q = stepper;
        this.f156420r = badgeSticker;
        this.f156421s = buyWithDeliveryInFavorites;
        this.f156422t = autotekaPurchaseAction;
        this.f156423u = autotekaLink;
        this.f156424v = favoriteAdvertActionButton;
        this.f156425w = relatedProductsWithState;
        this.f156426x = contacts;
        this.f156427y = list;
        this.f156428z = str9;
        this.f156389A = geoDistance;
        this.f156390B = keyAttributes;
        this.f156391C = snippetType;
        this.f156392D = advertSellerInfo;
        this.f156393E = map;
        this.f156394F = z13;
        this.f156395G = str10;
        this.f156396H = advertisementVerticalAlias;
        this.f156397I = favoritesToast;
        this.f156398J = z14;
        this.f156399K = serpDisplayType;
        this.f156400L = str11;
        this.f156401M = str12;
        this.f156402N = serpBadgeBar;
        this.f156403O = str13;
    }

    public static FavoriteAdvertItem a(FavoriteAdvertItem favoriteAdvertItem, Stepper stepper, RelatedProductsWithState relatedProductsWithState, int i12) {
        StocksQuantity stocksQuantity;
        Stepper stepper2;
        FavoriteAdvertActionButton favoriteAdvertActionButton;
        RelatedProductsWithState relatedProductsWithState2;
        String str = favoriteAdvertItem.f156404b;
        String str2 = favoriteAdvertItem.f156405c;
        String str3 = favoriteAdvertItem.f156406d;
        String str4 = favoriteAdvertItem.f156407e;
        String str5 = favoriteAdvertItem.f156408f;
        DiscountIcon discountIcon = favoriteAdvertItem.f156409g;
        Long l12 = favoriteAdvertItem.f156410h;
        boolean z12 = favoriteAdvertItem.f156411i;
        Image image = favoriteAdvertItem.f156412j;
        int i13 = favoriteAdvertItem.f156413k;
        String str6 = favoriteAdvertItem.f156414l;
        DeepLink deepLink = favoriteAdvertItem.f156415m;
        String str7 = favoriteAdvertItem.f156416n;
        String str8 = favoriteAdvertItem.f156417o;
        StocksQuantity stocksQuantity2 = favoriteAdvertItem.f156418p;
        if ((i12 & 32768) != 0) {
            stocksQuantity = stocksQuantity2;
            stepper2 = favoriteAdvertItem.f156419q;
        } else {
            stocksQuantity = stocksQuantity2;
            stepper2 = stepper;
        }
        BadgeSticker badgeSticker = favoriteAdvertItem.f156420r;
        BuyWithDeliveryInFavorites buyWithDeliveryInFavorites = favoriteAdvertItem.f156421s;
        AutotekaPurchaseAction autotekaPurchaseAction = favoriteAdvertItem.f156422t;
        AutotekaLink autotekaLink = favoriteAdvertItem.f156423u;
        FavoriteAdvertActionButton favoriteAdvertActionButton2 = favoriteAdvertItem.f156424v;
        if ((i12 & 2097152) != 0) {
            favoriteAdvertActionButton = favoriteAdvertActionButton2;
            relatedProductsWithState2 = favoriteAdvertItem.f156425w;
        } else {
            favoriteAdvertActionButton = favoriteAdvertActionButton2;
            relatedProductsWithState2 = relatedProductsWithState;
        }
        Contacts contacts = favoriteAdvertItem.f156426x;
        List<GeoReference> list = favoriteAdvertItem.f156427y;
        String str9 = favoriteAdvertItem.f156428z;
        GeoDistance geoDistance = favoriteAdvertItem.f156389A;
        KeyAttributes keyAttributes = favoriteAdvertItem.f156390B;
        SnippetType snippetType = favoriteAdvertItem.f156391C;
        AdvertSellerInfo advertSellerInfo = favoriteAdvertItem.f156392D;
        Map<String, String> map = favoriteAdvertItem.f156393E;
        boolean z13 = favoriteAdvertItem.f156394F;
        String str10 = favoriteAdvertItem.f156395G;
        AdvertisementVerticalAlias advertisementVerticalAlias = favoriteAdvertItem.f156396H;
        FavoritesToast favoritesToast = favoriteAdvertItem.f156397I;
        boolean z14 = favoriteAdvertItem.f156398J;
        SerpDisplayType serpDisplayType = favoriteAdvertItem.f156399K;
        String str11 = favoriteAdvertItem.f156400L;
        String str12 = favoriteAdvertItem.f156401M;
        SerpBadgeBar serpBadgeBar = favoriteAdvertItem.f156402N;
        String str13 = favoriteAdvertItem.f156403O;
        favoriteAdvertItem.getClass();
        return new FavoriteAdvertItem(str, str2, str3, str4, str5, discountIcon, l12, z12, image, i13, str6, deepLink, str7, str8, stocksQuantity, stepper2, badgeSticker, buyWithDeliveryInFavorites, autotekaPurchaseAction, autotekaLink, favoriteAdvertActionButton, relatedProductsWithState2, contacts, list, str9, geoDistance, keyAttributes, snippetType, advertSellerInfo, map, z13, str10, advertisementVerticalAlias, favoritesToast, z14, serpDisplayType, str11, str12, serpBadgeBar, str13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteAdvertItem)) {
            return false;
        }
        FavoriteAdvertItem favoriteAdvertItem = (FavoriteAdvertItem) obj;
        return kotlin.jvm.internal.L.f(this.f156404b, favoriteAdvertItem.f156404b) && kotlin.jvm.internal.L.f(this.f156405c, favoriteAdvertItem.f156405c) && kotlin.jvm.internal.L.f(this.f156406d, favoriteAdvertItem.f156406d) && kotlin.jvm.internal.L.f(this.f156407e, favoriteAdvertItem.f156407e) && kotlin.jvm.internal.L.f(this.f156408f, favoriteAdvertItem.f156408f) && kotlin.jvm.internal.L.f(this.f156409g, favoriteAdvertItem.f156409g) && kotlin.jvm.internal.L.f(this.f156410h, favoriteAdvertItem.f156410h) && this.f156411i == favoriteAdvertItem.f156411i && kotlin.jvm.internal.L.f(this.f156412j, favoriteAdvertItem.f156412j) && this.f156413k == favoriteAdvertItem.f156413k && kotlin.jvm.internal.L.f(this.f156414l, favoriteAdvertItem.f156414l) && kotlin.jvm.internal.L.f(this.f156415m, favoriteAdvertItem.f156415m) && kotlin.jvm.internal.L.f(this.f156416n, favoriteAdvertItem.f156416n) && kotlin.jvm.internal.L.f(this.f156417o, favoriteAdvertItem.f156417o) && kotlin.jvm.internal.L.f(this.f156418p, favoriteAdvertItem.f156418p) && kotlin.jvm.internal.L.f(this.f156419q, favoriteAdvertItem.f156419q) && kotlin.jvm.internal.L.f(this.f156420r, favoriteAdvertItem.f156420r) && kotlin.jvm.internal.L.f(this.f156421s, favoriteAdvertItem.f156421s) && kotlin.jvm.internal.L.f(this.f156422t, favoriteAdvertItem.f156422t) && kotlin.jvm.internal.L.f(this.f156423u, favoriteAdvertItem.f156423u) && kotlin.jvm.internal.L.f(this.f156424v, favoriteAdvertItem.f156424v) && kotlin.jvm.internal.L.f(this.f156425w, favoriteAdvertItem.f156425w) && kotlin.jvm.internal.L.f(this.f156426x, favoriteAdvertItem.f156426x) && kotlin.jvm.internal.L.f(this.f156427y, favoriteAdvertItem.f156427y) && kotlin.jvm.internal.L.f(this.f156428z, favoriteAdvertItem.f156428z) && kotlin.jvm.internal.L.f(this.f156389A, favoriteAdvertItem.f156389A) && kotlin.jvm.internal.L.f(this.f156390B, favoriteAdvertItem.f156390B) && this.f156391C == favoriteAdvertItem.f156391C && kotlin.jvm.internal.L.f(this.f156392D, favoriteAdvertItem.f156392D) && kotlin.jvm.internal.L.f(this.f156393E, favoriteAdvertItem.f156393E) && this.f156394F == favoriteAdvertItem.f156394F && kotlin.jvm.internal.L.f(this.f156395G, favoriteAdvertItem.f156395G) && this.f156396H == favoriteAdvertItem.f156396H && kotlin.jvm.internal.L.f(this.f156397I, favoriteAdvertItem.f156397I) && this.f156398J == favoriteAdvertItem.f156398J && this.f156399K == favoriteAdvertItem.f156399K && kotlin.jvm.internal.L.f(this.f156400L, favoriteAdvertItem.f156400L) && kotlin.jvm.internal.L.f(this.f156401M, favoriteAdvertItem.f156401M) && kotlin.jvm.internal.L.f(this.f156402N, favoriteAdvertItem.f156402N) && kotlin.jvm.internal.L.f(this.f156403O, favoriteAdvertItem.f156403O);
    }

    @Override // com.avito.android.serp.adapter.S
    @Y61.l
    /* renamed from: getAnalyticsContext, reason: from getter */
    public final String getF268388K() {
        return this.f156395G;
    }

    @Override // com.avito.android.serp.adapter.S
    @Y61.l
    /* renamed from: getFavoritesToast, reason: from getter */
    public final FavoritesToast getF268461s0() {
        return this.f156397I;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF128558g() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF128559h() {
        return this.f156404b;
    }

    @Override // com.avito.android.serp.adapter.S
    @Y61.l
    /* renamed from: getVerticalAlias, reason: from getter */
    public final AdvertisementVerticalAlias getF268459r0() {
        return this.f156396H;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f156404b.hashCode() * 31, 31, this.f156405c);
        String str = this.f156406d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f156407e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f156408f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DiscountIcon discountIcon = this.f156409g;
        int iHashCode4 = (iHashCode3 + (discountIcon == null ? 0 : discountIcon.hashCode())) * 31;
        Long l12 = this.f156410h;
        int i12 = androidx.appcompat.app.r.i((iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31, 31, this.f156411i);
        Image image = this.f156412j;
        int iE2 = androidx.appcompat.app.r.e(this.f156413k, (i12 + (image == null ? 0 : image.hashCode())) * 31, 31);
        String str4 = this.f156414l;
        int iHashCode5 = (iE2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DeepLink deepLink = this.f156415m;
        int iHashCode6 = (iHashCode5 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str5 = this.f156416n;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f156417o;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        StocksQuantity stocksQuantity = this.f156418p;
        int iHashCode9 = (iHashCode8 + (stocksQuantity == null ? 0 : stocksQuantity.hashCode())) * 31;
        Stepper stepper = this.f156419q;
        int iHashCode10 = (iHashCode9 + (stepper == null ? 0 : stepper.hashCode())) * 31;
        BadgeSticker badgeSticker = this.f156420r;
        int iHashCode11 = (iHashCode10 + (badgeSticker == null ? 0 : badgeSticker.hashCode())) * 31;
        BuyWithDeliveryInFavorites buyWithDeliveryInFavorites = this.f156421s;
        int iHashCode12 = (iHashCode11 + (buyWithDeliveryInFavorites == null ? 0 : buyWithDeliveryInFavorites.hashCode())) * 31;
        AutotekaPurchaseAction autotekaPurchaseAction = this.f156422t;
        int iHashCode13 = (iHashCode12 + (autotekaPurchaseAction == null ? 0 : autotekaPurchaseAction.hashCode())) * 31;
        AutotekaLink autotekaLink = this.f156423u;
        int iHashCode14 = (iHashCode13 + (autotekaLink == null ? 0 : autotekaLink.hashCode())) * 31;
        FavoriteAdvertActionButton favoriteAdvertActionButton = this.f156424v;
        int iHashCode15 = (iHashCode14 + (favoriteAdvertActionButton == null ? 0 : favoriteAdvertActionButton.hashCode())) * 31;
        RelatedProductsWithState relatedProductsWithState = this.f156425w;
        int iHashCode16 = (iHashCode15 + (relatedProductsWithState == null ? 0 : relatedProductsWithState.hashCode())) * 31;
        Contacts contacts = this.f156426x;
        int iHashCode17 = (iHashCode16 + (contacts == null ? 0 : contacts.hashCode())) * 31;
        List<GeoReference> list = this.f156427y;
        int iHashCode18 = (iHashCode17 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.f156428z;
        int iHashCode19 = (iHashCode18 + (str7 == null ? 0 : str7.hashCode())) * 31;
        GeoDistance geoDistance = this.f156389A;
        int iHashCode20 = (iHashCode19 + (geoDistance == null ? 0 : geoDistance.hashCode())) * 31;
        KeyAttributes keyAttributes = this.f156390B;
        int iHashCode21 = (iHashCode20 + (keyAttributes == null ? 0 : keyAttributes.hashCode())) * 31;
        SnippetType snippetType = this.f156391C;
        int iHashCode22 = (iHashCode21 + (snippetType == null ? 0 : snippetType.hashCode())) * 31;
        AdvertSellerInfo advertSellerInfo = this.f156392D;
        int iHashCode23 = (iHashCode22 + (advertSellerInfo == null ? 0 : advertSellerInfo.hashCode())) * 31;
        Map<String, String> map = this.f156393E;
        int i13 = androidx.appcompat.app.r.i((iHashCode23 + (map == null ? 0 : map.hashCode())) * 31, 31, this.f156394F);
        String str8 = this.f156395G;
        int iHashCode24 = (i13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        AdvertisementVerticalAlias advertisementVerticalAlias = this.f156396H;
        int iHashCode25 = (iHashCode24 + (advertisementVerticalAlias == null ? 0 : advertisementVerticalAlias.hashCode())) * 31;
        FavoritesToast favoritesToast = this.f156397I;
        int i14 = androidx.appcompat.app.r.i((iHashCode25 + (favoritesToast == null ? 0 : favoritesToast.hashCode())) * 31, 31, this.f156398J);
        SerpDisplayType serpDisplayType = this.f156399K;
        int iHashCode26 = (i14 + (serpDisplayType == null ? 0 : serpDisplayType.hashCode())) * 31;
        String str9 = this.f156400L;
        int iHashCode27 = (iHashCode26 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f156401M;
        int iHashCode28 = (iHashCode27 + (str10 == null ? 0 : str10.hashCode())) * 31;
        SerpBadgeBar serpBadgeBar = this.f156402N;
        int iHashCode29 = (iHashCode28 + (serpBadgeBar == null ? 0 : serpBadgeBar.hashCode())) * 31;
        String str11 = this.f156403O;
        return iHashCode29 + (str11 != null ? str11.hashCode() : 0);
    }

    @Override // com.avito.android.serp.adapter.S
    /* renamed from: isFavorite, reason: from getter */
    public final boolean getF268380G() {
        return this.f156394F;
    }

    @Override // com.avito.android.serp.adapter.m1
    /* renamed from: isViewed, reason: from getter */
    public final boolean getF268394N() {
        return this.f156398J;
    }

    @Override // com.avito.android.serp.adapter.S
    public final void setFavorite(boolean z12) {
        this.f156394F = z12;
    }

    @Override // com.avito.android.serp.adapter.m1
    public final void setViewed(boolean z12) {
        this.f156398J = z12;
    }

    @Override // com.avito.android.serp.adapter.L
    @Y61.l
    /* renamed from: t1 */
    public final Integer getF268423b0() {
        return Integer.valueOf(this.f156413k);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FavoriteAdvertItem(stringId=");
        sb2.append(this.f156404b);
        sb2.append(", title=");
        sb2.append(this.f156405c);
        sb2.append(", price=");
        sb2.append(this.f156406d);
        sb2.append(", previousPrice=");
        sb2.append(this.f156407e);
        sb2.append(", discountPercentage=");
        sb2.append(this.f156408f);
        sb2.append(", discountIcon=");
        sb2.append(this.f156409g);
        sb2.append(", time=");
        sb2.append(this.f156410h);
        sb2.append(", active=");
        sb2.append(this.f156411i);
        sb2.append(", image=");
        sb2.append(this.f156412j);
        sb2.append(", categoryId=");
        sb2.append(this.f156413k);
        sb2.append(", note=");
        sb2.append(this.f156414l);
        sb2.append(", deepLink=");
        sb2.append(this.f156415m);
        sb2.append(", address=");
        sb2.append(this.f156416n);
        sb2.append(", location=");
        sb2.append(this.f156417o);
        sb2.append(", stocksQuantity=");
        sb2.append(this.f156418p);
        sb2.append(", stepper=");
        sb2.append(this.f156419q);
        sb2.append(", badgeSticker=");
        sb2.append(this.f156420r);
        sb2.append(", buyWithDelivery=");
        sb2.append(this.f156421s);
        sb2.append(", autotekaPurchaseAction=");
        sb2.append(this.f156422t);
        sb2.append(", autotekaLink=");
        sb2.append(this.f156423u);
        sb2.append(", favoriteAdvertActionButton=");
        sb2.append(this.f156424v);
        sb2.append(", relatedProducts=");
        sb2.append(this.f156425w);
        sb2.append(", contacts=");
        sb2.append(this.f156426x);
        sb2.append(", geoReferences=");
        sb2.append(this.f156427y);
        sb2.append(", distance=");
        sb2.append(this.f156428z);
        sb2.append(", geoDistance=");
        sb2.append(this.f156389A);
        sb2.append(", keyAttributes=");
        sb2.append(this.f156390B);
        sb2.append(", snippetType=");
        sb2.append(this.f156391C);
        sb2.append(", sellerInfo=");
        sb2.append(this.f156392D);
        sb2.append(", analyticParams=");
        sb2.append(this.f156393E);
        sb2.append(", isFavorite=");
        sb2.append(this.f156394F);
        sb2.append(", analyticsContext=");
        sb2.append(this.f156395G);
        sb2.append(", verticalAlias=");
        sb2.append(this.f156396H);
        sb2.append(", favoritesToast=");
        sb2.append(this.f156397I);
        sb2.append(", isViewed=");
        sb2.append(this.f156398J);
        sb2.append(", displayType=");
        sb2.append(this.f156399K);
        sb2.append(", fromNetworkLocation=");
        sb2.append(this.f156400L);
        sb2.append(", xHash=");
        sb2.append(this.f156401M);
        sb2.append(", badgeBar=");
        sb2.append(this.f156402N);
        sb2.append(", jobAggregationDisclaimer=");
        return C22026a.c(sb2, this.f156403O, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f156404b);
        parcel.writeString(this.f156405c);
        parcel.writeString(this.f156406d);
        parcel.writeString(this.f156407e);
        parcel.writeString(this.f156408f);
        parcel.writeParcelable(this.f156409g, i12);
        Long l12 = this.f156410h;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeInt(this.f156411i ? 1 : 0);
        parcel.writeParcelable(this.f156412j, i12);
        parcel.writeInt(this.f156413k);
        parcel.writeString(this.f156414l);
        parcel.writeParcelable(this.f156415m, i12);
        parcel.writeString(this.f156416n);
        parcel.writeString(this.f156417o);
        parcel.writeParcelable(this.f156418p, i12);
        parcel.writeParcelable(this.f156419q, i12);
        parcel.writeParcelable(this.f156420r, i12);
        parcel.writeParcelable(this.f156421s, i12);
        parcel.writeParcelable(this.f156422t, i12);
        parcel.writeParcelable(this.f156423u, i12);
        parcel.writeParcelable(this.f156424v, i12);
        RelatedProductsWithState relatedProductsWithState = this.f156425w;
        if (relatedProductsWithState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            relatedProductsWithState.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f156426x, i12);
        List<GeoReference> list = this.f156427y;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeString(this.f156428z);
        parcel.writeParcelable(this.f156389A, i12);
        parcel.writeParcelable(this.f156390B, i12);
        parcel.writeParcelable(this.f156391C, i12);
        parcel.writeParcelable(this.f156392D, i12);
        Map<String, String> map = this.f156393E;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeInt(this.f156394F ? 1 : 0);
        parcel.writeString(this.f156395G);
        AdvertisementVerticalAlias advertisementVerticalAlias = this.f156396H;
        if (advertisementVerticalAlias == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(advertisementVerticalAlias.name());
        }
        parcel.writeParcelable(this.f156397I, i12);
        parcel.writeInt(this.f156398J ? 1 : 0);
        SerpDisplayType serpDisplayType = this.f156399K;
        if (serpDisplayType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(serpDisplayType.name());
        }
        parcel.writeString(this.f156400L);
        parcel.writeString(this.f156401M);
        parcel.writeParcelable(this.f156402N, i12);
        parcel.writeString(this.f156403O);
    }

    public /* synthetic */ FavoriteAdvertItem(String str, String str2, String str3, String str4, String str5, DiscountIcon discountIcon, Long l12, boolean z12, Image image, int i12, String str6, DeepLink deepLink, String str7, String str8, StocksQuantity stocksQuantity, Stepper stepper, BadgeSticker badgeSticker, BuyWithDeliveryInFavorites buyWithDeliveryInFavorites, AutotekaPurchaseAction autotekaPurchaseAction, AutotekaLink autotekaLink, FavoriteAdvertActionButton favoriteAdvertActionButton, RelatedProductsWithState relatedProductsWithState, Contacts contacts, List list, String str9, GeoDistance geoDistance, KeyAttributes keyAttributes, SnippetType snippetType, AdvertSellerInfo advertSellerInfo, Map map, boolean z13, String str10, AdvertisementVerticalAlias advertisementVerticalAlias, FavoritesToast favoritesToast, boolean z14, SerpDisplayType serpDisplayType, String str11, String str12, SerpBadgeBar serpBadgeBar, String str13, int i13, int i14, C42822w c42822w) {
        this(str, str2, str3, str4, str5, discountIcon, l12, z12, image, i12, str6, deepLink, str7, str8, stocksQuantity, stepper, badgeSticker, buyWithDeliveryInFavorites, autotekaPurchaseAction, autotekaLink, favoriteAdvertActionButton, relatedProductsWithState, contacts, (i13 & 8388608) != 0 ? null : list, (i13 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str9, (i13 & 33554432) != 0 ? null : geoDistance, (i13 & 67108864) != 0 ? null : keyAttributes, (i13 & 134217728) != 0 ? null : snippetType, (i13 & 268435456) != 0 ? null : advertSellerInfo, (i13 & 536870912) != 0 ? null : map, (i13 & 1073741824) != 0 ? true : z13, (i13 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : str10, (i14 & 1) != 0 ? null : advertisementVerticalAlias, (i14 & 2) != 0 ? null : favoritesToast, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? null : serpDisplayType, (i14 & 16) != 0 ? null : str11, (i14 & 32) != 0 ? null : str12, (i14 & 64) != 0 ? null : serpBadgeBar, (i14 & 128) != 0 ? null : str13);
    }
}

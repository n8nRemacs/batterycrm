package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: AdvertSellerInfo.kt */
@d
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B³\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001eJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0018\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b/\u0010.J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\u001eJ\u0012\u00101\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\u001eJÐ\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b6\u0010\u001eJ\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020\b2\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u000207HÖ\u0001¢\u0006\u0004\b>\u00109J \u0010C\u001a\u00020B2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u000207HÖ\u0001¢\u0006\u0004\bC\u0010DR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010E\u001a\u0004\bF\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010E\u001a\u0004\bG\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bH\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010I\u001a\u0004\bJ\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010K\u001a\u0004\b\t\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010K\u001a\u0004\b\n\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010L\u001a\u0004\bM\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010N\u001a\u0004\bO\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bP\u0010\u001eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010Q\u001a\u0004\bR\u0010,R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010S\u001a\u0004\bT\u0010.R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010S\u001a\u0004\bU\u0010.R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010E\u001a\u0004\bV\u0010\u001eR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010W\u001a\u0004\bX\u00102R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010E\u001a\u0004\bY\u0010\u001e¨\u0006Z"}, d2 = {"Lcom/avito/android/remote/model/AdvertSellerInfo;", "Landroid/os/Parcelable;", "", "name", "userKey", "sellerTypeName", "Lcom/avito/android/remote/model/Image;", "image", "", "isShop", "isBrandSpace", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "Lcom/avito/android/remote/model/SellerRating;", "rating", "date", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR, "", "Lcom/avito/android/remote/model/SellerInfoInlineAdvantage;", "inlineAdvantages", "Lcom/avito/android/remote/model/SellerInfoAdvantage;", "advantages", "displayName", "Lcom/avito/android/remote/model/SellerOnlineStatus;", "onlineStatus", "servicesType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/SellerRating;Ljava/lang/String;Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/SellerOnlineStatus;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/Image;", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component8", "()Lcom/avito/android/remote/model/SellerRating;", "component9", "component10", "()Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", "component11", "()Ljava/util/List;", "component12", "component13", "component14", "()Lcom/avito/android/remote/model/SellerOnlineStatus;", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/SellerRating;Ljava/lang/String;Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/SellerOnlineStatus;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertSellerInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getUserKey", "getSellerTypeName", "Lcom/avito/android/remote/model/Image;", "getImage", "Ljava/lang/Boolean;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getLink", "Lcom/avito/android/remote/model/SellerRating;", "getRating", "getDate", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", "getBadgeBar", "Ljava/util/List;", "getInlineAdvantages", "getAdvantages", "getDisplayName", "Lcom/avito/android/remote/model/SellerOnlineStatus;", "getOnlineStatus", "getServicesType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertSellerInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertSellerInfo> CREATOR = new Creator();

    @c("advantages")
    @l
    private final List<SellerInfoAdvantage> advantages;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR)
    @l
    private final SerpBadgeBar badgeBar;

    @c("date")
    @l
    private final String date;

    @c("displayName")
    @l
    private final String displayName;

    @c("logo")
    @l
    private final Image image;

    @c("inlineAdvantages")
    @l
    private final List<SellerInfoInlineAdvantage> inlineAdvantages;

    @c("isBrandspace")
    @l
    private final Boolean isBrandSpace;

    @c("isShop")
    @l
    private final Boolean isShop;

    @c("link")
    @l
    private final DeepLink link;

    @c("name")
    @l
    private final String name;

    @c("onlineStatus")
    @l
    private final SellerOnlineStatus onlineStatus;

    @c("rating")
    @l
    private final SellerRating rating;

    @c("sellerTypeName")
    @l
    private final String sellerTypeName;

    @c("servicesSellerTypeName")
    @l
    private final String servicesType;

    @c("userKey")
    @l
    private final String userKey;

    /* compiled from: AdvertSellerInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertSellerInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertSellerInfo createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Image image = (Image) parcel.readParcelable(AdvertSellerInfo.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            DeepLink deepLink = (DeepLink) parcel.readParcelable(AdvertSellerInfo.class.getClassLoader());
            SellerRating sellerRatingCreateFromParcel = parcel.readInt() == 0 ? null : SellerRating.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            SerpBadgeBar serpBadgeBarCreateFromParcel = parcel.readInt() == 0 ? null : SerpBadgeBar.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(SellerInfoInlineAdvantage.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = a.c(SellerInfoAdvantage.CREATOR, parcel, arrayList3, iC3, 1);
                    i13 = i13;
                }
                arrayList2 = arrayList3;
            }
            return new AdvertSellerInfo(string, string2, string3, image, boolValueOf, boolValueOf2, deepLink, sellerRatingCreateFromParcel, string4, serpBadgeBarCreateFromParcel, arrayList, arrayList2, parcel.readString(), parcel.readInt() == 0 ? null : SellerOnlineStatus.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertSellerInfo[] newArray(int i12) {
            return new AdvertSellerInfo[i12];
        }
    }

    public AdvertSellerInfo(@l String str, @l String str2, @l String str3, @l Image image, @l Boolean bool, @l Boolean bool2, @l DeepLink deepLink, @l SellerRating sellerRating, @l String str4, @l SerpBadgeBar serpBadgeBar, @l List<SellerInfoInlineAdvantage> list, @l List<SellerInfoAdvantage> list2, @l String str5, @l SellerOnlineStatus sellerOnlineStatus, @l String str6) {
        this.name = str;
        this.userKey = str2;
        this.sellerTypeName = str3;
        this.image = image;
        this.isShop = bool;
        this.isBrandSpace = bool2;
        this.link = deepLink;
        this.rating = sellerRating;
        this.date = str4;
        this.badgeBar = serpBadgeBar;
        this.inlineAdvantages = list;
        this.advantages = list2;
        this.displayName = str5;
        this.onlineStatus = sellerOnlineStatus;
        this.servicesType = str6;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final SerpBadgeBar getBadgeBar() {
        return this.badgeBar;
    }

    @l
    public final List<SellerInfoInlineAdvantage> component11() {
        return this.inlineAdvantages;
    }

    @l
    public final List<SellerInfoAdvantage> component12() {
        return this.advantages;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final SellerOnlineStatus getOnlineStatus() {
        return this.onlineStatus;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final String getServicesType() {
        return this.servicesType;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getUserKey() {
        return this.userKey;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getSellerTypeName() {
        return this.sellerTypeName;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getIsShop() {
        return this.isShop;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getIsBrandSpace() {
        return this.isBrandSpace;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final DeepLink getLink() {
        return this.link;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final SellerRating getRating() {
        return this.rating;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @k
    public final AdvertSellerInfo copy(@l String name, @l String userKey, @l String sellerTypeName, @l Image image, @l Boolean isShop, @l Boolean isBrandSpace, @l DeepLink link, @l SellerRating rating, @l String date, @l SerpBadgeBar badgeBar, @l List<SellerInfoInlineAdvantage> inlineAdvantages, @l List<SellerInfoAdvantage> advantages, @l String displayName, @l SellerOnlineStatus onlineStatus, @l String servicesType) {
        return new AdvertSellerInfo(name, userKey, sellerTypeName, image, isShop, isBrandSpace, link, rating, date, badgeBar, inlineAdvantages, advantages, displayName, onlineStatus, servicesType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertSellerInfo)) {
            return false;
        }
        AdvertSellerInfo advertSellerInfo = (AdvertSellerInfo) other;
        return L.f(this.name, advertSellerInfo.name) && L.f(this.userKey, advertSellerInfo.userKey) && L.f(this.sellerTypeName, advertSellerInfo.sellerTypeName) && L.f(this.image, advertSellerInfo.image) && L.f(this.isShop, advertSellerInfo.isShop) && L.f(this.isBrandSpace, advertSellerInfo.isBrandSpace) && L.f(this.link, advertSellerInfo.link) && L.f(this.rating, advertSellerInfo.rating) && L.f(this.date, advertSellerInfo.date) && L.f(this.badgeBar, advertSellerInfo.badgeBar) && L.f(this.inlineAdvantages, advertSellerInfo.inlineAdvantages) && L.f(this.advantages, advertSellerInfo.advantages) && L.f(this.displayName, advertSellerInfo.displayName) && L.f(this.onlineStatus, advertSellerInfo.onlineStatus) && L.f(this.servicesType, advertSellerInfo.servicesType);
    }

    @l
    public final List<SellerInfoAdvantage> getAdvantages() {
        return this.advantages;
    }

    @l
    public final SerpBadgeBar getBadgeBar() {
        return this.badgeBar;
    }

    @l
    public final String getDate() {
        return this.date;
    }

    @l
    public final String getDisplayName() {
        return this.displayName;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @l
    public final List<SellerInfoInlineAdvantage> getInlineAdvantages() {
        return this.inlineAdvantages;
    }

    @l
    public final DeepLink getLink() {
        return this.link;
    }

    @l
    public final String getName() {
        return this.name;
    }

    @l
    public final SellerOnlineStatus getOnlineStatus() {
        return this.onlineStatus;
    }

    @l
    public final SellerRating getRating() {
        return this.rating;
    }

    @l
    public final String getSellerTypeName() {
        return this.sellerTypeName;
    }

    @l
    public final String getServicesType() {
        return this.servicesType;
    }

    @l
    public final String getUserKey() {
        return this.userKey;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sellerTypeName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Image image = this.image;
        int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        Boolean bool = this.isShop;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isBrandSpace;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        DeepLink deepLink = this.link;
        int iHashCode7 = (iHashCode6 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        SellerRating sellerRating = this.rating;
        int iHashCode8 = (iHashCode7 + (sellerRating == null ? 0 : sellerRating.hashCode())) * 31;
        String str4 = this.date;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SerpBadgeBar serpBadgeBar = this.badgeBar;
        int iHashCode10 = (iHashCode9 + (serpBadgeBar == null ? 0 : serpBadgeBar.hashCode())) * 31;
        List<SellerInfoInlineAdvantage> list = this.inlineAdvantages;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        List<SellerInfoAdvantage> list2 = this.advantages;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.displayName;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        SellerOnlineStatus sellerOnlineStatus = this.onlineStatus;
        int iHashCode14 = (iHashCode13 + (sellerOnlineStatus == null ? 0 : sellerOnlineStatus.hashCode())) * 31;
        String str6 = this.servicesType;
        return iHashCode14 + (str6 != null ? str6.hashCode() : 0);
    }

    @l
    public final Boolean isBrandSpace() {
        return this.isBrandSpace;
    }

    @l
    public final Boolean isShop() {
        return this.isShop;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertSellerInfo(name=");
        sb2.append(this.name);
        sb2.append(", userKey=");
        sb2.append(this.userKey);
        sb2.append(", sellerTypeName=");
        sb2.append(this.sellerTypeName);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", isShop=");
        sb2.append(this.isShop);
        sb2.append(", isBrandSpace=");
        sb2.append(this.isBrandSpace);
        sb2.append(", link=");
        sb2.append(this.link);
        sb2.append(", rating=");
        sb2.append(this.rating);
        sb2.append(", date=");
        sb2.append(this.date);
        sb2.append(", badgeBar=");
        sb2.append(this.badgeBar);
        sb2.append(", inlineAdvantages=");
        sb2.append(this.inlineAdvantages);
        sb2.append(", advantages=");
        sb2.append(this.advantages);
        sb2.append(", displayName=");
        sb2.append(this.displayName);
        sb2.append(", onlineStatus=");
        sb2.append(this.onlineStatus);
        sb2.append(", servicesType=");
        return C22026a.c(sb2, this.servicesType, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.name);
        parcel.writeString(this.userKey);
        parcel.writeString(this.sellerTypeName);
        parcel.writeParcelable(this.image, flags);
        Boolean bool = this.isShop;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.isBrandSpace;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeParcelable(this.link, flags);
        SellerRating sellerRating = this.rating;
        if (sellerRating == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellerRating.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.date);
        SerpBadgeBar serpBadgeBar = this.badgeBar;
        if (serpBadgeBar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serpBadgeBar.writeToParcel(parcel, flags);
        }
        List<SellerInfoInlineAdvantage> list = this.inlineAdvantages;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((SellerInfoInlineAdvantage) itA.next()).writeToParcel(parcel, flags);
            }
        }
        List<SellerInfoAdvantage> list2 = this.advantages;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((SellerInfoAdvantage) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.displayName);
        SellerOnlineStatus sellerOnlineStatus = this.onlineStatus;
        if (sellerOnlineStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellerOnlineStatus.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.servicesType);
    }

    public /* synthetic */ AdvertSellerInfo(String str, String str2, String str3, Image image, Boolean bool, Boolean bool2, DeepLink deepLink, SellerRating sellerRating, String str4, SerpBadgeBar serpBadgeBar, List list, List list2, String str5, SellerOnlineStatus sellerOnlineStatus, String str6, int i12, C42822w c42822w) {
        this(str, str2, str3, image, bool, bool2, deepLink, sellerRating, str4, serpBadgeBar, (i12 & 1024) != 0 ? null : list, (i12 & 2048) != 0 ? null : list2, (i12 & 4096) != 0 ? null : str5, (i12 & 8192) != 0 ? null : sellerOnlineStatus, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str6);
    }
}

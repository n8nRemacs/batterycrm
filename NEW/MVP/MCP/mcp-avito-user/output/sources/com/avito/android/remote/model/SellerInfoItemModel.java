package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ConstructorAdvertGalleryItemModel.kt */
@d
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001Bw\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b\"\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b#\u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b\t\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b\n\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b/\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lcom/avito/android/remote/model/SellerInfoItemModel;", "Lcom/avito/android/remote/model/ConstructorAdvertGalleryItemModel;", "", "name", "userKey", "sellerTypeName", "Lcom/avito/android/remote/model/Image;", "image", "", "isShop", "isBrandSpace", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "Lcom/avito/android/remote/model/SellerRating;", "rating", "date", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR, "Lcom/avito/android/remote/model/GalleryItemConfigModel;", Navigation.CONFIG, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/SellerRating;Ljava/lang/String;Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;Lcom/avito/android/remote/model/GalleryItemConfigModel;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getUserKey", "getSellerTypeName", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/SellerRating;", "getRating", "()Lcom/avito/android/remote/model/SellerRating;", "getDate", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", "getBadgeBar", "()Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", "Lcom/avito/android/remote/model/GalleryItemConfigModel;", "getConfig", "()Lcom/avito/android/remote/model/GalleryItemConfigModel;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SellerInfoItemModel implements ConstructorAdvertGalleryItemModel {

    @k
    public static final Parcelable.Creator<SellerInfoItemModel> CREATOR = new Creator();

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR)
    @l
    private final SerpBadgeBar badgeBar;

    @c(Navigation.CONFIG)
    @l
    private final GalleryItemConfigModel config;

    @c("date")
    @l
    private final String date;

    @c("logo")
    @l
    private final Image image;

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

    @c("rating")
    @l
    private final SellerRating rating;

    @c("sellerTypeName")
    @l
    private final String sellerTypeName;

    @c("userKey")
    @l
    private final String userKey;

    /* compiled from: ConstructorAdvertGalleryItemModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SellerInfoItemModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SellerInfoItemModel createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Image image = (Image) parcel.readParcelable(SellerInfoItemModel.class.getClassLoader());
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
            return new SellerInfoItemModel(string, string2, string3, image, boolValueOf, boolValueOf2, (DeepLink) parcel.readParcelable(SellerInfoItemModel.class.getClassLoader()), parcel.readInt() == 0 ? null : SellerRating.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : SerpBadgeBar.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GalleryItemConfigModel.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SellerInfoItemModel[] newArray(int i12) {
            return new SellerInfoItemModel[i12];
        }
    }

    public SellerInfoItemModel(@l String str, @l String str2, @l String str3, @l Image image, @l Boolean bool, @l Boolean bool2, @l DeepLink deepLink, @l SellerRating sellerRating, @l String str4, @l SerpBadgeBar serpBadgeBar, @l GalleryItemConfigModel galleryItemConfigModel) {
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
        this.config = galleryItemConfigModel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final SerpBadgeBar getBadgeBar() {
        return this.badgeBar;
    }

    @l
    public final GalleryItemConfigModel getConfig() {
        return this.config;
    }

    @l
    public final String getDate() {
        return this.date;
    }

    @l
    public final Image getImage() {
        return this.image;
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
    public final SellerRating getRating() {
        return this.rating;
    }

    @l
    public final String getSellerTypeName() {
        return this.sellerTypeName;
    }

    @l
    public final String getUserKey() {
        return this.userKey;
    }

    @l
    /* renamed from: isBrandSpace, reason: from getter */
    public final Boolean getIsBrandSpace() {
        return this.isBrandSpace;
    }

    @l
    /* renamed from: isShop, reason: from getter */
    public final Boolean getIsShop() {
        return this.isShop;
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
        GalleryItemConfigModel galleryItemConfigModel = this.config;
        if (galleryItemConfigModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            galleryItemConfigModel.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ SellerInfoItemModel(String str, String str2, String str3, Image image, Boolean bool, Boolean bool2, DeepLink deepLink, SellerRating sellerRating, String str4, SerpBadgeBar serpBadgeBar, GalleryItemConfigModel galleryItemConfigModel, int i12, C42822w c42822w) {
        this(str, str2, str3, image, bool, bool2, deepLink, sellerRating, str4, serpBadgeBar, (i12 & 1024) != 0 ? null : galleryItemConfigModel);
    }
}

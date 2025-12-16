package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComfortableDealItem.kt */
@d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0011J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ`\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b'\u0010!J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b6\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b7\u0010\u0011R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010\u001b¨\u0006:"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/Banner;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/deep_linking/links/DeepLink;", "onShowDeeplink", "Lcom/avito/android/remote/model/Image;", "itemImage", "badgeImage", "badgeFallback", "Lcom/avito/android/remote/model/user_profile/items/BannerPayload;", "bannerPayload", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/remote/model/user_profile/items/BannerPayload;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "()Lcom/avito/android/remote/model/Image;", "component5", "component6", "component7", "()Lcom/avito/android/remote/model/user_profile/items/BannerPayload;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/remote/model/user_profile/items/BannerPayload;)Lcom/avito/android/remote/model/user_profile/items/Banner;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnShowDeeplink", "Lcom/avito/android/remote/model/Image;", "getItemImage", "getBadgeImage", "getBadgeFallback", "Lcom/avito/android/remote/model/user_profile/items/BannerPayload;", "getBannerPayload", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Banner implements Parcelable {

    @k
    public static final Parcelable.Creator<Banner> CREATOR = new Creator();

    @c("badgeFallback")
    @l
    private final String badgeFallback;

    @c("badgeImage")
    @l
    private final Image badgeImage;

    @c("bannerPayload")
    @l
    private final BannerPayload bannerPayload;

    @c("description")
    @k
    private final AttributedText description;

    @c("image")
    @l
    private final Image itemImage;

    @c("onShowDeeplink")
    @l
    private final DeepLink onShowDeeplink;

    @c("title")
    @k
    private final String title;

    /* compiled from: ComfortableDealItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Banner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Banner createFromParcel(@k Parcel parcel) {
            return new Banner(parcel.readString(), (AttributedText) parcel.readParcelable(Banner.class.getClassLoader()), (DeepLink) parcel.readParcelable(Banner.class.getClassLoader()), (Image) parcel.readParcelable(Banner.class.getClassLoader()), (Image) parcel.readParcelable(Banner.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : BannerPayload.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Banner[] newArray(int i12) {
            return new Banner[i12];
        }
    }

    public Banner(@k String str, @k AttributedText attributedText, @l DeepLink deepLink, @l Image image, @l Image image2, @l String str2, @l BannerPayload bannerPayload) {
        this.title = str;
        this.description = attributedText;
        this.onShowDeeplink = deepLink;
        this.itemImage = image;
        this.badgeImage = image2;
        this.badgeFallback = str2;
        this.bannerPayload = bannerPayload;
    }

    public static /* synthetic */ Banner copy$default(Banner banner, String str, AttributedText attributedText, DeepLink deepLink, Image image, Image image2, String str2, BannerPayload bannerPayload, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = banner.title;
        }
        if ((i12 & 2) != 0) {
            attributedText = banner.description;
        }
        AttributedText attributedText2 = attributedText;
        if ((i12 & 4) != 0) {
            deepLink = banner.onShowDeeplink;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 8) != 0) {
            image = banner.itemImage;
        }
        Image image3 = image;
        if ((i12 & 16) != 0) {
            image2 = banner.badgeImage;
        }
        Image image4 = image2;
        if ((i12 & 32) != 0) {
            str2 = banner.badgeFallback;
        }
        String str3 = str2;
        if ((i12 & 64) != 0) {
            bannerPayload = banner.bannerPayload;
        }
        return banner.copy(str, attributedText2, deepLink2, image3, image4, str3, bannerPayload);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final DeepLink getOnShowDeeplink() {
        return this.onShowDeeplink;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Image getItemImage() {
        return this.itemImage;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Image getBadgeImage() {
        return this.badgeImage;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getBadgeFallback() {
        return this.badgeFallback;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final BannerPayload getBannerPayload() {
        return this.bannerPayload;
    }

    @k
    public final Banner copy(@k String title, @k AttributedText description, @l DeepLink onShowDeeplink, @l Image itemImage, @l Image badgeImage, @l String badgeFallback, @l BannerPayload bannerPayload) {
        return new Banner(title, description, onShowDeeplink, itemImage, badgeImage, badgeFallback, bannerPayload);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Banner)) {
            return false;
        }
        Banner banner = (Banner) other;
        return L.f(this.title, banner.title) && L.f(this.description, banner.description) && L.f(this.onShowDeeplink, banner.onShowDeeplink) && L.f(this.itemImage, banner.itemImage) && L.f(this.badgeImage, banner.badgeImage) && L.f(this.badgeFallback, banner.badgeFallback) && L.f(this.bannerPayload, banner.bannerPayload);
    }

    @l
    public final String getBadgeFallback() {
        return this.badgeFallback;
    }

    @l
    public final Image getBadgeImage() {
        return this.badgeImage;
    }

    @l
    public final BannerPayload getBannerPayload() {
        return this.bannerPayload;
    }

    @k
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final Image getItemImage() {
        return this.itemImage;
    }

    @l
    public final DeepLink getOnShowDeeplink() {
        return this.onShowDeeplink;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iB2 = a.b(this.title.hashCode() * 31, 31, this.description);
        DeepLink deepLink = this.onShowDeeplink;
        int iHashCode = (iB2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        Image image = this.itemImage;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.badgeImage;
        int iHashCode3 = (iHashCode2 + (image2 == null ? 0 : image2.hashCode())) * 31;
        String str = this.badgeFallback;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        BannerPayload bannerPayload = this.bannerPayload;
        return iHashCode4 + (bannerPayload != null ? bannerPayload.hashCode() : 0);
    }

    @k
    public String toString() {
        return "Banner(title=" + this.title + ", description=" + this.description + ", onShowDeeplink=" + this.onShowDeeplink + ", itemImage=" + this.itemImage + ", badgeImage=" + this.badgeImage + ", badgeFallback=" + this.badgeFallback + ", bannerPayload=" + this.bannerPayload + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.description, flags);
        parcel.writeParcelable(this.onShowDeeplink, flags);
        parcel.writeParcelable(this.itemImage, flags);
        parcel.writeParcelable(this.badgeImage, flags);
        parcel.writeString(this.badgeFallback);
        BannerPayload bannerPayload = this.bannerPayload;
        if (bannerPayload == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bannerPayload.writeToParcel(parcel, flags);
        }
    }
}

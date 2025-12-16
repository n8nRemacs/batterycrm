package com.avito.android.remote.model.user_adverts.auction;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AuctionBanner.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b#\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b*\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/user_adverts/auction/AuctionBanner;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/UniversalColor;", "titleColor", "description", "descriptionColor", "Lcom/avito/android/remote/model/user_adverts/auction/AuctionBannerBadge;", "badge", "Lcom/avito/android/remote/model/UniversalImage;", "icon", "backgroundColor", "Lcom/avito/android/remote/model/user_adverts/auction/AuctionButton;", "button", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/user_adverts/auction/AuctionBannerBadge;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/user_adverts/auction/AuctionButton;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/UniversalColor;", "getTitleColor", "()Lcom/avito/android/remote/model/UniversalColor;", "getDescription", "getDescriptionColor", "Lcom/avito/android/remote/model/user_adverts/auction/AuctionBannerBadge;", "getBadge", "()Lcom/avito/android/remote/model/user_adverts/auction/AuctionBannerBadge;", "Lcom/avito/android/remote/model/UniversalImage;", "getIcon", "()Lcom/avito/android/remote/model/UniversalImage;", "getBackgroundColor", "Lcom/avito/android/remote/model/user_adverts/auction/AuctionButton;", "getButton", "()Lcom/avito/android/remote/model/user_adverts/auction/AuctionButton;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AuctionBanner implements Parcelable {

    @k
    public static final Parcelable.Creator<AuctionBanner> CREATOR = new Creator();

    @c("backgroundColor")
    @l
    private final UniversalColor backgroundColor;

    @c("badge")
    @l
    private final AuctionBannerBadge badge;

    @c("button")
    @l
    private final AuctionButton button;

    @c(ContextActionHandler.Link.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("description")
    @l
    private final String description;

    @c("descriptionColor")
    @l
    private final UniversalColor descriptionColor;

    @c("icon")
    @l
    private final UniversalImage icon;

    @c("title")
    @l
    private final String title;

    @c("titleColor")
    @l
    private final UniversalColor titleColor;

    /* compiled from: AuctionBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AuctionBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AuctionBanner createFromParcel(@k Parcel parcel) {
            return new AuctionBanner(parcel.readString(), (UniversalColor) parcel.readParcelable(AuctionBanner.class.getClassLoader()), parcel.readString(), (UniversalColor) parcel.readParcelable(AuctionBanner.class.getClassLoader()), parcel.readInt() == 0 ? null : AuctionBannerBadge.CREATOR.createFromParcel(parcel), (UniversalImage) parcel.readParcelable(AuctionBanner.class.getClassLoader()), (UniversalColor) parcel.readParcelable(AuctionBanner.class.getClassLoader()), parcel.readInt() != 0 ? AuctionButton.CREATOR.createFromParcel(parcel) : null, (DeepLink) parcel.readParcelable(AuctionBanner.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AuctionBanner[] newArray(int i12) {
            return new AuctionBanner[i12];
        }
    }

    public AuctionBanner() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final AuctionBannerBadge getBadge() {
        return this.badge;
    }

    @l
    public final AuctionButton getButton() {
        return this.button;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final UniversalColor getDescriptionColor() {
        return this.descriptionColor;
    }

    @l
    public final UniversalImage getIcon() {
        return this.icon;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final UniversalColor getTitleColor() {
        return this.titleColor;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.titleColor, flags);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.descriptionColor, flags);
        AuctionBannerBadge auctionBannerBadge = this.badge;
        if (auctionBannerBadge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            auctionBannerBadge.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.icon, flags);
        parcel.writeParcelable(this.backgroundColor, flags);
        AuctionButton auctionButton = this.button;
        if (auctionButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            auctionButton.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.deeplink, flags);
    }

    public AuctionBanner(@l String str, @l UniversalColor universalColor, @l String str2, @l UniversalColor universalColor2, @l AuctionBannerBadge auctionBannerBadge, @l UniversalImage universalImage, @l UniversalColor universalColor3, @l AuctionButton auctionButton, @l DeepLink deepLink) {
        this.title = str;
        this.titleColor = universalColor;
        this.description = str2;
        this.descriptionColor = universalColor2;
        this.badge = auctionBannerBadge;
        this.icon = universalImage;
        this.backgroundColor = universalColor3;
        this.button = auctionButton;
        this.deeplink = deepLink;
    }

    public /* synthetic */ AuctionBanner(String str, UniversalColor universalColor, String str2, UniversalColor universalColor2, AuctionBannerBadge auctionBannerBadge, UniversalImage universalImage, UniversalColor universalColor3, AuctionButton auctionButton, DeepLink deepLink, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : universalColor, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : universalColor2, (i12 & 16) != 0 ? null : auctionBannerBadge, (i12 & 32) != 0 ? null : universalImage, (i12 & 64) != 0 ? null : universalColor3, (i12 & 128) != 0 ? null : auctionButton, (i12 & 256) == 0 ? deepLink : null);
    }
}

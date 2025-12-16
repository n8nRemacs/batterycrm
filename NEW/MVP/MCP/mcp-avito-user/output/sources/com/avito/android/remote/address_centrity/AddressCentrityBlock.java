package com.avito.android.remote.address_centrity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.UniversalColor;
import com.google.gson.annotations.c;
import com.my.tracker.ads.AdFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddressCentrityBlock.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/address_centrity/AddressCentrityBlock;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/address_centrity/AddressCentrityBlock$Banner;", AdFormat.BANNER, "<init>", "(Lcom/avito/android/remote/address_centrity/AddressCentrityBlock$Banner;)V", "Lcom/avito/android/remote/address_centrity/AddressCentrityBlock$Banner;", "c", "()Lcom/avito/android/remote/address_centrity/AddressCentrityBlock$Banner;", "Banner", "BannerBackground", "BannerButton", "ButtonBackground", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AddressCentrityBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<AddressCentrityBlock> CREATOR = new a();

    @c(AdFormat.BANNER)
    @k
    private final Banner banner;

    /* compiled from: AddressCentrityBlock.kt */
    @d
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/address_centrity/AddressCentrityBlock$Banner;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/remote/address_centrity/AddressCentrityBlock$BannerBackground;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/remote/address_centrity/AddressCentrityBlock$BannerButton;", "button", "Lcom/avito/android/remote/model/ParametrizedEvent;", "showEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/address_centrity/AddressCentrityBlock$BannerBackground;Lcom/avito/android/remote/address_centrity/AddressCentrityBlock$BannerButton;Lcom/avito/android/remote/model/ParametrizedEvent;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Lcom/avito/android/remote/address_centrity/AddressCentrityBlock$BannerBackground;", "c", "()Lcom/avito/android/remote/address_centrity/AddressCentrityBlock$BannerBackground;", "Lcom/avito/android/remote/address_centrity/AddressCentrityBlock$BannerButton;", "d", "()Lcom/avito/android/remote/address_centrity/AddressCentrityBlock$BannerButton;", "Lcom/avito/android/remote/model/ParametrizedEvent;", "e", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Banner implements Parcelable {

        @k
        public static final Parcelable.Creator<Banner> CREATOR = new a();

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
        @k
        private final BannerBackground background;

        @c("button")
        @k
        private final BannerButton button;

        @c("showEvent")
        @l
        private final ParametrizedEvent showEvent;

        @c("subtitle")
        @k
        private final String subtitle;

        @c("title")
        @k
        private final String title;

        /* compiled from: AddressCentrityBlock.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Banner> {
            @Override // android.os.Parcelable.Creator
            public final Banner createFromParcel(Parcel parcel) {
                return new Banner(parcel.readString(), parcel.readString(), BannerBackground.CREATOR.createFromParcel(parcel), BannerButton.CREATOR.createFromParcel(parcel), (ParametrizedEvent) parcel.readParcelable(Banner.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Banner[] newArray(int i12) {
                return new Banner[i12];
            }
        }

        public Banner(@k String str, @k String str2, @k BannerBackground bannerBackground, @k BannerButton bannerButton, @l ParametrizedEvent parametrizedEvent) {
            this.title = str;
            this.subtitle = str2;
            this.background = bannerBackground;
            this.button = bannerButton;
            this.showEvent = parametrizedEvent;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final BannerBackground getBackground() {
            return this.background;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final BannerButton getButton() {
            return this.button;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final ParametrizedEvent getShowEvent() {
            return this.showEvent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) obj;
            return L.f(this.title, banner.title) && L.f(this.subtitle, banner.subtitle) && L.f(this.background, banner.background) && L.f(this.button, banner.button) && L.f(this.showEvent, banner.showEvent);
        }

        @k
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iHashCode = (this.button.hashCode() + ((this.background.hashCode() + H.d(this.title.hashCode() * 31, 31, this.subtitle)) * 31)) * 31;
            ParametrizedEvent parametrizedEvent = this.showEvent;
            return iHashCode + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Banner(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", background=");
            sb2.append(this.background);
            sb2.append(", button=");
            sb2.append(this.button);
            sb2.append(", showEvent=");
            return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.showEvent, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            this.background.writeToParcel(parcel, i12);
            this.button.writeToParcel(parcel, i12);
            parcel.writeParcelable(this.showEvent, i12);
        }
    }

    /* compiled from: AddressCentrityBlock.kt */
    @d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/address_centrity/AddressCentrityBlock$BannerBackground;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "color", "Lcom/avito/android/remote/model/Image;", "image", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/Image;)V", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "()Lcom/avito/android/remote/model/UniversalColor;", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BannerBackground implements Parcelable {

        @k
        public static final Parcelable.Creator<BannerBackground> CREATOR = new a();

        @c("color")
        @k
        private final UniversalColor color;

        @c("image")
        @k
        private final Image image;

        /* compiled from: AddressCentrityBlock.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BannerBackground> {
            @Override // android.os.Parcelable.Creator
            public final BannerBackground createFromParcel(Parcel parcel) {
                return new BannerBackground((UniversalColor) parcel.readParcelable(BannerBackground.class.getClassLoader()), (Image) parcel.readParcelable(BannerBackground.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final BannerBackground[] newArray(int i12) {
                return new BannerBackground[i12];
            }
        }

        public BannerBackground(@k UniversalColor universalColor, @k Image image) {
            this.color = universalColor;
            this.image = image;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BannerBackground)) {
                return false;
            }
            BannerBackground bannerBackground = (BannerBackground) obj;
            return L.f(this.color, bannerBackground.color) && L.f(this.image, bannerBackground.image);
        }

        @k
        public final Image getImage() {
            return this.image;
        }

        public final int hashCode() {
            return this.image.hashCode() + (this.color.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BannerBackground(color=");
            sb2.append(this.color);
            sb2.append(", image=");
            return AK.c.o(sb2, this.image, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.color, i12);
            parcel.writeParcelable(this.image, i12);
        }
    }

    /* compiled from: AddressCentrityBlock.kt */
    @d
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/address_centrity/AddressCentrityBlock$BannerButton;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", "onConfirmDeeplink", "Lcom/avito/android/remote/address_centrity/AddressCentrityBlock$ButtonBackground;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/address_centrity/AddressCentrityBlock$ButtonBackground;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/address_centrity/AddressCentrityBlock$ButtonBackground;", "getBackground", "()Lcom/avito/android/remote/address_centrity/AddressCentrityBlock$ButtonBackground;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BannerButton implements Parcelable {

        @k
        public static final Parcelable.Creator<BannerButton> CREATOR = new a();

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
        @k
        private final ButtonBackground background;

        @c("onConfirmDeeplink")
        @k
        private final DeepLink onConfirmDeeplink;

        @c("title")
        @k
        private final String title;

        /* compiled from: AddressCentrityBlock.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BannerButton> {
            @Override // android.os.Parcelable.Creator
            public final BannerButton createFromParcel(Parcel parcel) {
                return new BannerButton(parcel.readString(), (DeepLink) parcel.readParcelable(BannerButton.class.getClassLoader()), ButtonBackground.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final BannerButton[] newArray(int i12) {
                return new BannerButton[i12];
            }
        }

        public BannerButton(@k String str, @k DeepLink deepLink, @k ButtonBackground buttonBackground) {
            this.title = str;
            this.onConfirmDeeplink = deepLink;
            this.background = buttonBackground;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final DeepLink getOnConfirmDeeplink() {
            return this.onConfirmDeeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BannerButton)) {
                return false;
            }
            BannerButton bannerButton = (BannerButton) obj;
            return L.f(this.title, bannerButton.title) && L.f(this.onConfirmDeeplink, bannerButton.onConfirmDeeplink) && L.f(this.background, bannerButton.background);
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.background.hashCode() + com.avito.android.actions_sheet.a.e(this.onConfirmDeeplink, this.title.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            return "BannerButton(title=" + this.title + ", onConfirmDeeplink=" + this.onConfirmDeeplink + ", background=" + this.background + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.onConfirmDeeplink, i12);
            this.background.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: AddressCentrityBlock.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/address_centrity/AddressCentrityBlock$ButtonBackground;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;)V", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "()Lcom/avito/android/remote/model/UniversalColor;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ButtonBackground implements Parcelable {

        @k
        public static final Parcelable.Creator<ButtonBackground> CREATOR = new a();

        @c("color")
        @k
        private final UniversalColor color;

        /* compiled from: AddressCentrityBlock.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ButtonBackground> {
            @Override // android.os.Parcelable.Creator
            public final ButtonBackground createFromParcel(Parcel parcel) {
                return new ButtonBackground((UniversalColor) parcel.readParcelable(ButtonBackground.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ButtonBackground[] newArray(int i12) {
                return new ButtonBackground[i12];
            }
        }

        public ButtonBackground(@k UniversalColor universalColor) {
            this.color = universalColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ButtonBackground) && L.f(this.color, ((ButtonBackground) obj).color);
        }

        public final int hashCode() {
            return this.color.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.r(new StringBuilder("ButtonBackground(color="), this.color, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.color, i12);
        }
    }

    /* compiled from: AddressCentrityBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddressCentrityBlock> {
        @Override // android.os.Parcelable.Creator
        public final AddressCentrityBlock createFromParcel(Parcel parcel) {
            return new AddressCentrityBlock(Banner.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AddressCentrityBlock[] newArray(int i12) {
            return new AddressCentrityBlock[i12];
        }
    }

    public AddressCentrityBlock(@k Banner banner) {
        this.banner = banner;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Banner getBanner() {
        return this.banner;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddressCentrityBlock) && L.f(this.banner, ((AddressCentrityBlock) obj).banner);
    }

    public final int hashCode() {
        return this.banner.hashCode();
    }

    @k
    public final String toString() {
        return "AddressCentrityBlock(banner=" + this.banner + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.banner.writeToParcel(parcel, i12);
    }
}

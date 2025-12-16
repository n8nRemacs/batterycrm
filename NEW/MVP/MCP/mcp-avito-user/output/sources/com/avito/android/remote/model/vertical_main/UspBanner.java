package com.avito.android.remote.model.vertical_main;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UspBannersWidget.kt */
@d
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b \u0010!Jn\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020'HÖ\u0001¢\u0006\u0004\b/\u0010)J \u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020'HÖ\u0001¢\u0006\u0004\b4\u00105R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b:\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bD\u0010!¨\u0006E"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/UspBanner;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/vertical_main/UspBannerBadge;", "badge", "Lcom/avito/android/remote/model/vertical_main/UspBannerButton;", "button", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "Lcom/avito/android/remote/model/vertical_main/UspBannerAnalytics;", "analytics", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/vertical_main/UspBannerBadge;Lcom/avito/android/remote/model/vertical_main/UspBannerButton;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/vertical_main/UspBannerAnalytics;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "()Lcom/avito/android/remote/model/UniversalImage;", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component5", "()Lcom/avito/android/remote/model/vertical_main/UspBannerBadge;", "component6", "()Lcom/avito/android/remote/model/vertical_main/UspBannerButton;", "component7", "()Lcom/avito/android/remote/model/UniversalColor;", "component8", "()Lcom/avito/android/remote/model/vertical_main/UspBannerAnalytics;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/vertical_main/UspBannerBadge;Lcom/avito/android/remote/model/vertical_main/UspBannerButton;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/vertical_main/UspBannerAnalytics;)Lcom/avito/android/remote/model/vertical_main/UspBanner;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Lcom/avito/android/remote/model/vertical_main/UspBannerBadge;", "getBadge", "Lcom/avito/android/remote/model/vertical_main/UspBannerButton;", "getButton", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "Lcom/avito/android/remote/model/vertical_main/UspBannerAnalytics;", "getAnalytics", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UspBanner implements Parcelable {

    @k
    public static final Parcelable.Creator<UspBanner> CREATOR = new Creator();

    @c("analytics")
    @l
    private final UspBannerAnalytics analytics;

    @c("backgroundColor")
    @l
    private final UniversalColor backgroundColor;

    @c("badge")
    @l
    private final UspBannerBadge badge;

    @c("button")
    @l
    private final UspBannerButton button;

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("image")
    @l
    private final UniversalImage image;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: UspBannersWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UspBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UspBanner createFromParcel(@k Parcel parcel) {
            return new UspBanner((AttributedText) parcel.readParcelable(UspBanner.class.getClassLoader()), (AttributedText) parcel.readParcelable(UspBanner.class.getClassLoader()), (UniversalImage) parcel.readParcelable(UspBanner.class.getClassLoader()), (DeepLink) parcel.readParcelable(UspBanner.class.getClassLoader()), parcel.readInt() == 0 ? null : UspBannerBadge.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UspBannerButton.CREATOR.createFromParcel(parcel), (UniversalColor) parcel.readParcelable(UspBanner.class.getClassLoader()), parcel.readInt() != 0 ? UspBannerAnalytics.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UspBanner[] newArray(int i12) {
            return new UspBanner[i12];
        }
    }

    public UspBanner(@k AttributedText attributedText, @l AttributedText attributedText2, @l UniversalImage universalImage, @l DeepLink deepLink, @l UspBannerBadge uspBannerBadge, @l UspBannerButton uspBannerButton, @l UniversalColor universalColor, @l UspBannerAnalytics uspBannerAnalytics) {
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.image = universalImage;
        this.deeplink = deepLink;
        this.badge = uspBannerBadge;
        this.button = uspBannerButton;
        this.backgroundColor = universalColor;
        this.analytics = uspBannerAnalytics;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final UspBannerBadge getBadge() {
        return this.badge;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final UspBannerButton getButton() {
        return this.button;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final UspBannerAnalytics getAnalytics() {
        return this.analytics;
    }

    @k
    public final UspBanner copy(@k AttributedText title, @l AttributedText subtitle, @l UniversalImage image, @l DeepLink deeplink, @l UspBannerBadge badge, @l UspBannerButton button, @l UniversalColor backgroundColor, @l UspBannerAnalytics analytics) {
        return new UspBanner(title, subtitle, image, deeplink, badge, button, backgroundColor, analytics);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UspBanner)) {
            return false;
        }
        UspBanner uspBanner = (UspBanner) other;
        return L.f(this.title, uspBanner.title) && L.f(this.subtitle, uspBanner.subtitle) && L.f(this.image, uspBanner.image) && L.f(this.deeplink, uspBanner.deeplink) && L.f(this.badge, uspBanner.badge) && L.f(this.button, uspBanner.button) && L.f(this.backgroundColor, uspBanner.backgroundColor) && L.f(this.analytics, uspBanner.analytics);
    }

    @l
    public final UspBannerAnalytics getAnalytics() {
        return this.analytics;
    }

    @l
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final UspBannerBadge getBadge() {
        return this.badge;
    }

    @l
    public final UspBannerButton getButton() {
        return this.button;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @k
    public final AttributedText getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AttributedText attributedText = this.subtitle;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode3 = (iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        DeepLink deepLink = this.deeplink;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        UspBannerBadge uspBannerBadge = this.badge;
        int iHashCode5 = (iHashCode4 + (uspBannerBadge == null ? 0 : uspBannerBadge.hashCode())) * 31;
        UspBannerButton uspBannerButton = this.button;
        int iHashCode6 = (iHashCode5 + (uspBannerButton == null ? 0 : uspBannerButton.hashCode())) * 31;
        UniversalColor universalColor = this.backgroundColor;
        int iHashCode7 = (iHashCode6 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        UspBannerAnalytics uspBannerAnalytics = this.analytics;
        return iHashCode7 + (uspBannerAnalytics != null ? uspBannerAnalytics.hashCode() : 0);
    }

    @k
    public String toString() {
        return "UspBanner(title=" + this.title + ", subtitle=" + this.subtitle + ", image=" + this.image + ", deeplink=" + this.deeplink + ", badge=" + this.badge + ", button=" + this.button + ", backgroundColor=" + this.backgroundColor + ", analytics=" + this.analytics + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.subtitle, flags);
        parcel.writeParcelable(this.image, flags);
        parcel.writeParcelable(this.deeplink, flags);
        UspBannerBadge uspBannerBadge = this.badge;
        if (uspBannerBadge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uspBannerBadge.writeToParcel(parcel, flags);
        }
        UspBannerButton uspBannerButton = this.button;
        if (uspBannerButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uspBannerButton.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.backgroundColor, flags);
        UspBannerAnalytics uspBannerAnalytics = this.analytics;
        if (uspBannerAnalytics == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uspBannerAnalytics.writeToParcel(parcel, flags);
        }
    }
}

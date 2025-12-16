package com.avito.android.remote.model.stories;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StoryBanner.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JX\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u0017¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/stories/StoryBanner;", "Landroid/os/Parcelable;", "", "title", "analyticsTitle", "subtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/stories/StoryBannerStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/stories/StoryBannerStyle;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component5", "()Lcom/avito/android/remote/model/UniversalImage;", "component6", "()Lcom/avito/android/remote/model/stories/StoryBannerStyle;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/stories/StoryBannerStyle;)Lcom/avito/android/remote/model/stories/StoryBanner;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getAnalyticsTitle", "getSubtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/remote/model/stories/StoryBannerStyle;", "getStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StoryBanner implements Parcelable {

    @k
    public static final Parcelable.Creator<StoryBanner> CREATOR = new Creator();

    @c("analyticsTitle")
    @l
    private final String analyticsTitle;

    @c("image")
    @l
    private final UniversalImage image;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final StoryBannerStyle style;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink uri;

    /* compiled from: StoryBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StoryBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StoryBanner createFromParcel(@k Parcel parcel) {
            return new StoryBanner(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(StoryBanner.class.getClassLoader()), (UniversalImage) parcel.readParcelable(StoryBanner.class.getClassLoader()), parcel.readInt() == 0 ? null : StoryBannerStyle.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StoryBanner[] newArray(int i12) {
            return new StoryBanner[i12];
        }
    }

    public StoryBanner(@l String str, @l String str2, @l String str3, @l DeepLink deepLink, @l UniversalImage universalImage, @l StoryBannerStyle storyBannerStyle) {
        this.title = str;
        this.analyticsTitle = str2;
        this.subtitle = str3;
        this.uri = deepLink;
        this.image = universalImage;
        this.style = storyBannerStyle;
    }

    public static /* synthetic */ StoryBanner copy$default(StoryBanner storyBanner, String str, String str2, String str3, DeepLink deepLink, UniversalImage universalImage, StoryBannerStyle storyBannerStyle, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = storyBanner.title;
        }
        if ((i12 & 2) != 0) {
            str2 = storyBanner.analyticsTitle;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            str3 = storyBanner.subtitle;
        }
        String str5 = str3;
        if ((i12 & 8) != 0) {
            deepLink = storyBanner.uri;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 16) != 0) {
            universalImage = storyBanner.image;
        }
        UniversalImage universalImage2 = universalImage;
        if ((i12 & 32) != 0) {
            storyBannerStyle = storyBanner.style;
        }
        return storyBanner.copy(str, str4, str5, deepLink2, universalImage2, storyBannerStyle);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getAnalyticsTitle() {
        return this.analyticsTitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final StoryBannerStyle getStyle() {
        return this.style;
    }

    @k
    public final StoryBanner copy(@l String title, @l String analyticsTitle, @l String subtitle, @l DeepLink uri, @l UniversalImage image, @l StoryBannerStyle style) {
        return new StoryBanner(title, analyticsTitle, subtitle, uri, image, style);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryBanner)) {
            return false;
        }
        StoryBanner storyBanner = (StoryBanner) other;
        return L.f(this.title, storyBanner.title) && L.f(this.analyticsTitle, storyBanner.analyticsTitle) && L.f(this.subtitle, storyBanner.subtitle) && L.f(this.uri, storyBanner.uri) && L.f(this.image, storyBanner.image) && L.f(this.style, storyBanner.style);
    }

    @l
    public final String getAnalyticsTitle() {
        return this.analyticsTitle;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final StoryBannerStyle getStyle() {
        return this.style;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final DeepLink getUri() {
        return this.uri;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.analyticsTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DeepLink deepLink = this.uri;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode5 = (iHashCode4 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        StoryBannerStyle storyBannerStyle = this.style;
        return iHashCode5 + (storyBannerStyle != null ? storyBannerStyle.hashCode() : 0);
    }

    @k
    public String toString() {
        return "StoryBanner(title=" + this.title + ", analyticsTitle=" + this.analyticsTitle + ", subtitle=" + this.subtitle + ", uri=" + this.uri + ", image=" + this.image + ", style=" + this.style + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.analyticsTitle);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.uri, flags);
        parcel.writeParcelable(this.image, flags);
        StoryBannerStyle storyBannerStyle = this.style;
        if (storyBannerStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storyBannerStyle.writeToParcel(parcel, flags);
        }
    }
}

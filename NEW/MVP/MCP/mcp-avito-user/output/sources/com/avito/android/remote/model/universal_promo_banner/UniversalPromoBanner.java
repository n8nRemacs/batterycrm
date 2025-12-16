package com.avito.android.remote.model.universal_promo_banner;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalPromoBanner.kt */
@d
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ`\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b'\u0010!J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010\u0019R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010\u001bR(\u0010;\u001a\u00020:8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b;\u0010<\u0012\u0004\bA\u0010B\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lcom/avito/android/remote/model/universal_promo_banner/UniversalPromoBanner;", "Lcom/avito/android/remote/model/SerpElement;", "", "bannerName", "backgroundColor", "backgroundGradient", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/universal_promo_banner/ImageLayout;", "imageLayout", "Lcom/avito/android/deep_linking/links/DeepLink;", "onTapDeepLink", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/universal_promo_banner/ImageLayout;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/UniversalImage;", "component5", "()Lcom/avito/android/remote/model/universal_promo_banner/ImageLayout;", "component6", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component7", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/universal_promo_banner/ImageLayout;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/universal_promo_banner/UniversalPromoBanner;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBannerName", "getBackgroundColor", "getBackgroundGradient", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/remote/model/universal_promo_banner/ImageLayout;", "getImageLayout", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnTapDeepLink", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UniversalPromoBanner implements SerpElement {

    @k
    public static final Parcelable.Creator<UniversalPromoBanner> CREATOR = new Creator();

    @c("backgroundColor")
    @l
    private final String backgroundColor;

    @c("backgroundGradient")
    @l
    private final String backgroundGradient;

    @c("bannerName")
    @k
    private final String bannerName;

    @c("image")
    @l
    private final UniversalImage image;

    @c("imageLayout")
    @l
    private final ImageLayout imageLayout;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink onTapDeepLink;

    @c("detailsLink")
    @k
    private final AttributedText text;
    private long uniqueId;

    /* compiled from: UniversalPromoBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UniversalPromoBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalPromoBanner createFromParcel(@k Parcel parcel) {
            return new UniversalPromoBanner(parcel.readString(), parcel.readString(), parcel.readString(), (UniversalImage) parcel.readParcelable(UniversalPromoBanner.class.getClassLoader()), parcel.readInt() == 0 ? null : ImageLayout.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(UniversalPromoBanner.class.getClassLoader()), (AttributedText) parcel.readParcelable(UniversalPromoBanner.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalPromoBanner[] newArray(int i12) {
            return new UniversalPromoBanner[i12];
        }
    }

    public UniversalPromoBanner(@k String str, @l String str2, @l String str3, @l UniversalImage universalImage, @l ImageLayout imageLayout, @l DeepLink deepLink, @k AttributedText attributedText) {
        this.bannerName = str;
        this.backgroundColor = str2;
        this.backgroundGradient = str3;
        this.image = universalImage;
        this.imageLayout = imageLayout;
        this.onTapDeepLink = deepLink;
        this.text = attributedText;
        this.uniqueId = str.hashCode();
    }

    public static /* synthetic */ UniversalPromoBanner copy$default(UniversalPromoBanner universalPromoBanner, String str, String str2, String str3, UniversalImage universalImage, ImageLayout imageLayout, DeepLink deepLink, AttributedText attributedText, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = universalPromoBanner.bannerName;
        }
        if ((i12 & 2) != 0) {
            str2 = universalPromoBanner.backgroundColor;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            str3 = universalPromoBanner.backgroundGradient;
        }
        String str5 = str3;
        if ((i12 & 8) != 0) {
            universalImage = universalPromoBanner.image;
        }
        UniversalImage universalImage2 = universalImage;
        if ((i12 & 16) != 0) {
            imageLayout = universalPromoBanner.imageLayout;
        }
        ImageLayout imageLayout2 = imageLayout;
        if ((i12 & 32) != 0) {
            deepLink = universalPromoBanner.onTapDeepLink;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 64) != 0) {
            attributedText = universalPromoBanner.text;
        }
        return universalPromoBanner.copy(str, str4, str5, universalImage2, imageLayout2, deepLink2, attributedText);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getBannerName() {
        return this.bannerName;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getBackgroundGradient() {
        return this.backgroundGradient;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final ImageLayout getImageLayout() {
        return this.imageLayout;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final DeepLink getOnTapDeepLink() {
        return this.onTapDeepLink;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    @k
    public final UniversalPromoBanner copy(@k String bannerName, @l String backgroundColor, @l String backgroundGradient, @l UniversalImage image, @l ImageLayout imageLayout, @l DeepLink onTapDeepLink, @k AttributedText text) {
        return new UniversalPromoBanner(bannerName, backgroundColor, backgroundGradient, image, imageLayout, onTapDeepLink, text);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalPromoBanner)) {
            return false;
        }
        UniversalPromoBanner universalPromoBanner = (UniversalPromoBanner) other;
        return L.f(this.bannerName, universalPromoBanner.bannerName) && L.f(this.backgroundColor, universalPromoBanner.backgroundColor) && L.f(this.backgroundGradient, universalPromoBanner.backgroundGradient) && L.f(this.image, universalPromoBanner.image) && L.f(this.imageLayout, universalPromoBanner.imageLayout) && L.f(this.onTapDeepLink, universalPromoBanner.onTapDeepLink) && L.f(this.text, universalPromoBanner.text);
    }

    @l
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final String getBackgroundGradient() {
        return this.backgroundGradient;
    }

    @k
    public final String getBannerName() {
        return this.bannerName;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final ImageLayout getImageLayout() {
        return this.imageLayout;
    }

    @l
    public final DeepLink getOnTapDeepLink() {
        return this.onTapDeepLink;
    }

    @k
    public final AttributedText getText() {
        return this.text;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    public int hashCode() {
        int iHashCode = this.bannerName.hashCode() * 31;
        String str = this.backgroundColor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundGradient;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode4 = (iHashCode3 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        ImageLayout imageLayout = this.imageLayout;
        int iHashCode5 = (iHashCode4 + (imageLayout == null ? 0 : imageLayout.hashCode())) * 31;
        DeepLink deepLink = this.onTapDeepLink;
        return this.text.hashCode() + ((iHashCode5 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        this.uniqueId = j12;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalPromoBanner(bannerName=");
        sb2.append(this.bannerName);
        sb2.append(", backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", backgroundGradient=");
        sb2.append(this.backgroundGradient);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", imageLayout=");
        sb2.append(this.imageLayout);
        sb2.append(", onTapDeepLink=");
        sb2.append(this.onTapDeepLink);
        sb2.append(", text=");
        return a.w(sb2, this.text, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.bannerName);
        parcel.writeString(this.backgroundColor);
        parcel.writeString(this.backgroundGradient);
        parcel.writeParcelable(this.image, flags);
        ImageLayout imageLayout = this.imageLayout;
        if (imageLayout == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageLayout.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.onTapDeepLink, flags);
        parcel.writeParcelable(this.text, flags);
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }
}

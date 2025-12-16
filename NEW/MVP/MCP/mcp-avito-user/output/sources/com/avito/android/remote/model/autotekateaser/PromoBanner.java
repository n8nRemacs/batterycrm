package com.avito.android.remote.model.autotekateaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaTeaserItemResponse.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JF\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u0017¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/autotekateaser/PromoBanner;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/UniversalColor;", "textColor", "Lcom/avito/android/remote/model/autotekateaser/BannerGradient;", "gradient", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/autotekateaser/BannerGradient;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "component3", "()Lcom/avito/android/remote/model/autotekateaser/BannerGradient;", "component4", "()Lcom/avito/android/remote/model/UniversalImage;", "component5", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/autotekateaser/BannerGradient;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/autotekateaser/PromoBanner;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/UniversalColor;", "getTextColor", "Lcom/avito/android/remote/model/autotekateaser/BannerGradient;", "getGradient", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PromoBanner implements Parcelable {

    @k
    public static final Parcelable.Creator<PromoBanner> CREATOR = new Creator();

    @c(ContextActionHandler.Link.DEEPLINK)
    @l
    private final DeepLink deepLink;

    @c("gradient")
    @k
    private final BannerGradient gradient;

    @c("image")
    @l
    private final UniversalImage image;

    @c("textColor")
    @k
    private final UniversalColor textColor;

    @c("title")
    @k
    private final String title;

    /* compiled from: AutotekaTeaserItemResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PromoBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoBanner createFromParcel(@k Parcel parcel) {
            return new PromoBanner(parcel.readString(), (UniversalColor) parcel.readParcelable(PromoBanner.class.getClassLoader()), BannerGradient.CREATOR.createFromParcel(parcel), (UniversalImage) parcel.readParcelable(PromoBanner.class.getClassLoader()), (DeepLink) parcel.readParcelable(PromoBanner.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoBanner[] newArray(int i12) {
            return new PromoBanner[i12];
        }
    }

    public PromoBanner(@k String str, @k UniversalColor universalColor, @k BannerGradient bannerGradient, @l UniversalImage universalImage, @l DeepLink deepLink) {
        this.title = str;
        this.textColor = universalColor;
        this.gradient = bannerGradient;
        this.image = universalImage;
        this.deepLink = deepLink;
    }

    public static /* synthetic */ PromoBanner copy$default(PromoBanner promoBanner, String str, UniversalColor universalColor, BannerGradient bannerGradient, UniversalImage universalImage, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = promoBanner.title;
        }
        if ((i12 & 2) != 0) {
            universalColor = promoBanner.textColor;
        }
        UniversalColor universalColor2 = universalColor;
        if ((i12 & 4) != 0) {
            bannerGradient = promoBanner.gradient;
        }
        BannerGradient bannerGradient2 = bannerGradient;
        if ((i12 & 8) != 0) {
            universalImage = promoBanner.image;
        }
        UniversalImage universalImage2 = universalImage;
        if ((i12 & 16) != 0) {
            deepLink = promoBanner.deepLink;
        }
        return promoBanner.copy(str, universalColor2, bannerGradient2, universalImage2, deepLink);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final UniversalColor getTextColor() {
        return this.textColor;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final BannerGradient getGradient() {
        return this.gradient;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final PromoBanner copy(@k String title, @k UniversalColor textColor, @k BannerGradient gradient, @l UniversalImage image, @l DeepLink deepLink) {
        return new PromoBanner(title, textColor, gradient, image, deepLink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoBanner)) {
            return false;
        }
        PromoBanner promoBanner = (PromoBanner) other;
        return L.f(this.title, promoBanner.title) && L.f(this.textColor, promoBanner.textColor) && L.f(this.gradient, promoBanner.gradient) && L.f(this.image, promoBanner.image) && L.f(this.deepLink, promoBanner.deepLink);
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final BannerGradient getGradient() {
        return this.gradient;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    public final UniversalColor getTextColor() {
        return this.textColor;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.gradient.hashCode() + a.i(this.textColor, this.title.hashCode() * 31, 31)) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        DeepLink deepLink = this.deepLink;
        return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PromoBanner(title=");
        sb2.append(this.title);
        sb2.append(", textColor=");
        sb2.append(this.textColor);
        sb2.append(", gradient=");
        sb2.append(this.gradient);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", deepLink=");
        return a.v(sb2, this.deepLink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.textColor, flags);
        this.gradient.writeToParcel(parcel, flags);
        parcel.writeParcelable(this.image, flags);
        parcel.writeParcelable(this.deepLink, flags);
    }
}

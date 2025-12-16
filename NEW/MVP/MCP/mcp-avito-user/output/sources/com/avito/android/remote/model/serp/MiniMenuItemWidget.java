package com.avito.android.remote.model.serp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MiniMenuItemWidget.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JL\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u0017¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/serp/MiniMenuItemWidget;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/serp/TextBadge;", "badge", "Lcom/avito/android/remote/model/serp/Onboarding;", "onboarding", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/serp/TextBadge;Lcom/avito/android/remote/model/serp/Onboarding;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Lcom/avito/android/remote/model/UniversalImage;", "component4", "()Lcom/avito/android/remote/model/serp/TextBadge;", "component5", "()Lcom/avito/android/remote/model/serp/Onboarding;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/serp/TextBadge;Lcom/avito/android/remote/model/serp/Onboarding;)Lcom/avito/android/remote/model/serp/MiniMenuItemWidget;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/remote/model/serp/TextBadge;", "getBadge", "Lcom/avito/android/remote/model/serp/Onboarding;", "getOnboarding", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MiniMenuItemWidget implements Parcelable {

    @k
    public static final Parcelable.Creator<MiniMenuItemWidget> CREATOR = new Creator();

    @c("badge")
    @l
    private final TextBadge badge;

    @c("image")
    @l
    private final UniversalImage image;

    @c("onboarding")
    @l
    private final Onboarding onboarding;

    @c("title")
    @l
    private final String title;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink uri;

    /* compiled from: MiniMenuItemWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MiniMenuItemWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MiniMenuItemWidget createFromParcel(@k Parcel parcel) {
            return new MiniMenuItemWidget(parcel.readString(), (DeepLink) parcel.readParcelable(MiniMenuItemWidget.class.getClassLoader()), (UniversalImage) parcel.readParcelable(MiniMenuItemWidget.class.getClassLoader()), parcel.readInt() == 0 ? null : TextBadge.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Onboarding.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MiniMenuItemWidget[] newArray(int i12) {
            return new MiniMenuItemWidget[i12];
        }
    }

    public MiniMenuItemWidget(@l String str, @l DeepLink deepLink, @l UniversalImage universalImage, @l TextBadge textBadge, @l Onboarding onboarding) {
        this.title = str;
        this.uri = deepLink;
        this.image = universalImage;
        this.badge = textBadge;
        this.onboarding = onboarding;
    }

    public static /* synthetic */ MiniMenuItemWidget copy$default(MiniMenuItemWidget miniMenuItemWidget, String str, DeepLink deepLink, UniversalImage universalImage, TextBadge textBadge, Onboarding onboarding, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = miniMenuItemWidget.title;
        }
        if ((i12 & 2) != 0) {
            deepLink = miniMenuItemWidget.uri;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 4) != 0) {
            universalImage = miniMenuItemWidget.image;
        }
        UniversalImage universalImage2 = universalImage;
        if ((i12 & 8) != 0) {
            textBadge = miniMenuItemWidget.badge;
        }
        TextBadge textBadge2 = textBadge;
        if ((i12 & 16) != 0) {
            onboarding = miniMenuItemWidget.onboarding;
        }
        return miniMenuItemWidget.copy(str, deepLink2, universalImage2, textBadge2, onboarding);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final TextBadge getBadge() {
        return this.badge;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Onboarding getOnboarding() {
        return this.onboarding;
    }

    @k
    public final MiniMenuItemWidget copy(@l String title, @l DeepLink uri, @l UniversalImage image, @l TextBadge badge, @l Onboarding onboarding) {
        return new MiniMenuItemWidget(title, uri, image, badge, onboarding);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiniMenuItemWidget)) {
            return false;
        }
        MiniMenuItemWidget miniMenuItemWidget = (MiniMenuItemWidget) other;
        return L.f(this.title, miniMenuItemWidget.title) && L.f(this.uri, miniMenuItemWidget.uri) && L.f(this.image, miniMenuItemWidget.image) && L.f(this.badge, miniMenuItemWidget.badge) && L.f(this.onboarding, miniMenuItemWidget.onboarding);
    }

    @l
    public final TextBadge getBadge() {
        return this.badge;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final Onboarding getOnboarding() {
        return this.onboarding;
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
        DeepLink deepLink = this.uri;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode3 = (iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        TextBadge textBadge = this.badge;
        int iHashCode4 = (iHashCode3 + (textBadge == null ? 0 : textBadge.hashCode())) * 31;
        Onboarding onboarding = this.onboarding;
        return iHashCode4 + (onboarding != null ? onboarding.hashCode() : 0);
    }

    @k
    public String toString() {
        return "MiniMenuItemWidget(title=" + this.title + ", uri=" + this.uri + ", image=" + this.image + ", badge=" + this.badge + ", onboarding=" + this.onboarding + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.uri, flags);
        parcel.writeParcelable(this.image, flags);
        TextBadge textBadge = this.badge;
        if (textBadge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textBadge.writeToParcel(parcel, flags);
        }
        Onboarding onboarding = this.onboarding;
        if (onboarding == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            onboarding.writeToParcel(parcel, flags);
        }
    }
}

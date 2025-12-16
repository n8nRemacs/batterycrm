package com.avito.android.remote.model.advert_details.realty;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DevelopmentsAdvice.kt */
@d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JX\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b*\u0010+R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u0010\u0019¨\u00067"}, d2 = {"Lcom/avito/android/remote/model/advert_details/realty/TeaserBanner;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/UniversalImage;", "image", "description", "Lcom/avito/android/deep_linking/links/DeepLink;", "entryPointShowEvent", "Lcom/avito/android/remote/model/ButtonAction;", "button", "Lcom/avito/android/remote/model/advert_details/realty/LandingInfo;", "landing", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/ButtonAction;Lcom/avito/android/remote/model/advert_details/realty/LandingInfo;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/UniversalImage;", "component3", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component5", "()Lcom/avito/android/remote/model/ButtonAction;", "component6", "()Lcom/avito/android/remote/model/advert_details/realty/LandingInfo;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/ButtonAction;Lcom/avito/android/remote/model/advert_details/realty/LandingInfo;)Lcom/avito/android/remote/model/advert_details/realty/TeaserBanner;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "getDescription", "Lcom/avito/android/deep_linking/links/DeepLink;", "getEntryPointShowEvent", "Lcom/avito/android/remote/model/ButtonAction;", "getButton", "Lcom/avito/android/remote/model/advert_details/realty/LandingInfo;", "getLanding", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TeaserBanner implements Parcelable {

    @k
    public static final Parcelable.Creator<TeaserBanner> CREATOR = new Creator();

    @c("button")
    @l
    private final ButtonAction button;

    @c("description")
    @l
    private final String description;

    @c("entryPointShowEvent")
    @l
    private final DeepLink entryPointShowEvent;

    @c("image")
    @l
    private final UniversalImage image;

    @c("landing")
    @l
    private final LandingInfo landing;

    @c("title")
    @l
    private final String title;

    /* compiled from: DevelopmentsAdvice.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TeaserBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TeaserBanner createFromParcel(@k Parcel parcel) {
            return new TeaserBanner(parcel.readString(), (UniversalImage) parcel.readParcelable(TeaserBanner.class.getClassLoader()), parcel.readString(), (DeepLink) parcel.readParcelable(TeaserBanner.class.getClassLoader()), parcel.readInt() == 0 ? null : ButtonAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LandingInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TeaserBanner[] newArray(int i12) {
            return new TeaserBanner[i12];
        }
    }

    public TeaserBanner() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ TeaserBanner copy$default(TeaserBanner teaserBanner, String str, UniversalImage universalImage, String str2, DeepLink deepLink, ButtonAction buttonAction, LandingInfo landingInfo, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = teaserBanner.title;
        }
        if ((i12 & 2) != 0) {
            universalImage = teaserBanner.image;
        }
        UniversalImage universalImage2 = universalImage;
        if ((i12 & 4) != 0) {
            str2 = teaserBanner.description;
        }
        String str3 = str2;
        if ((i12 & 8) != 0) {
            deepLink = teaserBanner.entryPointShowEvent;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 16) != 0) {
            buttonAction = teaserBanner.button;
        }
        ButtonAction buttonAction2 = buttonAction;
        if ((i12 & 32) != 0) {
            landingInfo = teaserBanner.landing;
        }
        return teaserBanner.copy(str, universalImage2, str3, deepLink2, buttonAction2, landingInfo);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DeepLink getEntryPointShowEvent() {
        return this.entryPointShowEvent;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final ButtonAction getButton() {
        return this.button;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final LandingInfo getLanding() {
        return this.landing;
    }

    @k
    public final TeaserBanner copy(@l String title, @l UniversalImage image, @l String description, @l DeepLink entryPointShowEvent, @l ButtonAction button, @l LandingInfo landing) {
        return new TeaserBanner(title, image, description, entryPointShowEvent, button, landing);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeaserBanner)) {
            return false;
        }
        TeaserBanner teaserBanner = (TeaserBanner) other;
        return L.f(this.title, teaserBanner.title) && L.f(this.image, teaserBanner.image) && L.f(this.description, teaserBanner.description) && L.f(this.entryPointShowEvent, teaserBanner.entryPointShowEvent) && L.f(this.button, teaserBanner.button) && L.f(this.landing, teaserBanner.landing);
    }

    @l
    public final ButtonAction getButton() {
        return this.button;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final DeepLink getEntryPointShowEvent() {
        return this.entryPointShowEvent;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final LandingInfo getLanding() {
        return this.landing;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.entryPointShowEvent;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        ButtonAction buttonAction = this.button;
        int iHashCode5 = (iHashCode4 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        LandingInfo landingInfo = this.landing;
        return iHashCode5 + (landingInfo != null ? landingInfo.hashCode() : 0);
    }

    @k
    public String toString() {
        return "TeaserBanner(title=" + this.title + ", image=" + this.image + ", description=" + this.description + ", entryPointShowEvent=" + this.entryPointShowEvent + ", button=" + this.button + ", landing=" + this.landing + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.image, flags);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.entryPointShowEvent, flags);
        ButtonAction buttonAction = this.button;
        if (buttonAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonAction.writeToParcel(parcel, flags);
        }
        LandingInfo landingInfo = this.landing;
        if (landingInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            landingInfo.writeToParcel(parcel, flags);
        }
    }

    public TeaserBanner(@l String str, @l UniversalImage universalImage, @l String str2, @l DeepLink deepLink, @l ButtonAction buttonAction, @l LandingInfo landingInfo) {
        this.title = str;
        this.image = universalImage;
        this.description = str2;
        this.entryPointShowEvent = deepLink;
        this.button = buttonAction;
        this.landing = landingInfo;
    }

    public /* synthetic */ TeaserBanner(String str, UniversalImage universalImage, String str2, DeepLink deepLink, ButtonAction buttonAction, LandingInfo landingInfo, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : universalImage, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : deepLink, (i12 & 16) != 0 ? null : buttonAction, (i12 & 32) != 0 ? null : landingInfo);
    }
}

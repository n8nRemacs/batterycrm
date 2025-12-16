package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoFinanceItem.kt */
@d
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJp\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\"\u0010\u0019J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020#HÖ\u0001¢\u0006\u0004\b+\u0010%J \u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020#HÖ\u0001¢\u0006\u0004\b0\u00101R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b<\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b=\u0010\u0019R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010\u001f¨\u0006@"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/Feature;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/user_profile/items/FeatureType;", "featureType", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/user_profile/items/State;", VoiceInfo.STATE, "", "error", "Lcom/avito/android/remote/model/UniversalImage;", "icon", "title", "subtitle", "Lcom/avito/android/remote/model/user_profile/items/Background;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "<init>", "(Lcom/avito/android/remote/model/user_profile/items/FeatureType;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/user_profile/items/State;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/user_profile/items/Background;)V", "component1", "()Lcom/avito/android/remote/model/user_profile/items/FeatureType;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Lcom/avito/android/remote/model/user_profile/items/State;", "component4", "()Ljava/lang/String;", "component5", "()Lcom/avito/android/remote/model/UniversalImage;", "component6", "component7", "component8", "()Lcom/avito/android/remote/model/user_profile/items/Background;", "copy", "(Lcom/avito/android/remote/model/user_profile/items/FeatureType;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/user_profile/items/State;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/user_profile/items/Background;)Lcom/avito/android/remote/model/user_profile/items/Feature;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/user_profile/items/FeatureType;", "getFeatureType", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Lcom/avito/android/remote/model/user_profile/items/State;", "getState", "Ljava/lang/String;", "getError", "Lcom/avito/android/remote/model/UniversalImage;", "getIcon", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/user_profile/items/Background;", "getBackground", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Feature implements Parcelable {

    @k
    public static final Parcelable.Creator<Feature> CREATOR = new Creator();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
    @l
    private final Background background;

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("error")
    @l
    private final String error;

    @c("featureType")
    @l
    private final FeatureType featureType;

    @c("icon")
    @l
    private final UniversalImage icon;

    @c(VoiceInfo.STATE)
    @l
    private final State state;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;

    /* compiled from: AvitoFinanceItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Feature> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Feature createFromParcel(@k Parcel parcel) {
            return new Feature(parcel.readInt() == 0 ? null : FeatureType.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(Feature.class.getClassLoader()), parcel.readInt() == 0 ? null : State.valueOf(parcel.readString()), parcel.readString(), (UniversalImage) parcel.readParcelable(Feature.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Background.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Feature[] newArray(int i12) {
            return new Feature[i12];
        }
    }

    public Feature(@l FeatureType featureType, @l DeepLink deepLink, @l State state, @l String str, @l UniversalImage universalImage, @l String str2, @l String str3, @l Background background) {
        this.featureType = featureType;
        this.deeplink = deepLink;
        this.state = state;
        this.error = str;
        this.icon = universalImage;
        this.title = str2;
        this.subtitle = str3;
        this.background = background;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final FeatureType getFeatureType() {
        return this.featureType;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final State getState() {
        return this.state;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final UniversalImage getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Background getBackground() {
        return this.background;
    }

    @k
    public final Feature copy(@l FeatureType featureType, @l DeepLink deeplink, @l State state, @l String error, @l UniversalImage icon, @l String title, @l String subtitle, @l Background background) {
        return new Feature(featureType, deeplink, state, error, icon, title, subtitle, background);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) other;
        return this.featureType == feature.featureType && L.f(this.deeplink, feature.deeplink) && this.state == feature.state && L.f(this.error, feature.error) && L.f(this.icon, feature.icon) && L.f(this.title, feature.title) && L.f(this.subtitle, feature.subtitle) && L.f(this.background, feature.background);
    }

    @l
    public final Background getBackground() {
        return this.background;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final String getError() {
        return this.error;
    }

    @l
    public final FeatureType getFeatureType() {
        return this.featureType;
    }

    @l
    public final UniversalImage getIcon() {
        return this.icon;
    }

    @l
    public final State getState() {
        return this.state;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        FeatureType featureType = this.featureType;
        int iHashCode = (featureType == null ? 0 : featureType.hashCode()) * 31;
        DeepLink deepLink = this.deeplink;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        State state = this.state;
        int iHashCode3 = (iHashCode2 + (state == null ? 0 : state.hashCode())) * 31;
        String str = this.error;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        UniversalImage universalImage = this.icon;
        int iHashCode5 = (iHashCode4 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Background background = this.background;
        return iHashCode7 + (background != null ? background.hashCode() : 0);
    }

    @k
    public String toString() {
        return "Feature(featureType=" + this.featureType + ", deeplink=" + this.deeplink + ", state=" + this.state + ", error=" + this.error + ", icon=" + this.icon + ", title=" + this.title + ", subtitle=" + this.subtitle + ", background=" + this.background + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        FeatureType featureType = this.featureType;
        if (featureType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(featureType.name());
        }
        parcel.writeParcelable(this.deeplink, flags);
        State state = this.state;
        if (state == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(state.name());
        }
        parcel.writeString(this.error);
        parcel.writeParcelable(this.icon, flags);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Background background = this.background;
        if (background == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            background.writeToParcel(parcel, flags);
        }
    }
}

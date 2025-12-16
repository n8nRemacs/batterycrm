package com.avito.android.remote.model.rewards;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RewardsBanner.kt */
@d
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b$\u0010%Jz\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0016J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b0\u0010*J \u00105\u001a\u0002042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b5\u00106R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b=\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b?\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bC\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010D\u001a\u0004\bE\u0010#R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010F\u001a\u0004\bG\u0010%¨\u0006H"}, d2 = {"Lcom/avito/android/remote/model/rewards/RewardsBanner;", "Landroid/os/Parcelable;", "", "title", "", "version", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedTitle", "subtitle", "Lcom/avito/android/remote/model/ParametrizedEvent;", "showEvent", "Lcom/avito/android/remote/model/rewards/RewardsBannerBadge;", "bannerBadge", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/rewards/RewardsButton;", "button", "Lcom/avito/android/remote/model/rewards/RewardsBackground;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ParametrizedEvent;Lcom/avito/android/remote/model/rewards/RewardsBannerBadge;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/rewards/RewardsButton;Lcom/avito/android/remote/model/rewards/RewardsBackground;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "component4", "component5", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "component6", "()Lcom/avito/android/remote/model/rewards/RewardsBannerBadge;", "component7", "()Lcom/avito/android/remote/model/UniversalImage;", "component8", "()Lcom/avito/android/remote/model/rewards/RewardsButton;", "component9", "()Lcom/avito/android/remote/model/rewards/RewardsBackground;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ParametrizedEvent;Lcom/avito/android/remote/model/rewards/RewardsBannerBadge;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/rewards/RewardsButton;Lcom/avito/android/remote/model/rewards/RewardsBackground;)Lcom/avito/android/remote/model/rewards/RewardsBanner;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/lang/Integer;", "getVersion", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedTitle", "getSubtitle", "Lcom/avito/android/remote/model/ParametrizedEvent;", "getShowEvent", "Lcom/avito/android/remote/model/rewards/RewardsBannerBadge;", "getBannerBadge", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/remote/model/rewards/RewardsButton;", "getButton", "Lcom/avito/android/remote/model/rewards/RewardsBackground;", "getBackground", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RewardsBanner implements Parcelable {

    @k
    public static final Parcelable.Creator<RewardsBanner> CREATOR = new Creator();

    @c("attributedTitle")
    @l
    private final AttributedText attributedTitle;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
    @k
    private final RewardsBackground background;

    @c("badge")
    @l
    private final RewardsBannerBadge bannerBadge;

    @c("button")
    @l
    private final RewardsButton button;

    @c("image")
    @l
    private final UniversalImage image;

    @c("showEvent")
    @l
    private final ParametrizedEvent showEvent;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @l
    private final String title;

    @c("version")
    @l
    private final Integer version;

    /* compiled from: RewardsBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardsBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RewardsBanner createFromParcel(@k Parcel parcel) {
            return new RewardsBanner(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (AttributedText) parcel.readParcelable(RewardsBanner.class.getClassLoader()), (AttributedText) parcel.readParcelable(RewardsBanner.class.getClassLoader()), parcel.readInt() == 0 ? null : ParametrizedEvent.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RewardsBannerBadge.CREATOR.createFromParcel(parcel), (UniversalImage) parcel.readParcelable(RewardsBanner.class.getClassLoader()), parcel.readInt() != 0 ? RewardsButton.CREATOR.createFromParcel(parcel) : null, RewardsBackground.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RewardsBanner[] newArray(int i12) {
            return new RewardsBanner[i12];
        }
    }

    public RewardsBanner(@l String str, @l Integer num, @l AttributedText attributedText, @l AttributedText attributedText2, @l ParametrizedEvent parametrizedEvent, @l RewardsBannerBadge rewardsBannerBadge, @l UniversalImage universalImage, @l RewardsButton rewardsButton, @k RewardsBackground rewardsBackground) {
        this.title = str;
        this.version = num;
        this.attributedTitle = attributedText;
        this.subtitle = attributedText2;
        this.showEvent = parametrizedEvent;
        this.bannerBadge = rewardsBannerBadge;
        this.image = universalImage;
        this.button = rewardsButton;
        this.background = rewardsBackground;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AttributedText getAttributedTitle() {
        return this.attributedTitle;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final ParametrizedEvent getShowEvent() {
        return this.showEvent;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final RewardsBannerBadge getBannerBadge() {
        return this.bannerBadge;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final RewardsButton getButton() {
        return this.button;
    }

    @k
    /* renamed from: component9, reason: from getter */
    public final RewardsBackground getBackground() {
        return this.background;
    }

    @k
    public final RewardsBanner copy(@l String title, @l Integer version, @l AttributedText attributedTitle, @l AttributedText subtitle, @l ParametrizedEvent showEvent, @l RewardsBannerBadge bannerBadge, @l UniversalImage image, @l RewardsButton button, @k RewardsBackground background) {
        return new RewardsBanner(title, version, attributedTitle, subtitle, showEvent, bannerBadge, image, button, background);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsBanner)) {
            return false;
        }
        RewardsBanner rewardsBanner = (RewardsBanner) other;
        return L.f(this.title, rewardsBanner.title) && L.f(this.version, rewardsBanner.version) && L.f(this.attributedTitle, rewardsBanner.attributedTitle) && L.f(this.subtitle, rewardsBanner.subtitle) && L.f(this.showEvent, rewardsBanner.showEvent) && L.f(this.bannerBadge, rewardsBanner.bannerBadge) && L.f(this.image, rewardsBanner.image) && L.f(this.button, rewardsBanner.button) && L.f(this.background, rewardsBanner.background);
    }

    @l
    public final AttributedText getAttributedTitle() {
        return this.attributedTitle;
    }

    @k
    public final RewardsBackground getBackground() {
        return this.background;
    }

    @l
    public final RewardsBannerBadge getBannerBadge() {
        return this.bannerBadge;
    }

    @l
    public final RewardsButton getButton() {
        return this.button;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final ParametrizedEvent getShowEvent() {
        return this.showEvent;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.version;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        AttributedText attributedText = this.attributedTitle;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.subtitle;
        int iHashCode4 = (iHashCode3 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.showEvent;
        int iHashCode5 = (iHashCode4 + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        RewardsBannerBadge rewardsBannerBadge = this.bannerBadge;
        int iHashCode6 = (iHashCode5 + (rewardsBannerBadge == null ? 0 : rewardsBannerBadge.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode7 = (iHashCode6 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        RewardsButton rewardsButton = this.button;
        return this.background.hashCode() + ((iHashCode7 + (rewardsButton != null ? rewardsButton.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        return "RewardsBanner(title=" + this.title + ", version=" + this.version + ", attributedTitle=" + this.attributedTitle + ", subtitle=" + this.subtitle + ", showEvent=" + this.showEvent + ", bannerBadge=" + this.bannerBadge + ", image=" + this.image + ", button=" + this.button + ", background=" + this.background + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        Integer num = this.version;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.attributedTitle, flags);
        parcel.writeParcelable(this.subtitle, flags);
        ParametrizedEvent parametrizedEvent = this.showEvent;
        if (parametrizedEvent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parametrizedEvent.writeToParcel(parcel, flags);
        }
        RewardsBannerBadge rewardsBannerBadge = this.bannerBadge;
        if (rewardsBannerBadge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rewardsBannerBadge.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.image, flags);
        RewardsButton rewardsButton = this.button;
        if (rewardsButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rewardsButton.writeToParcel(parcel, flags);
        }
        this.background.writeToParcel(parcel, flags);
    }

    public /* synthetic */ RewardsBanner(String str, Integer num, AttributedText attributedText, AttributedText attributedText2, ParametrizedEvent parametrizedEvent, RewardsBannerBadge rewardsBannerBadge, UniversalImage universalImage, RewardsButton rewardsButton, RewardsBackground rewardsBackground, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? 1 : num, attributedText, attributedText2, parametrizedEvent, rewardsBannerBadge, universalImage, rewardsButton, rewardsBackground);
    }
}

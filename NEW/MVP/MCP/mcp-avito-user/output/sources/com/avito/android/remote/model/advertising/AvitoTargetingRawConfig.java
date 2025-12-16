package com.avito.android.remote.model.advertising;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvitoTargetingRawResponse.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0016J\u0090\u0001\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u0010\u0010%\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b+\u0010\u001cJ \u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b0\u00101R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b6\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b7\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b8\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b9\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b<\u0010\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b>\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b?\u0010\u0016R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b@\u0010\u0016¨\u0006A"}, d2 = {"Lcom/avito/android/remote/model/advertising/AvitoTargetingRawConfig;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/advertising/PremiumBannerType;", "bannerType", "", "brandSlug", "link", "percent", "initialFee", "creditTerm", "", "creativeId", "domain", "Lcom/avito/android/remote/model/advertising/AvitoTargetingPromoType;", "promoType", "infoLink", "bannerStyle", "<init>", "(Lcom/avito/android/remote/model/advertising/PremiumBannerType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/avito/android/remote/model/advertising/AvitoTargetingPromoType;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/advertising/PremiumBannerType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()I", "component8", "component9", "()Lcom/avito/android/remote/model/advertising/AvitoTargetingPromoType;", "component10", "component11", "copy", "(Lcom/avito/android/remote/model/advertising/PremiumBannerType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/avito/android/remote/model/advertising/AvitoTargetingPromoType;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/advertising/AvitoTargetingRawConfig;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/advertising/PremiumBannerType;", "getBannerType", "Ljava/lang/String;", "getBrandSlug", "getLink", "getPercent", "getInitialFee", "getCreditTerm", "I", "getCreativeId", "getDomain", "Lcom/avito/android/remote/model/advertising/AvitoTargetingPromoType;", "getPromoType", "getInfoLink", "getBannerStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AvitoTargetingRawConfig implements Parcelable {

    @k
    public static final Parcelable.Creator<AvitoTargetingRawConfig> CREATOR = new Creator();

    @c("banner_style")
    @l
    private final String bannerStyle;

    @c("banner_type")
    @l
    private final PremiumBannerType bannerType;

    @c("brand_slug")
    @l
    private final String brandSlug;

    @c("creative_id")
    private final int creativeId;

    @c("credit_term")
    @l
    private final String creditTerm;

    @c("adomain")
    @l
    private final String domain;

    @c("buzzoola_info_link")
    @l
    private final String infoLink;

    @c("initial_fee")
    @l
    private final String initialFee;

    @c("link")
    @k
    private final String link;

    @c("percent")
    @l
    private final String percent;

    @c("promo_type")
    @l
    private final AvitoTargetingPromoType promoType;

    /* compiled from: AvitoTargetingRawResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AvitoTargetingRawConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoTargetingRawConfig createFromParcel(@k Parcel parcel) {
            return new AvitoTargetingRawConfig(parcel.readInt() == 0 ? null : PremiumBannerType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? AvitoTargetingPromoType.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoTargetingRawConfig[] newArray(int i12) {
            return new AvitoTargetingRawConfig[i12];
        }
    }

    public AvitoTargetingRawConfig(@l PremiumBannerType premiumBannerType, @l String str, @k String str2, @l String str3, @l String str4, @l String str5, int i12, @l String str6, @l AvitoTargetingPromoType avitoTargetingPromoType, @l String str7, @l String str8) {
        this.bannerType = premiumBannerType;
        this.brandSlug = str;
        this.link = str2;
        this.percent = str3;
        this.initialFee = str4;
        this.creditTerm = str5;
        this.creativeId = i12;
        this.domain = str6;
        this.promoType = avitoTargetingPromoType;
        this.infoLink = str7;
        this.bannerStyle = str8;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final PremiumBannerType getBannerType() {
        return this.bannerType;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final String getInfoLink() {
        return this.infoLink;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final String getBannerStyle() {
        return this.bannerStyle;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getBrandSlug() {
        return this.brandSlug;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getPercent() {
        return this.percent;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getInitialFee() {
        return this.initialFee;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getCreditTerm() {
        return this.creditTerm;
    }

    /* renamed from: component7, reason: from getter */
    public final int getCreativeId() {
        return this.creativeId;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final AvitoTargetingPromoType getPromoType() {
        return this.promoType;
    }

    @k
    public final AvitoTargetingRawConfig copy(@l PremiumBannerType bannerType, @l String brandSlug, @k String link, @l String percent, @l String initialFee, @l String creditTerm, int creativeId, @l String domain, @l AvitoTargetingPromoType promoType, @l String infoLink, @l String bannerStyle) {
        return new AvitoTargetingRawConfig(bannerType, brandSlug, link, percent, initialFee, creditTerm, creativeId, domain, promoType, infoLink, bannerStyle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvitoTargetingRawConfig)) {
            return false;
        }
        AvitoTargetingRawConfig avitoTargetingRawConfig = (AvitoTargetingRawConfig) other;
        return this.bannerType == avitoTargetingRawConfig.bannerType && L.f(this.brandSlug, avitoTargetingRawConfig.brandSlug) && L.f(this.link, avitoTargetingRawConfig.link) && L.f(this.percent, avitoTargetingRawConfig.percent) && L.f(this.initialFee, avitoTargetingRawConfig.initialFee) && L.f(this.creditTerm, avitoTargetingRawConfig.creditTerm) && this.creativeId == avitoTargetingRawConfig.creativeId && L.f(this.domain, avitoTargetingRawConfig.domain) && this.promoType == avitoTargetingRawConfig.promoType && L.f(this.infoLink, avitoTargetingRawConfig.infoLink) && L.f(this.bannerStyle, avitoTargetingRawConfig.bannerStyle);
    }

    @l
    public final String getBannerStyle() {
        return this.bannerStyle;
    }

    @l
    public final PremiumBannerType getBannerType() {
        return this.bannerType;
    }

    @l
    public final String getBrandSlug() {
        return this.brandSlug;
    }

    public final int getCreativeId() {
        return this.creativeId;
    }

    @l
    public final String getCreditTerm() {
        return this.creditTerm;
    }

    @l
    public final String getDomain() {
        return this.domain;
    }

    @l
    public final String getInfoLink() {
        return this.infoLink;
    }

    @l
    public final String getInitialFee() {
        return this.initialFee;
    }

    @k
    public final String getLink() {
        return this.link;
    }

    @l
    public final String getPercent() {
        return this.percent;
    }

    @l
    public final AvitoTargetingPromoType getPromoType() {
        return this.promoType;
    }

    public int hashCode() {
        PremiumBannerType premiumBannerType = this.bannerType;
        int iHashCode = (premiumBannerType == null ? 0 : premiumBannerType.hashCode()) * 31;
        String str = this.brandSlug;
        int iD2 = H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.link);
        String str2 = this.percent;
        int iHashCode2 = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.initialFee;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.creditTerm;
        int iE2 = r.e(this.creativeId, (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        String str5 = this.domain;
        int iHashCode4 = (iE2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        AvitoTargetingPromoType avitoTargetingPromoType = this.promoType;
        int iHashCode5 = (iHashCode4 + (avitoTargetingPromoType == null ? 0 : avitoTargetingPromoType.hashCode())) * 31;
        String str6 = this.infoLink;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.bannerStyle;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoTargetingRawConfig(bannerType=");
        sb2.append(this.bannerType);
        sb2.append(", brandSlug=");
        sb2.append(this.brandSlug);
        sb2.append(", link=");
        sb2.append(this.link);
        sb2.append(", percent=");
        sb2.append(this.percent);
        sb2.append(", initialFee=");
        sb2.append(this.initialFee);
        sb2.append(", creditTerm=");
        sb2.append(this.creditTerm);
        sb2.append(", creativeId=");
        sb2.append(this.creativeId);
        sb2.append(", domain=");
        sb2.append(this.domain);
        sb2.append(", promoType=");
        sb2.append(this.promoType);
        sb2.append(", infoLink=");
        sb2.append(this.infoLink);
        sb2.append(", bannerStyle=");
        return C22026a.c(sb2, this.bannerStyle, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        PremiumBannerType premiumBannerType = this.bannerType;
        if (premiumBannerType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            premiumBannerType.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.brandSlug);
        parcel.writeString(this.link);
        parcel.writeString(this.percent);
        parcel.writeString(this.initialFee);
        parcel.writeString(this.creditTerm);
        parcel.writeInt(this.creativeId);
        parcel.writeString(this.domain);
        AvitoTargetingPromoType avitoTargetingPromoType = this.promoType;
        if (avitoTargetingPromoType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            avitoTargetingPromoType.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.infoLink);
        parcel.writeString(this.bannerStyle);
    }

    public /* synthetic */ AvitoTargetingRawConfig(PremiumBannerType premiumBannerType, String str, String str2, String str3, String str4, String str5, int i12, String str6, AvitoTargetingPromoType avitoTargetingPromoType, String str7, String str8, int i13, C42822w c42822w) {
        this(premiumBannerType, str, str2, str3, str4, str5, i12, str6, avitoTargetingPromoType, str7, (i13 & 1024) != 0 ? null : str8);
    }
}

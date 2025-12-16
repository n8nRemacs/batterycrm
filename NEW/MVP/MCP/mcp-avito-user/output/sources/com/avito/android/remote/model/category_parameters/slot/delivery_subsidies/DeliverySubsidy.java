package com.avito.android.remote.model.category_parameters.slot.delivery_subsidies;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeliverySubsidySlotConfig.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0015J\u0012\u0010!\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0015J\u009e\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0015J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020'HÖ\u0001¢\u0006\u0004\b/\u0010)J \u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020'HÖ\u0001¢\u0006\u0004\b4\u00105R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b=\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b>\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b?\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\bB\u0010\u0015R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bD\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\bE\u0010\u0015¨\u0006F"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidy;", "Landroid/os/Parcelable;", "", "subsidy", "originalSubsidy", "subsidyDisplaying", "price", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidyBadge;", "badge", "id", "description", DeliverySubsidiesSlotKt.VALIDATION_TOKEN, "Lcom/avito/android/remote/model/Image;", "image", "subsidyBadge", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/PromoDisplaying;", "promoDisplaying", DeliverySubsidiesSlotKt.PROMO_CAMPAIGN_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidyBadge;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/PromoDisplaying;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidyBadge;", "component6", "component7", "component8", "component9", "()Lcom/avito/android/remote/model/Image;", "component10", "component11", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/PromoDisplaying;", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidyBadge;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/PromoDisplaying;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidy;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSubsidy", "getOriginalSubsidy", "getSubsidyDisplaying", "getPrice", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidyBadge;", "getBadge", "getId", "getDescription", "getValidationToken", "Lcom/avito/android/remote/model/Image;", "getImage", "getSubsidyBadge", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/PromoDisplaying;", "getPromoDisplaying", "getPromoCampaignId", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DeliverySubsidy implements Parcelable {

    @k
    public static final Parcelable.Creator<DeliverySubsidy> CREATOR = new Creator();

    @c("badge")
    @l
    private final DeliverySubsidyBadge badge;

    @c("description")
    @l
    private final String description;

    @c("id")
    @l
    private final String id;

    @c("image")
    @l
    private final Image image;

    @c("originalSubsidy")
    @l
    private final String originalSubsidy;

    @c("priceDetails")
    @l
    private final String price;

    @c(DeliverySubsidiesSlotKt.PROMO_CAMPAIGN_ID)
    @l
    private final String promoCampaignId;

    @c("promoDisplaying")
    @l
    private final PromoDisplaying promoDisplaying;

    @c("subsidy")
    @k
    private final String subsidy;

    @c("subsidyBadge")
    @l
    private final String subsidyBadge;

    @c("subsidyDisplaying")
    @l
    private final String subsidyDisplaying;

    @c(DeliverySubsidiesSlotKt.VALIDATION_TOKEN)
    @l
    private final String validationToken;

    /* compiled from: DeliverySubsidySlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliverySubsidy> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliverySubsidy createFromParcel(@k Parcel parcel) {
            return new DeliverySubsidy(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DeliverySubsidyBadge.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(DeliverySubsidy.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? PromoDisplaying.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliverySubsidy[] newArray(int i12) {
            return new DeliverySubsidy[i12];
        }
    }

    public DeliverySubsidy(@k String str, @l String str2, @l String str3, @l String str4, @l DeliverySubsidyBadge deliverySubsidyBadge, @l String str5, @l String str6, @l String str7, @l Image image, @l String str8, @l PromoDisplaying promoDisplaying, @l String str9) {
        this.subsidy = str;
        this.originalSubsidy = str2;
        this.subsidyDisplaying = str3;
        this.price = str4;
        this.badge = deliverySubsidyBadge;
        this.id = str5;
        this.description = str6;
        this.validationToken = str7;
        this.image = image;
        this.subsidyBadge = str8;
        this.promoDisplaying = promoDisplaying;
        this.promoCampaignId = str9;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getSubsidy() {
        return this.subsidy;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final String getSubsidyBadge() {
        return this.subsidyBadge;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final PromoDisplaying getPromoDisplaying() {
        return this.promoDisplaying;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final String getPromoCampaignId() {
        return this.promoCampaignId;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getOriginalSubsidy() {
        return this.originalSubsidy;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getSubsidyDisplaying() {
        return this.subsidyDisplaying;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final DeliverySubsidyBadge getBadge() {
        return this.badge;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getValidationToken() {
        return this.validationToken;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @k
    public final DeliverySubsidy copy(@k String subsidy, @l String originalSubsidy, @l String subsidyDisplaying, @l String price, @l DeliverySubsidyBadge badge, @l String id2, @l String description, @l String validationToken, @l Image image, @l String subsidyBadge, @l PromoDisplaying promoDisplaying, @l String promoCampaignId) {
        return new DeliverySubsidy(subsidy, originalSubsidy, subsidyDisplaying, price, badge, id2, description, validationToken, image, subsidyBadge, promoDisplaying, promoCampaignId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliverySubsidy)) {
            return false;
        }
        DeliverySubsidy deliverySubsidy = (DeliverySubsidy) other;
        return L.f(this.subsidy, deliverySubsidy.subsidy) && L.f(this.originalSubsidy, deliverySubsidy.originalSubsidy) && L.f(this.subsidyDisplaying, deliverySubsidy.subsidyDisplaying) && L.f(this.price, deliverySubsidy.price) && L.f(this.badge, deliverySubsidy.badge) && L.f(this.id, deliverySubsidy.id) && L.f(this.description, deliverySubsidy.description) && L.f(this.validationToken, deliverySubsidy.validationToken) && L.f(this.image, deliverySubsidy.image) && L.f(this.subsidyBadge, deliverySubsidy.subsidyBadge) && L.f(this.promoDisplaying, deliverySubsidy.promoDisplaying) && L.f(this.promoCampaignId, deliverySubsidy.promoCampaignId);
    }

    @l
    public final DeliverySubsidyBadge getBadge() {
        return this.badge;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @l
    public final String getOriginalSubsidy() {
        return this.originalSubsidy;
    }

    @l
    public final String getPrice() {
        return this.price;
    }

    @l
    public final String getPromoCampaignId() {
        return this.promoCampaignId;
    }

    @l
    public final PromoDisplaying getPromoDisplaying() {
        return this.promoDisplaying;
    }

    @k
    public final String getSubsidy() {
        return this.subsidy;
    }

    @l
    public final String getSubsidyBadge() {
        return this.subsidyBadge;
    }

    @l
    public final String getSubsidyDisplaying() {
        return this.subsidyDisplaying;
    }

    @l
    public final String getValidationToken() {
        return this.validationToken;
    }

    public int hashCode() {
        int iHashCode = this.subsidy.hashCode() * 31;
        String str = this.originalSubsidy;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subsidyDisplaying;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.price;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DeliverySubsidyBadge deliverySubsidyBadge = this.badge;
        int iHashCode5 = (iHashCode4 + (deliverySubsidyBadge == null ? 0 : deliverySubsidyBadge.hashCode())) * 31;
        String str4 = this.id;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.validationToken;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Image image = this.image;
        int iHashCode9 = (iHashCode8 + (image == null ? 0 : image.hashCode())) * 31;
        String str7 = this.subsidyBadge;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        PromoDisplaying promoDisplaying = this.promoDisplaying;
        int iHashCode11 = (iHashCode10 + (promoDisplaying == null ? 0 : promoDisplaying.hashCode())) * 31;
        String str8 = this.promoCampaignId;
        return iHashCode11 + (str8 != null ? str8.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeliverySubsidy(subsidy=");
        sb2.append(this.subsidy);
        sb2.append(", originalSubsidy=");
        sb2.append(this.originalSubsidy);
        sb2.append(", subsidyDisplaying=");
        sb2.append(this.subsidyDisplaying);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", badge=");
        sb2.append(this.badge);
        sb2.append(", id=");
        sb2.append(this.id);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", validationToken=");
        sb2.append(this.validationToken);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", subsidyBadge=");
        sb2.append(this.subsidyBadge);
        sb2.append(", promoDisplaying=");
        sb2.append(this.promoDisplaying);
        sb2.append(", promoCampaignId=");
        return C22026a.c(sb2, this.promoCampaignId, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.subsidy);
        parcel.writeString(this.originalSubsidy);
        parcel.writeString(this.subsidyDisplaying);
        parcel.writeString(this.price);
        DeliverySubsidyBadge deliverySubsidyBadge = this.badge;
        if (deliverySubsidyBadge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            deliverySubsidyBadge.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.id);
        parcel.writeString(this.description);
        parcel.writeString(this.validationToken);
        parcel.writeParcelable(this.image, flags);
        parcel.writeString(this.subsidyBadge);
        PromoDisplaying promoDisplaying = this.promoDisplaying;
        if (promoDisplaying == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promoDisplaying.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.promoCampaignId);
    }

    public /* synthetic */ DeliverySubsidy(String str, String str2, String str3, String str4, DeliverySubsidyBadge deliverySubsidyBadge, String str5, String str6, String str7, Image image, String str8, PromoDisplaying promoDisplaying, String str9, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, str3, str4, deliverySubsidyBadge, str5, str6, str7, image, (i12 & 512) != 0 ? null : str8, (i12 & 1024) != 0 ? null : promoDisplaying, (i12 & 2048) != 0 ? null : str9);
    }
}

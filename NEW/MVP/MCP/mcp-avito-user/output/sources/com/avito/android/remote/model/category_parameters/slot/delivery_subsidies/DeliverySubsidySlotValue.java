package com.avito.android.remote.model.category_parameters.slot.delivery_subsidies;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.SlotValue;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliverySubsidiesSlot.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJL\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000b¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidySlotValue;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotValue;", "", DeliverySubsidiesSlotKt.SUBSIDY_ID, DeliverySubsidiesSlotKt.AMOUNT, DeliverySubsidiesSlotKt.ORIGINAL_AMOUNT, DeliverySubsidiesSlotKt.VALIDATION_TOKEN, DeliverySubsidiesSlotKt.PROMO_CAMPAIGN_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidySlotValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSubsidyId", "getAmount", "getOriginalAmount", "getValidationToken", "getPromoCampaignId", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DeliverySubsidySlotValue implements SlotValue {

    @k
    public static final Parcelable.Creator<DeliverySubsidySlotValue> CREATOR = new Creator();

    @c(DeliverySubsidiesSlotKt.AMOUNT)
    @l
    private final String amount;

    @c(DeliverySubsidiesSlotKt.ORIGINAL_AMOUNT)
    @l
    private final String originalAmount;

    @c(DeliverySubsidiesSlotKt.PROMO_CAMPAIGN_ID)
    @l
    private final String promoCampaignId;

    @c(DeliverySubsidiesSlotKt.SUBSIDY_ID)
    @l
    private final String subsidyId;

    @c(DeliverySubsidiesSlotKt.VALIDATION_TOKEN)
    @l
    private final String validationToken;

    /* compiled from: DeliverySubsidiesSlot.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliverySubsidySlotValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliverySubsidySlotValue createFromParcel(@k Parcel parcel) {
            return new DeliverySubsidySlotValue(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliverySubsidySlotValue[] newArray(int i12) {
            return new DeliverySubsidySlotValue[i12];
        }
    }

    public DeliverySubsidySlotValue(@l String str, @l String str2, @l String str3, @l String str4, @l String str5) {
        this.subsidyId = str;
        this.amount = str2;
        this.originalAmount = str3;
        this.validationToken = str4;
        this.promoCampaignId = str5;
    }

    public static /* synthetic */ DeliverySubsidySlotValue copy$default(DeliverySubsidySlotValue deliverySubsidySlotValue, String str, String str2, String str3, String str4, String str5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = deliverySubsidySlotValue.subsidyId;
        }
        if ((i12 & 2) != 0) {
            str2 = deliverySubsidySlotValue.amount;
        }
        String str6 = str2;
        if ((i12 & 4) != 0) {
            str3 = deliverySubsidySlotValue.originalAmount;
        }
        String str7 = str3;
        if ((i12 & 8) != 0) {
            str4 = deliverySubsidySlotValue.validationToken;
        }
        String str8 = str4;
        if ((i12 & 16) != 0) {
            str5 = deliverySubsidySlotValue.promoCampaignId;
        }
        return deliverySubsidySlotValue.copy(str, str6, str7, str8, str5);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getSubsidyId() {
        return this.subsidyId;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getOriginalAmount() {
        return this.originalAmount;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getValidationToken() {
        return this.validationToken;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getPromoCampaignId() {
        return this.promoCampaignId;
    }

    @k
    public final DeliverySubsidySlotValue copy(@l String subsidyId, @l String amount, @l String originalAmount, @l String validationToken, @l String promoCampaignId) {
        return new DeliverySubsidySlotValue(subsidyId, amount, originalAmount, validationToken, promoCampaignId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliverySubsidySlotValue)) {
            return false;
        }
        DeliverySubsidySlotValue deliverySubsidySlotValue = (DeliverySubsidySlotValue) other;
        return L.f(this.subsidyId, deliverySubsidySlotValue.subsidyId) && L.f(this.amount, deliverySubsidySlotValue.amount) && L.f(this.originalAmount, deliverySubsidySlotValue.originalAmount) && L.f(this.validationToken, deliverySubsidySlotValue.validationToken) && L.f(this.promoCampaignId, deliverySubsidySlotValue.promoCampaignId);
    }

    @l
    public final String getAmount() {
        return this.amount;
    }

    @l
    public final String getOriginalAmount() {
        return this.originalAmount;
    }

    @l
    public final String getPromoCampaignId() {
        return this.promoCampaignId;
    }

    @l
    public final String getSubsidyId() {
        return this.subsidyId;
    }

    @l
    public final String getValidationToken() {
        return this.validationToken;
    }

    public int hashCode() {
        String str = this.subsidyId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.amount;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.originalAmount;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.validationToken;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.promoCampaignId;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeliverySubsidySlotValue(subsidyId=");
        sb2.append(this.subsidyId);
        sb2.append(", amount=");
        sb2.append(this.amount);
        sb2.append(", originalAmount=");
        sb2.append(this.originalAmount);
        sb2.append(", validationToken=");
        sb2.append(this.validationToken);
        sb2.append(", promoCampaignId=");
        return C22026a.c(sb2, this.promoCampaignId, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.subsidyId);
        parcel.writeString(this.amount);
        parcel.writeString(this.originalAmount);
        parcel.writeString(this.validationToken);
        parcel.writeString(this.promoCampaignId);
    }
}

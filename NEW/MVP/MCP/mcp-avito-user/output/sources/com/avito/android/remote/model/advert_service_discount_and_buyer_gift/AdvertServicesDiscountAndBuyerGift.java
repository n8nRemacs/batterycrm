package com.avito.android.remote.model.advert_service_discount_and_buyer_gift;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlotKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertServicesDiscountAndBuyerGift.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/advert_service_discount_and_buyer_gift/AdvertServicesDiscountAndBuyerGift;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/advert_service_discount_and_buyer_gift/AdvertServicesDiscountAndBuyerGift$Discount;", "discount", "Lcom/avito/android/remote/model/advert_service_discount_and_buyer_gift/AdvertServicesDiscountAndBuyerGift$Gift;", "gift", "<init>", "(Lcom/avito/android/remote/model/advert_service_discount_and_buyer_gift/AdvertServicesDiscountAndBuyerGift$Discount;Lcom/avito/android/remote/model/advert_service_discount_and_buyer_gift/AdvertServicesDiscountAndBuyerGift$Gift;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/advert_service_discount_and_buyer_gift/AdvertServicesDiscountAndBuyerGift$Discount;", "getDiscount", "()Lcom/avito/android/remote/model/advert_service_discount_and_buyer_gift/AdvertServicesDiscountAndBuyerGift$Discount;", "Lcom/avito/android/remote/model/advert_service_discount_and_buyer_gift/AdvertServicesDiscountAndBuyerGift$Gift;", "getGift", "()Lcom/avito/android/remote/model/advert_service_discount_and_buyer_gift/AdvertServicesDiscountAndBuyerGift$Gift;", "Discount", "Gift", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertServicesDiscountAndBuyerGift implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertServicesDiscountAndBuyerGift> CREATOR = new Creator();

    @c("discount")
    @l
    private final Discount discount;

    @c("gift")
    @l
    private final Gift gift;

    /* compiled from: AdvertServicesDiscountAndBuyerGift.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertServicesDiscountAndBuyerGift> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertServicesDiscountAndBuyerGift createFromParcel(@k Parcel parcel) {
            return new AdvertServicesDiscountAndBuyerGift(parcel.readInt() == 0 ? null : Discount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Gift.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertServicesDiscountAndBuyerGift[] newArray(int i12) {
            return new AdvertServicesDiscountAndBuyerGift[i12];
        }
    }

    /* compiled from: AdvertServicesDiscountAndBuyerGift.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/advert_service_discount_and_buyer_gift/AdvertServicesDiscountAndBuyerGift$Discount;", "Landroid/os/Parcelable;", "", "title", DeliverySubsidiesSlotKt.AMOUNT, "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getAmount", "getDescription", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Discount implements Parcelable {

        @k
        public static final Parcelable.Creator<Discount> CREATOR = new Creator();

        @c(DeliverySubsidiesSlotKt.AMOUNT)
        @l
        private final String amount;

        @c("description")
        @l
        private final String description;

        @c("title")
        @l
        private final String title;

        /* compiled from: AdvertServicesDiscountAndBuyerGift.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Discount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Discount createFromParcel(@k Parcel parcel) {
                return new Discount(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Discount[] newArray(int i12) {
                return new Discount[i12];
            }
        }

        public Discount(@l String str, @l String str2, @l String str3) {
            this.title = str;
            this.amount = str2;
            this.description = str3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getAmount() {
            return this.amount;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.amount);
            parcel.writeString(this.description);
        }
    }

    /* compiled from: AdvertServicesDiscountAndBuyerGift.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/advert_service_discount_and_buyer_gift/AdvertServicesDiscountAndBuyerGift$Gift;", "Landroid/os/Parcelable;", "", "title", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Gift implements Parcelable {

        @k
        public static final Parcelable.Creator<Gift> CREATOR = new Creator();

        @c("description")
        @l
        private final String description;

        @c("title")
        @l
        private final String title;

        /* compiled from: AdvertServicesDiscountAndBuyerGift.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Gift> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Gift createFromParcel(@k Parcel parcel) {
                return new Gift(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Gift[] newArray(int i12) {
                return new Gift[i12];
            }
        }

        public Gift(@l String str, @l String str2) {
            this.title = str;
            this.description = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.description);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdvertServicesDiscountAndBuyerGift() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Discount getDiscount() {
        return this.discount;
    }

    @l
    public final Gift getGift() {
        return this.gift;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Discount discount = this.discount;
        if (discount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            discount.writeToParcel(parcel, flags);
        }
        Gift gift = this.gift;
        if (gift == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gift.writeToParcel(parcel, flags);
        }
    }

    public AdvertServicesDiscountAndBuyerGift(@l Discount discount, @l Gift gift) {
        this.discount = discount;
        this.gift = gift;
    }

    public /* synthetic */ AdvertServicesDiscountAndBuyerGift(Discount discount, Gift gift, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : discount, (i12 & 2) != 0 ? null : gift);
    }
}

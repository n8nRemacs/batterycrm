package com.avito.android.remote.model.category_parameters.slot.delivery_seller;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.SlotValue;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeliverySellerSlotValue.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_seller/DeliverySellerSlotValue;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotValue;", "", "sellerType", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSellerType", "()Ljava/lang/String;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliverySellerSlotValue implements SlotValue {

    @k
    public static final Parcelable.Creator<DeliverySellerSlotValue> CREATOR = new Creator();

    @c("sellerType")
    @l
    private final String sellerType;

    /* compiled from: DeliverySellerSlotValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliverySellerSlotValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliverySellerSlotValue createFromParcel(@k Parcel parcel) {
            return new DeliverySellerSlotValue(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliverySellerSlotValue[] newArray(int i12) {
            return new DeliverySellerSlotValue[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeliverySellerSlotValue() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getSellerType() {
        return this.sellerType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.sellerType);
    }

    public DeliverySellerSlotValue(@l String str) {
        this.sellerType = str;
    }

    public /* synthetic */ DeliverySellerSlotValue(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str);
    }
}

package com.avito.android.remote.model.category_parameters.slot.select_address_in_list;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectAddressInListSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\tJ \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/select_address_in_list/SelectAddressInListSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "", "verticalId", "Lcom/avito/android/remote/model/category_parameters/AddressParameter;", "selectedAddress", "<init>", "(ILcom/avito/android/remote/model/category_parameters/AddressParameter;)V", "component1", "()I", "component2", "()Lcom/avito/android/remote/model/category_parameters/AddressParameter;", "copy", "(ILcom/avito/android/remote/model/category_parameters/AddressParameter;)Lcom/avito/android/remote/model/category_parameters/slot/select_address_in_list/SelectAddressInListSlotConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getVerticalId", "Lcom/avito/android/remote/model/category_parameters/AddressParameter;", "getSelectedAddress", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SelectAddressInListSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<SelectAddressInListSlotConfig> CREATOR = new Creator();

    @c("field")
    @l
    private final AddressParameter selectedAddress;

    @c("verticalId")
    private final int verticalId;

    /* compiled from: SelectAddressInListSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectAddressInListSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SelectAddressInListSlotConfig createFromParcel(@k Parcel parcel) {
            return new SelectAddressInListSlotConfig(parcel.readInt(), (AddressParameter) parcel.readParcelable(SelectAddressInListSlotConfig.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SelectAddressInListSlotConfig[] newArray(int i12) {
            return new SelectAddressInListSlotConfig[i12];
        }
    }

    public SelectAddressInListSlotConfig(int i12, @l AddressParameter addressParameter) {
        this.verticalId = i12;
        this.selectedAddress = addressParameter;
    }

    public static /* synthetic */ SelectAddressInListSlotConfig copy$default(SelectAddressInListSlotConfig selectAddressInListSlotConfig, int i12, AddressParameter addressParameter, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = selectAddressInListSlotConfig.verticalId;
        }
        if ((i13 & 2) != 0) {
            addressParameter = selectAddressInListSlotConfig.selectedAddress;
        }
        return selectAddressInListSlotConfig.copy(i12, addressParameter);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVerticalId() {
        return this.verticalId;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AddressParameter getSelectedAddress() {
        return this.selectedAddress;
    }

    @k
    public final SelectAddressInListSlotConfig copy(int verticalId, @l AddressParameter selectedAddress) {
        return new SelectAddressInListSlotConfig(verticalId, selectedAddress);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectAddressInListSlotConfig)) {
            return false;
        }
        SelectAddressInListSlotConfig selectAddressInListSlotConfig = (SelectAddressInListSlotConfig) other;
        return this.verticalId == selectAddressInListSlotConfig.verticalId && L.f(this.selectedAddress, selectAddressInListSlotConfig.selectedAddress);
    }

    @l
    public final AddressParameter getSelectedAddress() {
        return this.selectedAddress;
    }

    public final int getVerticalId() {
        return this.verticalId;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.verticalId) * 31;
        AddressParameter addressParameter = this.selectedAddress;
        return iHashCode + (addressParameter == null ? 0 : addressParameter.hashCode());
    }

    @k
    public String toString() {
        return "SelectAddressInListSlotConfig(verticalId=" + this.verticalId + ", selectedAddress=" + this.selectedAddress + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.verticalId);
        parcel.writeParcelable(this.selectedAddress, flags);
    }
}

package com.avito.android.remote.model.category_parameters.slot.delivery_addresses;

import K51.d;
import TV0.a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryAddressesSlotValue.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J^\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0013J\u001a\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010\u0013J \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b5\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b6\u0010\u0019¨\u00067"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_addresses/AddressInfo;", "Landroid/os/Parcelable;", "LTV0/a;", "", "id", "", "addressId", SearchParamsConverterKt.LOCATION_ID, "", AddressParameter.TYPE, "", "deliveryPvz", "deliveryCourier", "deliveryPostamat", "<init>", "(JILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()J", "component2", "()I", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/String;", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "copy", "(JILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/slot/delivery_addresses/AddressInfo;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getId", "I", "getAddressId", "Ljava/lang/Integer;", "getLocationId", "Ljava/lang/String;", "getAddress", "Ljava/lang/Boolean;", "getDeliveryPvz", "getDeliveryCourier", "getDeliveryPostamat", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AddressInfo implements Parcelable, a {

    @k
    public static final Parcelable.Creator<AddressInfo> CREATOR = new Creator();

    @c(AddressParameter.TYPE)
    @k
    private final String address;

    @c("addressId")
    private final int addressId;

    @c("deliveryCourier")
    @l
    private final Boolean deliveryCourier;

    @c("deliveryPostamat")
    @l
    private final Boolean deliveryPostamat;

    @c("deliveryPvz")
    @l
    private final Boolean deliveryPvz;

    @c("id")
    private final long id;

    @c(SearchParamsConverterKt.LOCATION_ID)
    @l
    private final Integer locationId;

    /* compiled from: DeliveryAddressesSlotValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AddressInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AddressInfo createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            long j12 = parcel.readLong();
            int i12 = parcel.readInt();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AddressInfo(j12, i12, numValueOf, string, boolValueOf, boolValueOf2, boolValueOf3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AddressInfo[] newArray(int i12) {
            return new AddressInfo[i12];
        }
    }

    public AddressInfo(long j12, int i12, @l Integer num, @k String str, @l Boolean bool, @l Boolean bool2, @l Boolean bool3) {
        this.id = j12;
        this.addressId = i12;
        this.locationId = num;
        this.address = str;
        this.deliveryPvz = bool;
        this.deliveryCourier = bool2;
        this.deliveryPostamat = bool3;
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAddressId() {
        return this.addressId;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getLocationId() {
        return this.locationId;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getDeliveryPvz() {
        return this.deliveryPvz;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getDeliveryCourier() {
        return this.deliveryCourier;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getDeliveryPostamat() {
        return this.deliveryPostamat;
    }

    @k
    public final AddressInfo copy(long id2, int addressId, @l Integer locationId, @k String address, @l Boolean deliveryPvz, @l Boolean deliveryCourier, @l Boolean deliveryPostamat) {
        return new AddressInfo(id2, addressId, locationId, address, deliveryPvz, deliveryCourier, deliveryPostamat);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressInfo)) {
            return false;
        }
        AddressInfo addressInfo = (AddressInfo) other;
        return this.id == addressInfo.id && this.addressId == addressInfo.addressId && L.f(this.locationId, addressInfo.locationId) && L.f(this.address, addressInfo.address) && L.f(this.deliveryPvz, addressInfo.deliveryPvz) && L.f(this.deliveryCourier, addressInfo.deliveryCourier) && L.f(this.deliveryPostamat, addressInfo.deliveryPostamat);
    }

    @k
    public final String getAddress() {
        return this.address;
    }

    public final int getAddressId() {
        return this.addressId;
    }

    @l
    public final Boolean getDeliveryCourier() {
        return this.deliveryCourier;
    }

    @l
    public final Boolean getDeliveryPostamat() {
        return this.deliveryPostamat;
    }

    @l
    public final Boolean getDeliveryPvz() {
        return this.deliveryPvz;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public long getF78710b() {
        return this.id;
    }

    @l
    public final Integer getLocationId() {
        return this.locationId;
    }

    public int hashCode() {
        int iE2 = r.e(this.addressId, Long.hashCode(this.id) * 31, 31);
        Integer num = this.locationId;
        int iD2 = H.d((iE2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.address);
        Boolean bool = this.deliveryPvz;
        int iHashCode = (iD2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.deliveryCourier;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.deliveryPostamat;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AddressInfo(id=");
        sb2.append(this.id);
        sb2.append(", addressId=");
        sb2.append(this.addressId);
        sb2.append(", locationId=");
        sb2.append(this.locationId);
        sb2.append(", address=");
        sb2.append(this.address);
        sb2.append(", deliveryPvz=");
        sb2.append(this.deliveryPvz);
        sb2.append(", deliveryCourier=");
        sb2.append(this.deliveryCourier);
        sb2.append(", deliveryPostamat=");
        return C0.g(sb2, this.deliveryPostamat, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeLong(this.id);
        parcel.writeInt(this.addressId);
        Integer num = this.locationId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.address);
        Boolean bool = this.deliveryPvz;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.deliveryCourier;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Boolean bool3 = this.deliveryPostamat;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
    }
}

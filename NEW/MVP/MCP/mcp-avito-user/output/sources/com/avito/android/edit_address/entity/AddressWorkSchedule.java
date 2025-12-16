package com.avito.android.edit_address.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AddressWorkSchedule.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_address/entity/AddressWorkSchedule;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AddressWorkSchedule implements Parcelable {

    @k
    public static final Parcelable.Creator<AddressWorkSchedule> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f145895b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f145896c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AddressDaysArray f145897d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final TimeInterval f145898e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final TimeInterval f145899f;

    /* compiled from: AddressWorkSchedule.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddressWorkSchedule> {
        @Override // android.os.Parcelable.Creator
        public final AddressWorkSchedule createFromParcel(Parcel parcel) {
            return new AddressWorkSchedule(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AddressDaysArray.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TimeInterval.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TimeInterval.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AddressWorkSchedule[] newArray(int i12) {
            return new AddressWorkSchedule[i12];
        }
    }

    public AddressWorkSchedule(@k String str, @l String str2, @l AddressDaysArray addressDaysArray, @l TimeInterval timeInterval, @l TimeInterval timeInterval2) {
        this.f145895b = str;
        this.f145896c = str2;
        this.f145897d = addressDaysArray;
        this.f145898e = timeInterval;
        this.f145899f = timeInterval2;
    }

    public static AddressWorkSchedule a(AddressWorkSchedule addressWorkSchedule, AddressDaysArray addressDaysArray, TimeInterval timeInterval, TimeInterval timeInterval2, int i12) {
        String str = addressWorkSchedule.f145895b;
        String str2 = addressWorkSchedule.f145896c;
        if ((i12 & 4) != 0) {
            addressDaysArray = addressWorkSchedule.f145897d;
        }
        AddressDaysArray addressDaysArray2 = addressDaysArray;
        if ((i12 & 8) != 0) {
            timeInterval = addressWorkSchedule.f145898e;
        }
        TimeInterval timeInterval3 = timeInterval;
        if ((i12 & 16) != 0) {
            timeInterval2 = addressWorkSchedule.f145899f;
        }
        addressWorkSchedule.getClass();
        return new AddressWorkSchedule(str, str2, addressDaysArray2, timeInterval3, timeInterval2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressWorkSchedule)) {
            return false;
        }
        AddressWorkSchedule addressWorkSchedule = (AddressWorkSchedule) obj;
        return L.f(this.f145895b, addressWorkSchedule.f145895b) && L.f(this.f145896c, addressWorkSchedule.f145896c) && L.f(this.f145897d, addressWorkSchedule.f145897d) && L.f(this.f145898e, addressWorkSchedule.f145898e) && L.f(this.f145899f, addressWorkSchedule.f145899f);
    }

    public final int hashCode() {
        int iHashCode = this.f145895b.hashCode() * 31;
        String str = this.f145896c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AddressDaysArray addressDaysArray = this.f145897d;
        int iHashCode3 = (iHashCode2 + (addressDaysArray == null ? 0 : addressDaysArray.hashCode())) * 31;
        TimeInterval timeInterval = this.f145898e;
        int iHashCode4 = (iHashCode3 + (timeInterval == null ? 0 : timeInterval.hashCode())) * 31;
        TimeInterval timeInterval2 = this.f145899f;
        return iHashCode4 + (timeInterval2 != null ? timeInterval2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "AddressWorkSchedule(id=" + this.f145895b + ", formattedName=" + this.f145896c + ", days=" + this.f145897d + ", workInterval=" + this.f145898e + ", breakInterval=" + this.f145899f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f145895b);
        parcel.writeString(this.f145896c);
        AddressDaysArray addressDaysArray = this.f145897d;
        if (addressDaysArray == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressDaysArray.writeToParcel(parcel, i12);
        }
        TimeInterval timeInterval = this.f145898e;
        if (timeInterval == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            timeInterval.writeToParcel(parcel, i12);
        }
        TimeInterval timeInterval2 = this.f145899f;
        if (timeInterval2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            timeInterval2.writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ AddressWorkSchedule(String str, String str2, AddressDaysArray addressDaysArray, TimeInterval timeInterval, TimeInterval timeInterval2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : addressDaysArray, (i12 & 8) != 0 ? null : timeInterval, (i12 & 16) != 0 ? null : timeInterval2);
    }
}

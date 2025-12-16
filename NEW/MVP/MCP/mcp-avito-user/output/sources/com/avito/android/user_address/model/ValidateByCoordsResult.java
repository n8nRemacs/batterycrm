package com.avito.android.user_address.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ValidateByCoordsResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0002\u001a\u0011B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/avito/android/user_address/model/ValidateByCoordsResult;", "", "", "isValid", "Lcom/avito/android/user_address/model/ValidateByCoordsResult$Address;", AddressParameter.TYPE, "", "addressText", "Lcom/avito/android/user_address/model/ValidateByCoordsResult$a;", "coords", "invalidAddressMessage", "<init>", "(ZLcom/avito/android/user_address/model/ValidateByCoordsResult$Address;Ljava/lang/String;Lcom/avito/android/user_address/model/ValidateByCoordsResult$a;Ljava/lang/String;)V", "Z", "c", "()Z", "Lcom/avito/android/user_address/model/ValidateByCoordsResult$Address;", "a", "()Lcom/avito/android/user_address/model/ValidateByCoordsResult$Address;", "Ljava/lang/String;", "getAddressText", "()Ljava/lang/String;", "Lcom/avito/android/user_address/model/ValidateByCoordsResult$a;", "getCoords", "()Lcom/avito/android/user_address/model/ValidateByCoordsResult$a;", "b", "Address", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ValidateByCoordsResult {

    @c(AddressParameter.TYPE)
    @k
    private final Address address;

    @c("addressText")
    @k
    private final String addressText;

    @c("coords")
    @l
    private final a coords;

    @c("invalidAddressMessage")
    @l
    private final String invalidAddressMessage;

    @c("isValid")
    private final boolean isValid;

    /* compiled from: ValidateByCoordsResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\f"}, d2 = {"Lcom/avito/android/user_address/model/ValidateByCoordsResult$Address;", "Landroid/os/Parcelable;", "", "house", "locality", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "a", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Address implements Parcelable {

        @k
        public static final Parcelable.Creator<Address> CREATOR;

        @c("house")
        @k
        private final String house;

        @c("locality")
        @k
        private final String locality;

        /* compiled from: ValidateByCoordsResult.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_address/model/ValidateByCoordsResult$Address$a;", "", "<init>", "()V", "", "ADDRESS_DELIMETER", "Ljava/lang/String;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        /* compiled from: ValidateByCoordsResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Address> {
            @Override // android.os.Parcelable.Creator
            public final Address createFromParcel(Parcel parcel) {
                return new Address(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Address[] newArray(int i12) {
                return new Address[i12];
            }
        }

        static {
            new a(null);
            CREATOR = new b();
        }

        public Address(@k String str, @k String str2) {
            this.house = str;
            this.locality = str2;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getHouse() {
            return this.house;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final String getLocality() {
            return this.locality;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @k
        public final String e() {
            if (this.house.length() <= 0) {
                return this.locality;
            }
            return this.locality + ", " + this.house;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Address)) {
                return false;
            }
            Address address = (Address) obj;
            return L.f(this.house, address.house) && L.f(this.locality, address.locality);
        }

        public final int hashCode() {
            return this.locality.hashCode() + (this.house.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Address(house=");
            sb2.append(this.house);
            sb2.append(", locality=");
            return C22026a.c(sb2, this.locality, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.house);
            parcel.writeString(this.locality);
        }
    }

    /* compiled from: ValidateByCoordsResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/user_address/model/ValidateByCoordsResult$a;", "", "", "lat", AddressParameter.Value.LNG, "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "Ljava/lang/Double;", "getLat", "()Ljava/lang/Double;", "getLng", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        @c("lat")
        @l
        private final Double lat;

        @c(AddressParameter.Value.LNG)
        @l
        private final Double lng;

        public a(@l Double d12, @l Double d13) {
            this.lat = d12;
            this.lng = d13;
        }
    }

    public ValidateByCoordsResult(boolean z12, @k Address address, @k String str, @l a aVar, @l String str2) {
        this.isValid = z12;
        this.address = address;
        this.addressText = str;
        this.coords = aVar;
        this.invalidAddressMessage = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Address getAddress() {
        return this.address;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getInvalidAddressMessage() {
        return this.invalidAddressMessage;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }
}

package com.avito.android.sx_address;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.SxAddAddressSource;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SxNewAddressOpenParams.kt */
@d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/SxNewAddressOpenParams;", "Lcom/avito/android/sx_address/SxAddressControl;", "Address", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SxNewAddressOpenParams implements SxAddressControl {

    @k
    public static final Parcelable.Creator<SxNewAddressOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f292548b;

    /* renamed from: c, reason: collision with root package name */
    public final long f292549c;

    /* renamed from: d, reason: collision with root package name */
    public final long f292550d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Address f292551e;

    /* renamed from: f, reason: collision with root package name */
    public final int f292552f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SxAddAddressSource f292553g;

    /* compiled from: SxNewAddressOpenParams.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/SxNewAddressOpenParams$Address;", "Lcom/avito/android/util/OpenParams;", "Component", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Address implements OpenParams {

        @k
        public static final Parcelable.Creator<Address> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Component f292554b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Coordinates f292555c;

        /* compiled from: SxNewAddressOpenParams.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/SxNewAddressOpenParams$Address$Component;", "Lcom/avito/android/util/OpenParams;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Component implements OpenParams {

            @k
            public static final Parcelable.Creator<Component> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f292556b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f292557c;

            /* compiled from: SxNewAddressOpenParams.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Component> {
                @Override // android.os.Parcelable.Creator
                public final Component createFromParcel(Parcel parcel) {
                    return new Component(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Component[] newArray(int i12) {
                    return new Component[i12];
                }
            }

            public Component(@l String str, @k String str2) {
                this.f292556b = str;
                this.f292557c = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Component)) {
                    return false;
                }
                Component component = (Component) obj;
                return L.f(this.f292556b, component.f292556b) && L.f(this.f292557c, component.f292557c);
            }

            public final int hashCode() {
                String str = this.f292556b;
                return this.f292557c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Component(house=");
                sb2.append(this.f292556b);
                sb2.append(", location=");
                return C22026a.c(sb2, this.f292557c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f292556b);
                parcel.writeString(this.f292557c);
            }
        }

        /* compiled from: SxNewAddressOpenParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Address> {
            @Override // android.os.Parcelable.Creator
            public final Address createFromParcel(Parcel parcel) {
                return new Address(Component.CREATOR.createFromParcel(parcel), (Coordinates) parcel.readParcelable(Address.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Address[] newArray(int i12) {
                return new Address[i12];
            }
        }

        public Address(@k Component component, @k Coordinates coordinates) {
            this.f292554b = component;
            this.f292555c = coordinates;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Address)) {
                return false;
            }
            Address address = (Address) obj;
            return L.f(this.f292554b, address.f292554b) && L.f(this.f292555c, address.f292555c);
        }

        public final int hashCode() {
            return this.f292555c.hashCode() + (this.f292554b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Address(components=" + this.f292554b + ", coords=" + this.f292555c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f292554b.writeToParcel(parcel, i12);
            parcel.writeParcelable(this.f292555c, i12);
        }
    }

    /* compiled from: SxNewAddressOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SxNewAddressOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final SxNewAddressOpenParams createFromParcel(Parcel parcel) {
            return new SxNewAddressOpenParams(parcel.readString(), parcel.readLong(), parcel.readLong(), Address.CREATOR.createFromParcel(parcel), parcel.readInt(), SxAddAddressSource.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final SxNewAddressOpenParams[] newArray(int i12) {
            return new SxNewAddressOpenParams[i12];
        }
    }

    public SxNewAddressOpenParams(@l String str, long j12, long j13, @k Address address, int i12, @k SxAddAddressSource sxAddAddressSource) {
        this.f292548b = str;
        this.f292549c = j12;
        this.f292550d = j13;
        this.f292551e = address;
        this.f292552f = i12;
        this.f292553g = sxAddAddressSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SxNewAddressOpenParams)) {
            return false;
        }
        SxNewAddressOpenParams sxNewAddressOpenParams = (SxNewAddressOpenParams) obj;
        return L.f(this.f292548b, sxNewAddressOpenParams.f292548b) && this.f292549c == sxNewAddressOpenParams.f292549c && this.f292550d == sxNewAddressOpenParams.f292550d && L.f(this.f292551e, sxNewAddressOpenParams.f292551e) && this.f292552f == sxNewAddressOpenParams.f292552f && this.f292553g == sxNewAddressOpenParams.f292553g;
    }

    public final int hashCode() {
        String str = this.f292548b;
        return this.f292553g.hashCode() + r.e(this.f292552f, (this.f292551e.hashCode() + r.g(r.g((str == null ? 0 : str.hashCode()) * 31, 31, this.f292549c), 31, this.f292550d)) * 31, 31);
    }

    @k
    public final String toString() {
        return "SxNewAddressOpenParams(esid=" + this.f292548b + ", locationId=" + this.f292549c + ", addressId=" + this.f292550d + ", address=" + this.f292551e + ", verticalId=" + this.f292552f + ", source=" + this.f292553g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f292548b);
        parcel.writeLong(this.f292549c);
        parcel.writeLong(this.f292550d);
        this.f292551e.writeToParcel(parcel, i12);
        parcel.writeInt(this.f292552f);
        parcel.writeString(this.f292553g.name());
    }
}

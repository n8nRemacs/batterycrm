package com.avito.android.sx_address;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SxAddressDeeplinkResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sx_address/SxAddressAddResult;", "Lcom/avito/android/sx_address/SxAddressLinkResult;", "Failure", "Success", "Lcom/avito/android/sx_address/SxAddressAddResult$Failure;", "Lcom/avito/android/sx_address/SxAddressAddResult$Success;", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SxAddressAddResult extends SxAddressLinkResult {

    /* compiled from: SxAddressDeeplinkResult.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/SxAddressAddResult$Failure;", "Lcom/avito/android/sx_address/SxAddressAddResult;", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failure implements SxAddressAddResult {

        @k
        public static final Parcelable.Creator<Failure> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f292524b;

        /* compiled from: SxAddressDeeplinkResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Failure> {
            @Override // android.os.Parcelable.Creator
            public final Failure createFromParcel(Parcel parcel) {
                return new Failure((Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Failure[] newArray(int i12) {
                return new Failure[i12];
            }
        }

        public Failure(@k Throwable th2) {
            this.f292524b = th2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && L.f(this.f292524b, ((Failure) obj).f292524b);
        }

        public final int hashCode() {
            return this.f292524b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Failure(error="), this.f292524b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeSerializable(this.f292524b);
        }
    }

    /* compiled from: SxAddressDeeplinkResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/SxAddressAddResult$Success;", "Lcom/avito/android/sx_address/SxAddressAddResult;", "AddressData", "PublishValue", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Success implements SxAddressAddResult {

        @k
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f292525b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final PublishValue f292526c;

        /* compiled from: SxAddressDeeplinkResult.kt */
        @d
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/avito/android/sx_address/SxAddressAddResult$Success$AddressData;", "Landroid/os/Parcelable;", "", "house", "id", "", "isDisabled", "location", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getId", "Z", "e", "()Z", "d", "getName", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class AddressData implements Parcelable {

            @k
            public static final Parcelable.Creator<AddressData> CREATOR = new a();

            @c("house")
            @k
            private final String house;

            @c("id")
            @k
            private final String id;

            @c("isDisabled")
            private final boolean isDisabled;

            @c("location")
            @k
            private final String location;

            @c("name")
            @k
            private final String name;

            /* compiled from: SxAddressDeeplinkResult.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<AddressData> {
                @Override // android.os.Parcelable.Creator
                public final AddressData createFromParcel(Parcel parcel) {
                    return new AddressData(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final AddressData[] newArray(int i12) {
                    return new AddressData[i12];
                }
            }

            public AddressData(@k String str, @k String str2, boolean z12, @k String str3, @k String str4) {
                this.house = str;
                this.id = str2;
                this.isDisabled = z12;
                this.location = str3;
                this.name = str4;
            }

            @k
            /* renamed from: c, reason: from getter */
            public final String getHouse() {
                return this.house;
            }

            @k
            /* renamed from: d, reason: from getter */
            public final String getLocation() {
                return this.location;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* renamed from: e, reason: from getter */
            public final boolean getIsDisabled() {
                return this.isDisabled;
            }

            @k
            public final String getId() {
                return this.id;
            }

            @k
            public final String getName() {
                return this.name;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.house);
                parcel.writeString(this.id);
                parcel.writeInt(this.isDisabled ? 1 : 0);
                parcel.writeString(this.location);
                parcel.writeString(this.name);
            }
        }

        /* compiled from: SxAddressDeeplinkResult.kt */
        @d
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/sx_address/SxAddressAddResult$Success$PublishValue;", "Landroid/os/Parcelable;", "", AddressParameter.Value.JSON_WEB_TOKEN, "", "lat", AddressParameter.Value.LNG, "text", "Lcom/avito/android/sx_address/SxAddressAddResult$Success$AddressData;", "data", "<init>", "(Ljava/lang/String;DDLjava/lang/String;Lcom/avito/android/sx_address/SxAddressAddResult$Success$AddressData;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "D", "e", "()D", "f", "getText", "Lcom/avito/android/sx_address/SxAddressAddResult$Success$AddressData;", "c", "()Lcom/avito/android/sx_address/SxAddressAddResult$Success$AddressData;", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PublishValue implements Parcelable {

            @k
            public static final Parcelable.Creator<PublishValue> CREATOR = new a();

            @c("data")
            @l
            private final AddressData data;

            @c(AddressParameter.Value.JSON_WEB_TOKEN)
            @l
            private final String jwt;

            @c("lat")
            private final double lat;

            @c(AddressParameter.Value.LNG)
            private final double lng;

            @c("text")
            @k
            private final String text;

            /* compiled from: SxAddressDeeplinkResult.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<PublishValue> {
                @Override // android.os.Parcelable.Creator
                public final PublishValue createFromParcel(Parcel parcel) {
                    return new PublishValue(parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readInt() == 0 ? null : AddressData.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final PublishValue[] newArray(int i12) {
                    return new PublishValue[i12];
                }
            }

            public PublishValue(@l String str, double d12, double d13, @k String str2, @l AddressData addressData) {
                this.jwt = str;
                this.lat = d12;
                this.lng = d13;
                this.text = str2;
                this.data = addressData;
            }

            @l
            /* renamed from: c, reason: from getter */
            public final AddressData getData() {
                return this.data;
            }

            @l
            /* renamed from: d, reason: from getter */
            public final String getJwt() {
                return this.jwt;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* renamed from: e, reason: from getter */
            public final double getLat() {
                return this.lat;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PublishValue)) {
                    return false;
                }
                PublishValue publishValue = (PublishValue) obj;
                return L.f(this.jwt, publishValue.jwt) && Double.compare(this.lat, publishValue.lat) == 0 && Double.compare(this.lng, publishValue.lng) == 0 && L.f(this.text, publishValue.text) && L.f(this.data, publishValue.data);
            }

            /* renamed from: f, reason: from getter */
            public final double getLng() {
                return this.lng;
            }

            @k
            public final String getText() {
                return this.text;
            }

            public final int hashCode() {
                String str = this.jwt;
                int iD2 = H.d(e.d(e.d((str == null ? 0 : str.hashCode()) * 31, 31, this.lat), 31, this.lng), 31, this.text);
                AddressData addressData = this.data;
                return iD2 + (addressData != null ? addressData.hashCode() : 0);
            }

            @k
            public final String toString() {
                return "PublishValue(jwt=" + this.jwt + ", lat=" + this.lat + ", lng=" + this.lng + ", text=" + this.text + ", data=" + this.data + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.jwt);
                parcel.writeDouble(this.lat);
                parcel.writeDouble(this.lng);
                parcel.writeString(this.text);
                AddressData addressData = this.data;
                if (addressData == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    addressData.writeToParcel(parcel, i12);
                }
            }
        }

        /* compiled from: SxAddressDeeplinkResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                return new Success(parcel.readString(), parcel.readInt() == 0 ? null : PublishValue.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i12) {
                return new Success[i12];
            }
        }

        public Success(@l String str, @l PublishValue publishValue) {
            this.f292525b = str;
            this.f292526c = publishValue;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return L.f(this.f292525b, success.f292525b) && L.f(this.f292526c, success.f292526c);
        }

        public final int hashCode() {
            String str = this.f292525b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            PublishValue publishValue = this.f292526c;
            return iHashCode + (publishValue != null ? publishValue.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Success(address=" + this.f292525b + ", publishValue=" + this.f292526c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f292525b);
            PublishValue publishValue = this.f292526c;
            if (publishValue == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                publishValue.writeToParcel(parcel, i12);
            }
        }
    }
}

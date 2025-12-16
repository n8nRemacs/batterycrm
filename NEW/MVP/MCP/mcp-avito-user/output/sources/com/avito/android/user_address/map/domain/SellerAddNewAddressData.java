package com.avito.android.user_address.map.domain;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.SxAddAddressSource;
import com.avito.android.avito_map.AvitoMapPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SellerAddNewAddressData.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/map/domain/SellerAddNewAddressData;", "Landroid/os/Parcelable;", "Components", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SellerAddNewAddressData implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SellerAddNewAddressData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f307556b;

    /* renamed from: c, reason: collision with root package name */
    public final long f307557c;

    /* renamed from: d, reason: collision with root package name */
    public final long f307558d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Components f307559e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AvitoMapPoint f307560f;

    /* renamed from: g, reason: collision with root package name */
    public final int f307561g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Boolean f307562h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SxAddAddressSource f307563i;

    /* compiled from: SellerAddNewAddressData.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/domain/SellerAddNewAddressData$Components;", "Landroid/os/Parcelable;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Components implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Components> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f307564b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f307565c;

        /* compiled from: SellerAddNewAddressData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Components> {
            @Override // android.os.Parcelable.Creator
            public final Components createFromParcel(Parcel parcel) {
                return new Components(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Components[] newArray(int i12) {
                return new Components[i12];
            }
        }

        public Components(@Y61.l String str, @Y61.k String str2) {
            this.f307564b = str;
            this.f307565c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Components)) {
                return false;
            }
            Components components = (Components) obj;
            return L.f(this.f307564b, components.f307564b) && L.f(this.f307565c, components.f307565c);
        }

        public final int hashCode() {
            String str = this.f307564b;
            return this.f307565c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Components(house=");
            sb2.append(this.f307564b);
            sb2.append(", locality=");
            return C22026a.c(sb2, this.f307565c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f307564b);
            parcel.writeString(this.f307565c);
        }
    }

    /* compiled from: SellerAddNewAddressData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SellerAddNewAddressData> {
        @Override // android.os.Parcelable.Creator
        public final SellerAddNewAddressData createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            long j12 = parcel.readLong();
            long j13 = parcel.readLong();
            Components componentsCreateFromParcel = Components.CREATOR.createFromParcel(parcel);
            AvitoMapPoint avitoMapPoint = (AvitoMapPoint) parcel.readParcelable(SellerAddNewAddressData.class.getClassLoader());
            int i12 = parcel.readInt();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SellerAddNewAddressData(string, j12, j13, componentsCreateFromParcel, avitoMapPoint, i12, boolValueOf, SxAddAddressSource.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final SellerAddNewAddressData[] newArray(int i12) {
            return new SellerAddNewAddressData[i12];
        }
    }

    public SellerAddNewAddressData(@Y61.l String str, long j12, long j13, @Y61.k Components components, @Y61.k AvitoMapPoint avitoMapPoint, int i12, @Y61.l Boolean bool, @Y61.k SxAddAddressSource sxAddAddressSource) {
        this.f307556b = str;
        this.f307557c = j12;
        this.f307558d = j13;
        this.f307559e = components;
        this.f307560f = avitoMapPoint;
        this.f307561g = i12;
        this.f307562h = bool;
        this.f307563i = sxAddAddressSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerAddNewAddressData)) {
            return false;
        }
        SellerAddNewAddressData sellerAddNewAddressData = (SellerAddNewAddressData) obj;
        return L.f(this.f307556b, sellerAddNewAddressData.f307556b) && this.f307557c == sellerAddNewAddressData.f307557c && this.f307558d == sellerAddNewAddressData.f307558d && L.f(this.f307559e, sellerAddNewAddressData.f307559e) && L.f(this.f307560f, sellerAddNewAddressData.f307560f) && this.f307561g == sellerAddNewAddressData.f307561g && L.f(this.f307562h, sellerAddNewAddressData.f307562h) && this.f307563i == sellerAddNewAddressData.f307563i;
    }

    public final int hashCode() {
        String str = this.f307556b;
        int iE2 = r.e(this.f307561g, (this.f307560f.hashCode() + ((this.f307559e.hashCode() + r.g(r.g((str == null ? 0 : str.hashCode()) * 31, 31, this.f307557c), 31, this.f307558d)) * 31)) * 31, 31);
        Boolean bool = this.f307562h;
        return this.f307563i.hashCode() + ((iE2 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "SellerAddNewAddressData(esid=" + this.f307556b + ", addressId=" + this.f307557c + ", locationId=" + this.f307558d + ", components=" + this.f307559e + ", point=" + this.f307560f + ", verticalId=" + this.f307561g + ", showsSuccessToast=" + this.f307562h + ", source=" + this.f307563i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f307556b);
        parcel.writeLong(this.f307557c);
        parcel.writeLong(this.f307558d);
        this.f307559e.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f307560f, i12);
        parcel.writeInt(this.f307561g);
        Boolean bool = this.f307562h;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.f307563i.name());
    }

    public /* synthetic */ SellerAddNewAddressData(String str, long j12, long j13, Components components, AvitoMapPoint avitoMapPoint, int i12, Boolean bool, SxAddAddressSource sxAddAddressSource, int i13, C42822w c42822w) {
        this(str, j12, j13, components, avitoMapPoint, i12, bool, (i13 & 128) != 0 ? SxAddAddressSource.f67543b : sxAddAddressSource);
    }
}

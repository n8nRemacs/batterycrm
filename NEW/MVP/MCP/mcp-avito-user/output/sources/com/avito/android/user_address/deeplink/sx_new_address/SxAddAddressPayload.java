package com.avito.android.user_address.deeplink.sx_new_address;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.SxAddAddressSource;
import com.avito.android.remote.model.Coordinates;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SxAddressAddLinkHandler.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/deeplink/sx_new_address/SxAddAddressPayload;", "Landroid/os/Parcelable;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SxAddAddressPayload implements Parcelable {

    @k
    public static final Parcelable.Creator<SxAddAddressPayload> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f307268b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f307269c;

    /* renamed from: d, reason: collision with root package name */
    public final long f307270d;

    /* renamed from: e, reason: collision with root package name */
    public final long f307271e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Coordinates f307272f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f307273g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f307274h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final SxAddAddressSource f307275i;

    /* compiled from: SxAddressAddLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SxAddAddressPayload> {
        @Override // android.os.Parcelable.Creator
        public final SxAddAddressPayload createFromParcel(Parcel parcel) {
            return new SxAddAddressPayload(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), (Coordinates) parcel.readParcelable(SxAddAddressPayload.class.getClassLoader()), parcel.readString(), parcel.readString(), SxAddAddressSource.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final SxAddAddressPayload[] newArray(int i12) {
            return new SxAddAddressPayload[i12];
        }
    }

    public SxAddAddressPayload(@l String str, @k String str2, long j12, long j13, @k Coordinates coordinates, @l String str3, @k String str4, @k SxAddAddressSource sxAddAddressSource) {
        this.f307268b = str;
        this.f307269c = str2;
        this.f307270d = j12;
        this.f307271e = j13;
        this.f307272f = coordinates;
        this.f307273g = str3;
        this.f307274h = str4;
        this.f307275i = sxAddAddressSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SxAddAddressPayload)) {
            return false;
        }
        SxAddAddressPayload sxAddAddressPayload = (SxAddAddressPayload) obj;
        return L.f(this.f307268b, sxAddAddressPayload.f307268b) && L.f(this.f307269c, sxAddAddressPayload.f307269c) && this.f307270d == sxAddAddressPayload.f307270d && this.f307271e == sxAddAddressPayload.f307271e && L.f(this.f307272f, sxAddAddressPayload.f307272f) && L.f(this.f307273g, sxAddAddressPayload.f307273g) && L.f(this.f307274h, sxAddAddressPayload.f307274h) && this.f307275i == sxAddAddressPayload.f307275i;
    }

    public final int hashCode() {
        String str = this.f307268b;
        int iHashCode = (this.f307272f.hashCode() + r.g(r.g(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f307269c), 31, this.f307270d), 31, this.f307271e)) * 31;
        String str2 = this.f307273g;
        return this.f307275i.hashCode() + H.d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f307274h);
    }

    @k
    public final String toString() {
        return "SxAddAddressPayload(esid=" + this.f307268b + ", verticalId=" + this.f307269c + ", locationId=" + this.f307270d + ", addressId=" + this.f307271e + ", coords=" + this.f307272f + ", house=" + this.f307273g + ", location=" + this.f307274h + ", source=" + this.f307275i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f307268b);
        parcel.writeString(this.f307269c);
        parcel.writeLong(this.f307270d);
        parcel.writeLong(this.f307271e);
        parcel.writeParcelable(this.f307272f, i12);
        parcel.writeString(this.f307273g);
        parcel.writeString(this.f307274h);
        parcel.writeString(this.f307275i.name());
    }
}

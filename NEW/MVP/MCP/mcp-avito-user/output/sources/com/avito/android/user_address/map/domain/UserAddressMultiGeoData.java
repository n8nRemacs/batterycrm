package com.avito.android.user_address.map.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.user_address.model.ValidateByCoordsResult;
import kotlin.Metadata;

/* compiled from: UserAddressMultiGeoData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/domain/UserAddressMultiGeoData;", "Landroid/os/Parcelable;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserAddressMultiGeoData implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<UserAddressMultiGeoData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f307566b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f307567c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f307568d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f307569e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ValidateByCoordsResult.Address f307570f;

    /* renamed from: g, reason: collision with root package name */
    public final double f307571g;

    /* renamed from: h, reason: collision with root package name */
    public final double f307572h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f307573i;

    /* compiled from: UserAddressMultiGeoData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserAddressMultiGeoData> {
        @Override // android.os.Parcelable.Creator
        public final UserAddressMultiGeoData createFromParcel(Parcel parcel) {
            return new UserAddressMultiGeoData(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), ValidateByCoordsResult.Address.CREATOR.createFromParcel(parcel), parcel.readDouble(), parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserAddressMultiGeoData[] newArray(int i12) {
            return new UserAddressMultiGeoData[i12];
        }
    }

    public UserAddressMultiGeoData(@Y61.k String str, @Y61.k String str2, @Y61.l Integer num, @Y61.l Integer num2, @Y61.k ValidateByCoordsResult.Address address, double d12, double d13, @Y61.l String str3) {
        this.f307566b = str;
        this.f307567c = str2;
        this.f307568d = num;
        this.f307569e = num2;
        this.f307570f = address;
        this.f307571g = d12;
        this.f307572h = d13;
        this.f307573i = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f307566b);
        parcel.writeString(this.f307567c);
        Integer num = this.f307568d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f307569e;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        this.f307570f.writeToParcel(parcel, i12);
        parcel.writeDouble(this.f307571g);
        parcel.writeDouble(this.f307572h);
        parcel.writeString(this.f307573i);
    }
}

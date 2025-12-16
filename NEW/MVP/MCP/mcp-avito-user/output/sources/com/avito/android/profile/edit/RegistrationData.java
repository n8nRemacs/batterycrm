package com.avito.android.profile.edit;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: RegistrationData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/RegistrationData;", "Landroid/os/Parcelable;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RegistrationData implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<RegistrationData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f221993b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f221994c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f221995d;

    /* compiled from: RegistrationData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RegistrationData> {
        @Override // android.os.Parcelable.Creator
        public final RegistrationData createFromParcel(Parcel parcel) {
            return new RegistrationData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RegistrationData[] newArray(int i12) {
            return new RegistrationData[i12];
        }
    }

    public RegistrationData(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        this.f221993b = str;
        this.f221994c = str2;
        this.f221995d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f221993b);
        parcel.writeString(this.f221994c);
        parcel.writeString(this.f221995d);
    }
}

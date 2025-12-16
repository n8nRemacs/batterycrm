package com.avito.android.profile_settings_extended.adapter.phones;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: PhoneVerificationStatus.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/phones/PhoneVerificationStatusNotConfirmed;", "Lcom/avito/android/profile_settings_extended/adapter/phones/PhoneVerificationStatus;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PhoneVerificationStatusNotConfirmed extends PhoneVerificationStatus {

    @Y61.k
    public static final Parcelable.Creator<PhoneVerificationStatusNotConfirmed> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f229697c;

    /* compiled from: PhoneVerificationStatus.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhoneVerificationStatusNotConfirmed> {
        @Override // android.os.Parcelable.Creator
        public final PhoneVerificationStatusNotConfirmed createFromParcel(Parcel parcel) {
            return new PhoneVerificationStatusNotConfirmed(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneVerificationStatusNotConfirmed[] newArray(int i12) {
            return new PhoneVerificationStatusNotConfirmed[i12];
        }
    }

    public PhoneVerificationStatusNotConfirmed(@Y61.k String str) {
        super(str, null);
        this.f229697c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.profile_settings_extended.adapter.phones.PhoneVerificationStatus
    @Y61.k
    /* renamed from: getDescription, reason: from getter */
    public final String getF229697c() {
        return this.f229697c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f229697c);
    }
}

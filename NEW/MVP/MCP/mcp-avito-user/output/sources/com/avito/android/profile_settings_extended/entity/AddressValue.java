package com.avito.android.profile_settings_extended.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.edit_address.entity.ExtendedProfilesSettingsAddress;
import kotlin.Metadata;

/* compiled from: AddressValue.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/AddressValue;", "Lcom/avito/android/profile_settings_extended/entity/CommonValue;", "Lcom/avito/android/edit_address/entity/ExtendedProfilesSettingsAddress;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AddressValue implements CommonValue<ExtendedProfilesSettingsAddress> {

    @Y61.k
    public static final Parcelable.Creator<AddressValue> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfilesSettingsAddress f230253b;

    /* compiled from: AddressValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddressValue> {
        @Override // android.os.Parcelable.Creator
        public final AddressValue createFromParcel(Parcel parcel) {
            return new AddressValue(ExtendedProfilesSettingsAddress.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AddressValue[] newArray(int i12) {
            return new AddressValue[i12];
        }
    }

    public AddressValue(@Y61.k ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress) {
        this.f230253b = extendedProfilesSettingsAddress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f230253b.writeToParcel(parcel, i12);
    }
}

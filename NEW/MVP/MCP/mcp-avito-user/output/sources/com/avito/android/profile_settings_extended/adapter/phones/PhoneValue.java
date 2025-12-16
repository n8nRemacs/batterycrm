package com.avito.android.profile_settings_extended.adapter.phones;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.phones.ExtendedSettingsPhonesItem;
import com.avito.android.profile_settings_extended.entity.CommonValue;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedSettingsPhonesItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/phones/PhoneValue;", "Lcom/avito/android/profile_settings_extended/entity/CommonValue;", "Lcom/avito/android/profile_settings_extended/adapter/phones/ExtendedSettingsPhonesItem$Phone;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class PhoneValue implements CommonValue<ExtendedSettingsPhonesItem.Phone> {

    @Y61.k
    public static final Parcelable.Creator<PhoneValue> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ExtendedSettingsPhonesItem.Phone f229694b;

    /* compiled from: ExtendedSettingsPhonesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhoneValue> {
        @Override // android.os.Parcelable.Creator
        public final PhoneValue createFromParcel(Parcel parcel) {
            return new PhoneValue(ExtendedSettingsPhonesItem.Phone.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneValue[] newArray(int i12) {
            return new PhoneValue[i12];
        }
    }

    public PhoneValue(@Y61.k ExtendedSettingsPhonesItem.Phone phone) {
        this.f229694b = phone;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PhoneValue) && L.f(this.f229694b, ((PhoneValue) obj).f229694b);
    }

    public final int hashCode() {
        return this.f229694b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "PhoneValue(phone=" + this.f229694b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f229694b.writeToParcel(parcel, i12);
    }
}

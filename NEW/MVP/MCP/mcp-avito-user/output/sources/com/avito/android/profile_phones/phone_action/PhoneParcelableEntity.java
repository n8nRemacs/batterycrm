package com.avito.android.profile_phones.phone_action;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ParcelableEntity;
import kotlin.Metadata;

/* compiled from: PhoneParcelableEntity.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/PhoneParcelableEntity;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PhoneParcelableEntity implements ParcelableEntity<String> {

    @k
    public static final Parcelable.Creator<PhoneParcelableEntity> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f227261b;

    /* compiled from: PhoneParcelableEntity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhoneParcelableEntity> {
        @Override // android.os.Parcelable.Creator
        public final PhoneParcelableEntity createFromParcel(Parcel parcel) {
            return new PhoneParcelableEntity(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneParcelableEntity[] newArray(int i12) {
            return new PhoneParcelableEntity[i12];
        }
    }

    public PhoneParcelableEntity(@k String str) {
        this.f227261b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.Entity
    public final Object getId() {
        return this.f227261b;
    }

    @Override // com.avito.android.remote.model.Entity
    @k
    /* renamed from: getName, reason: from getter */
    public final String getF227261b() {
        return this.f227261b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f227261b);
    }
}

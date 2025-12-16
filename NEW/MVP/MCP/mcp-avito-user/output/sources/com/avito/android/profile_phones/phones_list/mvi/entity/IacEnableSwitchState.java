package com.avito.android.profile_phones.phones_list.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.H0;
import kotlin.Metadata;

/* compiled from: PhonesListMviState.kt */
@d
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/entity/IacEnableSwitchState;", "Landroid/os/Parcelable;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class IacEnableSwitchState implements Parcelable {

    @k
    public static final Parcelable.Creator<IacEnableSwitchState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f227974b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f227975c;

    /* compiled from: PhonesListMviState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacEnableSwitchState> {
        @Override // android.os.Parcelable.Creator
        public final IacEnableSwitchState createFromParcel(Parcel parcel) {
            return new IacEnableSwitchState(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final IacEnableSwitchState[] newArray(int i12) {
            return new IacEnableSwitchState[i12];
        }
    }

    public IacEnableSwitchState(boolean z12, boolean z13) {
        this.f227974b = z12;
        this.f227975c = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacEnableSwitchState)) {
            return false;
        }
        IacEnableSwitchState iacEnableSwitchState = (IacEnableSwitchState) obj;
        return this.f227974b == iacEnableSwitchState.f227974b && this.f227975c == iacEnableSwitchState.f227975c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227975c) + (Boolean.hashCode(this.f227974b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacEnableSwitchState(isChecked=");
        sb2.append(this.f227974b);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f227975c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f227974b ? 1 : 0);
        parcel.writeInt(this.f227975c ? 1 : 0);
    }
}

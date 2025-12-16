package com.avito.android.authorization.auto_recovery.recovery_availability;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: RecoveryAvailabilityFragment.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/recovery_availability/RecoveryAvailabilityArguments;", "Landroid/os/Parcelable;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RecoveryAvailabilityArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<RecoveryAvailabilityArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f93269b;

    /* compiled from: RecoveryAvailabilityFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RecoveryAvailabilityArguments> {
        @Override // android.os.Parcelable.Creator
        public final RecoveryAvailabilityArguments createFromParcel(Parcel parcel) {
            return new RecoveryAvailabilityArguments(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final RecoveryAvailabilityArguments[] newArray(int i12) {
            return new RecoveryAvailabilityArguments[i12];
        }
    }

    public RecoveryAvailabilityArguments(boolean z12) {
        this.f93269b = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecoveryAvailabilityArguments) && this.f93269b == ((RecoveryAvailabilityArguments) obj).f93269b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93269b);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("RecoveryAvailabilityArguments(isAvailable="), this.f93269b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f93269b ? 1 : 0);
    }
}

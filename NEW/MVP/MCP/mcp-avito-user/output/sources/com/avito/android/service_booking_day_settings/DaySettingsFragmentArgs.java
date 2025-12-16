package com.avito.android.service_booking_day_settings;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DaySettingsFragmentArgs.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/DaySettingsFragmentArgs;", "Landroid/os/Parcelable;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DaySettingsFragmentArgs implements Parcelable {

    @k
    public static final Parcelable.Creator<DaySettingsFragmentArgs> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f276684b;

    /* compiled from: DaySettingsFragmentArgs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DaySettingsFragmentArgs> {
        @Override // android.os.Parcelable.Creator
        public final DaySettingsFragmentArgs createFromParcel(Parcel parcel) {
            return new DaySettingsFragmentArgs(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DaySettingsFragmentArgs[] newArray(int i12) {
            return new DaySettingsFragmentArgs[i12];
        }
    }

    public DaySettingsFragmentArgs(@k String str) {
        this.f276684b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DaySettingsFragmentArgs) && L.f(this.f276684b, ((DaySettingsFragmentArgs) obj).f276684b);
    }

    public final int hashCode() {
        return this.f276684b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("DaySettingsFragmentArgs(day="), this.f276684b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f276684b);
    }
}

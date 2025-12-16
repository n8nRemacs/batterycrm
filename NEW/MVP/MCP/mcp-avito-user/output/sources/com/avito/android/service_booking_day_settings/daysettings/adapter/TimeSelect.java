package com.avito.android.service_booking_day_settings.daysettings.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SettingsBreakItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/adapter/TimeSelect;", "Landroid/os/Parcelable;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TimeSelect implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<TimeSelect> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final org.threeten.bp.g f276729b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f276730c;

    /* compiled from: SettingsBreakItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TimeSelect> {
        @Override // android.os.Parcelable.Creator
        public final TimeSelect createFromParcel(Parcel parcel) {
            return new TimeSelect((org.threeten.bp.g) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TimeSelect[] newArray(int i12) {
            return new TimeSelect[i12];
        }
    }

    public TimeSelect(@Y61.l org.threeten.bp.g gVar, boolean z12) {
        this.f276729b = gVar;
        this.f276730c = z12;
    }

    public static TimeSelect a(TimeSelect timeSelect, boolean z12) {
        org.threeten.bp.g gVar = timeSelect.f276729b;
        timeSelect.getClass();
        return new TimeSelect(gVar, z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeSelect)) {
            return false;
        }
        TimeSelect timeSelect = (TimeSelect) obj;
        return L.f(this.f276729b, timeSelect.f276729b) && this.f276730c == timeSelect.f276730c;
    }

    public final int hashCode() {
        org.threeten.bp.g gVar = this.f276729b;
        return Boolean.hashCode(this.f276730c) + ((gVar == null ? 0 : gVar.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimeSelect(time=");
        sb2.append(this.f276729b);
        sb2.append(", showError=");
        return r.x(sb2, this.f276730c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeSerializable(this.f276729b);
        parcel.writeInt(this.f276730c ? 1 : 0);
    }
}

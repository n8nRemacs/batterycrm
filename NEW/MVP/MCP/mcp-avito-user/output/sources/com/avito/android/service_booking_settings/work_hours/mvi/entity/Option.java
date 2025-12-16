package com.avito.android.service_booking_settings.work_hours.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.ParcelableEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingWorkHoursMviState.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/Option;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Option implements ParcelableEntity<String> {

    @k
    public static final Parcelable.Creator<Option> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f278053b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f278054c;

    /* compiled from: ServiceBookingWorkHoursMviState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Option> {
        @Override // android.os.Parcelable.Creator
        public final Option createFromParcel(Parcel parcel) {
            return new Option(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Option[] newArray(int i12) {
            return new Option[i12];
        }
    }

    public Option(@k String str, @k String str2) {
        this.f278053b = str;
        this.f278054c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Option)) {
            return false;
        }
        Option option = (Option) obj;
        return L.f(this.f278053b, option.f278053b) && L.f(this.f278054c, option.f278054c);
    }

    @Override // com.avito.android.remote.model.Entity
    public final Object getId() {
        return this.f278053b;
    }

    @Override // com.avito.android.remote.model.Entity
    @k
    /* renamed from: getName, reason: from getter */
    public final String getF278054c() {
        return this.f278054c;
    }

    public final int hashCode() {
        return this.f278054c.hashCode() + (this.f278053b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Option(id=");
        sb2.append(this.f278053b);
        sb2.append(", name=");
        return C22026a.c(sb2, this.f278054c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f278053b);
        parcel.writeString(this.f278054c);
    }
}

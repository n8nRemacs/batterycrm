package com.avito.android.edit_address.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: TimeInterval.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_address/entity/TimeInterval;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TimeInterval implements Parcelable {

    @k
    public static final Parcelable.Creator<TimeInterval> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f145909b;

    /* renamed from: c, reason: collision with root package name */
    public final int f145910c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f145911d;

    /* compiled from: TimeInterval.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TimeInterval> {
        @Override // android.os.Parcelable.Creator
        public final TimeInterval createFromParcel(Parcel parcel) {
            return new TimeInterval(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TimeInterval[] newArray(int i12) {
            return new TimeInterval[i12];
        }
    }

    public TimeInterval(int i12, int i13) {
        this.f145909b = i12;
        this.f145910c = i13;
        this.f145911d = i12 == 0 && (i13 == 0 || i13 == 1440);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeInterval)) {
            return false;
        }
        TimeInterval timeInterval = (TimeInterval) obj;
        return this.f145909b == timeInterval.f145909b && this.f145910c == timeInterval.f145910c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f145910c) + (Integer.hashCode(this.f145909b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimeInterval(startMinutes=");
        sb2.append(this.f145909b);
        sb2.append(", endMinutes=");
        return r.t(sb2, this.f145910c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f145909b);
        parcel.writeInt(this.f145910c);
    }
}

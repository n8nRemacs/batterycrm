package com.avito.android.vas_planning_calendar.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.media3.exoplayer.analytics.m;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CalendarConstraintsPicker.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_calendar/model/CalendarConstraintsPicker;", "Landroid/os/Parcelable;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CalendarConstraintsPicker implements Parcelable {

    @k
    public static final Parcelable.Creator<CalendarConstraintsPicker> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Date f322672b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Date f322673c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f322674d;

    /* compiled from: CalendarConstraintsPicker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CalendarConstraintsPicker> {
        @Override // android.os.Parcelable.Creator
        public final CalendarConstraintsPicker createFromParcel(Parcel parcel) {
            return new CalendarConstraintsPicker((Date) parcel.readSerializable(), (Date) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CalendarConstraintsPicker[] newArray(int i12) {
            return new CalendarConstraintsPicker[i12];
        }
    }

    public CalendarConstraintsPicker(@k Date date, @k Date date2, boolean z12) {
        this.f322672b = date;
        this.f322673c = date2;
        this.f322674d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraintsPicker)) {
            return false;
        }
        CalendarConstraintsPicker calendarConstraintsPicker = (CalendarConstraintsPicker) obj;
        return L.f(this.f322672b, calendarConstraintsPicker.f322672b) && L.f(this.f322673c, calendarConstraintsPicker.f322673c) && this.f322674d == calendarConstraintsPicker.f322674d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f322674d) + m.f(this.f322673c, this.f322672b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalendarConstraintsPicker(startPickerDate=");
        sb2.append(this.f322672b);
        sb2.append(", endPickerDate=");
        sb2.append(this.f322673c);
        sb2.append(", canSelectSingleDay=");
        return r.x(sb2, this.f322674d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeSerializable(this.f322672b);
        parcel.writeSerializable(this.f322673c);
        parcel.writeInt(this.f322674d ? 1 : 0);
    }

    public /* synthetic */ CalendarConstraintsPicker(Date date, Date date2, boolean z12, int i12, C42822w c42822w) {
        this(date, date2, (i12 & 4) != 0 ? false : z12);
    }
}

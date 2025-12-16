package com.avito.android.str_calendar.common.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CalendarConstraintsPicker.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/common/models/CalendarConstraintsPicker;", "Landroid/os/Parcelable;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CalendarConstraintsPicker implements Parcelable {

    @k
    public static final Parcelable.Creator<CalendarConstraintsPicker> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Date f286633b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Date f286634c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f286635d;

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
        this.f286633b = date;
        this.f286634c = date2;
        this.f286635d = z12;
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
        return L.f(this.f286633b, calendarConstraintsPicker.f286633b) && L.f(this.f286634c, calendarConstraintsPicker.f286634c) && this.f286635d == calendarConstraintsPicker.f286635d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f286635d) + m.f(this.f286634c, this.f286633b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalendarConstraintsPicker(startPickerDate=");
        sb2.append(this.f286633b);
        sb2.append(", endPickerDate=");
        sb2.append(this.f286634c);
        sb2.append(", canSelectSingleDay=");
        return r.x(sb2, this.f286635d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeSerializable(this.f286633b);
        parcel.writeSerializable(this.f286634c);
        parcel.writeInt(this.f286635d ? 1 : 0);
    }

    public /* synthetic */ CalendarConstraintsPicker(Date date, Date date2, boolean z12, int i12, C42822w c42822w) {
        this(date, date2, (i12 & 4) != 0 ? false : z12);
    }
}

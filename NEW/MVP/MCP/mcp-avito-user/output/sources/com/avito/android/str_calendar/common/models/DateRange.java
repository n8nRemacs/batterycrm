package com.avito.android.str_calendar.common.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.ranges.g;

/* compiled from: DateRange.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/common/models/DateRange;", "Lkotlin/ranges/g;", "Ljava/util/Date;", "Landroid/os/Parcelable;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DateRange implements g<Date>, Parcelable {

    @k
    public static final Parcelable.Creator<DateRange> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Date f286636b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Date f286637c;

    /* compiled from: DateRange.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DateRange> {
        @Override // android.os.Parcelable.Creator
        public final DateRange createFromParcel(Parcel parcel) {
            return new DateRange((Date) parcel.readSerializable(), (Date) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final DateRange[] newArray(int i12) {
            return new DateRange[i12];
        }
    }

    public DateRange(@k Date date, @k Date date2) {
        this.f286636b = date;
        this.f286637c = date2;
    }

    @Override // kotlin.ranges.g
    public final Comparable d() {
        return this.f286636b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // kotlin.ranges.g
    public final boolean e(Comparable comparable) {
        return g.a.a(this, (Date) comparable);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateRange)) {
            return false;
        }
        DateRange dateRange = (DateRange) obj;
        return L.f(this.f286636b, dateRange.f286636b) && L.f(this.f286637c, dateRange.f286637c);
    }

    @Override // kotlin.ranges.g
    public final Comparable g() {
        return this.f286637c;
    }

    public final int hashCode() {
        return this.f286637c.hashCode() + (this.f286636b.hashCode() * 31);
    }

    @Override // kotlin.ranges.g
    public final boolean isEmpty() {
        return g.a.b(this);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DateRange(start=");
        sb2.append(this.f286636b);
        sb2.append(", endInclusive=");
        return f.n(sb2, this.f286637c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeSerializable(this.f286636b);
        parcel.writeSerializable(this.f286637c);
    }
}

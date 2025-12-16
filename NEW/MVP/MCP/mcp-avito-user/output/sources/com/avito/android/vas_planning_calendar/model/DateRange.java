package com.avito.android.vas_planning_calendar.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bxcontent.mvi.entity.f;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.ranges.g;

/* compiled from: DateRange.kt */
@d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_planning_calendar/model/DateRange;", "Lkotlin/ranges/g;", "Ljava/util/Date;", "Landroid/os/Parcelable;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DateRange implements g<Date>, Parcelable {

    @k
    public static final Parcelable.Creator<DateRange> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Date f322675b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Date f322676c;

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
        this.f322675b = date;
        this.f322676c = date2;
    }

    @Override // kotlin.ranges.g
    public final Comparable d() {
        return this.f322675b;
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
        return L.f(this.f322675b, dateRange.f322675b) && L.f(this.f322676c, dateRange.f322676c);
    }

    @Override // kotlin.ranges.g
    public final Comparable g() {
        return this.f322676c;
    }

    public final int hashCode() {
        return this.f322676c.hashCode() + (this.f322675b.hashCode() * 31);
    }

    @Override // kotlin.ranges.g
    public final boolean isEmpty() {
        return g.a.b(this);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DateRange(start=");
        sb2.append(this.f322675b);
        sb2.append(", endInclusive=");
        return f.n(sb2, this.f322676c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeSerializable(this.f322675b);
        parcel.writeSerializable(this.f322676c);
    }
}

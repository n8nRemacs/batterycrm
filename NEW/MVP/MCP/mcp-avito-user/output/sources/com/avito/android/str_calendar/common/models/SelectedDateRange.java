package com.avito.android.str_calendar.common.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectedDateRange.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/common/models/SelectedDateRange;", "Landroid/os/Parcelable;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SelectedDateRange implements Parcelable {

    @k
    public static final Parcelable.Creator<SelectedDateRange> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Date f286645b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Date f286646c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DateRange f286647d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f286648e;

    /* compiled from: SelectedDateRange.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectedDateRange> {
        @Override // android.os.Parcelable.Creator
        public final SelectedDateRange createFromParcel(Parcel parcel) {
            return new SelectedDateRange((Date) parcel.readSerializable(), (Date) parcel.readSerializable(), parcel.readInt() == 0 ? null : DateRange.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SelectedDateRange[] newArray(int i12) {
            return new SelectedDateRange[i12];
        }
    }

    public SelectedDateRange(@l Date date, @l Date date2, @l DateRange dateRange, @l String str) {
        this.f286645b = date;
        this.f286646c = date2;
        this.f286647d = dateRange;
        this.f286648e = str;
    }

    public static SelectedDateRange a(SelectedDateRange selectedDateRange, Date date, Date date2, int i12) {
        if ((i12 & 1) != 0) {
            date = selectedDateRange.f286645b;
        }
        DateRange dateRange = (i12 & 4) != 0 ? selectedDateRange.f286647d : null;
        String str = (i12 & 8) != 0 ? selectedDateRange.f286648e : null;
        selectedDateRange.getClass();
        return new SelectedDateRange(date, date2, dateRange, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedDateRange)) {
            return false;
        }
        SelectedDateRange selectedDateRange = (SelectedDateRange) obj;
        return L.f(this.f286645b, selectedDateRange.f286645b) && L.f(this.f286646c, selectedDateRange.f286646c) && L.f(this.f286647d, selectedDateRange.f286647d) && L.f(this.f286648e, selectedDateRange.f286648e);
    }

    public final int hashCode() {
        Date date = this.f286645b;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.f286646c;
        int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        DateRange dateRange = this.f286647d;
        int iHashCode3 = (iHashCode2 + (dateRange == null ? 0 : dateRange.hashCode())) * 31;
        String str = this.f286648e;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectedDateRange(startDate=");
        sb2.append(this.f286645b);
        sb2.append(", endDate=");
        sb2.append(this.f286646c);
        sb2.append(", availableCheckOutDateRange=");
        sb2.append(this.f286647d);
        sb2.append(", minimalDurationCaption=");
        return C22026a.c(sb2, this.f286648e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeSerializable(this.f286645b);
        parcel.writeSerializable(this.f286646c);
        DateRange dateRange = this.f286647d;
        if (dateRange == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dateRange.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f286648e);
    }

    public /* synthetic */ SelectedDateRange(Date date, Date date2, DateRange dateRange, String str, int i12, C42822w c42822w) {
        this(date, date2, (i12 & 4) != 0 ? null : dateRange, (i12 & 8) != 0 ? null : str);
    }
}

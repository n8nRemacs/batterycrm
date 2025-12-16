package com.avito.android.inline_filters.calendar;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bxcontent.mvi.entity.f;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectedDateRange.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/calendar/SelectedDateRange;", "Landroid/os/Parcelable;", "_avito_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SelectedDateRange implements Parcelable {

    @k
    public static final Parcelable.Creator<SelectedDateRange> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Date f171063b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Date f171064c;

    /* compiled from: SelectedDateRange.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectedDateRange> {
        @Override // android.os.Parcelable.Creator
        public final SelectedDateRange createFromParcel(Parcel parcel) {
            return new SelectedDateRange((Date) parcel.readSerializable(), (Date) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final SelectedDateRange[] newArray(int i12) {
            return new SelectedDateRange[i12];
        }
    }

    public SelectedDateRange(@l Date date, @l Date date2) {
        this.f171063b = date;
        this.f171064c = date2;
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
        return L.f(this.f171063b, selectedDateRange.f171063b) && L.f(this.f171064c, selectedDateRange.f171064c);
    }

    public final int hashCode() {
        Date date = this.f171063b;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.f171064c;
        return iHashCode + (date2 != null ? date2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectedDateRange(from=");
        sb2.append(this.f171063b);
        sb2.append(", to=");
        return f.n(sb2, this.f171064c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeSerializable(this.f171063b);
        parcel.writeSerializable(this.f171064c);
    }
}

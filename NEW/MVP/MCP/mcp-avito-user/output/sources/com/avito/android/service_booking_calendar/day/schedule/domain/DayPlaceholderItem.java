package com.avito.android.service_booking_calendar.day.schedule.domain;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DayPlaceholderItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/domain/DayPlaceholderItem;", "Lcom/avito/android/service_booking_calendar/day/schedule/domain/FlexibleCalendarDayItem;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DayPlaceholderItem implements FlexibleCalendarDayItem {

    @k
    public static final Parcelable.Creator<DayPlaceholderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f275368b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final org.threeten.bp.f f275369c;

    /* compiled from: DayPlaceholderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DayPlaceholderItem> {
        @Override // android.os.Parcelable.Creator
        public final DayPlaceholderItem createFromParcel(Parcel parcel) {
            return new DayPlaceholderItem(parcel.readString(), (org.threeten.bp.f) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final DayPlaceholderItem[] newArray(int i12) {
            return new DayPlaceholderItem[i12];
        }
    }

    public DayPlaceholderItem(@k String str, @k org.threeten.bp.f fVar) {
        this.f275368b = str;
        this.f275369c = fVar;
    }

    @Override // com.avito.android.service_booking_calendar.day.schedule.domain.FlexibleCalendarDayItem
    @k
    /* renamed from: O, reason: from getter */
    public final org.threeten.bp.f getF275369c() {
        return this.f275369c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DayPlaceholderItem)) {
            return false;
        }
        DayPlaceholderItem dayPlaceholderItem = (DayPlaceholderItem) obj;
        return L.f(this.f275368b, dayPlaceholderItem.f275368b) && L.f(this.f275369c, dayPlaceholderItem.f275369c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79541k() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154848b() {
        return this.f275368b;
    }

    public final int hashCode() {
        return this.f275369c.hashCode() + (this.f275368b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "DayPlaceholderItem(stringId=" + this.f275368b + ", time=" + this.f275369c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f275368b);
        parcel.writeSerializable(this.f275369c);
    }
}

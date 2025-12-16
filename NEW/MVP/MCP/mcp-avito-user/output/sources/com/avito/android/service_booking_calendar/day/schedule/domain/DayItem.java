package com.avito.android.service_booking_calendar.day.schedule.domain;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DayItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/domain/DayItem;", "Lcom/avito/android/service_booking_calendar/day/schedule/domain/FlexibleCalendarDayItem;", "DayType", "OrderStatus", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DayItem implements FlexibleCalendarDayItem {

    @k
    public static final Parcelable.Creator<DayItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f275352b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final org.threeten.bp.f f275353c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final OrderStatus f275354d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f275355e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f275356f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final DayType f275357g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DayItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/domain/DayItem$DayType;", "", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DayType {

        /* renamed from: b, reason: collision with root package name */
        public static final DayType f275358b;

        /* renamed from: c, reason: collision with root package name */
        public static final DayType f275359c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ DayType[] f275360d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f275361e;

        static {
            DayType dayType = new DayType("DAY_OFF", 0);
            f275358b = dayType;
            DayType dayType2 = new DayType("WORKING_DAY", 1);
            f275359c = dayType2;
            DayType[] dayTypeArr = {dayType, dayType2};
            f275360d = dayTypeArr;
            f275361e = kotlin.enums.c.a(dayTypeArr);
        }

        public DayType() {
            throw null;
        }

        public static DayType valueOf(String str) {
            return (DayType) Enum.valueOf(DayType.class, str);
        }

        public static DayType[] values() {
            return (DayType[]) f275360d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DayItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/domain/DayItem$OrderStatus;", "", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OrderStatus {

        /* renamed from: b, reason: collision with root package name */
        public static final OrderStatus f275362b;

        /* renamed from: c, reason: collision with root package name */
        public static final OrderStatus f275363c;

        /* renamed from: d, reason: collision with root package name */
        public static final OrderStatus f275364d;

        /* renamed from: e, reason: collision with root package name */
        public static final OrderStatus f275365e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ OrderStatus[] f275366f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f275367g;

        static {
            OrderStatus orderStatus = new OrderStatus("DEFAULT", 0);
            f275362b = orderStatus;
            OrderStatus orderStatus2 = new OrderStatus("COMPLETED", 1);
            f275363c = orderStatus2;
            OrderStatus orderStatus3 = new OrderStatus("WITH_ORDER", 2);
            f275364d = orderStatus3;
            OrderStatus orderStatus4 = new OrderStatus("NEED_CONFIRMATION", 3);
            f275365e = orderStatus4;
            OrderStatus[] orderStatusArr = {orderStatus, orderStatus2, orderStatus3, orderStatus4};
            f275366f = orderStatusArr;
            f275367g = kotlin.enums.c.a(orderStatusArr);
        }

        public OrderStatus() {
            throw null;
        }

        public static OrderStatus valueOf(String str) {
            return (OrderStatus) Enum.valueOf(OrderStatus.class, str);
        }

        public static OrderStatus[] values() {
            return (OrderStatus[]) f275366f.clone();
        }
    }

    /* compiled from: DayItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DayItem> {
        @Override // android.os.Parcelable.Creator
        public final DayItem createFromParcel(Parcel parcel) {
            return new DayItem(parcel.readString(), (org.threeten.bp.f) parcel.readSerializable(), OrderStatus.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, DayType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final DayItem[] newArray(int i12) {
            return new DayItem[i12];
        }
    }

    public DayItem(@k String str, @k org.threeten.bp.f fVar, @k OrderStatus orderStatus, boolean z12, boolean z13, @k DayType dayType) {
        this.f275352b = str;
        this.f275353c = fVar;
        this.f275354d = orderStatus;
        this.f275355e = z12;
        this.f275356f = z13;
        this.f275357g = dayType;
    }

    @Override // com.avito.android.service_booking_calendar.day.schedule.domain.FlexibleCalendarDayItem
    @k
    /* renamed from: O, reason: from getter */
    public final org.threeten.bp.f getF275353c() {
        return this.f275353c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DayItem)) {
            return false;
        }
        DayItem dayItem = (DayItem) obj;
        return L.f(this.f275352b, dayItem.f275352b) && L.f(this.f275353c, dayItem.f275353c) && this.f275354d == dayItem.f275354d && this.f275355e == dayItem.f275355e && this.f275356f == dayItem.f275356f && this.f275357g == dayItem.f275357g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF248508b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF278162b() {
        return this.f275352b;
    }

    public final int hashCode() {
        return this.f275357g.hashCode() + r.i(r.i((this.f275354d.hashCode() + ((this.f275353c.hashCode() + (this.f275352b.hashCode() * 31)) * 31)) * 31, 31, this.f275355e), 31, this.f275356f);
    }

    @k
    public final String toString() {
        return "DayItem(stringId=" + this.f275352b + ", time=" + this.f275353c + ", orderStatus=" + this.f275354d + ", isToday=" + this.f275355e + ", isFocus=" + this.f275356f + ", dayType=" + this.f275357g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f275352b);
        parcel.writeSerializable(this.f275353c);
        parcel.writeString(this.f275354d.name());
        parcel.writeInt(this.f275355e ? 1 : 0);
        parcel.writeInt(this.f275356f ? 1 : 0);
        parcel.writeString(this.f275357g.name());
    }
}

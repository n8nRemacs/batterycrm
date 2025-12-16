package com.avito.android.service_booking_calendar.flexible.data.domain;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.service_booking_calendar.day.schedule.domain.FlexibleCalendarDayItem;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WeekItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/domain/WeekItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "WeekFlag", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WeekItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<WeekItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f275674b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<FlexibleCalendarDayItem> f275675c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f275676d;

    /* renamed from: e, reason: collision with root package name */
    public final int f275677e;

    /* renamed from: f, reason: collision with root package name */
    public final int f275678f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WeekItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/domain/WeekItem$WeekFlag;", "", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WeekFlag {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ WeekFlag[] f275679b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f275680c;

        static {
            WeekFlag[] weekFlagArr = {new WeekFlag("FIRST", 0), new WeekFlag("LAST", 1)};
            f275679b = weekFlagArr;
            f275680c = kotlin.enums.c.a(weekFlagArr);
        }

        public static WeekFlag valueOf(String str) {
            return (WeekFlag) Enum.valueOf(WeekFlag.class, str);
        }

        public static WeekFlag[] values() {
            return (WeekFlag[]) f275679b.clone();
        }
    }

    /* compiled from: WeekItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WeekItem> {
        @Override // android.os.Parcelable.Creator
        public final WeekItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(WeekItem.class, parcel, arrayList, iL2, 1);
            }
            return new WeekItem(string, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final WeekItem[] newArray(int i12) {
            return new WeekItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WeekItem(@k String str, @k List<? extends FlexibleCalendarDayItem> list, @l Integer num, int i12, int i13) {
        this.f275674b = str;
        this.f275675c = list;
        this.f275676d = num;
        this.f275677e = i12;
        this.f275678f = i13;
    }

    public static WeekItem a(WeekItem weekItem, Integer num, int i12) {
        String str = weekItem.f275674b;
        List<FlexibleCalendarDayItem> list = weekItem.f275675c;
        int i13 = weekItem.f275678f;
        weekItem.getClass();
        return new WeekItem(str, list, num, i12, i13);
    }

    public final boolean L() {
        WeekFlag[] weekFlagArr = WeekFlag.f275679b;
        return (this.f275678f & 2) == 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeekItem)) {
            return false;
        }
        WeekItem weekItem = (WeekItem) obj;
        return L.f(this.f275674b, weekItem.f275674b) && L.f(this.f275675c, weekItem.f275675c) && L.f(this.f275676d, weekItem.f275676d) && this.f275677e == weekItem.f275677e && this.f275678f == weekItem.f275678f;
    }

    public final boolean f() {
        WeekFlag[] weekFlagArr = WeekFlag.f275679b;
        return (this.f275678f & 1) == 1;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF273281b() {
        return this.f275674b;
    }

    public final int hashCode() {
        int iE2 = H.e(this.f275674b.hashCode() * 31, 31, this.f275675c);
        Integer num = this.f275676d;
        return Integer.hashCode(this.f275678f) + r.e(this.f275677e, (iE2 + (num == null ? 0 : num.hashCode())) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WeekItem(stringId=");
        sb2.append(this.f275674b);
        sb2.append(", days=");
        sb2.append(this.f275675c);
        sb2.append(", focusedDayIndex=");
        sb2.append(this.f275676d);
        sb2.append(", selectedMonth=");
        sb2.append(this.f275677e);
        sb2.append(", flags=");
        return r.t(sb2, this.f275678f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f275674b);
        Iterator itJ = C0.j(this.f275675c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        Integer num = this.f275676d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeInt(this.f275677e);
        parcel.writeInt(this.f275678f);
    }
}

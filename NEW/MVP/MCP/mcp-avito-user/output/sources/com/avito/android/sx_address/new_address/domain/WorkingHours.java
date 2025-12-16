package com.avito.android.sx_address.new_address.domain;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WorkingHours.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/new_address/domain/WorkingHours;", "Landroid/os/Parcelable;", "Day", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class WorkingHours implements Parcelable {

    @k
    public static final Parcelable.Creator<WorkingHours> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<WeekDay, Day> f293632b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<WeekDay, Day> f293633c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f293634d;

    /* compiled from: WorkingHours.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/new_address/domain/WorkingHours$Day;", "Landroid/os/Parcelable;", "Time", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Day implements Parcelable {

        @k
        public static final Parcelable.Creator<Day> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Time f293635b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f293636c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Time f293637d;

        /* compiled from: WorkingHours.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/domain/WorkingHours$Day$Time;", "Landroid/os/Parcelable;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Time implements Parcelable {

            @k
            public static final Parcelable.Creator<Time> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final long f293638b;

            /* renamed from: c, reason: collision with root package name */
            public final long f293639c;

            /* compiled from: WorkingHours.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Time> {
                @Override // android.os.Parcelable.Creator
                public final Time createFromParcel(Parcel parcel) {
                    return new Time(parcel.readLong(), parcel.readLong());
                }

                @Override // android.os.Parcelable.Creator
                public final Time[] newArray(int i12) {
                    return new Time[i12];
                }
            }

            public Time(long j12, long j13) {
                this.f293638b = j12;
                this.f293639c = j13;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Time)) {
                    return false;
                }
                Time time = (Time) obj;
                return this.f293638b == time.f293638b && this.f293639c == time.f293639c;
            }

            public final int hashCode() {
                return Long.hashCode(this.f293639c) + (Long.hashCode(this.f293638b) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Time(hours=");
                sb2.append(this.f293638b);
                sb2.append(", minutes=");
                return r.u(sb2, this.f293639c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeLong(this.f293638b);
                parcel.writeLong(this.f293639c);
            }
        }

        /* compiled from: WorkingHours.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Day> {
            @Override // android.os.Parcelable.Creator
            public final Day createFromParcel(Parcel parcel) {
                Parcelable.Creator<Time> creator = Time.CREATOR;
                return new Day(creator.createFromParcel(parcel), parcel.readInt() != 0, creator.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Day[] newArray(int i12) {
                return new Day[i12];
            }
        }

        public Day(@k Time time, boolean z12, @k Time time2) {
            this.f293635b = time;
            this.f293636c = z12;
            this.f293637d = time2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Day)) {
                return false;
            }
            Day day = (Day) obj;
            return L.f(this.f293635b, day.f293635b) && this.f293636c == day.f293636c && L.f(this.f293637d, day.f293637d);
        }

        public final int hashCode() {
            return this.f293637d.hashCode() + r.i(this.f293635b.hashCode() * 31, 31, this.f293636c);
        }

        @k
        public final String toString() {
            return "Day(from=" + this.f293635b + ", isWorkingDay=" + this.f293636c + ", to=" + this.f293637d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f293635b.writeToParcel(parcel, i12);
            parcel.writeInt(this.f293636c ? 1 : 0);
            this.f293637d.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: WorkingHours.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WorkingHours> {
        @Override // android.os.Parcelable.Creator
        public final WorkingHours createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashMap.put(WeekDay.valueOf(parcel.readString()), Day.CREATOR.createFromParcel(parcel));
            }
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                linkedHashMap2.put(WeekDay.valueOf(parcel.readString()), Day.CREATOR.createFromParcel(parcel));
            }
            return new WorkingHours(parcel.readString(), linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final WorkingHours[] newArray(int i12) {
            return new WorkingHours[i12];
        }
    }

    public WorkingHours(@l String str, @k Map map, @k Map map2) {
        this.f293632b = map;
        this.f293633c = map2;
        this.f293634d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkingHours)) {
            return false;
        }
        WorkingHours workingHours = (WorkingHours) obj;
        return L.f(this.f293632b, workingHours.f293632b) && L.f(this.f293633c, workingHours.f293633c) && L.f(this.f293634d, workingHours.f293634d);
    }

    public final int hashCode() {
        int iC2 = AK.c.c(this.f293632b.hashCode() * 31, 31, this.f293633c);
        String str = this.f293634d;
        return iC2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkingHours(dayMap=");
        sb2.append(this.f293632b);
        sb2.append(", standardDayMap=");
        sb2.append(this.f293633c);
        sb2.append(", standardScheduleText=");
        return C22026a.c(sb2, this.f293634d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itI = C0.i(parcel, this.f293632b);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString(((WeekDay) entry.getKey()).name());
            ((Day) entry.getValue()).writeToParcel(parcel, i12);
        }
        Iterator itI2 = C0.i(parcel, this.f293633c);
        while (itI2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itI2.next();
            parcel.writeString(((WeekDay) entry2.getKey()).name());
            ((Day) entry2.getValue()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f293634d);
    }
}

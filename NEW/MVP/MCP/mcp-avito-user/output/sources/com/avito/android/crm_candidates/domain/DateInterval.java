package com.avito.android.crm_candidates.domain;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.FormattedDateDisplayingType;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DateInterval.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/crm_candidates/domain/DateInterval;", "Landroid/os/Parcelable;", "Calendar", "CalendarBorder", "Custom", "Default", "EmptyCalendar", "Lcom/avito/android/crm_candidates/domain/DateInterval$Calendar;", "Lcom/avito/android/crm_candidates/domain/DateInterval$CalendarBorder;", "Lcom/avito/android/crm_candidates/domain/DateInterval$Custom;", "Lcom/avito/android/crm_candidates/domain/DateInterval$Default;", "Lcom/avito/android/crm_candidates/domain/DateInterval$EmptyCalendar;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface DateInterval extends Parcelable {

    /* compiled from: DateInterval.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/domain/DateInterval$Calendar;", "Lcom/avito/android/crm_candidates/domain/DateInterval;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Calendar implements DateInterval {

        @Y61.k
        public static final Parcelable.Creator<Calendar> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f129333b;

        /* renamed from: c, reason: collision with root package name */
        public final long f129334c;

        /* compiled from: DateInterval.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Calendar> {
            @Override // android.os.Parcelable.Creator
            public final Calendar createFromParcel(Parcel parcel) {
                return new Calendar(parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Calendar[] newArray(int i12) {
                return new Calendar[i12];
            }
        }

        public Calendar(long j12, long j13) {
            this.f129333b = j12;
            this.f129334c = j13;
        }

        @Override // com.avito.android.crm_candidates.domain.DateInterval
        /* renamed from: Z0 */
        public final long getF129338b() {
            return 0L;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.crm_candidates.domain.DateInterval
        @Y61.k
        /* renamed from: getId */
        public final String getF129339c() {
            return FormattedDateDisplayingType.TYPE_CALENDAR;
        }

        @Override // com.avito.android.crm_candidates.domain.DateInterval
        @Y61.k
        public final Q<Long, Long> u6() {
            return new Q<>(Long.valueOf(this.f129333b), Long.valueOf(this.f129334c));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeLong(this.f129333b);
            parcel.writeLong(this.f129334c);
        }
    }

    /* compiled from: DateInterval.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/domain/DateInterval$CalendarBorder;", "Lcom/avito/android/crm_candidates/domain/DateInterval;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class CalendarBorder implements DateInterval {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final CalendarBorder f129335b = new CalendarBorder();

        /* renamed from: c, reason: collision with root package name */
        public static final long f129336c = 365;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final String f129337d = "";

        @Y61.k
        public static final Parcelable.Creator<CalendarBorder> CREATOR = new a();

        /* compiled from: DateInterval.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CalendarBorder> {
            @Override // android.os.Parcelable.Creator
            public final CalendarBorder createFromParcel(Parcel parcel) {
                parcel.readInt();
                return CalendarBorder.f129335b;
            }

            @Override // android.os.Parcelable.Creator
            public final CalendarBorder[] newArray(int i12) {
                return new CalendarBorder[i12];
            }
        }

        @Override // com.avito.android.crm_candidates.domain.DateInterval
        /* renamed from: Z0 */
        public final long getF129338b() {
            return f129336c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof CalendarBorder);
        }

        @Override // com.avito.android.crm_candidates.domain.DateInterval
        @Y61.k
        /* renamed from: getId */
        public final String getF129339c() {
            return f129337d;
        }

        public final int hashCode() {
            return 1033176909;
        }

        @Y61.k
        public final String toString() {
            return "CalendarBorder";
        }

        @Override // com.avito.android.crm_candidates.domain.DateInterval
        @Y61.k
        public final Q<Long, Long> u6() {
            return a.a(this);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: DateInterval.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/domain/DateInterval$Custom;", "Lcom/avito/android/crm_candidates/domain/DateInterval;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Custom implements DateInterval {

        @Y61.k
        public static final Parcelable.Creator<Custom> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f129338b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f129339c;

        /* compiled from: DateInterval.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Custom> {
            @Override // android.os.Parcelable.Creator
            public final Custom createFromParcel(Parcel parcel) {
                return new Custom(parcel.readLong(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Custom[] newArray(int i12) {
                return new Custom[i12];
            }
        }

        public Custom(long j12, @Y61.k String str) {
            this.f129338b = j12;
            this.f129339c = str;
        }

        @Override // com.avito.android.crm_candidates.domain.DateInterval
        /* renamed from: Z0, reason: from getter */
        public final long getF129338b() {
            return this.f129338b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) obj;
            return this.f129338b == custom.f129338b && L.f(this.f129339c, custom.f129339c);
        }

        @Override // com.avito.android.crm_candidates.domain.DateInterval
        @Y61.k
        /* renamed from: getId, reason: from getter */
        public final String getF129339c() {
            return this.f129339c;
        }

        public final int hashCode() {
            return this.f129339c.hashCode() + (Long.hashCode(this.f129338b) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Custom(interval=");
            sb2.append(this.f129338b);
            sb2.append(", id=");
            return C22026a.c(sb2, this.f129339c, ')');
        }

        @Override // com.avito.android.crm_candidates.domain.DateInterval
        @Y61.k
        public final Q<Long, Long> u6() {
            return a.a(this);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeLong(this.f129338b);
            parcel.writeString(this.f129339c);
        }
    }

    /* compiled from: DateInterval.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/domain/DateInterval$Default;", "Lcom/avito/android/crm_candidates/domain/DateInterval;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Default implements DateInterval {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Default f129340b = new Default();

        /* renamed from: c, reason: collision with root package name */
        public static final long f129341c = 30;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final String f129342d = "day30";

        @Y61.k
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* compiled from: DateInterval.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Default> {
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Default.f129340b;
            }

            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i12) {
                return new Default[i12];
            }
        }

        @Override // com.avito.android.crm_candidates.domain.DateInterval
        /* renamed from: Z0 */
        public final long getF129338b() {
            return f129341c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof Default);
        }

        @Override // com.avito.android.crm_candidates.domain.DateInterval
        @Y61.k
        /* renamed from: getId */
        public final String getF129339c() {
            return f129342d;
        }

        public final int hashCode() {
            return -2003961506;
        }

        @Y61.k
        public final String toString() {
            return "Default";
        }

        @Override // com.avito.android.crm_candidates.domain.DateInterval
        @Y61.k
        public final Q<Long, Long> u6() {
            return a.a(this);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: DateInterval.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/domain/DateInterval$EmptyCalendar;", "Lcom/avito/android/crm_candidates/domain/DateInterval;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class EmptyCalendar implements DateInterval {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final EmptyCalendar f129343b = new EmptyCalendar();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final String f129344c = "";

        @Y61.k
        public static final Parcelable.Creator<EmptyCalendar> CREATOR = new a();

        /* compiled from: DateInterval.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<EmptyCalendar> {
            @Override // android.os.Parcelable.Creator
            public final EmptyCalendar createFromParcel(Parcel parcel) {
                parcel.readInt();
                return EmptyCalendar.f129343b;
            }

            @Override // android.os.Parcelable.Creator
            public final EmptyCalendar[] newArray(int i12) {
                return new EmptyCalendar[i12];
            }
        }

        @Override // com.avito.android.crm_candidates.domain.DateInterval
        /* renamed from: Z0 */
        public final long getF129338b() {
            return 0L;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof EmptyCalendar);
        }

        @Override // com.avito.android.crm_candidates.domain.DateInterval
        @Y61.k
        /* renamed from: getId */
        public final String getF129339c() {
            return f129344c;
        }

        public final int hashCode() {
            return 610590984;
        }

        @Y61.k
        public final String toString() {
            return "EmptyCalendar";
        }

        @Override // com.avito.android.crm_candidates.domain.DateInterval
        @Y61.k
        public final Q<Long, Long> u6() {
            return new Q<>(0L, 0L);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: DateInterval.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        @Y61.k
        public static Q<Long, Long> a(@Y61.k DateInterval dateInterval) {
            LocalDate localDateNow = LocalDate.now();
            long j12 = 1000;
            return new Q<>(Long.valueOf(ZonedDateTime.of(localDateNow.minusDays(dateInterval.getF129338b() - 1).atStartOfDay(), ZoneId.systemDefault()).toInstant().toEpochMilli() / j12), Long.valueOf(ZonedDateTime.of(localDateNow.plusDays(1L).atStartOfDay(), ZoneId.systemDefault()).toInstant().toEpochMilli() / j12));
        }
    }

    /* renamed from: Z0 */
    long getF129338b();

    @Y61.k
    /* renamed from: getId */
    String getF129339c();

    @Y61.k
    Q<Long, Long> u6();
}

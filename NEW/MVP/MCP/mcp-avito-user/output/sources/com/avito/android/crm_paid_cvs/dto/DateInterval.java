package com.avito.android.crm_paid_cvs.dto;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DateInterval.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/crm_paid_cvs/dto/DateInterval;", "Landroid/os/Parcelable;", "Calendar", "CalendarBorder", "Custom", "Default", "EmptyCalendar", "Lcom/avito/android/crm_paid_cvs/dto/DateInterval$Calendar;", "Lcom/avito/android/crm_paid_cvs/dto/DateInterval$CalendarBorder;", "Lcom/avito/android/crm_paid_cvs/dto/DateInterval$Custom;", "Lcom/avito/android/crm_paid_cvs/dto/DateInterval$Default;", "Lcom/avito/android/crm_paid_cvs/dto/DateInterval$EmptyCalendar;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface DateInterval extends Parcelable {

    /* compiled from: DateInterval.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/dto/DateInterval$Calendar;", "Lcom/avito/android/crm_paid_cvs/dto/DateInterval;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Calendar implements DateInterval {

        @k
        public static final Parcelable.Creator<Calendar> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f130350b;

        /* renamed from: c, reason: collision with root package name */
        public final long f130351c;

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
            this.f130350b = j12;
            this.f130351c = j13;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f130350b);
            parcel.writeLong(this.f130351c);
        }
    }

    /* compiled from: DateInterval.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/dto/DateInterval$CalendarBorder;", "Lcom/avito/android/crm_paid_cvs/dto/DateInterval;", "<init>", "()V", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class CalendarBorder implements DateInterval {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CalendarBorder f130352b = new CalendarBorder();

        @k
        public static final Parcelable.Creator<CalendarBorder> CREATOR = new a();

        /* compiled from: DateInterval.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CalendarBorder> {
            @Override // android.os.Parcelable.Creator
            public final CalendarBorder createFromParcel(Parcel parcel) {
                parcel.readInt();
                return CalendarBorder.f130352b;
            }

            @Override // android.os.Parcelable.Creator
            public final CalendarBorder[] newArray(int i12) {
                return new CalendarBorder[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CalendarBorder);
        }

        public final int hashCode() {
            return -120620575;
        }

        @k
        public final String toString() {
            return "CalendarBorder";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: DateInterval.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/dto/DateInterval$Custom;", "Lcom/avito/android/crm_paid_cvs/dto/DateInterval;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Custom implements DateInterval {

        @k
        public static final Parcelable.Creator<Custom> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f130353b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f130354c;

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

        public Custom(long j12, @k String str) {
            this.f130353b = j12;
            this.f130354c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) obj;
            return this.f130353b == custom.f130353b && L.f(this.f130354c, custom.f130354c);
        }

        public final int hashCode() {
            return this.f130354c.hashCode() + (Long.hashCode(this.f130353b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Custom(interval=");
            sb2.append(this.f130353b);
            sb2.append(", id=");
            return C22026a.c(sb2, this.f130354c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f130353b);
            parcel.writeString(this.f130354c);
        }
    }

    /* compiled from: DateInterval.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/dto/DateInterval$Default;", "Lcom/avito/android/crm_paid_cvs/dto/DateInterval;", "<init>", "()V", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Default implements DateInterval {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Default f130355b = new Default();

        @k
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* compiled from: DateInterval.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Default> {
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Default.f130355b;
            }

            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i12) {
                return new Default[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Default);
        }

        public final int hashCode() {
            return -1790540470;
        }

        @k
        public final String toString() {
            return "Default";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: DateInterval.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/dto/DateInterval$EmptyCalendar;", "Lcom/avito/android/crm_paid_cvs/dto/DateInterval;", "<init>", "()V", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class EmptyCalendar implements DateInterval {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final EmptyCalendar f130356b = new EmptyCalendar();

        @k
        public static final Parcelable.Creator<EmptyCalendar> CREATOR = new a();

        /* compiled from: DateInterval.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<EmptyCalendar> {
            @Override // android.os.Parcelable.Creator
            public final EmptyCalendar createFromParcel(Parcel parcel) {
                parcel.readInt();
                return EmptyCalendar.f130356b;
            }

            @Override // android.os.Parcelable.Creator
            public final EmptyCalendar[] newArray(int i12) {
                return new EmptyCalendar[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof EmptyCalendar);
        }

        public final int hashCode() {
            return -1920480268;
        }

        @k
        public final String toString() {
            return "EmptyCalendar";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: DateInterval.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }
}

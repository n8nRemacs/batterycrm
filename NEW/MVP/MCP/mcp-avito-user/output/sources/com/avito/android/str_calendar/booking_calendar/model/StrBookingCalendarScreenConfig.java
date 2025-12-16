package com.avito.android.str_calendar.booking_calendar.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StrBookingCalendarScreenConfig.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/model/StrBookingCalendarScreenConfig;", "Landroid/os/Parcelable;", "Default", "WidgetFilter", "Lcom/avito/android/str_calendar/booking_calendar/model/StrBookingCalendarScreenConfig$Default;", "Lcom/avito/android/str_calendar/booking_calendar/model/StrBookingCalendarScreenConfig$WidgetFilter;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class StrBookingCalendarScreenConfig implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f286369b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f286370c;

    /* compiled from: StrBookingCalendarScreenConfig.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/model/StrBookingCalendarScreenConfig$Default;", "Lcom/avito/android/str_calendar/booking_calendar/model/StrBookingCalendarScreenConfig;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Default extends StrBookingCalendarScreenConfig {

        @k
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public final boolean f286371d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f286372e;

        /* compiled from: StrBookingCalendarScreenConfig.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Default> {
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                return new Default(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i12) {
                return new Default[i12];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Default() {
            boolean z12 = false;
            this(z12, z12, 3, null);
        }

        @Override // com.avito.android.str_calendar.booking_calendar.model.StrBookingCalendarScreenConfig
        /* renamed from: c, reason: from getter */
        public final boolean getF286369b() {
            return this.f286371d;
        }

        @Override // com.avito.android.str_calendar.booking_calendar.model.StrBookingCalendarScreenConfig
        /* renamed from: d, reason: from getter */
        public final boolean getF286370c() {
            return this.f286372e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Default)) {
                return false;
            }
            Default r52 = (Default) obj;
            return this.f286371d == r52.f286371d && this.f286372e == r52.f286372e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f286372e) + (Boolean.hashCode(this.f286371d) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Default(isSelectButtonVisible=");
            sb2.append(this.f286371d);
            sb2.append(", isToolbarVisible=");
            return r.x(sb2, this.f286372e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f286371d ? 1 : 0);
            parcel.writeInt(this.f286372e ? 1 : 0);
        }

        public /* synthetic */ Default(boolean z12, boolean z13, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? true : z12, (i12 & 2) != 0 ? true : z13);
        }

        public Default(boolean z12, boolean z13) {
            super(z13, z13, null);
            this.f286371d = z12;
            this.f286372e = z13;
        }
    }

    /* compiled from: StrBookingCalendarScreenConfig.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/model/StrBookingCalendarScreenConfig$WidgetFilter;", "Lcom/avito/android/str_calendar/booking_calendar/model/StrBookingCalendarScreenConfig;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class WidgetFilter extends StrBookingCalendarScreenConfig {

        @k
        public static final Parcelable.Creator<WidgetFilter> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public final boolean f286373d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f286374e;

        /* compiled from: StrBookingCalendarScreenConfig.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WidgetFilter> {
            @Override // android.os.Parcelable.Creator
            public final WidgetFilter createFromParcel(Parcel parcel) {
                return new WidgetFilter(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final WidgetFilter[] newArray(int i12) {
                return new WidgetFilter[i12];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public WidgetFilter() {
            boolean z12 = false;
            this(z12, z12, 3, null);
        }

        @Override // com.avito.android.str_calendar.booking_calendar.model.StrBookingCalendarScreenConfig
        /* renamed from: c, reason: from getter */
        public final boolean getF286369b() {
            return this.f286373d;
        }

        @Override // com.avito.android.str_calendar.booking_calendar.model.StrBookingCalendarScreenConfig
        /* renamed from: d, reason: from getter */
        public final boolean getF286370c() {
            return this.f286374e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WidgetFilter)) {
                return false;
            }
            WidgetFilter widgetFilter = (WidgetFilter) obj;
            return this.f286373d == widgetFilter.f286373d && this.f286374e == widgetFilter.f286374e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f286374e) + (Boolean.hashCode(this.f286373d) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WidgetFilter(isSelectButtonVisible=");
            sb2.append(this.f286373d);
            sb2.append(", isToolbarVisible=");
            return r.x(sb2, this.f286374e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f286373d ? 1 : 0);
            parcel.writeInt(this.f286374e ? 1 : 0);
        }

        public /* synthetic */ WidgetFilter(boolean z12, boolean z13, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13);
        }

        public WidgetFilter(boolean z12, boolean z13) {
            super(z13, z13, null);
            this.f286373d = z12;
            this.f286374e = z13;
        }
    }

    public StrBookingCalendarScreenConfig(boolean z12, boolean z13, C42822w c42822w) {
        this.f286369b = z12;
        this.f286370c = z13;
    }

    /* renamed from: c, reason: from getter */
    public boolean getF286369b() {
        return this.f286369b;
    }

    /* renamed from: d, reason: from getter */
    public boolean getF286370c() {
        return this.f286370c;
    }
}

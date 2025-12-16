package com.avito.android.calendar_select;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CalendarConstants.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/calendar_select/CalendarSettings;", "Landroid/os/Parcelable;", "Button", "a", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CalendarSettings implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f113313b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f113314c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<String> f113315d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f113316e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<String> f113317f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Button f113318g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f113319h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final CalendarSelectionType f113320i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f113321j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f113322k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final a f113312l = new a(null);

    @k
    public static final Parcelable.Creator<CalendarSettings> CREATOR = new b();

    /* compiled from: CalendarConstants.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/CalendarSettings$Button;", "Landroid/os/Parcelable;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f113323b;

        /* compiled from: CalendarConstants.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                return new Button(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@l String str) {
            this.f113323b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Button) && L.f(this.f113323b, ((Button) obj).f113323b);
        }

        public final int hashCode() {
            String str = this.f113323b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Button(title="), this.f113323b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f113323b);
        }
    }

    /* compiled from: CalendarConstants.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/calendar_select/CalendarSettings$a;", "", "<init>", "()V", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CalendarConstants.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CalendarSettings> {
        @Override // android.os.Parcelable.Creator
        public final CalendarSettings createFromParcel(Parcel parcel) {
            return new CalendarSettings(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readString(), (CalendarSelectionType) parcel.readParcelable(CalendarSettings.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CalendarSettings[] newArray(int i12) {
            return new CalendarSettings[i12];
        }
    }

    public CalendarSettings(@l String str, @l String str2, @k List<String> list, @l String str3, @k List<String> list2, @l Button button, @l String str4, @k CalendarSelectionType calendarSelectionType, boolean z12, @l String str5) {
        this.f113313b = str;
        this.f113314c = str2;
        this.f113315d = list;
        this.f113316e = str3;
        this.f113317f = list2;
        this.f113318g = button;
        this.f113319h = str4;
        this.f113320i = calendarSelectionType;
        this.f113321j = z12;
        this.f113322k = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarSettings)) {
            return false;
        }
        CalendarSettings calendarSettings = (CalendarSettings) obj;
        return L.f(this.f113313b, calendarSettings.f113313b) && L.f(this.f113314c, calendarSettings.f113314c) && L.f(this.f113315d, calendarSettings.f113315d) && L.f(this.f113316e, calendarSettings.f113316e) && L.f(this.f113317f, calendarSettings.f113317f) && L.f(this.f113318g, calendarSettings.f113318g) && L.f(this.f113319h, calendarSettings.f113319h) && this.f113320i == calendarSettings.f113320i && this.f113321j == calendarSettings.f113321j && L.f(this.f113322k, calendarSettings.f113322k);
    }

    public final int hashCode() {
        String str = this.f113313b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f113314c;
        int iE2 = H.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f113315d);
        String str3 = this.f113316e;
        int iE3 = H.e((iE2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f113317f);
        Button button = this.f113318g;
        int iHashCode2 = (iE3 + (button == null ? 0 : button.hashCode())) * 31;
        String str4 = this.f113319h;
        int i12 = r.i((this.f113320i.hashCode() + ((iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31, 31, this.f113321j);
        String str5 = this.f113322k;
        return i12 + (str5 != null ? str5.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalendarSettings(fromDate=");
        sb2.append(this.f113313b);
        sb2.append(", toDate=");
        sb2.append(this.f113314c);
        sb2.append(", selectedDates=");
        sb2.append(this.f113315d);
        sb2.append(", title=");
        sb2.append(this.f113316e);
        sb2.append(", blockedDates=");
        sb2.append(this.f113317f);
        sb2.append(", button=");
        sb2.append(this.f113318g);
        sb2.append(", settingsPath=");
        sb2.append(this.f113319h);
        sb2.append(", selectionType=");
        sb2.append(this.f113320i);
        sb2.append(", isPastDayAllowed=");
        sb2.append(this.f113321j);
        sb2.append(", dateScrollTo=");
        return C22026a.c(sb2, this.f113322k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f113313b);
        parcel.writeString(this.f113314c);
        parcel.writeStringList(this.f113315d);
        parcel.writeString(this.f113316e);
        parcel.writeStringList(this.f113317f);
        Button button = this.f113318g;
        if (button == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f113319h);
        parcel.writeParcelable(this.f113320i, i12);
        parcel.writeInt(this.f113321j ? 1 : 0);
        parcel.writeString(this.f113322k);
    }
}

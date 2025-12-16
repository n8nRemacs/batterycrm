package com.avito.android.beduin.common.component.select_calendar;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarSettings.kt */
@K51.d
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cBI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/avito/android/beduin/common/component/select_calendar/CalendarSettings;", "Landroid/os/Parcelable;", "", "title", "fromDate", "toDate", "", "blockedDates", "Lcom/avito/android/beduin/common/component/select_calendar/CalendarSettings$CalendarButton;", "button", "", "isPastDayAllowed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/beduin/common/component/select_calendar/CalendarSettings$CalendarButton;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "e", "f", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/beduin/common/component/select_calendar/CalendarSettings$CalendarButton;", "d", "()Lcom/avito/android/beduin/common/component/select_calendar/CalendarSettings$CalendarButton;", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "CalendarButton", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CalendarSettings implements Parcelable {

    @k
    public static final Parcelable.Creator<CalendarSettings> CREATOR = new a();

    @com.google.gson.annotations.c("blockedDates")
    @l
    private final List<String> blockedDates;

    @com.google.gson.annotations.c("button")
    @l
    private final CalendarButton button;

    @com.google.gson.annotations.c("fromDate")
    @l
    private final String fromDate;

    @com.google.gson.annotations.c("isPastDayAllowed")
    @l
    private final Boolean isPastDayAllowed;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    @com.google.gson.annotations.c("toDate")
    @l
    private final String toDate;

    /* compiled from: CalendarSettings.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/common/component/select_calendar/CalendarSettings$CalendarButton;", "Landroid/os/Parcelable;", "", "title", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CalendarButton implements Parcelable {

        @k
        public static final Parcelable.Creator<CalendarButton> CREATOR = new a();

        @com.google.gson.annotations.c("title")
        @l
        private final String title;

        /* compiled from: CalendarSettings.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CalendarButton> {
            @Override // android.os.Parcelable.Creator
            public final CalendarButton createFromParcel(Parcel parcel) {
                return new CalendarButton(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CalendarButton[] newArray(int i12) {
                return new CalendarButton[i12];
            }
        }

        public CalendarButton(@l String str) {
            this.title = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CalendarButton) && L.f(this.title, ((CalendarButton) obj).title);
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            String str = this.title;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CalendarButton(title="), this.title, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
        }
    }

    /* compiled from: CalendarSettings.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CalendarSettings> {
        @Override // android.os.Parcelable.Creator
        public final CalendarSettings createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            CalendarButton calendarButtonCreateFromParcel = parcel.readInt() == 0 ? null : CalendarButton.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CalendarSettings(string, string2, string3, arrayListCreateStringArrayList, calendarButtonCreateFromParcel, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final CalendarSettings[] newArray(int i12) {
            return new CalendarSettings[i12];
        }
    }

    public CalendarSettings(@l String str, @l String str2, @l String str3, @l List<String> list, @l CalendarButton calendarButton, @l Boolean bool) {
        this.title = str;
        this.fromDate = str2;
        this.toDate = str3;
        this.blockedDates = list;
        this.button = calendarButton;
        this.isPastDayAllowed = bool;
    }

    @l
    public final List<String> c() {
        return this.blockedDates;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final CalendarButton getButton() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getFromDate() {
        return this.fromDate;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarSettings)) {
            return false;
        }
        CalendarSettings calendarSettings = (CalendarSettings) obj;
        return L.f(this.title, calendarSettings.title) && L.f(this.fromDate, calendarSettings.fromDate) && L.f(this.toDate, calendarSettings.toDate) && L.f(this.blockedDates, calendarSettings.blockedDates) && L.f(this.button, calendarSettings.button) && L.f(this.isPastDayAllowed, calendarSettings.isPastDayAllowed);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getToDate() {
        return this.toDate;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final Boolean getIsPastDayAllowed() {
        return this.isPastDayAllowed;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fromDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.toDate;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.blockedDates;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        CalendarButton calendarButton = this.button;
        int iHashCode5 = (iHashCode4 + (calendarButton == null ? 0 : calendarButton.hashCode())) * 31;
        Boolean bool = this.isPastDayAllowed;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalendarSettings(title=");
        sb2.append(this.title);
        sb2.append(", fromDate=");
        sb2.append(this.fromDate);
        sb2.append(", toDate=");
        sb2.append(this.toDate);
        sb2.append(", blockedDates=");
        sb2.append(this.blockedDates);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", isPastDayAllowed=");
        return C0.g(sb2, this.isPastDayAllowed, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.fromDate);
        parcel.writeString(this.toDate);
        parcel.writeStringList(this.blockedDates);
        CalendarButton calendarButton = this.button;
        if (calendarButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            calendarButton.writeToParcel(parcel, i12);
        }
        Boolean bool = this.isPastDayAllowed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}

package com.avito.android.calendar_select.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarLoadDataResponse.kt */
@d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019BO\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/avito/android/calendar_select/remote/model/CalendarLoadDataResponse;", "Landroid/os/Parcelable;", "", "title", "fromDate", "toDate", "", "blockedDates", "selectedDates", "Lcom/avito/android/calendar_select/remote/model/CalendarLoadDataResponse$CalendarButton;", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/avito/android/calendar_select/remote/model/CalendarLoadDataResponse$CalendarButton;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "e", "g", "Ljava/util/List;", "c", "()Ljava/util/List;", "f", "Lcom/avito/android/calendar_select/remote/model/CalendarLoadDataResponse$CalendarButton;", "d", "()Lcom/avito/android/calendar_select/remote/model/CalendarLoadDataResponse$CalendarButton;", "CalendarButton", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CalendarLoadDataResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<CalendarLoadDataResponse> CREATOR = new a();

    @c("blockedDates")
    @l
    private final List<String> blockedDates;

    @c("button")
    @l
    private final CalendarButton button;

    @c("fromDate")
    @l
    private final String fromDate;

    @c("selectedDates")
    @l
    private final List<String> selectedDates;

    @c("title")
    @l
    private final String title;

    @c("toDate")
    @l
    private final String toDate;

    /* compiled from: CalendarLoadDataResponse.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/calendar_select/remote/model/CalendarLoadDataResponse$CalendarButton;", "Landroid/os/Parcelable;", "", "title", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CalendarButton implements Parcelable {

        @k
        public static final Parcelable.Creator<CalendarButton> CREATOR = new a();

        @c("title")
        @l
        private final String title;

        /* compiled from: CalendarLoadDataResponse.kt */
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

    /* compiled from: CalendarLoadDataResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CalendarLoadDataResponse> {
        @Override // android.os.Parcelable.Creator
        public final CalendarLoadDataResponse createFromParcel(Parcel parcel) {
            return new CalendarLoadDataResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : CalendarButton.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CalendarLoadDataResponse[] newArray(int i12) {
            return new CalendarLoadDataResponse[i12];
        }
    }

    public CalendarLoadDataResponse(@l String str, @l String str2, @l String str3, @l List<String> list, @l List<String> list2, @l CalendarButton calendarButton) {
        this.title = str;
        this.fromDate = str2;
        this.toDate = str3;
        this.blockedDates = list;
        this.selectedDates = list2;
        this.button = calendarButton;
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
        if (!(obj instanceof CalendarLoadDataResponse)) {
            return false;
        }
        CalendarLoadDataResponse calendarLoadDataResponse = (CalendarLoadDataResponse) obj;
        return L.f(this.title, calendarLoadDataResponse.title) && L.f(this.fromDate, calendarLoadDataResponse.fromDate) && L.f(this.toDate, calendarLoadDataResponse.toDate) && L.f(this.blockedDates, calendarLoadDataResponse.blockedDates) && L.f(this.selectedDates, calendarLoadDataResponse.selectedDates) && L.f(this.button, calendarLoadDataResponse.button);
    }

    @l
    public final List<String> f() {
        return this.selectedDates;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getToDate() {
        return this.toDate;
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
        List<String> list2 = this.selectedDates;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        CalendarButton calendarButton = this.button;
        return iHashCode5 + (calendarButton != null ? calendarButton.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CalendarLoadDataResponse(title=" + this.title + ", fromDate=" + this.fromDate + ", toDate=" + this.toDate + ", blockedDates=" + this.blockedDates + ", selectedDates=" + this.selectedDates + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.fromDate);
        parcel.writeString(this.toDate);
        parcel.writeStringList(this.blockedDates);
        parcel.writeStringList(this.selectedDates);
        CalendarButton calendarButton = this.button;
        if (calendarButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            calendarButton.writeToParcel(parcel, i12);
        }
    }
}

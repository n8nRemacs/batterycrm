package com.avito.android.str_calendar.booking_calendar.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.short_term_rent.StrBookingIntentFactory;
import com.avito.android.str_calendar.booking_calendar.model.StrBookingCalendarScreenConfig;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingCalendarInitParameters.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/model/StrBookingCalendarInitParameters;", "Landroid/os/Parcelable;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StrBookingCalendarInitParameters implements Parcelable {

    @k
    public static final Parcelable.Creator<StrBookingCalendarInitParameters> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f286359b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final SelectedDateRange f286360c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Date f286361d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Date f286362e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f286363f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final List<StrBookingIntentFactory.CalendarRestriction> f286364g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f286365h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f286366i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f286367j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final StrBookingCalendarScreenConfig f286368k;

    /* compiled from: StrBookingCalendarInitParameters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrBookingCalendarInitParameters> {
        @Override // android.os.Parcelable.Creator
        public final StrBookingCalendarInitParameters createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            ArrayList arrayList = null;
            SelectedDateRange selectedDateRangeCreateFromParcel = parcel.readInt() == 0 ? null : SelectedDateRange.CREATOR.createFromParcel(parcel);
            Date date = (Date) parcel.readSerializable();
            Date date2 = (Date) parcel.readSerializable();
            int iL2 = 0;
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(StrBookingCalendarInitParameters.class, parcel, arrayList, iL2, 1);
                }
            }
            return new StrBookingCalendarInitParameters(string, selectedDateRangeCreateFromParcel, date, date2, z12, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), (StrBookingCalendarScreenConfig) parcel.readParcelable(StrBookingCalendarInitParameters.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final StrBookingCalendarInitParameters[] newArray(int i12) {
            return new StrBookingCalendarInitParameters[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StrBookingCalendarInitParameters(@l String str, @l SelectedDateRange selectedDateRange, @l Date date, @l Date date2, boolean z12, @l List<? extends StrBookingIntentFactory.CalendarRestriction> list, @l String str2, @l String str3, @l String str4, @k StrBookingCalendarScreenConfig strBookingCalendarScreenConfig) {
        this.f286359b = str;
        this.f286360c = selectedDateRange;
        this.f286361d = date;
        this.f286362e = date2;
        this.f286363f = z12;
        this.f286364g = list;
        this.f286365h = str2;
        this.f286366i = str3;
        this.f286367j = str4;
        this.f286368k = strBookingCalendarScreenConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrBookingCalendarInitParameters)) {
            return false;
        }
        StrBookingCalendarInitParameters strBookingCalendarInitParameters = (StrBookingCalendarInitParameters) obj;
        return L.f(this.f286359b, strBookingCalendarInitParameters.f286359b) && L.f(this.f286360c, strBookingCalendarInitParameters.f286360c) && L.f(this.f286361d, strBookingCalendarInitParameters.f286361d) && L.f(this.f286362e, strBookingCalendarInitParameters.f286362e) && this.f286363f == strBookingCalendarInitParameters.f286363f && L.f(this.f286364g, strBookingCalendarInitParameters.f286364g) && L.f(this.f286365h, strBookingCalendarInitParameters.f286365h) && L.f(this.f286366i, strBookingCalendarInitParameters.f286366i) && L.f(this.f286367j, strBookingCalendarInitParameters.f286367j) && L.f(this.f286368k, strBookingCalendarInitParameters.f286368k);
    }

    public final int hashCode() {
        String str = this.f286359b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        SelectedDateRange selectedDateRange = this.f286360c;
        int iHashCode2 = (iHashCode + (selectedDateRange == null ? 0 : selectedDateRange.hashCode())) * 31;
        Date date = this.f286361d;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f286362e;
        int i12 = r.i((iHashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31, 31, this.f286363f);
        List<StrBookingIntentFactory.CalendarRestriction> list = this.f286364g;
        int iHashCode4 = (i12 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f286365h;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f286366i;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f286367j;
        return this.f286368k.hashCode() + ((iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "StrBookingCalendarInitParameters(advertId=" + this.f286359b + ", selectedDateRange=" + this.f286360c + ", firstAvailableDate=" + this.f286361d + ", lastAvailableDate=" + this.f286362e + ", canSelectSingleDay=" + this.f286363f + ", restrictions=" + this.f286364g + ", title=" + this.f286365h + ", requestId=" + this.f286366i + ", buttonTitle=" + this.f286367j + ", screenConfig=" + this.f286368k + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f286359b);
        SelectedDateRange selectedDateRange = this.f286360c;
        if (selectedDateRange == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectedDateRange.writeToParcel(parcel, i12);
        }
        parcel.writeSerializable(this.f286361d);
        parcel.writeSerializable(this.f286362e);
        parcel.writeInt(this.f286363f ? 1 : 0);
        List<StrBookingIntentFactory.CalendarRestriction> list = this.f286364g;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeString(this.f286365h);
        parcel.writeString(this.f286366i);
        parcel.writeString(this.f286367j);
        parcel.writeParcelable(this.f286368k, i12);
    }

    public /* synthetic */ StrBookingCalendarInitParameters(String str, SelectedDateRange selectedDateRange, Date date, Date date2, boolean z12, List list, String str2, String str3, String str4, StrBookingCalendarScreenConfig strBookingCalendarScreenConfig, int i12, C42822w c42822w) {
        this(str, selectedDateRange, date, date2, (i12 & 16) != 0 ? false : z12, list, str2, str3, str4, (i12 & 512) != 0 ? new StrBookingCalendarScreenConfig.Default(false, false, 3, null) : strBookingCalendarScreenConfig);
    }
}

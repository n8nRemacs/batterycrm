package com.avito.android.widget_filters.remote.model.widgets;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersDatesWidget.kt */
@d
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bu\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b$\u0010\u0016R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b%\u0010\u0016R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b&\u0010\u0019¨\u0006'"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/widgets/DatesRangeParameter;", "Landroid/os/Parcelable;", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersContentParameter;", "", "id", "", "isRequired", "updatesForm", "isVisible", "notSelectedErrorText", "Lcom/avito/android/widget_filters/remote/model/widgets/DateParam;", "checkInParam", "checkOutParam", "Lcom/avito/android/widget_filters/remote/model/widgets/DateRange;", "selectedDateRange", "firstAvailableDate", "lastAvailableDate", "canSelectSingleDay", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/widget_filters/remote/model/widgets/DateParam;Lcom/avito/android/widget_filters/remote/model/widgets/DateParam;Lcom/avito/android/widget_filters/remote/model/widgets/DateRange;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "k", "()Ljava/lang/Boolean;", "j", "l", "h", "Lcom/avito/android/widget_filters/remote/model/widgets/DateParam;", "d", "()Lcom/avito/android/widget_filters/remote/model/widgets/DateParam;", "e", "Lcom/avito/android/widget_filters/remote/model/widgets/DateRange;", "i", "()Lcom/avito/android/widget_filters/remote/model/widgets/DateRange;", "f", "g", "c", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DatesRangeParameter implements Parcelable, WidgetFiltersContentParameter {

    @k
    public static final Parcelable.Creator<DatesRangeParameter> CREATOR = new a();

    @c("canSelectSingleDay")
    @l
    private final Boolean canSelectSingleDay;

    @c("checkInParam")
    @l
    private final DateParam checkInParam;

    @c("checkOutParam")
    @l
    private final DateParam checkOutParam;

    @c("firstAvailableDate")
    @l
    private final String firstAvailableDate;

    @c("id")
    @l
    private final String id;

    @c("isRequired")
    @l
    private final Boolean isRequired;

    @c("isVisible")
    @l
    private final Boolean isVisible;

    @c("lastAvailableDate")
    @l
    private final String lastAvailableDate;

    @c("notSelectedErrorText")
    @l
    private final String notSelectedErrorText;

    @c("selectedDateRange")
    @l
    private final DateRange selectedDateRange;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    /* compiled from: WidgetFiltersDatesWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DatesRangeParameter> {
        @Override // android.os.Parcelable.Creator
        public final DatesRangeParameter createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            DateParam dateParamCreateFromParcel = parcel.readInt() == 0 ? null : DateParam.CREATOR.createFromParcel(parcel);
            DateParam dateParamCreateFromParcel2 = parcel.readInt() == 0 ? null : DateParam.CREATOR.createFromParcel(parcel);
            DateRange dateRangeCreateFromParcel = parcel.readInt() == 0 ? null : DateRange.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DatesRangeParameter(string, boolValueOf, boolValueOf2, boolValueOf3, string2, dateParamCreateFromParcel, dateParamCreateFromParcel2, dateRangeCreateFromParcel, string3, string4, boolValueOf4);
        }

        @Override // android.os.Parcelable.Creator
        public final DatesRangeParameter[] newArray(int i12) {
            return new DatesRangeParameter[i12];
        }
    }

    public DatesRangeParameter(@l String str, @l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l String str2, @l DateParam dateParam, @l DateParam dateParam2, @l DateRange dateRange, @l String str3, @l String str4, @l Boolean bool4) {
        this.id = str;
        this.isRequired = bool;
        this.updatesForm = bool2;
        this.isVisible = bool3;
        this.notSelectedErrorText = str2;
        this.checkInParam = dateParam;
        this.checkOutParam = dateParam2;
        this.selectedDateRange = dateRange;
        this.firstAvailableDate = str3;
        this.lastAvailableDate = str4;
        this.canSelectSingleDay = bool4;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Boolean getCanSelectSingleDay() {
        return this.canSelectSingleDay;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final DateParam getCheckInParam() {
        return this.checkInParam;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final DateParam getCheckOutParam() {
        return this.checkOutParam;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatesRangeParameter)) {
            return false;
        }
        DatesRangeParameter datesRangeParameter = (DatesRangeParameter) obj;
        return L.f(this.id, datesRangeParameter.id) && L.f(this.isRequired, datesRangeParameter.isRequired) && L.f(this.updatesForm, datesRangeParameter.updatesForm) && L.f(this.isVisible, datesRangeParameter.isVisible) && L.f(this.notSelectedErrorText, datesRangeParameter.notSelectedErrorText) && L.f(this.checkInParam, datesRangeParameter.checkInParam) && L.f(this.checkOutParam, datesRangeParameter.checkOutParam) && L.f(this.selectedDateRange, datesRangeParameter.selectedDateRange) && L.f(this.firstAvailableDate, datesRangeParameter.firstAvailableDate) && L.f(this.lastAvailableDate, datesRangeParameter.lastAvailableDate) && L.f(this.canSelectSingleDay, datesRangeParameter.canSelectSingleDay);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getFirstAvailableDate() {
        return this.firstAvailableDate;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getLastAvailableDate() {
        return this.lastAvailableDate;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getNotSelectedErrorText() {
        return this.notSelectedErrorText;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isRequired;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.updatesForm;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isVisible;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.notSelectedErrorText;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DateParam dateParam = this.checkInParam;
        int iHashCode6 = (iHashCode5 + (dateParam == null ? 0 : dateParam.hashCode())) * 31;
        DateParam dateParam2 = this.checkOutParam;
        int iHashCode7 = (iHashCode6 + (dateParam2 == null ? 0 : dateParam2.hashCode())) * 31;
        DateRange dateRange = this.selectedDateRange;
        int iHashCode8 = (iHashCode7 + (dateRange == null ? 0 : dateRange.hashCode())) * 31;
        String str3 = this.firstAvailableDate;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastAvailableDate;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool4 = this.canSelectSingleDay;
        return iHashCode10 + (bool4 != null ? bool4.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final DateRange getSelectedDateRange() {
        return this.selectedDateRange;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @l
    /* renamed from: k, reason: from getter */
    public final Boolean getIsRequired() {
        return this.isRequired;
    }

    @l
    /* renamed from: l, reason: from getter */
    public final Boolean getIsVisible() {
        return this.isVisible;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DatesRangeParameter(id=");
        sb2.append(this.id);
        sb2.append(", isRequired=");
        sb2.append(this.isRequired);
        sb2.append(", updatesForm=");
        sb2.append(this.updatesForm);
        sb2.append(", isVisible=");
        sb2.append(this.isVisible);
        sb2.append(", notSelectedErrorText=");
        sb2.append(this.notSelectedErrorText);
        sb2.append(", checkInParam=");
        sb2.append(this.checkInParam);
        sb2.append(", checkOutParam=");
        sb2.append(this.checkOutParam);
        sb2.append(", selectedDateRange=");
        sb2.append(this.selectedDateRange);
        sb2.append(", firstAvailableDate=");
        sb2.append(this.firstAvailableDate);
        sb2.append(", lastAvailableDate=");
        sb2.append(this.lastAvailableDate);
        sb2.append(", canSelectSingleDay=");
        return C0.g(sb2, this.canSelectSingleDay, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        Boolean bool = this.isRequired;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.updatesForm;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Boolean bool3 = this.isVisible;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        parcel.writeString(this.notSelectedErrorText);
        DateParam dateParam = this.checkInParam;
        if (dateParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dateParam.writeToParcel(parcel, i12);
        }
        DateParam dateParam2 = this.checkOutParam;
        if (dateParam2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dateParam2.writeToParcel(parcel, i12);
        }
        DateRange dateRange = this.selectedDateRange;
        if (dateRange == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dateRange.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.firstAvailableDate);
        parcel.writeString(this.lastAvailableDate);
        Boolean bool4 = this.canSelectSingleDay;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool4);
        }
    }
}

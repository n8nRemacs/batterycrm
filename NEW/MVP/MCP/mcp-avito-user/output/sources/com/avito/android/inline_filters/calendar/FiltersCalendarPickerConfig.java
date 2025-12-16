package com.avito.android.inline_filters.calendar;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FiltersCalendarPickerConfig.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/calendar/FiltersCalendarPickerConfig;", "Landroid/os/Parcelable;", "a", "_avito_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class FiltersCalendarPickerConfig implements Parcelable {

    @k
    public static final Parcelable.Creator<FiltersCalendarPickerConfig> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final SelectedDateRange f171044b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FiltersCalendarPickerType f171045c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f171046d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final FlexDatesConfig f171047e;

    /* compiled from: FiltersCalendarPickerConfig.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/inline_filters/calendar/FiltersCalendarPickerConfig$a;", "", "<init>", "()V", "", "DEFAULT_MAX_MONTHS_COUNT", "I", "_avito_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FiltersCalendarPickerConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<FiltersCalendarPickerConfig> {
        @Override // android.os.Parcelable.Creator
        public final FiltersCalendarPickerConfig createFromParcel(Parcel parcel) {
            return new FiltersCalendarPickerConfig(parcel.readInt() == 0 ? null : SelectedDateRange.CREATOR.createFromParcel(parcel), FiltersCalendarPickerType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? FlexDatesConfig.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final FiltersCalendarPickerConfig[] newArray(int i12) {
            return new FiltersCalendarPickerConfig[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public FiltersCalendarPickerConfig(@l SelectedDateRange selectedDateRange, @k FiltersCalendarPickerType filtersCalendarPickerType, @l Integer num, @l FlexDatesConfig flexDatesConfig) {
        this.f171044b = selectedDateRange;
        this.f171045c = filtersCalendarPickerType;
        this.f171046d = num;
        this.f171047e = flexDatesConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FiltersCalendarPickerConfig)) {
            return false;
        }
        FiltersCalendarPickerConfig filtersCalendarPickerConfig = (FiltersCalendarPickerConfig) obj;
        return L.f(this.f171044b, filtersCalendarPickerConfig.f171044b) && this.f171045c == filtersCalendarPickerConfig.f171045c && L.f(this.f171046d, filtersCalendarPickerConfig.f171046d) && L.f(this.f171047e, filtersCalendarPickerConfig.f171047e);
    }

    public final int hashCode() {
        SelectedDateRange selectedDateRange = this.f171044b;
        int iHashCode = (this.f171045c.hashCode() + ((selectedDateRange == null ? 0 : selectedDateRange.hashCode()) * 31)) * 31;
        Integer num = this.f171046d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        FlexDatesConfig flexDatesConfig = this.f171047e;
        return iHashCode2 + (flexDatesConfig != null ? flexDatesConfig.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "FiltersCalendarPickerConfig(initialDateRange=" + this.f171044b + ", pickerType=" + this.f171045c + ", monthLimit=" + this.f171046d + ", flexDates=" + this.f171047e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        SelectedDateRange selectedDateRange = this.f171044b;
        if (selectedDateRange == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectedDateRange.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f171045c.name());
        Integer num = this.f171046d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        FlexDatesConfig flexDatesConfig = this.f171047e;
        if (flexDatesConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            flexDatesConfig.writeToParcel(parcel, i12);
        }
    }
}

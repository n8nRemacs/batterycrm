package com.avito.android.inline_filters.dialog.calendar.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerConfig;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerUiConfig;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FiltersCalendarPickerOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/calendar/view/FiltersCalendarPickerOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class FiltersCalendarPickerOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<FiltersCalendarPickerOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final FiltersCalendarPickerConfig f171331b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FiltersCalendarPickerUiConfig f171332c;

    /* compiled from: FiltersCalendarPickerOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FiltersCalendarPickerOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final FiltersCalendarPickerOpenParams createFromParcel(Parcel parcel) {
            return new FiltersCalendarPickerOpenParams((FiltersCalendarPickerConfig) parcel.readParcelable(FiltersCalendarPickerOpenParams.class.getClassLoader()), (FiltersCalendarPickerUiConfig) parcel.readParcelable(FiltersCalendarPickerOpenParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FiltersCalendarPickerOpenParams[] newArray(int i12) {
            return new FiltersCalendarPickerOpenParams[i12];
        }
    }

    public FiltersCalendarPickerOpenParams(@Y61.k FiltersCalendarPickerConfig filtersCalendarPickerConfig, @Y61.k FiltersCalendarPickerUiConfig filtersCalendarPickerUiConfig) {
        this.f171331b = filtersCalendarPickerConfig;
        this.f171332c = filtersCalendarPickerUiConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FiltersCalendarPickerOpenParams)) {
            return false;
        }
        FiltersCalendarPickerOpenParams filtersCalendarPickerOpenParams = (FiltersCalendarPickerOpenParams) obj;
        return L.f(this.f171331b, filtersCalendarPickerOpenParams.f171331b) && L.f(this.f171332c, filtersCalendarPickerOpenParams.f171332c);
    }

    public final int hashCode() {
        return this.f171332c.hashCode() + (this.f171331b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "FiltersCalendarPickerOpenParams(pickerConfig=" + this.f171331b + ", uiConfig=" + this.f171332c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f171331b, i12);
        parcel.writeParcelable(this.f171332c, i12);
    }
}

package com.avito.android.inline_filters.calendar;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FiltersCalendarPickerConfig.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/calendar/FiltersCalendarPickerUiConfig;", "Landroid/os/Parcelable;", "_avito_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class FiltersCalendarPickerUiConfig implements Parcelable {

    @k
    public static final Parcelable.Creator<FiltersCalendarPickerUiConfig> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f171054b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FiltersCalendarPickerMode f171055c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Boolean f171056d;

    /* compiled from: FiltersCalendarPickerConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FiltersCalendarPickerUiConfig> {
        @Override // android.os.Parcelable.Creator
        public final FiltersCalendarPickerUiConfig createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            FiltersCalendarPickerMode filtersCalendarPickerMode = (FiltersCalendarPickerMode) parcel.readParcelable(FiltersCalendarPickerUiConfig.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FiltersCalendarPickerUiConfig(string, filtersCalendarPickerMode, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final FiltersCalendarPickerUiConfig[] newArray(int i12) {
            return new FiltersCalendarPickerUiConfig[i12];
        }
    }

    public FiltersCalendarPickerUiConfig(@l String str, @k FiltersCalendarPickerMode filtersCalendarPickerMode, @l Boolean bool) {
        this.f171054b = str;
        this.f171055c = filtersCalendarPickerMode;
        this.f171056d = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FiltersCalendarPickerUiConfig)) {
            return false;
        }
        FiltersCalendarPickerUiConfig filtersCalendarPickerUiConfig = (FiltersCalendarPickerUiConfig) obj;
        return L.f(this.f171054b, filtersCalendarPickerUiConfig.f171054b) && L.f(this.f171055c, filtersCalendarPickerUiConfig.f171055c) && L.f(this.f171056d, filtersCalendarPickerUiConfig.f171056d);
    }

    public final int hashCode() {
        String str = this.f171054b;
        int iHashCode = (this.f171055c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        Boolean bool = this.f171056d;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FiltersCalendarPickerUiConfig(title=");
        sb2.append(this.f171054b);
        sb2.append(", mode=");
        sb2.append(this.f171055c);
        sb2.append(", resetDisabled=");
        return C0.g(sb2, this.f171056d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f171054b);
        parcel.writeParcelable(this.f171055c, i12);
        Boolean bool = this.f171056d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}

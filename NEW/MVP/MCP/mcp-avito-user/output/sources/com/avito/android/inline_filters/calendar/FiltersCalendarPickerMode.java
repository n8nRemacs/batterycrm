package com.avito.android.inline_filters.calendar;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FiltersCalendarPickerMode.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/inline_filters/calendar/FiltersCalendarPickerMode;", "Landroid/os/Parcelable;", "Normal", "Strict", "Lcom/avito/android/inline_filters/calendar/FiltersCalendarPickerMode$Normal;", "Lcom/avito/android/inline_filters/calendar/FiltersCalendarPickerMode$Strict;", "_avito_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface FiltersCalendarPickerMode extends Parcelable {

    /* compiled from: FiltersCalendarPickerMode.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/calendar/FiltersCalendarPickerMode$Normal;", "Lcom/avito/android/inline_filters/calendar/FiltersCalendarPickerMode;", "_avito_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Normal implements FiltersCalendarPickerMode {

        @k
        public static final Parcelable.Creator<Normal> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f171048b;

        /* compiled from: FiltersCalendarPickerMode.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Normal> {
            @Override // android.os.Parcelable.Creator
            public final Normal createFromParcel(Parcel parcel) {
                return new Normal(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Normal[] newArray(int i12) {
                return new Normal[i12];
            }
        }

        public Normal(boolean z12) {
            this.f171048b = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Normal) && this.f171048b == ((Normal) obj).f171048b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f171048b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("Normal(withSkipButton="), this.f171048b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f171048b ? 1 : 0);
        }
    }

    /* compiled from: FiltersCalendarPickerMode.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/calendar/FiltersCalendarPickerMode$Strict;", "Lcom/avito/android/inline_filters/calendar/FiltersCalendarPickerMode;", "_avito_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Strict implements FiltersCalendarPickerMode {

        @k
        public static final Parcelable.Creator<Strict> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f171049b;

        /* compiled from: FiltersCalendarPickerMode.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Strict> {
            @Override // android.os.Parcelable.Creator
            public final Strict createFromParcel(Parcel parcel) {
                return new Strict(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Strict[] newArray(int i12) {
                return new Strict[i12];
            }
        }

        public Strict(@l String str) {
            this.f171049b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Strict) && L.f(this.f171049b, ((Strict) obj).f171049b);
        }

        public final int hashCode() {
            String str = this.f171049b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Strict(buttonTitle="), this.f171049b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f171049b);
        }
    }
}

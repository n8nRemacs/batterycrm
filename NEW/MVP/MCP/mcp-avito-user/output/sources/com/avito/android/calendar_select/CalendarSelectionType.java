package com.avito.android.calendar_select;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CalendarSelectionType.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/calendar_select/CalendarSelectionType;", "", "Landroid/os/Parcelable;", "_avito_calendar-select_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CalendarSelectionType implements Parcelable {

    @k
    public static final Parcelable.Creator<CalendarSelectionType> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final CalendarSelectionType f113306b;

    /* renamed from: c, reason: collision with root package name */
    public static final CalendarSelectionType f113307c;

    /* renamed from: d, reason: collision with root package name */
    public static final CalendarSelectionType f113308d;

    /* renamed from: e, reason: collision with root package name */
    public static final CalendarSelectionType f113309e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ CalendarSelectionType[] f113310f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f113311g;

    static {
        CalendarSelectionType calendarSelectionType = new CalendarSelectionType("SINGLE", 0);
        f113306b = calendarSelectionType;
        CalendarSelectionType calendarSelectionType2 = new CalendarSelectionType("INTERVAL", 1);
        f113307c = calendarSelectionType2;
        CalendarSelectionType calendarSelectionType3 = new CalendarSelectionType("MULTIPLE", 2);
        f113308d = calendarSelectionType3;
        CalendarSelectionType calendarSelectionType4 = new CalendarSelectionType("SINGLE_OR_INTERVAL", 3);
        f113309e = calendarSelectionType4;
        CalendarSelectionType[] calendarSelectionTypeArr = {calendarSelectionType, calendarSelectionType2, calendarSelectionType3, calendarSelectionType4};
        f113310f = calendarSelectionTypeArr;
        f113311g = kotlin.enums.c.a(calendarSelectionTypeArr);
        CREATOR = new Parcelable.Creator<CalendarSelectionType>() { // from class: com.avito.android.calendar_select.CalendarSelectionType.a
            @Override // android.os.Parcelable.Creator
            public final CalendarSelectionType createFromParcel(Parcel parcel) {
                return CalendarSelectionType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CalendarSelectionType[] newArray(int i12) {
                return new CalendarSelectionType[i12];
            }
        };
    }

    public CalendarSelectionType() {
        throw null;
    }

    public static CalendarSelectionType valueOf(String str) {
        return (CalendarSelectionType) Enum.valueOf(CalendarSelectionType.class, str);
    }

    public static CalendarSelectionType[] values() {
        return (CalendarSelectionType[]) f113310f.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}

package com.avito.android.date_time_picker;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PickerHeaderType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/date_time_picker/PickerHeaderType;", "", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PickerHeaderType {

    /* renamed from: b, reason: collision with root package name */
    public static final PickerHeaderType f132601b;

    /* renamed from: c, reason: collision with root package name */
    public static final PickerHeaderType f132602c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ PickerHeaderType[] f132603d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f132604e;

    static {
        PickerHeaderType pickerHeaderType = new PickerHeaderType("RIGHT_HEADER", 0);
        f132601b = pickerHeaderType;
        PickerHeaderType pickerHeaderType2 = new PickerHeaderType("DEFAULT", 1);
        f132602c = pickerHeaderType2;
        PickerHeaderType[] pickerHeaderTypeArr = {pickerHeaderType, pickerHeaderType2};
        f132603d = pickerHeaderTypeArr;
        f132604e = kotlin.enums.c.a(pickerHeaderTypeArr);
    }

    public PickerHeaderType() {
        throw null;
    }

    public static PickerHeaderType valueOf(String str) {
        return (PickerHeaderType) Enum.valueOf(PickerHeaderType.class, str);
    }

    public static PickerHeaderType[] values() {
        return (PickerHeaderType[]) f132603d.clone();
    }
}
